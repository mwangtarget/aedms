package com.aedms.core.entities.eo;

import com.aedms.core.entities.AedmsEntity;
import fr.lteconsulting.Mandatory;
import fr.lteconsulting.UseBuilderGenerator;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author jaly
 */
@Entity
@Table( name = "MON_MAT_LIST")
public class MonMatList extends AedmsEntity {
    
    private static final long serialVersionUID = 1L;
    
    @Column(name = "PART_NAME", length = 50)
    private String partName;
    
    @Column(name = "PART_NO", length = 100)
    private String partNumber;
    
    @Column(name = "UNIT", length = 50)
    private String unit;
    
    @Column(name = "QUANTITY", length = 50)
    private String quantity;
    
    @Column(name = "ATA", length = 10)
    private String ata;
    
    @Column(name = "REFERENCE", length = 2000)
    private String reference;
    
    @Column(name = "MEMO", length = 4000)
    private String memo;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="MON_ID", nullable = false)
    private Mon mon;


    public MonMatList(){}
    
    @UseBuilderGenerator
    public MonMatList(@Mandatory Mon mon, String partName, String partNumber, String unit, String quantity,
                       String ata, String reference, String memo) {
        super();
        this.mon = mon;
        this.partName = partName;
        this.partNumber = partNumber;
        this.unit = unit;
        this.quantity = quantity;
        this.ata = ata;
        this.reference = reference;
        this.memo = memo;
    }
    
    /**
     * @return the partName
     */
    public String getPartName() {
        return partName;
    }

    /**
     * @param partName the partName to set
     */
    public void setPartName(String partName) {
        this.partName = partName;
    }

    /**
     * @return the partNumber
     */
    public String getPartNumber() {
        return partNumber;
    }

    /**
     * @param partNumber the partNumber to set
     */
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    /**
     * @return the unit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * @param unit the unit to set
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * @return the quantity
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the ata
     */
    public String getAta() {
        return ata;
    }

    /**
     * @param ata the ata to set
     */
    public void setAta(String ata) {
        this.ata = ata;
    }

    /**
     * @return the reference
     */
    public String getReference() {
        return reference;
    }

    /**
     * @param reference the reference to set
     */
    public void setReference(String reference) {
        this.reference = reference;
    }

    /**
     * @return the memo
     */
    public String getMemo() {
        return memo;
    }

    /**
     * @param memo the memo to set
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        return sb.toString();
    }

    /**
     * @return the mon
     */
    public Mon getMon() {
        return mon;
    }

    /**
     * @param mon the mon to set
     */
    public void setMon(Mon mon) {
        this.mon = mon;
    }
    
}
