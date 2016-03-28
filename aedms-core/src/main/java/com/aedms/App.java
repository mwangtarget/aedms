package com.aedms;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.aedms.core.entities.source.APU;
import com.aedms.core.entities.source.AirCraft;
import com.aedms.core.entities.source.Engine;
import com.aedms.core.entities.source.EngineOprRec;
import com.aedms.core.entities.source.EngineStatRec;
import com.aedms.core.entities.source.builder.APUBuilder;
import com.aedms.core.entities.source.builder.AirCraftBuilder;
import com.aedms.core.entities.source.builder.EngineBuilder;
import com.aedms.core.entities.source.builder.*;
import com.aedms.core.repo.source.APURepo;
import com.aedms.core.repo.source.AirCraftRepo;
import com.aedms.core.repo.source.EngineOprRepo;
import com.aedms.core.repo.source.EngineRepo;
import com.aedms.core.repo.source.EngineStatRepo;

@SpringBootApplication
public class App {

	private static final Logger log = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		SpringApplication.run(App.class);
	}

	@Bean
	public CommandLineRunner demoEngine(EngineRepo repository, EngineStatRepo engineStatRepo, EngineOprRepo engineOprRepo) {
		return (args) -> {
			Engine engine = repository.save(new EngineBuilder().withFleet("A").withLeaseHold("B").withLeaseHolder("C")
					.withManufactureDate(new Date()).withManufactureDate(new Date()).withModel("D").withOpr("E")
					.withRemark("C").withRentDate(new Date()).withSerialNo("123").withSN("E").withSubFleet("F")
					.build());
			
			EngineOprRec engineOpr = engineOprRepo.save(new EngineOprRecBuilder().withCSN(1).withCSO(2).withTSN(new Double(3)).withTSO(new Double(4)).withEngine(engine).build());
			EngineStatRec engineStat = engineStatRepo.save(new EngineStatRecBuilder().withCSN(1).withCSO(2).withTSN(new Double(3)).withTSO(new Double(4)).withEngine(engine).build());
			
			
			log.info("Save some engine done");
		};
	}

	@Bean
	public CommandLineRunner demoAPU(APURepo repository) {

		return (args) -> {
			repository.save(new APUBuilder().withLeaseHold("a").withLeaseHolder("b").withManufactureDate(new Date())
					.withModel("HP").withOpr("C").withRentDate(new Date()).withSN("U").build());
			log.info("Save some APU done");
		};
	}

	@Bean
	public CommandLineRunner demoAirCraft(AirCraftRepo airCraftRepo, EngineRepo engineRepo, APURepo apuRepo) {

		return (args) -> {
			Engine engineOne = engineRepo.save(new EngineBuilder().withFleet("A").withLeaseHold("B")
					.withLeaseHolder("C").withManufactureDate(new Date()).withManufactureDate(new Date()).withModel("D")
					.withOpr("E").withRemark("C").withRentDate(new Date()).withSerialNo("123").withSN("E")
					.withSubFleet("F").build());
			
			APU apu = apuRepo.save(new APUBuilder().withLeaseHold("a").withLeaseHolder("b").withManufactureDate(new Date())
							.withModel("HP").withOpr("C").withRentDate(new Date()).withSN("U").build());

			airCraftRepo.save(
					new AirCraftBuilder().withApu(apu).withEngineOne(engineOne).withFleet("A").withSubFleet("A-1").withSN("123456").build());
			
			log.info("Save some AirCraft done");
		};
	}
	
	

}