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
 * The Entity to representing LandingGearStatus record. The physical table is "LANDING_GEAR_STATUS_RECORD"
 * @author jaly
 */
@Entity
@Table(name = "LANDING_GEAR_STATUS_RECORD")
public class LandingGearStatusRec implements Serializable{

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    
    @Column(name = "TSN")
    private String tsn;
    
    @Column(name = "CSN")
    private String csn;
    
    @Column(name = "TSO")
    private String tso;
    
    @Column(name = "CSO")
    private String cso;
    
    @Column(name = "LAST_RP_DATE")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date lastRpDate;
    
    @Column(name = "LAST_RP_UNIT")
    private String lastRpUnit;
    
    @Column(name = "INSTALL_DATE")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date installDate;
    
    @Column(name = "INSTALL_ANO")
    private String installAno;
    
    @Column(name = "INSTALL_POSITION")
    private String installPosition;
    
    @Column(name = "INSTALL_FH")
    private int installFH;
    
    @Column(name = "INSTALL_FC")
    private int installFC;
    
    @Column(name = "TIME_LIMIT")
    private String timeLimit;
    
    @Column(name = "REMAIN_TIME")
    private String remainTime;
    
    @Column(name = "DOC_TYPE")
    private String docType;
    
    @Column(name = "TEARDOWN_DATE")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date tearDownDate;
    
    @Column(name = "TEARDOWN_ANO")
    private String tearDownAno;
    
    @Column(name = "TEARDOWM_PIS")
    private String tearDownPis;
    
    @Column(name = "TEARDOWN_CAUSE")
    private String tearDownCause;
    
    @Column(name = "LANDING_GEAR_STATUS")
    private String landingGearStatus;
    
    @Column(name = "REMARK")
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
    @JoinColumn(name = "LANDING_GEAR_ID")
	private LandingGear landingGear;
    /** Constructor block list */
    public LandingGearStatusRec(){
    	
    }
    @UseBuilderGenerator
    public LandingGearStatusRec(@Mandatory String tsn, @Mandatory  String csn, String tso, String cso, Date lastRpDate, String lastRpUnit,
			Date installDate, String installAno, String installPosition, int installFH, int installFC, String timeLimit,
			String remainTime, String docType, Date tearDownDate, String tearDownAno, String tearDownPis,
			String tearDownCause, String landingGearStatus, String remark, Date recordDate, Date repairDate,
			String repairUnit, String optType, @Mandatory  LandingGear landingGear) {
		super();
		this.tsn = tsn;
		this.csn = csn;
		this.tso = tso;
		this.cso = cso;
		this.lastRpDate = lastRpDate;
		this.lastRpUnit = lastRpUnit;
		this.installDate = installDate;
		this.installAno = installAno;
		this.installPosition = installPosition;
		this.installFH = installFH;
		this.installFC = installFC;
		this.timeLimit = timeLimit;
		this.remainTime = remainTime;
		this.docType = docType;
		this.tearDownDate = tearDownDate;
		this.tearDownAno = tearDownAno;
		this.tearDownPis = tearDownPis;
		this.tearDownCause = tearDownCause;
		this.landingGearStatus = landingGearStatus;
		this.remark = remark;
		this.recordDate = recordDate;
		this.repairDate = repairDate;
		this.repairUnit = repairUnit;
		this.optType = optType;
		this.landingGear = landingGear;
	}

	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder("LandingGearStatusRec[ ID=");
        sb.append(this.getId())
                .append(", TSN＝").append(this.getTsn())
                .append(", CSN＝").append(this.getCsn())
                .append(", TSO＝").append(this.getTso())
                .append(", CSO＝").append(this.getCso())
                .append(", LAST_RP_DATE＝").append(this.getLastRpDate())
                .append(", LAST_RP_UNIT＝").append(this.getLastRpUnit())
                .append(", INSTALL_DATE＝").append(this.getInstallDate())
                .append(", INSTALL_ANO＝").append(this.getInstallAno())
                .append(", INSTALL_POSITION＝").append(this.getInstallPosition())
                .append(", INSTALL_FH＝").append(this.getInstallFH())
                .append(", INSTALL_FC＝").append(this.getInstallFC())
                .append(", TIME_LIMIT=").append(this.getTimeLimit())
                .append(", REMAIN_TIME=").append(this.getRemainTime())
                .append(", DOC_TYPE=").append(this.getDocType())
                .append(", TEARDOWN_DATE=").append(this.getTearDownDate())
                .append(", TEARDOWN_ANO=").append(this.getTearDownAno())
                .append(", TEARDOWM_PIS=").append(this.getTearDownPis())
                .append(", TEARDOWN_CAUSE=").append(this.getTearDownCause())
                .append(", LANDING_GEAR_STATUS=").append(this.getLandingGearStatus())
                .append(", REMARK=").append(this.getRemark())
                .append(", RECORD_DATE=").append(this.getRecordDate())
                .append(", REPAIR_DATE=").append(this.getRepairDate())
                .append(", REPAIR_UNIT=").append(this.getRepairUnit())
                .append(", OPT_TYPE=").append(this.getOptType())
                .append(" ]");
        return sb.toString();
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
    public String getTsn() {
        return tsn;
    }

    /**
     * @param tsn the tsn to set
     */
    public void setTsn(String tsn) {
        this.tsn = tsn;
    }

    /**
     * @return the csn
     */
    public String getCsn() {
        return csn;
    }

    /**
     * @param csn the csn to set
     */
    public void setCsn(String csn) {
        this.csn = csn;
    }

    /**
     * @return the tso
     */
    public String getTso() {
        return tso;
    }

    /**
     * @param tso the tso to set
     */
    public void setTso(String tso) {
        this.tso = tso;
    }

    /**
     * @return the cso
     */
    public String getCso() {
        return cso;
    }

    /**
     * @param cso the cso to set
     */
    public void setCso(String cso) {
        this.cso = cso;
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
     * @return the installAno
     */
    public String getInstallAno() {
        return installAno;
    }

    /**
     * @param installAno the installAno to set
     */
    public void setInstallAno(String installAno) {
        this.installAno = installAno;
    }

    /**
     * @return the installPosition
     */
    public String getInstallPosition() {
        return installPosition;
    }

    /**
     * @param installPosition the installPosition to set
     */
    public void setInstallPosition(String installPosition) {
        this.installPosition = installPosition;
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
     * @return the timeLimit
     */
    public String getTimeLimit() {
        return timeLimit;
    }

    /**
     * @param timeLimit the timeLimit to set
     */
    public void setTimeLimit(String timeLimit) {
        this.timeLimit = timeLimit;
    }

    /**
     * @return the remainTime
     */
    public String getRemainTime() {
        return remainTime;
    }

    /**
     * @param remainTime the remainTime to set
     */
    public void setRemainTime(String remainTime) {
        this.remainTime = remainTime;
    }

    /**
     * @return the docType
     */
    public String getDocType() {
        return docType;
    }

    /**
     * @param docType the docType to set
     */
    public void setDocType(String docType) {
        this.docType = docType;
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
     * @return the tearDownPis
     */
    public String getTearDownPis() {
        return tearDownPis;
    }

    /**
     * @param tearDownPis the tearDownPis to set
     */
    public void setTearDownPis(String tearDownPis) {
        this.tearDownPis = tearDownPis;
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
     * @return the landingGearStatus
     */
    public String getLandingGearStatus() {
        return landingGearStatus;
    }

    /**
     * @param landingGearStatus the landingGearStatus to set
     */
    public void setLandingGearStatus(String landingGearStatus) {
        this.landingGearStatus = landingGearStatus;
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
