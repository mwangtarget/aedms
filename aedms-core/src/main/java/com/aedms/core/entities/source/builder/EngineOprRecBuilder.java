package com.aedms.core.entities.source.builder;


public class EngineOprRecBuilder implements com.aedms.core.entities.source.builder.Builder<com.aedms.core.entities.source.EngineOprRec> {
    public static EngineOprRecBuilder anEngineOprRec() {
        return new EngineOprRecBuilder();
    }    
    private com.aedms.core.entities.source.EngineOprRec target = new com.aedms.core.entities.source.EngineOprRec();
    
    public EngineOprRecBuilder() {}
    
    public EngineOprRecBuilder withHrsPostInst(java.lang.Double hrsPostInst) {
        getTarget().setHrsPostInst(hrsPostInst);
        return this;
    }
    
    public EngineOprRecBuilder withTSO(java.lang.Double TSO) {
        getTarget().setTSO(TSO);
        return this;
    }
    
    public EngineOprRecBuilder withEngine(com.aedms.core.entities.source.Engine engine) {
        getTarget().setEngine(engine);
        return this;
    }
    
    public EngineOprRecBuilder withRemainHrs(java.lang.Double remainHrs) {
        getTarget().setRemainHrs(remainHrs);
        return this;
    }
    
    public EngineOprRecBuilder withRemainCirs(java.lang.Integer remainCirs) {
        getTarget().setRemainCirs(remainCirs);
        return this;
    }
    
    public EngineOprRecBuilder withRecordDate(java.util.Date recordDate) {
        getTarget().setRecordDate(recordDate);
        return this;
    }
    
    public EngineOprRecBuilder withCirsPostInst(java.lang.Integer cirsPostInst) {
        getTarget().setCirsPostInst(cirsPostInst);
        return this;
    }
    
    public EngineOprRecBuilder withId(long id) {
        getTarget().setId(id);
        return this;
    }
    
    public EngineOprRecBuilder withCSO(java.lang.Integer CSO) {
        getTarget().setCSO(CSO);
        return this;
    }
    
    public EngineOprRecBuilder withTSN(java.lang.Double TSN) {
        getTarget().setTSN(TSN);
        return this;
    }
    
    public EngineOprRecBuilder withCSN(java.lang.Integer CSN) {
        getTarget().setCSN(CSN);
        return this;
    }
    
    protected com.aedms.core.entities.source.EngineOprRec getTarget() {
        return target;
    }
    
    public com.aedms.core.entities.source.EngineOprRec build() {
        return getTarget();
    }
}
