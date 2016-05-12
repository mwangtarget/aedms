package com.aedms.core.entities.source.builder;

import com.aedms.core.entities.source.LandingGearStatusRec;
import java.util.Date;

/**
 *
 * @author jaly
 */
public class LandingGearStatusRecBuilder implements Builder<LandingGearStatusRec> {

    private LandingGearStatusRecBuilder() {
    }

    public static LandingGearStatusRecBuilder createLandingGearStatusRecBuilder() {
        return new LandingGearStatusRecBuilder();
    }

    private final LandingGearStatusRec target = new LandingGearStatusRec();

    public LandingGearStatusRecBuilder withTSN(String tsn) {
        this.getTarget().setTsn(tsn);
        return this;
    }

    public LandingGearStatusRecBuilder withCSN(String csn) {
        this.getTarget().setCsn(csn);
        return this;
    }

    public LandingGearStatusRecBuilder withTSO(String tso) {
        this.getTarget().setTso(tso);
        return this;
    }

    public LandingGearStatusRecBuilder withCSO(String cso) {
        this.getTarget().setCso(cso);
        return this;
    }

    public LandingGearStatusRecBuilder withLastRpDate(Date lastRpDate) {
        this.getTarget().setLastRpDate(lastRpDate);
        return this;
    }

    public LandingGearStatusRecBuilder withLastRpUnit(String lastRpUnit) {
        this.getTarget().setLastRpUnit(lastRpUnit);
        return this;
    }

    public LandingGearStatusRecBuilder withInstallDate(Date intallDate) {
        this.getTarget().setInstallDate(intallDate);
        return this;
    }

    public LandingGearStatusRecBuilder withInstallANO(String installAno) {
        this.getTarget().setInstallAno(installAno);
        return this;
    }

    public LandingGearStatusRecBuilder withInstallPosition(String position) {
        this.getTarget().setInstallPosition(position);
        return this;
    }

    public LandingGearStatusRecBuilder withInstallFC(int installFC) {
        this.getTarget().setInstallFC(installFC);
        return this;
    }

    public LandingGearStatusRecBuilder withInstallFH(int installFH) {
        this.getTarget().setInstallFH(installFH);
        return this;
    }

    public LandingGearStatusRecBuilder withTimeLimit(String timeLimit) {
        this.getTarget().setTimeLimit(timeLimit);
        return this;
    }

    public LandingGearStatusRecBuilder withRemainTime(String remainTime) {
        this.getTarget().setRemainTime(remainTime);
        return this;
    }

    public LandingGearStatusRecBuilder withDocType(String docType) {
        this.getTarget().setDocType(docType);
        return this;
    }

    public LandingGearStatusRecBuilder withTearDownDate(Date tearDownDate) {
        this.getTarget().setTearDownDate(tearDownDate);
        return this;
    }

    public LandingGearStatusRecBuilder withTearDownAno(String tearDownAno) {
        this.getTarget().setTearDownAno(tearDownAno);
        return this;
    }

    public LandingGearStatusRecBuilder withTearDownPis(String tearDownPis) {
        this.getTarget().setTearDownPis(tearDownPis);
        return this;
    }

    public LandingGearStatusRecBuilder withTearDownCause(String tearDownCause) {
        this.getTarget().setTearDownCause(tearDownCause);
        return this;
    }

    public LandingGearStatusRecBuilder withLandingGearStatus(String landingGearStatus) {
        this.getTarget().setLandingGearStatus(landingGearStatus);
        return this;
    }

    public LandingGearStatusRecBuilder withRemark(String remark) {
        this.getTarget().setRemark(remark);
        return this;
    }

    public LandingGearStatusRecBuilder withRecordDate(Date recordDate) {
        this.getTarget().setRecordDate(recordDate);
        return this;
    }

    public LandingGearStatusRecBuilder withRepairDate(Date repairDate) {
        this.getTarget().setRepairDate(repairDate);
        return this;
    }

    public LandingGearStatusRecBuilder withRepairUnit(String repairUnit) {
        this.getTarget().setRepairUnit(repairUnit);
        return this;
    }

    public LandingGearStatusRecBuilder withOptType(String optType) {
        this.getTarget().setOptType(optType);
        return this;
    }

    @Override
    public LandingGearStatusRec build() {
        return this.getTarget();
    }

    /**
     * @return the target
     */
    protected LandingGearStatusRec getTarget() {
        return target;
    }

}
