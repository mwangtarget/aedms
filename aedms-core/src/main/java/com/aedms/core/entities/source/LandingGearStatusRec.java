package com.aedms.core.entities.source;

import com.aedms.core.entities.AedmsEntity;
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
import org.joda.beans.BeanDefinition;
import org.joda.beans.PropertyDefinition;
import java.util.Map;
import org.joda.beans.Bean;
import org.joda.beans.BeanBuilder;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.Property;
import org.joda.beans.impl.direct.DirectBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

/**
 * The Entity to representing LandingGearStatus record. The physical table is "LANDING_GEAR_STATUS_RECORD"
 * @author jaly
 */
@Entity
@Table(name = "LANDING_GEAR_STATUS_RECORD")
@BeanDefinition
public class LandingGearStatusRec extends AedmsEntity {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    @PropertyDefinition
    private Long id;
    
    @Column(name = "TSN")
    @PropertyDefinition
    private String tsn;
    
    @Column(name = "CSN")
    @PropertyDefinition
    private String csn;
    
    @Column(name = "TSO")
    @PropertyDefinition
    private String tso;
    
    @Column(name = "CSO")
    @PropertyDefinition
    private String cso;
    
    @Column(name = "LAST_RP_DATE")
    @Temporal(javax.persistence.TemporalType.DATE)
    @PropertyDefinition
    private Date lastRpDate;
    
    @Column(name = "LAST_RP_UNIT")
    @PropertyDefinition
    private String lastRpUnit;
    
    @Column(name = "INSTALL_DATE")
    @Temporal(javax.persistence.TemporalType.DATE)
    @PropertyDefinition
    private Date installDate;
    
    @Column(name = "INSTALL_ANO")
    @PropertyDefinition
    private String installAno;
    
    @Column(name = "INSTALL_POSITION")
    @PropertyDefinition
    private String installPosition;
    
    @Column(name = "INSTALL_FH")
    @PropertyDefinition
    private int installFH;
    
    @Column(name = "INSTALL_FC")
    @PropertyDefinition
    private int installFC;
    
    @Column(name = "TIME_LIMIT")
    @PropertyDefinition
    private String timeLimit;
    
    @Column(name = "REMAIN_TIME")
    @PropertyDefinition
    private String remainTime;
    
    @Column(name = "DOC_TYPE")
    @PropertyDefinition
    private String docType;
    
    @Column(name = "TEARDOWN_DATE")
    @Temporal(javax.persistence.TemporalType.DATE)
    @PropertyDefinition
    private Date tearDownDate;
    
    @Column(name = "TEARDOWN_ANO")
    @PropertyDefinition
    private String tearDownAno;
    
    @Column(name = "TEARDOWM_PIS")
    @PropertyDefinition
    private String tearDownPis;
    
    @Column(name = "TEARDOWN_CAUSE")
    @PropertyDefinition
    private String tearDownCause;
    
    @Column(name = "LANDING_GEAR_STATUS")
    @PropertyDefinition
    private String landingGearStatus;
    
    @Column(name = "REMARK")
    @PropertyDefinition
    private String remark;
    
    @Column(name = "RECORD_DATE")
    @Temporal(javax.persistence.TemporalType.DATE)
    @PropertyDefinition
    private Date recordDate;
    
    @Column(name = "REPAIR_DATE")
    @Temporal(javax.persistence.TemporalType.DATE)
    @PropertyDefinition
    private Date repairDate;
    
    @Column(name = "REPAIR_UNIT")
    @PropertyDefinition
    private String repairUnit;
    
    @Column(name = "OPT_TYPE")
    @PropertyDefinition
    private String optType;
    
    @ManyToOne
    @JoinColumn(name = "LANDING_GEAR_ID")
    @PropertyDefinition
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
    //------------------------- AUTOGENERATED START -------------------------
    ///CLOVER:OFF
    /**
     * The meta-bean for {@code LandingGearStatusRec}.
     * @return the meta-bean, not null
     */
    public static LandingGearStatusRec.Meta meta() {
        return LandingGearStatusRec.Meta.INSTANCE;
    }

    static {
        JodaBeanUtils.registerMetaBean(LandingGearStatusRec.Meta.INSTANCE);
    }

