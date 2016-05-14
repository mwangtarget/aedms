package com.aedms.core.entities.source;


public class LandingGearOperationRecBuilder implements com.aedms.core.entities.source.Builder<com.aedms.core.entities.source.LandingGearOperationRec> {
    public static LandingGearOperationRecBuilder aLandingGearOperationRec() {
        return new LandingGearOperationRecBuilder();
    }    
    private com.aedms.core.entities.source.LandingGearOperationRec target = new com.aedms.core.entities.source.LandingGearOperationRec();
    
    public LandingGearOperationRecBuilder() {}
    
    public LandingGearOperationRecBuilder withTso(float tso) {
        getTarget().setTso(tso);
        return this;
    }
    
    public LandingGearOperationRecBuilder withInstallFC(int installFC) {
        getTarget().setInstallFC(installFC);
        return this;
    }
    
    public LandingGearOperationRecBuilder withInstallFH(float installFH) {
        getTarget().setInstallFH(installFH);
        return this;
    }
    
    public LandingGearOperationRecBuilder withRecordDate(java.util.Date recordDate) {
        getTarget().setRecordDate(recordDate);
        return this;
    }
    
    public LandingGearOperationRecBuilder withRemainFC(int remainFC) {
        getTarget().setRemainFC(remainFC);
        return this;
    }
    
    public LandingGearOperationRecBuilder withId(java.lang.Long id) {
        getTarget().setId(id);
        return this;
    }
    
    public LandingGearOperationRecBuilder withRemainFH(float remainFH) {
        getTarget().setRemainFH(remainFH);
        return this;
    }
    
    public LandingGearOperationRecBuilder withCso(int cso) {
        getTarget().setCso(cso);
        return this;
    }
    
    public LandingGearOperationRecBuilder withTsn(float tsn) {
        getTarget().setTsn(tsn);
        return this;
    }
    
    public LandingGearOperationRecBuilder withCsn(int csn) {
        getTarget().setCsn(csn);
        return this;
    }
    
    protected com.aedms.core.entities.source.LandingGearOperationRec getTarget() {
        return target;
    }
    
    public com.aedms.core.entities.source.LandingGearOperationRec build() {
        return getTarget();
    }
}
