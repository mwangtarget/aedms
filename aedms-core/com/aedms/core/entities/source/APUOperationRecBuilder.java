package com.aedms.core.entities.source;


public class APUOperationRecBuilder implements com.aedms.core.entities.source.Builder<com.aedms.core.entities.source.APUOperationRec> {
    public static APUOperationRecBuilder anAPUOperationRec() {
        return new APUOperationRecBuilder();
    }    
    private com.aedms.core.entities.source.APUOperationRec target = new com.aedms.core.entities.source.APUOperationRec();
    
    public APUOperationRecBuilder() {}
    
    public APUOperationRecBuilder withTso(float tso) {
        getTarget().setTso(tso);
        return this;
    }
    
    public APUOperationRecBuilder withInstallFC(int installFC) {
        getTarget().setInstallFC(installFC);
        return this;
    }
    
    public APUOperationRecBuilder withInstallFH(float installFH) {
        getTarget().setInstallFH(installFH);
        return this;
    }
    
    public APUOperationRecBuilder withRecordDate(java.util.Date recordDate) {
        getTarget().setRecordDate(recordDate);
        return this;
    }
    
    public APUOperationRecBuilder withRemainFC(int remainFC) {
        getTarget().setRemainFC(remainFC);
        return this;
    }
    
    public APUOperationRecBuilder withId(java.lang.Long id) {
        getTarget().setId(id);
        return this;
    }
    
    public APUOperationRecBuilder withRemainFH(float remainFH) {
        getTarget().setRemainFH(remainFH);
        return this;
    }
    
    public APUOperationRecBuilder withCso(int cso) {
        getTarget().setCso(cso);
        return this;
    }
    
    public APUOperationRecBuilder withTsn(float tsn) {
        getTarget().setTsn(tsn);
        return this;
    }
    
    public APUOperationRecBuilder withCsn(int csn) {
        getTarget().setCsn(csn);
        return this;
    }
    
    protected com.aedms.core.entities.source.APUOperationRec getTarget() {
        return target;
    }
    
    public com.aedms.core.entities.source.APUOperationRec build() {
        return getTarget();
    }
}
