package com.aedms.core.entities.eo;

import com.aedms.core.entities.AedmsEntity;
import fr.lteconsulting.Mandatory;
import fr.lteconsulting.UseBuilderGenerator;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author jaly
 */
@Entity
@Table (name = "EO_POSTPONEMENT")
public class EOPostponement extends AedmsEntity {
    
    private static final long serialVersionUID = 1L;
    
    @Column(name = "REPORT_BASE", length = 50)
    private String reportBase;
    
    @Column(name = "AFFECT_ID")
    @OneToOne
    private Affect affect;
    
    /**
     * 延期次数
     */
    @Column(name = "POST_TIME")
    private int postTime;
    
    @Column(name = "LAST_PP_DATE", length = 1000)
    private String lastPPDate;
    
    // 表设计中，是OneToMay的关系。 一个TimeLimit可以被多个EO_POSTPONEMENT对象使用
    @Column(name = "EXTEND_NO")
    @OneToOne(optional = false, fetch = FetchType.LAZY, mappedBy = "eoPostponement")
    private TimeLimit timeLimt;
    
    @Column(name = "PPC_DESC", length = 4000)
    private String ppcDescription;
    
    /**
     * 申请次数
     */
    @Column(name = "APPLY_TIME")
    private int applyTime;
    
    @Column(name = "EXTEND_LMT_TXT", length = 1000)
    private String extendLimitTxt;
    
    @Column(name = "DELAY_STATUS", length = 10)
    private String delayStatus;
    
    @Column(name = "CLOSE_TIME")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date closeTime;
    
    @Column(name = "EO_ORDER_ID")
    @OneToOne(optional = false, fetch = FetchType.LAZY, mappedBy = "eoPostponement")
    private EOOrder eoOrder;
    
    public EOPostponement(){}
    
    @UseBuilderGenerator
    public EOPostponement(@Mandatory EOOrder eoOrder, String reportBase, Affect affect,
            int postTime, String lastPPDate, TimeLimit timeLimt, String ppcDescription,
            int applyTime, String extendLimitTxt, String delayStatus, Date closeTime) {
        super();
        this.eoOrder = eoOrder;
        this.reportBase = reportBase;
        this.affect = affect;
        this.postTime = postTime;
        this.lastPPDate = lastPPDate;
        this.timeLimt = timeLimt;
        this.ppcDescription = ppcDescription;
        this.applyTime = applyTime;
        this.extendLimitTxt = extendLimitTxt;
        this.delayStatus = delayStatus;
        this.closeTime = closeTime;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        return sb.toString();
    }

    /**
     * @return the reportBase
     */
    public String getReportBase() {
        return reportBase;
    }

    /**
     * @param reportBase the reportBase to set
     */
    public void setReportBase(String reportBase) {
        this.reportBase = reportBase;
    }

    /**
     * @return the affect
     */
    public Affect getAffect() {
        return affect;
    }

    /**
     * @param affect the affect to set
     */
    public void setAffect(Affect affect) {
        this.affect = affect;
    }

    /**
     * @return the postTime
     */
    public int getPostTime() {
        return postTime;
    }

    /**
     * @param postTime the postTime to set
     */
    public void setPostTime(int postTime) {
        this.postTime = postTime;
    }

    /**
     * @return the lastPPDate
     */
    public String getLastPPDate() {
        return lastPPDate;
    }

    /**
     * @param lastPPDate the lastPPDate to set
     */
    public void setLastPPDate(String lastPPDate) {
        this.lastPPDate = lastPPDate;
    }

    /**
     * @return the timeLimt
     */
    public TimeLimit getTimeLimt() {
        return timeLimt;
    }

    /**
     * @param timeLimt the timeLimt to set
     */
    public void setTimeLimt(TimeLimit timeLimt) {
        this.timeLimt = timeLimt;
    }

    /**
     * @return the ppcDescription
     */
    public String getPpcDescription() {
        return ppcDescription;
    }

    /**
     * @param ppcDescription the ppcDescription to set
     */
    public void setPpcDescription(String ppcDescription) {
        this.ppcDescription = ppcDescription;
    }

    /**
     * @return the applyTime
     */
    public int getApplyTime() {
        return applyTime;
    }

    /**
     * @param applyTime the applyTime to set
     */
    public void setApplyTime(int applyTime) {
        this.applyTime = applyTime;
    }

    /**
     * @return the extendLimitTxt
     */
    public String getExtendLimitTxt() {
        return extendLimitTxt;
    }

    /**
     * @param extendLimitTxt the extendLimitTxt to set
     */
    public void setExtendLimitTxt(String extendLimitTxt) {
        this.extendLimitTxt = extendLimitTxt;
    }

    /**
     * @return the delayStatus
     */
    public String getDelayStatus() {
        return delayStatus;
    }

    /**
     * @param delayStatus the delayStatus to set
     */
    public void setDelayStatus(String delayStatus) {
        this.delayStatus = delayStatus;
    }

    /**
     * @return the closeTime
     */
    public Date getCloseTime() {
        return closeTime;
    }

    /**
     * @param closeTime the closeTime to set
     */
    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    /**
     * @return the eoOrder
     */
    public EOOrder getEoOrder() {
        return eoOrder;
    }

    /**
     * @param eoOrder the eoOrder to set
     */
    public void setEoOrder(EOOrder eoOrder) {
        this.eoOrder = eoOrder;
    }
    
}
