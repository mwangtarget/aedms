package com.aedms.core.entities.source;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

import fr.lteconsulting.Mandatory;
import fr.lteconsulting.UseBuilderGenerator;

/**
 * The Entity to representing AirCraft flight record. The physical table is "AIRCRAFT_FLIGHT_RECORD"
 * 
 * @author jaly
 */
@Entity
@Table(name = "AIRCRAFT_FLIGHT_RECORD")
public class AirCraftFlightRec implements Serializable{

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    
    @Column(name = "TT")
    private int tt;
    
    @Column(name = "TC")
    private int tc;
    
    @Column(name = "TBO")
    private int tbo;
    
    @Column(name = "CBO")
    private int cbo;
    
    @Column(name = "TSO")
    private int tso;
    
    @Column(name = "CSO")
    private int cso;
    
    @Column(name = "TREM")
    private int trem;
    
    @Column(name = "CREM")
    private int crem;
    
    @Column(name = "TSLSV")
    private int tslsv;
    
    @Column(name = "CSLSV")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date cslsv;
    
    @Column(name = "EFFECT_DATE")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date effectDate;
    
    @ManyToOne
    @JoinColumn(name = "AIRCRAFT_ID")
	private AirCraft aircraft;

    /**Constructor block*/
    public AirCraftFlightRec(){
    	
    }
    
    @UseBuilderGenerator
    public AirCraftFlightRec(@Mandatory int tt, @Mandatory int tc, @Mandatory int tbo, @Mandatory int cbo, int tso, int cso, int trem, int crem, int tslsv,
			Date cslsv, @Mandatory Date effectDate, @Mandatory AirCraft aircraft) {
		super();
		this.tt = tt;
		this.tc = tc;
		this.tbo = tbo;
		this.cbo = cbo;
		this.tso = tso;
		this.cso = cso;
		this.trem = trem;
		this.crem = crem;
		this.tslsv = tslsv;
		this.cslsv = cslsv;
		this.effectDate = effectDate;
		this.aircraft = aircraft;
	}

	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AirCraftFlightRecord[ ID=");
        sb.append(this.getId())
                .append(", TT=").append(this.getTt())
                .append(", TC=").append(this.getTc())
                .append(", TBO=").append(this.getTbo())
                .append(", CBO=").append(this.getCbo())
                .append(", TSO=").append(this.getTso())
                .append(", CSO=").append(this.getCso())
                .append(", TREM=").append(this.getTrem())
                .append(", CREM=").append(this.getCrem())
                .append(", TSLSV=").append(this.getTslsv())
                .append(", CSLSV=").append(this.getCslsv())
                .append(", EFFECT_DATE=").append(this.getEffectDate().toString())
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
     * @return the tt
     */
    public int getTt() {
        return tt;
    }

    /**
     * @param tt the tt to set
     */
    public void setTt(int tt) {
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
     * @return the tbo
     */
    public int getTbo() {
        return tbo;
    }

    /**
     * @param tbo the tbo to set
     */
    public void setTbo(int tbo) {
        this.tbo = tbo;
    }

    /**
     * @return the cbo
     */
    public int getCbo() {
        return cbo;
    }

    /**
     * @param cbo the cbo to set
     */
    public void setCbo(int cbo) {
        this.cbo = cbo;
    }

    /**
     * @return the tso
     */
    public int getTso() {
        return tso;
    }

    /**
     * @param tso the tso to set
     */
    public void setTso(int tso) {
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
     * @return the trem
     */
    public int getTrem() {
        return trem;
    }

    /**
     * @param trem the trem to set
     */
    public void setTrem(int trem) {
        this.trem = trem;
    }

    /**
     * @return the crem
     */
    public int getCrem() {
        return crem;
    }

    /**
     * @param crem the crem to set
     */
    public void setCrem(int crem) {
        this.crem = crem;
    }

    /**
     * @return the tslsv
     */
    public int getTslsv() {
        return tslsv;
    }

    /**
     * @param tslsv the tslsv to set
     */
    public void setTslsv(int tslsv) {
        this.tslsv = tslsv;
    }

    /**
     * @return the cslsv
     */
    public Date getCslsv() {
        return cslsv;
    }

    /**
     * @param cslsv the cslsv to set
     */
    public void setCslsv(Date cslsv) {
        this.cslsv = cslsv;
    }

    /**
     * @return the effectDate
     */
    public Date getEffectDate() {
        return effectDate;
    }

    /**
     * @param effectDate the effectDate to set
     */
    public void setEffectDate(Date effectDate) {
        this.effectDate = effectDate;
    }
}
