package com.aedms.core.entities.source.builder;

import com.aedms.core.entities.source.AirCraftStatusRec;
import java.util.Date;

/**
 *
 * @author jaly
 */
public class AirCraftStatusRecBuilder implements Builder<AirCraftStatusRec>{

    private AirCraftStatusRecBuilder(){}
    
    public static AirCraftStatusRecBuilder createAirCraftStatusRecBuilder() {
        return new AirCraftStatusRecBuilder();
    }
    
    private final AirCraftStatusRec target = new AirCraftStatusRec();
    
    public AirCraftStatusRecBuilder withStatus(String status) {
        this.getTarget().setStatus(status);
       return this;
    }
    
    public AirCraftStatusRecBuilder withStatusChangeDate(Date statusChangeDate) {
        this.getTarget().setStatusChangeDate(statusChangeDate);
        return this;
    }
    
    public AirCraftStatusRecBuilder withTT(float tt) {
        this.getTarget().setTt(tt);
        return this;
    }
    
    public AirCraftStatusRecBuilder withTC(int tc) {
        this.getTarget().setTc(tc);
        return this;
    }
    
    public AirCraftStatusRecBuilder withTSO(float tso) {
        this.getTarget().setTso(tso);
        return this;
    }
    
    public AirCraftStatusRecBuilder withCSO(int cso) {
        this.getTarget().setCso(cso);
        return this;
    }
    
    public AirCraftStatusRecBuilder withRemainFH(float remainFH) {
        this.getTarget().setRemainFH(remainFH);
        return this;
    }
    
    public AirCraftStatusRecBuilder withRemainFC(int remainFC) {
        this.getTarget().setRemainFC(remainFC);
        return this;
    }
    
    @Override
    public AirCraftStatusRec build() {
        return this.getTarget();
    }

    /**
     * @return the target
     */
    protected AirCraftStatusRec getTarget() {
        return target;
    }
    
}
