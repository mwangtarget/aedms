package com.aedms.bam.controller.ws;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

import com.aedms.bam.kpi.KPIContainer;
import com.aedms.bam.kpi.KPIEntry;
import com.espertech.esper.client.EPServiceProvider;

@Controller

public class EngineCreationBAMWS {

	@Autowired
	SimpMessageSendingOperations messagingTemplate;

	@Autowired
	EPServiceProvider epService;

	@Autowired
	KPIContainer engineBAMKPI;

	@MessageMapping("/engine-bam-ed")
	@SendTo("/topic/engine-bam-ws")
	public List<KPIEntry> engineBAM(){

			List<KPIEntry> kpiList = new ArrayList<>();

			for (Entry<String, Long> entry : engineBAMKPI.getKpiDetails().entrySet()) {
				kpiList.add(new KPIEntry(entry.getKey(), entry.getValue()));
			}
			return kpiList;
	}
    //TODO: instead of fix delay, send to all subscribers after item been added.
	@Scheduled(fixedDelay = 1500)
	public void sendTradeNotifications() {

		List<KPIEntry> kpiList = new ArrayList<>();

		for (Entry<String, Long> entry : engineBAMKPI.getKpiDetails().entrySet()) {
			kpiList.add(new KPIEntry(entry.getKey(), entry.getValue()));
		}
		messagingTemplate.convertAndSend("/topic/engine-bam-ws", kpiList);

	}

}
