package com.aedms.core.entities.source;


public class APUBuilder implements com.aedms.core.entities.source.Builder<com.aedms.core.entities.source.APU> {
    public static APUBuilder anAPU() {
        return new APUBuilder();
    }    
    private com.aedms.core.entities.source.APU target = new com.aedms.core.entities.source.APU();
    
    public APUBuilder() {}
    
    public APUBuilder withOpr(java.lang.String opr) {
        getTarget().setOpr(opr);
        return this;
    }
    
    public APUBuilder withRentDate(java.util.Date rentDate) {
        getTarget().setRentDate(rentDate);
        return this;
    }
    
    public APUBuilder withAircraft(com.aedms.core.entities.source.Builder<com.aedms.core.entities.source.AirCraft> aircraft) {
        getTarget().setAircraft(aircraft.build());
        return this;
    }
    
    public APUBuilder withApuStatusRec(com.aedms.core.entities.source.Builder<com.aedms.core.entities.source.APUStatusRec> apuStatusRec) {
        if (getTarget().getApuStatusRecs() == null) {
            getTarget().setApuStatusRecs(new java.util.HashSet<com.aedms.core.entities.source.APUStatusRec>());
        }        
        getTarget().getApuStatusRecs().add(apuStatusRec.build());
        return this;
    }
    
    public APUBuilder withLeaseHold(java.lang.String leaseHold) {
        getTarget().setLeaseHold(leaseHold);
        return this;
    }
    
    public APUBuilder withManufactureDate(java.util.Date manufactureDate) {
        getTarget().setManufactureDate(manufactureDate);
        return this;
    }
    
    public APUBuilder withModel(java.lang.String model) {
        getTarget().setModel(model);
        return this;
    }
    
    public APUBuilder withSN(java.lang.String SN) {
        getTarget().setSN(SN);
        return this;
    }
    
    public APUBuilder withId(long id) {
        getTarget().setId(id);
        return this;
    }
    
    public APUBuilder withLeaseHolder(java.lang.String leaseHolder) {
        getTarget().setLeaseHolder(leaseHolder);
        return this;
    }
    
    public APUBuilder withApuOperationRec(com.aedms.core.entities.source.Builder<com.aedms.core.entities.source.APUOperationRec> apuOperationRec) {
        if (getTarget().getApuOperationRecs() == null) {
            getTarget().setApuOperationRecs(new java.util.HashSet<com.aedms.core.entities.source.APUOperationRec>());
        }        
        getTarget().getApuOperationRecs().add(apuOperationRec.build());
        return this;
    }
    
    protected com.aedms.core.entities.source.APU getTarget() {
        return target;
    }
    
    public com.aedms.core.entities.source.APU build() {
        return getTarget();
    }
}
