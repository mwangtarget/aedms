package com.aedms.core.entities.source.builder;

import com.aedms.core.entities.source.Organization;
import com.aedms.core.entities.source.User;
import java.util.Date;

/**
 *
 * @author jaly
 */
public class UserBuilder implements Builder<User>{
    
    public static UserBuilder createUserBuilder() {
        return new UserBuilder();
    }
    
    public UserBuilder() {}

    private final User target = new User();
    
    public UserBuilder withName(String name) {
        this.getTarget().setName(name);
        return this;
    }
    
    public UserBuilder withPassword(String password) {
        this.getTarget().setPasssword(password);
        return this;
    }
    
    public UserBuilder withLoginName(String loginName) {
        this.getTarget().setLoginName(loginName);
        return this;
    }
    
    public UserBuilder withOrganization(Organization organization) {
        this.getTarget().setOrganization(organization);
        return this;
    }
    
    public UserBuilder withFirstLogin(Date firstLogin) {
        this.getTarget().setFirstLogin(firstLogin);
        return this;
    }
    
    public UserBuilder withLastLogin(Date lastLogin) {
        this.getTarget().setLastLogin(lastLogin);
        return this;
    }
    
    public UserBuilder withEmail(String email) {
        this.getTarget().setEmail(email);
        return this;
    }
    
    @Override
    public User build() {
        return this.getTarget();
    }

    /**
     * @return the target
     */
    protected User getTarget() {
        return target;
    }
}
