package com.aedms.core.entities.eo;

import com.aedms.core.entities.AedmsEntity;
import com.aedms.core.entities.enums.MonStatus;
import fr.lteconsulting.Mandatory;
import fr.lteconsulting.UseBuilderGenerator;
import java.util.Date;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author jaly
 */
@Entity
@Table (name = "MON")
public class Mon extends AedmsEntity {
    
    private static final long serialVersionUID = 1L;
    
    @Column(name = "NON_NO", length = 50)
    private String monNumber;
    
    @Column(name = "SUBJECT", length = 50)
    private String subject;
    
    @Column(name = "REFADNO", length = 50)
    private String refAdNumber;
    
    @Column(name = "CREATED_DATE")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date createdDate;
    
    @Column(name = "CUSTOMER", length = 500)
    private String customer;
    
    @Column(name = "FINAL_LIMIT")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date finalLimit;
    
    @Column(name = "REASON", length = 4000)
    private String reason;
    
    @Column(name = "STATUS", length = 20)
    private MonStatus status;
    
    @Column(name = "CONFIRM", length = 1000)
    private String confirm;
    
    @Column(name = "EO_ORDER_ID")
    @OneToOne(optional = false, fetch = FetchType.LAZY, mappedBy = "mon")
    private EOOrder eoOrder;
    
    @Column(name = "CLOSE_TIME")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date closeTime;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "mon")
    @JoinColumn(name = "MON_ID")
    private Set<MonMatList> monMatLists;
    
    public Mon(){}
    
    @UseBuilderGenerator
    public Mon(String monNumber, String subject, String refAdNumber, Date createdDate,
                 String customer, Date finalLimit, String reason, MonStatus status,
                 String confirm, @Mandatory EOOrder eoOrder, Date closeTime){
        super();
        this.monNumber = monNumber;
        this.subject = subject;
        this.refAdNumber = refAdNumber;
        this.createdDate = createdDate;
        this.customer = customer;
        this.finalLimit = finalLimit;
        this.reason = reason;
        this.status = status;
        this.confirm = confirm;
        this.eoOrder = eoOrder;
        this.closeTime = closeTime;
    }


    /**
     * @return the monNumber
     */
    public String getMonNumber() {
        return monNumber;
    }

    /**
     * @param monNumber the monNumber to set
     */
    public void setMonNumber(String monNumber) {
        this.monNumber = monNumber;
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
     * @return the refAdNumber
     */
    public String getRefAdNumber() {
        return refAdNumber;
    }

    /**
     * @param refAdNumber the refAdNumber to set
     */
    public void setRefAdNumber(String refAdNumber) {
        this.refAdNumber = refAdNumber;
    }

    /**
     * @return the createdDate
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * @param createdDate the createdDate to set
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * @return the customer
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(String customer) {
        this.customer = customer;
    }

    /**
     * @return the finalLimit
     */
    public Date getFinalLimit() {
        return finalLimit;
    }

    /**
     * @param finalLimit the finalLimit to set
     */
    public void setFinalLimit(Date finalLimit) {
        this.finalLimit = finalLimit;
    }

    /**
     * @return the reason
     */
    public String getReason() {
        return reason;
    }

    /**
     * @param reason the reason to set
     */
    public void setReason(String reason) {
        this.reason = reason;
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
     * @return the monMatLists
     */
    public Set<MonMatList> getMonMatLists() {
        return monMatLists;
    }

    /**
     * @param monMatLists the monMatLists to set
     */
    public void setMonMatLists(Set<MonMatList> monMatLists) {
        this.monMatLists = monMatLists;
    }
    
    /**
     * @return the status
     */
    public MonStatus getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(MonStatus status) {
        this.status = status;
    }

    /**
     * @return the confirm
     */
    public String getConfirm() {
        return confirm;
    }

    /**
     * @param confirm the confirm to set
     */
    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        return sb.toString();
    }
}
