package com.aedms.bam.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aedms.bam.evt.EngineCreationEvent;
import com.aedms.bam.kpi.KPIContainer;
import com.espertech.esper.client.EPServiceProvider;



@RestController
public class EngineCreationBAM {

	private static final Logger log = LoggerFactory.getLogger(EngineCreationBAM.class);

	@Autowired
	EPServiceProvider epService;
	
	@Autowired
	KPIContainer engineBAMKPI;
	
	@RequestMapping(method = RequestMethod.POST, value = "/engine-evt-notify")
	public EngineCreationEvent engineEventNotify(@RequestBody EngineCreationEvent engineEvt) {
		epService.getEPRuntime().sendEvent(engineEvt);
		//TODO: return the meaningful response.
		return engineEvt;
	
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/engine-bam")
	public Map<String, Long> engineBAM() {
		return engineBAMKPI.getKpiDetails();	
	}

	@RequestMapping(method = RequestMethod.GET, value = "/engine-evt")
	public EngineCreationEvent engineEvtGet() {
		return new EngineCreationEvent("a","b",123455) ;	
	}

}
