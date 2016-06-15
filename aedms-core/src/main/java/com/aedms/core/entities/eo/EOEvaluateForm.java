package com.aedms.core.entities.eo;

import com.aedms.core.entities.AedmsEntity;
import fr.lteconsulting.Mandatory;
import fr.lteconsulting.UseBuilderGenerator;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author jaly
 */
@Entity
@Table(name = "EO_EVAL_FORM")
public class EOEvaluateForm extends AedmsEntity {
    
    private static final long serialVersionUID = 1L;
    
    @Column(name = "EV_NO")
    private String evaluateNumber;
    
    @Column(name = "SUBJECT")
    private String subject;
    
    @Column(name = "QUANLITY")
    private int quanlity;
    
    @Column(name = "COMPREHEND")
    private int comprehend;
    
    @Column(name = "EXECUTABILITY")
    private int executability;
    
    @Column(name = "VERACITY")
    private int veracity;
    
    @Column(name = "ADVICE")
    private String advice;
    
    @Column(name = "EO_ORDER_ID")
    @OneToOne(optional = false, fetch = FetchType.LAZY, mappedBy = "eoEvaluateForm")
    private EOOrder eoOrder;
    
    public EOEvaluateForm(){}
    
    @UseBuilderGenerator
    public EOEvaluateForm(@Mandatory EOOrder eoOrder, String evaluateNumber, String subject,
               int quanlity, int comprehend, int executability, int veracity, String advice ) {
        super();
        this.eoOrder = eoOrder;
        this.evaluateNumber = evaluateNumber;
        this.subject = subject;
        this.quanlity = quanlity;
        this.comprehend = comprehend;
        this.executability = executability;
        this.veracity = veracity;
        this.advice = advice;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        return sb.toString();
    }

    /**
     * @return the evaluateNumber
     */
    public String getEvaluateNumber() {
        return evaluateNumber;
    }

    /**
     * @param evaluateNumber the evaluateNumber to set
     */
    public void setEvaluateNumber(String evaluateNumber) {
        this.evaluateNumber = evaluateNumber;
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
     * @return the quanlity
     */
    public int getQuanlity() {
        return quanlity;
    }

    /**
     * @param quanlity the quanlity to set
     */
    public void setQuanlity(int quanlity) {
        this.quanlity = quanlity;
    }

    /**
     * @return the comprehend
     */
    public int getComprehend() {
        return comprehend;
    }

    /**
     * @param comprehend the comprehend to set
     */
    public void setComprehend(int comprehend) {
        this.comprehend = comprehend;
    }

    /**
     * @return the executability
     */
    public int getExecutability() {
        return executability;
    }

    /**
     * @param executability the executability to set
     */
    public void setExecutability(int executability) {
        this.executability = executability;
    }

    /**
     * @return the veracity
     */
    public int getVeracity() {
        return veracity;
    }

    /**
     * @param veracity the veracity to set
     */
    public void setVeracity(int veracity) {
        this.veracity = veracity;
    }

    /**
     * @return the advice
     */
    public String getAdvice() {
        return advice;
    }

    /**
     * @param advice the advice to set
     */
    public void setAdvice(String advice) {
        this.advice = advice;
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
