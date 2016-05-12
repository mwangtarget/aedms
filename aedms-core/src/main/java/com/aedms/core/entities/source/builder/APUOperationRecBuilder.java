package com.aedms.core.entities.source.builder;

import com.aedms.core.entities.source.APUOperationRec;
import java.util.Date;

/**
 *
 * @author jaly
 */
public class APUOperationRecBuilder implements Builder<APUOperationRec> {
    
    private APUOperationRecBuilder(){}
    
    public APUOperationRecBuilder createAPUOperationRecBuilder() {
        return new APUOperationRecBuilder();
    }

    private final APUOperationRec target = new APUOperationRec();
    
    public APUOperationRecBuilder withTSN(float tsn) {
        this.getTarget().setTsn(tsn);
        return this;
    }
    
    public APUOperationRecBuilder withCSN(int csn) {
        this.getTarget().setCsn(csn);
        return this;
    }
    
    public APUOperationRecBuilder withTSO(float tso) {
        this.getTarget().setTso(tso);
        return this;
    }
    
    public APUOperationRecBuilder withCSO(int cso) {
        this.getTarget().setCso(cso);
        return this;
    }
    
    public APUOperationRecBuilder withInstallFH(float installFH) {
        this.getTarget().setInstallFH(installFH);
        return this;
    }
    
    public APUOperationRecBuilder withInstallFC(int installFC) {
        this.getTarget().setInstallFC(installFC);
        return this;
    }
    
    public APUOperationRecBuilder withRemainFH(float remainFH) {
        this.getTarget().setRemainFH(remainFH);
        return this;
    }
    
    public APUOperationRecBuilder withRemainFC(int remainFC) {
        this.getTarget().setRemainFC(remainFC);
        return this;
    }
    
    public APUOperationRecBuilder withRecordDate(Date recordDate) {
        this.getTarget().setRecordDate(recordDate);
        return this;
    }
    
    @Override
    public APUOperationRec build() {
        return this.getTarget();
    }

    /**
     * @return the target
     */
    protected APUOperationRec getTarget() {
        return target;
    }
    
}
