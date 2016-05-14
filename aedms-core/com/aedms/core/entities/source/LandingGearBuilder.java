package com.aedms.core.entities.source;


public class LandingGearBuilder implements com.aedms.core.entities.source.Builder<com.aedms.core.entities.source.LandingGear> {
    public static LandingGearBuilder aLandingGear() {
        return new LandingGearBuilder();
    }    
    private com.aedms.core.entities.source.LandingGear target = new com.aedms.core.entities.source.LandingGear();
    
    public LandingGearBuilder() {}
    
    public LandingGearBuilder withRentDate(java.util.Date rentDate) {
        getTarget().setRentDate(rentDate);
        return this;
    }
    
    public LandingGearBuilder withLandingGearOperationRec(com.aedms.core.entities.source.Builder<com.aedms.core.entities.source.LandingGearOperationRec> landingGearOperationRec) {
        if (getTarget().getLandingGearOperationRecs() == null) {
            getTarget().setLandingGearOperationRecs(new java.util.HashSet<com.aedms.core.entities.source.LandingGearOperationRec>());
        }        
        getTarget().getLandingGearOperationRecs().add(landingGearOperationRec.build());
        return this;
    }
    
    public LandingGearBuilder withLandingGearStatusRec(com.aedms.core.entities.source.Builder<com.aedms.core.entities.source.LandingGearStatusRec> landingGearStatusRec) {
        if (getTarget().getLandingGearStatusRecs() == null) {
            getTarget().setLandingGearStatusRecs(new java.util.HashSet<com.aedms.core.entities.source.LandingGearStatusRec>());
        }        
        getTarget().getLandingGearStatusRecs().add(landingGearStatusRec.build());
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
