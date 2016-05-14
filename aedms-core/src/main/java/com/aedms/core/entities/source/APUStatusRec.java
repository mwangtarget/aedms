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
import javax.persistence.Temporal;

import fr.lteconsulting.Mandatory;
import fr.lteconsulting.UseBuilderGenerator;

/**
 *
 * @author jaly
 */
@Entity
@Table(name="APU_STATUS_RECORD")
public class APUStatusRec implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    
    @Column(name = "TSN")
	private float TSN;

	@Column(name = "CSN")
	private Integer CSN;

	@Column(name = "TSO")
	private float TSO;

	@Column(name = "CSO")
	private Integer CSO;
    
    @Column(name="LAST_RP_DATE")
	@Temporal(javax.persistence.TemporalType.DATE)
	private Date lastRpDate;
	
	@Column(name="LAST_RP_UNIT")
	private String lastRpUnit;
	
	@Column(name="INSTALL_DATE")
	@Temporal(javax.persistence.TemporalType.DATE)
	private Date installDate;
	
	@Column(name="INSTALL_ANO")
	private String installANO;
    
    @Column(name = "INSTALL_FH")
    private int installFH;
    
    @Column(name = "INSTALL_FC")
    private int installFC;
    
    @Column(name = "TEARDOWN_DATE")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date tearDownDate;
    
    @Column(name = "TEARDOWN_ANO")
    private String tearDownAno;
    
    @Column(name = "TEARDOWN_CAUSE")
    private String tearDownCause;
    
    private String apuStatus;
    
    @Column(name="REMARK")
	private String remark;
    
    @Column(name = "RECORD_DATE")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date recordDate;
    
    @Column(name = "REPAIR_DATE")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date repairDate;
    
    @Column(name = "REPAIR_UNIT") 
    private String repairUnit;
    
    @Column(name = "OPT_TYPE")
    private String optType;
    
    @ManyToOne
    @JoinColumn(name = "APU_ID")
	private APU apu;
    
    /** Constructor list block */
    public APUStatusRec(){
    	
    }
    
    
    @UseBuilderGenerator
    public APUStatusRec(@Mandatory float tSN, @Mandatory Integer cSN, @Mandatory float tSO, @Mandatory Integer cSO, Date lastRpDate, String lastRpUnit,
			Date installDate, String installANO, int installFH, int installFC, Date tearDownDate, String tearDownAno,
			String tearDownCause, String apuStatus, String remark, Date recordDate, Date repairDate, String repairUnit,
			String optType, @Mandatory APU apu) {
		super();
		TSN = tSN;
		CSN = cSN;
		TSO = tSO;
		CSO = cSO;
		this.lastRpDate = lastRpDate;
		this.lastRpUnit = lastRpUnit;
		this.installDate = installDate;
		this.installANO = installANO;
		this.installFH = installFH;
		this.installFC = installFC;
		this.tearDownDate = tearDownDate;
		this.tearDownAno = tearDownAno;
		this.tearDownCause = tearDownCause;
		this.apuStatus = apuStatus;
		this.remark = remark;
		this.recordDate = recordDate;
		this.repairDate = repairDate;
		this.repairUnit = repairUnit;
		this.optType = optType;
		this.apu = apu;
	}



	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the TSN
     */
    public Float getTSN() {
        return TSN;
    }

    /**
     * @param TSN the TSN to set
     */
    public void setTSN(Float TSN) {
        this.TSN = TSN;
    }

    /**
     * @return the CSN
     */
    public Integer getCSN() {
        return CSN;
    }

    /**
     * @param CSN the CSN to set
     */
    public void setCSN(Integer CSN) {
        this.CSN = CSN;
    }

    /**
     * @return the TSO
     */
    public Float getTSO() {
        return TSO;
    }

    /**
     * @param TSO the TSO to set
     */
    public void setTSO(Float TSO) {
        this.TSO = TSO;
    }

    /**
     * @return the CSO
     */
    public Integer getCSO() {
        return CSO;
    }

    /**
     * @param CSO the CSO to set
     */
    public void setCSO(Integer CSO) {
        this.CSO = CSO;
    }

    /**
     * @return the lastRpDate
     */
    public Date getLastRpDate() {
        return lastRpDate;
    }

    /**
     * @param lastRpDate the lastRpDate to set
     */
    public void setLastRpDate(Date lastRpDate) {
        this.lastRpDate = lastRpDate;
    }

    /**
     * @return the lastRpUnit
     */
    public String getLastRpUnit() {
        return lastRpUnit;
    }

    /**
     * @param lastRpUnit the lastRpUnit to set
     */
    public void setLastRpUnit(String lastRpUnit) {
        this.lastRpUnit = lastRpUnit;
    }

    /**
     * @return the installDate
     */
    public Date getInstallDate() {
        return installDate;
    }

    /**
     * @param installDate the installDate to set
     */
    public void setInstallDate(Date installDate) {
        this.installDate = installDate;
    }

    /**
     * @return the installANO
     */
    public String getInstallANO() {
        return installANO;
    }

    /**
     * @param installANO the installANO to set
     */
    public void setInstallANO(String installANO) {
        this.installANO = installANO;
    }

    /**
     * @return the installFH
     */
    public int getInstallFH() {
        return installFH;
    }

    /**
     * @param installFH the installFH to set
     */
    public void setInstallFH(int installFH) {
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
     * @return the tearDownDate
     */
    public Date getTearDownDate() {
        return tearDownDate;
    }

    /**
     * @param tearDownDate the tearDownDate to set
     */
    public void setTearDownDate(Date tearDownDate) {
        this.tearDownDate = tearDownDate;
    }

    /**
     * @return the tearDownAno
     */
    public String getTearDownAno() {
        return tearDownAno;
    }

    /**
     * @param tearDownAno the tearDownAno to set
     */
    public void setTearDownAno(String tearDownAno) {
        this.tearDownAno = tearDownAno;
    }

    /**
     * @return the tearDownCause
     */
    public String getTearDownCause() {
        return tearDownCause;
    }

    /**
     * @param tearDownCause the tearDownCause to set
     */
    public void setTearDownCause(String tearDownCause) {
        this.tearDownCause = tearDownCause;
    }

    /**
     * @return the apuStatus
     */
    public String getApuStatus() {
        return apuStatus;
    }

    /**
     * @param apuStatus the apuStatus to set
     */
    public void setApuStatus(String apuStatus) {
        this.apuStatus = apuStatus;
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

    /**
     * @return the repairDate
     */
    public Date getRepairDate() {
        return repairDate;
    }

    /**
     * @param repairDate the repairDate to set
     */
    public void setRepairDate(Date repairDate) {
        this.repairDate = repairDate;
    }

    /**
     * @return the repairUnit
     */
    public String getRepairUnit() {
        return repairUnit;
    }

    /**
     * @param repairUnit the repairUnit to set
     */
    public void setRepairUnit(String repairUnit) {
        this.repairUnit = repairUnit;
    }

    /**
     * @return the optType
     */
    public String getOptType() {
        return optType;
    }

    /**
     * @param optType the optType to set
     */
    public void setOptType(String optType) {
        this.optType = optType;
    }
    
}
