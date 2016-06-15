package com.aedms.core.entities.eo;

import com.aedms.core.entities.AedmsEntity;
import com.aedms.core.entities.enums.EOToolType;
import fr.lteconsulting.Mandatory;
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
@Table (name = "EO_TOOL_SEQP")
public class EOToolSpecial extends AedmsEntity {
    
    private static final long serialVersionUID = 1L;
    
    @Column(name = "EO_TOOL_NO", length = 50)
    private String eoToolNumber;
    
    @Column(name = "EO_TOOL_NAME", length = 4000)
    private String eoToolName;
    
    @Column(name = "EO_TOOL_TYPE", length = 10)
    private EOToolType eoToolType;
    
    @Column(name = "EO_TOOL_MEMO", length = 4000)
    private String eoToolMemo;
    
    @Column(name = "EO_ORDER_ID")
    @OneToOne(optional = false, fetch = FetchType.LAZY, mappedBy = "eoToolSpecial")
    private EOOrder eoOrder;
    
    public EOToolSpecial(){}
    
    @UseBuilderGenerator
    public EOToolSpecial(@Mandatory EOOrder eoOrder, String eoToolNumber, String eoToolName,
                           EOToolType eoToolType, String eoToolMemo) {
        super();
        this.eoOrder = eoOrder;
        this.eoToolMemo = eoToolMemo;
        this.eoToolName = eoToolName;
        this.eoToolNumber = eoToolNumber;
        this.eoToolType = eoToolType;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        return sb.toString();
    }

    /**
     * @return the eoToolNumber
     */
    public String getEoToolNumber() {
        return eoToolNumber;
    }

    /**
     * @param eoToolNumber the eoToolNumber to set
     */
    public void setEoToolNumber(String eoToolNumber) {
        this.eoToolNumber = eoToolNumber;
    }

    /**
     * @return the eoToolName
     */
    public String getEoToolName() {
        return eoToolName;
    }

    /**
     * @param eoToolName the eoToolName to set
     */
    public void setEoToolName(String eoToolName) {
        this.eoToolName = eoToolName;
    }

    /**
     * @return the eoToolType
     */
    public EOToolType getEoToolType() {
        return eoToolType;
    }

    /**
     * @param eoToolType the eoToolType to set
     */
    public void setEoToolType(EOToolType eoToolType) {
        this.eoToolType = eoToolType;
    }

    /**
     * @return the eoToolMemo
     */
    public String getEoToolMemo() {
        return eoToolMemo;
    }

    /**
     * @param eoToolMemo the eoToolMemo to set
     */
    public void setEoToolMemo(String eoToolMemo) {
        this.eoToolMemo = eoToolMemo;
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
