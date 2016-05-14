package com.aedms.bam;

import java.io.InputStream;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.aedms.bam.evt.EngineCreationEvent;
import com.espertech.esper.client.EPServiceProvider;


@SpringBootApplication
public class App {

	private static final Logger log = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		SpringApplication.run(App.class);
	}
	
	@Bean
	public CommandLineRunner demoEngineKPI(EPServiceProvider epService) {
		return (args) -> {
			
			epService.getEPRuntime().sendEvent(new  EngineCreationEvent("HP", "1", new Date().getTime()));
			epService.getEPRuntime().sendEvent(new  EngineCreationEvent("HP", "2", new Date().getTime()));
			
			epService.getEPRuntime().sendEvent(new  EngineCreationEvent("GE", "3", new Date().getTime()));
			log.info("Send sample Engine Creation Event");
		};
	}
}