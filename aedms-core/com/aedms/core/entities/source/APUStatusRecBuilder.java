package com.aedms.core.entities.source;


public class APUStatusRecBuilder implements com.aedms.core.entities.source.Builder<com.aedms.core.entities.source.APUStatusRec> {
    public static APUStatusRecBuilder anAPUStatusRec() {
        return new APUStatusRecBuilder();
    }    
    private com.aedms.core.entities.source.APUStatusRec target = new com.aedms.core.entities.source.APUStatusRec();
    
    public APUStatusRecBuilder() {}
    
    public APUStatusRecBuilder withInstallFC(int installFC) {
        getTarget().setInstallFC(installFC);
        return this;
    }
    
    public APUStatusRecBuilder withApuStatus(java.lang.String apuStatus) {
        getTarget().setApuStatus(apuStatus);
        return this;
    }
    
    public APUStatusRecBuilder withInstallFH(int installFH) {
        getTarget().setInstallFH(installFH);
        return this;
    }
    
    public APUStatusRecBuilder withRemark(java.lang.String remark) {
        getTarget().setRemark(remark);
        return this;
    }
    
    public APUStatusRecBuilder withInstallANO(java.lang.String installANO) {
        getTarget().setInstallANO(installANO);
        return this;
    }
    
    public APUStatusRecBuilder withTSN(java.lang.Float TSN) {
        getTarget().setTSN(TSN);
        return this;
    }
    
    public APUStatusRecBuilder withOptType(java.lang.String optType) {
        getTarget().setOptType(optType);
        return this;
    }
    
    public APUStatusRecBuilder withTSO(java.lang.Float TSO) {
        getTarget().setTSO(TSO);
        return this;
    }
    
    public APUStatusRecBuilder withInstallDate(java.util.Date installDate) {
        getTarget().setInstallDate(installDate);
        return this;
    }
    
    public APUStatusRecBuilder withLastRpDate(java.util.Date lastRpDate) {
        getTarget().setLastRpDate(lastRpDate);
        return this;
    }
    
    public APUStatusRecBuilder withRecordDate(java.util.Date recordDate) {
        getTarget().setRecordDate(recordDate);
        return this;
    }
    
    public APUStatusRecBuilder withId(java.lang.Long id) {
        getTarget().setId(id);
        return this;
    }
    
    public APUStatusRecBuilder withLastRpUnit(java.lang.String lastRpUnit) {
        getTarget().setLastRpUnit(lastRpUnit);
        return this;
    }
    
    public APUStatusRecBuilder withTearDownDate(java.util.Date tearDownDate) {
        getTarget().setTearDownDate(tearDownDate);
        return this;
    }
    
    public APUStatusRecBuilder withRepairDate(java.util.Date repairDate) {
        getTarget().setRepairDate(repairDate);
        return this;
    }
    
    public APUStatusRecBuilder withTearDownCause(java.lang.String tearDownCause) {
        getTarget().setTearDownCause(tearDownCause);
        return this;
    }
    
    public APUStatusRecBuilder withCSO(java.lang.Integer CSO) {
        getTarget().setCSO(CSO);
        return this;
    }
    
    public APUStatusRecBuilder withRepairUnit(java.lang.String repairUnit) {
        getTarget().setRepairUnit(repairUnit);
        return this;
    }
    
    public APUStatusRecBuilder withTearDownAno(java.lang.String tearDownAno) {
        getTarget().setTearDownAno(tearDownAno);
        return this;
    }
    
    public APUStatusRecBuilder withCSN(java.lang.Integer CSN) {
        getTarget().setCSN(CSN);
        return this;
    }
    
    protected com.aedms.core.entities.source.APUStatusRec getTarget() {
        return target;
    }
    
    public com.aedms.core.entities.source.APUStatusRec build() {
        return getTarget();
    }
}
