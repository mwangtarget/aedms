package com.aedms;

import java.io.InputStream;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.aedms.core.entities.source.APUBuilder;
import com.aedms.core.entities.source.AirCraft;
import com.aedms.core.entities.source.APU;
import com.aedms.core.entities.source.AirCraftBuilder;
import com.aedms.core.entities.source.Engine;
import com.aedms.core.entities.source.EngineBuilder;
import com.aedms.core.entities.source.EngineOperationRec;
import com.aedms.core.entities.source.EngineOperationRecBuilder;
import com.aedms.core.entities.source.EngineStatusRec;
import com.aedms.core.entities.source.EngineStatusRecBuilder;
import com.aedms.core.repo.source.APURepo;
import com.aedms.core.repo.source.AirCraftRepo;
import com.aedms.core.repo.source.EngineOprRepo;
import com.aedms.core.repo.source.EngineRepo;
import com.aedms.core.repo.source.EngineStatRepo;
import com.aedms.ext.cmis.CMISSessionUtil;
import com.google.common.io.ByteStreams;

@SpringBootApplication
public class App {

	private static final Logger log = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		SpringApplication.run(App.class);
	}

	@Bean
	public CommandLineRunner demoEngine(EngineRepo repository, EngineStatRepo engineStatRepo,
			EngineOprRepo engineOprRepo, CMISSessionUtil cMISSessionUtil) {
		return (args) -> {
			InputStream inputStream = ClassLoader.getSystemResourceAsStream("application-h2.properties");
			byte[] inputBytes = ByteStreams.toByteArray(inputStream);
			cMISSessionUtil.createDocument("application-h2.properties", inputBytes);
			Engine engine = repository
					.save(EngineBuilder.withFleet("ShaftEngine").withSubFleet("Turbine").withSerialNo("HP-2016-05-15")
							.withModel("HP").withSN("123456789").withManufactureDate(new Date()).build());

			EngineOperationRec engineOpr = engineOprRepo
					.save(EngineOperationRecBuilder.withTSN(12345.6).withCSN(12345).withEngine(engine).build());
			EngineStatusRec engineStat = engineStatRepo.save(
					EngineStatusRecBuilder.withTSN(12345.6).withCSN(12345).withTSO(12345.6).withEngine(engine).build());

			log.info("Save some engine done");
		};
	}

	@Bean
	public CommandLineRunner demoAirCraft(AirCraftRepo airCraftRepo, EngineRepo engineRepo, APURepo apuRepo) {

		return (args) -> {

			AirCraft aircraft = airCraftRepo.save(AirCraftBuilder.withFleet("Boeing")
					          .withSubFleet("777").withSerialNo("123456789")
					          .withRegisterNo("CA-796").withModel("Bird").withSN("12345").build());

			Engine engine = engineRepo
					.save(EngineBuilder.withFleet("ShaftEngine").withSubFleet("Turbine").withSerialNo("GE-2016-05-15")
							.withModel("GE").withSN("123456789").withManufactureDate(new Date()).build());

			APU apu = apuRepo.save(APUBuilder.withModel("Turbo").withSN("123456")
					  .withManufactureDate(new Date())
					  .withRentDate(new Date()).withAircraft(aircraft).build());

			log.info("Save some AirCraft done");
		};
	}

}
