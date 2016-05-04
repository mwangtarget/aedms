package com.aedms.wf.bam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.aedms.bam.evt.EngineCreationEvent;

@Component(value="engineKPISender")
public class EngineKPISender {
	private static final Logger log = LoggerFactory.getLogger(EngineKPISender.class);
	@Autowired
	private Environment environment;
	

	public void sendEngineCreationEvt(EngineCreationEvent engineCreationEvt) {
		
		 RestTemplate restTemplate = new RestTemplate();
		 log.info("Send Engine creation event");
		 //TODO: meaningful Logging
		 restTemplate.postForObject(environment.getRequiredProperty("aedms.monitor.engine"), engineCreationEvt, EngineCreationEvent.class);

	}

}
