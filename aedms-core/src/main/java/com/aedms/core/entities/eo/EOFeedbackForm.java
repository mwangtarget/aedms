package com.aedms.core.entities.eo;

import com.aedms.core.entities.AedmsEntity;
import fr.lteconsulting.UseBuilderGenerator;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import org.joda.beans.BeanDefinition;
import org.joda.beans.Property;
import org.joda.beans.PropertyDefinition;
import java.util.Map;
import org.joda.beans.Bean;
import org.joda.beans.BeanBuilder;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

/**
 *
 * @author jaly
 */
@Entity
@Table(name = "EO_FEEDBACK_FORM")
@BeanDefinition
public class EOFeedbackForm extends AedmsEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    @PropertyDefinition
    private long id;

    @Column(name = "EOFB_NO", length = 45)
    @PropertyDefinition
    private String eoFBNumber;

    @Column(name = "SPEC_FDK_REQ", length = 45)
    @PropertyDefinition
    private String specFdkReq;

    @Column(name = "FDK_ADDRESS", length = 45)
    @PropertyDefinition
    private String fdkAddress;

    @Column(name = "EMAIL", length = 45)
    @PropertyDefinition
    private String email;

    @Column(name = "FAX", length = 45)
    @PropertyDefinition
    private String fax;

    @Column(name = "IMP_DATE")
    @Temporal(javax.persistence.TemporalType.DATE)
    @PropertyDefinition
    private Date impDate;

    @Column(name = "FACT_MANPR")
    @PropertyDefinition
    private double factManPR;

    @Column(name = "FACT_MAT")
    @PropertyDefinition
    private double factMat;

    @Column(name = "FH")
    @PropertyDefinition
    private double fh;

    @Column(name = "FC")
    @PropertyDefinition
    private double fc;

    @Column(name = "AMEND_CONTRACT", length = 100)
    @PropertyDefinition
    private String amendContract;

    @Column(name = "PRODUCE_ORDER", length = 45)
    @PropertyDefinition
    private String productOrder;

    @Column(name = "SPEC_FDK_INFO", length = 45)
    @PropertyDefinition
    private String specFdkInfo;

    @Column(name = "MEMO", length = 2000)
    @PropertyDefinition
    private String memo;

    @Column(name = "COMPLETE_DATE")
    @Temporal(javax.persistence.TemporalType.DATE)
    @PropertyDefinition
    private Date completeDate;

    @Column(name = "DOCUMENT_NAME", length = 200)
    @PropertyDefinition
    private String documentName;

    @Column(name = "DOCUMENT_PATH", length = 500)
    @PropertyDefinition
    private String documentPath;

    @Column(name = "STATUS", length = 20)
    @PropertyDefinition
    private String status;

    @Column(name = "EOFB_AFFECT_TEXT", length = 500)
    @PropertyDefinition
    private String eoFbAffectText;

    @Column(name = "EO_ORDER_ID")
    @OneToOne(optional = false, fetch = FetchType.LAZY, mappedBy = "eoFeedbackForm")
    @PropertyDefinition
    private EOOrder eoOrder;

    @Column(name = "AFFECT_ID")
    @OneToOne(optional = false, fetch = FetchType.LAZY, mappedBy = "eoFeedbackForm")
    @PropertyDefinition
    private Affect affect;

    @Column(name = "CLOSE_TIME")
    @Temporal(javax.persistence.TemporalType.DATE)
    @PropertyDefinition
    private Date closeTime;

    @Column(name = "EO_POSTPONEMENT_ID")
    @OneToOne(optional = false, fetch = FetchType.LAZY, mappedBy = "eoFeedbackForm")
    @PropertyDefinition
    private EOPostponement eoPostponement;

    public EOFeedbackForm() {
    }
    
    /**
     * 
     * @param eoFBNumber
     * @param specFdkReq
     * @param fdkAddress
     * @param email
     * @param fax
     * @param impDate
     * @param factManPR
     * @param factMat
     * @param fh
     * @param fc
     * @param amendContract
     * @param productOrder
     * @param specFdkInfo
     * @param memo
     * @param completeDate
     * @param documentName
     * @param documentPath
     * @param status
     * @param eoFbAffectText
     * @param eoOrder
     * @param affect
     * @param closeTime
     * @param eoPostponement 
     */
    @UseBuilderGenerator
    public EOFeedbackForm(String eoFBNumber,String specFdkReq, String fdkAddress, 
                            String email, String fax, Date impDate, double factManPR,
                            double factMat, double fh, double fc, String amendContract,
                            String productOrder, String specFdkInfo, String memo,
                            Date completeDate, String documentName, String documentPath,
                            String status, String eoFbAffectText, EOOrder eoOrder, Affect affect,
                            Date closeTime, EOPostponement eoPostponement) {
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

    //------------------------- AUTOGENERATED START -------------------------
    ///CLOVER:OFF
    /**
     * The meta-bean for {@code EOFeedbackForm}.
     * @return the meta-bean, not null
     */
    public static EOFeedbackForm.Meta meta() {
        return EOFeedbackForm.Meta.INSTANCE;
    }

    static {
        JodaBeanUtils.registerMetaBean(EOFeedbackForm.Meta.INSTANCE);
    }

    @Override
    public EOFeedbackForm.Meta metaBean() {
        return EOFeedbackForm.Meta.INSTANCE;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the id.
     * @return the value of the property
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the id.
     * @param id  the new value of the property
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Gets the the {@code id} property.
     * @return the property, not null
     */
    public final Property<Long> id() {
        return metaBean().id().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the eoFBNumber.
     * @return the value of the property
     */
    public String getEoFBNumber() {
        return eoFBNumber;
    }

    /**
     * Sets the eoFBNumber.
     * @param eoFBNumber  the new value of the property
     */
    public void setEoFBNumber(String eoFBNumber) {
        this.eoFBNumber = eoFBNumber;
    }

    /**
     * Gets the the {@code eoFBNumber} property.
     * @return the property, not null
     */
    public final Property<String> eoFBNumber() {
        return metaBean().eoFBNumber().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the specFdkReq.
     * @return the value of the property
     */
    public String getSpecFdkReq() {
        return specFdkReq;
    }

    /**
     * Sets the specFdkReq.
     * @param specFdkReq  the new value of the property
     */
    public void setSpecFdkReq(String specFdkReq) {
        this.specFdkReq = specFdkReq;
    }

    /**
     * Gets the the {@code specFdkReq} property.
     * @return the property, not null
     */
    public final Property<String> specFdkReq() {
        return metaBean().specFdkReq().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the fdkAddress.
     * @return the value of the property
     */
    public String getFdkAddress() {
        return fdkAddress;
    }

    /**
     * Sets the fdkAddress.
     * @param fdkAddress  the new value of the property
     */
    public void setFdkAddress(String fdkAddress) {
        this.fdkAddress = fdkAddress;
    }

    /**
     * Gets the the {@code fdkAddress} property.
     * @return the property, not null
     */
    public final Property<String> fdkAddress() {
        return metaBean().fdkAddress().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the email.
     * @return the value of the property
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email.
     * @param email  the new value of the property
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the the {@code email} property.
     * @return the property, not null
     */
    public final Property<String> email() {
        return metaBean().email().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the fax.
     * @return the value of the property
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the fax.
     * @param fax  the new value of the property
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * Gets the the {@code fax} property.
     * @return the property, not null
     */
    public final Property<String> fax() {
        return metaBean().fax().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the impDate.
     * @return the value of the property
     */
    public Date getImpDate() {
        return impDate;
    }

    /**
     * Sets the impDate.
     * @param impDate  the new value of the property
     */
    public void setImpDate(Date impDate) {
        this.impDate = impDate;
    }

    /**
     * Gets the the {@code impDate} property.
     * @return the property, not null
     */
    public final Property<Date> impDate() {
        return metaBean().impDate().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the factManPR.
     * @return the value of the property
     */
    public double getFactManPR() {
        return factManPR;
    }

    /**
     * Sets the factManPR.
     * @param factManPR  the new value of the property
     */
    public void setFactManPR(double factManPR) {
        this.factManPR = factManPR;
    }

    /**
     * Gets the the {@code factManPR} property.
     * @return the property, not null
     */
    public final Property<Double> factManPR() {
        return metaBean().factManPR().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the factMat.
     * @return the value of the property
     */
    public double getFactMat() {
        return factMat;
    }

    /**
     * Sets the factMat.
     * @param factMat  the new value of the property
     */
    public void setFactMat(double factMat) {
        this.factMat = factMat;
    }

    /**
     * Gets the the {@code factMat} property.
     * @return the property, not null
     */
    public final Property<Double> factMat() {
        return metaBean().factMat().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the fh.
     * @return the value of the property
     */
    public double getFh() {
        return fh;
    }

    /**
     * Sets the fh.
     * @param fh  the new value of the property
     */
    public void setFh(double fh) {
        this.fh = fh;
    }

    /**
     * Gets the the {@code fh} property.
     * @return the property, not null
     */
    public final Property<Double> fh() {
        return metaBean().fh().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the fc.
     * @return the value of the property
     */
    public double getFc() {
        return fc;
    }

    /**
     * Sets the fc.
     * @param fc  the new value of the property
     */
    public void setFc(double fc) {
        this.fc = fc;
    }

    /**
     * Gets the the {@code fc} property.
     * @return the property, not null
     */
    public final Property<Double> fc() {
        return metaBean().fc().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the amendContract.
     * @return the value of the property
     */
    public String getAmendContract() {
        return amendContract;
    }

    /**
     * Sets the amendContract.
     * @param amendContract  the new value of the property
     */
    public void setAmendContract(String amendContract) {
        this.amendContract = amendContract;
    }

    /**
     * Gets the the {@code amendContract} property.
     * @return the property, not null
     */
    public final Property<String> amendContract() {
        return metaBean().amendContract().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the productOrder.
     * @return the value of the property
     */
    public String getProductOrder() {
        return productOrder;
    }

    /**
     * Sets the productOrder.
     * @param productOrder  the new value of the property
     */
    public void setProductOrder(String productOrder) {
        this.productOrder = productOrder;
    }

    /**
     * Gets the the {@code productOrder} property.
     * @return the property, not null
     */
    public final Property<String> productOrder() {
        return metaBean().productOrder().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the specFdkInfo.
     * @return the value of the property
     */
    public String getSpecFdkInfo() {
        return specFdkInfo;
    }

    /**
     * Sets the specFdkInfo.
     * @param specFdkInfo  the new value of the property
     */
    public void setSpecFdkInfo(String specFdkInfo) {
        this.specFdkInfo = specFdkInfo;
    }

    /**
     * Gets the the {@code specFdkInfo} property.
     * @return the property, not null
     */
    public final Property<String> specFdkInfo() {
        return metaBean().specFdkInfo().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the memo.
     * @return the value of the property
     */
    public String getMemo() {
        return memo;
    }

    /**
     * Sets the memo.
     * @param memo  the new value of the property
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * Gets the the {@code memo} property.
     * @return the property, not null
     */
    public final Property<String> memo() {
        return metaBean().memo().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the completeDate.
     * @return the value of the property
     */
    public Date getCompleteDate() {
        return completeDate;
    }

    /**
     * Sets the completeDate.
     * @param completeDate  the new value of the property
     */
    public void setCompleteDate(Date completeDate) {
        this.completeDate = completeDate;
    }

    /**
     * Gets the the {@code completeDate} property.
     * @return the property, not null
     */
    public final Property<Date> completeDate() {
        return metaBean().completeDate().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the documentName.
     * @return the value of the property
     */
    public String getDocumentName() {
        return documentName;
    }

    /**
     * Sets the documentName.
     * @param documentName  the new value of the property
     */
    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    /**
     * Gets the the {@code documentName} property.
     * @return the property, not null
     */
    public final Property<String> documentName() {
        return metaBean().documentName().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the documentPath.
     * @return the value of the property
     */
    public String getDocumentPath() {
        return documentPath;
    }

    /**
     * Sets the documentPath.
     * @param documentPath  the new value of the property
     */
    public void setDocumentPath(String documentPath) {
        this.documentPath = documentPath;
    }

    /**
     * Gets the the {@code documentPath} property.
     * @return the property, not null
     */
    public final Property<String> documentPath() {
        return metaBean().documentPath().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the status.
     * @return the value of the property
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the status.
     * @param status  the new value of the property
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Gets the the {@code status} property.
     * @return the property, not null
     */
    public final Property<String> status() {
        return metaBean().status().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the eoFbAffectText.
     * @return the value of the property
     */
    public String getEoFbAffectText() {
        return eoFbAffectText;
    }

    /**
     * Sets the eoFbAffectText.
     * @param eoFbAffectText  the new value of the property
     */
    public void setEoFbAffectText(String eoFbAffectText) {
        this.eoFbAffectText = eoFbAffectText;
    }

    /**
     * Gets the the {@code eoFbAffectText} property.
     * @return the property, not null
     */
    public final Property<String> eoFbAffectText() {
        return metaBean().eoFbAffectText().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the eoOrder.
     * @return the value of the property
     */
    public EOOrder getEoOrder() {
        return eoOrder;
    }

    /**
     * Sets the eoOrder.
     * @param eoOrder  the new value of the property
     */
    public void setEoOrder(EOOrder eoOrder) {
        this.eoOrder = eoOrder;
    }

    /**
     * Gets the the {@code eoOrder} property.
     * @return the property, not null
     */
    public final Property<EOOrder> eoOrder() {
        return metaBean().eoOrder().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the affect.
     * @return the value of the property
     */
    public Affect getAffect() {
        return affect;
    }

    /**
     * Sets the affect.
     * @param affect  the new value of the property
     */
    public void setAffect(Affect affect) {
        this.affect = affect;
    }

    /**
     * Gets the the {@code affect} property.
     * @return the property, not null
     */
    public final Property<Affect> affect() {
        return metaBean().affect().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the closeTime.
     * @return the value of the property
     */
    public Date getCloseTime() {
        return closeTime;
    }

    /**
     * Sets the closeTime.
     * @param closeTime  the new value of the property
     */
    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    /**
     * Gets the the {@code closeTime} property.
     * @return the property, not null
     */
    public final Property<Date> closeTime() {
        return metaBean().closeTime().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the eoPostponement.
     * @return the value of the property
     */
    public EOPostponement getEoPostponement() {
        return eoPostponement;
    }

    /**
     * Sets the eoPostponement.
     * @param eoPostponement  the new value of the property
     */
    public void setEoPostponement(EOPostponement eoPostponement) {
        this.eoPostponement = eoPostponement;
    }

    /**
     * Gets the the {@code eoPostponement} property.
     * @return the property, not null
     */
    public final Property<EOPostponement> eoPostponement() {
        return metaBean().eoPostponement().createProperty(this);
    }

    //-----------------------------------------------------------------------
    @Override
    public EOFeedbackForm clone() {
        return JodaBeanUtils.cloneAlways(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            EOFeedbackForm other = (EOFeedbackForm) obj;
            return (getId() == other.getId()) &&
                    JodaBeanUtils.equal(getEoFBNumber(), other.getEoFBNumber()) &&
                    JodaBeanUtils.equal(getSpecFdkReq(), other.getSpecFdkReq()) &&
                    JodaBeanUtils.equal(getFdkAddress(), other.getFdkAddress()) &&
                    JodaBeanUtils.equal(getEmail(), other.getEmail()) &&
                    JodaBeanUtils.equal(getFax(), other.getFax()) &&
                    JodaBeanUtils.equal(getImpDate(), other.getImpDate()) &&
                    JodaBeanUtils.equal(getFactManPR(), other.getFactManPR()) &&
                    JodaBeanUtils.equal(getFactMat(), other.getFactMat()) &&
                    JodaBeanUtils.equal(getFh(), other.getFh()) &&
                    JodaBeanUtils.equal(getFc(), other.getFc()) &&
                    JodaBeanUtils.equal(getAmendContract(), other.getAmendContract()) &&
                    JodaBeanUtils.equal(getProductOrder(), other.getProductOrder()) &&
                    JodaBeanUtils.equal(getSpecFdkInfo(), other.getSpecFdkInfo()) &&
                    JodaBeanUtils.equal(getMemo(), other.getMemo()) &&
                    JodaBeanUtils.equal(getCompleteDate(), other.getCompleteDate()) &&
                    JodaBeanUtils.equal(getDocumentName(), other.getDocumentName()) &&
                    JodaBeanUtils.equal(getDocumentPath(), other.getDocumentPath()) &&
                    JodaBeanUtils.equal(getStatus(), other.getStatus()) &&
                    JodaBeanUtils.equal(getEoFbAffectText(), other.getEoFbAffectText()) &&
                    JodaBeanUtils.equal(getEoOrder(), other.getEoOrder()) &&
                    JodaBeanUtils.equal(getAffect(), other.getAffect()) &&
                    JodaBeanUtils.equal(getCloseTime(), other.getCloseTime()) &&
                    JodaBeanUtils.equal(getEoPostponement(), other.getEoPostponement()) &&
                    super.equals(obj);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = hash * 31 + JodaBeanUtils.hashCode(getId());
        hash = hash * 31 + JodaBeanUtils.hashCode(getEoFBNumber());
        hash = hash * 31 + JodaBeanUtils.hashCode(getSpecFdkReq());
        hash = hash * 31 + JodaBeanUtils.hashCode(getFdkAddress());
        hash = hash * 31 + JodaBeanUtils.hashCode(getEmail());
        hash = hash * 31 + JodaBeanUtils.hashCode(getFax());
        hash = hash * 31 + JodaBeanUtils.hashCode(getImpDate());
        hash = hash * 31 + JodaBeanUtils.hashCode(getFactManPR());
        hash = hash * 31 + JodaBeanUtils.hashCode(getFactMat());
        hash = hash * 31 + JodaBeanUtils.hashCode(getFh());
        hash = hash * 31 + JodaBeanUtils.hashCode(getFc());
        hash = hash * 31 + JodaBeanUtils.hashCode(getAmendContract());
        hash = hash * 31 + JodaBeanUtils.hashCode(getProductOrder());
        hash = hash * 31 + JodaBeanUtils.hashCode(getSpecFdkInfo());
        hash = hash * 31 + JodaBeanUtils.hashCode(getMemo());
        hash = hash * 31 + JodaBeanUtils.hashCode(getCompleteDate());
        hash = hash * 31 + JodaBeanUtils.hashCode(getDocumentName());
        hash = hash * 31 + JodaBeanUtils.hashCode(getDocumentPath());
        hash = hash * 31 + JodaBeanUtils.hashCode(getStatus());
        hash = hash * 31 + JodaBeanUtils.hashCode(getEoFbAffectText());
        hash = hash * 31 + JodaBeanUtils.hashCode(getEoOrder());
        hash = hash * 31 + JodaBeanUtils.hashCode(getAffect());
        hash = hash * 31 + JodaBeanUtils.hashCode(getCloseTime());
        hash = hash * 31 + JodaBeanUtils.hashCode(getEoPostponement());
        return hash ^ super.hashCode();
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(800);
        buf.append("EOFeedbackForm{");
        int len = buf.length();
        toString(buf);
        if (buf.length() > len) {
            buf.setLength(buf.length() - 2);
        }
        buf.append('}');
        return buf.toString();
    }

    @Override
    protected void toString(StringBuilder buf) {
        super.toString(buf);
        buf.append("id").append('=').append(JodaBeanUtils.toString(getId())).append(',').append(' ');
        buf.append("eoFBNumber").append('=').append(JodaBeanUtils.toString(getEoFBNumber())).append(',').append(' ');
        buf.append("specFdkReq").append('=').append(JodaBeanUtils.toString(getSpecFdkReq())).append(',').append(' ');
        buf.append("fdkAddress").append('=').append(JodaBeanUtils.toString(getFdkAddress())).append(',').append(' ');
        buf.append("email").append('=').append(JodaBeanUtils.toString(getEmail())).append(',').append(' ');
        buf.append("fax").append('=').append(JodaBeanUtils.toString(getFax())).append(',').append(' ');
        buf.append("impDate").append('=').append(JodaBeanUtils.toString(getImpDate())).append(',').append(' ');
        buf.append("factManPR").append('=').append(JodaBeanUtils.toString(getFactManPR())).append(',').append(' ');
        buf.append("factMat").append('=').append(JodaBeanUtils.toString(getFactMat())).append(',').append(' ');
        buf.append("fh").append('=').append(JodaBeanUtils.toString(getFh())).append(',').append(' ');
        buf.append("fc").append('=').append(JodaBeanUtils.toString(getFc())).append(',').append(' ');
        buf.append("amendContract").append('=').append(JodaBeanUtils.toString(getAmendContract())).append(',').append(' ');
        buf.append("productOrder").append('=').append(JodaBeanUtils.toString(getProductOrder())).append(',').append(' ');
        buf.append("specFdkInfo").append('=').append(JodaBeanUtils.toString(getSpecFdkInfo())).append(',').append(' ');
        buf.append("memo").append('=').append(JodaBeanUtils.toString(getMemo())).append(',').append(' ');
        buf.append("completeDate").append('=').append(JodaBeanUtils.toString(getCompleteDate())).append(',').append(' ');
        buf.append("documentName").append('=').append(JodaBeanUtils.toString(getDocumentName())).append(',').append(' ');
        buf.append("documentPath").append('=').append(JodaBeanUtils.toString(getDocumentPath())).append(',').append(' ');
        buf.append("status").append('=').append(JodaBeanUtils.toString(getStatus())).append(',').append(' ');
        buf.append("eoFbAffectText").append('=').append(JodaBeanUtils.toString(getEoFbAffectText())).append(',').append(' ');
        buf.append("eoOrder").append('=').append(JodaBeanUtils.toString(getEoOrder())).append(',').append(' ');
        buf.append("affect").append('=').append(JodaBeanUtils.toString(getAffect())).append(',').append(' ');
        buf.append("closeTime").append('=').append(JodaBeanUtils.toString(getCloseTime())).append(',').append(' ');
        buf.append("eoPostponement").append('=').append(JodaBeanUtils.toString(getEoPostponement())).append(',').append(' ');
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code EOFeedbackForm}.
     */
    public static class Meta extends AedmsEntity.Meta {
        /**
         * The singleton instance of the meta-bean.
         */
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-property for the {@code id} property.
         */
        private final MetaProperty<Long> id = DirectMetaProperty.ofReadWrite(
                this, "id", EOFeedbackForm.class, Long.TYPE);
        /**
         * The meta-property for the {@code eoFBNumber} property.
         */
        private final MetaProperty<String> eoFBNumber = DirectMetaProperty.ofReadWrite(
                this, "eoFBNumber", EOFeedbackForm.class, String.class);
        /**
         * The meta-property for the {@code specFdkReq} property.
         */
        private final MetaProperty<String> specFdkReq = DirectMetaProperty.ofReadWrite(
                this, "specFdkReq", EOFeedbackForm.class, String.class);
        /**
         * The meta-property for the {@code fdkAddress} property.
         */
        private final MetaProperty<String> fdkAddress = DirectMetaProperty.ofReadWrite(
                this, "fdkAddress", EOFeedbackForm.class, String.class);
        /**
         * The meta-property for the {@code email} property.
         */
        private final MetaProperty<String> email = DirectMetaProperty.ofReadWrite(
                this, "email", EOFeedbackForm.class, String.class);
        /**
         * The meta-property for the {@code fax} property.
         */
        private final MetaProperty<String> fax = DirectMetaProperty.ofReadWrite(
                this, "fax", EOFeedbackForm.class, String.class);
        /**
         * The meta-property for the {@code impDate} property.
         */
        private final MetaProperty<Date> impDate = DirectMetaProperty.ofReadWrite(
                this, "impDate", EOFeedbackForm.class, Date.class);
        /**
         * The meta-property for the {@code factManPR} property.
         */
        private final MetaProperty<Double> factManPR = DirectMetaProperty.ofReadWrite(
                this, "factManPR", EOFeedbackForm.class, Double.TYPE);
        /**
         * The meta-property for the {@code factMat} property.
         */
        private final MetaProperty<Double> factMat = DirectMetaProperty.ofReadWrite(
                this, "factMat", EOFeedbackForm.class, Double.TYPE);
        /**
         * The meta-property for the {@code fh} property.
         */
        private final MetaProperty<Double> fh = DirectMetaProperty.ofReadWrite(
                this, "fh", EOFeedbackForm.class, Double.TYPE);
        /**
         * The meta-property for the {@code fc} property.
         */
        private final MetaProperty<Double> fc = DirectMetaProperty.ofReadWrite(
                this, "fc", EOFeedbackForm.class, Double.TYPE);
        /**
         * The meta-property for the {@code amendContract} property.
         */
        private final MetaProperty<String> amendContract = DirectMetaProperty.ofReadWrite(
                this, "amendContract", EOFeedbackForm.class, String.class);
        /**
         * The meta-property for the {@code productOrder} property.
         */
        private final MetaProperty<String> productOrder = DirectMetaProperty.ofReadWrite(
                this, "productOrder", EOFeedbackForm.class, String.class);
        /**
         * The meta-property for the {@code specFdkInfo} property.
         */
        private final MetaProperty<String> specFdkInfo = DirectMetaProperty.ofReadWrite(
                this, "specFdkInfo", EOFeedbackForm.class, String.class);
        /**
         * The meta-property for the {@code memo} property.
         */
        private final MetaProperty<String> memo = DirectMetaProperty.ofReadWrite(
                this, "memo", EOFeedbackForm.class, String.class);
        /**
         * The meta-property for the {@code completeDate} property.
         */
        private final MetaProperty<Date> completeDate = DirectMetaProperty.ofReadWrite(
                this, "completeDate", EOFeedbackForm.class, Date.class);
        /**
         * The meta-property for the {@code documentName} property.
         */
        private final MetaProperty<String> documentName = DirectMetaProperty.ofReadWrite(
                this, "documentName", EOFeedbackForm.class, String.class);
        /**
         * The meta-property for the {@code documentPath} property.
         */
        private final MetaProperty<String> documentPath = DirectMetaProperty.ofReadWrite(
                this, "documentPath", EOFeedbackForm.class, String.class);
        /**
         * The meta-property for the {@code status} property.
         */
        private final MetaProperty<String> status = DirectMetaProperty.ofReadWrite(
                this, "status", EOFeedbackForm.class, String.class);
        /**
         * The meta-property for the {@code eoFbAffectText} property.
         */
        private final MetaProperty<String> eoFbAffectText = DirectMetaProperty.ofReadWrite(
                this, "eoFbAffectText", EOFeedbackForm.class, String.class);
        /**
         * The meta-property for the {@code eoOrder} property.
         */
        private final MetaProperty<EOOrder> eoOrder = DirectMetaProperty.ofReadWrite(
                this, "eoOrder", EOFeedbackForm.class, EOOrder.class);
        /**
         * The meta-property for the {@code affect} property.
         */
        private final MetaProperty<Affect> affect = DirectMetaProperty.ofReadWrite(
                this, "affect", EOFeedbackForm.class, Affect.class);
        /**
         * The meta-property for the {@code closeTime} property.
         */
        private final MetaProperty<Date> closeTime = DirectMetaProperty.ofReadWrite(
                this, "closeTime", EOFeedbackForm.class, Date.class);
        /**
         * The meta-property for the {@code eoPostponement} property.
         */
        private final MetaProperty<EOPostponement> eoPostponement = DirectMetaProperty.ofReadWrite(
                this, "eoPostponement", EOFeedbackForm.class, EOPostponement.class);
        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
                this, (DirectMetaPropertyMap) super.metaPropertyMap(),
                "id",
                "eoFBNumber",
                "specFdkReq",
                "fdkAddress",
                "email",
                "fax",
                "impDate",
                "factManPR",
                "factMat",
                "fh",
                "fc",
                "amendContract",
                "productOrder",
                "specFdkInfo",
                "memo",
                "completeDate",
                "documentName",
                "documentPath",
                "status",
                "eoFbAffectText",
                "eoOrder",
                "affect",
                "closeTime",
                "eoPostponement");

        /**
         * Restricted constructor.
         */
        protected Meta() {
        }

        @Override
        protected MetaProperty<?> metaPropertyGet(String propertyName) {
            switch (propertyName.hashCode()) {
                case 3355:  // id
                    return id;
                case 1095833039:  // eoFBNumber
                    return eoFBNumber;
                case -1997255284:  // specFdkReq
                    return specFdkReq;
                case -907254841:  // fdkAddress
                    return fdkAddress;
                case 96619420:  // email
                    return email;
                case 101149:  // fax
                    return fax;
                case 1924740506:  // impDate
                    return impDate;
                case -1359209008:  // factManPR
                    return factManPR;
                case -1091915948:  // factMat
                    return factMat;
                case 3266:  // fh
                    return fh;
                case 3261:  // fc
                    return fc;
                case 685560673:  // amendContract
                    return amendContract;
                case 999720863:  // productOrder
                    return productOrder;
                case -1785631360:  // specFdkInfo
                    return specFdkInfo;
                case 3347770:  // memo
                    return memo;
                case -410496889:  // completeDate
                    return completeDate;
                case -1473398202:  // documentName
                    return documentName;
                case -1473338400:  // documentPath
                    return documentPath;
                case -892481550:  // status
                    return status;
                case -1386127992:  // eoFbAffectText
                    return eoFbAffectText;
                case -1597119292:  // eoOrder
                    return eoOrder;
                case -1420601579:  // affect
                    return affect;
                case -482481947:  // closeTime
                    return closeTime;
                case -1915982658:  // eoPostponement
                    return eoPostponement;
            }
            return super.metaPropertyGet(propertyName);
        }

        @Override
        public BeanBuilder<? extends EOFeedbackForm> builder() {
            return new DirectBeanBuilder<EOFeedbackForm>(new EOFeedbackForm());
        }

        @Override
        public Class<? extends EOFeedbackForm> beanType() {
            return EOFeedbackForm.class;
        }

        @Override
        public Map<String, MetaProperty<?>> metaPropertyMap() {
            return metaPropertyMap$;
        }

        //-----------------------------------------------------------------------
        /**
         * The meta-property for the {@code id} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Long> id() {
            return id;
        }

        /**
         * The meta-property for the {@code eoFBNumber} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> eoFBNumber() {
            return eoFBNumber;
        }

        /**
         * The meta-property for the {@code specFdkReq} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> specFdkReq() {
            return specFdkReq;
        }

        /**
         * The meta-property for the {@code fdkAddress} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> fdkAddress() {
            return fdkAddress;
        }

        /**
         * The meta-property for the {@code email} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> email() {
            return email;
        }

        /**
         * The meta-property for the {@code fax} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> fax() {
            return fax;
        }

        /**
         * The meta-property for the {@code impDate} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Date> impDate() {
            return impDate;
        }

        /**
         * The meta-property for the {@code factManPR} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Double> factManPR() {
            return factManPR;
        }

        /**
         * The meta-property for the {@code factMat} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Double> factMat() {
            return factMat;
        }

        /**
         * The meta-property for the {@code fh} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Double> fh() {
            return fh;
        }

        /**
         * The meta-property for the {@code fc} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Double> fc() {
            return fc;
        }

        /**
         * The meta-property for the {@code amendContract} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> amendContract() {
            return amendContract;
        }

        /**
         * The meta-property for the {@code productOrder} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> productOrder() {
            return productOrder;
        }

        /**
         * The meta-property for the {@code specFdkInfo} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> specFdkInfo() {
            return specFdkInfo;
        }

        /**
         * The meta-property for the {@code memo} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> memo() {
            return memo;
        }

        /**
         * The meta-property for the {@code completeDate} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Date> completeDate() {
            return completeDate;
        }

        /**
         * The meta-property for the {@code documentName} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> documentName() {
            return documentName;
        }

        /**
         * The meta-property for the {@code documentPath} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> documentPath() {
            return documentPath;
        }

        /**
         * The meta-property for the {@code status} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> status() {
            return status;
        }

        /**
         * The meta-property for the {@code eoFbAffectText} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> eoFbAffectText() {
            return eoFbAffectText;
        }

        /**
         * The meta-property for the {@code eoOrder} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<EOOrder> eoOrder() {
            return eoOrder;
        }

        /**
         * The meta-property for the {@code affect} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Affect> affect() {
            return affect;
        }

        /**
         * The meta-property for the {@code closeTime} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Date> closeTime() {
            return closeTime;
        }

        /**
         * The meta-property for the {@code eoPostponement} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<EOPostponement> eoPostponement() {
            return eoPostponement;
        }

        //-----------------------------------------------------------------------
        @Override
        protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 3355:  // id
                    return ((EOFeedbackForm) bean).getId();
                case 1095833039:  // eoFBNumber
                    return ((EOFeedbackForm) bean).getEoFBNumber();
                case -1997255284:  // specFdkReq
                    return ((EOFeedbackForm) bean).getSpecFdkReq();
                case -907254841:  // fdkAddress
                    return ((EOFeedbackForm) bean).getFdkAddress();
                case 96619420:  // email
                    return ((EOFeedbackForm) bean).getEmail();
                case 101149:  // fax
                    return ((EOFeedbackForm) bean).getFax();
                case 1924740506:  // impDate
                    return ((EOFeedbackForm) bean).getImpDate();
                case -1359209008:  // factManPR
                    return ((EOFeedbackForm) bean).getFactManPR();
                case -1091915948:  // factMat
                    return ((EOFeedbackForm) bean).getFactMat();
                case 3266:  // fh
                    return ((EOFeedbackForm) bean).getFh();
                case 3261:  // fc
                    return ((EOFeedbackForm) bean).getFc();
                case 685560673:  // amendContract
                    return ((EOFeedbackForm) bean).getAmendContract();
                case 999720863:  // productOrder
                    return ((EOFeedbackForm) bean).getProductOrder();
                case -1785631360:  // specFdkInfo
                    return ((EOFeedbackForm) bean).getSpecFdkInfo();
                case 3347770:  // memo
                    return ((EOFeedbackForm) bean).getMemo();
                case -410496889:  // completeDate
                    return ((EOFeedbackForm) bean).getCompleteDate();
                case -1473398202:  // documentName
                    return ((EOFeedbackForm) bean).getDocumentName();
                case -1473338400:  // documentPath
                    return ((EOFeedbackForm) bean).getDocumentPath();
                case -892481550:  // status
                    return ((EOFeedbackForm) bean).getStatus();
                case -1386127992:  // eoFbAffectText
                    return ((EOFeedbackForm) bean).getEoFbAffectText();
                case -1597119292:  // eoOrder
                    return ((EOFeedbackForm) bean).getEoOrder();
                case -1420601579:  // affect
                    return ((EOFeedbackForm) bean).getAffect();
                case -482481947:  // closeTime
                    return ((EOFeedbackForm) bean).getCloseTime();
                case -1915982658:  // eoPostponement
                    return ((EOFeedbackForm) bean).getEoPostponement();
            }
            return super.propertyGet(bean, propertyName, quiet);
        }

        @Override
        protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 3355:  // id
                    ((EOFeedbackForm) bean).setId((Long) newValue);
                    return;
                case 1095833039:  // eoFBNumber
                    ((EOFeedbackForm) bean).setEoFBNumber((String) newValue);
                    return;
                case -1997255284:  // specFdkReq
                    ((EOFeedbackForm) bean).setSpecFdkReq((String) newValue);
                    return;
                case -907254841:  // fdkAddress
                    ((EOFeedbackForm) bean).setFdkAddress((String) newValue);
                    return;
                case 96619420:  // email
                    ((EOFeedbackForm) bean).setEmail((String) newValue);
                    return;
                case 101149:  // fax
                    ((EOFeedbackForm) bean).setFax((String) newValue);
                    return;
                case 1924740506:  // impDate
                    ((EOFeedbackForm) bean).setImpDate((Date) newValue);
                    return;
                case -1359209008:  // factManPR
                    ((EOFeedbackForm) bean).setFactManPR((Double) newValue);
                    return;
                case -1091915948:  // factMat
                    ((EOFeedbackForm) bean).setFactMat((Double) newValue);
                    return;
                case 3266:  // fh
                    ((EOFeedbackForm) bean).setFh((Double) newValue);
                    return;
                case 3261:  // fc
                    ((EOFeedbackForm) bean).setFc((Double) newValue);
                    return;
                case 685560673:  // amendContract
                    ((EOFeedbackForm) bean).setAmendContract((String) newValue);
                    return;
                case 999720863:  // productOrder
                    ((EOFeedbackForm) bean).setProductOrder((String) newValue);
                    return;
                case -1785631360:  // specFdkInfo
                    ((EOFeedbackForm) bean).setSpecFdkInfo((String) newValue);
                    return;
                case 3347770:  // memo
                    ((EOFeedbackForm) bean).setMemo((String) newValue);
                    return;
                case -410496889:  // completeDate
                    ((EOFeedbackForm) bean).setCompleteDate((Date) newValue);
                    return;
                case -1473398202:  // documentName
                    ((EOFeedbackForm) bean).setDocumentName((String) newValue);
                    return;
                case -1473338400:  // documentPath
                    ((EOFeedbackForm) bean).setDocumentPath((String) newValue);
                    return;
                case -892481550:  // status
                    ((EOFeedbackForm) bean).setStatus((String) newValue);
                    return;
                case -1386127992:  // eoFbAffectText
                    ((EOFeedbackForm) bean).setEoFbAffectText((String) newValue);
                    return;
                case -1597119292:  // eoOrder
                    ((EOFeedbackForm) bean).setEoOrder((EOOrder) newValue);
                    return;
                case -1420601579:  // affect
                    ((EOFeedbackForm) bean).setAffect((Affect) newValue);
                    return;
                case -482481947:  // closeTime
                    ((EOFeedbackForm) bean).setCloseTime((Date) newValue);
                    return;
                case -1915982658:  // eoPostponement
                    ((EOFeedbackForm) bean).setEoPostponement((EOPostponement) newValue);
                    return;
            }
            super.propertySet(bean, propertyName, newValue, quiet);
        }

    }

    ///CLOVER:ON
    //-------------------------- AUTOGENERATED END --------------------------
}
