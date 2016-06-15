package com.aedms.core.entities.eo;

import com.aedms.core.entities.AedmsEntity;
import com.aedms.core.entities.enums.EOType;
import fr.lteconsulting.Mandatory;
import fr.lteconsulting.UseBuilderGenerator;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * The object is effected by EO
 * 
 * @author jaly
 */
@Entity
@Table (name = "EFF_BY_EO")
public class EffectedObjectByEO extends AedmsEntity {
    
    private static final long serialVersionUID = 1L;
    
    @Column(name = "UNIT_PRICE")
    private double unitPrice;
    
    @Column(name = "CURRENCY")
    private String currency;
    
    @Column(name = "TOTAL_HOUR")
    private double totalHour;
    
    @Column(name = "ACCESS_HOUR")
    private double accessHour;
    
    @Column(name = "EACH_HOUR")
    private double eachHour;
    
    @Column(name = "EO_TYPE", length=10)
    private EOType eoType;
   
    @Column(name = "EO_ORDER_ID")
    @OneToOne(optional = false, fetch = FetchType.LAZY, mappedBy = "effByEO")
    private EOOrder eoOrder;
    
    public EffectedObjectByEO(){}
    
    @UseBuilderGenerator
    public EffectedObjectByEO(double unitPrice, String currency, double totalHour, double accessHour,
                                double eachHour, EOType eoType, @Mandatory EOOrder eoOrder){
        super();
        this.unitPrice = unitPrice;
        this.currency = currency;
        this.totalHour = totalHour;
        this.accessHour = accessHour;
        this.eachHour = eachHour;
        this.eoType = eoType;
        this.eoOrder = eoOrder;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        return sb.toString();
    }

    /**
     * @return the unitPrice
     */
    public double getUnitPrice() {
        return unitPrice;
    }

    /**
     * @param unitPrice the unitPrice to set
     */
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * @return the currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * @param currency the currency to set
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * @return the totalHour
     */
    public double getTotalHour() {
        return totalHour;
    }

    /**
     * @param totalHour the totalHour to set
     */
    public void setTotalHour(double totalHour) {
        this.totalHour = totalHour;
    }

    /**
     * @return the accessHour
     */
    public double getAccessHour() {
        return accessHour;
    }

    /**
     * @param accessHour the accessHour to set
     */
    public void setAccessHour(double accessHour) {
        this.accessHour = accessHour;
    }

    /**
     * @return the eachHour
     */
    public double getEachHour() {
        return eachHour;
    }

    /**
     * @param eachHour the eachHour to set
     */
    public void setEachHour(double eachHour) {
        this.eachHour = eachHour;
    }

    /**
     * @return the eoType
     */
    public EOType getEoType() {
        return eoType;
    }

    /**
     * @param eoType the eoType to set
     */
    public void setEoType(EOType eoType) {
        this.eoType = eoType;
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
