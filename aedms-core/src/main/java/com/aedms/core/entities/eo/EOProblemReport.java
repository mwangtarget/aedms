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
@Table(name = "EO_PRO_REPORT")
public class EOProblemReport extends AedmsEntity {
    
    private static final long serialVersionUID = 1L;
    
    @Column(name = "EO_PRO_NO", length = 50)
    private String eoProblemNumber;
    
    @Column(name = "SUBJECT", length = 200)
    private String subject;
    
    @Column(name = "PROBLEM_DESC", length = 4000)
    private String problemDescription;
    
    @Column(name = "ACTION", length = 4000)
    private String action;
    
    @Column(name = "REPLY_DATE")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date replyDate;
    
    @Column(name = "REPLY", length = 4000)
    private String reply;
    
    @Column(name = "HANDLE_RESULT", length = 10)
    private String handleResult;
    
    @Column(name = "STATUS", length = 1)
    private char status;
    
    @Column(name = "CLOSE_TIME")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date closeTime;
    
    @Column(name = "EO_ORDER_ID")
    @OneToOne(optional = false, fetch = FetchType.LAZY, mappedBy = "eoProReport")
    private EOOrder eoOrder;
            
    public EOProblemReport(){}
    
    @UseBuilderGenerator
    public EOProblemReport(@Mandatory EOOrder eoOrder, String eoProblemNumber, String subject, String problemDescription, 
                             String action, Date replyDate, String reply, String handleResult, char status, Date closeTime) {
        super();
        this.eoOrder = eoOrder;
        this.eoProblemNumber = eoProblemNumber;
        this.subject = subject;
        this.problemDescription = problemDescription;
        this.action = action;
        this.replyDate = replyDate;
        this.reply = reply;
        this.handleResult = handleResult;
        this.status = status;
        this.closeTime = closeTime;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        return sb.toString();
    }

    /**
     * @return the eoProblemNumber
     */
    public String getEoProblemNumber() {
        return eoProblemNumber;
    }

    /**
     * @param eoProblemNumber the eoProblemNumber to set
     */
    public void setEoProblemNumber(String eoProblemNumber) {
        this.eoProblemNumber = eoProblemNumber;
    }

    /**
     * @return the subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @param subject the subject to set
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * @return the problemDescription
     */
    public String getProblemDescription() {
        return problemDescription;
    }

    /**
     * @param problemDescription the problemDescription to set
     */
    public void setProblemDescription(String problemDescription) {
        this.problemDescription = problemDescription;
    }

    /**
     * @return the action
     */
    public String getAction() {
        return action;
    }

    /**
     * @param action the action to set
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * @return the replyDate
     */
    public Date getReplyDate() {
        return replyDate;
    }

    /**
     * @param replyDate the replyDate to set
     */
    public void setReplyDate(Date replyDate) {
        this.replyDate = replyDate;
    }

    /**
     * @return the reply
     */
    public String getReply() {
        return reply;
    }

    /**
     * @param reply the reply to set
     */
    public void setReply(String reply) {
        this.reply = reply;
    }

    /**
     * @return the handleResult
     */
    public String getHandleResult() {
        return handleResult;
    }

    /**
     * @param handleResult the handleResult to set
     */
    public void setHandleResult(String handleResult) {
        this.handleResult = handleResult;
    }

    /**
     * @return the status
     */
    public char getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(char status) {
        this.status = status;
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
