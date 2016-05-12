package com.aedms.core.entities.source.builder;

import com.aedms.core.entities.source.APU;
import com.aedms.core.entities.source.AirCraft;
import com.aedms.core.entities.source.Engine;
import java.util.Date;
import java.util.Set;

public class AirCraftBuilder implements Builder<AirCraft> {

    public static AirCraftBuilder createAirCraftBuilder() {
        return new AirCraftBuilder();
    }
    private final AirCraft target = new AirCraft();

    private AirCraftBuilder() {
    }

    public AirCraftBuilder withIpcRefNo(String ipcRefNo) {
        getTarget().setIpcRefNo(ipcRefNo);
        return this;
    }

    public AirCraftBuilder withFleet(String fleet) {
        getTarget().setFleet(fleet);
        return this;
    }

    public AirCraftBuilder withLN(String LN) {
        getTarget().setLN(LN);
        return this;
    }

    public AirCraftBuilder withLeasingDeliveryDate(Date leasingDeliveryDate) {
        getTarget().setLeasingDeliveryDate(leasingDeliveryDate);
        return this;
    }

    public AirCraftBuilder withSubFleet(String subFleet) {
        getTarget().setSubFleet(subFleet);
        return this;
    }

    public AirCraftBuilder withVariableNo(String variableNo) {
        getTarget().setVariableNo(variableNo);
        return this;
    }

    public AirCraftBuilder withEngines(Set<Engine> engines) {
        getTarget().setEngines(engines);
        return this;
    }

    public AirCraftBuilder withWeigthMaxTakeOff(int weigthMaxTakeOff) {
        getTarget().setWeigthMaxTakeOff(weigthMaxTakeOff);
        return this;
    }

    public AirCraftBuilder withEngineType(String engineType) {
        getTarget().setEngineType(engineType);
        return this;
    }

    public AirCraftBuilder withTenancyTerm(int tenancyTerm) {
        getTarget().setTenancyTerm(tenancyTerm);
        return this;
    }

    public AirCraftBuilder withManufacturer(String manufacturer) {
        getTarget().setManufacturer(manufacturer);
        return this;
    }

    public AirCraftBuilder withRegisterNo(String registerNo) {
        getTarget().setRegisterNo(registerNo);
        return this;
    }

    public AirCraftBuilder withTypeCertificate(String typeCertificate) {
        getTarget().setTypeCertificate(typeCertificate);
        return this;
    }

    public AirCraftBuilder withWeightEmpty(int weightEmpty) {
        getTarget().setWeightEmpty(weightEmpty);
        return this;
    }

    public AirCraftBuilder withManufactureDate(Date manufactureDate) {
        getTarget().setManufactureDate(manufactureDate);
        return this;
    }

    public AirCraftBuilder withModel(String model) {
        getTarget().setModel(model);
        return this;
    }

    public AirCraftBuilder withSN(String SN) {
        getTarget().setSN(SN);
        return this;
    }

    public AirCraftBuilder withWeightZeroFuel(int weightZeroFuel) {
        getTarget().setWeightZeroFuel(weightZeroFuel);
        return this;
    }

    public AirCraftBuilder withOwner(String owner) {
        getTarget().setOwner(owner);
        return this;
    }

    public AirCraftBuilder withWeightMaxLanding(int weightMaxLanding) {
        getTarget().setWeightMaxLanding(weightMaxLanding);
        return this;
    }

    public AirCraftBuilder withAfmCertificate(String afmCertificate) {
        getTarget().setAfmCertificate(afmCertificate);
        return this;
    }

    public AirCraftBuilder withFuelCapacity(int fuelCapacity) {
        getTarget().setFuelCapacity(fuelCapacity);
        return this;
    }

    public AirCraftBuilder withApus(Set<APU> apus) {
        getTarget().setApus(apus);
        return this;
    }

    public AirCraftBuilder withOperatorBase(String operatorBase) {
        getTarget().setOperatorBase(operatorBase);
        return this;
    }

    public AirCraftBuilder withSelCal(String selCal) {
        getTarget().setSelCal(selCal);
        return this;
    }

    public AirCraftBuilder withSeatCount(int seatCount) {
        getTarget().setSeatCount(seatCount);
        return this;
    }

    public AirCraftBuilder withFirstSeatCount(int firstSeatCount) {
        getTarget().setFirstSeatCount(firstSeatCount);
        return this;
    }

    public AirCraftBuilder withSerialNo(String serialNo) {
        getTarget().setSerialNo(serialNo);
        return this;
    }

    public AirCraftBuilder withVirframeNo(String virframeNo) {
        getTarget().setVirframeNo(virframeNo);
        return this;
    }

    public AirCraftBuilder withEngineMaxThrust(int engineMaxThrust) {
        getTarget().setEngineMaxThrust(engineMaxThrust);
        return this;
    }

    public AirCraftBuilder withEconomySeatCount(int economySeatCount) {
        getTarget().setEconomySeatCount(economySeatCount);
        return this;
    }

    public AirCraftBuilder withWeightMaxTaxi(int weightMaxTaxi) {
        getTarget().setWeightMaxTaxi(weightMaxTaxi);
        return this;
    }

    protected AirCraft getTarget() {
        return target;
    }

    @Override
    public AirCraft build() {
        return getTarget();
    }
}
