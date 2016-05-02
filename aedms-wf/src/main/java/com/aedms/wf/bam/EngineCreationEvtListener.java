package com.aedms.wf.bam;

import java.util.Date;

import org.activiti.engine.delegate.DelegateExecution;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aedms.bam.evt.EngineCreationEvent;
import com.aedms.wf.App;

@Component(value="engineCreationListener")
public class EngineCreationEvtListener{

	private static final Logger log = LoggerFactory.getLogger(EngineCreationEvtListener.class);

	@Autowired
	EngineKPISender engineKPISender;
	
	public void notify(DelegateExecution execution) throws Exception {
		
		 String fleet = (String) execution.getVariable("fleet");
		 //TODO: meaningful Logging
		 log.info("Send Engine creation event");
		 engineKPISender.sendEngineCreationEvt(new EngineCreationEvent(fleet, execution.getId(), new Date().getTime()));
		
	}

}
