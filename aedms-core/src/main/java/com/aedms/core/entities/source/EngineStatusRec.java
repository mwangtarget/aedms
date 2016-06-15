package com.aedms.core.entities.source;

import com.aedms.core.entities.AedmsEntity;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

import fr.lteconsulting.Mandatory;
import fr.lteconsulting.UseBuilderGenerator;

@Entity
@Table(name = "ENGINE_STAT_REC")
public class EngineStatusRec extends AedmsEntity {
    
    private static final long serialVersionUID = 1L;

	@Column(name = "TSN")
	private Double TSN;

	@Column(name = "CSN")
	private Integer CSN;

	@Column(name = "TSO")
	private Double TSO;

	@Column(name = "CSO")
	private Integer CSO;
	
	@Column(name = "INSTALL_FH")
	private Double hrsPostInst;

	@Column(name = "INSTALL_FC")
	private Integer cirsPostInst;
	
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
	
	@Column(name="INSTALL_POS")
	private String installPos;
	
	@Column(name="TEARDOWN_DATE")
	@Temporal(javax.persistence.TemporalType.DATE)
	private Date tdDate;
    
	@Column(name="TEARDOWN_ANO")
	private String tdANO;
	
	@Column(name="TEARDOWN_PIS")
	private String tdPIS;
	
	@Column(name="TEARDDOWN_CAUSE")
	private String tdCause;
	
	@Column(name="ENGINE_STAT")
	private String engineStat;
	
	@Column(name="REP_DATE")
	@Temporal(javax.persistence.TemporalType.DATE)
	private Date repDate;
	
	@Column(name="REP_UNIT")
	private String repUnit;
	
	@Column(name="REC_DATE")
	@Temporal(javax.persistence.TemporalType.DATE)
	private Date recDate;
	
	@Column(name="REMARK")
	private String remark;
	
	@ManyToOne
    @JoinColumn(name="ENGINE_ID", nullable=false)
	private Engine engine;

	/** Constructor List block*/
	public EngineStatusRec(){
		
	}
	
	@UseBuilderGenerator
	public EngineStatusRec(@Mandatory Double tSN, @Mandatory Integer cSN, @Mandatory Double tSO, Integer cSO, Double hrsPostInst, Integer cirsPostInst,
			Date lastRpDate, String lastRpUnit, Date installDate, String installANO, String installPos, Date tdDate,
			String tdANO, String tdPIS, String tdCause, String engineStat, Date repDate, String repUnit, Date recDate,
			String remark, @Mandatory Engine engine) {
		super();
		TSN = tSN;
		CSN = cSN;
		TSO = tSO;
		CSO = cSO;
		this.hrsPostInst = hrsPostInst;
		this.cirsPostInst = cirsPostInst;
		this.lastRpDate = lastRpDate;
		this.lastRpUnit = lastRpUnit;
		this.installDate = installDate;
		this.installANO = installANO;
		this.installPos = installPos;
		this.tdDate = tdDate;
		this.tdANO = tdANO;
		this.tdPIS = tdPIS;
		this.tdCause = tdCause;
		this.engineStat = engineStat;
		this.repDate = repDate;
		this.repUnit = repUnit;
		this.recDate = recDate;
		this.remark = remark;
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "EngineStatRec [id=" + this.getId() + ", TSN=" + TSN + ", CSN=" + CSN + ", TSO=" + TSO + ", CSO=" + CSO
				+ ", hrsPostInst=" + hrsPostInst + ", cirsPostInst=" + cirsPostInst + ", lastRpDate=" + lastRpDate
				+ ", lastRpUnit=" + lastRpUnit + ", installDate=" + installDate + ", installANO=" + installANO
				+ ", installPos=" + installPos + ", tdDate=" + tdDate + ", tdANO=" + tdANO + ", tdPIS=" + tdPIS
				+ ", tdCause=" + tdCause + ", engineStat=" + engineStat + ", repDate=" + repDate + ", repUnit="
				+ repUnit + ", recDate=" + recDate + ", remark=" + remark + "]";
	}
	

	public Engine getEngine() {
		return engine;
	}


	public void setEngine(Engine engine) {
		this.engine = engine;
	}


	public Double getTSN() {
		return TSN;
	}

	public void setTSN(Double tSN) {
		TSN = tSN;
	}

	public Integer getCSN() {
		return CSN;
	}

	public void setCSN(Integer cSN) {
		CSN = cSN;
	}

	public Double getTSO() {
		return TSO;
	}

	public void setTSO(Double tSO) {
		TSO = tSO;
	}

	public Integer getCSO() {
		return CSO;
	}

	public void setCSO(Integer cSO) {
		CSO = cSO;
	}

	public Double getHrsPostInst() {
		return hrsPostInst;
	}

	public void setHrsPostInst(Double hrsPostInst) {
		this.hrsPostInst = hrsPostInst;
	}

	public Integer getCirsPostInst() {
		return cirsPostInst;
	}

	public void setCirsPostInst(Integer cirsPostInst) {
		this.cirsPostInst = cirsPostInst;
	}

	public Date getLastRpDate() {
		return lastRpDate;
	}

	public void setLastRpDate(Date lastRpDate) {
		this.lastRpDate = lastRpDate;
	}

	public String getLastRpUnit() {
		return lastRpUnit;
	}

	public void setLastRpUnit(String lastRpUnit) {
		this.lastRpUnit = lastRpUnit;
	}

	public Date getInstallDate() {
		return installDate;
	}

	public void setInstallDate(Date installDate) {
		this.installDate = installDate;
	}

	public String getInstallANO() {
		return installANO;
	}

	public void setInstallANO(String installANO) {
		this.installANO = installANO;
	}

	public String getInstallPos() {
		return installPos;
	}

	public void setInstallPos(String installPos) {
		this.installPos = installPos;
	}

	public Date getTdDate() {
		return tdDate;
	}

	public void setTdDate(Date tdDate) {
		this.tdDate = tdDate;
	}

	public String getTdANO() {
		return tdANO;
	}

	public void setTdANO(String tdANO) {
		this.tdANO = tdANO;
	}

	public String getTdPIS() {
		return tdPIS;
	}

	public void setTdPIS(String tdPIS) {
		this.tdPIS = tdPIS;
	}

	public String getTdCause() {
		return tdCause;
	}

	public void setTdCause(String tdCause) {
		this.tdCause = tdCause;
	}

	public String getEngineStat() {
		return engineStat;
	}

	public void setEngineStat(String engineStat) {
		this.engineStat = engineStat;
	}

	public Date getRepDate() {
		return repDate;
	}

	public void setRepDate(Date repDate) {
		this.repDate = repDate;
	}

	public String getRepUnit() {
		return repUnit;
	}

	public void setRepUnit(String repUnit) {
		this.repUnit = repUnit;
	}

	public Date getRecDate() {
		return recDate;
	}

	public void setRecDate(Date recDate) {
		this.recDate = recDate;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}
