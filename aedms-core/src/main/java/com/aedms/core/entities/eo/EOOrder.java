package com.aedms.core.entities.eo;

import com.aedms.core.entities.AedmsEntity;
import com.aedms.core.entities.enums.EOActionType;
import com.aedms.core.entities.enums.EOClass;
import com.aedms.core.entities.enums.EOStatus;
import com.aedms.core.entities.enums.EOType;
import fr.lteconsulting.Mandatory;
import fr.lteconsulting.UseBuilderGenerator;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "EO_ORDER")
public class EOOrder extends AedmsEntity {
    
    private static final long serialVersionUID = 1L;

    @Column(name = "EO_NO", length = 50)
    private String eoNumber;

    @Column(name = "EO_TYPE", length = 2)
    private EOType eoType;

    @Column(name = "EO_CLASS", length = 10)
    private EOClass eoClass;

    @Column(name = "SUBJECT", length = 100)
    private String subject;

    @Column(name = "DESCRIPTION", length = 4000)
    private String description;

    @Column(name = "ISSUE_DATE")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date issueDate;

    @Column(name = "ACTION_TYPE", length = 10)
    private EOActionType actionType;

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
    /*
     * 受影响飞机机型，各个部件类型
     * （受影响的飞机的各种型号信息，大文本）
     */
    @Column(name = "AC_MODEL_AF", length = 4000)
    private String acModelAffected;

    @Column(name = "APU_MODEL_AF", length = 400)
    private String apuModelAffected;

    @Column(name = "LD_MODEL_AF", length = 400)
    private String ldModelAffected;

    @Column(name = "EG_MODEL_AF", length = 400)
    private String engineModelAffected;
    // @Block of affected components end

    // Block of 重检 start.
    // Whether this EO need re-inspection.
    @Column(name = "IS_RE_INSPECTION")
    private Boolean isReInspection;

    @Column(name = "FNL_LMT_DESCR", length = 4000)
    private String finalLimitDescr;

    @Column(name = "FINAL_LMT", nullable = true)
    @OneToOne(optional = false, fetch = FetchType.LAZY, mappedBy = "eoder")
    private TimeLimit finalLimit;

    @Column(name = "INTERV_LMT", nullable = true)
    @OneToOne(optional = false, fetch = FetchType.LAZY, mappedBy = "eoder")
    private TimeLimit intervalLimit;

