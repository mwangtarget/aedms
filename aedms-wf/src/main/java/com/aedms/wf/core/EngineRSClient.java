package com.aedms.wf.core;

import java.util.Date;

import org.activiti.engine.delegate.DelegateExecution;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.aedms.core.entities.source.Engine;


@Component(value = "engineRSClient")
public class EngineRSClient {

    @Autowired
    private Environment environment;

    public void saveEngine(DelegateExecution execution) {

        String fleet = (String) execution.getVariable("fleet");
        String subFleet = (String) execution.getVariable("subFleet");
        String modelSpecs = (String) execution.getVariable("model");

        Engine engine = com.aedms.core.entities.source.EngineBuilder.withFleet(fleet).withSubFleet(subFleet)
        		.withSerialNo("123455").withModel(modelSpecs).withSN("12345").withManufactureDate(new Date()).build();
        
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.postForObject(environment.getRequiredProperty("aedms.rs.engines"), engine, Engine.class);

    }

}
