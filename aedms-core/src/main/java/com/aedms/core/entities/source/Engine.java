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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;



/**
 * The Entity to representing engine information.
 * The physical table is "ENGINE_INFO"
 * 
 * @author jaly
 */
@Entity
@Table(name="ENGINE")
//@Audited // Cause error: An audited relation to a not audited entity
public class Engine implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;
    
    @Column(name = "FLEET")
    private String fleet;
    
    @Column(name = "SUB_FLEET")
    private String subFleet;
    
    @Column(name = "SERIAL_NO")
    private String serialNo;
    
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
    
    @Column(name = "OPR")
    private String opr;
    
    @Column(name = "REMARK")
    private String remark;

   
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="engine")
    private Set<EngineOprRec>   engineOprRecs; 
	
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="engine")
    private Set<EngineStatRec>   engineStatRecs; 
    
    @Override
	public String toString() {
		return "Engine [id=" + id + ", fleet=" + fleet + ", subFleet=" + subFleet + ", serialNo=" + serialNo
				+ ", model=" + model + ", SN=" + SN + ", manufactureDate=" + manufactureDate + ", rentDate=" + rentDate
				+ ", leaseHold=" + leaseHold + ", leaseHolder=" + leaseHolder + ", opr=" + opr + ", remark=" + remark
				+ "]";
	}

    
	public Set<EngineStatRec> getEngineStatRecs() {
		return engineStatRecs;
	}


	public void setEngineStatRecs(Set<EngineStatRec> engineStatRecs) {
		this.engineStatRecs = engineStatRecs;
	}


	public Set<EngineOprRec> getEngineOprRecs() {
		return engineOprRecs;
	}


	public void setEngineOprRecs(Set<EngineOprRec> engineOprRecs) {
		this.engineOprRecs = engineOprRecs;
	}


	public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the fleet
     */
    public String getFleet() {
        return fleet;
    }

    /**
     * @param fleet the fleet to set
     */
    public void setFleet(String fleet) {
        this.fleet = fleet;
    }

    /**
     * @return the subFleet
     */
    public String getSubFleet() {
        return subFleet;
    }

    /**
     * @param subFleet the subFleet to set
     */
    public void setSubFleet(String subFleet) {
        this.subFleet = subFleet;
    }

    /**
     * @return the serialNo
     */
    public String getSerialNo() {
        return serialNo;
    }

    /**
     * @param serialNo the serialNo to set
     */
    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
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
     * @return the opr
     */
    public String getOpr() {
        return opr;
    }

    /**
     * @param opr the opr to set
     */
    public void setOpr(String opr) {
        this.opr = opr;
    }

    /**
     * @return the remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark the remark to set
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}
