package com.aedms.core.entities.source.builder;

import com.aedms.core.entities.source.LandingGear;
import java.util.Date;

public class LandingGearBuilder implements Builder<LandingGear> {

    public static LandingGearBuilder aLandingGearBuilder() {
        return new LandingGearBuilder();
    }
    private final LandingGear target = new LandingGear();

    public LandingGearBuilder() {
    }

    public LandingGearBuilder withRentDate(Date rentDate) {
        getTarget().setRentDate(rentDate);
        return this;
    }

    public LandingGearBuilder withLeaseHold(String leaseHold) {
        getTarget().setLeaseHold(leaseHold);
        return this;
    }

    public LandingGearBuilder withManufactureDate(Date manufactureDate) {
        getTarget().setManufactureDate(manufactureDate);
        return this;
    }

    public LandingGearBuilder withModel(String model) {
        getTarget().setModel(model);
        return this;
    }

    public LandingGearBuilder withSN(String SN) {
        getTarget().setSN(SN);
        return this;
    }

    public LandingGearBuilder withId(long id) {
        getTarget().setId(id);
        return this;
    }

    public LandingGearBuilder withOrp(String orp) {
        getTarget().setOrp(orp);
        return this;
    }

    public LandingGearBuilder withLeaseHolder(String leaseHolder) {
        getTarget().setLeaseHolder(leaseHolder);
        return this;
    }

    protected LandingGear getTarget() {
        return target;
    }

    @Override
    public LandingGear build() {
        return getTarget();
    }
}
