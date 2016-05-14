package com.aedms.core.entities.source;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

import org.hibernate.envers.Audited;

import fr.lteconsulting.Mandatory;
import fr.lteconsulting.UseBuilderGenerator;

/**
 * The Entity to representing Landing Gear information.
 * The physical table is "LANDING_GEAR"
 * 
 * @author jaly
 */
@Entity
@Table(name = "LANDING_GEAR")
//@Audited
public class LandingGear implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;
    
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
    
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="landingGear")
    private Set<LandingGearStatusRec> landingGearStatusRecs;
    
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="landingGear")
    private Set<LandingGearOperationRec> landingGearOperationRecs;

    @ManyToOne
    @JoinColumn(name = "AIRCRAFT_ID")
	private AirCraft aircraft;
    
    /** Constructor block list */
    public LandingGear(){}
    
    @UseBuilderGenerator
    public LandingGear(@Mandatory String model, @Mandatory String sN, @Mandatory Date manufactureDate, Date rentDate, String leaseHold,
			String leaseHolder, String orp, Set<LandingGearStatusRec> landingGearStatusRecs,
			Set<LandingGearOperationRec> landingGearOperationRecs, @Mandatory AirCraft aircraft) {
		super();
		this.model = model;
		SN = sN;
		this.manufactureDate = manufactureDate;
		this.rentDate = rentDate;
		this.leaseHold = leaseHold;
		this.leaseHolder = leaseHolder;
		this.orp = orp;
		this.landingGearStatusRecs = landingGearStatusRecs;
		this.landingGearOperationRecs = landingGearOperationRecs;
		this.aircraft = aircraft;
	}


	@Override
	public String toString() {
		return "LandingGear [id=" + id + ", model=" + model + ", SN=" + SN + ", manufactureDate=" + manufactureDate
				+ ", rentDate=" + rentDate + ", leaseHold=" + leaseHold + ", leaseHolder=" + leaseHolder + ", orp="
				+ orp + "]";
	}

	/**
     * @return the ID
     */
    public long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(long id) {
        this.id = id;
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

    /**
     * @return the landingGearStatusRecs
     */
    public Set<LandingGearStatusRec> getLandingGearStatusRecs() {
        return landingGearStatusRecs;
    }

    /**
     * @param landingGearStatusRecs the landingGearStatusRecs to set
     */
    public void setLandingGearStatusRecs(Set<LandingGearStatusRec> landingGearStatusRecs) {
        this.landingGearStatusRecs = landingGearStatusRecs;
    }

    /**
     * @return the landingGearOperationRecs
     */
    public Set<LandingGearOperationRec> getLandingGearOperationRecs() {
        return landingGearOperationRecs;
    }

    /**
     * @param landingGearOperationRecs the landingGearOperationRecs to set
     */
    public void setLandingGearOperationRecs(Set<LandingGearOperationRec> landingGearOperationRecs) {
        this.landingGearOperationRecs = landingGearOperationRecs;
    }
}
