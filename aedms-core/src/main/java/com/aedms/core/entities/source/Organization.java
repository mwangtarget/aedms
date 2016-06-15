package com.aedms.core.entities.source;

import com.aedms.core.entities.AedmsEntity;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import fr.lteconsulting.Mandatory;
import fr.lteconsulting.UseBuilderGenerator;

/**
 * The Entity to representing Organization record. The physical table is "ORGANIZATION"
 *
 * @author jaly
 */
@Entity
@Table(name = "ORGANIZATION")
public class Organization extends AedmsEntity {
    
    private static final long serialVersionUID = 1L;
    
    @Column(name = "DEP_CODE")
    private String depCode;
    
    @Column(name = "DEP_NAME")
    private String depName;
    
    @Column(name = "PARENT_ORG_ID")
    private Organization parentOrg;
    
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy = "organization")
    private Set<User> users;

    /**Constructor list block
     */
    public Organization(){}
    
    @UseBuilderGenerator
    public Organization(@Mandatory String depCode, @Mandatory String depName, Organization parentOrg, Set<User> users) {
		super();
		this.depCode = depCode;
		this.depName = depName;
		this.parentOrg = parentOrg;
		this.users = users;
	}


    /**
     * @return the depCode
     */
    public String getDepCode() {
        return depCode;
    }

    /**
     * @param depCode the depCode to set
     */
    public void setDepCode(String depCode) {
        this.depCode = depCode;
    }

    /**
     * @return the depName
     */
    public String getDepName() {
        return depName;
    }

    /**
     * @param depName the depName to set
     */
    public void setDepName(String depName) {
        this.depName = depName;
    }

    /**
     * @return the parentOrg
     */
    public Organization getParentOrg() {
        return parentOrg;
    }

    /**
     * @param parentOrg the parentOrg to set
     */
    public void setParentOrg(Organization parentOrg) {
        this.parentOrg = parentOrg;
    }
    
}
