package com.aedms.core.entities.source;

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

@Entity
@Table(name = "ENGINE_OPR_REC")
public class EngineOprRec {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private long id;

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

	@Column(name = "REMAIN_FH")
	private Double remainHrs;

	@Column(name = "REMAIN_FC")
	private Integer remainCirs;

	@Column(name = "RECORD_DATE")
	@Temporal(javax.persistence.TemporalType.DATE)
	private Date recordDate;

	@ManyToOne
    @JoinColumn(name="ENGINE_ID", nullable=false)
	private Engine engine;
	
	
	@Override
	public String toString() {
		return "EngineOprRec [id=" + id + ", TSN=" + TSN + ", CSN=" + CSN + ", TSO=" + TSO + ", CSO=" + CSO
				+ ", hrsPostInst=" + hrsPostInst + ", cirsPostInst=" + cirsPostInst + ", remainHrs=" + remainHrs
				+ ", remainCirs=" + remainCirs + ", recordDate=" + recordDate + "]";
	}

	/**
	 * Auto Generate Set/Get
	 */
	
	public long getId() {
		return id;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Integer getCSO() {
		return CSO;
	}

	public void setCSO(Integer cSO) {
		CSO = cSO;
	}

	public void setId(long id) {
		this.id = id;
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

	public Double getRemainHrs() {
		return remainHrs;
	}

	public void setRemainHrs(Double remainHrs) {
		this.remainHrs = remainHrs;
	}

	public Integer getRemainCirs() {
		return remainCirs;
	}

	public void setRemainCirs(Integer remainCirs) {
		this.remainCirs = remainCirs;
	}

	public Date getRecordDate() {
		return recordDate;
	}

	public void setRecordDate(Date recordDate) {
		this.recordDate = recordDate;
	}

}
