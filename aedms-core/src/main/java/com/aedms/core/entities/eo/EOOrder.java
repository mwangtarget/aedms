package com.aedms.core.entities.eo;

import java.io.Serializable;
import java.util.Date;

import java.util.Map;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

import org.joda.beans.Bean;
import org.joda.beans.BeanBuilder;
import org.joda.beans.BeanDefinition;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.Property;
import org.joda.beans.PropertyDefinition;
import org.joda.beans.impl.direct.DirectBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

import com.aedms.core.entities.source.Organization;

import fr.lteconsulting.Mandatory;
import fr.lteconsulting.UseBuilderGenerator;


@Entity
@Table(name = "EO_ORDER")
@BeanDefinition
public class EOOrder implements Serializable, Bean{

    private static final long serialVersionUID = 1L;

    // Block of basic information start
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    @PropertyDefinition
    private long id;

    @Column(name = "EO_NO", length = 50)
    @PropertyDefinition
    private String eoNumber;

    @Column(name = "EO_TYPE", length = 2)
    @PropertyDefinition
    private String eoType;

    @Column(name = "EO_CLASS", length = 10)
    @PropertyDefinition
    private String eoClass;

    @Column(name = "EO_SUBJECT", length = 100)
    @PropertyDefinition
    private String eoSubject;
    
    @Column(name = "EO_DESCR", length = 4000)
    @PropertyDefinition
    private String description;

    @Column(name = "ISSUE_DATE")
    @Temporal(javax.persistence.TemporalType.DATE)
    @PropertyDefinition
    private Date issueDate;

    @Column(name = "ACTION_TYPE", length = 10)
    @PropertyDefinition
    private String actionType;

    // @Block of basic information end

    // Block of EO origination start

    // map to paragraph this EO related.
    @Column(name = "ATA", length = 10)
    @PropertyDefinition
    private String ata;
    // 补充型号合格证
    @Column(name = "STC", length = 45)
    @PropertyDefinition
    private String stc;

    // 改装设计批准书
    @Column(name = "MDA", length = 45)
    @PropertyDefinition
    private String mda;
    // @ Block of EO origination end.

    // Block of affected components start
    @Column(name = "AC_MODEL_AFF", length = 4000)
    @PropertyDefinition
    private String acModelAffected;
    
    @Column(name = "APU_MODEL_AFF", length = 400)
    @PropertyDefinition
    private String apuModelAffected;

    @Column(name = "LD_MODEL_AFF", length = 400)
    @PropertyDefinition
    private String ldModelAffected;

    @Column(name = "EG_MODEL_AFF", length = 400)
    @PropertyDefinition
    private String engineModelAffected;
    // @Block of affected components end

    // Block of 重检 start.
    // Whether this EO need re-inspection.
    @Column(name = "IS_RE_INSPEC")
    @PropertyDefinition
    private Boolean isReInspec;
    
    @Column(name = "FNL_LMT_DESCR", length = 4000)
    @PropertyDefinition
    private String finalLmtDescr;
    

    @Column(name = "FINAL_LMT")
    @PropertyDefinition
    private Integer finalLimit;

    @Column(name = "INTERV_LMT")
    @PropertyDefinition
    private Integer intervalLimit;

    @Column(name = "INIT_LMT")
    @PropertyDefinition
    private Integer initialLimit;

    @Column(name = "INIT_LMT_DESCR", length = 4000)
    @PropertyDefinition
    private String initialLimitDescr;

    // 重检间隔文本说明
    @Column(name = "TIME_INTERV_DESCR", length = 4000)
    @PropertyDefinition
    private String timeIntervalDescr;

    // @ Block of 重检 end.

    // Block of affected variables because of EO start
    @Column(name = "IS_WTORBL_AF")
    @PropertyDefinition
    private Boolean isWTORBLAffected;

    @Column(name = "IS_ELD_AF")
    @PropertyDefinition
    private Boolean isELDAffected;

