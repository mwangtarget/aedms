package com.aedms.core.entities.eo;

import com.aedms.core.entities.AedmsEntity;
import fr.lteconsulting.UseBuilderGenerator;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import org.joda.beans.BeanDefinition;
import org.joda.beans.Property;
import org.joda.beans.PropertyDefinition;
import java.util.Map;
import org.joda.beans.Bean;
import org.joda.beans.BeanBuilder;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

/**
 *
 * @author jaly
 */
@Entity
@Table(name = "EO_POSTPONEMENT")
@BeanDefinition
public class EOPostponement extends AedmsEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    @PropertyDefinition
    private long id;

    @Column(name = "REPORT_BASE", length = 50)
    @PropertyDefinition
    private String reportBase;

    /**
     * 延期次数
     */
    @Column(name = "POST_TIME")
    @PropertyDefinition
    private int postTime;

    @Column(name = "LAST_PP_DATE", length = 1000)
    @PropertyDefinition
    private String lastPPDate;


    @Column(name = "PPC_DESC", length = 4000)
    @PropertyDefinition
    private String ppcDescription;

    /**
     * 申请次数
     */
    @Column(name = "APPLY_TIME")
    @PropertyDefinition
    private int applyTime;

    @Column(name = "EXTEND_LMT_TXT", length = 1000)
    @PropertyDefinition
    private String extendLimitTxt;

    @Column(name = "DELAY_STATUS", length = 10)
    @PropertyDefinition
    private String delayStatus;

    @Column(name = "CLOSE_TIME")
    @Temporal(javax.persistence.TemporalType.DATE)
    @PropertyDefinition
    private Date closeTime;

    
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name="EORDER_ID")
    @PropertyDefinition
    private EOOrder eoOrder;

    public EOPostponement() {
    }
    
    /**
     * 
     * @param reportBase
     * @param affect
     * @param postTime
     * @param lastPPDate
     * @param timeList
     * @param ppcDescription
     * @param applyTime
     * @param extendLimitTxt
     * @param delayStatus
     * @param closeTime
     * @param eoOrder 
     */
    
    //------------------------- AUTOGENERATED START -------------------------
    ///CLOVER:OFF
    /**
     * The meta-bean for {@code EOPostponement}.
     * @return the meta-bean, not null
     */
    public static EOPostponement.Meta meta() {
        return EOPostponement.Meta.INSTANCE;
    }

    static {
        JodaBeanUtils.registerMetaBean(EOPostponement.Meta.INSTANCE);
    }

    @Override
    public EOPostponement.Meta metaBean() {
        return EOPostponement.Meta.INSTANCE;
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
     * Gets the reportBase.
     * @return the value of the property
     */
    public String getReportBase() {
        return reportBase;
    }

    /**
     * Sets the reportBase.
     * @param reportBase  the new value of the property
     */
    public void setReportBase(String reportBase) {
        this.reportBase = reportBase;
    }

    /**
     * Gets the the {@code reportBase} property.
     * @return the property, not null
     */
    public final Property<String> reportBase() {
        return metaBean().reportBase().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets 延期次数
     * @return the value of the property
     */
    public int getPostTime() {
        return postTime;
    }

    /**
     * Sets 延期次数
     * @param postTime  the new value of the property
     */
    public void setPostTime(int postTime) {
        this.postTime = postTime;
    }

    /**
     * Gets the the {@code postTime} property.
     * @return the property, not null
     */
    public final Property<Integer> postTime() {
        return metaBean().postTime().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the lastPPDate.
     * @return the value of the property
     */
    public String getLastPPDate() {
        return lastPPDate;
    }

    /**
     * Sets the lastPPDate.
     * @param lastPPDate  the new value of the property
     */
    public void setLastPPDate(String lastPPDate) {
        this.lastPPDate = lastPPDate;
    }

    /**
     * Gets the the {@code lastPPDate} property.
     * @return the property, not null
     */
    public final Property<String> lastPPDate() {
        return metaBean().lastPPDate().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the ppcDescription.
     * @return the value of the property
     */
    public String getPpcDescription() {
        return ppcDescription;
    }

    /**
     * Sets the ppcDescription.
     * @param ppcDescription  the new value of the property
     */
    public void setPpcDescription(String ppcDescription) {
        this.ppcDescription = ppcDescription;
    }

    /**
     * Gets the the {@code ppcDescription} property.
     * @return the property, not null
     */
    public final Property<String> ppcDescription() {
        return metaBean().ppcDescription().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets 申请次数
     * @return the value of the property
     */
    public int getApplyTime() {
        return applyTime;
    }

    /**
     * Sets 申请次数
     * @param applyTime  the new value of the property
     */
    public void setApplyTime(int applyTime) {
        this.applyTime = applyTime;
    }

    /**
     * Gets the the {@code applyTime} property.
     * @return the property, not null
     */
    public final Property<Integer> applyTime() {
        return metaBean().applyTime().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the extendLimitTxt.
     * @return the value of the property
     */
    public String getExtendLimitTxt() {
        return extendLimitTxt;
    }

    /**
     * Sets the extendLimitTxt.
     * @param extendLimitTxt  the new value of the property
     */
    public void setExtendLimitTxt(String extendLimitTxt) {
        this.extendLimitTxt = extendLimitTxt;
    }

    /**
     * Gets the the {@code extendLimitTxt} property.
     * @return the property, not null
     */
    public final Property<String> extendLimitTxt() {
        return metaBean().extendLimitTxt().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the delayStatus.
     * @return the value of the property
     */
    public String getDelayStatus() {
        return delayStatus;
    }

    /**
     * Sets the delayStatus.
     * @param delayStatus  the new value of the property
     */
    public void setDelayStatus(String delayStatus) {
        this.delayStatus = delayStatus;
    }

    /**
     * Gets the the {@code delayStatus} property.
     * @return the property, not null
     */
    public final Property<String> delayStatus() {
        return metaBean().delayStatus().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the closeTime.
     * @return the value of the property
     */
    public Date getCloseTime() {
        return closeTime;
    }

    /**
     * Sets the closeTime.
     * @param closeTime  the new value of the property
     */
    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    /**
     * Gets the the {@code closeTime} property.
     * @return the property, not null
     */
    public final Property<Date> closeTime() {
        return metaBean().closeTime().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the eoOrder.
     * @return the value of the property
     */
    public EOOrder getEoOrder() {
        return eoOrder;
    }

    /**
     * Sets the eoOrder.
     * @param eoOrder  the new value of the property
     */
    public void setEoOrder(EOOrder eoOrder) {
        this.eoOrder = eoOrder;
    }

    /**
     * Gets the the {@code eoOrder} property.
     * @return the property, not null
     */
    public final Property<EOOrder> eoOrder() {
        return metaBean().eoOrder().createProperty(this);
    }

    //-----------------------------------------------------------------------
    @Override
    public EOPostponement clone() {
        return JodaBeanUtils.cloneAlways(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            EOPostponement other = (EOPostponement) obj;
            return (getId() == other.getId()) &&
                    JodaBeanUtils.equal(getReportBase(), other.getReportBase()) &&
                    (getPostTime() == other.getPostTime()) &&
                    JodaBeanUtils.equal(getLastPPDate(), other.getLastPPDate()) &&
                    JodaBeanUtils.equal(getPpcDescription(), other.getPpcDescription()) &&
                    (getApplyTime() == other.getApplyTime()) &&
                    JodaBeanUtils.equal(getExtendLimitTxt(), other.getExtendLimitTxt()) &&
                    JodaBeanUtils.equal(getDelayStatus(), other.getDelayStatus()) &&
                    JodaBeanUtils.equal(getCloseTime(), other.getCloseTime()) &&
                    JodaBeanUtils.equal(getEoOrder(), other.getEoOrder()) &&
                    super.equals(obj);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = hash * 31 + JodaBeanUtils.hashCode(getId());
        hash = hash * 31 + JodaBeanUtils.hashCode(getReportBase());
        hash = hash * 31 + JodaBeanUtils.hashCode(getPostTime());
        hash = hash * 31 + JodaBeanUtils.hashCode(getLastPPDate());
        hash = hash * 31 + JodaBeanUtils.hashCode(getPpcDescription());
        hash = hash * 31 + JodaBeanUtils.hashCode(getApplyTime());
        hash = hash * 31 + JodaBeanUtils.hashCode(getExtendLimitTxt());
        hash = hash * 31 + JodaBeanUtils.hashCode(getDelayStatus());
        hash = hash * 31 + JodaBeanUtils.hashCode(getCloseTime());
        hash = hash * 31 + JodaBeanUtils.hashCode(getEoOrder());
        return hash ^ super.hashCode();
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(352);
        buf.append("EOPostponement{");
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
        buf.append("reportBase").append('=').append(JodaBeanUtils.toString(getReportBase())).append(',').append(' ');
        buf.append("postTime").append('=').append(JodaBeanUtils.toString(getPostTime())).append(',').append(' ');
        buf.append("lastPPDate").append('=').append(JodaBeanUtils.toString(getLastPPDate())).append(',').append(' ');
        buf.append("ppcDescription").append('=').append(JodaBeanUtils.toString(getPpcDescription())).append(',').append(' ');
        buf.append("applyTime").append('=').append(JodaBeanUtils.toString(getApplyTime())).append(',').append(' ');
        buf.append("extendLimitTxt").append('=').append(JodaBeanUtils.toString(getExtendLimitTxt())).append(',').append(' ');
        buf.append("delayStatus").append('=').append(JodaBeanUtils.toString(getDelayStatus())).append(',').append(' ');
        buf.append("closeTime").append('=').append(JodaBeanUtils.toString(getCloseTime())).append(',').append(' ');
        buf.append("eoOrder").append('=').append(JodaBeanUtils.toString(getEoOrder())).append(',').append(' ');
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code EOPostponement}.
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
                this, "id", EOPostponement.class, Long.TYPE);
        /**
         * The meta-property for the {@code reportBase} property.
         */
        private final MetaProperty<String> reportBase = DirectMetaProperty.ofReadWrite(
                this, "reportBase", EOPostponement.class, String.class);
        /**
         * The meta-property for the {@code postTime} property.
         */
        private final MetaProperty<Integer> postTime = DirectMetaProperty.ofReadWrite(
                this, "postTime", EOPostponement.class, Integer.TYPE);
        /**
         * The meta-property for the {@code lastPPDate} property.
         */
        private final MetaProperty<String> lastPPDate = DirectMetaProperty.ofReadWrite(
                this, "lastPPDate", EOPostponement.class, String.class);
        /**
         * The meta-property for the {@code ppcDescription} property.
         */
        private final MetaProperty<String> ppcDescription = DirectMetaProperty.ofReadWrite(
                this, "ppcDescription", EOPostponement.class, String.class);
        /**
         * The meta-property for the {@code applyTime} property.
         */
        private final MetaProperty<Integer> applyTime = DirectMetaProperty.ofReadWrite(
                this, "applyTime", EOPostponement.class, Integer.TYPE);
        /**
         * The meta-property for the {@code extendLimitTxt} property.
         */
        private final MetaProperty<String> extendLimitTxt = DirectMetaProperty.ofReadWrite(
                this, "extendLimitTxt", EOPostponement.class, String.class);
        /**
         * The meta-property for the {@code delayStatus} property.
         */
        private final MetaProperty<String> delayStatus = DirectMetaProperty.ofReadWrite(
                this, "delayStatus", EOPostponement.class, String.class);
        /**
         * The meta-property for the {@code closeTime} property.
         */
        private final MetaProperty<Date> closeTime = DirectMetaProperty.ofReadWrite(
                this, "closeTime", EOPostponement.class, Date.class);
        /**
         * The meta-property for the {@code eoOrder} property.
         */
        private final MetaProperty<EOOrder> eoOrder = DirectMetaProperty.ofReadWrite(
                this, "eoOrder", EOPostponement.class, EOOrder.class);
        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
                this, (DirectMetaPropertyMap) super.metaPropertyMap(),
                "id",
                "reportBase",
                "postTime",
                "lastPPDate",
                "ppcDescription",
                "applyTime",
                "extendLimitTxt",
                "delayStatus",
                "closeTime",
                "eoOrder");

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
                case 1930827301:  // reportBase
                    return reportBase;
                case 757010317:  // postTime
                    return postTime;
                case 1819228132:  // lastPPDate
                    return lastPPDate;
                case 548220313:  // ppcDescription
                    return ppcDescription;
                case -2075663525:  // applyTime
                    return applyTime;
                case 1345620463:  // extendLimitTxt
                    return extendLimitTxt;
                case 142935893:  // delayStatus
                    return delayStatus;
                case -482481947:  // closeTime
                    return closeTime;
                case -1597119292:  // eoOrder
                    return eoOrder;
            }
            return super.metaPropertyGet(propertyName);
        }

        @Override
        public BeanBuilder<? extends EOPostponement> builder() {
            return new DirectBeanBuilder<EOPostponement>(new EOPostponement());
        }

        @Override
        public Class<? extends EOPostponement> beanType() {
            return EOPostponement.class;
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
         * The meta-property for the {@code reportBase} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> reportBase() {
            return reportBase;
        }

        /**
         * The meta-property for the {@code postTime} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Integer> postTime() {
            return postTime;
        }

        /**
         * The meta-property for the {@code lastPPDate} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> lastPPDate() {
            return lastPPDate;
        }

        /**
         * The meta-property for the {@code ppcDescription} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> ppcDescription() {
            return ppcDescription;
        }

        /**
         * The meta-property for the {@code applyTime} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Integer> applyTime() {
            return applyTime;
        }

        /**
         * The meta-property for the {@code extendLimitTxt} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> extendLimitTxt() {
            return extendLimitTxt;
        }

        /**
         * The meta-property for the {@code delayStatus} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> delayStatus() {
            return delayStatus;
        }

        /**
         * The meta-property for the {@code closeTime} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Date> closeTime() {
            return closeTime;
        }

        /**
         * The meta-property for the {@code eoOrder} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<EOOrder> eoOrder() {
            return eoOrder;
        }

        //-----------------------------------------------------------------------
        @Override
        protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 3355:  // id
                    return ((EOPostponement) bean).getId();
                case 1930827301:  // reportBase
                    return ((EOPostponement) bean).getReportBase();
                case 757010317:  // postTime
                    return ((EOPostponement) bean).getPostTime();
                case 1819228132:  // lastPPDate
                    return ((EOPostponement) bean).getLastPPDate();
                case 548220313:  // ppcDescription
                    return ((EOPostponement) bean).getPpcDescription();
                case -2075663525:  // applyTime
                    return ((EOPostponement) bean).getApplyTime();
                case 1345620463:  // extendLimitTxt
                    return ((EOPostponement) bean).getExtendLimitTxt();
                case 142935893:  // delayStatus
                    return ((EOPostponement) bean).getDelayStatus();
                case -482481947:  // closeTime
                    return ((EOPostponement) bean).getCloseTime();
                case -1597119292:  // eoOrder
                    return ((EOPostponement) bean).getEoOrder();
            }
            return super.propertyGet(bean, propertyName, quiet);
        }

        @Override
        protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 3355:  // id
                    ((EOPostponement) bean).setId((Long) newValue);
                    return;
                case 1930827301:  // reportBase
                    ((EOPostponement) bean).setReportBase((String) newValue);
                    return;
                case 757010317:  // postTime
                    ((EOPostponement) bean).setPostTime((Integer) newValue);
                    return;
                case 1819228132:  // lastPPDate
                    ((EOPostponement) bean).setLastPPDate((String) newValue);
                    return;
                case 548220313:  // ppcDescription
                    ((EOPostponement) bean).setPpcDescription((String) newValue);
                    return;
                case -2075663525:  // applyTime
                    ((EOPostponement) bean).setApplyTime((Integer) newValue);
                    return;
                case 1345620463:  // extendLimitTxt
                    ((EOPostponement) bean).setExtendLimitTxt((String) newValue);
                    return;
                case 142935893:  // delayStatus
                    ((EOPostponement) bean).setDelayStatus((String) newValue);
                    return;
                case -482481947:  // closeTime
                    ((EOPostponement) bean).setCloseTime((Date) newValue);
                    return;
                case -1597119292:  // eoOrder
                    ((EOPostponement) bean).setEoOrder((EOOrder) newValue);
                    return;
            }
            super.propertySet(bean, propertyName, newValue, quiet);
        }

    }

    ///CLOVER:ON
    //-------------------------- AUTOGENERATED END --------------------------
}
