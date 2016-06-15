package com.aedms.core.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import java.util.Properties;
import javax.sql.DataSource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@Configuration
@EnableJpaRepositories({"com.aedms.core.repo.eo","com.aedms.core.repo.source"})
@EnableScheduling
@EnableAsync
@ComponentScan(basePackages = { "com" }, excludeFilters = { @ComponentScan.Filter(Configuration.class) })
@EnableTransactionManagement
@EnableMBeanExport
@EnableWebMvc
@PropertySource({"classpath:application-mysql.properties"})
public class ConfigCore {

    /*
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
	public Session cmisSession(){
		SessionFactory sessionFactory = SessionFactoryImpl.newInstance();
		Map<String, String> parameter = new HashMap<String, String>();
		parameter.put(SessionParameter.USER, environment.getRequiredProperty("cmis.user"));
		parameter.put(SessionParameter.PASSWORD, environment.getRequiredProperty("cmis.password"));
		parameter.put(SessionParameter.ATOMPUB_URL, environment.getRequiredProperty("cmis.url"));
		parameter.put(SessionParameter.BINDING_TYPE, BindingType.ATOMPUB.value());
		Repository repository = sessionFactory.getRepositories(parameter).get(0);
		return repository.createSession();
	}
    */
  
    @Bean
    public DataSource dataSource() {
        return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2)
                .setName("Nuts").build();
    }
    
    @Bean
    public LocalSessionFactoryBean sessionFactoryBean() {
        LocalSessionFactoryBean result = new LocalSessionFactoryBean();
        result.setDataSource(dataSource());
        result.setPackagesToScan(new String[]{"com.aedms.core.entities.eo","com.aedms.core.entities.source"});

        Properties properties = new Properties();
        properties.setProperty("hibernate.hbm2ddl.auto", "create-drop");
        result.setHibernateProperties(properties);
        return result;
    }

    @Bean
    public org.hibernate.SessionFactory sessionFactory() {
        return sessionFactoryBean().getObject();
    }

    @Bean
    public HibernateTransactionManager transactionManager() {
        HibernateTransactionManager man = new HibernateTransactionManager();
        man.setSessionFactory(sessionFactory());
        return man;
    }

}
