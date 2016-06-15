package com.aedms.core.entities.eo;

import com.aedms.core.entities.AedmsEntity;
import com.aedms.core.entities.enums.ProjectFileType;
import com.aedms.core.entities.source.Organization;
import fr.lteconsulting.UseBuilderGenerator;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author jaly
 */
@Entity
@Table(name = "EO_To_ORG")
public class EOToORG extends AedmsEntity{
    
    private static final long serialVersionUID = 1L;
    
    /**
     * This should be converted real instance
     */
    @Column(name = "ORM_ID")
    @OneToOne(optional = false, fetch = FetchType.LAZY, mappedBy = "eoToOrg")
    private AedmsEntity aedMsEntity;
    
    /**
     * 
     */
    @Column(name = "ORGANIZATION_ID")
    @OneToOne(optional = false, fetch = FetchType.LAZY, mappedBy = "eoToOrg")
    private Organization organization;
    
    /**
     * 工程文件类型
     * 00：EO编写转发
     * 01：维修部EO转发
     * 02：器材准备转发
     * 03：EO更改通知单
     */
    @Column(name = "ORM_TYPE", length = 2)
    private ProjectFileType ormType;
    
    public EOToORG(){}
    
    @UseBuilderGenerator
    public EOToORG(AedmsEntity aedMsEntity, Organization organization, ProjectFileType ormType){
        super();
        this.aedMsEntity = aedMsEntity;
        this.organization = organization;
        this.ormType = ormType;
    }
    

    /**
     * @return the aedMsEntity
     */
    public AedmsEntity getAedMsEntity() {
        return aedMsEntity;
    }

    /**
     * @param aedMsEntity the aedMsEntity to set
     */
    public void setAedMsEntity(AedmsEntity aedMsEntity) {
        this.aedMsEntity = aedMsEntity;
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
     * @return the ormType
     */
    public ProjectFileType getOrmType() {
        return ormType;
    }

    /**
     * @param ormType the ormType to set
     */
    public void setOrmType(ProjectFileType ormType) {
        this.ormType = ormType;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        return sb.toString();
    }
    
}
