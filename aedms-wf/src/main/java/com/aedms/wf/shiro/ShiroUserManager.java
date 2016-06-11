package com.aedms.wf.shiro;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.activiti.engine.identity.Group;
import org.activiti.engine.identity.Picture;
import org.activiti.engine.identity.User;
import org.activiti.engine.identity.UserQuery;
import org.activiti.engine.impl.Page;
import org.activiti.engine.impl.UserQueryImpl;
import org.activiti.engine.impl.context.Context;
import org.activiti.engine.impl.persistence.AbstractManager;
import org.activiti.engine.impl.persistence.entity.IdentityInfoEntity;
import org.activiti.engine.impl.persistence.entity.UserEntity;
import org.activiti.engine.impl.persistence.entity.UserIdentityManager;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.aedms.core.entities.source.Engine;
import com.aedms.core.repo.source.AuthenticationController;


public class ShiroUserManager extends AbstractManager implements UserIdentityManager {

	private static final Logger log = LoggerFactory.getLogger(ShiroUserManager.class);


	private Environment environment;


	RestTemplate restTemplate = new RestTemplate();

	@Override
	public User createNewUser(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertUser(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateUser(User updatedUser) {
		// TODO Auto-generated method stub

	}

	@Override
	public User findUserById(String userId) {
	    
	    Map<String, String> params = new HashMap<String, String>();
	    params.put("username", userId);
	    com.aedms.core.entities.source.User aedmsUser = restTemplate.getForObject(environment.getRequiredProperty("aedms.rs.users"), com.aedms.core.entities.source.User.class, params);

	    User activitiUser = new UserEntity();
	    activitiUser.setId(aedmsUser.getLoginName());
	    activitiUser.setEmail(aedmsUser.getEmail());
	    return activitiUser;
	 
	}

	@Override
	public void deleteUser(String userId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<User> findUserByQueryCriteria(UserQueryImpl query, Page page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long findUserCountByQueryCriteria(UserQueryImpl query) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Group> findGroupsByUser(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserQuery createNewUserQuery() {
		return new UserQueryImpl(Context.getProcessEngineConfiguration().getCommandExecutor());
	}

	@Override
	public IdentityInfoEntity findUserInfoByUserIdAndKey(String userId, String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> findUserInfoKeysByUserIdAndType(String userId, String type) {
		// TODO Auto-generated method stub
		return null;
	}

	//TODO: External the URL configuration
	@Override
	public Boolean checkPassword(String userId, String password) {
		  Map<String, String> params = new HashMap<String, String>();
		  params.put("username", userId);
		  params.put("password", password);
		  
		  UsernamePasswordToken userpasswordToken = new UsernamePasswordToken(userId, password);
		  try{
			  restTemplate.postForObject("http://localhost:8081/aedms-core/auth", userpasswordToken, Void.class);
			  log.info("Log in Succeed: [username: "+ userId + " ]");
			  return true;
		  }catch(Exception exception){
			  log.error("Log in Failed: [username: "+ userId + " ]");
			  log.error(exception.getMessage());
			  return false;
		  }
		  
	}

	@Override
	public List<User> findPotentialStarterUsers(String proceDefId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findUsersByNativeQuery(Map<String, Object> parameterMap, int firstResult, int maxResults) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long findUserCountByNativeQuery(Map<String, Object> parameterMap) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isNewUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Picture getUserPicture(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setUserPicture(String userId, Picture picture) {
		// TODO Auto-generated method stub

	}

}
