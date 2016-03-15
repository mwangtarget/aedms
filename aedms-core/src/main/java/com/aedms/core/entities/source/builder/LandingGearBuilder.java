package com.aedms.core.entities.source.builder;

import com.aedms.core.entities.source.LandingGear;

public class LandingGearBuilder implements com.aedms.core.entities.source.builder.Builder<com.aedms.core.entities.source.LandingGear> {
    public static LandingGearBuilder aLandingGear() {
        return new LandingGearBuilder();
    }    
    private com.aedms.core.entities.source.LandingGear target = new com.aedms.core.entities.source.LandingGear();
    
    public LandingGearBuilder() {}
    
    public LandingGearBuilder withRentDate(java.util.Date rentDate) {
        getTarget().setRentDate(rentDate);
        return this;
    }
    
    public LandingGearBuilder withLeaseHold(java.lang.String leaseHold) {
        getTarget().setLeaseHold(leaseHold);
        return this;
    }
    
    public LandingGearBuilder withManufactureDate(java.util.Date manufactureDate) {
        getTarget().setManufactureDate(manufactureDate);
        return this;
    }
    
    public LandingGearBuilder withModel(java.lang.String model) {
        getTarget().setModel(model);
        return this;
    }
    
    public LandingGearBuilder withSN(java.lang.String SN) {
        getTarget().setSN(SN);
        return this;
    }
    
    public LandingGearBuilder withId(long id) {
        getTarget().setId(id);
        return this;
    }
    
    public LandingGearBuilder withOrp(java.lang.String orp) {
        getTarget().setOrp(orp);
        return this;
    }
    
    public LandingGearBuilder withLeaseHolder(java.lang.String leaseHolder) {
        getTarget().setLeaseHolder(leaseHolder);
        return this;
    }
    
    protected com.aedms.core.entities.source.LandingGear getTarget() {
        return target;
    }
    
    public com.aedms.core.entities.source.LandingGear build() {
        return getTarget();
    }
}
