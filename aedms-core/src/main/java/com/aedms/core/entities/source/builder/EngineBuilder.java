package com.aedms.core.entities.source.builder;

import com.aedms.core.entities.source.Engine;

public class EngineBuilder implements com.aedms.core.entities.source.builder.Builder<com.aedms.core.entities.source.Engine> {
    public static EngineBuilder anEngine() {
        return new EngineBuilder();
    }    
    private com.aedms.core.entities.source.Engine target = new com.aedms.core.entities.source.Engine();
    
    public EngineBuilder() {}
    
    public EngineBuilder withFleet(java.lang.String fleet) {
        getTarget().setFleet(fleet);
        return this;
    }
    
    public EngineBuilder withSubFleet(java.lang.String subFleet) {
        getTarget().setSubFleet(subFleet);
        return this;
    }
    
    public EngineBuilder withRemark(java.lang.String remark) {
        getTarget().setRemark(remark);
        return this;
    }
    
    public EngineBuilder withLeaseHolder(java.lang.String leaseHolder) {
        getTarget().setLeaseHolder(leaseHolder);
        return this;
    }
    
    public EngineBuilder withSerialNo(java.lang.String serialNo) {
        getTarget().setSerialNo(serialNo);
        return this;
    }
    
    public EngineBuilder withOpr(java.lang.String opr) {
        getTarget().setOpr(opr);
        return this;
    }
    
    public EngineBuilder withRentDate(java.util.Date rentDate) {
        getTarget().setRentDate(rentDate);
        return this;
    }
    
    public EngineBuilder withLeaseHold(java.lang.String leaseHold) {
        getTarget().setLeaseHold(leaseHold);
        return this;
    }
    
    public EngineBuilder withManufactureDate(java.util.Date manufactureDate) {
        getTarget().setManufactureDate(manufactureDate);
        return this;
    }
    
    public EngineBuilder withModel(java.lang.String model) {
        getTarget().setModel(model);
        return this;
    }
    
    public EngineBuilder withSN(java.lang.String SN) {
        getTarget().setSN(SN);
        return this;
    }
    
    public EngineBuilder withId(long id) {
        getTarget().setId(id);
        return this;
    }
    
    protected com.aedms.core.entities.source.Engine getTarget() {
        return target;
    }
    
    public com.aedms.core.entities.source.Engine build() {
        return getTarget();
    }
}
