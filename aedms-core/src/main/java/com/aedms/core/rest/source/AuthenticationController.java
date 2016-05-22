package com.aedms.core.rest.source;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.DefaultPasswordService;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aedms.core.repo.source.UserRepo;

@RestController
public class AuthenticationController {

	private static final Logger log = LoggerFactory.getLogger(AuthenticationController.class);

	@Autowired
	private DefaultPasswordService passwordService;

	@Autowired
	private UserRepo userRepo;

	@RequestMapping(value = "/auth", method = RequestMethod.POST)
	public void authenticate(@RequestBody final UsernamePasswordToken credentials) {
		log.info("Authenticating {}", credentials.getUsername());
		final Subject subject = SecurityUtils.getSubject();
		subject.login(credentials);
		// set attribute that will allow session querying
		subject.getSession().setAttribute("loginName", credentials.getUsername());
	}

}
