package com.aedms.wf;

import org.activiti.engine.IdentityService;
import org.activiti.engine.identity.Group;
import org.activiti.engine.identity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class App {

	private static final Logger log = LoggerFactory.getLogger(App.class);

	
	public static void main(String[] args) {
		SpringApplication.run(App.class);
		log.info("Attach Event Emitter for monitoring");
	}
	
	//EO sample users/groups population.
	//TODO: remove this later
//	@Bean
//    InitializingBean usersAndGroupsInitializer(final IdentityService identityService) {
//
//        return new InitializingBean() {
//            public void afterPropertiesSet() throws Exception {
//
//                Group group = identityService.newGroup("eocreator");
//                group.setName("users");
//                group.setType("security-role");
//                identityService.saveGroup(group);
//
//                User admin = identityService.newUser("admin");
//                admin.setPassword("admin");
//                identityService.saveUser(admin);
//
//            }
//        };
//    }



}
