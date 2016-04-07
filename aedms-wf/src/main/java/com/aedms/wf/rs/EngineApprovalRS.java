package com.aedms.wf.rs;

import java.util.Map;

import org.activiti.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.aedms.core.repo.source.EngineRepo;

@RestController
public class EngineApprovalRS {
	
	@Autowired
	private RuntimeService runtimeService;

//	@Autowired
//	private EngineRepo engineRepository;
//
//	@ResponseStatus(value = HttpStatus.OK)
//	@RequestMapping(value = "/start-engine-creation", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
//	public void startEngineCreationPro(@RequestBody Map<String, String> data) {
//		runtimeService.startProcessInstanceByKey("EngineCreationApproval");
//	}

}
