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

import fr.lteconsulting.Mandatory;
import fr.lteconsulting.UseBuilderGenerator;
import org.joda.beans.BeanDefinition;
import org.joda.beans.PropertyDefinition;
import java.util.Map;
import javax.persistence.Temporal;
import org.joda.beans.Bean;
import org.joda.beans.BeanBuilder;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.Property;
import org.joda.beans.impl.direct.DirectBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

/**
 *
 * @author jaly
 */
@Entity
@Table(name="APU_OPEARTION_RECORD")
@BeanDefinition
public class APUOperationRec extends AedmsEntity {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    @PropertyDefinition
    private Long id;
   
    @Column(name = "TSN")
    @PropertyDefinition
    private float tsn;
    
    @Column(name = "CSN")
    @PropertyDefinition
    private int csn;
    
    @Column(name = "TSO")
    @PropertyDefinition
    private float tso;
    
    @Column(name = "CSO")
    @PropertyDefinition
    private int cso;
    
    @Column(name = "INSTALL_FH")
    @PropertyDefinition
    private float installFH;
    
    @Column(name = "INSTALL_FC")
    @PropertyDefinition
    private int installFC;
    
    @Column(name = "REMAIN_FH")
    @PropertyDefinition
    private float remainFH;
    
    @Column(name = "REMAIN_FC")
    @PropertyDefinition
    private int remainFC;
    
    @Column(name = "RECORD_DATE")
    @PropertyDefinition
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date recordDate;
    
    @ManyToOne
    @JoinColumn(name = "APU_ID")
    @PropertyDefinition
    private APU apu;
    
    /** Constructor List block */
    public APUOperationRec(){}
    
    @UseBuilderGenerator
    public APUOperationRec(@Mandatory float tsn, @Mandatory int csn, @Mandatory float tso, int cso, float installFH, int installFC, float remainFH,
            @Mandatory int remainFC, @Mandatory Date recordDate, @Mandatory APU apu) {
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
        this.apu = apu;
    }
    //------------------------- AUTOGENERATED START -------------------------
    ///CLOVER:OFF
    /**
     * The meta-bean for {@code APUOperationRec}.
     * @return the meta-bean, not null
     */
    public static APUOperationRec.Meta meta() {
        return APUOperationRec.Meta.INSTANCE;
    }

    static {
        JodaBeanUtils.registerMetaBean(APUOperationRec.Meta.INSTANCE);
    }

