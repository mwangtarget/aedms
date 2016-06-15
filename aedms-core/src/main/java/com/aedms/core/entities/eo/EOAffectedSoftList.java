package com.aedms.core.entities.eo;

import com.aedms.core.entities.AedmsEntity;
import fr.lteconsulting.Mandatory;
import fr.lteconsulting.UseBuilderGenerator;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author jaly
 */
@Entity
@Table (name = "EO_AFF_SOFT_LIST")
public class EOAffectedSoftList extends AedmsEntity {
    
    private static final long serialVersionUID = 1L;
    
    @Column(name = "SFT_NO", length = 50)
    private String softNumber;
    
    @Column(name = "SFT_DESC", length = 4000)
    private String softDescription;
    
    @Column(name = "SFT_REV_NO", length = 50)
    private String softVersionNumber;
    
    @Column(name = "SFT_NAME", length = 100)
    private String softName;
    
    @Column(name = "SFT_UPDATE_DATE", length = 10)
    private String softATA;
    
    @Column(name = "EO_ORDER_ID")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date softUpdateDate;
    
    @Column(name = "EO_ORDER_ID")
    @OneToOne(optional = false, fetch = FetchType.LAZY, mappedBy = "eoaffsoftlist")
    private EOOrder eoOrder;
    
    public EOAffectedSoftList(){}
    
    @UseBuilderGenerator
    public EOAffectedSoftList(@Mandatory EOOrder eoOrder, String softNumber, String softDescription, 
            String softName, String softATA, Date softUpdateDate, String softVersionNumber) {
        super();
        this.eoOrder = eoOrder;
        this.softATA = softATA;
        this.softDescription = softDescription;
        this.softName = softName;
        this.softNumber = softNumber;
        this.softVersionNumber = softVersionNumber;
        this.softUpdateDate = softUpdateDate;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        return sb.toString();
    }

    /**
     * @return the softNumber
     */
    public String getSoftNumber() {
        return softNumber;
    }

    /**
     * @param softNumber the softNumber to set
     */
    public void setSoftNumber(String softNumber) {
        this.softNumber = softNumber;
    }

    /**
     * @return the softDescription
     */
    public String getSoftDescription() {
        return softDescription;
    }

    /**
     * @param softDescription the softDescription to set
     */
    public void setSoftDescription(String softDescription) {
        this.softDescription = softDescription;
    }

    /**
     * @return the softVersionNumber
     */
    public String getSoftVersionNumber() {
        return softVersionNumber;
    }

    /**
     * @param softVersionNumber the softVersionNumber to set
     */
    public void setSoftVersionNumber(String softVersionNumber) {
        this.softVersionNumber = softVersionNumber;
    }

    /**
     * @return the softName
     */
    public String getSoftName() {
        return softName;
    }

    /**
     * @param softName the softName to set
     */
    public void setSoftName(String softName) {
        this.softName = softName;
    }

    /**
     * @return the softATA
     */
    public String getSoftATA() {
        return softATA;
    }

    /**
     * @param softATA the softATA to set
     */
    public void setSoftATA(String softATA) {
        this.softATA = softATA;
    }

    /**
     * @return the softUpdateDate
     */
    public Date getSoftUpdateDate() {
        return softUpdateDate;
    }

    /**
     * @param softUpdateDate the softUpdateDate to set
     */
    public void setSoftUpdateDate(Date softUpdateDate) {
        this.softUpdateDate = softUpdateDate;
    }

    /**
     * @return the eoOrder
     */
    public EOOrder getEoOrder() {
        return eoOrder;
    }

    /**
     * @param eoOrder the eoOrder to set
     */
    public void setEoOrder(EOOrder eoOrder) {
        this.eoOrder = eoOrder;
    }
    
}
