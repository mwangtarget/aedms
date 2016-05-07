package com.aedms.core.entities.eo;

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

import com.aedms.core.entities.source.EngineOprRec;

@Entity
@Table(name = "EO_ORDER")
public class EOOrder implements Serializable {

	private static final long serialVersionUID = 1L;

	// Block of basic information start
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private long id;

	@Column(name = "EO_NO", length = 50)
	private String eoNumber;

	@Column(name = "EO_TYPE", length = 2)
	private String eoType;

	@Column(name = "EO_CLASS", length = 10)
	private String eoClass;

	@Column(name = "EO_SUBJECT", length = 100)
	private String eoSubject;
	@Column(name = "EO_DESCR", length = 4000)
	private String description;

	@Column(name = "ISSUE_DATE")
	@Temporal(javax.persistence.TemporalType.DATE)
	private Date issueDate;

	@Column(name = "ACTION_TYPE", length = 10)
	private String actionType;

	// @Block of basic information end

	// Block of EO origination start

	// map to paragraph this EO related.
	@Column(name = "ATA", length = 10)
	private String ata;
	// 补充型号合格证
	@Column(name = "STC", length = 45)
	private String stc;

	// 改装设计批准书
	@Column(name = "MDA", length = 45)
	private String mda;
	// @ Block of EO origination end.

	// Block of affected components start
	@Column(name = "AC_MODEL_AFF", length = 4000)
	private String acModelAffected;
	@Column(name = "APU_MODEL_AFF", length = 400)
	private String apuModelAffected;

	@Column(name = "LD_MODEL_AFF", length = 400)
	private String ldModelAffected;

	@Column(name = "EG_MODEL_AFF", length = 400)
	private String engineModelAffected;
	// @Block of affected components end

	// Block of 重检 start.
	// Whether this EO need re-inspection.
	@Column(name = "IS_RE_INSPEC")
	private Boolean isReInspec;
	@Column(name = "FNL_LMT_DESCR", length = 4000)
	private String finalLmtDescr;
	@Column(name = "FINAL_LMT")
	private Integer finalLimit;

	@Column(name = "INTERV_LMT")
	private Integer intervalLimit;

	@Column(name = "INIT_LMT")
	private Integer initialLimit;

	@Column(name = "INIT_LMT_DESCR", length = 4000)
	private String initialLimitDescr;

	// 重检间隔文本说明
	@Column(name = "TIME_INTERV_DESCR", length = 4000)
	private String timeIntervalDescr;

	// @ Block of 重检 end.

	// Block of affected variables because of EO start
	@Column(name = "IS_WTORBL_AF")
	private Boolean isWTORBLAffected;

	@Column(name = "IS_ELD_AF")
	private Boolean isELDAffected;

	@Column(name = "IS_PUB_AF")
	private Boolean isPubAffected;
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="eoder")
    private Set<EOAffectedPub>   eoAffectedPubs; 
	 
	 
	@Column(name = "IS_SFT_AFF")
	private Boolean isSftwareAffected;
	// @Block of affected variables because of EO end

	// Block of EO feedback start.

	@Column(name = "SP_FDBACK", length = 4000)
	private String specificFeedback;

	@Column(name = "ADD_OF_FDBACK", length = 2000)
	private String addressOfFeedback;

	@Column(name = "EMAIL_OF_FDBACK", length = 100)
	private String emailOfFeedback;

	@Column(name = "FAX_OF_FDBACK", length = 100)
	private String faxOfFeedback;

	@Column(name = "COMPLEXITY")
	private Integer complexity;

	// @Block of EO feedback end.

	// The customer of AEDMS
	@Column(name = "CUSTOMER", length = 20)
	private String customer;

	// Whether this EO is a important refit.
	@Column(name = "IS_IMP_REFIT")
	private Boolean isImpRefit;

	@Column(name = "IS_STE_RE")
	private Boolean isSTERequired;

	@Column(name = "IS_MON_RE")
	private Boolean isMONRequired;

	@Column(name = "REV_REC", length = 4000)
	private String revRecord;

	@Column(name = "REV_REASON", length = 4000)
	private String revReason;

	@Column(name = "APPL_DESCR", length = 4000)
	private String applDescription;

	@Column(name = "MATR_DESCR", length = 4000)
	private String materialDescr;

	@Column(name = "EO_STATUS", length = 2)
	private String eoStatus;

	@Column(name = "IS_CLAIM_FH")
	private Boolean isClaimFH;

	@Column(name = "IS_CLAIM_MAT")
	private Boolean isClaimMAT;

	@Column(name = "IS_TECH_SUP_REQ")
	private Boolean isTechSupReq;

	// 停场原因
	@Column(name = "EP_REASON", length = 1000)
	private String epReason;

	@Column(name = "IS_MATR_CT_PREDI")
	private boolean isMatCostPredicate;

	@Column(name = "MATR_CT_PREDI")
	private Double matCostPredicated;

	@Column(name = "MATR_CT_CURR", length = 3)
	private String matCostCurrency;

	@Column(name = "VERSION", length = 2)
	private String version;

	
}
