package com.aedms.core.entities.source;


public class AircraftStatusRecBuilder implements com.aedms.core.entities.source.Builder<com.aedms.core.entities.source.AircraftStatusRec> {
    public static AircraftStatusRecBuilder anAircraftStatusRec() {
        return new AircraftStatusRecBuilder();
    }    
    private com.aedms.core.entities.source.AircraftStatusRec target = new com.aedms.core.entities.source.AircraftStatusRec();
    
    public AircraftStatusRecBuilder() {}
    
    public AircraftStatusRecBuilder withTt(float tt) {
        getTarget().setTt(tt);
        return this;
    }
    
    public AircraftStatusRecBuilder withStatusChangedDatetimne(java.util.Date statusChangedDatetimne) {
        getTarget().setStatusChangedDatetimne(statusChangedDatetimne);
        return this;
    }
    
    public AircraftStatusRecBuilder withTso(float tso) {
        getTarget().setTso(tso);
        return this;
    }
    
    public AircraftStatusRecBuilder withRemainFC(int remainFC) {
        getTarget().setRemainFC(remainFC);
        return this;
    }
    
    public AircraftStatusRecBuilder withId(java.lang.Long id) {
        getTarget().setId(id);
        return this;
    }
    
    public AircraftStatusRecBuilder withRemainFH(float remainFH) {
        getTarget().setRemainFH(remainFH);
        return this;
    }
    
    public AircraftStatusRecBuilder withCso(int cso) {
        getTarget().setCso(cso);
        return this;
    }
    
    public AircraftStatusRecBuilder withStatus(java.lang.String status) {
        getTarget().setStatus(status);
        return this;
    }
    
    public AircraftStatusRecBuilder withTc(int tc) {
        getTarget().setTc(tc);
        return this;
    }
    
    protected com.aedms.core.entities.source.AircraftStatusRec getTarget() {
        return target;
    }
    
    public com.aedms.core.entities.source.AircraftStatusRec build() {
        return getTarget();
    }
}
