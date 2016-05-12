package com.aedms.core.entities.source.builder;

import com.aedms.core.entities.source.Engine;
import com.aedms.core.entities.source.EngineOprRec;
import com.aedms.core.entities.source.EngineStatRec;
import java.util.Date;
import java.util.HashSet;

public class EngineBuilder implements Builder<Engine> {

    public static EngineBuilder createEngineBuilder() {
        return new EngineBuilder();
    }
    private Engine target = new Engine();

    private EngineBuilder() {
    }

    public EngineBuilder withFleet(String fleet) {
        getTarget().setFleet(fleet);
        return this;
    }

    public EngineBuilder withSubFleet(String subFleet) {
        getTarget().setSubFleet(subFleet);
        return this;
    }

    public EngineBuilder withRemark(String remark) {
        getTarget().setRemark(remark);
        return this;
    }

    public EngineBuilder withLeaseHolder(String leaseHolder) {
        getTarget().setLeaseHolder(leaseHolder);
        return this;
    }

    public EngineBuilder withSerialNo(String serialNo) {
        getTarget().setSerialNo(serialNo);
        return this;
    }

    public EngineBuilder withOpr(String opr) {
        getTarget().setOpr(opr);
        return this;
    }

    public EngineBuilder withEngineOprRec(Builder<EngineOprRec> engineOprRec) {
        if (getTarget().getEngineOprRecs() == null) {
            getTarget().setEngineOprRecs(new HashSet<>());
        }
        getTarget().getEngineOprRecs().add(engineOprRec.build());
        return this;
    }

    public EngineBuilder withRentDate(Date rentDate) {
        getTarget().setRentDate(rentDate);
        return this;
    }

    public EngineBuilder withLeaseHold(String leaseHold) {
        getTarget().setLeaseHold(leaseHold);
        return this;
    }

    public EngineBuilder withManufactureDate(Date manufactureDate) {
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

    public EngineBuilder withEngineStatRec(Builder<EngineStatRec> engineStatRec) {
        if (getTarget().getEngineStatRecs() == null) {
            getTarget().setEngineStatRecs(new HashSet<>());
        }
        getTarget().getEngineStatRecs().add(engineStatRec.build());
        return this;
    }

    protected com.aedms.core.entities.source.Engine getTarget() {
        return target;
    }

    @Override
    public com.aedms.core.entities.source.Engine build() {
        return getTarget();
    }
}
