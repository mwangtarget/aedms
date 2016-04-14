package com.aedms.wf.config;



import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.RuntimeService;
import org.activiti.spring.ProcessEngineFactoryBean;
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

import com.aedms.wf.evt.EventEmitter;

@Configuration
@EnableScheduling
@EnableAsync
@ComponentScan(basePackages = { "com" }, excludeFilters = { @ComponentScan.Filter(Configuration.class) })
@EnableTransactionManagement
@EnableMBeanExport
@EnableWebMvc
public class ConfigWF {

	@Autowired
	private Environment environment;
	
	@Autowired
	private ProcessEngineFactoryBean  processEngineFactoryBean;

	
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
	
	// TOENHANCE: Add Event Listener through Process Engine Configuration.
	@Bean
	public RuntimeService runtimeService(){
		RuntimeService runtimeService = processEngineFactoryBean.getProcessEngineConfiguration().getRuntimeService();
		runtimeService.addEventListener(new EventEmitter());
		return runtimeService;
	}

}

