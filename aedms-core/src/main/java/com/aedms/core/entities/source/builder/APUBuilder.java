package com.aedms.core.entities.source.builder;

import com.aedms.core.entities.source.APU;

public class APUBuilder implements com.aedms.core.entities.source.builder.Builder<com.aedms.core.entities.source.APU> {
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
    
    protected com.aedms.core.entities.source.APU getTarget() {
        return target;
    }
    
    public com.aedms.core.entities.source.APU build() {
        return getTarget();
    }
}
