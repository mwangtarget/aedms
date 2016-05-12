package com.aedms.core.entities.source.builder;

import com.aedms.core.entities.source.AircraftFlightRec;
import java.util.Date;

/**
 *
 * @author jaly
 */
public class AircraftFlightRecBuilder implements Builder<AircraftFlightRec>{

    public static AircraftFlightRecBuilder createAircraftFlightRecBuilder() {
        return new AircraftFlightRecBuilder();
    }
    
    private AircraftFlightRecBuilder(){}
    
    private final AircraftFlightRec target = new AircraftFlightRec();
    
    public AircraftFlightRecBuilder withTT(int tt) {
        this.getTarget().setTt(tt);
        return this;
    }
    
    public AircraftFlightRecBuilder withTC(int tc) {
        this.getTarget().setTc(tc);
        return this;
    }
    
    public AircraftFlightRecBuilder withTBO(int tbo) {
        this.getTarget().setTbo(tbo);
        return this;
    }
    
    public AircraftFlightRecBuilder withCBO(int cbo) {
        this.getTarget().setCbo(cbo);
        return this;
    }
    
    public AircraftFlightRecBuilder withTSO(int tso) {
        this.getTarget().setTso(tso);
        return this;
    }
    
    public AircraftFlightRecBuilder withCSO(int cso) {
        this.getTarget().setCso(cso);
        return this;
    }
    
    public AircraftFlightRecBuilder withTREM(int trem) {
        this.getTarget().setTrem(trem);
        return this;
    }
    
    public AircraftFlightRecBuilder withCREM(int crem) {
        this.getTarget().setCrem(crem);
        return this;
    }
    
    public AircraftFlightRecBuilder withTSLSV(int tslsv) {
        this.getTarget().setTslsv(tslsv);
        return this;
    }
    
    public AircraftFlightRecBuilder withCSLSV(Date cslsv) {
        this.getTarget().setCslsv(cslsv);
        return this;
    }
    
    public AircraftFlightRecBuilder withEffectDate(Date effectDate) {
        this.getTarget().setEffectDate(effectDate);
        return this;
    }
    
    @Override
    public AircraftFlightRec build() {
        return this.getTarget();
    }

    /**
     * @return the target
     */
    protected AircraftFlightRec getTarget() {
        return target;
    }
    
}
