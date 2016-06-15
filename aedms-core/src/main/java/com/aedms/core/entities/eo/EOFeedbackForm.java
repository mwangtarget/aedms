package com.aedms.core.entities.eo;

import com.aedms.core.entities.AedmsEntity;
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
@Table(name = "EO_FEEDBACK_FORM")
public class EOFeedbackForm extends AedmsEntity {
    
    private static final long serialVersionUID = 1L;
    
    @Column(name = "EOFB_NO", length = 45)
    private String eoFBNumber;
    
    @Column(name = "SPEC_FDK_REQ", length = 45)
    private String specFdkReq;
    
    @Column(name = "FDK_ADDRESS", length = 45)
    private String fdkAddress;
    
    @Column(name = "EMAIL", length = 45)
    private String email;
    
    @Column(name = "FAX", length = 45)
    private String fax;
    
    @Column(name = "IMP_DATE")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date impDate;
    
    @Column(name = "FACT_MANPR")
    private double factManPR;
    
    @Column(name = "FACT_MAT")
    private double factMat;
    
    @Column(name = "FH")
    private double fh;
    
    @Column(name = "FC")
    private double fc;
    
    @Column(name = "AMEND_CONTRACT", length = 100)
    private String amendContract;
    
    @Column(name = "PRODUCE_ORDER", length = 45)
    private String productOrder;
    
    @Column(name = "SPEC_FDK_INFO", length = 45)
    private String specFdkInfo;
    
    @Column(name = "MEMO", length = 2000)
    private String memo;
    
    @Column(name = "COMPLETE_DATE")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date completeDate;
    
    @Column(name = "DOCUMENT_NAME", length = 200)
    private String documentName;
    
    @Column(name = "DOCUMENT_PATH", length = 500)
    private String documentPath;
    
    @Column(name = "STATUS", length = 20)
    private String status;
    
    @Column(name = "EOFB_AFFECT_TEXT", length = 500)
    private String eoFbAffectText;
    
    @Column(name = "EO_ORDER_ID")
    @OneToOne(optional = false, fetch = FetchType.LAZY, mappedBy = "eoFeedbackForm")
    private EOOrder eoOrder;
    
    @Column(name = "AFFECT_ID")
    @OneToOne(optional = false, fetch = FetchType.LAZY, mappedBy = "eoFeedbackForm")
    private Affect affect;
    
    @Column(name = "CLOSE_TIME")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date closeTime;
    
    @Column(name = "EO_POSTPONEMENT_ID")
    @OneToOne(optional = false, fetch = FetchType.LAZY, mappedBy = "eoFeedbackForm")
    private EOPostponement eoPostponement;
    
    public EOFeedbackForm(){}
    
    @UseBuilderGenerator
    public EOFeedbackForm(String eoFBNumber, String specFdkReq, String fdkAddress, String email, String fax,
            Date impDate, double factManPR, double factMat, double fh, double fc, String amendContract,
            String productOrder, String specFdkInfo, String memo,Date completeDate,String documentName,
            String documentPath, String status, String eoFbAffectText, EOOrder eoOrder, Affect affect, Date closeTime,
            EOPostponement eoPostponement){
        super();
        this.eoFBNumber = eoFBNumber;
        this.specFdkReq = specFdkReq;
        this.fdkAddress = fdkAddress;
        this.email = email;
        this.fax = fax;
        this.impDate = impDate;
        this.factManPR = factManPR;
        this.factMat = factMat;
        this.fh = fh;
        this.fc = fc;
        this.amendContract = amendContract;
        this.productOrder = productOrder;
        this.specFdkInfo = specFdkInfo;
        this.memo = memo;
        this.completeDate = completeDate;
        this.documentName = documentName;
        this.documentPath = documentPath;
        this.status = status;
        this.eoFbAffectText = eoFbAffectText;
        this.eoOrder = eoOrder;
        this.affect = affect;
        this.closeTime = closeTime;
        this.eoPostponement = eoPostponement;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        return sb.toString();
    }

    /**
     * @return the eoFBNumber
     */
    public String getEoFBNumber() {
        return eoFBNumber;
    }

