package com.aedms.core.entities.source;


public class EngineStatRecBuilder implements com.aedms.core.entities.source.Builder<com.aedms.core.entities.source.EngineStatRec> {
    public static EngineStatRecBuilder anEngineStatRec() {
        return new EngineStatRecBuilder();
    }    
    private com.aedms.core.entities.source.EngineStatRec target = new com.aedms.core.entities.source.EngineStatRec();
    
    public EngineStatRecBuilder() {}
    
    public EngineStatRecBuilder withHrsPostInst(java.lang.Double hrsPostInst) {
        getTarget().setHrsPostInst(hrsPostInst);
        return this;
    }
    
    public EngineStatRecBuilder withRepDate(java.util.Date repDate) {
        getTarget().setRepDate(repDate);
        return this;
    }
    
    public EngineStatRecBuilder withEngineStat(java.lang.String engineStat) {
        getTarget().setEngineStat(engineStat);
        return this;
    }
    
    public EngineStatRecBuilder withTdANO(java.lang.String tdANO) {
        getTarget().setTdANO(tdANO);
        return this;
    }
    
    public EngineStatRecBuilder withCirsPostInst(java.lang.Integer cirsPostInst) {
        getTarget().setCirsPostInst(cirsPostInst);
        return this;
    }
    
    public EngineStatRecBuilder withRemark(java.lang.String remark) {
        getTarget().setRemark(remark);
        return this;
    }
    
    public EngineStatRecBuilder withInstallANO(java.lang.String installANO) {
        getTarget().setInstallANO(installANO);
        return this;
    }
    
    public EngineStatRecBuilder withTdCause(java.lang.String tdCause) {
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
    
    public EngineStatRecBuilder withInstallPos(java.lang.String installPos) {
        getTarget().setInstallPos(installPos);
        return this;
    }
    
    public EngineStatRecBuilder withRepUnit(java.lang.String repUnit) {
        getTarget().setRepUnit(repUnit);
        return this;
    }
    
    public EngineStatRecBuilder withEngine(com.aedms.core.entities.source.Builder<com.aedms.core.entities.source.Engine> engine) {
        getTarget().setEngine(engine.build());
        return this;
    }
    
    public EngineStatRecBuilder withInstallDate(java.util.Date installDate) {
        getTarget().setInstallDate(installDate);
        return this;
    }
    
    public EngineStatRecBuilder withLastRpDate(java.util.Date lastRpDate) {
        getTarget().setLastRpDate(lastRpDate);
        return this;
    }
    
    public EngineStatRecBuilder withId(long id) {
        getTarget().setId(id);
        return this;
    }
    
    public EngineStatRecBuilder withLastRpUnit(java.lang.String lastRpUnit) {
        getTarget().setLastRpUnit(lastRpUnit);
        return this;
    }
    
    public EngineStatRecBuilder withTdPIS(java.lang.String tdPIS) {
        getTarget().setTdPIS(tdPIS);
        return this;
    }
    
    public EngineStatRecBuilder withCSO(java.lang.Integer CSO) {
        getTarget().setCSO(CSO);
        return this;
    }
    
    public EngineStatRecBuilder withCSN(java.lang.Integer CSN) {
        getTarget().setCSN(CSN);
        return this;
    }
    
    protected com.aedms.core.entities.source.EngineStatRec getTarget() {
        return target;
    }
    
    public com.aedms.core.entities.source.EngineStatRec build() {
        return getTarget();
    }
}
