package com.aedms.core.entities.eo;

import com.aedms.core.entities.AedmsEntity;
import fr.lteconsulting.UseBuilderGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "EO_AFF_PUB")
public class EOAffectedPub extends AedmsEntity {
    
    private static final long serialVersionUID = 1L;
	
	@Column(name="AFF_PUB_TYPE", length=50)
	private String affectedPubType;
	
	@Column(name="AFF_PUB_NR", length=50)
	private String affectedPubNo;
	
	@Column(name="AFF_PUB_MEMO", length=4000)
	private String affectedPubMemo;
	
	@ManyToOne
    @JoinColumn(name="EO_ORDER_ID", nullable=false)
	private EOOrder eoOrder;
    
    public EOAffectedPub() {}
    
    @UseBuilderGenerator
    public EOAffectedPub(String affectedPubType, String affectedPubNo, String affectedPubMemo, EOOrder eoOrder) {
        super();
        this.affectedPubMemo = affectedPubMemo;
        this.affectedPubNo = affectedPubNo;
        this.affectedPubType = affectedPubType;
        this.eoOrder = eoOrder; 
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        return sb.toString();
    }

    /**
     * @return the affectedPubType
     */
    public String getAffectedPubType() {
        return affectedPubType;
    }

    /**
     * @param affectedPubType the affectedPubType to set
     */
    public void setAffectedPubType(String affectedPubType) {
        this.affectedPubType = affectedPubType;
    }

    /**
     * @return the affectedPubNo
     */
    public String getAffectedPubNo() {
        return affectedPubNo;
    }

    /**
     * @param affectedPubNo the affectedPubNo to set
     */
    public void setAffectedPubNo(String affectedPubNo) {
        this.affectedPubNo = affectedPubNo;
    }

    /**
     * @return the affectedPubMemo
     */
    public String getAffectedPubMemo() {
        return affectedPubMemo;
    }

    /**
     * @param affectedPubMemo the affectedPubMemo to set
     */
    public void setAffectedPubMemo(String affectedPubMemo) {
        this.affectedPubMemo = affectedPubMemo;
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