    @Override
    public APUOperationRec.Meta metaBean() {
        return APUOperationRec.Meta.INSTANCE;
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
    public float getTsn() {
        return tsn;
    }

    /**
     * Sets the tsn.
     * @param tsn  the new value of the property
     */
    public void setTsn(float tsn) {
        this.tsn = tsn;
    }

    /**
     * Gets the the {@code tsn} property.
     * @return the property, not null
     */
    public final Property<Float> tsn() {
        return metaBean().tsn().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the csn.
     * @return the value of the property
     */
    public int getCsn() {
        return csn;
    }

    /**
     * Sets the csn.
     * @param csn  the new value of the property
     */
    public void setCsn(int csn) {
        this.csn = csn;
    }

    /**
     * Gets the the {@code csn} property.
     * @return the property, not null
     */
    public final Property<Integer> csn() {
        return metaBean().csn().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the tso.
     * @return the value of the property
     */
    public float getTso() {
        return tso;
    }

    /**
     * Sets the tso.
     * @param tso  the new value of the property
     */
    public void setTso(float tso) {
        this.tso = tso;
    }

    /**
     * Gets the the {@code tso} property.
     * @return the property, not null
     */
    public final Property<Float> tso() {
        return metaBean().tso().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the cso.
     * @return the value of the property
     */
    public int getCso() {
        return cso;
    }

    /**
     * Sets the cso.
     * @param cso  the new value of the property
     */
    public void setCso(int cso) {
        this.cso = cso;
    }

    /**
     * Gets the the {@code cso} property.
     * @return the property, not null
     */
    public final Property<Integer> cso() {
        return metaBean().cso().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the installFH.
     * @return the value of the property
     */
    public float getInstallFH() {
        return installFH;
    }

    /**
     * Sets the installFH.
     * @param installFH  the new value of the property
     */
    public void setInstallFH(float installFH) {
        this.installFH = installFH;
    }

    /**
     * Gets the the {@code installFH} property.
     * @return the property, not null
     */
    public final Property<Float> installFH() {
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
     * Gets the remainFH.
     * @return the value of the property
     */
    public float getRemainFH() {
        return remainFH;
    }

    /**
     * Sets the remainFH.
     * @param remainFH  the new value of the property
     */
    public void setRemainFH(float remainFH) {
        this.remainFH = remainFH;
    }

    /**
     * Gets the the {@code remainFH} property.
     * @return the property, not null
     */
    public final Property<Float> remainFH() {
        return metaBean().remainFH().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the remainFC.
     * @return the value of the property
     */
    public int getRemainFC() {
        return remainFC;
    }

    /**
     * Sets the remainFC.
     * @param remainFC  the new value of the property
     */
    public void setRemainFC(int remainFC) {
        this.remainFC = remainFC;
    }

    /**
     * Gets the the {@code remainFC} property.
     * @return the property, not null
     */
    public final Property<Integer> remainFC() {
        return metaBean().remainFC().createProperty(this);
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
     * Gets the apu.
     * @return the value of the property
     */
    public APU getApu() {
        return apu;
    }

    /**
     * Sets the apu.
     * @param apu  the new value of the property
     */
    public void setApu(APU apu) {
        this.apu = apu;
    }

    /**
     * Gets the the {@code apu} property.
     * @return the property, not null
     */
    public final Property<APU> apu() {
        return metaBean().apu().createProperty(this);
    }

    //-----------------------------------------------------------------------
    @Override
    public APUOperationRec clone() {
        return JodaBeanUtils.cloneAlways(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            APUOperationRec other = (APUOperationRec) obj;
            return JodaBeanUtils.equal(getId(), other.getId()) &&
                    JodaBeanUtils.equal(getTsn(), other.getTsn()) &&
                    (getCsn() == other.getCsn()) &&
                    JodaBeanUtils.equal(getTso(), other.getTso()) &&
                    (getCso() == other.getCso()) &&
                    JodaBeanUtils.equal(getInstallFH(), other.getInstallFH()) &&
                    (getInstallFC() == other.getInstallFC()) &&
                    JodaBeanUtils.equal(getRemainFH(), other.getRemainFH()) &&
                    (getRemainFC() == other.getRemainFC()) &&
                    JodaBeanUtils.equal(getRecordDate(), other.getRecordDate()) &&
                    JodaBeanUtils.equal(getApu(), other.getApu()) &&
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
        hash = hash * 31 + JodaBeanUtils.hashCode(getInstallFH());
        hash = hash * 31 + JodaBeanUtils.hashCode(getInstallFC());
        hash = hash * 31 + JodaBeanUtils.hashCode(getRemainFH());
        hash = hash * 31 + JodaBeanUtils.hashCode(getRemainFC());
        hash = hash * 31 + JodaBeanUtils.hashCode(getRecordDate());
        hash = hash * 31 + JodaBeanUtils.hashCode(getApu());
        return hash ^ super.hashCode();
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(384);
        buf.append("APUOperationRec{");
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
        buf.append("installFH").append('=').append(JodaBeanUtils.toString(getInstallFH())).append(',').append(' ');
        buf.append("installFC").append('=').append(JodaBeanUtils.toString(getInstallFC())).append(',').append(' ');
        buf.append("remainFH").append('=').append(JodaBeanUtils.toString(getRemainFH())).append(',').append(' ');
        buf.append("remainFC").append('=').append(JodaBeanUtils.toString(getRemainFC())).append(',').append(' ');
        buf.append("recordDate").append('=').append(JodaBeanUtils.toString(getRecordDate())).append(',').append(' ');
        buf.append("apu").append('=').append(JodaBeanUtils.toString(getApu())).append(',').append(' ');
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code APUOperationRec}.
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
                this, "id", APUOperationRec.class, Long.class);
        /**
         * The meta-property for the {@code tsn} property.
         */
        private final MetaProperty<Float> tsn = DirectMetaProperty.ofReadWrite(
                this, "tsn", APUOperationRec.class, Float.TYPE);
        /**
         * The meta-property for the {@code csn} property.
         */
        private final MetaProperty<Integer> csn = DirectMetaProperty.ofReadWrite(
                this, "csn", APUOperationRec.class, Integer.TYPE);
        /**
         * The meta-property for the {@code tso} property.
         */
        private final MetaProperty<Float> tso = DirectMetaProperty.ofReadWrite(
                this, "tso", APUOperationRec.class, Float.TYPE);
        /**
         * The meta-property for the {@code cso} property.
         */
        private final MetaProperty<Integer> cso = DirectMetaProperty.ofReadWrite(
                this, "cso", APUOperationRec.class, Integer.TYPE);
        /**
         * The meta-property for the {@code installFH} property.
         */
        private final MetaProperty<Float> installFH = DirectMetaProperty.ofReadWrite(
                this, "installFH", APUOperationRec.class, Float.TYPE);
        /**
         * The meta-property for the {@code installFC} property.
         */
        private final MetaProperty<Integer> installFC = DirectMetaProperty.ofReadWrite(
                this, "installFC", APUOperationRec.class, Integer.TYPE);
        /**
         * The meta-property for the {@code remainFH} property.
         */
        private final MetaProperty<Float> remainFH = DirectMetaProperty.ofReadWrite(
                this, "remainFH", APUOperationRec.class, Float.TYPE);
        /**
         * The meta-property for the {@code remainFC} property.
         */
        private final MetaProperty<Integer> remainFC = DirectMetaProperty.ofReadWrite(
                this, "remainFC", APUOperationRec.class, Integer.TYPE);
        /**
         * The meta-property for the {@code recordDate} property.
         */
        private final MetaProperty<Date> recordDate = DirectMetaProperty.ofReadWrite(
                this, "recordDate", APUOperationRec.class, Date.class);
        /**
         * The meta-property for the {@code apu} property.
         */
        private final MetaProperty<APU> apu = DirectMetaProperty.ofReadWrite(
                this, "apu", APUOperationRec.class, APU.class);
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
                "installFH",
                "installFC",
                "remainFH",
                "remainFC",
                "recordDate",
                "apu");

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
                case 29045661:  // installFH
                    return installFH;
                case 29045656:  // installFC
                    return installFC;
                case -526131154:  // remainFH
                    return remainFH;
                case -526131159:  // remainFC
                    return remainFC;
                case 734412703:  // recordDate
                    return recordDate;
                case 96806:  // apu
                    return apu;
            }
            return super.metaPropertyGet(propertyName);
        }

        @Override
        public BeanBuilder<? extends APUOperationRec> builder() {
            return new DirectBeanBuilder<APUOperationRec>(new APUOperationRec());
        }

        @Override
        public Class<? extends APUOperationRec> beanType() {
            return APUOperationRec.class;
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
        public final MetaProperty<Float> tsn() {
            return tsn;
        }

        /**
         * The meta-property for the {@code csn} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Integer> csn() {
            return csn;
        }

        /**
         * The meta-property for the {@code tso} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Float> tso() {
            return tso;
        }

        /**
         * The meta-property for the {@code cso} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Integer> cso() {
            return cso;
        }

        /**
         * The meta-property for the {@code installFH} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Float> installFH() {
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
         * The meta-property for the {@code remainFH} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Float> remainFH() {
            return remainFH;
        }

        /**
         * The meta-property for the {@code remainFC} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Integer> remainFC() {
            return remainFC;
        }

        /**
         * The meta-property for the {@code recordDate} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Date> recordDate() {
            return recordDate;
        }

        /**
         * The meta-property for the {@code apu} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<APU> apu() {
            return apu;
        }

        //-----------------------------------------------------------------------
        @Override
        protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 3355:  // id
                    return ((APUOperationRec) bean).getId();
                case 115151:  // tsn
                    return ((APUOperationRec) bean).getTsn();
                case 98814:  // csn
                    return ((APUOperationRec) bean).getCsn();
                case 115152:  // tso
                    return ((APUOperationRec) bean).getTso();
                case 98815:  // cso
                    return ((APUOperationRec) bean).getCso();
                case 29045661:  // installFH
                    return ((APUOperationRec) bean).getInstallFH();
                case 29045656:  // installFC
                    return ((APUOperationRec) bean).getInstallFC();
                case -526131154:  // remainFH
                    return ((APUOperationRec) bean).getRemainFH();
                case -526131159:  // remainFC
                    return ((APUOperationRec) bean).getRemainFC();
                case 734412703:  // recordDate
                    return ((APUOperationRec) bean).getRecordDate();
                case 96806:  // apu
                    return ((APUOperationRec) bean).getApu();
            }
            return super.propertyGet(bean, propertyName, quiet);
        }

        @Override
        protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 3355:  // id
                    ((APUOperationRec) bean).setId((Long) newValue);
                    return;
                case 115151:  // tsn
                    ((APUOperationRec) bean).setTsn((Float) newValue);
                    return;
                case 98814:  // csn
                    ((APUOperationRec) bean).setCsn((Integer) newValue);
                    return;
                case 115152:  // tso
                    ((APUOperationRec) bean).setTso((Float) newValue);
                    return;
                case 98815:  // cso
                    ((APUOperationRec) bean).setCso((Integer) newValue);
                    return;
                case 29045661:  // installFH
                    ((APUOperationRec) bean).setInstallFH((Float) newValue);
                    return;
                case 29045656:  // installFC
                    ((APUOperationRec) bean).setInstallFC((Integer) newValue);
                    return;
                case -526131154:  // remainFH
                    ((APUOperationRec) bean).setRemainFH((Float) newValue);
                    return;
                case -526131159:  // remainFC
                    ((APUOperationRec) bean).setRemainFC((Integer) newValue);
                    return;
                case 734412703:  // recordDate
                    ((APUOperationRec) bean).setRecordDate((Date) newValue);
                    return;
                case 96806:  // apu
                    ((APUOperationRec) bean).setApu((APU) newValue);
                    return;
            }
            super.propertySet(bean, propertyName, newValue, quiet);
        }

    }

    ///CLOVER:ON
    //-------------------------- AUTOGENERATED END --------------------------
}
