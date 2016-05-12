package com.aedms;

import java.io.InputStream;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.aedms.core.entities.source.APU;
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
import com.aedms.ext.cmis.CMISSessionUtil;
import com.google.common.io.ByteStreams;
import java.util.HashSet;
import java.util.Set;

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
            Engine engine = repository.save(EngineBuilder.createEngineBuilder().withFleet("A").withLeaseHold("B").withLeaseHolder("C")
                    .withManufactureDate(new Date()).withManufactureDate(new Date()).withModel("D").withOpr("E")
                    .withRemark("C").withRentDate(new Date()).withSerialNo("123").withSN("E").withSubFleet("F")
                    .build());

            EngineOprRec engineOpr = engineOprRepo.save(EngineOprRecBuilder.createEngineOprRecBuilder().withCSN(1).withCSO(2)
                    .withTSN(new Double(3)).withTSO(new Double(4)).withEngine(engine).build());
            EngineStatRec engineStat = engineStatRepo.save(EngineStatRecBuilder.createEngineStatRecBuilder().withCSN(1).withCSO(2)
                    .withTSN(new Double(3)).withTSO(new Double(4)).withEngine(engine).build());

            log.info("Save some engine done");
        };
    }

    @Bean
    public CommandLineRunner demoAPU(APURepo repository) {

        return (args) -> {
            repository.save(APUBuilder.createAPUBuilder().withLeaseHold("a").withLeaseHolder("b").withManufactureDate(new Date())
                    .withModel("HP").withOpr("C").withRentDate(new Date()).withSN("U").build());
            log.info("Save some APU done");
        };
    }

    @Bean
    public CommandLineRunner demoAirCraft(AirCraftRepo airCraftRepo, EngineRepo engineRepo, APURepo apuRepo) {

        return (args) -> {
            Set<Engine> engines = new HashSet<>();
            Engine engineOne = engineRepo.save(EngineBuilder.createEngineBuilder().withFleet("A").withLeaseHold("B")
                    .withLeaseHolder("C").withManufactureDate(new Date()).withManufactureDate(new Date()).withModel("D")
                    .withOpr("E").withRemark("C").withRentDate(new Date()).withSerialNo("123").withSN("E")
                    .withSubFleet("F").build());
            engines.add(engineOne);

            APU apu = apuRepo
                    .save(APUBuilder.createAPUBuilder().withLeaseHold("a").withLeaseHolder("b").withManufactureDate(new Date())
                            .withModel("HP").withOpr("C").withRentDate(new Date()).withSN("U").build());
            Set<APU> apus = new HashSet<>();
            apus.add(apu);

            airCraftRepo.save(AirCraftBuilder.createAirCraftBuilder().withApus(apus).withEngines(engines).withFleet("A")
                    .withSubFleet("A-1").withSN("123456").build());

            log.info("Save some AirCraft done");
        };
    }

}
