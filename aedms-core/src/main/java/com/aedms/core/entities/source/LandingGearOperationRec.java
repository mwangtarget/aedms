package com.aedms.core.entities.source;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import fr.lteconsulting.Mandatory;
import fr.lteconsulting.UseBuilderGenerator;

/**
 * The Entity to representing LandingGear Operation record. The physical table is "LANDING_GEAR_OPERATION_RECORD"
 * @author jaly
 */
@Entity
@Table(name = "LANDING_GEAR_OPERATION_RECORD")
public class LandingGearOperationRec implements Serializable{

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    
    @Column(name = "TSN")
    private float tsn;
    
    @Column(name = "CSN")
    private int csn;
    
    @Column(name = "TSO")
    private float tso;
    
    @Column(name = "CSO")
    private int cso;
    
    @Column(name = "INSTALL_FH")
    private float installFH;
    
    @Column(name = "INSTALL_FC")
    private int installFC;
    
    @Column(name = "REMAIN_FH")
    private float remainFH;
    
    @Column(name = "REMAIN_FC")
    private int remainFC;
    
    @Column(name = "RECORD_DATE")
    private Date recordDate;
    
    @ManyToOne
    @JoinColumn(name = "LANDING_GEAR_ID")
	private LandingGear landingGear;
    
    /** Constructor block list*/
    public LandingGearOperationRec(){}
    
    @UseBuilderGenerator
    public LandingGearOperationRec(@Mandatory float tsn, @Mandatory int csn, float tso, int cso, float installFH, int installFC,
			float remainFH, int remainFC, Date recordDate, @Mandatory LandingGear landingGear) {
		super();
		this.tsn = tsn;
		this.csn = csn;
		this.tso = tso;
		this.cso = cso;
		this.installFH = installFH;
		this.installFC = installFC;
		this.remainFH = remainFH;
		this.remainFC = remainFC;
		this.recordDate = recordDate;
		this.landingGear = landingGear;
	}


	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the tsn
     */
    public float getTsn() {
        return tsn;
    }

    /**
     * @param tsn the tsn to set
     */
    public void setTsn(float tsn) {
        this.tsn = tsn;
    }

    /**
     * @return the csn
     */
    public int getCsn() {
        return csn;
    }

    /**
     * @param csn the csn to set
     */
    public void setCsn(int csn) {
        this.csn = csn;
    }

    /**
     * @return the tso
     */
    public float getTso() {
        return tso;
    }

    /**
     * @param tso the tso to set
     */
    public void setTso(float tso) {
        this.tso = tso;
    }

    /**
     * @return the cso
     */
    public int getCso() {
        return cso;
    }

    /**
     * @param cso the cso to set
     */
    public void setCso(int cso) {
        this.cso = cso;
    }

    /**
     * @return the installFH
     */
    public float getInstallFH() {
        return installFH;
    }

    /**
     * @param installFH the installFH to set
     */
    public void setInstallFH(float installFH) {
        this.installFH = installFH;
    }

    /**
     * @return the installFC
     */
    public int getInstallFC() {
        return installFC;
    }

    /**
     * @param installFC the installFC to set
     */
    public void setInstallFC(int installFC) {
        this.installFC = installFC;
    }

    /**
     * @return the remainFH
     */
    public float getRemainFH() {
        return remainFH;
    }

    /**
     * @param remainFH the remainFH to set
     */
    public void setRemainFH(float remainFH) {
        this.remainFH = remainFH;
    }

    /**
     * @return the remainFC
     */
    public int getRemainFC() {
        return remainFC;
    }

    /**
     * @param remainFC the remainFC to set
     */
    public void setRemainFC(int remainFC) {
        this.remainFC = remainFC;
    }

    /**
     * @return the recordDate
     */
    public Date getRecordDate() {
        return recordDate;
    }

    /**
     * @param recordDate the recordDate to set
     */
    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

}
