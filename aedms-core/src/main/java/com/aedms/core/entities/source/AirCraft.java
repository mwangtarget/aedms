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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

import fr.lteconsulting.Mandatory;
import fr.lteconsulting.UseBuilderGenerator;
import org.joda.beans.BeanDefinition;
import java.util.Map;
import org.joda.beans.BeanBuilder;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

/**
 * The Entity to representing AirCraft. The physical table is "AIRCRAFT"
 *
 * @author mwang
 * @since 0.1
 *
 * -------------------------------------------------------------------------------- 
 * Changed Date    Changed By 　　　Description
 * 2016-05-08      Jaly        　　Change Engine from one2one to One2Many
 *
 */
@Entity
@Table(name = "AIRCRAFT")
//@Audited // Cause error: An audited relation to a not audited entity
@BeanDefinition
public class AirCraft extends AedmsEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    
    private Long id;

    @Column(name = "FLEET", length = 20, nullable = true)
    private String fleet;

    @Column(name = "SUB_FLEET", length = 20, nullable = true)
    private String subFleet;

    @Column(name = "SERIAL_NO", length = 20, nullable = true)
    private String serialNo;

    @Column(name = "REGISTER_NO", length = 6, nullable = true)
    private String registerNo;

    @Column(name = "MODEL", length = 6)
    private String model;

    @Column(name = "SN", length = 20)
    private String SN;

    @Column(name = "LN", length = 20)
    private String LN;

    @Column(name = "VARIABLE_NO", length = 5)
    private String variableNo;

    @Column(name = "VIRFRAME_NO", length = 5)
    private String virframeNo;

    @Column(name = "IPC_REF_NO", length = 5)
    private String ipcRefNo;

    @Column(name = "MANUFACTURE_DATE")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date manufactureDate;

    @Column(name = "LEASING_DELIVERY_DATE")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date leasingDeliveryDate;

    @Column(name = "SEL_CAL", length = 5)
    private String selCal;

    @Column(name = "TENANCY_TERM")
    private Integer tenancyTerm;

    @Column(name = "TYPE_CERTIFICATE", length = 5)
    private String typeCertificate;

    @Column(name = "AFM_CERTIFICATE", length = 5)
    private String afmCertificate;

    @Column(name = "OPERATOR_BASE", length = 20)
    private String operatorBase;

    @Column(name = "OWNER", length = 20)
    private String owner;

    @Column(name = "ENGINE_TYPE", length = 20)
    private String engineType;

    @Column(name = "SEAT_COUNT")
    private Integer seatCount;

    @Column(name = "FIRST_SEAT_COUNT")
    private Integer firstSeatCount;

    @Column(name = "BUS_SEAT_COUNT", nullable = true)
    private Integer busSeatCount;

    @Column(name = "ECONOMY_SEAT_COUNT")
    private Integer economySeatCount;

    @Column(name = "MANUFACTURER", length = 30)
    private String manufacturer;

    @Column(name = "ENGINE_MAX_THRUST")
    private Integer engineMaxThrust;

    @Column(name = "FUEL_CAPACITY")
    private Integer fuelCapacity;

    @Column(name = "WEIGHT_MAX_TAKEOFF")
    private Integer weigthMaxTakeOff;

    @Column(name = "WEIGHT_MAX_LANDING")
    private Integer weightMaxLanding;

    @Column(name = "WEIGHT_MAX_TAXI")
    private Integer weightMaxTaxi;

    @Column(name = "WEIGHT_EMPTY")
    private Integer weightEmpty;

    @Column(name = "WEIGHT_ZERO_FUEL")
    private Integer weightZeroFuel;

    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy = "aircraft")
    private Set<Engine> engines;

    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy = "aircraft")
    private Set<APU> apus;

    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy = "aircraft")
    private Set<LandingGear> landingGears;

    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy = "aircraft")
    private Set<AirCraftStatusRec> airCraftStatusRecs;
    
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy = "aircraft")
    private Set<AirCraftFlightRec> airCraftFlightRecs;
    
    
    public AirCraft(){
        
    }
    
    @UseBuilderGenerator
    protected AirCraft(@Mandatory String fleet, @Mandatory String subFleet, @Mandatory String serialNo, @Mandatory String registerNo, @Mandatory String model, @Mandatory String sN,
            String lN, String variableNo, String virframeNo, String ipcRefNo, Date manufactureDate,
            Date leasingDeliveryDate, String selCal, Integer tenancyTerm, String typeCertificate, String afmCertificate,
            String operatorBase, String owner, String engineType, Integer seatCount, Integer firstSeatCount,
            Integer busSeatCount, Integer economySeatCount, String manufacturer, Integer engineMaxThrust,
            Integer fuelCapacity, Integer weigthMaxTakeOff, Integer weightMaxLanding, Integer weightMaxTaxi,
            Integer weightEmpty, Integer weightZeroFuel, Set<Engine> engines, Set<APU> apus,
            Set<LandingGear> landingGears, Set<AirCraftStatusRec> airCraftStatusRecs,
            Set<AirCraftFlightRec> airCraftFlightRecs) {
        super();
        this.fleet = fleet;
        this.subFleet = subFleet;
        this.serialNo = serialNo;
        this.registerNo = registerNo;
        this.model = model;
        SN = sN;
        LN = lN;
        this.variableNo = variableNo;
        this.virframeNo = virframeNo;
        this.ipcRefNo = ipcRefNo;
        this.manufactureDate = manufactureDate;
        this.leasingDeliveryDate = leasingDeliveryDate;
        this.selCal = selCal;
        this.tenancyTerm = tenancyTerm;
        this.typeCertificate = typeCertificate;
        this.afmCertificate = afmCertificate;
        this.operatorBase = operatorBase;
        this.owner = owner;
        this.engineType = engineType;
        this.seatCount = seatCount;
        this.firstSeatCount = firstSeatCount;
        this.busSeatCount = busSeatCount;
        this.economySeatCount = economySeatCount;
        this.manufacturer = manufacturer;
        this.engineMaxThrust = engineMaxThrust;
        this.fuelCapacity = fuelCapacity;
        this.weigthMaxTakeOff = weigthMaxTakeOff;
        this.weightMaxLanding = weightMaxLanding;
        this.weightMaxTaxi = weightMaxTaxi;
        this.weightEmpty = weightEmpty;
        this.weightZeroFuel = weightZeroFuel;
        this.engines = engines;
        this.apus = apus;
        this.landingGears = landingGears;
        this.airCraftStatusRecs = airCraftStatusRecs;
        this.airCraftFlightRecs = airCraftFlightRecs;
    }

    //------------------------- AUTOGENERATED START -------------------------
    ///CLOVER:OFF
    /**
     * The meta-bean for {@code AirCraft}.
     * @return the meta-bean, not null
     */
    public static AirCraft.Meta meta() {
        return AirCraft.Meta.INSTANCE;
    }

    static {
        JodaBeanUtils.registerMetaBean(AirCraft.Meta.INSTANCE);
    }

    @Override
    public AirCraft.Meta metaBean() {
        return AirCraft.Meta.INSTANCE;
    }

    //-----------------------------------------------------------------------
    @Override
    public AirCraft clone() {
        return JodaBeanUtils.cloneAlways(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            return super.equals(obj);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash ^ super.hashCode();
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(32);
        buf.append("AirCraft{");
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
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code AirCraft}.
     */
    public static class Meta extends AedmsEntity.Meta {
        /**
         * The singleton instance of the meta-bean.
         */
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
                this, (DirectMetaPropertyMap) super.metaPropertyMap());

        /**
         * Restricted constructor.
         */
        protected Meta() {
        }

        @Override
        public BeanBuilder<? extends AirCraft> builder() {
            return new DirectBeanBuilder<AirCraft>(new AirCraft());
        }

        @Override
        public Class<? extends AirCraft> beanType() {
            return AirCraft.class;
        }

        @Override
        public Map<String, MetaProperty<?>> metaPropertyMap() {
            return metaPropertyMap$;
        }

        //-----------------------------------------------------------------------
    }

    ///CLOVER:ON
    //-------------------------- AUTOGENERATED END --------------------------
}
