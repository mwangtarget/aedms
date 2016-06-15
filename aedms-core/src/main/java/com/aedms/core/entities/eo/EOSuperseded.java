package com.aedms.core.entities.eo;

import com.aedms.core.entities.AedmsEntity;
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
@Table (name = "EO_SUPERSEDED")
public class EOSuperseded extends AedmsEntity {
    
    private static final long serialVersionUID = 1L;
    
    @Column(name = "EO_ORDER_ID")
    @OneToOne(optional = false, fetch = FetchType.LAZY, mappedBy = "eoSuperseded")
    private EOOrder eoOrder;
    
    @Column(name = "SUPERSEDED_EO_ID")
    @OneToOne(optional = false, fetch = FetchType.LAZY, mappedBy = "eoSuperseded")
    private EOOrder superOrder;
    
    public EOSuperseded(){}
    
    @UseBuilderGenerator
    public EOSuperseded(EOOrder eoOrder, EOOrder superOrder){
        super();
        this.eoOrder = eoOrder;
        this.superOrder = superOrder;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        return sb.toString();
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

    /**
     * @return the superOrder
     */
    public EOOrder getSuperOrder() {
        return superOrder;
    }

    /**
     * @param superOrder the superOrder to set
     */
    public void setSuperOrder(EOOrder superOrder) {
        this.superOrder = superOrder;
    }
    
}