    @Column(name = "IS_PUB_AF")
    @PropertyDefinition
    private Boolean isPubAffected;
    
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="eoder")
    @PropertyDefinition
    private Set<EOAffectedPub> eoAffectedPubs; 
     
     
    @Column(name = "IS_SFT_AFF")
    @PropertyDefinition
    private Boolean isSftwareAffected;
    // @Block of affected variables because of EO end

    // Block of EO feedback start.

    @Column(name = "SP_FDBACK", length = 4000)
    @PropertyDefinition
    private String specificFeedback;

    @Column(name = "ADD_OF_FDBACK", length = 2000)
    @PropertyDefinition
    private String addressOfFeedback;

    @Column(name = "EMAIL_OF_FDBACK", length = 100)
    @PropertyDefinition
    private String emailOfFeedback;

    @Column(name = "FAX_OF_FDBACK", length = 100)
    @PropertyDefinition
    private String faxOfFeedback;

    @Column(name = "COMPLEXITY")
    @PropertyDefinition
    private Integer complexity;

    // @Block of EO feedback end.

    // The customer of AEDMS
    @Column(name = "CUSTOMER", length = 20)
    @PropertyDefinition
    private String customer;

    // Whether this EO is a important refit.
    @Column(name = "IS_IMP_REFIT")
    @PropertyDefinition
    private Boolean isImpRefit;

    @Column(name = "IS_STE_RE")
    @PropertyDefinition
    private Boolean isSTERequired;

    @Column(name = "IS_MON_RE")
    @PropertyDefinition
    private Boolean isMONRequired;

    @Column(name = "REV_REC", length = 4000)
    @PropertyDefinition
    private String revRecord;

    @Column(name = "REV_REASON", length = 4000)
    @PropertyDefinition
    private String revReason;

    @Column(name = "APPL_DESCR", length = 4000)
    @PropertyDefinition
    private String applDescription;

    @Column(name = "MATR_DESCR", length = 4000)
    @PropertyDefinition
    private String materialDescr;

    @Column(name = "EO_STATUS", length = 2)
    @PropertyDefinition
    private String eoStatus;

    @Column(name = "IS_CLAIM_FH")
    @PropertyDefinition
    private Boolean isClaimFH;

    @Column(name = "IS_CLAIM_MAT")
    @PropertyDefinition
    private Boolean isClaimMAT;

    @Column(name = "IS_TECH_SUP_REQ")
    @PropertyDefinition
    private Boolean isTechSupReq;

    // 停场原因
    @Column(name = "EP_REASON", length = 1000)
    @PropertyDefinition
    private String epReason;

    @Column(name = "IS_MATR_CT_PREDI")
    @PropertyDefinition
    private boolean isMatCostPredicate;

    @Column(name = "MATR_CT_PREDI")
    @PropertyDefinition
    private Double matCostPredicated;

    @Column(name = "MATR_CT_CURR", length = 3)
    @PropertyDefinition
    private String matCostCurrency;

    @Column(name = "VERSION", length = 2)
    @PropertyDefinition
    private String version;


    // Link to AD    
    @ManyToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinTable(name = "EOORDER_AD")
    @PropertyDefinition
    public Set<AirworthDirective> airworthDirectives;
    
    public EOOrder(){}
    
    @UseBuilderGenerator
    public EOOrder(@Mandatory String eoNumber, @Mandatory String eoType, @Mandatory Date issueDate) {
        super();
        this.eoNumber = eoNumber;
        this.eoType = eoType;
        this.issueDate = issueDate;
    }
    //------------------------- AUTOGENERATED START -------------------------
    ///CLOVER:OFF
    /**
     * The meta-bean for {@code EOOrder}.
     * @return the meta-bean, not null
     */
    public static EOOrder.Meta meta() {
        return EOOrder.Meta.INSTANCE;
    }

    static {
        JodaBeanUtils.registerMetaBean(EOOrder.Meta.INSTANCE);
    }

    @Override
    public EOOrder.Meta metaBean() {
        return EOOrder.Meta.INSTANCE;
    }

    @Override
    public <R> Property<R> property(String propertyName) {
        return metaBean().<R>metaProperty(propertyName).createProperty(this);
    }

    @Override
    public Set<String> propertyNames() {
        return metaBean().metaPropertyMap().keySet();
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the id.
     * @return the value of the property
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the id.
     * @param id  the new value of the property
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Gets the the {@code id} property.
     * @return the property, not null
     */
    public final Property<Long> id() {
        return metaBean().id().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the eoNumber.
     * @return the value of the property
     */
    public String getEoNumber() {
        return eoNumber;
    }

    /**
     * Sets the eoNumber.
     * @param eoNumber  the new value of the property
     */
    public void setEoNumber(String eoNumber) {
        this.eoNumber = eoNumber;
    }

    /**
     * Gets the the {@code eoNumber} property.
     * @return the property, not null
     */
    public final Property<String> eoNumber() {
        return metaBean().eoNumber().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the eoType.
     * @return the value of the property
     */
    public String getEoType() {
        return eoType;
    }

    /**
     * Sets the eoType.
     * @param eoType  the new value of the property
     */
    public void setEoType(String eoType) {
        this.eoType = eoType;
    }

    /**
     * Gets the the {@code eoType} property.
     * @return the property, not null
     */
    public final Property<String> eoType() {
        return metaBean().eoType().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the eoClass.
     * @return the value of the property
     */
    public String getEoClass() {
        return eoClass;
    }

    /**
     * Sets the eoClass.
     * @param eoClass  the new value of the property
     */
    public void setEoClass(String eoClass) {
        this.eoClass = eoClass;
    }

    /**
     * Gets the the {@code eoClass} property.
     * @return the property, not null
     */
    public final Property<String> eoClass() {
        return metaBean().eoClass().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the eoSubject.
     * @return the value of the property
     */
    public String getEoSubject() {
        return eoSubject;
    }

    /**
     * Sets the eoSubject.
     * @param eoSubject  the new value of the property
     */
    public void setEoSubject(String eoSubject) {
        this.eoSubject = eoSubject;
    }

    /**
     * Gets the the {@code eoSubject} property.
     * @return the property, not null
     */
    public final Property<String> eoSubject() {
        return metaBean().eoSubject().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the description.
     * @return the value of the property
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description.
     * @param description  the new value of the property
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets the the {@code description} property.
     * @return the property, not null
     */
    public final Property<String> description() {
        return metaBean().description().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the issueDate.
     * @return the value of the property
     */
    public Date getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the issueDate.
     * @param issueDate  the new value of the property
     */
    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    /**
     * Gets the the {@code issueDate} property.
     * @return the property, not null
     */
    public final Property<Date> issueDate() {
        return metaBean().issueDate().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the actionType.
     * @return the value of the property
     */
    public String getActionType() {
        return actionType;
    }

    /**
     * Sets the actionType.
     * @param actionType  the new value of the property
     */
    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    /**
     * Gets the the {@code actionType} property.
     * @return the property, not null
     */
    public final Property<String> actionType() {
        return metaBean().actionType().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the ata.
     * @return the value of the property
     */
    public String getAta() {
        return ata;
    }

    /**
     * Sets the ata.
     * @param ata  the new value of the property
     */
    public void setAta(String ata) {
        this.ata = ata;
    }

    /**
     * Gets the the {@code ata} property.
     * @return the property, not null
     */
    public final Property<String> ata() {
        return metaBean().ata().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the stc.
     * @return the value of the property
     */
    public String getStc() {
        return stc;
    }

    /**
     * Sets the stc.
     * @param stc  the new value of the property
     */
    public void setStc(String stc) {
        this.stc = stc;
    }

    /**
     * Gets the the {@code stc} property.
     * @return the property, not null
     */
    public final Property<String> stc() {
        return metaBean().stc().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the mda.
     * @return the value of the property
     */
    public String getMda() {
        return mda;
    }

    /**
     * Sets the mda.
     * @param mda  the new value of the property
     */
    public void setMda(String mda) {
        this.mda = mda;
    }

    /**
     * Gets the the {@code mda} property.
     * @return the property, not null
     */
    public final Property<String> mda() {
        return metaBean().mda().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the acModelAffected.
     * @return the value of the property
     */
    public String getAcModelAffected() {
        return acModelAffected;
    }

    /**
     * Sets the acModelAffected.
     * @param acModelAffected  the new value of the property
     */
    public void setAcModelAffected(String acModelAffected) {
        this.acModelAffected = acModelAffected;
    }

    /**
     * Gets the the {@code acModelAffected} property.
     * @return the property, not null
     */
    public final Property<String> acModelAffected() {
        return metaBean().acModelAffected().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the apuModelAffected.
     * @return the value of the property
     */
    public String getApuModelAffected() {
        return apuModelAffected;
    }

    /**
     * Sets the apuModelAffected.
     * @param apuModelAffected  the new value of the property
     */
    public void setApuModelAffected(String apuModelAffected) {
        this.apuModelAffected = apuModelAffected;
    }

    /**
     * Gets the the {@code apuModelAffected} property.
     * @return the property, not null
     */
    public final Property<String> apuModelAffected() {
        return metaBean().apuModelAffected().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the ldModelAffected.
     * @return the value of the property
     */
    public String getLdModelAffected() {
        return ldModelAffected;
    }

    /**
     * Sets the ldModelAffected.
     * @param ldModelAffected  the new value of the property
     */
    public void setLdModelAffected(String ldModelAffected) {
        this.ldModelAffected = ldModelAffected;
    }

    /**
     * Gets the the {@code ldModelAffected} property.
     * @return the property, not null
     */
    public final Property<String> ldModelAffected() {
        return metaBean().ldModelAffected().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the engineModelAffected.
     * @return the value of the property
     */
    public String getEngineModelAffected() {
        return engineModelAffected;
    }

    /**
     * Sets the engineModelAffected.
     * @param engineModelAffected  the new value of the property
     */
    public void setEngineModelAffected(String engineModelAffected) {
        this.engineModelAffected = engineModelAffected;
    }

    /**
     * Gets the the {@code engineModelAffected} property.
     * @return the property, not null
     */
    public final Property<String> engineModelAffected() {
        return metaBean().engineModelAffected().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the isReInspec.
     * @return the value of the property
     */
    public Boolean getIsReInspec() {
        return isReInspec;
    }

    /**
     * Sets the isReInspec.
     * @param isReInspec  the new value of the property
     */
    public void setIsReInspec(Boolean isReInspec) {
        this.isReInspec = isReInspec;
    }

    /**
     * Gets the the {@code isReInspec} property.
     * @return the property, not null
     */
    public final Property<Boolean> isReInspec() {
        return metaBean().isReInspec().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the finalLmtDescr.
     * @return the value of the property
     */
    public String getFinalLmtDescr() {
        return finalLmtDescr;
    }

    /**
     * Sets the finalLmtDescr.
     * @param finalLmtDescr  the new value of the property
     */
    public void setFinalLmtDescr(String finalLmtDescr) {
        this.finalLmtDescr = finalLmtDescr;
    }

    /**
     * Gets the the {@code finalLmtDescr} property.
     * @return the property, not null
     */
    public final Property<String> finalLmtDescr() {
        return metaBean().finalLmtDescr().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the finalLimit.
     * @return the value of the property
     */
    public Integer getFinalLimit() {
        return finalLimit;
    }

    /**
     * Sets the finalLimit.
     * @param finalLimit  the new value of the property
     */
    public void setFinalLimit(Integer finalLimit) {
        this.finalLimit = finalLimit;
    }

    /**
     * Gets the the {@code finalLimit} property.
     * @return the property, not null
     */
    public final Property<Integer> finalLimit() {
        return metaBean().finalLimit().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the intervalLimit.
     * @return the value of the property
     */
    public Integer getIntervalLimit() {
        return intervalLimit;
    }

    /**
     * Sets the intervalLimit.
     * @param intervalLimit  the new value of the property
     */
    public void setIntervalLimit(Integer intervalLimit) {
        this.intervalLimit = intervalLimit;
    }

    /**
     * Gets the the {@code intervalLimit} property.
     * @return the property, not null
     */
    public final Property<Integer> intervalLimit() {
        return metaBean().intervalLimit().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the initialLimit.
     * @return the value of the property
     */
    public Integer getInitialLimit() {
        return initialLimit;
    }

    /**
     * Sets the initialLimit.
     * @param initialLimit  the new value of the property
     */
    public void setInitialLimit(Integer initialLimit) {
        this.initialLimit = initialLimit;
    }

    /**
     * Gets the the {@code initialLimit} property.
     * @return the property, not null
     */
    public final Property<Integer> initialLimit() {
        return metaBean().initialLimit().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the initialLimitDescr.
     * @return the value of the property
     */
    public String getInitialLimitDescr() {
        return initialLimitDescr;
    }

    /**
     * Sets the initialLimitDescr.
     * @param initialLimitDescr  the new value of the property
     */
    public void setInitialLimitDescr(String initialLimitDescr) {
        this.initialLimitDescr = initialLimitDescr;
    }

    /**
     * Gets the the {@code initialLimitDescr} property.
     * @return the property, not null
     */
    public final Property<String> initialLimitDescr() {
        return metaBean().initialLimitDescr().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the timeIntervalDescr.
     * @return the value of the property
     */
    public String getTimeIntervalDescr() {
        return timeIntervalDescr;
    }

    /**
     * Sets the timeIntervalDescr.
     * @param timeIntervalDescr  the new value of the property
     */
    public void setTimeIntervalDescr(String timeIntervalDescr) {
        this.timeIntervalDescr = timeIntervalDescr;
    }

    /**
     * Gets the the {@code timeIntervalDescr} property.
     * @return the property, not null
     */
    public final Property<String> timeIntervalDescr() {
        return metaBean().timeIntervalDescr().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the isWTORBLAffected.
     * @return the value of the property
     */
    public Boolean getIsWTORBLAffected() {
        return isWTORBLAffected;
    }

    /**
     * Sets the isWTORBLAffected.
     * @param isWTORBLAffected  the new value of the property
     */
    public void setIsWTORBLAffected(Boolean isWTORBLAffected) {
        this.isWTORBLAffected = isWTORBLAffected;
    }

    /**
     * Gets the the {@code isWTORBLAffected} property.
     * @return the property, not null
     */
    public final Property<Boolean> isWTORBLAffected() {
        return metaBean().isWTORBLAffected().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the isELDAffected.
     * @return the value of the property
     */
    public Boolean getIsELDAffected() {
        return isELDAffected;
    }

    /**
     * Sets the isELDAffected.
     * @param isELDAffected  the new value of the property
     */
    public void setIsELDAffected(Boolean isELDAffected) {
        this.isELDAffected = isELDAffected;
    }

    /**
     * Gets the the {@code isELDAffected} property.
     * @return the property, not null
     */
    public final Property<Boolean> isELDAffected() {
        return metaBean().isELDAffected().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the isPubAffected.
     * @return the value of the property
     */
    public Boolean getIsPubAffected() {
        return isPubAffected;
    }

    /**
     * Sets the isPubAffected.
     * @param isPubAffected  the new value of the property
     */
    public void setIsPubAffected(Boolean isPubAffected) {
        this.isPubAffected = isPubAffected;
    }

    /**
     * Gets the the {@code isPubAffected} property.
     * @return the property, not null
     */
    public final Property<Boolean> isPubAffected() {
        return metaBean().isPubAffected().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the eoAffectedPubs.
     * @return the value of the property
     */
    public Set<EOAffectedPub> getEoAffectedPubs() {
        return eoAffectedPubs;
    }

    /**
     * Sets the eoAffectedPubs.
     * @param eoAffectedPubs  the new value of the property
     */
    public void setEoAffectedPubs(Set<EOAffectedPub> eoAffectedPubs) {
        this.eoAffectedPubs = eoAffectedPubs;
    }

    /**
     * Gets the the {@code eoAffectedPubs} property.
     * @return the property, not null
     */
    public final Property<Set<EOAffectedPub>> eoAffectedPubs() {
        return metaBean().eoAffectedPubs().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the isSftwareAffected.
     * @return the value of the property
     */
    public Boolean getIsSftwareAffected() {
        return isSftwareAffected;
    }

    /**
     * Sets the isSftwareAffected.
     * @param isSftwareAffected  the new value of the property
     */
    public void setIsSftwareAffected(Boolean isSftwareAffected) {
        this.isSftwareAffected = isSftwareAffected;
    }

    /**
     * Gets the the {@code isSftwareAffected} property.
     * @return the property, not null
     */
    public final Property<Boolean> isSftwareAffected() {
        return metaBean().isSftwareAffected().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the specificFeedback.
     * @return the value of the property
     */
    public String getSpecificFeedback() {
        return specificFeedback;
    }

    /**
     * Sets the specificFeedback.
     * @param specificFeedback  the new value of the property
     */
    public void setSpecificFeedback(String specificFeedback) {
        this.specificFeedback = specificFeedback;
    }

    /**
     * Gets the the {@code specificFeedback} property.
     * @return the property, not null
     */
    public final Property<String> specificFeedback() {
        return metaBean().specificFeedback().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the addressOfFeedback.
     * @return the value of the property
     */
    public String getAddressOfFeedback() {
        return addressOfFeedback;
    }

    /**
     * Sets the addressOfFeedback.
     * @param addressOfFeedback  the new value of the property
     */
    public void setAddressOfFeedback(String addressOfFeedback) {
        this.addressOfFeedback = addressOfFeedback;
    }

    /**
     * Gets the the {@code addressOfFeedback} property.
     * @return the property, not null
     */
    public final Property<String> addressOfFeedback() {
        return metaBean().addressOfFeedback().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the emailOfFeedback.
     * @return the value of the property
     */
    public String getEmailOfFeedback() {
        return emailOfFeedback;
    }

    /**
     * Sets the emailOfFeedback.
     * @param emailOfFeedback  the new value of the property
     */
    public void setEmailOfFeedback(String emailOfFeedback) {
        this.emailOfFeedback = emailOfFeedback;
    }

    /**
     * Gets the the {@code emailOfFeedback} property.
     * @return the property, not null
     */
    public final Property<String> emailOfFeedback() {
        return metaBean().emailOfFeedback().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the faxOfFeedback.
     * @return the value of the property
     */
    public String getFaxOfFeedback() {
        return faxOfFeedback;
    }

    /**
     * Sets the faxOfFeedback.
     * @param faxOfFeedback  the new value of the property
     */
    public void setFaxOfFeedback(String faxOfFeedback) {
        this.faxOfFeedback = faxOfFeedback;
    }

    /**
     * Gets the the {@code faxOfFeedback} property.
     * @return the property, not null
     */
    public final Property<String> faxOfFeedback() {
        return metaBean().faxOfFeedback().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the complexity.
     * @return the value of the property
     */
    public Integer getComplexity() {
        return complexity;
    }

    /**
     * Sets the complexity.
     * @param complexity  the new value of the property
     */
    public void setComplexity(Integer complexity) {
        this.complexity = complexity;
    }

    /**
     * Gets the the {@code complexity} property.
     * @return the property, not null
     */
    public final Property<Integer> complexity() {
        return metaBean().complexity().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the customer.
     * @return the value of the property
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * Sets the customer.
     * @param customer  the new value of the property
     */
    public void setCustomer(String customer) {
        this.customer = customer;
    }

    /**
     * Gets the the {@code customer} property.
     * @return the property, not null
     */
    public final Property<String> customer() {
        return metaBean().customer().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the isImpRefit.
     * @return the value of the property
     */
    public Boolean getIsImpRefit() {
        return isImpRefit;
    }

    /**
     * Sets the isImpRefit.
     * @param isImpRefit  the new value of the property
     */
    public void setIsImpRefit(Boolean isImpRefit) {
        this.isImpRefit = isImpRefit;
    }

    /**
     * Gets the the {@code isImpRefit} property.
     * @return the property, not null
     */
    public final Property<Boolean> isImpRefit() {
        return metaBean().isImpRefit().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the isSTERequired.
     * @return the value of the property
     */
    public Boolean getIsSTERequired() {
        return isSTERequired;
    }

    /**
     * Sets the isSTERequired.
     * @param isSTERequired  the new value of the property
     */
    public void setIsSTERequired(Boolean isSTERequired) {
        this.isSTERequired = isSTERequired;
    }

    /**
     * Gets the the {@code isSTERequired} property.
     * @return the property, not null
     */
    public final Property<Boolean> isSTERequired() {
        return metaBean().isSTERequired().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the isMONRequired.
     * @return the value of the property
     */
    public Boolean getIsMONRequired() {
        return isMONRequired;
    }

    /**
     * Sets the isMONRequired.
     * @param isMONRequired  the new value of the property
     */
    public void setIsMONRequired(Boolean isMONRequired) {
        this.isMONRequired = isMONRequired;
    }

    /**
     * Gets the the {@code isMONRequired} property.
     * @return the property, not null
     */
    public final Property<Boolean> isMONRequired() {
        return metaBean().isMONRequired().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the revRecord.
     * @return the value of the property
     */
    public String getRevRecord() {
        return revRecord;
    }

    /**
     * Sets the revRecord.
     * @param revRecord  the new value of the property
     */
    public void setRevRecord(String revRecord) {
        this.revRecord = revRecord;
    }

    /**
     * Gets the the {@code revRecord} property.
     * @return the property, not null
     */
    public final Property<String> revRecord() {
        return metaBean().revRecord().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the revReason.
     * @return the value of the property
     */
    public String getRevReason() {
        return revReason;
    }

    /**
     * Sets the revReason.
     * @param revReason  the new value of the property
     */
    public void setRevReason(String revReason) {
        this.revReason = revReason;
    }

    /**
     * Gets the the {@code revReason} property.
     * @return the property, not null
     */
    public final Property<String> revReason() {
        return metaBean().revReason().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the applDescription.
     * @return the value of the property
     */
    public String getApplDescription() {
        return applDescription;
    }

    /**
     * Sets the applDescription.
     * @param applDescription  the new value of the property
     */
    public void setApplDescription(String applDescription) {
        this.applDescription = applDescription;
    }

    /**
     * Gets the the {@code applDescription} property.
     * @return the property, not null
     */
    public final Property<String> applDescription() {
        return metaBean().applDescription().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the materialDescr.
     * @return the value of the property
     */
    public String getMaterialDescr() {
        return materialDescr;
    }

    /**
     * Sets the materialDescr.
     * @param materialDescr  the new value of the property
     */
    public void setMaterialDescr(String materialDescr) {
        this.materialDescr = materialDescr;
    }

    /**
     * Gets the the {@code materialDescr} property.
     * @return the property, not null
     */
    public final Property<String> materialDescr() {
        return metaBean().materialDescr().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the eoStatus.
     * @return the value of the property
     */
    public String getEoStatus() {
        return eoStatus;
    }

    /**
     * Sets the eoStatus.
     * @param eoStatus  the new value of the property
     */
    public void setEoStatus(String eoStatus) {
        this.eoStatus = eoStatus;
    }

    /**
     * Gets the the {@code eoStatus} property.
     * @return the property, not null
     */
    public final Property<String> eoStatus() {
        return metaBean().eoStatus().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the isClaimFH.
     * @return the value of the property
     */
    public Boolean getIsClaimFH() {
        return isClaimFH;
    }

    /**
     * Sets the isClaimFH.
     * @param isClaimFH  the new value of the property
     */
    public void setIsClaimFH(Boolean isClaimFH) {
        this.isClaimFH = isClaimFH;
    }

    /**
     * Gets the the {@code isClaimFH} property.
     * @return the property, not null
     */
    public final Property<Boolean> isClaimFH() {
        return metaBean().isClaimFH().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the isClaimMAT.
     * @return the value of the property
     */
    public Boolean getIsClaimMAT() {
        return isClaimMAT;
    }

    /**
     * Sets the isClaimMAT.
     * @param isClaimMAT  the new value of the property
     */
    public void setIsClaimMAT(Boolean isClaimMAT) {
        this.isClaimMAT = isClaimMAT;
    }

    /**
     * Gets the the {@code isClaimMAT} property.
     * @return the property, not null
     */
    public final Property<Boolean> isClaimMAT() {
        return metaBean().isClaimMAT().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the isTechSupReq.
     * @return the value of the property
     */
    public Boolean getIsTechSupReq() {
        return isTechSupReq;
    }

    /**
     * Sets the isTechSupReq.
     * @param isTechSupReq  the new value of the property
     */
    public void setIsTechSupReq(Boolean isTechSupReq) {
        this.isTechSupReq = isTechSupReq;
    }

    /**
     * Gets the the {@code isTechSupReq} property.
     * @return the property, not null
     */
    public final Property<Boolean> isTechSupReq() {
        return metaBean().isTechSupReq().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the epReason.
     * @return the value of the property
     */
    public String getEpReason() {
        return epReason;
    }

    /**
     * Sets the epReason.
     * @param epReason  the new value of the property
     */
    public void setEpReason(String epReason) {
        this.epReason = epReason;
    }

    /**
     * Gets the the {@code epReason} property.
     * @return the property, not null
     */
    public final Property<String> epReason() {
        return metaBean().epReason().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the isMatCostPredicate.
     * @return the value of the property
     */
    public boolean isIsMatCostPredicate() {
        return isMatCostPredicate;
    }

    /**
     * Sets the isMatCostPredicate.
     * @param isMatCostPredicate  the new value of the property
     */
    public void setIsMatCostPredicate(boolean isMatCostPredicate) {
        this.isMatCostPredicate = isMatCostPredicate;
    }

    /**
     * Gets the the {@code isMatCostPredicate} property.
     * @return the property, not null
     */
    public final Property<Boolean> isMatCostPredicate() {
        return metaBean().isMatCostPredicate().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the matCostPredicated.
     * @return the value of the property
     */
    public Double getMatCostPredicated() {
        return matCostPredicated;
    }

    /**
     * Sets the matCostPredicated.
     * @param matCostPredicated  the new value of the property
     */
    public void setMatCostPredicated(Double matCostPredicated) {
        this.matCostPredicated = matCostPredicated;
    }

    /**
     * Gets the the {@code matCostPredicated} property.
     * @return the property, not null
     */
    public final Property<Double> matCostPredicated() {
        return metaBean().matCostPredicated().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the matCostCurrency.
     * @return the value of the property
     */
    public String getMatCostCurrency() {
        return matCostCurrency;
    }

    /**
     * Sets the matCostCurrency.
     * @param matCostCurrency  the new value of the property
     */
    public void setMatCostCurrency(String matCostCurrency) {
        this.matCostCurrency = matCostCurrency;
    }

    /**
     * Gets the the {@code matCostCurrency} property.
     * @return the property, not null
     */
    public final Property<String> matCostCurrency() {
        return metaBean().matCostCurrency().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the version.
     * @return the value of the property
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the version.
     * @param version  the new value of the property
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * Gets the the {@code version} property.
     * @return the property, not null
     */
    public final Property<String> version() {
        return metaBean().version().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the airworthDirectives.
     * @return the value of the property
     */
    public Set<AirworthDirective> getAirworthDirectives() {
        return airworthDirectives;
    }

    /**
     * Sets the airworthDirectives.
     * @param airworthDirectives  the new value of the property
     */
    public void setAirworthDirectives(Set<AirworthDirective> airworthDirectives) {
        this.airworthDirectives = airworthDirectives;
    }

    /**
     * Gets the the {@code airworthDirectives} property.
     * @return the property, not null
     */
    public final Property<Set<AirworthDirective>> airworthDirectives() {
        return metaBean().airworthDirectives().createProperty(this);
    }

    //-----------------------------------------------------------------------
    @Override
    public EOOrder clone() {
        return JodaBeanUtils.cloneAlways(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            EOOrder other = (EOOrder) obj;
            return (getId() == other.getId()) &&
                    JodaBeanUtils.equal(getEoNumber(), other.getEoNumber()) &&
                    JodaBeanUtils.equal(getEoType(), other.getEoType()) &&
                    JodaBeanUtils.equal(getEoClass(), other.getEoClass()) &&
                    JodaBeanUtils.equal(getEoSubject(), other.getEoSubject()) &&
                    JodaBeanUtils.equal(getDescription(), other.getDescription()) &&
                    JodaBeanUtils.equal(getIssueDate(), other.getIssueDate()) &&
                    JodaBeanUtils.equal(getActionType(), other.getActionType()) &&
                    JodaBeanUtils.equal(getAta(), other.getAta()) &&
                    JodaBeanUtils.equal(getStc(), other.getStc()) &&
                    JodaBeanUtils.equal(getMda(), other.getMda()) &&
                    JodaBeanUtils.equal(getAcModelAffected(), other.getAcModelAffected()) &&
                    JodaBeanUtils.equal(getApuModelAffected(), other.getApuModelAffected()) &&
                    JodaBeanUtils.equal(getLdModelAffected(), other.getLdModelAffected()) &&
                    JodaBeanUtils.equal(getEngineModelAffected(), other.getEngineModelAffected()) &&
                    JodaBeanUtils.equal(getIsReInspec(), other.getIsReInspec()) &&
                    JodaBeanUtils.equal(getFinalLmtDescr(), other.getFinalLmtDescr()) &&
                    JodaBeanUtils.equal(getFinalLimit(), other.getFinalLimit()) &&
                    JodaBeanUtils.equal(getIntervalLimit(), other.getIntervalLimit()) &&
                    JodaBeanUtils.equal(getInitialLimit(), other.getInitialLimit()) &&
                    JodaBeanUtils.equal(getInitialLimitDescr(), other.getInitialLimitDescr()) &&
                    JodaBeanUtils.equal(getTimeIntervalDescr(), other.getTimeIntervalDescr()) &&
                    JodaBeanUtils.equal(getIsWTORBLAffected(), other.getIsWTORBLAffected()) &&
                    JodaBeanUtils.equal(getIsELDAffected(), other.getIsELDAffected()) &&
                    JodaBeanUtils.equal(getIsPubAffected(), other.getIsPubAffected()) &&
                    JodaBeanUtils.equal(getEoAffectedPubs(), other.getEoAffectedPubs()) &&
                    JodaBeanUtils.equal(getIsSftwareAffected(), other.getIsSftwareAffected()) &&
                    JodaBeanUtils.equal(getSpecificFeedback(), other.getSpecificFeedback()) &&
                    JodaBeanUtils.equal(getAddressOfFeedback(), other.getAddressOfFeedback()) &&
                    JodaBeanUtils.equal(getEmailOfFeedback(), other.getEmailOfFeedback()) &&
                    JodaBeanUtils.equal(getFaxOfFeedback(), other.getFaxOfFeedback()) &&
                    JodaBeanUtils.equal(getComplexity(), other.getComplexity()) &&
                    JodaBeanUtils.equal(getCustomer(), other.getCustomer()) &&
                    JodaBeanUtils.equal(getIsImpRefit(), other.getIsImpRefit()) &&
                    JodaBeanUtils.equal(getIsSTERequired(), other.getIsSTERequired()) &&
                    JodaBeanUtils.equal(getIsMONRequired(), other.getIsMONRequired()) &&
                    JodaBeanUtils.equal(getRevRecord(), other.getRevRecord()) &&
                    JodaBeanUtils.equal(getRevReason(), other.getRevReason()) &&
                    JodaBeanUtils.equal(getApplDescription(), other.getApplDescription()) &&
                    JodaBeanUtils.equal(getMaterialDescr(), other.getMaterialDescr()) &&
                    JodaBeanUtils.equal(getEoStatus(), other.getEoStatus()) &&
                    JodaBeanUtils.equal(getIsClaimFH(), other.getIsClaimFH()) &&
                    JodaBeanUtils.equal(getIsClaimMAT(), other.getIsClaimMAT()) &&
                    JodaBeanUtils.equal(getIsTechSupReq(), other.getIsTechSupReq()) &&
                    JodaBeanUtils.equal(getEpReason(), other.getEpReason()) &&
                    (isIsMatCostPredicate() == other.isIsMatCostPredicate()) &&
                    JodaBeanUtils.equal(getMatCostPredicated(), other.getMatCostPredicated()) &&
                    JodaBeanUtils.equal(getMatCostCurrency(), other.getMatCostCurrency()) &&
                    JodaBeanUtils.equal(getVersion(), other.getVersion()) &&
                    JodaBeanUtils.equal(getAirworthDirectives(), other.getAirworthDirectives());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = getClass().hashCode();
        hash = hash * 31 + JodaBeanUtils.hashCode(getId());
        hash = hash * 31 + JodaBeanUtils.hashCode(getEoNumber());
        hash = hash * 31 + JodaBeanUtils.hashCode(getEoType());
        hash = hash * 31 + JodaBeanUtils.hashCode(getEoClass());
        hash = hash * 31 + JodaBeanUtils.hashCode(getEoSubject());
        hash = hash * 31 + JodaBeanUtils.hashCode(getDescription());
        hash = hash * 31 + JodaBeanUtils.hashCode(getIssueDate());
        hash = hash * 31 + JodaBeanUtils.hashCode(getActionType());
        hash = hash * 31 + JodaBeanUtils.hashCode(getAta());
        hash = hash * 31 + JodaBeanUtils.hashCode(getStc());
        hash = hash * 31 + JodaBeanUtils.hashCode(getMda());
        hash = hash * 31 + JodaBeanUtils.hashCode(getAcModelAffected());
        hash = hash * 31 + JodaBeanUtils.hashCode(getApuModelAffected());
        hash = hash * 31 + JodaBeanUtils.hashCode(getLdModelAffected());
        hash = hash * 31 + JodaBeanUtils.hashCode(getEngineModelAffected());
        hash = hash * 31 + JodaBeanUtils.hashCode(getIsReInspec());
        hash = hash * 31 + JodaBeanUtils.hashCode(getFinalLmtDescr());
        hash = hash * 31 + JodaBeanUtils.hashCode(getFinalLimit());
        hash = hash * 31 + JodaBeanUtils.hashCode(getIntervalLimit());
        hash = hash * 31 + JodaBeanUtils.hashCode(getInitialLimit());
        hash = hash * 31 + JodaBeanUtils.hashCode(getInitialLimitDescr());
        hash = hash * 31 + JodaBeanUtils.hashCode(getTimeIntervalDescr());
        hash = hash * 31 + JodaBeanUtils.hashCode(getIsWTORBLAffected());
        hash = hash * 31 + JodaBeanUtils.hashCode(getIsELDAffected());
        hash = hash * 31 + JodaBeanUtils.hashCode(getIsPubAffected());
        hash = hash * 31 + JodaBeanUtils.hashCode(getEoAffectedPubs());
        hash = hash * 31 + JodaBeanUtils.hashCode(getIsSftwareAffected());
        hash = hash * 31 + JodaBeanUtils.hashCode(getSpecificFeedback());
        hash = hash * 31 + JodaBeanUtils.hashCode(getAddressOfFeedback());
        hash = hash * 31 + JodaBeanUtils.hashCode(getEmailOfFeedback());
        hash = hash * 31 + JodaBeanUtils.hashCode(getFaxOfFeedback());
        hash = hash * 31 + JodaBeanUtils.hashCode(getComplexity());
        hash = hash * 31 + JodaBeanUtils.hashCode(getCustomer());
        hash = hash * 31 + JodaBeanUtils.hashCode(getIsImpRefit());
        hash = hash * 31 + JodaBeanUtils.hashCode(getIsSTERequired());
        hash = hash * 31 + JodaBeanUtils.hashCode(getIsMONRequired());
        hash = hash * 31 + JodaBeanUtils.hashCode(getRevRecord());
        hash = hash * 31 + JodaBeanUtils.hashCode(getRevReason());
        hash = hash * 31 + JodaBeanUtils.hashCode(getApplDescription());
        hash = hash * 31 + JodaBeanUtils.hashCode(getMaterialDescr());
        hash = hash * 31 + JodaBeanUtils.hashCode(getEoStatus());
        hash = hash * 31 + JodaBeanUtils.hashCode(getIsClaimFH());
        hash = hash * 31 + JodaBeanUtils.hashCode(getIsClaimMAT());
        hash = hash * 31 + JodaBeanUtils.hashCode(getIsTechSupReq());
        hash = hash * 31 + JodaBeanUtils.hashCode(getEpReason());
        hash = hash * 31 + JodaBeanUtils.hashCode(isIsMatCostPredicate());
        hash = hash * 31 + JodaBeanUtils.hashCode(getMatCostPredicated());
        hash = hash * 31 + JodaBeanUtils.hashCode(getMatCostCurrency());
        hash = hash * 31 + JodaBeanUtils.hashCode(getVersion());
        hash = hash * 31 + JodaBeanUtils.hashCode(getAirworthDirectives());
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(1632);
        buf.append("EOOrder{");
        int len = buf.length();
        toString(buf);
        if (buf.length() > len) {
            buf.setLength(buf.length() - 2);
        }
        buf.append('}');
        return buf.toString();
    }

    protected void toString(StringBuilder buf) {
        buf.append("id").append('=').append(JodaBeanUtils.toString(getId())).append(',').append(' ');
        buf.append("eoNumber").append('=').append(JodaBeanUtils.toString(getEoNumber())).append(',').append(' ');
        buf.append("eoType").append('=').append(JodaBeanUtils.toString(getEoType())).append(',').append(' ');
        buf.append("eoClass").append('=').append(JodaBeanUtils.toString(getEoClass())).append(',').append(' ');
        buf.append("eoSubject").append('=').append(JodaBeanUtils.toString(getEoSubject())).append(',').append(' ');
        buf.append("description").append('=').append(JodaBeanUtils.toString(getDescription())).append(',').append(' ');
        buf.append("issueDate").append('=').append(JodaBeanUtils.toString(getIssueDate())).append(',').append(' ');
        buf.append("actionType").append('=').append(JodaBeanUtils.toString(getActionType())).append(',').append(' ');
        buf.append("ata").append('=').append(JodaBeanUtils.toString(getAta())).append(',').append(' ');
        buf.append("stc").append('=').append(JodaBeanUtils.toString(getStc())).append(',').append(' ');
        buf.append("mda").append('=').append(JodaBeanUtils.toString(getMda())).append(',').append(' ');
        buf.append("acModelAffected").append('=').append(JodaBeanUtils.toString(getAcModelAffected())).append(',').append(' ');
        buf.append("apuModelAffected").append('=').append(JodaBeanUtils.toString(getApuModelAffected())).append(',').append(' ');
        buf.append("ldModelAffected").append('=').append(JodaBeanUtils.toString(getLdModelAffected())).append(',').append(' ');
        buf.append("engineModelAffected").append('=').append(JodaBeanUtils.toString(getEngineModelAffected())).append(',').append(' ');
        buf.append("isReInspec").append('=').append(JodaBeanUtils.toString(getIsReInspec())).append(',').append(' ');
        buf.append("finalLmtDescr").append('=').append(JodaBeanUtils.toString(getFinalLmtDescr())).append(',').append(' ');
        buf.append("finalLimit").append('=').append(JodaBeanUtils.toString(getFinalLimit())).append(',').append(' ');
        buf.append("intervalLimit").append('=').append(JodaBeanUtils.toString(getIntervalLimit())).append(',').append(' ');
        buf.append("initialLimit").append('=').append(JodaBeanUtils.toString(getInitialLimit())).append(',').append(' ');
        buf.append("initialLimitDescr").append('=').append(JodaBeanUtils.toString(getInitialLimitDescr())).append(',').append(' ');
        buf.append("timeIntervalDescr").append('=').append(JodaBeanUtils.toString(getTimeIntervalDescr())).append(',').append(' ');
        buf.append("isWTORBLAffected").append('=').append(JodaBeanUtils.toString(getIsWTORBLAffected())).append(',').append(' ');
        buf.append("isELDAffected").append('=').append(JodaBeanUtils.toString(getIsELDAffected())).append(',').append(' ');
        buf.append("isPubAffected").append('=').append(JodaBeanUtils.toString(getIsPubAffected())).append(',').append(' ');
        buf.append("eoAffectedPubs").append('=').append(JodaBeanUtils.toString(getEoAffectedPubs())).append(',').append(' ');
        buf.append("isSftwareAffected").append('=').append(JodaBeanUtils.toString(getIsSftwareAffected())).append(',').append(' ');
        buf.append("specificFeedback").append('=').append(JodaBeanUtils.toString(getSpecificFeedback())).append(',').append(' ');
        buf.append("addressOfFeedback").append('=').append(JodaBeanUtils.toString(getAddressOfFeedback())).append(',').append(' ');
        buf.append("emailOfFeedback").append('=').append(JodaBeanUtils.toString(getEmailOfFeedback())).append(',').append(' ');
        buf.append("faxOfFeedback").append('=').append(JodaBeanUtils.toString(getFaxOfFeedback())).append(',').append(' ');
        buf.append("complexity").append('=').append(JodaBeanUtils.toString(getComplexity())).append(',').append(' ');
        buf.append("customer").append('=').append(JodaBeanUtils.toString(getCustomer())).append(',').append(' ');
        buf.append("isImpRefit").append('=').append(JodaBeanUtils.toString(getIsImpRefit())).append(',').append(' ');
        buf.append("isSTERequired").append('=').append(JodaBeanUtils.toString(getIsSTERequired())).append(',').append(' ');
        buf.append("isMONRequired").append('=').append(JodaBeanUtils.toString(getIsMONRequired())).append(',').append(' ');
        buf.append("revRecord").append('=').append(JodaBeanUtils.toString(getRevRecord())).append(',').append(' ');
        buf.append("revReason").append('=').append(JodaBeanUtils.toString(getRevReason())).append(',').append(' ');
        buf.append("applDescription").append('=').append(JodaBeanUtils.toString(getApplDescription())).append(',').append(' ');
        buf.append("materialDescr").append('=').append(JodaBeanUtils.toString(getMaterialDescr())).append(',').append(' ');
        buf.append("eoStatus").append('=').append(JodaBeanUtils.toString(getEoStatus())).append(',').append(' ');
        buf.append("isClaimFH").append('=').append(JodaBeanUtils.toString(getIsClaimFH())).append(',').append(' ');
        buf.append("isClaimMAT").append('=').append(JodaBeanUtils.toString(getIsClaimMAT())).append(',').append(' ');
        buf.append("isTechSupReq").append('=').append(JodaBeanUtils.toString(getIsTechSupReq())).append(',').append(' ');
        buf.append("epReason").append('=').append(JodaBeanUtils.toString(getEpReason())).append(',').append(' ');
        buf.append("isMatCostPredicate").append('=').append(JodaBeanUtils.toString(isIsMatCostPredicate())).append(',').append(' ');
        buf.append("matCostPredicated").append('=').append(JodaBeanUtils.toString(getMatCostPredicated())).append(',').append(' ');
        buf.append("matCostCurrency").append('=').append(JodaBeanUtils.toString(getMatCostCurrency())).append(',').append(' ');
        buf.append("version").append('=').append(JodaBeanUtils.toString(getVersion())).append(',').append(' ');
        buf.append("airworthDirectives").append('=').append(JodaBeanUtils.toString(getAirworthDirectives())).append(',').append(' ');
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code EOOrder}.
     */
    public static class Meta extends DirectMetaBean {
        /**
         * The singleton instance of the meta-bean.
         */
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-property for the {@code id} property.
         */
        private final MetaProperty<Long> id = DirectMetaProperty.ofReadWrite(
                this, "id", EOOrder.class, Long.TYPE);
        /**
         * The meta-property for the {@code eoNumber} property.
         */
        private final MetaProperty<String> eoNumber = DirectMetaProperty.ofReadWrite(
                this, "eoNumber", EOOrder.class, String.class);
        /**
         * The meta-property for the {@code eoType} property.
         */
        private final MetaProperty<String> eoType = DirectMetaProperty.ofReadWrite(
                this, "eoType", EOOrder.class, String.class);
        /**
         * The meta-property for the {@code eoClass} property.
         */
        private final MetaProperty<String> eoClass = DirectMetaProperty.ofReadWrite(
                this, "eoClass", EOOrder.class, String.class);
        /**
         * The meta-property for the {@code eoSubject} property.
         */
        private final MetaProperty<String> eoSubject = DirectMetaProperty.ofReadWrite(
                this, "eoSubject", EOOrder.class, String.class);
        /**
         * The meta-property for the {@code description} property.
         */
        private final MetaProperty<String> description = DirectMetaProperty.ofReadWrite(
                this, "description", EOOrder.class, String.class);
        /**
         * The meta-property for the {@code issueDate} property.
         */
        private final MetaProperty<Date> issueDate = DirectMetaProperty.ofReadWrite(
                this, "issueDate", EOOrder.class, Date.class);
        /**
         * The meta-property for the {@code actionType} property.
         */
        private final MetaProperty<String> actionType = DirectMetaProperty.ofReadWrite(
                this, "actionType", EOOrder.class, String.class);
        /**
         * The meta-property for the {@code ata} property.
         */
        private final MetaProperty<String> ata = DirectMetaProperty.ofReadWrite(
                this, "ata", EOOrder.class, String.class);
        /**
         * The meta-property for the {@code stc} property.
         */
        private final MetaProperty<String> stc = DirectMetaProperty.ofReadWrite(
                this, "stc", EOOrder.class, String.class);
        /**
         * The meta-property for the {@code mda} property.
         */
        private final MetaProperty<String> mda = DirectMetaProperty.ofReadWrite(
                this, "mda", EOOrder.class, String.class);
        /**
         * The meta-property for the {@code acModelAffected} property.
         */
        private final MetaProperty<String> acModelAffected = DirectMetaProperty.ofReadWrite(
                this, "acModelAffected", EOOrder.class, String.class);
        /**
         * The meta-property for the {@code apuModelAffected} property.
         */
        private final MetaProperty<String> apuModelAffected = DirectMetaProperty.ofReadWrite(
                this, "apuModelAffected", EOOrder.class, String.class);
        /**
         * The meta-property for the {@code ldModelAffected} property.
         */
        private final MetaProperty<String> ldModelAffected = DirectMetaProperty.ofReadWrite(
                this, "ldModelAffected", EOOrder.class, String.class);
        /**
         * The meta-property for the {@code engineModelAffected} property.
         */
        private final MetaProperty<String> engineModelAffected = DirectMetaProperty.ofReadWrite(
                this, "engineModelAffected", EOOrder.class, String.class);
        /**
         * The meta-property for the {@code isReInspec} property.
         */
        private final MetaProperty<Boolean> isReInspec = DirectMetaProperty.ofReadWrite(
                this, "isReInspec", EOOrder.class, Boolean.class);
        /**
         * The meta-property for the {@code finalLmtDescr} property.
         */
        private final MetaProperty<String> finalLmtDescr = DirectMetaProperty.ofReadWrite(
                this, "finalLmtDescr", EOOrder.class, String.class);
        /**
         * The meta-property for the {@code finalLimit} property.
         */
        private final MetaProperty<Integer> finalLimit = DirectMetaProperty.ofReadWrite(
                this, "finalLimit", EOOrder.class, Integer.class);
        /**
         * The meta-property for the {@code intervalLimit} property.
         */
        private final MetaProperty<Integer> intervalLimit = DirectMetaProperty.ofReadWrite(
                this, "intervalLimit", EOOrder.class, Integer.class);
        /**
         * The meta-property for the {@code initialLimit} property.
         */
        private final MetaProperty<Integer> initialLimit = DirectMetaProperty.ofReadWrite(
                this, "initialLimit", EOOrder.class, Integer.class);
        /**
         * The meta-property for the {@code initialLimitDescr} property.
         */
        private final MetaProperty<String> initialLimitDescr = DirectMetaProperty.ofReadWrite(
                this, "initialLimitDescr", EOOrder.class, String.class);
        /**
         * The meta-property for the {@code timeIntervalDescr} property.
         */
        private final MetaProperty<String> timeIntervalDescr = DirectMetaProperty.ofReadWrite(
                this, "timeIntervalDescr", EOOrder.class, String.class);
        /**
         * The meta-property for the {@code isWTORBLAffected} property.
         */
        private final MetaProperty<Boolean> isWTORBLAffected = DirectMetaProperty.ofReadWrite(
                this, "isWTORBLAffected", EOOrder.class, Boolean.class);
        /**
         * The meta-property for the {@code isELDAffected} property.
         */
        private final MetaProperty<Boolean> isELDAffected = DirectMetaProperty.ofReadWrite(
                this, "isELDAffected", EOOrder.class, Boolean.class);
        /**
         * The meta-property for the {@code isPubAffected} property.
         */
        private final MetaProperty<Boolean> isPubAffected = DirectMetaProperty.ofReadWrite(
                this, "isPubAffected", EOOrder.class, Boolean.class);
        /**
         * The meta-property for the {@code eoAffectedPubs} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<Set<EOAffectedPub>> eoAffectedPubs = DirectMetaProperty.ofReadWrite(
                this, "eoAffectedPubs", EOOrder.class, (Class) Set.class);
        /**
         * The meta-property for the {@code isSftwareAffected} property.
         */
        private final MetaProperty<Boolean> isSftwareAffected = DirectMetaProperty.ofReadWrite(
                this, "isSftwareAffected", EOOrder.class, Boolean.class);
        /**
         * The meta-property for the {@code specificFeedback} property.
         */
        private final MetaProperty<String> specificFeedback = DirectMetaProperty.ofReadWrite(
                this, "specificFeedback", EOOrder.class, String.class);
        /**
         * The meta-property for the {@code addressOfFeedback} property.
         */
        private final MetaProperty<String> addressOfFeedback = DirectMetaProperty.ofReadWrite(
                this, "addressOfFeedback", EOOrder.class, String.class);
        /**
         * The meta-property for the {@code emailOfFeedback} property.
         */
        private final MetaProperty<String> emailOfFeedback = DirectMetaProperty.ofReadWrite(
                this, "emailOfFeedback", EOOrder.class, String.class);
        /**
         * The meta-property for the {@code faxOfFeedback} property.
         */
        private final MetaProperty<String> faxOfFeedback = DirectMetaProperty.ofReadWrite(
                this, "faxOfFeedback", EOOrder.class, String.class);
        /**
         * The meta-property for the {@code complexity} property.
         */
        private final MetaProperty<Integer> complexity = DirectMetaProperty.ofReadWrite(
                this, "complexity", EOOrder.class, Integer.class);
        /**
         * The meta-property for the {@code customer} property.
         */
        private final MetaProperty<String> customer = DirectMetaProperty.ofReadWrite(
                this, "customer", EOOrder.class, String.class);
        /**
         * The meta-property for the {@code isImpRefit} property.
         */
        private final MetaProperty<Boolean> isImpRefit = DirectMetaProperty.ofReadWrite(
                this, "isImpRefit", EOOrder.class, Boolean.class);
        /**
         * The meta-property for the {@code isSTERequired} property.
         */
        private final MetaProperty<Boolean> isSTERequired = DirectMetaProperty.ofReadWrite(
                this, "isSTERequired", EOOrder.class, Boolean.class);
        /**
         * The meta-property for the {@code isMONRequired} property.
         */
        private final MetaProperty<Boolean> isMONRequired = DirectMetaProperty.ofReadWrite(
                this, "isMONRequired", EOOrder.class, Boolean.class);
        /**
         * The meta-property for the {@code revRecord} property.
         */
        private final MetaProperty<String> revRecord = DirectMetaProperty.ofReadWrite(
                this, "revRecord", EOOrder.class, String.class);
        /**
         * The meta-property for the {@code revReason} property.
         */
        private final MetaProperty<String> revReason = DirectMetaProperty.ofReadWrite(
                this, "revReason", EOOrder.class, String.class);
        /**
         * The meta-property for the {@code applDescription} property.
         */
        private final MetaProperty<String> applDescription = DirectMetaProperty.ofReadWrite(
                this, "applDescription", EOOrder.class, String.class);
        /**
         * The meta-property for the {@code materialDescr} property.
         */
        private final MetaProperty<String> materialDescr = DirectMetaProperty.ofReadWrite(
                this, "materialDescr", EOOrder.class, String.class);
        /**
         * The meta-property for the {@code eoStatus} property.
         */
        private final MetaProperty<String> eoStatus = DirectMetaProperty.ofReadWrite(
                this, "eoStatus", EOOrder.class, String.class);
        /**
         * The meta-property for the {@code isClaimFH} property.
         */
        private final MetaProperty<Boolean> isClaimFH = DirectMetaProperty.ofReadWrite(
                this, "isClaimFH", EOOrder.class, Boolean.class);
        /**
         * The meta-property for the {@code isClaimMAT} property.
         */
        private final MetaProperty<Boolean> isClaimMAT = DirectMetaProperty.ofReadWrite(
                this, "isClaimMAT", EOOrder.class, Boolean.class);
        /**
         * The meta-property for the {@code isTechSupReq} property.
         */
        private final MetaProperty<Boolean> isTechSupReq = DirectMetaProperty.ofReadWrite(
                this, "isTechSupReq", EOOrder.class, Boolean.class);
        /**
         * The meta-property for the {@code epReason} property.
         */
        private final MetaProperty<String> epReason = DirectMetaProperty.ofReadWrite(
                this, "epReason", EOOrder.class, String.class);
        /**
         * The meta-property for the {@code isMatCostPredicate} property.
         */
        private final MetaProperty<Boolean> isMatCostPredicate = DirectMetaProperty.ofReadWrite(
                this, "isMatCostPredicate", EOOrder.class, Boolean.TYPE);
        /**
         * The meta-property for the {@code matCostPredicated} property.
         */
        private final MetaProperty<Double> matCostPredicated = DirectMetaProperty.ofReadWrite(
                this, "matCostPredicated", EOOrder.class, Double.class);
        /**
         * The meta-property for the {@code matCostCurrency} property.
         */
        private final MetaProperty<String> matCostCurrency = DirectMetaProperty.ofReadWrite(
                this, "matCostCurrency", EOOrder.class, String.class);
        /**
         * The meta-property for the {@code version} property.
         */
        private final MetaProperty<String> version = DirectMetaProperty.ofReadWrite(
                this, "version", EOOrder.class, String.class);
        /**
         * The meta-property for the {@code airworthDirectives} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<Set<AirworthDirective>> airworthDirectives = DirectMetaProperty.ofReadWrite(
                this, "airworthDirectives", EOOrder.class, (Class) Set.class);
        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
                this, null,
                "id",
                "eoNumber",
                "eoType",
                "eoClass",
                "eoSubject",
                "description",
                "issueDate",
                "actionType",
                "ata",
                "stc",
                "mda",
                "acModelAffected",
                "apuModelAffected",
                "ldModelAffected",
                "engineModelAffected",
                "isReInspec",
                "finalLmtDescr",
                "finalLimit",
                "intervalLimit",
                "initialLimit",
                "initialLimitDescr",
                "timeIntervalDescr",
                "isWTORBLAffected",
                "isELDAffected",
                "isPubAffected",
                "eoAffectedPubs",
                "isSftwareAffected",
                "specificFeedback",
                "addressOfFeedback",
                "emailOfFeedback",
                "faxOfFeedback",
                "complexity",
                "customer",
                "isImpRefit",
                "isSTERequired",
                "isMONRequired",
                "revRecord",
                "revReason",
                "applDescription",
                "materialDescr",
                "eoStatus",
                "isClaimFH",
                "isClaimMAT",
                "isTechSupReq",
                "epReason",
                "isMatCostPredicate",
                "matCostPredicated",
                "matCostCurrency",
                "version",
                "airworthDirectives");

        /**
         * Restricted constructor.
         */
        protected Meta() {
        }

        @Override
        protected MetaProperty<?> metaPropertyGet(String propertyName) {
            switch (propertyName.hashCode()) {
                case 3355:  // id
                    return id;
                case 2003315859:  // eoNumber
                    return eoNumber;
                case -1298289916:  // eoType
                    return eoType;
                case -1608382738:  // eoClass
                    return eoClass;
                case 2105879842:  // eoSubject
                    return eoSubject;
                case -1724546052:  // description
                    return description;
                case 184285223:  // issueDate
                    return issueDate;
                case 1851881104:  // actionType
                    return actionType;
                case 96910:  // ata
                    return ata;
                case 114210:  // stc
                    return stc;
                case 107946:  // mda
                    return mda;
                case -1220901957:  // acModelAffected
                    return acModelAffected;
                case 1425210423:  // apuModelAffected
                    return apuModelAffected;
                case 1971707429:  // ldModelAffected
                    return ldModelAffected;
                case -1624340069:  // engineModelAffected
                    return engineModelAffected;
                case 1957222845:  // isReInspec
                    return isReInspec;
                case 1841923140:  // finalLmtDescr
                    return finalLmtDescr;
                case -1879174171:  // finalLimit
                    return finalLimit;
                case -1428575754:  // intervalLimit
                    return intervalLimit;
                case -427364649:  // initialLimit
                    return initialLimit;
                case -781343894:  // initialLimitDescr
                    return initialLimitDescr;
                case 1254081647:  // timeIntervalDescr
                    return timeIntervalDescr;
                case 533340680:  // isWTORBLAffected
                    return isWTORBLAffected;
                case 2044627623:  // isELDAffected
                    return isELDAffected;
                case 1601853703:  // isPubAffected
                    return isPubAffected;
                case 2033544052:  // eoAffectedPubs
                    return eoAffectedPubs;
                case 196579464:  // isSftwareAffected
                    return isSftwareAffected;
                case -105650473:  // specificFeedback
                    return specificFeedback;
                case 996846992:  // addressOfFeedback
                    return addressOfFeedback;
                case 1700522808:  // emailOfFeedback
                    return emailOfFeedback;
                case 739671417:  // faxOfFeedback
                    return faxOfFeedback;
                case -541084162:  // complexity
                    return complexity;
                case 606175198:  // customer
                    return customer;
                case -1242821668:  // isImpRefit
                    return isImpRefit;
                case -1717075367:  // isSTERequired
                    return isSTERequired;
                case -1924922559:  // isMONRequired
                    return isMONRequired;
                case -166016300:  // revRecord
                    return revRecord;
                case -166072121:  // revReason
                    return revReason;
                case 1913602193:  // applDescription
                    return applDescription;
                case -1174495462:  // materialDescr
                    return materialDescr;
                case 2145198396:  // eoStatus
                    return eoStatus;
                case 273537396:  // isClaimFH
                    return isClaimFH;
                case -110268722:  // isClaimMAT
                    return isClaimMAT;
                case -275408272:  // isTechSupReq
                    return isTechSupReq;
                case -1304748337:  // epReason
                    return epReason;
                case -1760259020:  // isMatCostPredicate
                    return isMatCostPredicate;
                case -1202780486:  // matCostPredicated
                    return matCostPredicated;
                case -1885155202:  // matCostCurrency
                    return matCostCurrency;
                case 351608024:  // version
                    return version;
                case 1812179624:  // airworthDirectives
                    return airworthDirectives;
            }
            return super.metaPropertyGet(propertyName);
        }

        @Override
        public BeanBuilder<? extends EOOrder> builder() {
            return new DirectBeanBuilder<EOOrder>(new EOOrder());
        }

        @Override
        public Class<? extends EOOrder> beanType() {
            return EOOrder.class;
        }

        @Override
        public Map<String, MetaProperty<?>> metaPropertyMap() {
            return metaPropertyMap$;
        }

        //-----------------------------------------------------------------------
        /**
         * The meta-property for the {@code id} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Long> id() {
            return id;
        }

        /**
         * The meta-property for the {@code eoNumber} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> eoNumber() {
            return eoNumber;
        }

        /**
         * The meta-property for the {@code eoType} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> eoType() {
            return eoType;
        }

        /**
         * The meta-property for the {@code eoClass} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> eoClass() {
            return eoClass;
        }

        /**
         * The meta-property for the {@code eoSubject} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> eoSubject() {
            return eoSubject;
        }

        /**
         * The meta-property for the {@code description} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> description() {
            return description;
        }

        /**
         * The meta-property for the {@code issueDate} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Date> issueDate() {
            return issueDate;
        }

        /**
         * The meta-property for the {@code actionType} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> actionType() {
            return actionType;
        }

        /**
         * The meta-property for the {@code ata} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> ata() {
            return ata;
        }

        /**
         * The meta-property for the {@code stc} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> stc() {
            return stc;
        }

        /**
         * The meta-property for the {@code mda} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> mda() {
            return mda;
        }

        /**
         * The meta-property for the {@code acModelAffected} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> acModelAffected() {
            return acModelAffected;
        }

        /**
         * The meta-property for the {@code apuModelAffected} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> apuModelAffected() {
            return apuModelAffected;
        }

        /**
         * The meta-property for the {@code ldModelAffected} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> ldModelAffected() {
            return ldModelAffected;
        }

        /**
         * The meta-property for the {@code engineModelAffected} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> engineModelAffected() {
            return engineModelAffected;
        }

        /**
         * The meta-property for the {@code isReInspec} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Boolean> isReInspec() {
            return isReInspec;
        }

        /**
         * The meta-property for the {@code finalLmtDescr} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> finalLmtDescr() {
            return finalLmtDescr;
        }

        /**
         * The meta-property for the {@code finalLimit} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Integer> finalLimit() {
            return finalLimit;
        }

        /**
         * The meta-property for the {@code intervalLimit} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Integer> intervalLimit() {
            return intervalLimit;
        }

        /**
         * The meta-property for the {@code initialLimit} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Integer> initialLimit() {
            return initialLimit;
        }

        /**
         * The meta-property for the {@code initialLimitDescr} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> initialLimitDescr() {
            return initialLimitDescr;
        }

        /**
         * The meta-property for the {@code timeIntervalDescr} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> timeIntervalDescr() {
            return timeIntervalDescr;
        }

        /**
         * The meta-property for the {@code isWTORBLAffected} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Boolean> isWTORBLAffected() {
            return isWTORBLAffected;
        }

        /**
         * The meta-property for the {@code isELDAffected} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Boolean> isELDAffected() {
            return isELDAffected;
        }

        /**
         * The meta-property for the {@code isPubAffected} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Boolean> isPubAffected() {
            return isPubAffected;
        }

        /**
         * The meta-property for the {@code eoAffectedPubs} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Set<EOAffectedPub>> eoAffectedPubs() {
            return eoAffectedPubs;
        }

        /**
         * The meta-property for the {@code isSftwareAffected} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Boolean> isSftwareAffected() {
            return isSftwareAffected;
        }

        /**
         * The meta-property for the {@code specificFeedback} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> specificFeedback() {
            return specificFeedback;
        }

        /**
         * The meta-property for the {@code addressOfFeedback} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> addressOfFeedback() {
            return addressOfFeedback;
        }

        /**
         * The meta-property for the {@code emailOfFeedback} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> emailOfFeedback() {
            return emailOfFeedback;
        }

        /**
         * The meta-property for the {@code faxOfFeedback} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> faxOfFeedback() {
            return faxOfFeedback;
        }

        /**
         * The meta-property for the {@code complexity} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Integer> complexity() {
            return complexity;
        }

        /**
         * The meta-property for the {@code customer} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> customer() {
            return customer;
        }

        /**
         * The meta-property for the {@code isImpRefit} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Boolean> isImpRefit() {
            return isImpRefit;
        }

        /**
         * The meta-property for the {@code isSTERequired} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Boolean> isSTERequired() {
            return isSTERequired;
        }

        /**
         * The meta-property for the {@code isMONRequired} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Boolean> isMONRequired() {
            return isMONRequired;
        }

        /**
         * The meta-property for the {@code revRecord} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> revRecord() {
            return revRecord;
        }

        /**
         * The meta-property for the {@code revReason} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> revReason() {
            return revReason;
        }

        /**
         * The meta-property for the {@code applDescription} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> applDescription() {
            return applDescription;
        }

        /**
         * The meta-property for the {@code materialDescr} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> materialDescr() {
            return materialDescr;
        }

        /**
         * The meta-property for the {@code eoStatus} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> eoStatus() {
            return eoStatus;
        }

        /**
         * The meta-property for the {@code isClaimFH} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Boolean> isClaimFH() {
            return isClaimFH;
        }

        /**
         * The meta-property for the {@code isClaimMAT} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Boolean> isClaimMAT() {
            return isClaimMAT;
        }

        /**
         * The meta-property for the {@code isTechSupReq} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Boolean> isTechSupReq() {
            return isTechSupReq;
        }

        /**
         * The meta-property for the {@code epReason} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> epReason() {
            return epReason;
        }

        /**
         * The meta-property for the {@code isMatCostPredicate} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Boolean> isMatCostPredicate() {
            return isMatCostPredicate;
        }

        /**
         * The meta-property for the {@code matCostPredicated} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Double> matCostPredicated() {
            return matCostPredicated;
        }

        /**
         * The meta-property for the {@code matCostCurrency} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> matCostCurrency() {
            return matCostCurrency;
        }

        /**
         * The meta-property for the {@code version} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> version() {
            return version;
        }

        /**
         * The meta-property for the {@code airworthDirectives} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Set<AirworthDirective>> airworthDirectives() {
            return airworthDirectives;
        }

        //-----------------------------------------------------------------------
        @Override
        protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 3355:  // id
                    return ((EOOrder) bean).getId();
                case 2003315859:  // eoNumber
                    return ((EOOrder) bean).getEoNumber();
                case -1298289916:  // eoType
                    return ((EOOrder) bean).getEoType();
                case -1608382738:  // eoClass
                    return ((EOOrder) bean).getEoClass();
                case 2105879842:  // eoSubject
                    return ((EOOrder) bean).getEoSubject();
                case -1724546052:  // description
                    return ((EOOrder) bean).getDescription();
                case 184285223:  // issueDate
                    return ((EOOrder) bean).getIssueDate();
                case 1851881104:  // actionType
                    return ((EOOrder) bean).getActionType();
                case 96910:  // ata
                    return ((EOOrder) bean).getAta();
                case 114210:  // stc
                    return ((EOOrder) bean).getStc();
                case 107946:  // mda
                    return ((EOOrder) bean).getMda();
                case -1220901957:  // acModelAffected
                    return ((EOOrder) bean).getAcModelAffected();
                case 1425210423:  // apuModelAffected
                    return ((EOOrder) bean).getApuModelAffected();
                case 1971707429:  // ldModelAffected
                    return ((EOOrder) bean).getLdModelAffected();
                case -1624340069:  // engineModelAffected
                    return ((EOOrder) bean).getEngineModelAffected();
                case 1957222845:  // isReInspec
                    return ((EOOrder) bean).getIsReInspec();
                case 1841923140:  // finalLmtDescr
                    return ((EOOrder) bean).getFinalLmtDescr();
                case -1879174171:  // finalLimit
                    return ((EOOrder) bean).getFinalLimit();
                case -1428575754:  // intervalLimit
                    return ((EOOrder) bean).getIntervalLimit();
                case -427364649:  // initialLimit
                    return ((EOOrder) bean).getInitialLimit();
                case -781343894:  // initialLimitDescr
                    return ((EOOrder) bean).getInitialLimitDescr();
                case 1254081647:  // timeIntervalDescr
                    return ((EOOrder) bean).getTimeIntervalDescr();
                case 533340680:  // isWTORBLAffected
                    return ((EOOrder) bean).getIsWTORBLAffected();
                case 2044627623:  // isELDAffected
                    return ((EOOrder) bean).getIsELDAffected();
                case 1601853703:  // isPubAffected
                    return ((EOOrder) bean).getIsPubAffected();
                case 2033544052:  // eoAffectedPubs
                    return ((EOOrder) bean).getEoAffectedPubs();
                case 196579464:  // isSftwareAffected
                    return ((EOOrder) bean).getIsSftwareAffected();
                case -105650473:  // specificFeedback
                    return ((EOOrder) bean).getSpecificFeedback();
                case 996846992:  // addressOfFeedback
                    return ((EOOrder) bean).getAddressOfFeedback();
                case 1700522808:  // emailOfFeedback
                    return ((EOOrder) bean).getEmailOfFeedback();
                case 739671417:  // faxOfFeedback
                    return ((EOOrder) bean).getFaxOfFeedback();
                case -541084162:  // complexity
                    return ((EOOrder) bean).getComplexity();
                case 606175198:  // customer
                    return ((EOOrder) bean).getCustomer();
                case -1242821668:  // isImpRefit
                    return ((EOOrder) bean).getIsImpRefit();
                case -1717075367:  // isSTERequired
                    return ((EOOrder) bean).getIsSTERequired();
                case -1924922559:  // isMONRequired
                    return ((EOOrder) bean).getIsMONRequired();
                case -166016300:  // revRecord
                    return ((EOOrder) bean).getRevRecord();
                case -166072121:  // revReason
                    return ((EOOrder) bean).getRevReason();
                case 1913602193:  // applDescription
                    return ((EOOrder) bean).getApplDescription();
                case -1174495462:  // materialDescr
                    return ((EOOrder) bean).getMaterialDescr();
                case 2145198396:  // eoStatus
                    return ((EOOrder) bean).getEoStatus();
                case 273537396:  // isClaimFH
                    return ((EOOrder) bean).getIsClaimFH();
                case -110268722:  // isClaimMAT
                    return ((EOOrder) bean).getIsClaimMAT();
                case -275408272:  // isTechSupReq
                    return ((EOOrder) bean).getIsTechSupReq();
                case -1304748337:  // epReason
                    return ((EOOrder) bean).getEpReason();
                case -1760259020:  // isMatCostPredicate
                    return ((EOOrder) bean).isIsMatCostPredicate();
                case -1202780486:  // matCostPredicated
                    return ((EOOrder) bean).getMatCostPredicated();
                case -1885155202:  // matCostCurrency
                    return ((EOOrder) bean).getMatCostCurrency();
                case 351608024:  // version
                    return ((EOOrder) bean).getVersion();
                case 1812179624:  // airworthDirectives
                    return ((EOOrder) bean).getAirworthDirectives();
            }
            return super.propertyGet(bean, propertyName, quiet);
        }

        @SuppressWarnings("unchecked")
        @Override
        protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 3355:  // id
                    ((EOOrder) bean).setId((Long) newValue);
                    return;
                case 2003315859:  // eoNumber
                    ((EOOrder) bean).setEoNumber((String) newValue);
                    return;
                case -1298289916:  // eoType
                    ((EOOrder) bean).setEoType((String) newValue);
                    return;
                case -1608382738:  // eoClass
                    ((EOOrder) bean).setEoClass((String) newValue);
                    return;
                case 2105879842:  // eoSubject
                    ((EOOrder) bean).setEoSubject((String) newValue);
                    return;
                case -1724546052:  // description
                    ((EOOrder) bean).setDescription((String) newValue);
                    return;
                case 184285223:  // issueDate
                    ((EOOrder) bean).setIssueDate((Date) newValue);
                    return;
                case 1851881104:  // actionType
                    ((EOOrder) bean).setActionType((String) newValue);
                    return;
                case 96910:  // ata
                    ((EOOrder) bean).setAta((String) newValue);
                    return;
                case 114210:  // stc
                    ((EOOrder) bean).setStc((String) newValue);
                    return;
                case 107946:  // mda
                    ((EOOrder) bean).setMda((String) newValue);
                    return;
                case -1220901957:  // acModelAffected
                    ((EOOrder) bean).setAcModelAffected((String) newValue);
                    return;
                case 1425210423:  // apuModelAffected
                    ((EOOrder) bean).setApuModelAffected((String) newValue);
                    return;
                case 1971707429:  // ldModelAffected
                    ((EOOrder) bean).setLdModelAffected((String) newValue);
                    return;
                case -1624340069:  // engineModelAffected
                    ((EOOrder) bean).setEngineModelAffected((String) newValue);
                    return;
                case 1957222845:  // isReInspec
                    ((EOOrder) bean).setIsReInspec((Boolean) newValue);
                    return;
                case 1841923140:  // finalLmtDescr
                    ((EOOrder) bean).setFinalLmtDescr((String) newValue);
                    return;
                case -1879174171:  // finalLimit
                    ((EOOrder) bean).setFinalLimit((Integer) newValue);
                    return;
                case -1428575754:  // intervalLimit
                    ((EOOrder) bean).setIntervalLimit((Integer) newValue);
                    return;
                case -427364649:  // initialLimit
                    ((EOOrder) bean).setInitialLimit((Integer) newValue);
                    return;
                case -781343894:  // initialLimitDescr
                    ((EOOrder) bean).setInitialLimitDescr((String) newValue);
                    return;
                case 1254081647:  // timeIntervalDescr
                    ((EOOrder) bean).setTimeIntervalDescr((String) newValue);
                    return;
                case 533340680:  // isWTORBLAffected
                    ((EOOrder) bean).setIsWTORBLAffected((Boolean) newValue);
                    return;
                case 2044627623:  // isELDAffected
                    ((EOOrder) bean).setIsELDAffected((Boolean) newValue);
                    return;
                case 1601853703:  // isPubAffected
                    ((EOOrder) bean).setIsPubAffected((Boolean) newValue);
                    return;
                case 2033544052:  // eoAffectedPubs
                    ((EOOrder) bean).setEoAffectedPubs((Set<EOAffectedPub>) newValue);
                    return;
                case 196579464:  // isSftwareAffected
                    ((EOOrder) bean).setIsSftwareAffected((Boolean) newValue);
                    return;
                case -105650473:  // specificFeedback
                    ((EOOrder) bean).setSpecificFeedback((String) newValue);
                    return;
                case 996846992:  // addressOfFeedback
                    ((EOOrder) bean).setAddressOfFeedback((String) newValue);
                    return;
                case 1700522808:  // emailOfFeedback
                    ((EOOrder) bean).setEmailOfFeedback((String) newValue);
                    return;
                case 739671417:  // faxOfFeedback
                    ((EOOrder) bean).setFaxOfFeedback((String) newValue);
                    return;
                case -541084162:  // complexity
                    ((EOOrder) bean).setComplexity((Integer) newValue);
                    return;
                case 606175198:  // customer
                    ((EOOrder) bean).setCustomer((String) newValue);
                    return;
                case -1242821668:  // isImpRefit
                    ((EOOrder) bean).setIsImpRefit((Boolean) newValue);
                    return;
                case -1717075367:  // isSTERequired
                    ((EOOrder) bean).setIsSTERequired((Boolean) newValue);
                    return;
                case -1924922559:  // isMONRequired
                    ((EOOrder) bean).setIsMONRequired((Boolean) newValue);
                    return;
                case -166016300:  // revRecord
                    ((EOOrder) bean).setRevRecord((String) newValue);
                    return;
                case -166072121:  // revReason
                    ((EOOrder) bean).setRevReason((String) newValue);
                    return;
                case 1913602193:  // applDescription
                    ((EOOrder) bean).setApplDescription((String) newValue);
                    return;
                case -1174495462:  // materialDescr
                    ((EOOrder) bean).setMaterialDescr((String) newValue);
                    return;
                case 2145198396:  // eoStatus
                    ((EOOrder) bean).setEoStatus((String) newValue);
                    return;
                case 273537396:  // isClaimFH
                    ((EOOrder) bean).setIsClaimFH((Boolean) newValue);
                    return;
                case -110268722:  // isClaimMAT
                    ((EOOrder) bean).setIsClaimMAT((Boolean) newValue);
                    return;
                case -275408272:  // isTechSupReq
                    ((EOOrder) bean).setIsTechSupReq((Boolean) newValue);
                    return;
                case -1304748337:  // epReason
                    ((EOOrder) bean).setEpReason((String) newValue);
                    return;
                case -1760259020:  // isMatCostPredicate
                    ((EOOrder) bean).setIsMatCostPredicate((Boolean) newValue);
                    return;
                case -1202780486:  // matCostPredicated
                    ((EOOrder) bean).setMatCostPredicated((Double) newValue);
                    return;
                case -1885155202:  // matCostCurrency
                    ((EOOrder) bean).setMatCostCurrency((String) newValue);
                    return;
                case 351608024:  // version
                    ((EOOrder) bean).setVersion((String) newValue);
                    return;
                case 1812179624:  // airworthDirectives
                    ((EOOrder) bean).setAirworthDirectives((Set<AirworthDirective>) newValue);
                    return;
            }
            super.propertySet(bean, propertyName, newValue, quiet);
        }

    }

    ///CLOVER:ON
    //-------------------------- AUTOGENERATED END --------------------------
}
