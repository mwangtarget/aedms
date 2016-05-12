package com.aedms.core.entities.source;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The Entity to representing Organization record. The physical table is "ORGANIZATION"
 *
 * @author jaly
 */
@Entity
@Table(name = "ORGANIZATION")
public class Organization implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    
    @Column(name = "DEP_CODE")
    private String depCode;
    
    @Column(name = "DEP_NAME")
    private String depName;
    
    @Column(name = "PARENT_ORG_ID")
    private Organization parentOrg;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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