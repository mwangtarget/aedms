package com.aedms.wf.core;

import java.util.Date;

import org.activiti.engine.delegate.DelegateExecution;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.aedms.core.entities.eo.EOOrder;
import com.aedms.core.entities.eo.EOOrderBuilder;
import com.aedms.core.entities.source.Engine;

@Component(value = "eoRSClient")
public class EORSClient {
	@Autowired
	private Environment environment;

	public void saveEO(DelegateExecution execution) {

		String eoNumber = (String) execution.getVariable("eo_number");
		String eoType = (String) execution.getVariable("eo_type");
		Date issueDate = (Date) execution.getVariable("eo_issue_date");

		EOOrder eoOrder = EOOrderBuilder.withEoNumber(eoNumber).withEoType(eoType).withIssueDate(issueDate).build();

		RestTemplate restTemplate = new RestTemplate();
		restTemplate.postForObject(environment.getRequiredProperty("aedms.rs.eo"), eoOrder, EOOrder.class);

	}

}
