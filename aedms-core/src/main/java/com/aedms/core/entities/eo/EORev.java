package com.aedms.core.entities.eo;

import com.aedms.core.entities.AedmsEntity;
import fr.lteconsulting.UseBuilderGenerator;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author jaly
 */
@Entity
@Table(name = "EO_REV")
public class EORev extends AedmsEntity {
    
    private static final long serialVersionUID = 1L;
    
    @Column(name="EOCN_NO", length=50)
    private String eocnNumber;
    
    @Column(name="SUBJECT", length=500)
    private String subject;
    
    @Column(name="ISSUE_DATE")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date issueDate;
    
    @Column(name="CHG_TYPE", length=10)
    private String changeType;
    
    @Column(name="RSN_CNT", length=4000)
    private String changeReason;
    
    @Column(name="STATUS", length=10)
    private String status;
    
    @Column(name="RECEIPT", length=2000)
    private String receipt;
    
    @Column(name="EORFTP_PATH", length=500)
    private String eoReferencetPath;
    
    @Column(name="EORFTP_NAME", length=200)
    private String eoReferenceName;
    
    @Column(name="CLOSE_TIME")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date closeTime;
    
    public EORev() {
    }
    
    @UseBuilderGenerator
    public EORev(String eocnNumber, String subject, Date issueDate, String changeType,String changeReason,
                  String status, String receipt, String eoReferencetPath, String eoReferenceName, Date closeTime ) {
        super();
        this.eocnNumber = eocnNumber;
        this.subject = subject;
        this.issueDate = issueDate;
        this.changeType = changeType;
        this.changeReason = changeReason;
        this.status = status;
        this.receipt = receipt;
        this.eoReferencetPath = eoReferencetPath;
        this.eoReferenceName = eoReferenceName;
        this.closeTime = closeTime;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        return sb.toString();
    }

    /**
     * @return the eocnNumber
     */
    public String getEocnNumber() {
        return eocnNumber;
    }

    /**
     * @param eocnNumber the eocnNumber to set
     */
    public void setEocnNumber(String eocnNumber) {
        this.eocnNumber = eocnNumber;
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
     * @return the issueDate
     */
    public Date getIssueDate() {
        return issueDate;
    }

    /**
     * @param issueDate the issueDate to set
     */
    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    /**
     * @return the changeType
     */
    public String getChangeType() {
        return changeType;
    }

    /**
     * @param changeType the changeType to set
     */
    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    /**
     * @return the changeReason
     */
    public String getChangeReason() {
        return changeReason;
    }

    /**
     * @param changeReason the changeReason to set
     */
    public void setChangeReason(String changeReason) {
        this.changeReason = changeReason;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the receipt
     */
    public String getReceipt() {
        return receipt;
    }

    /**
     * @param receipt the receipt to set
     */
    public void setReceipt(String receipt) {
        this.receipt = receipt;
    }

    /**
     * @return the eoReferencetPath
     */
    public String getEoReferencetPath() {
        return eoReferencetPath;
    }

    /**
     * @param eoReferencetPath the eoReferencetPath to set
     */
    public void setEoReferencetPath(String eoReferencetPath) {
        this.eoReferencetPath = eoReferencetPath;
    }

    /**
     * @return the eoReferenceName
     */
    public String getEoReferenceName() {
        return eoReferenceName;
    }

    /**
     * @param eoReferenceName the eoReferenceName to set
     */
    public void setEoReferenceName(String eoReferenceName) {
        this.eoReferenceName = eoReferenceName;
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
    
}
