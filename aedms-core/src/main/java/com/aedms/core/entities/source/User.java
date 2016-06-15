package com.aedms.core.entities.source;

import com.aedms.core.entities.AedmsEntity;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

import fr.lteconsulting.Mandatory;
import fr.lteconsulting.UseBuilderGenerator;

/**
 *
 * The Entity to representing User record. The physical table is "USER"
 * 
 * @author jaly
 */
@Entity
@Table(name = "USER")
public class User extends AedmsEntity {
    
    private static final long serialVersionUID = 1L;

    @Column(name = "NAME")
    private String name;
    
    @Column(name = "LOGIN_NAME")
    private String loginName;
    
    @Column(name = "PASSWORD")
    private String passsword;
    
    @ManyToOne
    @JoinColumn(name = "ORGANIZATION_ID")
    private Organization organization;
    
    @Column(name = "FIRST_LOGIN")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date firstLogin;
    
    @Column(name = "LAST_LOGIN")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date lastLogin;
    
    @Column(name = "EMAIL")
    private String email;
    
    /** Constructors list block */
    public User(){}
    
    @UseBuilderGenerator
    public User(@Mandatory String name, @Mandatory String loginName, @Mandatory String passsword, @Mandatory Organization organization,@Mandatory  Date firstLogin,
    		@Mandatory Date lastLogin, @Mandatory String email) {
		super();
		this.name = name;
		this.loginName = loginName;
		this.passsword = passsword;
		this.organization = organization;
		this.firstLogin = firstLogin;
		this.lastLogin = lastLogin;
		this.email = email;
	}


    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the loginName
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * @param loginName the loginName to set
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    /**
     * @return the passsword
     */
    public String getPasssword() {
        return passsword;
    }

    /**
     * @param passsword the passsword to set
     */
    public void setPasssword(String passsword) {
        this.passsword = passsword;
    }

    /**
     * @return the organization
     */
    public Organization getOrganization() {
        return organization;
    }

    /**
     * @param organization the organization to set
     */
    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    /**
     * @return the firstLogin
     */
    public Date getFirstLogin() {
        return firstLogin;
    }

    /**
     * @param firstLogin the firstLogin to set
     */
    public void setFirstLogin(Date firstLogin) {
        this.firstLogin = firstLogin;
    }

    /**
     * @return the lastLogin
     */
    public Date getLastLogin() {
        return lastLogin;
    }

    /**
     * @param lastLogin the lastLogin to set
     */
    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
}
