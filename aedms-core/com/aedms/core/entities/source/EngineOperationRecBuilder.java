package com.aedms.core.entities.source;


public class EngineOperationRecBuilder implements com.aedms.core.entities.source.Builder<com.aedms.core.entities.source.EngineOperationRec> {
    public static EngineOperationRecBuilder anEngineOperationRec() {
        return new EngineOperationRecBuilder();
    }    
    private com.aedms.core.entities.source.EngineOperationRec target = new com.aedms.core.entities.source.EngineOperationRec();
    
    public EngineOperationRecBuilder() {}
    
    public EngineOperationRecBuilder withHrsPostInst(java.lang.Double hrsPostInst) {
        getTarget().setHrsPostInst(hrsPostInst);
        return this;
    }
    
    public EngineOperationRecBuilder withTSO(java.lang.Double TSO) {
        getTarget().setTSO(TSO);
        return this;
    }
    
    public EngineOperationRecBuilder withEngine(com.aedms.core.entities.source.Builder<com.aedms.core.entities.source.Engine> engine) {
        getTarget().setEngine(engine.build());
        return this;
    }
    
    public EngineOperationRecBuilder withRemainHrs(java.lang.Double remainHrs) {
        getTarget().setRemainHrs(remainHrs);
        return this;
    }
    
    public EngineOperationRecBuilder withRemainCirs(java.lang.Integer remainCirs) {
        getTarget().setRemainCirs(remainCirs);
        return this;
    }
    
    public EngineOperationRecBuilder withRecordDate(java.util.Date recordDate) {
        getTarget().setRecordDate(recordDate);
        return this;
    }
    
    public EngineOperationRecBuilder withCirsPostInst(java.lang.Integer cirsPostInst) {
        getTarget().setCirsPostInst(cirsPostInst);
        return this;
    }
    
    public EngineOperationRecBuilder withId(long id) {
        getTarget().setId(id);
        return this;
    }
    
    public EngineOperationRecBuilder withCSO(java.lang.Integer CSO) {
        getTarget().setCSO(CSO);
        return this;
    }
    
    public EngineOperationRecBuilder withTSN(java.lang.Double TSN) {
        getTarget().setTSN(TSN);
        return this;
    }
    
    public EngineOperationRecBuilder withCSN(java.lang.Integer CSN) {
        getTarget().setCSN(CSN);
        return this;
    }
    
    protected com.aedms.core.entities.source.EngineOperationRec getTarget() {
        return target;
    }
    
    public com.aedms.core.entities.source.EngineOperationRec build() {
        return getTarget();
    }
}
