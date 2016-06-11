package com.aedms.core.security;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.aedms.core.entities.source.User;
import com.aedms.core.repo.source.UserRepo;

@Component
public class CoreRealm extends AuthorizingRealm {

    @Autowired
    private UserRepo userRepo;

	
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		 
		    final UsernamePasswordToken credentials = (UsernamePasswordToken) token;
		 
	        final String userName = credentials.getUsername();
	        if (userName == null) {
	            throw new UnknownAccountException("UserName not provided");
	        }
	        final User user = userRepo.findByLoginName(userName);
	        
	        if (user == null) {
	            throw new UnknownAccountException("Account does not exist");
	        }
	        return new SimpleAuthenticationInfo(userName, user.getPassword().toCharArray(),
	                ByteSource.Util.bytes(userName), getName());
	}


}
