package com.aedms.core.entities.source.builder;

import com.aedms.core.entities.source.AircraftStatusRec;
import java.util.Date;

/**
 *
 * @author jaly
 */
public class AircraftStatusRecBuilder implements Builder<AircraftStatusRec> {
    
    private AircraftStatusRecBuilder() {}
    
    public static AircraftStatusRecBuilder createAircraftStatusRecBuilder() {
        return new AircraftStatusRecBuilder();
    }

    private final AircraftStatusRec target = new AircraftStatusRec();
    
    public AircraftStatusRecBuilder withStatus(String status) {
        this.getTarget().setStatus(status);
        return this;
    }
    
    public AircraftStatusRecBuilder withStatusChangedDatetimne(Date statusChangedDatetimne){
        this.getTarget().setStatusChangedDatetimne(statusChangedDatetimne);
        return this;
    }
    
    public AircraftStatusRecBuilder withTT(float tt) {
        this.getTarget().setTt(tt);
        return this;
    }
    
    public AircraftStatusRecBuilder withTC(int tc) {
        this.getTarget().setTc(tc);
        return this;
    }
    
    public AircraftStatusRecBuilder withTSO(float tso) {
        this.getTarget().setTso(tso);
        return this;
    }
    
    public AircraftStatusRecBuilder withCSO(int cso) {
        this.getTarget().setCso(cso);
        return this;
    }
    
    public AircraftStatusRecBuilder withRemainFH(float fh) {
        this.getTarget().setRemainFH(fh);
        return this;
    }
    
    public AircraftStatusRecBuilder withRemainFC(int fc) {
        this.getTarget().setRemainFC(fc);
        return this;
    }
    
    @Override
    public AircraftStatusRec build() {
        return this.getTarget();
    }

    /**
     * @return the target
     */
    protected AircraftStatusRec getTarget() {
        return target;
    }
    
}
