package com.aedms.core.entities.source.builder;

import com.aedms.core.entities.source.APUStatusRec;
import java.util.Date;

/**
 *
 * @author jaly
 */
public class APUStatusRecBuilder implements Builder<APUStatusRec>{
    
    private APUStatusRecBuilder(){}
    
    public static APUStatusRecBuilder createAPUStatusRecBuilder() {
        return new APUStatusRecBuilder();
    }

    private final APUStatusRec target = new APUStatusRec();
    
    public APUStatusRecBuilder withTSN(float tsn) {
        this.getTarget().setTSN(tsn);
        return this;
    }
    
    public APUStatusRecBuilder withCSN(int csn) {
        this.getTarget().setCSN(csn);
        return this;
    }
    
    public APUStatusRecBuilder withTSO(float tso) {
        this.getTarget().setTSO(tso);
        return this;
    }
    
    public APUStatusRecBuilder withCSO(int cso) {
        this.getTarget().setCSO(cso);
        return this;
    }
    
    public APUStatusRecBuilder withLastRpDate(Date lastRpDate) {
        this.getTarget().setLastRpDate(lastRpDate);
        return this;
    }
    
    public APUStatusRecBuilder withLastRpUnit(String lastRpUnit) {
        this.getTarget().setLastRpUnit(lastRpUnit);
        return this;
    }
    
    public APUStatusRecBuilder withInstallFH(int installFH) {
        this.getTarget().setInstallFH(installFH);
        return this;
    }
    
    public APUStatusRecBuilder withInstallFC(int installFC) {
        this.getTarget().setInstallFC(installFC);
        return this;
    }
    
    public APUStatusRecBuilder withTearDownDate(Date tearDonwDate) {
        this.getTarget().setTearDownDate(tearDonwDate);
        return this;
    }
    
    public APUStatusRecBuilder withTearDownANO(String tearDownAno) {
        this.getTarget().setTearDownAno(tearDownAno);
        return this;
    }
    
    public APUStatusRecBuilder withTearDownCause(String tearDownCause) {
        this.getTarget().setTearDownCause(tearDownCause);
        return this;
    }
    
    public APUStatusRecBuilder withAPUStatus(String apuStatus) {
        this.getTarget().setApuStatus(apuStatus);
        return this;
    }
    
    public APUStatusRecBuilder withRemark(String remark) {
        this.getTarget().setRemark(remark);
        return this;
    }
    
    public APUStatusRecBuilder withRecordDate(Date recordDate) {
        this.getTarget().setRecordDate(recordDate);
        return this;
    }
    
    public APUStatusRecBuilder withRepairUnit(String repairUnit) {
        this.getTarget().setRepairUnit(repairUnit);
        return this;
    }
    
    public APUStatusRecBuilder withOptType(String optType) {
        this.getTarget().setOptType(optType);
        return this;
    }
    
    @Override
    public APUStatusRec build() {
        return this.getTarget();
    }

    /**
     * @return the target
     */
    protected APUStatusRec getTarget() {
        return target;
    }
    
}
