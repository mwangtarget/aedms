package com.aedms.core.entities.source;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 * The Entity to representing Landing Gear information.
 * The physical table is "LANDING_GEAR_INFO"
 * 
 * @author jaly
 */
@Entity
@Table(name = "LANDING_GEAR_INFO")
public class LandingGear implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private long ID;
    
    @Column(name = "MODEL")
    private String model;
    
    @Column(name = "SN")
    private String SN;
    
    @Column(name = "MANUFACTURE_DATE")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date manufactureDate;
    
    @Column(name = "RENT_DATE")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date rentDate;
    
    @Column(name = "LEASE_HOLD")
    private String leaseHold;
    
    @Column(name = "LEASE_HOLDER")
    private String leaseHolder;
    
    @Column(name = "ORP")
    private String orp;

    /**
     * @return the ID
     */
    public long getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(long ID) {
        this.ID = ID;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the SN
     */
    public String getSN() {
        return SN;
    }

    /**
     * @param SN the SN to set
     */
    public void setSN(String SN) {
        this.SN = SN;
    }

    /**
     * @return the manufactureDate
     */
    public Date getManufactureDate() {
        return manufactureDate;
    }

    /**
     * @param manufactureDate the manufactureDate to set
     */
    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    /**
     * @return the rentDate
     */
    public Date getRentDate() {
        return rentDate;
    }

    /**
     * @param rentDate the rentDate to set
     */
    public void setRentDate(Date rentDate) {
        this.rentDate = rentDate;
    }

    /**
     * @return the leaseHold
     */
    public String getLeaseHold() {
        return leaseHold;
    }

    /**
     * @param leaseHold the leaseHold to set
     */
    public void setLeaseHold(String leaseHold) {
        this.leaseHold = leaseHold;
    }

    /**
     * @return the leaseHolder
     */
    public String getLeaseHolder() {
        return leaseHolder;
    }

    /**
     * @param leaseHolder the leaseHolder to set
     */
    public void setLeaseHolder(String leaseHolder) {
        this.leaseHolder = leaseHolder;
    }

    /**
     * @return the orp
     */
    public String getOrp() {
        return orp;
    }

    /**
     * @param orp the orp to set
     */
    public void setOrp(String orp) {
        this.orp = orp;
    }
}
