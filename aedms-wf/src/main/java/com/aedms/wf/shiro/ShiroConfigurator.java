package com.aedms.wf.shiro;

import org.activiti.engine.cfg.AbstractProcessEngineConfigurator;
import org.activiti.engine.impl.cfg.ProcessEngineConfigurationImpl;
import org.activiti.engine.runtime.Clock;
import org.springframework.beans.factory.annotation.Autowired;

public class ShiroConfigurator extends AbstractProcessEngineConfigurator {

	
	protected ShiroUserManagerFactory shiroUserManagerFactory = new ShiroUserManagerFactory();

	// Cache clock
	private Clock clock;

	@Override
	public void beforeInit(ProcessEngineConfigurationImpl processEngineConfiguration) {
		// TODO Auto-generated method stub

	}

	@Override
	public void configure(ProcessEngineConfigurationImpl processEngineConfiguration) {
		clock = processEngineConfiguration.getClock();
		processEngineConfiguration.getSessionFactories().put(shiroUserManagerFactory.getSessionType(),
				shiroUserManagerFactory);

	}

}