    @Override
    public LandingGearStatusRec.Meta metaBean() {
        return LandingGearStatusRec.Meta.INSTANCE;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the id.
     * @return the value of the property
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the id.
     * @param id  the new value of the property
     */
    public void setId(Long id) {
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
     * Gets the tsn.
     * @return the value of the property
     */
    public String getTsn() {
        return tsn;
    }

    /**
     * Sets the tsn.
     * @param tsn  the new value of the property
     */
    public void setTsn(String tsn) {
        this.tsn = tsn;
    }

    /**
     * Gets the the {@code tsn} property.
     * @return the property, not null
     */
    public final Property<String> tsn() {
        return metaBean().tsn().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the csn.
     * @return the value of the property
     */
    public String getCsn() {
        return csn;
    }

    /**
     * Sets the csn.
     * @param csn  the new value of the property
     */
    public void setCsn(String csn) {
        this.csn = csn;
    }

    /**
     * Gets the the {@code csn} property.
     * @return the property, not null
     */
    public final Property<String> csn() {
        return metaBean().csn().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the tso.
     * @return the value of the property
     */
    public String getTso() {
        return tso;
    }

    /**
     * Sets the tso.
     * @param tso  the new value of the property
     */
    public void setTso(String tso) {
        this.tso = tso;
    }

    /**
     * Gets the the {@code tso} property.
     * @return the property, not null
     */
    public final Property<String> tso() {
        return metaBean().tso().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the cso.
     * @return the value of the property
     */
    public String getCso() {
        return cso;
    }

    /**
     * Sets the cso.
     * @param cso  the new value of the property
     */
    public void setCso(String cso) {
        this.cso = cso;
    }

    /**
     * Gets the the {@code cso} property.
     * @return the property, not null
     */
    public final Property<String> cso() {
        return metaBean().cso().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the lastRpDate.
     * @return the value of the property
     */
    public Date getLastRpDate() {
        return lastRpDate;
    }

    /**
     * Sets the lastRpDate.
     * @param lastRpDate  the new value of the property
     */
    public void setLastRpDate(Date lastRpDate) {
        this.lastRpDate = lastRpDate;
    }

    /**
     * Gets the the {@code lastRpDate} property.
     * @return the property, not null
     */
    public final Property<Date> lastRpDate() {
        return metaBean().lastRpDate().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the lastRpUnit.
     * @return the value of the property
     */
    public String getLastRpUnit() {
        return lastRpUnit;
    }

    /**
     * Sets the lastRpUnit.
     * @param lastRpUnit  the new value of the property
     */
    public void setLastRpUnit(String lastRpUnit) {
        this.lastRpUnit = lastRpUnit;
    }

    /**
     * Gets the the {@code lastRpUnit} property.
     * @return the property, not null
     */
    public final Property<String> lastRpUnit() {
        return metaBean().lastRpUnit().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the installDate.
     * @return the value of the property
     */
    public Date getInstallDate() {
        return installDate;
    }

    /**
     * Sets the installDate.
     * @param installDate  the new value of the property
     */
    public void setInstallDate(Date installDate) {
        this.installDate = installDate;
    }

    /**
     * Gets the the {@code installDate} property.
     * @return the property, not null
     */
    public final Property<Date> installDate() {
        return metaBean().installDate().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the installAno.
     * @return the value of the property
     */
    public String getInstallAno() {
        return installAno;
    }

    /**
     * Sets the installAno.
     * @param installAno  the new value of the property
     */
    public void setInstallAno(String installAno) {
        this.installAno = installAno;
    }

    /**
     * Gets the the {@code installAno} property.
     * @return the property, not null
     */
    public final Property<String> installAno() {
        return metaBean().installAno().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the installPosition.
     * @return the value of the property
     */
    public String getInstallPosition() {
        return installPosition;
    }

    /**
     * Sets the installPosition.
     * @param installPosition  the new value of the property
     */
    public void setInstallPosition(String installPosition) {
        this.installPosition = installPosition;
    }

    /**
     * Gets the the {@code installPosition} property.
     * @return the property, not null
     */
    public final Property<String> installPosition() {
        return metaBean().installPosition().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the installFH.
     * @return the value of the property
     */
    public int getInstallFH() {
        return installFH;
    }

    /**
     * Sets the installFH.
     * @param installFH  the new value of the property
     */
    public void setInstallFH(int installFH) {
        this.installFH = installFH;
    }

    /**
     * Gets the the {@code installFH} property.
     * @return the property, not null
     */
    public final Property<Integer> installFH() {
        return metaBean().installFH().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the installFC.
     * @return the value of the property
     */
    public int getInstallFC() {
        return installFC;
    }

    /**
     * Sets the installFC.
     * @param installFC  the new value of the property
     */
    public void setInstallFC(int installFC) {
        this.installFC = installFC;
    }

    /**
     * Gets the the {@code installFC} property.
     * @return the property, not null
     */
    public final Property<Integer> installFC() {
        return metaBean().installFC().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the timeLimit.
     * @return the value of the property
     */
    public String getTimeLimit() {
        return timeLimit;
    }

    /**
     * Sets the timeLimit.
     * @param timeLimit  the new value of the property
     */
    public void setTimeLimit(String timeLimit) {
        this.timeLimit = timeLimit;
    }

    /**
     * Gets the the {@code timeLimit} property.
     * @return the property, not null
     */
    public final Property<String> timeLimit() {
        return metaBean().timeLimit().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the remainTime.
     * @return the value of the property
     */
    public String getRemainTime() {
        return remainTime;
    }

    /**
     * Sets the remainTime.
     * @param remainTime  the new value of the property
     */
    public void setRemainTime(String remainTime) {
        this.remainTime = remainTime;
    }

    /**
     * Gets the the {@code remainTime} property.
     * @return the property, not null
     */
    public final Property<String> remainTime() {
        return metaBean().remainTime().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the docType.
     * @return the value of the property
     */
    public String getDocType() {
        return docType;
    }

    /**
     * Sets the docType.
     * @param docType  the new value of the property
     */
    public void setDocType(String docType) {
        this.docType = docType;
    }

    /**
     * Gets the the {@code docType} property.
     * @return the property, not null
     */
    public final Property<String> docType() {
        return metaBean().docType().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the tearDownDate.
     * @return the value of the property
     */
    public Date getTearDownDate() {
        return tearDownDate;
    }

    /**
     * Sets the tearDownDate.
     * @param tearDownDate  the new value of the property
     */
    public void setTearDownDate(Date tearDownDate) {
        this.tearDownDate = tearDownDate;
    }

    /**
     * Gets the the {@code tearDownDate} property.
     * @return the property, not null
     */
    public final Property<Date> tearDownDate() {
        return metaBean().tearDownDate().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the tearDownAno.
     * @return the value of the property
     */
    public String getTearDownAno() {
        return tearDownAno;
    }

    /**
     * Sets the tearDownAno.
     * @param tearDownAno  the new value of the property
     */
    public void setTearDownAno(String tearDownAno) {
        this.tearDownAno = tearDownAno;
    }

    /**
     * Gets the the {@code tearDownAno} property.
     * @return the property, not null
     */
    public final Property<String> tearDownAno() {
        return metaBean().tearDownAno().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the tearDownPis.
     * @return the value of the property
     */
    public String getTearDownPis() {
        return tearDownPis;
    }

    /**
     * Sets the tearDownPis.
     * @param tearDownPis  the new value of the property
     */
    public void setTearDownPis(String tearDownPis) {
        this.tearDownPis = tearDownPis;
    }

    /**
     * Gets the the {@code tearDownPis} property.
     * @return the property, not null
     */
    public final Property<String> tearDownPis() {
        return metaBean().tearDownPis().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the tearDownCause.
     * @return the value of the property
     */
    public String getTearDownCause() {
        return tearDownCause;
    }

    /**
     * Sets the tearDownCause.
     * @param tearDownCause  the new value of the property
     */
    public void setTearDownCause(String tearDownCause) {
        this.tearDownCause = tearDownCause;
    }

    /**
     * Gets the the {@code tearDownCause} property.
     * @return the property, not null
     */
    public final Property<String> tearDownCause() {
        return metaBean().tearDownCause().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the landingGearStatus.
     * @return the value of the property
     */
    public String getLandingGearStatus() {
        return landingGearStatus;
    }

    /**
     * Sets the landingGearStatus.
     * @param landingGearStatus  the new value of the property
     */
    public void setLandingGearStatus(String landingGearStatus) {
        this.landingGearStatus = landingGearStatus;
    }

    /**
     * Gets the the {@code landingGearStatus} property.
     * @return the property, not null
     */
    public final Property<String> landingGearStatus() {
        return metaBean().landingGearStatus().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the remark.
     * @return the value of the property
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Sets the remark.
     * @param remark  the new value of the property
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * Gets the the {@code remark} property.
     * @return the property, not null
     */
    public final Property<String> remark() {
        return metaBean().remark().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the recordDate.
     * @return the value of the property
     */
    public Date getRecordDate() {
        return recordDate;
    }

    /**
     * Sets the recordDate.
     * @param recordDate  the new value of the property
     */
    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

    /**
     * Gets the the {@code recordDate} property.
     * @return the property, not null
     */
    public final Property<Date> recordDate() {
        return metaBean().recordDate().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the repairDate.
     * @return the value of the property
     */
    public Date getRepairDate() {
        return repairDate;
    }

    /**
     * Sets the repairDate.
     * @param repairDate  the new value of the property
     */
    public void setRepairDate(Date repairDate) {
        this.repairDate = repairDate;
    }

    /**
     * Gets the the {@code repairDate} property.
     * @return the property, not null
     */
    public final Property<Date> repairDate() {
        return metaBean().repairDate().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the repairUnit.
     * @return the value of the property
     */
    public String getRepairUnit() {
        return repairUnit;
    }

    /**
     * Sets the repairUnit.
     * @param repairUnit  the new value of the property
     */
    public void setRepairUnit(String repairUnit) {
        this.repairUnit = repairUnit;
    }

    /**
     * Gets the the {@code repairUnit} property.
     * @return the property, not null
     */
    public final Property<String> repairUnit() {
        return metaBean().repairUnit().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the optType.
     * @return the value of the property
     */
    public String getOptType() {
        return optType;
    }

    /**
     * Sets the optType.
     * @param optType  the new value of the property
     */
    public void setOptType(String optType) {
        this.optType = optType;
    }

    /**
     * Gets the the {@code optType} property.
     * @return the property, not null
     */
    public final Property<String> optType() {
        return metaBean().optType().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the landingGear.
     * @return the value of the property
     */
    public LandingGear getLandingGear() {
        return landingGear;
    }

    /**
     * Sets the landingGear.
     * @param landingGear  the new value of the property
     */
    public void setLandingGear(LandingGear landingGear) {
        this.landingGear = landingGear;
    }

    /**
     * Gets the the {@code landingGear} property.
     * @return the property, not null
     */
    public final Property<LandingGear> landingGear() {
        return metaBean().landingGear().createProperty(this);
    }

    //-----------------------------------------------------------------------
    @Override
    public LandingGearStatusRec clone() {
        return JodaBeanUtils.cloneAlways(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            LandingGearStatusRec other = (LandingGearStatusRec) obj;
            return JodaBeanUtils.equal(getId(), other.getId()) &&
                    JodaBeanUtils.equal(getTsn(), other.getTsn()) &&
                    JodaBeanUtils.equal(getCsn(), other.getCsn()) &&
                    JodaBeanUtils.equal(getTso(), other.getTso()) &&
                    JodaBeanUtils.equal(getCso(), other.getCso()) &&
                    JodaBeanUtils.equal(getLastRpDate(), other.getLastRpDate()) &&
                    JodaBeanUtils.equal(getLastRpUnit(), other.getLastRpUnit()) &&
                    JodaBeanUtils.equal(getInstallDate(), other.getInstallDate()) &&
                    JodaBeanUtils.equal(getInstallAno(), other.getInstallAno()) &&
                    JodaBeanUtils.equal(getInstallPosition(), other.getInstallPosition()) &&
                    (getInstallFH() == other.getInstallFH()) &&
                    (getInstallFC() == other.getInstallFC()) &&
                    JodaBeanUtils.equal(getTimeLimit(), other.getTimeLimit()) &&
                    JodaBeanUtils.equal(getRemainTime(), other.getRemainTime()) &&
                    JodaBeanUtils.equal(getDocType(), other.getDocType()) &&
                    JodaBeanUtils.equal(getTearDownDate(), other.getTearDownDate()) &&
                    JodaBeanUtils.equal(getTearDownAno(), other.getTearDownAno()) &&
                    JodaBeanUtils.equal(getTearDownPis(), other.getTearDownPis()) &&
                    JodaBeanUtils.equal(getTearDownCause(), other.getTearDownCause()) &&
                    JodaBeanUtils.equal(getLandingGearStatus(), other.getLandingGearStatus()) &&
                    JodaBeanUtils.equal(getRemark(), other.getRemark()) &&
                    JodaBeanUtils.equal(getRecordDate(), other.getRecordDate()) &&
                    JodaBeanUtils.equal(getRepairDate(), other.getRepairDate()) &&
                    JodaBeanUtils.equal(getRepairUnit(), other.getRepairUnit()) &&
                    JodaBeanUtils.equal(getOptType(), other.getOptType()) &&
                    JodaBeanUtils.equal(getLandingGear(), other.getLandingGear()) &&
                    super.equals(obj);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = hash * 31 + JodaBeanUtils.hashCode(getId());
        hash = hash * 31 + JodaBeanUtils.hashCode(getTsn());
        hash = hash * 31 + JodaBeanUtils.hashCode(getCsn());
        hash = hash * 31 + JodaBeanUtils.hashCode(getTso());
        hash = hash * 31 + JodaBeanUtils.hashCode(getCso());
        hash = hash * 31 + JodaBeanUtils.hashCode(getLastRpDate());
        hash = hash * 31 + JodaBeanUtils.hashCode(getLastRpUnit());
        hash = hash * 31 + JodaBeanUtils.hashCode(getInstallDate());
        hash = hash * 31 + JodaBeanUtils.hashCode(getInstallAno());
        hash = hash * 31 + JodaBeanUtils.hashCode(getInstallPosition());
        hash = hash * 31 + JodaBeanUtils.hashCode(getInstallFH());
        hash = hash * 31 + JodaBeanUtils.hashCode(getInstallFC());
        hash = hash * 31 + JodaBeanUtils.hashCode(getTimeLimit());
        hash = hash * 31 + JodaBeanUtils.hashCode(getRemainTime());
        hash = hash * 31 + JodaBeanUtils.hashCode(getDocType());
        hash = hash * 31 + JodaBeanUtils.hashCode(getTearDownDate());
        hash = hash * 31 + JodaBeanUtils.hashCode(getTearDownAno());
        hash = hash * 31 + JodaBeanUtils.hashCode(getTearDownPis());
        hash = hash * 31 + JodaBeanUtils.hashCode(getTearDownCause());
        hash = hash * 31 + JodaBeanUtils.hashCode(getLandingGearStatus());
        hash = hash * 31 + JodaBeanUtils.hashCode(getRemark());
        hash = hash * 31 + JodaBeanUtils.hashCode(getRecordDate());
        hash = hash * 31 + JodaBeanUtils.hashCode(getRepairDate());
        hash = hash * 31 + JodaBeanUtils.hashCode(getRepairUnit());
        hash = hash * 31 + JodaBeanUtils.hashCode(getOptType());
        hash = hash * 31 + JodaBeanUtils.hashCode(getLandingGear());
        return hash ^ super.hashCode();
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(864);
        buf.append("LandingGearStatusRec{");
        int len = buf.length();
        toString(buf);
        if (buf.length() > len) {
            buf.setLength(buf.length() - 2);
        }
        buf.append('}');
        return buf.toString();
    }

    @Override
    protected void toString(StringBuilder buf) {
        super.toString(buf);
        buf.append("id").append('=').append(JodaBeanUtils.toString(getId())).append(',').append(' ');
        buf.append("tsn").append('=').append(JodaBeanUtils.toString(getTsn())).append(',').append(' ');
        buf.append("csn").append('=').append(JodaBeanUtils.toString(getCsn())).append(',').append(' ');
        buf.append("tso").append('=').append(JodaBeanUtils.toString(getTso())).append(',').append(' ');
        buf.append("cso").append('=').append(JodaBeanUtils.toString(getCso())).append(',').append(' ');
        buf.append("lastRpDate").append('=').append(JodaBeanUtils.toString(getLastRpDate())).append(',').append(' ');
        buf.append("lastRpUnit").append('=').append(JodaBeanUtils.toString(getLastRpUnit())).append(',').append(' ');
        buf.append("installDate").append('=').append(JodaBeanUtils.toString(getInstallDate())).append(',').append(' ');
        buf.append("installAno").append('=').append(JodaBeanUtils.toString(getInstallAno())).append(',').append(' ');
        buf.append("installPosition").append('=').append(JodaBeanUtils.toString(getInstallPosition())).append(',').append(' ');
        buf.append("installFH").append('=').append(JodaBeanUtils.toString(getInstallFH())).append(',').append(' ');
        buf.append("installFC").append('=').append(JodaBeanUtils.toString(getInstallFC())).append(',').append(' ');
        buf.append("timeLimit").append('=').append(JodaBeanUtils.toString(getTimeLimit())).append(',').append(' ');
        buf.append("remainTime").append('=').append(JodaBeanUtils.toString(getRemainTime())).append(',').append(' ');
        buf.append("docType").append('=').append(JodaBeanUtils.toString(getDocType())).append(',').append(' ');
        buf.append("tearDownDate").append('=').append(JodaBeanUtils.toString(getTearDownDate())).append(',').append(' ');
        buf.append("tearDownAno").append('=').append(JodaBeanUtils.toString(getTearDownAno())).append(',').append(' ');
        buf.append("tearDownPis").append('=').append(JodaBeanUtils.toString(getTearDownPis())).append(',').append(' ');
        buf.append("tearDownCause").append('=').append(JodaBeanUtils.toString(getTearDownCause())).append(',').append(' ');
        buf.append("landingGearStatus").append('=').append(JodaBeanUtils.toString(getLandingGearStatus())).append(',').append(' ');
        buf.append("remark").append('=').append(JodaBeanUtils.toString(getRemark())).append(',').append(' ');
        buf.append("recordDate").append('=').append(JodaBeanUtils.toString(getRecordDate())).append(',').append(' ');
        buf.append("repairDate").append('=').append(JodaBeanUtils.toString(getRepairDate())).append(',').append(' ');
        buf.append("repairUnit").append('=').append(JodaBeanUtils.toString(getRepairUnit())).append(',').append(' ');
        buf.append("optType").append('=').append(JodaBeanUtils.toString(getOptType())).append(',').append(' ');
        buf.append("landingGear").append('=').append(JodaBeanUtils.toString(getLandingGear())).append(',').append(' ');
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code LandingGearStatusRec}.
     */
    public static class Meta extends AedmsEntity.Meta {
        /**
         * The singleton instance of the meta-bean.
         */
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-property for the {@code id} property.
         */
        private final MetaProperty<Long> id = DirectMetaProperty.ofReadWrite(
                this, "id", LandingGearStatusRec.class, Long.class);
        /**
         * The meta-property for the {@code tsn} property.
         */
        private final MetaProperty<String> tsn = DirectMetaProperty.ofReadWrite(
                this, "tsn", LandingGearStatusRec.class, String.class);
        /**
         * The meta-property for the {@code csn} property.
         */
        private final MetaProperty<String> csn = DirectMetaProperty.ofReadWrite(
                this, "csn", LandingGearStatusRec.class, String.class);
        /**
         * The meta-property for the {@code tso} property.
         */
        private final MetaProperty<String> tso = DirectMetaProperty.ofReadWrite(
                this, "tso", LandingGearStatusRec.class, String.class);
        /**
         * The meta-property for the {@code cso} property.
         */
        private final MetaProperty<String> cso = DirectMetaProperty.ofReadWrite(
                this, "cso", LandingGearStatusRec.class, String.class);
        /**
         * The meta-property for the {@code lastRpDate} property.
         */
        private final MetaProperty<Date> lastRpDate = DirectMetaProperty.ofReadWrite(
                this, "lastRpDate", LandingGearStatusRec.class, Date.class);
        /**
         * The meta-property for the {@code lastRpUnit} property.
         */
        private final MetaProperty<String> lastRpUnit = DirectMetaProperty.ofReadWrite(
                this, "lastRpUnit", LandingGearStatusRec.class, String.class);
        /**
         * The meta-property for the {@code installDate} property.
         */
        private final MetaProperty<Date> installDate = DirectMetaProperty.ofReadWrite(
                this, "installDate", LandingGearStatusRec.class, Date.class);
        /**
         * The meta-property for the {@code installAno} property.
         */
        private final MetaProperty<String> installAno = DirectMetaProperty.ofReadWrite(
                this, "installAno", LandingGearStatusRec.class, String.class);
        /**
         * The meta-property for the {@code installPosition} property.
         */
        private final MetaProperty<String> installPosition = DirectMetaProperty.ofReadWrite(
                this, "installPosition", LandingGearStatusRec.class, String.class);
        /**
         * The meta-property for the {@code installFH} property.
         */
        private final MetaProperty<Integer> installFH = DirectMetaProperty.ofReadWrite(
                this, "installFH", LandingGearStatusRec.class, Integer.TYPE);
        /**
         * The meta-property for the {@code installFC} property.
         */
        private final MetaProperty<Integer> installFC = DirectMetaProperty.ofReadWrite(
                this, "installFC", LandingGearStatusRec.class, Integer.TYPE);
        /**
         * The meta-property for the {@code timeLimit} property.
         */
        private final MetaProperty<String> timeLimit = DirectMetaProperty.ofReadWrite(
                this, "timeLimit", LandingGearStatusRec.class, String.class);
        /**
         * The meta-property for the {@code remainTime} property.
         */
        private final MetaProperty<String> remainTime = DirectMetaProperty.ofReadWrite(
                this, "remainTime", LandingGearStatusRec.class, String.class);
        /**
         * The meta-property for the {@code docType} property.
         */
        private final MetaProperty<String> docType = DirectMetaProperty.ofReadWrite(
                this, "docType", LandingGearStatusRec.class, String.class);
        /**
         * The meta-property for the {@code tearDownDate} property.
         */
        private final MetaProperty<Date> tearDownDate = DirectMetaProperty.ofReadWrite(
                this, "tearDownDate", LandingGearStatusRec.class, Date.class);
        /**
         * The meta-property for the {@code tearDownAno} property.
         */
        private final MetaProperty<String> tearDownAno = DirectMetaProperty.ofReadWrite(
                this, "tearDownAno", LandingGearStatusRec.class, String.class);
        /**
         * The meta-property for the {@code tearDownPis} property.
         */
        private final MetaProperty<String> tearDownPis = DirectMetaProperty.ofReadWrite(
                this, "tearDownPis", LandingGearStatusRec.class, String.class);
        /**
         * The meta-property for the {@code tearDownCause} property.
         */
        private final MetaProperty<String> tearDownCause = DirectMetaProperty.ofReadWrite(
                this, "tearDownCause", LandingGearStatusRec.class, String.class);
        /**
         * The meta-property for the {@code landingGearStatus} property.
         */
        private final MetaProperty<String> landingGearStatus = DirectMetaProperty.ofReadWrite(
                this, "landingGearStatus", LandingGearStatusRec.class, String.class);
        /**
         * The meta-property for the {@code remark} property.
         */
        private final MetaProperty<String> remark = DirectMetaProperty.ofReadWrite(
                this, "remark", LandingGearStatusRec.class, String.class);
        /**
         * The meta-property for the {@code recordDate} property.
         */
        private final MetaProperty<Date> recordDate = DirectMetaProperty.ofReadWrite(
                this, "recordDate", LandingGearStatusRec.class, Date.class);
        /**
         * The meta-property for the {@code repairDate} property.
         */
        private final MetaProperty<Date> repairDate = DirectMetaProperty.ofReadWrite(
                this, "repairDate", LandingGearStatusRec.class, Date.class);
        /**
         * The meta-property for the {@code repairUnit} property.
         */
        private final MetaProperty<String> repairUnit = DirectMetaProperty.ofReadWrite(
                this, "repairUnit", LandingGearStatusRec.class, String.class);
        /**
         * The meta-property for the {@code optType} property.
         */
        private final MetaProperty<String> optType = DirectMetaProperty.ofReadWrite(
                this, "optType", LandingGearStatusRec.class, String.class);
        /**
         * The meta-property for the {@code landingGear} property.
         */
        private final MetaProperty<LandingGear> landingGear = DirectMetaProperty.ofReadWrite(
                this, "landingGear", LandingGearStatusRec.class, LandingGear.class);
        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
                this, (DirectMetaPropertyMap) super.metaPropertyMap(),
                "id",
                "tsn",
                "csn",
                "tso",
                "cso",
                "lastRpDate",
                "lastRpUnit",
                "installDate",
                "installAno",
                "installPosition",
                "installFH",
                "installFC",
                "timeLimit",
                "remainTime",
                "docType",
                "tearDownDate",
                "tearDownAno",
                "tearDownPis",
                "tearDownCause",
                "landingGearStatus",
                "remark",
                "recordDate",
                "repairDate",
                "repairUnit",
                "optType",
                "landingGear");

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
                case 115151:  // tsn
                    return tsn;
                case 98814:  // csn
                    return csn;
                case 115152:  // tso
                    return tso;
                case 98815:  // cso
                    return cso;
                case 1906039106:  // lastRpDate
                    return lastRpDate;
                case 1906557720:  // lastRpUnit
                    return lastRpUnit;
                case 2143044585:  // installDate
                    return installDate;
                case 900411975:  // installAno
                    return installAno;
                case -1063954460:  // installPosition
                    return installPosition;
                case 29045661:  // installFH
                    return installFH;
                case 29045656:  // installFC
                    return installFC;
                case 18792686:  // timeLimit
                    return timeLimit;
                case 1194554201:  // remainTime
                    return remainTime;
                case 1827941522:  // docType
                    return docType;
                case 703171570:  // tearDownDate
                    return tearDownDate;
                case 438322462:  // tearDownAno
                    return tearDownAno;
                case 438336726:  // tearDownPis
                    return tearDownPis;
                case 322560165:  // tearDownCause
                    return tearDownCause;
                case 525931480:  // landingGearStatus
                    return landingGearStatus;
                case -934624384:  // remark
                    return remark;
                case 734412703:  // recordDate
                    return recordDate;
                case 2131227867:  // repairDate
                    return repairDate;
                case 2131746481:  // repairUnit
                    return repairUnit;
                case -1250090867:  // optType
                    return optType;
                case 496837702:  // landingGear
                    return landingGear;
            }
            return super.metaPropertyGet(propertyName);
        }

        @Override
        public BeanBuilder<? extends LandingGearStatusRec> builder() {
            return new DirectBeanBuilder<LandingGearStatusRec>(new LandingGearStatusRec());
        }

        @Override
        public Class<? extends LandingGearStatusRec> beanType() {
            return LandingGearStatusRec.class;
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
         * The meta-property for the {@code tsn} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> tsn() {
            return tsn;
        }

        /**
         * The meta-property for the {@code csn} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> csn() {
            return csn;
        }

        /**
         * The meta-property for the {@code tso} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> tso() {
            return tso;
        }

        /**
         * The meta-property for the {@code cso} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> cso() {
            return cso;
        }

        /**
         * The meta-property for the {@code lastRpDate} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Date> lastRpDate() {
            return lastRpDate;
        }

        /**
         * The meta-property for the {@code lastRpUnit} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> lastRpUnit() {
            return lastRpUnit;
        }

        /**
         * The meta-property for the {@code installDate} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Date> installDate() {
            return installDate;
        }

        /**
         * The meta-property for the {@code installAno} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> installAno() {
            return installAno;
        }

        /**
         * The meta-property for the {@code installPosition} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> installPosition() {
            return installPosition;
        }

        /**
         * The meta-property for the {@code installFH} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Integer> installFH() {
            return installFH;
        }

        /**
         * The meta-property for the {@code installFC} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Integer> installFC() {
            return installFC;
        }

        /**
         * The meta-property for the {@code timeLimit} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> timeLimit() {
            return timeLimit;
        }

        /**
         * The meta-property for the {@code remainTime} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> remainTime() {
            return remainTime;
        }

        /**
         * The meta-property for the {@code docType} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> docType() {
            return docType;
        }

        /**
         * The meta-property for the {@code tearDownDate} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Date> tearDownDate() {
            return tearDownDate;
        }

        /**
         * The meta-property for the {@code tearDownAno} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> tearDownAno() {
            return tearDownAno;
        }

        /**
         * The meta-property for the {@code tearDownPis} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> tearDownPis() {
            return tearDownPis;
        }

        /**
         * The meta-property for the {@code tearDownCause} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> tearDownCause() {
            return tearDownCause;
        }

        /**
         * The meta-property for the {@code landingGearStatus} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> landingGearStatus() {
            return landingGearStatus;
        }

        /**
         * The meta-property for the {@code remark} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> remark() {
            return remark;
        }

        /**
         * The meta-property for the {@code recordDate} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Date> recordDate() {
            return recordDate;
        }

        /**
         * The meta-property for the {@code repairDate} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Date> repairDate() {
            return repairDate;
        }

        /**
         * The meta-property for the {@code repairUnit} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> repairUnit() {
            return repairUnit;
        }

        /**
         * The meta-property for the {@code optType} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> optType() {
            return optType;
        }

        /**
         * The meta-property for the {@code landingGear} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<LandingGear> landingGear() {
            return landingGear;
        }

        //-----------------------------------------------------------------------
        @Override
        protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 3355:  // id
                    return ((LandingGearStatusRec) bean).getId();
                case 115151:  // tsn
                    return ((LandingGearStatusRec) bean).getTsn();
                case 98814:  // csn
                    return ((LandingGearStatusRec) bean).getCsn();
                case 115152:  // tso
                    return ((LandingGearStatusRec) bean).getTso();
                case 98815:  // cso
                    return ((LandingGearStatusRec) bean).getCso();
                case 1906039106:  // lastRpDate
                    return ((LandingGearStatusRec) bean).getLastRpDate();
                case 1906557720:  // lastRpUnit
                    return ((LandingGearStatusRec) bean).getLastRpUnit();
                case 2143044585:  // installDate
                    return ((LandingGearStatusRec) bean).getInstallDate();
                case 900411975:  // installAno
                    return ((LandingGearStatusRec) bean).getInstallAno();
                case -1063954460:  // installPosition
                    return ((LandingGearStatusRec) bean).getInstallPosition();
                case 29045661:  // installFH
                    return ((LandingGearStatusRec) bean).getInstallFH();
                case 29045656:  // installFC
                    return ((LandingGearStatusRec) bean).getInstallFC();
                case 18792686:  // timeLimit
                    return ((LandingGearStatusRec) bean).getTimeLimit();
                case 1194554201:  // remainTime
                    return ((LandingGearStatusRec) bean).getRemainTime();
                case 1827941522:  // docType
                    return ((LandingGearStatusRec) bean).getDocType();
                case 703171570:  // tearDownDate
                    return ((LandingGearStatusRec) bean).getTearDownDate();
                case 438322462:  // tearDownAno
                    return ((LandingGearStatusRec) bean).getTearDownAno();
                case 438336726:  // tearDownPis
                    return ((LandingGearStatusRec) bean).getTearDownPis();
                case 322560165:  // tearDownCause
                    return ((LandingGearStatusRec) bean).getTearDownCause();
                case 525931480:  // landingGearStatus
                    return ((LandingGearStatusRec) bean).getLandingGearStatus();
                case -934624384:  // remark
                    return ((LandingGearStatusRec) bean).getRemark();
                case 734412703:  // recordDate
                    return ((LandingGearStatusRec) bean).getRecordDate();
                case 2131227867:  // repairDate
                    return ((LandingGearStatusRec) bean).getRepairDate();
                case 2131746481:  // repairUnit
                    return ((LandingGearStatusRec) bean).getRepairUnit();
                case -1250090867:  // optType
                    return ((LandingGearStatusRec) bean).getOptType();
                case 496837702:  // landingGear
                    return ((LandingGearStatusRec) bean).getLandingGear();
            }
            return super.propertyGet(bean, propertyName, quiet);
        }

        @Override
        protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 3355:  // id
                    ((LandingGearStatusRec) bean).setId((Long) newValue);
                    return;
                case 115151:  // tsn
                    ((LandingGearStatusRec) bean).setTsn((String) newValue);
                    return;
                case 98814:  // csn
                    ((LandingGearStatusRec) bean).setCsn((String) newValue);
                    return;
                case 115152:  // tso
                    ((LandingGearStatusRec) bean).setTso((String) newValue);
                    return;
                case 98815:  // cso
                    ((LandingGearStatusRec) bean).setCso((String) newValue);
                    return;
                case 1906039106:  // lastRpDate
                    ((LandingGearStatusRec) bean).setLastRpDate((Date) newValue);
                    return;
                case 1906557720:  // lastRpUnit
                    ((LandingGearStatusRec) bean).setLastRpUnit((String) newValue);
                    return;
                case 2143044585:  // installDate
                    ((LandingGearStatusRec) bean).setInstallDate((Date) newValue);
                    return;
                case 900411975:  // installAno
                    ((LandingGearStatusRec) bean).setInstallAno((String) newValue);
                    return;
                case -1063954460:  // installPosition
                    ((LandingGearStatusRec) bean).setInstallPosition((String) newValue);
                    return;
                case 29045661:  // installFH
                    ((LandingGearStatusRec) bean).setInstallFH((Integer) newValue);
                    return;
                case 29045656:  // installFC
                    ((LandingGearStatusRec) bean).setInstallFC((Integer) newValue);
                    return;
                case 18792686:  // timeLimit
                    ((LandingGearStatusRec) bean).setTimeLimit((String) newValue);
                    return;
                case 1194554201:  // remainTime
                    ((LandingGearStatusRec) bean).setRemainTime((String) newValue);
                    return;
                case 1827941522:  // docType
                    ((LandingGearStatusRec) bean).setDocType((String) newValue);
                    return;
                case 703171570:  // tearDownDate
                    ((LandingGearStatusRec) bean).setTearDownDate((Date) newValue);
                    return;
                case 438322462:  // tearDownAno
                    ((LandingGearStatusRec) bean).setTearDownAno((String) newValue);
                    return;
                case 438336726:  // tearDownPis
                    ((LandingGearStatusRec) bean).setTearDownPis((String) newValue);
                    return;
                case 322560165:  // tearDownCause
                    ((LandingGearStatusRec) bean).setTearDownCause((String) newValue);
                    return;
                case 525931480:  // landingGearStatus
                    ((LandingGearStatusRec) bean).setLandingGearStatus((String) newValue);
                    return;
                case -934624384:  // remark
                    ((LandingGearStatusRec) bean).setRemark((String) newValue);
                    return;
                case 734412703:  // recordDate
                    ((LandingGearStatusRec) bean).setRecordDate((Date) newValue);
                    return;
                case 2131227867:  // repairDate
                    ((LandingGearStatusRec) bean).setRepairDate((Date) newValue);
                    return;
                case 2131746481:  // repairUnit
                    ((LandingGearStatusRec) bean).setRepairUnit((String) newValue);
                    return;
                case -1250090867:  // optType
                    ((LandingGearStatusRec) bean).setOptType((String) newValue);
                    return;
                case 496837702:  // landingGear
                    ((LandingGearStatusRec) bean).setLandingGear((LandingGear) newValue);
                    return;
            }
            super.propertySet(bean, propertyName, newValue, quiet);
        }

    }

    ///CLOVER:ON
    //-------------------------- AUTOGENERATED END --------------------------
}
