package com.aedms.core.entities.source;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 * The Entity to representing AirCraft status record. The physical table is "AIRCRAFT_STATUS_RECORD"
 *
 * @author jaly
 */
@Entity
@Table(name = "AIRCRAFT_STATUS_RECORD")
public class AirCraftStatusRec implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    
    @Column(name = "STATUS")
    private String status;
    
    @Column(name = "STATUS_CHANGE_DATE")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date statusChangeDate;
    
    @Column(name = "TT")
    private float tt;
    
    @Column(name = "TC")
    private int tc;
    
    @Column(name = "TSO")
    private float tso;
    
    @Column(name = "CSO")
    private int cso;
    
    @Column(name = "REMAIN_FH")
    private float remainFH;
    
    @Column(name = "REMAIN_FC")
    private int remainFC;
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AirCraftStatusRec[ ID = ");
        sb.append(this.getId())
                .append(", STATUS=").append(this.getStatus())
                .append(", STATUS_CHANGE_DATE=").append(this.getStatusChangeDate())
                .append(", TT=").append(this.getTt())
                .append(", TC=").append(this.getTc())
                .append(", TSO=").append((this.getTso()))
                .append(", CSO=").append(this.getCso())
                .append(", REMAIN_FH=").append(this.getRemainFH())
                .append(", REMAIN_FC=").append(this.getRemainFC())
                .append(" ]");
        return sb.toString();
    }
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
     * @return the statusChangeDate
     */
    public Date getStatusChangeDate() {
        return statusChangeDate;
    }

    /**
     * @param statusChangeDate the statusChangeDate to set
     */
    public void setStatusChangeDate(Date statusChangeDate) {
        this.statusChangeDate = statusChangeDate;
    }

    /**
     * @return the tt
     */
    public float getTt() {
        return tt;
    }

    /**
     * @param tt the tt to set
     */
    public void setTt(float tt) {
        this.tt = tt;
    }

    /**
     * @return the tc
     */
    public int getTc() {
        return tc;
    }

    /**
     * @param tc the tc to set
     */
    public void setTc(int tc) {
        this.tc = tc;
    }

    /**
     * @return the tso
     */
    public float getTso() {
        return tso;
    }

    /**
     * @param tso the tso to set
     */
    public void setTso(float tso) {
        this.tso = tso;
    }

    /**
     * @return the cso
     */
    public int getCso() {
        return cso;
    }

    /**
     * @param cso the cso to set
     */
    public void setCso(int cso) {
        this.cso = cso;
    }

    /**
     * @return the remainFH
     */
    public float getRemainFH() {
        return remainFH;
    }

    /**
     * @param remainFH the remainFH to set
     */
    public void setRemainFH(float remainFH) {
        this.remainFH = remainFH;
    }

    /**
     * @return the remainFC
     */
    public int getRemainFC() {
        return remainFC;
    }

    /**
     * @param remainFC the remainFC to set
     */
    public void setRemainFC(int remainFC) {
        this.remainFC = remainFC;
    }

}
