package com.aedms.core.entities.source.builder;

import com.aedms.core.entities.source.APU;
import java.util.Date;

public class APUBuilder implements Builder<APU> {
    
    public static APUBuilder createAPUBuilder() {
        return new APUBuilder();
    }    
    private final APU target = new APU();
    
    private APUBuilder() {}
    
    public APUBuilder withOpr(String opr) {
        getTarget().setOpr(opr);
        return this;
    }
    
    public APUBuilder withRentDate(Date rentDate) {
        getTarget().setRentDate(rentDate);
        return this;
    }
    
    public APUBuilder withLeaseHold(String leaseHold) {
        getTarget().setLeaseHold(leaseHold);
        return this;
    }
    
    public APUBuilder withManufactureDate(Date manufactureDate) {
        getTarget().setManufactureDate(manufactureDate);
        return this;
    }
    
    public APUBuilder withModel(String model) {
        getTarget().setModel(model);
        return this;
    }
    
    public APUBuilder withSN(String SN) {
        getTarget().setSN(SN);
        return this;
    }
    
    public APUBuilder withId(long id) {
        getTarget().setId(id);
        return this;
    }
    
    public APUBuilder withLeaseHolder(String leaseHolder) {
        getTarget().setLeaseHolder(leaseHolder);
        return this;
    }
    
    protected APU getTarget() {
        return target;
    }
    
    @Override
    public APU build() {
        return getTarget();
    }
}
