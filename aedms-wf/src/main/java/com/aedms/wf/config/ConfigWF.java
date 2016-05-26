package com.aedms.wf.config;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.form.AbstractFormType;
import org.activiti.rest.security.BasicAuthenticationProvider;
import org.activiti.spring.ProcessEngineFactoryBean;
import org.activiti.spring.SpringAsyncExecutor;
import org.activiti.spring.SpringProcessEngineConfiguration;
import org.activiti.spring.boot.AbstractProcessEngineAutoConfiguration;
import org.activiti.spring.boot.ActivitiProperties;
import org.apache.chemistry.opencmis.client.api.Repository;
import org.apache.chemistry.opencmis.client.api.Session;
import org.apache.chemistry.opencmis.client.api.SessionFactory;
import org.apache.chemistry.opencmis.client.runtime.SessionFactoryImpl;
import org.apache.chemistry.opencmis.commons.SessionParameter;
import org.apache.chemistry.opencmis.commons.enums.BindingType;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpMethod;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;
import org.springframework.security.web.access.channel.ChannelProcessingFilter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.aedms.wf.evt.EventEmitter;
import com.aedms.wf.ext.form.UploadFormType;

@Configuration
@EnableScheduling
@EnableAsync
@ComponentScan(basePackages = { "com.aedms.wf" }, excludeFilters = { @ComponentScan.Filter(Configuration.class) })
@EnableTransactionManagement
@EnableMBeanExport
@EnableWebMvc
public class ConfigWF {

	@Autowired
	private Environment environment;

	@Autowired
	private ProcessEngineFactoryBean processEngine;

	@Autowired
	private UploadFormType uploadFormType;
	
	

	// Web customized configuration, doesn't work, keep it here for future
	// reference
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurerAdapter() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping(environment.getRequiredProperty("cors.allowed.map"))
						.allowedOrigins(environment.getRequiredProperty("cors.allowed.origins"));
			}
		};
	}

//	@Bean
//	public CorsFilter corsFilter() {
//
//		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//		CorsConfiguration config = new CorsConfiguration();
////		config.addAllowedOrigin(environment.getRequiredProperty("cors.allowed.origins"));
//		config.addAllowedOrigin("*");
//		config.addAllowedHeader("*");
//		config.addAllowedMethod("*");
//		config.addExposedHeader("Vary: Accept-Encoding, Origin");
//		source.registerCorsConfiguration(environment.getRequiredProperty("cors.allowed.map"), config);
//		return new CorsFilter(source);
//	}
//	
	
	public static CorsFilter corsFilterStatic() {

		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		CorsConfiguration config = new CorsConfiguration();
		config.addAllowedOrigin("*");
		config.addAllowedHeader("*");
		config.addAllowedMethod("*");
		source.registerCorsConfiguration("/**", config);
		return new CorsFilter(source);
	}

	
	// TODO: this is not working
	@Bean
	public BeanPostProcessor activitiConfigurer() {
		return new BeanPostProcessor() {

			@Override
			public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
				if (bean instanceof ProcessEngineConfiguration) {
					List<AbstractFormType> customTypeList = new ArrayList<AbstractFormType>();
					customTypeList.add(uploadFormType);
					((SpringProcessEngineConfiguration) bean).setCustomFormTypes(customTypeList);
				}
				return bean;
			}

			@Override
			public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
				if (bean instanceof ProcessEngineConfiguration) {
					List<AbstractFormType> customTypeList = new ArrayList<AbstractFormType>();
					customTypeList.add(uploadFormType);
					((SpringProcessEngineConfiguration) bean).setCustomFormTypes(customTypeList);
				}
				return bean;
			}
		};

	}

	// TODO, this is really a dirty solution, need to change to an better
	// approach.
	@Configuration
	@ConditionalOnClass(name = "javax.persistence.EntityManagerFactory")
	@EnableConfigurationProperties(ActivitiProperties.class)
	public static class JpaConfiguration extends AbstractProcessEngineAutoConfiguration {

		@Bean
		public SpringProcessEngineConfiguration springProcessEngineConfiguration(DataSource dataSource,
				EntityManagerFactory entityManagerFactory, PlatformTransactionManager transactionManager,
				SpringAsyncExecutor springAsyncExecutor) throws IOException {

			SpringProcessEngineConfiguration config = this.baseSpringProcessEngineConfiguration(dataSource,
					transactionManager, springAsyncExecutor);
			config.setJpaEntityManagerFactory(entityManagerFactory);
			config.setTransactionManager(transactionManager);
			config.setJpaHandleTransaction(false);
			config.setJpaCloseEntityManager(false);
			List<AbstractFormType> customTypeList = new ArrayList<AbstractFormType>();
			customTypeList.add(new com.aedms.wf.ext.form.UploadFormType());
			config.setCustomFormTypes(customTypeList);
			return config;
		}
	}

	@Configuration
	@ConditionalOnClass(name = { "org.activiti.rest.service.api.RestUrls",
			"org.springframework.web.servlet.DispatcherServlet" })
	@EnableWebMvcSecurity
	@Order(99) // This is totally doesn't make sense but works
	public static class SecurityConfiguration extends WebSecurityConfigurerAdapter {

		@Bean
		public AuthenticationProvider authenticationProvider() {
			return new BasicAuthenticationProvider();
		}

		@Override
		protected void configure(HttpSecurity http) throws Exception {
			http.addFilterBefore(corsFilterStatic(), ChannelProcessingFilter.class).antMatcher("/**").authenticationProvider(authenticationProvider()).csrf().disable().authorizeRequests().anyRequest()
					.authenticated().and().httpBasic();
		}
	}

	// TOENHANCE: Add Event Listener through Process Engine Configuration.
	@Bean
	public RuntimeService runtimeService() {
		RuntimeService runtimeService = processEngine.getProcessEngineConfiguration().getRuntimeService();
		runtimeService.addEventListener(new EventEmitter());
		return runtimeService;
	}

	@Bean
	public Session cmisSession() {
		SessionFactory sessionFactory = SessionFactoryImpl.newInstance();
		Map<String, String> parameter = new HashMap<String, String>();
		parameter.put(SessionParameter.USER, environment.getRequiredProperty("cmis.user"));
		parameter.put(SessionParameter.PASSWORD, environment.getRequiredProperty("cmis.password"));
		parameter.put(SessionParameter.ATOMPUB_URL, environment.getRequiredProperty("cmis.url"));
		parameter.put(SessionParameter.BINDING_TYPE, BindingType.ATOMPUB.value());
		Repository repository = sessionFactory.getRepositories(parameter).get(0);
		return repository.createSession();
	}

}
