package com.aedms.core.entities.source;

import com.aedms.core.entities.AedmsEntity;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
 * The Entity to representing Landing Gear information.
 * The physical table is "LANDING_GEAR"
 * 
 * @author jaly
 */
@Entity
@Table(name = "LANDING_GEAR")
//@Audited
@BeanDefinition
public class LandingGear extends AedmsEntity {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    @PropertyDefinition
    private long id;
    
    @Column(name = "MODEL")
    @PropertyDefinition
    private String model;
    
    @Column(name = "SN")
    @PropertyDefinition
    private String SN;
    
    @Column(name = "MANUFACTURE_DATE")
    @Temporal(javax.persistence.TemporalType.DATE)
    @PropertyDefinition
    private Date manufactureDate;
    
    @Column(name = "RENT_DATE")
    @Temporal(javax.persistence.TemporalType.DATE)
    @PropertyDefinition
    private Date rentDate;
    
    @Column(name = "LEASE_HOLD")
    @PropertyDefinition
    private String leaseHold;
    
    @Column(name = "LEASE_HOLDER")
    @PropertyDefinition
    private String leaseHolder;
    
    @Column(name = "ORP")
    @PropertyDefinition
    private String orp;
    
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="landingGear")
    @PropertyDefinition
    private Set<LandingGearStatusRec> landingGearStatusRecs;
    
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="landingGear")
    @PropertyDefinition
    private Set<LandingGearOperationRec> landingGearOperationRecs;

    @ManyToOne
    @JoinColumn(name = "AIRCRAFT_ID")
    @PropertyDefinition
    private AirCraft aircraft;
    
    /** Constructor block list */
    public LandingGear(){}
    
    @UseBuilderGenerator
    public LandingGear(@Mandatory String model, @Mandatory String sN, @Mandatory Date manufactureDate, Date rentDate, String leaseHold,
            String leaseHolder, String orp, Set<LandingGearStatusRec> landingGearStatusRecs,
            Set<LandingGearOperationRec> landingGearOperationRecs, @Mandatory AirCraft aircraft) {
        super();
        this.model = model;
        SN = sN;
        this.manufactureDate = manufactureDate;
        this.rentDate = rentDate;
        this.leaseHold = leaseHold;
        this.leaseHolder = leaseHolder;
        this.orp = orp;
        this.landingGearStatusRecs = landingGearStatusRecs;
        this.landingGearOperationRecs = landingGearOperationRecs;
        this.aircraft = aircraft;
    }
    //------------------------- AUTOGENERATED START -------------------------
    ///CLOVER:OFF
    /**
     * The meta-bean for {@code LandingGear}.
     * @return the meta-bean, not null
     */
    public static LandingGear.Meta meta() {
        return LandingGear.Meta.INSTANCE;
    }

    static {
        JodaBeanUtils.registerMetaBean(LandingGear.Meta.INSTANCE);
    }

    @Override
    public LandingGear.Meta metaBean() {
        return LandingGear.Meta.INSTANCE;
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
     * Gets the model.
     * @return the value of the property
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the model.
     * @param model  the new value of the property
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Gets the the {@code model} property.
     * @return the property, not null
     */
    public final Property<String> model() {
        return metaBean().model().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the SN.
     * @return the value of the property
     */
    public String getSN() {
        return SN;
    }

    /**
     * Sets the SN.
     * @param SN  the new value of the property
     */
    public void setSN(String SN) {
        this.SN = SN;
    }

    /**
     * Gets the the {@code SN} property.
     * @return the property, not null
     */
    public final Property<String> SN() {
        return metaBean().SN().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the manufactureDate.
     * @return the value of the property
     */
    public Date getManufactureDate() {
        return manufactureDate;
    }

    /**
     * Sets the manufactureDate.
     * @param manufactureDate  the new value of the property
     */
    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    /**
     * Gets the the {@code manufactureDate} property.
     * @return the property, not null
     */
    public final Property<Date> manufactureDate() {
        return metaBean().manufactureDate().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the rentDate.
     * @return the value of the property
     */
    public Date getRentDate() {
        return rentDate;
    }

    /**
     * Sets the rentDate.
     * @param rentDate  the new value of the property
     */
    public void setRentDate(Date rentDate) {
        this.rentDate = rentDate;
    }

    /**
     * Gets the the {@code rentDate} property.
     * @return the property, not null
     */
    public final Property<Date> rentDate() {
        return metaBean().rentDate().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the leaseHold.
     * @return the value of the property
     */
    public String getLeaseHold() {
        return leaseHold;
    }

    /**
     * Sets the leaseHold.
     * @param leaseHold  the new value of the property
     */
    public void setLeaseHold(String leaseHold) {
        this.leaseHold = leaseHold;
    }

    /**
     * Gets the the {@code leaseHold} property.
     * @return the property, not null
     */
    public final Property<String> leaseHold() {
        return metaBean().leaseHold().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the leaseHolder.
     * @return the value of the property
     */
    public String getLeaseHolder() {
        return leaseHolder;
    }

    /**
     * Sets the leaseHolder.
     * @param leaseHolder  the new value of the property
     */
    public void setLeaseHolder(String leaseHolder) {
        this.leaseHolder = leaseHolder;
    }

    /**
     * Gets the the {@code leaseHolder} property.
     * @return the property, not null
     */
    public final Property<String> leaseHolder() {
        return metaBean().leaseHolder().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the orp.
     * @return the value of the property
     */
    public String getOrp() {
        return orp;
    }

    /**
     * Sets the orp.
     * @param orp  the new value of the property
     */
    public void setOrp(String orp) {
        this.orp = orp;
    }

    /**
     * Gets the the {@code orp} property.
     * @return the property, not null
     */
    public final Property<String> orp() {
        return metaBean().orp().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the landingGearStatusRecs.
     * @return the value of the property
     */
    public Set<LandingGearStatusRec> getLandingGearStatusRecs() {
        return landingGearStatusRecs;
    }

    /**
     * Sets the landingGearStatusRecs.
     * @param landingGearStatusRecs  the new value of the property
     */
    public void setLandingGearStatusRecs(Set<LandingGearStatusRec> landingGearStatusRecs) {
        this.landingGearStatusRecs = landingGearStatusRecs;
    }

    /**
     * Gets the the {@code landingGearStatusRecs} property.
     * @return the property, not null
     */
    public final Property<Set<LandingGearStatusRec>> landingGearStatusRecs() {
        return metaBean().landingGearStatusRecs().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the landingGearOperationRecs.
     * @return the value of the property
     */
    public Set<LandingGearOperationRec> getLandingGearOperationRecs() {
        return landingGearOperationRecs;
    }

    /**
     * Sets the landingGearOperationRecs.
     * @param landingGearOperationRecs  the new value of the property
     */
    public void setLandingGearOperationRecs(Set<LandingGearOperationRec> landingGearOperationRecs) {
        this.landingGearOperationRecs = landingGearOperationRecs;
    }

    /**
     * Gets the the {@code landingGearOperationRecs} property.
     * @return the property, not null
     */
    public final Property<Set<LandingGearOperationRec>> landingGearOperationRecs() {
        return metaBean().landingGearOperationRecs().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the aircraft.
     * @return the value of the property
     */
    public AirCraft getAircraft() {
        return aircraft;
    }

    /**
     * Sets the aircraft.
     * @param aircraft  the new value of the property
     */
    public void setAircraft(AirCraft aircraft) {
        this.aircraft = aircraft;
    }

    /**
     * Gets the the {@code aircraft} property.
     * @return the property, not null
     */
    public final Property<AirCraft> aircraft() {
        return metaBean().aircraft().createProperty(this);
    }

    //-----------------------------------------------------------------------
    @Override
    public LandingGear clone() {
        return JodaBeanUtils.cloneAlways(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            LandingGear other = (LandingGear) obj;
            return (getId() == other.getId()) &&
                    JodaBeanUtils.equal(getModel(), other.getModel()) &&
                    JodaBeanUtils.equal(getSN(), other.getSN()) &&
                    JodaBeanUtils.equal(getManufactureDate(), other.getManufactureDate()) &&
                    JodaBeanUtils.equal(getRentDate(), other.getRentDate()) &&
                    JodaBeanUtils.equal(getLeaseHold(), other.getLeaseHold()) &&
                    JodaBeanUtils.equal(getLeaseHolder(), other.getLeaseHolder()) &&
                    JodaBeanUtils.equal(getOrp(), other.getOrp()) &&
                    JodaBeanUtils.equal(getLandingGearStatusRecs(), other.getLandingGearStatusRecs()) &&
                    JodaBeanUtils.equal(getLandingGearOperationRecs(), other.getLandingGearOperationRecs()) &&
                    JodaBeanUtils.equal(getAircraft(), other.getAircraft()) &&
                    super.equals(obj);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = hash * 31 + JodaBeanUtils.hashCode(getId());
        hash = hash * 31 + JodaBeanUtils.hashCode(getModel());
        hash = hash * 31 + JodaBeanUtils.hashCode(getSN());
        hash = hash * 31 + JodaBeanUtils.hashCode(getManufactureDate());
        hash = hash * 31 + JodaBeanUtils.hashCode(getRentDate());
        hash = hash * 31 + JodaBeanUtils.hashCode(getLeaseHold());
        hash = hash * 31 + JodaBeanUtils.hashCode(getLeaseHolder());
        hash = hash * 31 + JodaBeanUtils.hashCode(getOrp());
        hash = hash * 31 + JodaBeanUtils.hashCode(getLandingGearStatusRecs());
        hash = hash * 31 + JodaBeanUtils.hashCode(getLandingGearOperationRecs());
        hash = hash * 31 + JodaBeanUtils.hashCode(getAircraft());
        return hash ^ super.hashCode();
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(384);
        buf.append("LandingGear{");
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
        buf.append("model").append('=').append(JodaBeanUtils.toString(getModel())).append(',').append(' ');
        buf.append("SN").append('=').append(JodaBeanUtils.toString(getSN())).append(',').append(' ');
        buf.append("manufactureDate").append('=').append(JodaBeanUtils.toString(getManufactureDate())).append(',').append(' ');
        buf.append("rentDate").append('=').append(JodaBeanUtils.toString(getRentDate())).append(',').append(' ');
        buf.append("leaseHold").append('=').append(JodaBeanUtils.toString(getLeaseHold())).append(',').append(' ');
        buf.append("leaseHolder").append('=').append(JodaBeanUtils.toString(getLeaseHolder())).append(',').append(' ');
        buf.append("orp").append('=').append(JodaBeanUtils.toString(getOrp())).append(',').append(' ');
        buf.append("landingGearStatusRecs").append('=').append(JodaBeanUtils.toString(getLandingGearStatusRecs())).append(',').append(' ');
        buf.append("landingGearOperationRecs").append('=').append(JodaBeanUtils.toString(getLandingGearOperationRecs())).append(',').append(' ');
        buf.append("aircraft").append('=').append(JodaBeanUtils.toString(getAircraft())).append(',').append(' ');
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code LandingGear}.
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
                this, "id", LandingGear.class, Long.TYPE);
        /**
         * The meta-property for the {@code model} property.
         */
        private final MetaProperty<String> model = DirectMetaProperty.ofReadWrite(
                this, "model", LandingGear.class, String.class);
        /**
         * The meta-property for the {@code SN} property.
         */
        private final MetaProperty<String> SN = DirectMetaProperty.ofReadWrite(
                this, "SN", LandingGear.class, String.class);
        /**
         * The meta-property for the {@code manufactureDate} property.
         */
        private final MetaProperty<Date> manufactureDate = DirectMetaProperty.ofReadWrite(
                this, "manufactureDate", LandingGear.class, Date.class);
        /**
         * The meta-property for the {@code rentDate} property.
         */
        private final MetaProperty<Date> rentDate = DirectMetaProperty.ofReadWrite(
                this, "rentDate", LandingGear.class, Date.class);
        /**
         * The meta-property for the {@code leaseHold} property.
         */
        private final MetaProperty<String> leaseHold = DirectMetaProperty.ofReadWrite(
                this, "leaseHold", LandingGear.class, String.class);
        /**
         * The meta-property for the {@code leaseHolder} property.
         */
        private final MetaProperty<String> leaseHolder = DirectMetaProperty.ofReadWrite(
                this, "leaseHolder", LandingGear.class, String.class);
        /**
         * The meta-property for the {@code orp} property.
         */
        private final MetaProperty<String> orp = DirectMetaProperty.ofReadWrite(
                this, "orp", LandingGear.class, String.class);
        /**
         * The meta-property for the {@code landingGearStatusRecs} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<Set<LandingGearStatusRec>> landingGearStatusRecs = DirectMetaProperty.ofReadWrite(
                this, "landingGearStatusRecs", LandingGear.class, (Class) Set.class);
        /**
         * The meta-property for the {@code landingGearOperationRecs} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<Set<LandingGearOperationRec>> landingGearOperationRecs = DirectMetaProperty.ofReadWrite(
                this, "landingGearOperationRecs", LandingGear.class, (Class) Set.class);
        /**
         * The meta-property for the {@code aircraft} property.
         */
        private final MetaProperty<AirCraft> aircraft = DirectMetaProperty.ofReadWrite(
                this, "aircraft", LandingGear.class, AirCraft.class);
        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
                this, (DirectMetaPropertyMap) super.metaPropertyMap(),
                "id",
                "model",
                "SN",
                "manufactureDate",
                "rentDate",
                "leaseHold",
                "leaseHolder",
                "orp",
                "landingGearStatusRecs",
                "landingGearOperationRecs",
                "aircraft");

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
                case 104069929:  // model
                    return model;
                case 2651:  // SN
                    return SN;
                case 416714767:  // manufactureDate
                    return manufactureDate;
                case -481068409:  // rentDate
                    return rentDate;
                case 1575025209:  // leaseHold
                    return leaseHold;
                case 1770740902:  // leaseHolder
                    return leaseHolder;
                case 110317:  // orp
                    return orp;
                case -492685861:  // landingGearStatusRecs
                    return landingGearStatusRecs;
                case -778287804:  // landingGearOperationRecs
                    return landingGearOperationRecs;
                case -688838890:  // aircraft
                    return aircraft;
            }
            return super.metaPropertyGet(propertyName);
        }

        @Override
        public BeanBuilder<? extends LandingGear> builder() {
            return new DirectBeanBuilder<LandingGear>(new LandingGear());
        }

        @Override
        public Class<? extends LandingGear> beanType() {
            return LandingGear.class;
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
         * The meta-property for the {@code model} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> model() {
            return model;
        }

        /**
         * The meta-property for the {@code SN} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> SN() {
            return SN;
        }

        /**
         * The meta-property for the {@code manufactureDate} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Date> manufactureDate() {
            return manufactureDate;
        }

        /**
         * The meta-property for the {@code rentDate} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Date> rentDate() {
            return rentDate;
        }

        /**
         * The meta-property for the {@code leaseHold} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> leaseHold() {
            return leaseHold;
        }

        /**
         * The meta-property for the {@code leaseHolder} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> leaseHolder() {
            return leaseHolder;
        }

        /**
         * The meta-property for the {@code orp} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> orp() {
            return orp;
        }

        /**
         * The meta-property for the {@code landingGearStatusRecs} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Set<LandingGearStatusRec>> landingGearStatusRecs() {
            return landingGearStatusRecs;
        }

        /**
         * The meta-property for the {@code landingGearOperationRecs} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Set<LandingGearOperationRec>> landingGearOperationRecs() {
            return landingGearOperationRecs;
        }

        /**
         * The meta-property for the {@code aircraft} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<AirCraft> aircraft() {
            return aircraft;
        }

        //-----------------------------------------------------------------------
        @Override
        protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 3355:  // id
                    return ((LandingGear) bean).getId();
                case 104069929:  // model
                    return ((LandingGear) bean).getModel();
                case 2651:  // SN
                    return ((LandingGear) bean).getSN();
                case 416714767:  // manufactureDate
                    return ((LandingGear) bean).getManufactureDate();
                case -481068409:  // rentDate
                    return ((LandingGear) bean).getRentDate();
                case 1575025209:  // leaseHold
                    return ((LandingGear) bean).getLeaseHold();
                case 1770740902:  // leaseHolder
                    return ((LandingGear) bean).getLeaseHolder();
                case 110317:  // orp
                    return ((LandingGear) bean).getOrp();
                case -492685861:  // landingGearStatusRecs
                    return ((LandingGear) bean).getLandingGearStatusRecs();
                case -778287804:  // landingGearOperationRecs
                    return ((LandingGear) bean).getLandingGearOperationRecs();
                case -688838890:  // aircraft
                    return ((LandingGear) bean).getAircraft();
            }
            return super.propertyGet(bean, propertyName, quiet);
        }

        @SuppressWarnings("unchecked")
        @Override
        protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 3355:  // id
                    ((LandingGear) bean).setId((Long) newValue);
                    return;
                case 104069929:  // model
                    ((LandingGear) bean).setModel((String) newValue);
                    return;
                case 2651:  // SN
                    ((LandingGear) bean).setSN((String) newValue);
                    return;
                case 416714767:  // manufactureDate
                    ((LandingGear) bean).setManufactureDate((Date) newValue);
                    return;
                case -481068409:  // rentDate
                    ((LandingGear) bean).setRentDate((Date) newValue);
                    return;
                case 1575025209:  // leaseHold
                    ((LandingGear) bean).setLeaseHold((String) newValue);
                    return;
                case 1770740902:  // leaseHolder
                    ((LandingGear) bean).setLeaseHolder((String) newValue);
                    return;
                case 110317:  // orp
                    ((LandingGear) bean).setOrp((String) newValue);
                    return;
                case -492685861:  // landingGearStatusRecs
                    ((LandingGear) bean).setLandingGearStatusRecs((Set<LandingGearStatusRec>) newValue);
                    return;
                case -778287804:  // landingGearOperationRecs
                    ((LandingGear) bean).setLandingGearOperationRecs((Set<LandingGearOperationRec>) newValue);
                    return;
                case -688838890:  // aircraft
                    ((LandingGear) bean).setAircraft((AirCraft) newValue);
                    return;
            }
            super.propertySet(bean, propertyName, newValue, quiet);
        }

    }

    ///CLOVER:ON
    //-------------------------- AUTOGENERATED END --------------------------
}
