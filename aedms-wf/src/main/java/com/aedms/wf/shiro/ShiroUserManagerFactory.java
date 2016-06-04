package com.aedms.wf.shiro;

import org.activiti.engine.impl.interceptor.Session;
import org.activiti.engine.impl.interceptor.SessionFactory;
import org.activiti.engine.impl.persistence.entity.UserIdentityManager;
import org.activiti.ldap.LDAPUserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "shiroUserManagerFactory")
public class ShiroUserManagerFactory implements SessionFactory {



	@Override
	public Class<?> getSessionType() {
		return UserIdentityManager.class;
	}

	@Override
	public Session openSession() {
		return new ShiroUserManager();
	}

}
