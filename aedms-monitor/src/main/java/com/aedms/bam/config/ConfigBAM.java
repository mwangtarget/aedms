package com.aedms.bam.config;


import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.aedms.bam.kpi.KPIContainer;
import com.espertech.esper.client.EPAdministrator;
import com.espertech.esper.client.EPServiceProvider;
import com.espertech.esper.client.EPServiceProviderManager;
import com.espertech.esper.client.EPStatement;
import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;

@Configuration
@EnableScheduling
@EnableAsync
@ComponentScan(basePackages = { "com" }, excludeFilters = { @ComponentScan.Filter(Configuration.class) })
@EnableTransactionManagement
@EnableMBeanExport
@EnableWebMvc
public class ConfigBAM {

	@Autowired
	private Environment environment;

	@Bean
    public CorsFilter corsFilter() {

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.addAllowedOrigin(environment.getRequiredProperty("cors.allowed.origins"));
        config.addAllowedHeader("*");
        config.addAllowedMethod("*");
        source.registerCorsConfiguration(environment.getRequiredProperty("cors.allowed.map"), config);
        return new CorsFilter(source);
    }

	
	@Bean
	public EPServiceProvider epService(){
		com.espertech.esper.client.Configuration configuration = new com.espertech.esper.client.Configuration();
		configuration.addEventTypeAutoName("com.aedms.bam.evt");
		EPServiceProvider epService = EPServiceProviderManager.getDefaultProvider(configuration);
		EPAdministrator epAdmin = epService.getEPAdministrator();
		
		//TODO: move this out to configuration
		EPStatement epStatement = epAdmin.createEPL(
			"select count(*) as engineFleetCount, engineFleet" +
			" from EngineCreationEvent group by engineFleet", "engineFleetCount");
		
		epStatement.addListener(new UpdateListener () {
			public void update(EventBean[] newEvents, EventBean[] oldEvents) {
				Long engineTypeCount = (Long) newEvents[0].get("engineFleetCount");
				String engineType = (String) newEvents[0].get("engineFleet");
				engineBAMKPI().getKpiDetails().put(engineType, engineTypeCount);
			}
		} );
		
		return epService;
	}

	@Bean(name="engineBAMKPI")
	public KPIContainer engineBAMKPI(){
		return new KPIContainer ("engineCreation", new ConcurrentHashMap<>());
	}
}