    @Column(name = "INIT_LMT", nullable = true)
    @OneToOne(optional = false, fetch = FetchType.LAZY, mappedBy = "eoder")
    private TimeLimit initialLimit;

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
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "eoder")
    private Set<EOAffectedPub> eoAffectedPubs;

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
    private EOStatus eoStatus;

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

    // Link to AD	
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "EO_ORDER_AD")
    private Set<AirworthDirective> airworthDirectives;
    
    // Link to EO_Rev
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "eoder")
    @JoinColumn(name = "EO_ORDER_ID")
    private Set<EORev> eoRevS;

    public EOOrder() {
    }

    @UseBuilderGenerator
    public EOOrder(@Mandatory TimeLimit finalLimit, @Mandatory TimeLimit intervalLimit, 
            @Mandatory TimeLimit initialLimit, @Mandatory String eoNumber) {
        super();
        this.eoNumber = eoNumber;
        this.finalLimit = finalLimit;
        this.intervalLimit = intervalLimit;
        this.initialLimit = initialLimit;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        return sb.toString();
    }

    /**
     * @return the eoNumber
     */
    public String getEoNumber() {
        return eoNumber;
    }

    /**
     * @param eoNumber the eoNumber to set
     */
    public void setEoNumber(String eoNumber) {
        this.eoNumber = eoNumber;
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
     * @return the eoClass
     */
    public EOClass getEoClass() {
        return eoClass;
    }

    /**
     * @param eoClass the eoClass to set
     */
    public void setEoClass(EOClass eoClass) {
        this.eoClass = eoClass;
    }

    /**
     * @return the subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @param subject the subject to set
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the issueDate
     */
    public Date getIssueDate() {
        return issueDate;
    }

    /**
     * @param issueDate the issueDate to set
     */
    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    /**
     * @return the actionType
     */
    public EOActionType getActionType() {
        return actionType;
    }

    /**
     * @param actionType the actionType to set
     */
    public void setActionType(EOActionType actionType) {
        this.actionType = actionType;
    }

    /**
     * @return the ata
     */
    public String getAta() {
        return ata;
    }

    /**
     * @param ata the ata to set
     */
    public void setAta(String ata) {
        this.ata = ata;
    }

    /**
     * @return the stc
     */
    public String getStc() {
        return stc;
    }

    /**
     * @param stc the stc to set
     */
    public void setStc(String stc) {
        this.stc = stc;
    }

    /**
     * @return the mda
     */
    public String getMda() {
        return mda;
    }

    /**
     * @param mda the mda to set
     */
    public void setMda(String mda) {
        this.mda = mda;
    }

    /**
     * @return the acModelAffected
     */
    public String getAcModelAffected() {
        return acModelAffected;
    }

    /**
     * @param acModelAffected the acModelAffected to set
     */
    public void setAcModelAffected(String acModelAffected) {
        this.acModelAffected = acModelAffected;
    }

    /**
     * @return the apuModelAffected
     */
    public String getApuModelAffected() {
        return apuModelAffected;
    }

    /**
     * @param apuModelAffected the apuModelAffected to set
     */
    public void setApuModelAffected(String apuModelAffected) {
        this.apuModelAffected = apuModelAffected;
    }

    /**
     * @return the ldModelAffected
     */
    public String getLdModelAffected() {
        return ldModelAffected;
    }

    /**
     * @param ldModelAffected the ldModelAffected to set
     */
    public void setLdModelAffected(String ldModelAffected) {
        this.ldModelAffected = ldModelAffected;
    }

    /**
     * @return the engineModelAffected
     */
    public String getEngineModelAffected() {
        return engineModelAffected;
    }

    /**
     * @param engineModelAffected the engineModelAffected to set
     */
    public void setEngineModelAffected(String engineModelAffected) {
        this.engineModelAffected = engineModelAffected;
    }

    /**
     * @return the isReInspection
     */
    public Boolean getIsReInspection() {
        return isReInspection;
    }

    /**
     * @param isReInspection the isReInspection to set
     */
    public void setIsReInspection(Boolean isReInspection) {
        this.isReInspection = isReInspection;
    }

    /**
     * @return the finalLimitDescr
     */
    public String getFinalLimitDescr() {
        return finalLimitDescr;
    }

    /**
     * @param finalLimitDescr the finalLimitDescr to set
     */
    public void setFinalLimitDescr(String finalLimitDescr) {
        this.finalLimitDescr = finalLimitDescr;
    }

    /**
     * @return the finalLimit
     */
    public TimeLimit getFinalLimit() {
        return finalLimit;
    }

    /**
     * @param finalLimit the finalLimit to set
     */
    public void setFinalLimit(TimeLimit finalLimit) {
        this.finalLimit = finalLimit;
    }

    /**
     * @return the intervalLimit
     */
    public TimeLimit getIntervalLimit() {
        return intervalLimit;
    }

    /**
     * @param intervalLimit the intervalLimit to set
     */
    public void setIntervalLimit(TimeLimit intervalLimit) {
        this.intervalLimit = intervalLimit;
    }

    /**
     * @return the initialLimit
     */
    public TimeLimit getInitialLimit() {
        return initialLimit;
    }

    /**
     * @param initialLimit the initialLimit to set
     */
    public void setInitialLimit(TimeLimit initialLimit) {
        this.initialLimit = initialLimit;
    }

    /**
     * @return the initialLimitDescr
     */
    public String getInitialLimitDescr() {
        return initialLimitDescr;
    }

    /**
     * @param initialLimitDescr the initialLimitDescr to set
     */
    public void setInitialLimitDescr(String initialLimitDescr) {
        this.initialLimitDescr = initialLimitDescr;
    }

    /**
     * @return the timeIntervalDescr
     */
    public String getTimeIntervalDescr() {
        return timeIntervalDescr;
    }

    /**
     * @param timeIntervalDescr the timeIntervalDescr to set
     */
    public void setTimeIntervalDescr(String timeIntervalDescr) {
        this.timeIntervalDescr = timeIntervalDescr;
    }

    /**
     * @return the isWTORBLAffected
     */
    public Boolean getIsWTORBLAffected() {
        return isWTORBLAffected;
    }

    /**
     * @param isWTORBLAffected the isWTORBLAffected to set
     */
    public void setIsWTORBLAffected(Boolean isWTORBLAffected) {
        this.isWTORBLAffected = isWTORBLAffected;
    }

    /**
     * @return the isELDAffected
     */
    public Boolean getIsELDAffected() {
        return isELDAffected;
    }

    /**
     * @param isELDAffected the isELDAffected to set
     */
    public void setIsELDAffected(Boolean isELDAffected) {
        this.isELDAffected = isELDAffected;
    }

    /**
     * @return the isPubAffected
     */
    public Boolean getIsPubAffected() {
        return isPubAffected;
    }

    /**
     * @param isPubAffected the isPubAffected to set
     */
    public void setIsPubAffected(Boolean isPubAffected) {
        this.isPubAffected = isPubAffected;
    }

    /**
     * @return the eoAffectedPubs
     */
    public Set<EOAffectedPub> getEoAffectedPubs() {
        return eoAffectedPubs;
    }

    /**
     * @param eoAffectedPubs the eoAffectedPubs to set
     */
    public void setEoAffectedPubs(Set<EOAffectedPub> eoAffectedPubs) {
        this.eoAffectedPubs = eoAffectedPubs;
    }

    /**
     * @return the isSftwareAffected
     */
    public Boolean getIsSftwareAffected() {
        return isSftwareAffected;
    }

    /**
     * @param isSftwareAffected the isSftwareAffected to set
     */
    public void setIsSftwareAffected(Boolean isSftwareAffected) {
        this.isSftwareAffected = isSftwareAffected;
    }

    /**
     * @return the specificFeedback
     */
    public String getSpecificFeedback() {
        return specificFeedback;
    }

    /**
     * @param specificFeedback the specificFeedback to set
     */
    public void setSpecificFeedback(String specificFeedback) {
        this.specificFeedback = specificFeedback;
    }

    /**
     * @return the addressOfFeedback
     */
    public String getAddressOfFeedback() {
        return addressOfFeedback;
    }

    /**
     * @param addressOfFeedback the addressOfFeedback to set
     */
    public void setAddressOfFeedback(String addressOfFeedback) {
        this.addressOfFeedback = addressOfFeedback;
    }

    /**
     * @return the emailOfFeedback
     */
    public String getEmailOfFeedback() {
        return emailOfFeedback;
    }

    /**
     * @param emailOfFeedback the emailOfFeedback to set
     */
    public void setEmailOfFeedback(String emailOfFeedback) {
        this.emailOfFeedback = emailOfFeedback;
    }

    /**
     * @return the faxOfFeedback
     */
    public String getFaxOfFeedback() {
        return faxOfFeedback;
    }

    /**
     * @param faxOfFeedback the faxOfFeedback to set
     */
    public void setFaxOfFeedback(String faxOfFeedback) {
        this.faxOfFeedback = faxOfFeedback;
    }

    /**
     * @return the complexity
     */
    public Integer getComplexity() {
        return complexity;
    }

    /**
     * @param complexity the complexity to set
     */
    public void setComplexity(Integer complexity) {
        this.complexity = complexity;
    }

    /**
     * @return the customer
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(String customer) {
        this.customer = customer;
    }

    /**
     * @return the isImpRefit
     */
    public Boolean getIsImpRefit() {
        return isImpRefit;
    }

    /**
     * @param isImpRefit the isImpRefit to set
     */
    public void setIsImpRefit(Boolean isImpRefit) {
        this.isImpRefit = isImpRefit;
    }

    /**
     * @return the isSTERequired
     */
    public Boolean getIsSTERequired() {
        return isSTERequired;
    }

    /**
     * @param isSTERequired the isSTERequired to set
     */
    public void setIsSTERequired(Boolean isSTERequired) {
        this.isSTERequired = isSTERequired;
    }

    /**
     * @return the isMONRequired
     */
    public Boolean getIsMONRequired() {
        return isMONRequired;
    }

    /**
     * @param isMONRequired the isMONRequired to set
     */
    public void setIsMONRequired(Boolean isMONRequired) {
        this.isMONRequired = isMONRequired;
    }

    /**
     * @return the revRecord
     */
    public String getRevRecord() {
        return revRecord;
    }

    /**
     * @param revRecord the revRecord to set
     */
    public void setRevRecord(String revRecord) {
        this.revRecord = revRecord;
    }

    /**
     * @return the revReason
     */
    public String getRevReason() {
        return revReason;
    }

    /**
     * @param revReason the revReason to set
     */
    public void setRevReason(String revReason) {
        this.revReason = revReason;
    }

    /**
     * @return the applDescription
     */
    public String getApplDescription() {
        return applDescription;
    }

    /**
     * @param applDescription the applDescription to set
     */
    public void setApplDescription(String applDescription) {
        this.applDescription = applDescription;
    }

    /**
     * @return the materialDescr
     */
    public String getMaterialDescr() {
        return materialDescr;
    }

    /**
     * @param materialDescr the materialDescr to set
     */
    public void setMaterialDescr(String materialDescr) {
        this.materialDescr = materialDescr;
    }

    /**
     * @return the eoStatus
     */
    public EOStatus getEoStatus() {
        return eoStatus;
    }

    /**
     * @param eoStatus the eoStatus to set
     */
    public void setEoStatus(EOStatus eoStatus) {
        this.eoStatus = eoStatus;
    }

    /**
     * @return the isClaimFH
     */
    public Boolean getIsClaimFH() {
        return isClaimFH;
    }

    /**
     * @param isClaimFH the isClaimFH to set
     */
    public void setIsClaimFH(Boolean isClaimFH) {
        this.isClaimFH = isClaimFH;
    }

    /**
     * @return the isClaimMAT
     */
    public Boolean getIsClaimMAT() {
        return isClaimMAT;
    }

    /**
     * @param isClaimMAT the isClaimMAT to set
     */
    public void setIsClaimMAT(Boolean isClaimMAT) {
        this.isClaimMAT = isClaimMAT;
    }

    /**
     * @return the isTechSupReq
     */
    public Boolean getIsTechSupReq() {
        return isTechSupReq;
    }

    /**
     * @param isTechSupReq the isTechSupReq to set
     */
    public void setIsTechSupReq(Boolean isTechSupReq) {
        this.isTechSupReq = isTechSupReq;
    }

    /**
     * @return the epReason
     */
    public String getEpReason() {
        return epReason;
    }

    /**
     * @param epReason the epReason to set
     */
    public void setEpReason(String epReason) {
        this.epReason = epReason;
    }

    /**
     * @return the isMatCostPredicate
     */
    public boolean isIsMatCostPredicate() {
        return isMatCostPredicate;
    }

    /**
     * @param isMatCostPredicate the isMatCostPredicate to set
     */
    public void setIsMatCostPredicate(boolean isMatCostPredicate) {
        this.isMatCostPredicate = isMatCostPredicate;
    }

    /**
     * @return the matCostPredicated
     */
    public Double getMatCostPredicated() {
        return matCostPredicated;
    }

    /**
     * @param matCostPredicated the matCostPredicated to set
     */
    public void setMatCostPredicated(Double matCostPredicated) {
        this.matCostPredicated = matCostPredicated;
    }

    /**
     * @return the matCostCurrency
     */
    public String getMatCostCurrency() {
        return matCostCurrency;
    }

    /**
     * @param matCostCurrency the matCostCurrency to set
     */
    public void setMatCostCurrency(String matCostCurrency) {
        this.matCostCurrency = matCostCurrency;
    }

    /**
     * @return the version
     */
    public String getVersion() {
        return version;
    }

    /**
     * @param version the version to set
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * @return the airworthDirectives
     */
    public Set<AirworthDirective> getAirworthDirectives() {
        return airworthDirectives;
    }

    /**
     * @param airworthDirectives the airworthDirectives to set
     */
    public void setAirworthDirectives(Set<AirworthDirective> airworthDirectives) {
        this.airworthDirectives = airworthDirectives;
    }

    /**
     * @return the eoRevS
     */
    public Set<EORev> getEoRevS() {
        return eoRevS;
    }

    /**
     * @param eoRevS the eoRevS to set
     */
    public void setEoRevS(Set<EORev> eoRevS) {
        this.eoRevS = eoRevS;
    }
}
