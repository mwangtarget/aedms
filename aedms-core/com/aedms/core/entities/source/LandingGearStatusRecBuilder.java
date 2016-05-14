package com.aedms.core.entities.source;


public class LandingGearStatusRecBuilder implements com.aedms.core.entities.source.Builder<com.aedms.core.entities.source.LandingGearStatusRec> {
    public static LandingGearStatusRecBuilder aLandingGearStatusRec() {
        return new LandingGearStatusRecBuilder();
    }    
    private com.aedms.core.entities.source.LandingGearStatusRec target = new com.aedms.core.entities.source.LandingGearStatusRec();
    
    public LandingGearStatusRecBuilder() {}
    
    public LandingGearStatusRecBuilder withLandingGearStatus(java.lang.String landingGearStatus) {
        getTarget().setLandingGearStatus(landingGearStatus);
        return this;
    }
    
    public LandingGearStatusRecBuilder withRemark(java.lang.String remark) {
        getTarget().setRemark(remark);
        return this;
    }
    
    public LandingGearStatusRecBuilder withTsn(java.lang.String tsn) {
        getTarget().setTsn(tsn);
        return this;
    }
    
    public LandingGearStatusRecBuilder withTso(java.lang.String tso) {
        getTarget().setTso(tso);
        return this;
    }
    
    public LandingGearStatusRecBuilder withInstallDate(java.util.Date installDate) {
        getTarget().setInstallDate(installDate);
        return this;
    }
    
    public LandingGearStatusRecBuilder withLastRpDate(java.util.Date lastRpDate) {
        getTarget().setLastRpDate(lastRpDate);
        return this;
    }
    
    public LandingGearStatusRecBuilder withRecordDate(java.util.Date recordDate) {
        getTarget().setRecordDate(recordDate);
        return this;
    }
    
    public LandingGearStatusRecBuilder withId(java.lang.Long id) {
        getTarget().setId(id);
        return this;
    }
    
    public LandingGearStatusRecBuilder withTearDownDate(java.util.Date tearDownDate) {
        getTarget().setTearDownDate(tearDownDate);
        return this;
    }
    
    public LandingGearStatusRecBuilder withRepairDate(java.util.Date repairDate) {
        getTarget().setRepairDate(repairDate);
        return this;
    }
    
    public LandingGearStatusRecBuilder withTearDownCause(java.lang.String tearDownCause) {
        getTarget().setTearDownCause(tearDownCause);
        return this;
    }
    
    public LandingGearStatusRecBuilder withInstallFC(int installFC) {
        getTarget().setInstallFC(installFC);
        return this;
    }
    
    public LandingGearStatusRecBuilder withDocType(java.lang.String docType) {
        getTarget().setDocType(docType);
        return this;
    }
    
    public LandingGearStatusRecBuilder withInstallFH(int installFH) {
        getTarget().setInstallFH(installFH);
        return this;
    }
    
    public LandingGearStatusRecBuilder withRemainTime(java.lang.String remainTime) {
        getTarget().setRemainTime(remainTime);
        return this;
    }
    
    public LandingGearStatusRecBuilder withInstallAno(java.lang.String installAno) {
        getTarget().setInstallAno(installAno);
        return this;
    }
    
    public LandingGearStatusRecBuilder withOptType(java.lang.String optType) {
        getTarget().setOptType(optType);
        return this;
    }
    
    public LandingGearStatusRecBuilder withTimeLimit(java.lang.String timeLimit) {
        getTarget().setTimeLimit(timeLimit);
        return this;
    }
    
    public LandingGearStatusRecBuilder withInstallPosition(java.lang.String installPosition) {
        getTarget().setInstallPosition(installPosition);
        return this;
    }
    
    public LandingGearStatusRecBuilder withTearDownPis(java.lang.String tearDownPis) {
        getTarget().setTearDownPis(tearDownPis);
        return this;
    }
    
    public LandingGearStatusRecBuilder withLastRpUnit(java.lang.String lastRpUnit) {
        getTarget().setLastRpUnit(lastRpUnit);
        return this;
    }
    
    public LandingGearStatusRecBuilder withCso(java.lang.String cso) {
        getTarget().setCso(cso);
        return this;
    }
    
    public LandingGearStatusRecBuilder withRepairUnit(java.lang.String repairUnit) {
        getTarget().setRepairUnit(repairUnit);
        return this;
    }
    
    public LandingGearStatusRecBuilder withTearDownAno(java.lang.String tearDownAno) {
        getTarget().setTearDownAno(tearDownAno);
        return this;
    }
    
    public LandingGearStatusRecBuilder withCsn(java.lang.String csn) {
        getTarget().setCsn(csn);
        return this;
    }
    
    protected com.aedms.core.entities.source.LandingGearStatusRec getTarget() {
        return target;
    }
    
    public com.aedms.core.entities.source.LandingGearStatusRec build() {
        return getTarget();
    }
}