    /**
     * @param eoFBNumber the eoFBNumber to set
     */
    public void setEoFBNumber(String eoFBNumber) {
        this.eoFBNumber = eoFBNumber;
    }

    /**
     * @return the specFdkReq
     */
    public String getSpecFdkReq() {
        return specFdkReq;
    }

    /**
     * @param specFdkReq the specFdkReq to set
     */
    public void setSpecFdkReq(String specFdkReq) {
        this.specFdkReq = specFdkReq;
    }

    /**
     * @return the fdkAddress
     */
    public String getFdkAddress() {
        return fdkAddress;
    }

    /**
     * @param fdkAddress the fdkAddress to set
     */
    public void setFdkAddress(String fdkAddress) {
        this.fdkAddress = fdkAddress;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the fax
     */
    public String getFax() {
        return fax;
    }

    /**
     * @param fax the fax to set
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * @return the impDate
     */
    public Date getImpDate() {
        return impDate;
    }

    /**
     * @param impDate the impDate to set
     */
    public void setImpDate(Date impDate) {
        this.impDate = impDate;
    }

    /**
     * @return the factManPR
     */
    public double getFactManPR() {
        return factManPR;
    }

    /**
     * @param factManPR the factManPR to set
     */
    public void setFactManPR(double factManPR) {
        this.factManPR = factManPR;
    }

    /**
     * @return the factMat
     */
    public double getFactMat() {
        return factMat;
    }

    /**
     * @param factMat the factMat to set
     */
    public void setFactMat(double factMat) {
        this.factMat = factMat;
    }

    /**
     * @return the fh
     */
    public double getFh() {
        return fh;
    }

    /**
     * @param fh the fh to set
     */
    public void setFh(double fh) {
        this.fh = fh;
    }

    /**
     * @return the fc
     */
    public double getFc() {
        return fc;
    }

    /**
     * @param fc the fc to set
     */
    public void setFc(double fc) {
        this.fc = fc;
    }

    /**
     * @return the amendContract
     */
    public String getAmendContract() {
        return amendContract;
    }

    /**
     * @param amendContract the amendContract to set
     */
    public void setAmendContract(String amendContract) {
        this.amendContract = amendContract;
    }

    /**
     * @return the productOrder
     */
    public String getProductOrder() {
        return productOrder;
    }

    /**
     * @param productOrder the productOrder to set
     */
    public void setProductOrder(String productOrder) {
        this.productOrder = productOrder;
    }

    /**
     * @return the specFdkInfo
     */
    public String getSpecFdkInfo() {
        return specFdkInfo;
    }

    /**
     * @param specFdkInfo the specFdkInfo to set
     */
    public void setSpecFdkInfo(String specFdkInfo) {
        this.specFdkInfo = specFdkInfo;
    }

    /**
     * @return the memo
     */
    public String getMemo() {
        return memo;
    }

    /**
     * @param memo the memo to set
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * @return the completeDate
     */
    public Date getCompleteDate() {
        return completeDate;
    }

    /**
     * @param completeDate the completeDate to set
     */
    public void setCompleteDate(Date completeDate) {
        this.completeDate = completeDate;
    }

    /**
     * @return the documentName
     */
    public String getDocumentName() {
        return documentName;
    }

    /**
     * @param documentName the documentName to set
     */
    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    /**
     * @return the documentPath
     */
    public String getDocumentPath() {
        return documentPath;
    }

    /**
     * @param documentPath the documentPath to set
     */
    public void setDocumentPath(String documentPath) {
        this.documentPath = documentPath;
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
     * @return the eoFbAffectText
     */
    public String getEoFbAffectText() {
        return eoFbAffectText;
    }

    /**
     * @param eoFbAffectText the eoFbAffectText to set
     */
    public void setEoFbAffectText(String eoFbAffectText) {
        this.eoFbAffectText = eoFbAffectText;
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
     * @return the eoPostponement
     */
    public EOPostponement getEoPostponement() {
        return eoPostponement;
    }

    /**
     * @param eoPostponement the eoPostponement to set
     */
    public void setEoPostponement(EOPostponement eoPostponement) {
        this.eoPostponement = eoPostponement;
    }
    
}
