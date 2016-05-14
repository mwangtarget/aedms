package com.aedms.core.entities.source;

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
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

import fr.lteconsulting.Mandatory;
import fr.lteconsulting.UseBuilderGenerator;

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
public class AirCraft implements Serializable {

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
    private Set<AircraftStatusRec> airCraftStatusRecs;
    
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy = "aircraft")
    private Set<AircraftFlightRec> airCraftFlightRecs;
    
    
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
			Set<LandingGear> landingGears, Set<AircraftStatusRec> airCraftStatusRecs,
			Set<AircraftFlightRec> airCraftFlightRecs) {
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

	/**
     * to format the output string of engines
     *
     * @return
     */
    private String enginesToString() {
        StringBuilder egxToStrSB = new StringBuilder();
        int index = 1;
        egxToStrSB.append("Engines");
        if (getEngines() != null && !getEngines().isEmpty()) {
            index = getEngines().stream().map((engine) -> {
                egxToStrSB.append(engine.getId()).append(", model=").append(engine.getModel()).append("]");
                return engine;
            }).map((_item) -> 1).reduce(index, Integer::sum);
            //engines.iterator()
        } else {
            egxToStrSB.append("[]");
        }
        return egxToStrSB.toString();
    }

    private String apusToString() {
        StringBuilder apusToStrSB = new StringBuilder();
        apusToStrSB.append("apus=");
        if (getApus() != null && !getApus().isEmpty()) {
            getApus().stream().map((apu) -> {
                apusToStrSB.append(apu.toString());
                return apu;
            });
        } else {
            apusToStrSB.append("[]");
        }
        return apusToStrSB.toString();
    }

    @Override
    public String toString() {
        return "AirCraft [id=" + id + ", fleet=" + fleet + ", subFleet=" + subFleet + ", serialNo=" + serialNo
                + ", registerNo=" + registerNo + ", model=" + model + ", SN=" + SN + ", LN=" + LN + ", variableNo="
                + variableNo + ", virframeNo=" + virframeNo + ", ipcRefNo=" + ipcRefNo + ", manufactureDate="
                + manufactureDate + ", leasingDeliveryDate=" + leasingDeliveryDate + ", selCal=" + selCal
                + ", tenancyTerm=" + tenancyTerm + ", typeCertificate=" + typeCertificate + ", afmCertificate="
                + afmCertificate + ", operatorBase=" + operatorBase + ", owner=" + owner + ", engineType=" + engineType
                + this.enginesToString() + ", seatCount=" + seatCount + ", firstSeatCount=" + firstSeatCount
                + ", busSeatCount=" + busSeatCount + ", economySeatCount=" + economySeatCount + ", manufacturer="
                + manufacturer + ", engineMaxThrust=" + engineMaxThrust + ", fuelCapacity=" + fuelCapacity
                + ", weigthMaxTakeOff=" + weigthMaxTakeOff + ", weightMaxLanding=" + weightMaxLanding
                + ", weightMaxTaxi=" + weightMaxTaxi + ", weightEmpty=" + weightEmpty + ", weightZeroFuel="
                + weightZeroFuel + ", " + this.apusToString() + " ]";
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the fleet
     */
    public String getFleet() {
        return fleet;
    }

    /**
     * @param fleet the fleet to set
     */
    public void setFleet(String fleet) {
        this.fleet = fleet;
    }

    /**
     * @return the subFleet
     */
    public String getSubFleet() {
        return subFleet;
    }

    /**
     * @param subFleet the subFleet to set
     */
    public void setSubFleet(String subFleet) {
        this.subFleet = subFleet;
    }

    /**
     * @return the serialNo
     */
    public String getSerialNo() {
        return serialNo;
    }

    /**
     * @param serialNo the serialNo to set
     */
    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    /**
     * @return the registerNo
     */
    public String getRegisterNo() {
        return registerNo;
    }

    /**
     * @param registerNo the registerNo to set
     */
    public void setRegisterNo(String registerNo) {
        this.registerNo = registerNo;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the SN
     */
    public String getSN() {
        return SN;
    }

    /**
     * @param SN the SN to set
     */
    public void setSN(String SN) {
        this.SN = SN;
    }

    /**
     * @return the LN
     */
    public String getLN() {
        return LN;
    }

    /**
     * @param LN the LN to set
     */
    public void setLN(String LN) {
        this.LN = LN;
    }

    /**
     * @return the variableNo
     */
    public String getVariableNo() {
        return variableNo;
    }

    /**
     * @param variableNo the variableNo to set
     */
    public void setVariableNo(String variableNo) {
        this.variableNo = variableNo;
    }

    /**
     * @return the virframeNo
     */
    public String getVirframeNo() {
        return virframeNo;
    }

    /**
     * @param virframeNo the virframeNo to set
     */
    public void setVirframeNo(String virframeNo) {
        this.virframeNo = virframeNo;
    }

    /**
     * @return the ipcRefNo
     */
    public String getIpcRefNo() {
        return ipcRefNo;
    }

    /**
     * @param ipcRefNo the ipcRefNo to set
     */
    public void setIpcRefNo(String ipcRefNo) {
        this.ipcRefNo = ipcRefNo;
    }

    /**
     * @return the manufactureDate
     */
    public Date getManufactureDate() {
        return manufactureDate;
    }

    /**
     * @param manufactureDate the manufactureDate to set
     */
    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    /**
     * @return the leasingDeliveryDate
     */
    public Date getLeasingDeliveryDate() {
        return leasingDeliveryDate;
    }

    /**
     * @param leasingDeliveryDate the leasingDeliveryDate to set
     */
    public void setLeasingDeliveryDate(Date leasingDeliveryDate) {
        this.leasingDeliveryDate = leasingDeliveryDate;
    }

    /**
     * @return the selCal
     */
    public String getSelCal() {
        return selCal;
    }

    /**
     * @param selCal the selCal to set
     */
    public void setSelCal(String selCal) {
        this.selCal = selCal;
    }

    /**
     * @return the typeCertificate
     */
    public String getTypeCertificate() {
        return typeCertificate;
    }

    /**
     * @param typeCertificate the typeCertificate to set
     */
    public void setTypeCertificate(String typeCertificate) {
        this.typeCertificate = typeCertificate;
    }

    /**
     * @return the afmCertificate
     */
    public String getAfmCertificate() {
        return afmCertificate;
    }

    /**
     * @param afmCertificate the afmCertificate to set
     */
    public void setAfmCertificate(String afmCertificate) {
        this.afmCertificate = afmCertificate;
    }

    /**
     * @return the operatorBase
     */
    public String getOperatorBase() {
        return operatorBase;
    }

    /**
     * @param operatorBase the operatorBase to set
     */
    public void setOperatorBase(String operatorBase) {
        this.operatorBase = operatorBase;
    }

    /**
     * @return the owner
     */
    public String getOwner() {
        return owner;
    }

    /**
     * @param owner the owner to set
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * @return the engineType
     */
    public String getEngineType() {
        return engineType;
    }

    /**
     * @param engineType the engineType to set
     */
    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    /**
     * @return the seatCount
     */
    public Integer getSeatCount() {
        return seatCount;
    }

    /**
     * @param seatCount the seatCount to set
     */
    public void setSeatCount(Integer seatCount) {
        this.seatCount = seatCount;
    }

    /**
     * @return the firstSeatCount
     */
    public Integer getFirstSeatCount() {
        return firstSeatCount;
    }

    /**
     * @param firstSeatCount the firstSeatCount to set
     */
    public void setFirstSeatCount(Integer firstSeatCount) {
        this.firstSeatCount = firstSeatCount;
    }

    /**
     * @return the busSeatCount
     */
    public Integer getBusSeatCount() {
        return busSeatCount;
    }

    /**
     * @param busSeatCount the busSeatCount to set
     */
    public void setBusSeatCount(Integer busSeatCount) {
        this.busSeatCount = busSeatCount;
    }

    /**
     * @return the economySeatCount
     */
    public Integer getEconomySeatCount() {
        return economySeatCount;
    }

    /**
     * @param economySeatCount the economySeatCount to set
     */
    public void setEconomySeatCount(Integer economySeatCount) {
        this.economySeatCount = economySeatCount;
    }

    /**
     * @return the manufacturer
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * @param manufacturer the manufacturer to set
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * @return the engineMaxThrust
     */
    public Integer getEngineMaxThrust() {
        return engineMaxThrust;
    }

    /**
     * @param engineMaxThrust the engineMaxThrust to set
     */
    public void setEngineMaxThrust(Integer engineMaxThrust) {
        this.engineMaxThrust = engineMaxThrust;
    }

    /**
     * @return the fuelCapacity
     */
    public Integer getFuelCapacity() {
        return fuelCapacity;
    }

    /**
     * @param fuelCapacity the fuelCapacity to set
     */
    public void setFuelCapacity(Integer fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    /**
     * @return the weigthMaxTakeOff
     */
    public Integer getWeigthMaxTakeOff() {
        return weigthMaxTakeOff;
    }

    /**
     * @param weigthMaxTakeOff the weigthMaxTakeOff to set
     */
    public void setWeigthMaxTakeOff(Integer weigthMaxTakeOff) {
        this.weigthMaxTakeOff = weigthMaxTakeOff;
    }

    /**
     * @return the weightMaxLanding
     */
    public Integer getWeightMaxLanding() {
        return weightMaxLanding;
    }

    /**
     * @param weightMaxLanding the weightMaxLanding to set
     */
    public void setWeightMaxLanding(Integer weightMaxLanding) {
        this.weightMaxLanding = weightMaxLanding;
    }

    /**
     * @return the weightMaxTaxi
     */
    public Integer getWeightMaxTaxi() {
        return weightMaxTaxi;
    }

    /**
     * @param weightMaxTaxi the weightMaxTaxi to set
     */
    public void setWeightMaxTaxi(Integer weightMaxTaxi) {
        this.weightMaxTaxi = weightMaxTaxi;
    }

    /**
     * @return the weightEmpty
     */
    public Integer getWeightEmpty() {
        return weightEmpty;
    }

    /**
     * @param weightEmpty the weightEmpty to set
     */
    public void setWeightEmpty(Integer weightEmpty) {
        this.weightEmpty = weightEmpty;
    }

    /**
     * @return the weightZeroFuel
     */
    public Integer getWeightZeroFuel() {
        return weightZeroFuel;
    }

    /**
     * @param weightZeroFuel the weightZeroFuel to set
     */
    public void setWeightZeroFuel(Integer weightZeroFuel) {
        this.weightZeroFuel = weightZeroFuel;
    }

    /**
     * @return the tenancyTerm
     */
    public Integer getTenancyTerm() {
        return tenancyTerm;
    }

    /**
     * @param tenancyTerm the tenancyTerm to set
     */
    public void setTenancyTerm(Integer tenancyTerm) {
        this.tenancyTerm = tenancyTerm;
    }

    /**
     * @return the engines
     */
    public Set<Engine> getEngines() {
        return engines;
    }

    /**
     * @param engines the engines to set
     */
    public void setEngines(Set<Engine> engines) {
        this.engines = engines;
    }

    /**
     * @return the apus
     */
    public Set<APU> getApus() {
        return apus;
    }

    /**
     * @param apus the apus to set
     */
    public void setApus(Set<APU> apus) {
        this.apus = apus;
    }

    /**
     * @return the landingGears
     */
    public Set<LandingGear> getLandingGears() {
        return landingGears;
    }

    /**
     * @param landingGears the landingGears to set
     */
    public void setLandingGears(Set<LandingGear> landingGears) {
        this.landingGears = landingGears;
    }

    /**
     * @return the airCraftStatusRecs
     */
    public Set<AircraftStatusRec> getAirCraftStatusRecs() {
        return airCraftStatusRecs;
    }

    /**
     * @param airCraftStatusRecs the airCraftStatusRecs to set
     */
    public void setAirCraftStatusRecs(Set<AircraftStatusRec> airCraftStatusRecs) {
        this.airCraftStatusRecs = airCraftStatusRecs;
    }
}
