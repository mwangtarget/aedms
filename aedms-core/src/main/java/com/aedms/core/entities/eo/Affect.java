package com.aedms.core.entities.eo;

import com.aedms.core.entities.AedmsEntity;
import com.aedms.core.entities.source.APU;
import com.aedms.core.entities.source.AirCraft;
import com.aedms.core.entities.source.Engine;
import com.aedms.core.entities.source.LandingGear;
import fr.lteconsulting.UseBuilderGenerator;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author jaly
 */
@Entity
@Table (name = "AFFECT")
public class Affect extends AedmsEntity {
    
    private static final long serialVersionUID = 1L;
    
    @Column(name = "AIRCRAFT_ID")
    @OneToOne(optional = false, fetch = FetchType.LAZY, mappedBy = "affect")
    private AirCraft airCraft;
    
    @Column(name = "ENGINE_ID")
    @OneToOne(optional = false, fetch = FetchType.LAZY, mappedBy = "affect")
    private Engine engine;
    
    @Column(name = "APU_ID")
    @OneToOne(optional = false, fetch = FetchType.LAZY, mappedBy = "affect")
    private APU apu;
    
    @Column(name = "GEAR_ID")
    @OneToOne(optional = false, fetch = FetchType.LAZY, mappedBy = "affect")
    private LandingGear landingGear;
    
    @Column(name = "PART_NO", length = 50)
    private String partNumber;
    
    @Column(name = "PART_EQ_UEL", length = 50)
    private String partEquel;
    
    @Column(name = "PART_EQU_IP_NO", length = 50)
    private String partEquIPNumber;
    
    @Column(name = "PART_EQ_NO", length = 50)
    private String partEqNumber;
    
    @Column(name = "VALITY_MEMO", length = 4000)
    private String valityMemo;
    
    @ManyToMany(mappedBy="affect", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "EO_GROUP_AFFECT")
    private Set<EOGroup> eoGroups;
            
    public Affect(){}
    
    @UseBuilderGenerator
    public Affect(AirCraft airCraft, Engine engine, APU apu, LandingGear landingGear, String partNumber,
            String partEquel, String partEquIPNumber, String partEqNumber, String valityMemo, Set<EOGroup> eoGroups){
        super();
        this.airCraft = airCraft;
        this.engine = engine;
        this.apu = apu;
        this.landingGear = landingGear;
        this.partEqNumber = partEqNumber;
        this.partEquel = partEquel;
        this.partEquIPNumber = partEquIPNumber;
        this.partNumber = partNumber;
        this.valityMemo = valityMemo;
        this.eoGroups = eoGroups;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Affect [id=");
        sb.append(this.getId())
                .append(", airCraft=").append(this.getAirCraft().toString())
                .append(", engine=").append(this.getEngine().toString())
                .append(", apu=").append(this.getApu().toString())
                .append(", landingGear=").append(this.getLandingGear().toString())
                .append(", partEqNumber=").append(this.getPartEqNumber())
                .append(". partEquel=").append(this.getPartEquel())
                .append(". partEquIPNumber=").append(this.getPartEquIPNumber())
                .append(", partNumber=").append(this.getPartNumber())
                .append(", valityMemo=").append(this.getValityMemo());
        sb.append("]");
        return sb.toString();
    }

    /**
     * @return the airCraft
     */
    public AirCraft getAirCraft() {
        return airCraft;
    }

    /**
     * @param airCraft the airCraft to set
     */
    public void setAirCraft(AirCraft airCraft) {
        this.airCraft = airCraft;
    }

    /**
     * @return the engine
     */
    public Engine getEngine() {
        return engine;
    }

    /**
     * @param engine the engine to set
     */
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    /**
     * @return the apu
     */
    public APU getApu() {
        return apu;
    }

    /**
     * @param apu the apu to set
     */
    public void setApu(APU apu) {
        this.apu = apu;
    }

    /**
     * @return the landingGear
     */
    public LandingGear getLandingGear() {
        return landingGear;
    }

    /**
     * @param landingGear the landingGear to set
     */
    public void setLandingGear(LandingGear landingGear) {
        this.landingGear = landingGear;
    }

    /**
     * @return the partNumber
     */
    public String getPartNumber() {
        return partNumber;
    }

    /**
     * @param partNumber the partNumber to set
     */
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    /**
     * @return the partEquel
     */
    public String getPartEquel() {
        return partEquel;
    }

    /**
     * @param partEquel the partEquel to set
     */
    public void setPartEquel(String partEquel) {
        this.partEquel = partEquel;
    }

    /**
     * @return the partEquIPNumber
     */
    public String getPartEquIPNumber() {
        return partEquIPNumber;
    }

    /**
     * @param partEquIPNumber the partEquIPNumber to set
     */
    public void setPartEquIPNumber(String partEquIPNumber) {
        this.partEquIPNumber = partEquIPNumber;
    }

    /**
     * @return the partEqNumber
     */
    public String getPartEqNumber() {
        return partEqNumber;
    }

    /**
     * @param partEqNumber the partEqNumber to set
     */
    public void setPartEqNumber(String partEqNumber) {
        this.partEqNumber = partEqNumber;
    }

    /**
     * @return the valityMemo
     */
    public String getValityMemo() {
        return valityMemo;
    }

    /**
     * @param valityMemo the valityMemo to set
     */
    public void setValityMemo(String valityMemo) {
        this.valityMemo = valityMemo;
    }

    /**
     * @return the eoGroups
     */
    public Set<EOGroup> getEoGroups() {
        return eoGroups;
    }

    /**
     * @param eoGroups the eoGroups to set
     */
    public void setEoGroups(Set<EOGroup> eoGroups) {
        this.eoGroups = eoGroups;
    }
}
