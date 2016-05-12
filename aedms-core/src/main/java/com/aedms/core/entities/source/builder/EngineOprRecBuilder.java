package com.aedms.core.entities.source.builder;

import com.aedms.core.entities.source.Engine;
import com.aedms.core.entities.source.EngineOprRec;
import java.util.Date;


public class EngineOprRecBuilder implements Builder<EngineOprRec> {
    
    public static EngineOprRecBuilder createEngineOprRecBuilder() {
        return new EngineOprRecBuilder();
    }    
    private final EngineOprRec target = new EngineOprRec();
    
    private EngineOprRecBuilder() {}
    
    public EngineOprRecBuilder withHrsPostInst(double hrsPostInst) {
        getTarget().setHrsPostInst(hrsPostInst);
        return this;
    }
    
    public EngineOprRecBuilder withTSO(java.lang.Double TSO) {
        getTarget().setTSO(TSO);
        return this;
    }
    
    public EngineOprRecBuilder withEngine(Engine engine) {
        getTarget().setEngine(engine);
        return this;
    }
    
    public EngineOprRecBuilder withRemainHrs(double remainHrs) {
        getTarget().setRemainHrs(remainHrs);
        return this;
    }
    
    public EngineOprRecBuilder withRemainCirs(int remainCirs) {
        getTarget().setRemainCirs(remainCirs);
        return this;
    }
    
    public EngineOprRecBuilder withRecordDate(Date recordDate) {
        getTarget().setRecordDate(recordDate);
        return this;
    }
    
    public EngineOprRecBuilder withCirsPostInst(int cirsPostInst) {
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
    
    protected EngineOprRec getTarget() {
        return target;
    }
    
    @Override
    public EngineOprRec build() {
        return getTarget();
    }
}
