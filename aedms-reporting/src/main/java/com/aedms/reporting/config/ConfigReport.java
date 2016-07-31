package com.aedms.reporting.config;

import java.util.logging.Level;

import org.eclipse.birt.core.exception.BirtException;
import org.eclipse.birt.core.framework.Platform;
import org.eclipse.birt.report.engine.api.EngineConfig;
import org.eclipse.birt.report.engine.api.IReportEngine;
import org.eclipse.birt.report.engine.api.IReportEngineFactory;
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
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableScheduling
@EnableAsync
@ComponentScan(basePackages = { "com.aedms" }, excludeFilters = { @ComponentScan.Filter(Configuration.class) })
@EnableTransactionManagement
@EnableMBeanExport
@EnableWebMvc
public class ConfigReport {
	@Autowired
	private Environment environment;

	// Web customized configuration, doesn't work, keep it here for future reference
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurerAdapter() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping(environment.getRequiredProperty("cors.allowed.map")).allowedOrigins(environment.getRequiredProperty("cors.allowed.origins"));
			}
		};
	}
	
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
    public IReportEngine reportEngine() throws BirtException {
		
		 EngineConfig config = new EngineConfig();
		 //TODO: not necessary anymore
         // config.setEngineHome(environment.getRequiredProperty("report.home"));
         config.setLogConfig(environment.getRequiredProperty("report.logging"), Level.FINE);

         Platform.startup(config);
         final IReportEngineFactory engineFactory = (IReportEngineFactory) Platform.
               createFactoryObject(IReportEngineFactory.EXTENSION_REPORT_ENGINE_FACTORY);

         IReportEngine engine = engineFactory.createReportEngine(config);
         engine.changeLogLevel(Level.WARNING);
         return engine;
    }

}
