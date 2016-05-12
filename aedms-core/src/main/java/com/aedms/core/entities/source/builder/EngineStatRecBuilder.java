package com.aedms.core.entities.source.builder;

import com.aedms.core.entities.source.Engine;
import com.aedms.core.entities.source.EngineStatRec;
import java.util.Date;

public class EngineStatRecBuilder implements Builder<EngineStatRec> {

    public static EngineStatRecBuilder createEngineStatRecBuilder() {
        return new EngineStatRecBuilder();
    }
    private final EngineStatRec target = new EngineStatRec();

    private EngineStatRecBuilder() {
    }

    public EngineStatRecBuilder withHrsPostInst(double hrsPostInst) {
        getTarget().setHrsPostInst(hrsPostInst);
        return this;
    }

    public EngineStatRecBuilder withRepDate(Date repDate) {
        getTarget().setRepDate(repDate);
        return this;
    }

    public EngineStatRecBuilder withEngineStat(String engineStat) {
        getTarget().setEngineStat(engineStat);
        return this;
    }

    public EngineStatRecBuilder withTdANO(String tdANO) {
        getTarget().setTdANO(tdANO);
        return this;
    }

    public EngineStatRecBuilder withCirsPostInst(int cirsPostInst) {
        getTarget().setCirsPostInst(cirsPostInst);
        return this;
    }

    public EngineStatRecBuilder withRemark(String remark) {
        getTarget().setRemark(remark);
        return this;
    }

    public EngineStatRecBuilder withInstallANO(String installANO) {
        getTarget().setInstallANO(installANO);
        return this;
    }

    public EngineStatRecBuilder withTdCause(String tdCause) {
        getTarget().setTdCause(tdCause);
        return this;
    }

    public EngineStatRecBuilder withRecDate(java.util.Date recDate) {
        getTarget().setRecDate(recDate);
        return this;
    }

    public EngineStatRecBuilder withTdDate(java.util.Date tdDate) {
        getTarget().setTdDate(tdDate);
        return this;
    }

    public EngineStatRecBuilder withTSN(java.lang.Double TSN) {
        getTarget().setTSN(TSN);
        return this;
    }

    public EngineStatRecBuilder withTSO(java.lang.Double TSO) {
        getTarget().setTSO(TSO);
        return this;
    }

    public EngineStatRecBuilder withInstallPos(String installPos) {
        getTarget().setInstallPos(installPos);
        return this;
    }

    public EngineStatRecBuilder withRepUnit(String repUnit) {
        getTarget().setRepUnit(repUnit);
        return this;
    }

    public EngineStatRecBuilder withEngine(Engine engine) {
        getTarget().setEngine(engine);
        return this;
    }

    public EngineStatRecBuilder withInstallDate(Date installDate) {
        getTarget().setInstallDate(installDate);
        return this;
    }

    public EngineStatRecBuilder withLastRpDate(Date lastRpDate) {
        getTarget().setLastRpDate(lastRpDate);
        return this;
    }

    public EngineStatRecBuilder withId(long id) {
        getTarget().setId(id);
        return this;
    }

    public EngineStatRecBuilder withLastRpUnit(String lastRpUnit) {
        getTarget().setLastRpUnit(lastRpUnit);
        return this;
    }

    public EngineStatRecBuilder withTdPIS(String tdPIS) {
        getTarget().setTdPIS(tdPIS);
        return this;
    }

    public EngineStatRecBuilder withCSO(int CSO) {
        getTarget().setCSO(CSO);
        return this;
    }

    public EngineStatRecBuilder withCSN(int CSN) {
        getTarget().setCSN(CSN);
        return this;
    }

    protected EngineStatRec getTarget() {
        return target;
    }

    @Override
    public EngineStatRec build() {
        return getTarget();
    }
}
