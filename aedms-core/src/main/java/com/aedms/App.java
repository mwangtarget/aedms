package com.aedms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.aedms.core.entities.source.Engine;
import com.aedms.core.repo.source.EngineRepo;

@SpringBootApplication
public class App {

	private static final Logger log = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		SpringApplication.run(App.class);
	}

	@Bean
	public CommandLineRunner demo(EngineRepo repository) {
		return (args) -> {
			repository.save(new Engine.Builder().fleet("A").subFleet("B").model("C").serialNo("D").SN("E").build());
		    log.info("Save some engine done");
		};
	}

}