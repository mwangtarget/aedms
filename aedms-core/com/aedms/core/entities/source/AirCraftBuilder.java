package com.aedms.core.entities.source;


public class AirCraftBuilder implements com.aedms.core.entities.source.Builder<com.aedms.core.entities.source.AirCraft> {
    public static AirCraftBuilder anAirCraft() {
        return new AirCraftBuilder();
    }    
    private com.aedms.core.entities.source.AirCraft target = new com.aedms.core.entities.source.AirCraft();
    
    public AirCraftBuilder() {}
    
    public AirCraftBuilder withIpcRefNo(java.lang.String ipcRefNo) {
        getTarget().setIpcRefNo(ipcRefNo);
        return this;
    }
    
    public AirCraftBuilder withFleet(java.lang.String fleet) {
        getTarget().setFleet(fleet);
        return this;
    }
    
    public AirCraftBuilder withLN(java.lang.String LN) {
        getTarget().setLN(LN);
        return this;
    }
    
    public AirCraftBuilder withLeasingDeliveryDate(java.util.Date leasingDeliveryDate) {
        getTarget().setLeasingDeliveryDate(leasingDeliveryDate);
        return this;
    }
    
    public AirCraftBuilder withSubFleet(java.lang.String subFleet) {
        getTarget().setSubFleet(subFleet);
        return this;
    }
    
    public AirCraftBuilder withVariableNo(java.lang.String variableNo) {
        getTarget().setVariableNo(variableNo);
        return this;
    }
    
    public AirCraftBuilder withWeigthMaxTakeOff(java.lang.Integer weigthMaxTakeOff) {
        getTarget().setWeigthMaxTakeOff(weigthMaxTakeOff);
        return this;
    }
    
    public AirCraftBuilder withEngineType(java.lang.String engineType) {
        getTarget().setEngineType(engineType);
        return this;
    }
    
    public AirCraftBuilder withTenancyTerm(java.lang.Integer tenancyTerm) {
        getTarget().setTenancyTerm(tenancyTerm);
        return this;
    }
    
    public AirCraftBuilder withManufacturer(java.lang.String manufacturer) {
        getTarget().setManufacturer(manufacturer);
        return this;
    }
    
    public AirCraftBuilder withRegisterNo(java.lang.String registerNo) {
        getTarget().setRegisterNo(registerNo);
        return this;
    }
    
    public AirCraftBuilder withTypeCertificate(java.lang.String typeCertificate) {
        getTarget().setTypeCertificate(typeCertificate);
        return this;
    }
    
    public AirCraftBuilder withEngine(com.aedms.core.entities.source.Builder<com.aedms.core.entities.source.Engine> engine) {
        if (getTarget().getEngines() == null) {
            getTarget().setEngines(new java.util.HashSet<com.aedms.core.entities.source.Engine>());
        }        
        getTarget().getEngines().add(engine.build());
        return this;
    }
    
    public AirCraftBuilder withWeightEmpty(java.lang.Integer weightEmpty) {
        getTarget().setWeightEmpty(weightEmpty);
        return this;
    }
    
    public AirCraftBuilder withManufactureDate(java.util.Date manufactureDate) {
        getTarget().setManufactureDate(manufactureDate);
        return this;
    }
    
    public AirCraftBuilder withModel(java.lang.String model) {
        getTarget().setModel(model);
        return this;
    }
    
    public AirCraftBuilder withSN(java.lang.String SN) {
        getTarget().setSN(SN);
        return this;
    }
    
    public AirCraftBuilder withId(java.lang.Long id) {
        getTarget().setId(id);
        return this;
    }
    
    public AirCraftBuilder withWeightZeroFuel(java.lang.Integer weightZeroFuel) {
        getTarget().setWeightZeroFuel(weightZeroFuel);
        return this;
    }
    
    public AirCraftBuilder withApu(com.aedms.core.entities.source.Builder<com.aedms.core.entities.source.APU> apu) {
        if (getTarget().getApus() == null) {
            getTarget().setApus(new java.util.HashSet<com.aedms.core.entities.source.APU>());
        }        
        getTarget().getApus().add(apu.build());
        return this;
    }
    
    public AirCraftBuilder withOwner(java.lang.String owner) {
        getTarget().setOwner(owner);
        return this;
    }
    
    public AirCraftBuilder withWeightMaxLanding(java.lang.Integer weightMaxLanding) {
        getTarget().setWeightMaxLanding(weightMaxLanding);
        return this;
    }
    
    public AirCraftBuilder withAfmCertificate(java.lang.String afmCertificate) {
        getTarget().setAfmCertificate(afmCertificate);
        return this;
    }
    
    public AirCraftBuilder withFuelCapacity(java.lang.Integer fuelCapacity) {
        getTarget().setFuelCapacity(fuelCapacity);
        return this;
    }
    
    public AirCraftBuilder withOperatorBase(java.lang.String operatorBase) {
        getTarget().setOperatorBase(operatorBase);
        return this;
    }
    
    public AirCraftBuilder withLandingGear(com.aedms.core.entities.source.Builder<com.aedms.core.entities.source.LandingGear> landingGear) {
        if (getTarget().getLandingGears() == null) {
            getTarget().setLandingGears(new java.util.HashSet<com.aedms.core.entities.source.LandingGear>());
        }        
        getTarget().getLandingGears().add(landingGear.build());
        return this;
    }
    
    public AirCraftBuilder withSelCal(java.lang.String selCal) {
        getTarget().setSelCal(selCal);
        return this;
    }
    
    public AirCraftBuilder withSeatCount(java.lang.Integer seatCount) {
        getTarget().setSeatCount(seatCount);
        return this;
    }
    
    public AirCraftBuilder withFirstSeatCount(java.lang.Integer firstSeatCount) {
        getTarget().setFirstSeatCount(firstSeatCount);
        return this;
    }
    
    public AirCraftBuilder withSerialNo(java.lang.String serialNo) {
        getTarget().setSerialNo(serialNo);
        return this;
    }
    
    public AirCraftBuilder withVirframeNo(java.lang.String virframeNo) {
        getTarget().setVirframeNo(virframeNo);
        return this;
    }
    
    public AirCraftBuilder withEngineMaxThrust(java.lang.Integer engineMaxThrust) {
        getTarget().setEngineMaxThrust(engineMaxThrust);
        return this;
    }
    
    public AirCraftBuilder withAirCraftStatusRec(com.aedms.core.entities.source.Builder<com.aedms.core.entities.source.AircraftStatusRec> airCraftStatusRec) {
        if (getTarget().getAirCraftStatusRecs() == null) {
            getTarget().setAirCraftStatusRecs(new java.util.HashSet<com.aedms.core.entities.source.AircraftStatusRec>());
        }        
        getTarget().getAirCraftStatusRecs().add(airCraftStatusRec.build());
        return this;
    }
    
    public AirCraftBuilder withBusSeatCount(java.lang.Integer busSeatCount) {
        getTarget().setBusSeatCount(busSeatCount);
        return this;
    }
    
    public AirCraftBuilder withEconomySeatCount(java.lang.Integer economySeatCount) {
        getTarget().setEconomySeatCount(economySeatCount);
        return this;
    }
    
    public AirCraftBuilder withWeightMaxTaxi(java.lang.Integer weightMaxTaxi) {
        getTarget().setWeightMaxTaxi(weightMaxTaxi);
        return this;
    }
    
    protected com.aedms.core.entities.source.AirCraft getTarget() {
        return target;
    }
    
    public com.aedms.core.entities.source.AirCraft build() {
        return getTarget();
    }
}
