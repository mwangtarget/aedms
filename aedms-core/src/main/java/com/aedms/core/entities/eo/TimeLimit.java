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
 * The entity map to "Time_Limit“ table
 * 
 * @author jaly
 */
@Entity
@Table (name = "Time_Limit")
public class TimeLimit extends AedmsEntity {
    
    private static final long serialVersionUID = 1L;
    
    @Column(name = "IS_STRUCT")
    private boolean isStructucted;
    
    @Column(name = "IS_SET_DAY")
    private boolean isSetDay;
    
    @Column(name = "DAY_RELATION", length = 10)
    private String dayRelation;
    
    @Column(name = "DAY_LIMIT")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dayLimit;
    
    @Column(name = "IS_SET_FH")
    private boolean isSetFH;
    
    @Column(name = "FH_RELATION", length = 10)
    private String FHRelation;
    
    @Column(name = "FH_LIMIT")
    private double FHLimit;
    
    @Column(name = "IS_SET_FC")
    private boolean isSetFC;
    
    @Column(name = "FC_RELATION", length = 10)
    private String FCRelation;
    
    @Column(name = "FC_LIMIT")
    private int FCLimit;
    
    @Column(name = "IS_SET_DAY_FH")
    private boolean isSetDayFH;
    
    @Column(name = "DAY_FH_START")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dayFHStart;
    
    @Column(name = "DAY_FH_LEFT")
    private double dayFHLeft;
    
    @Column(name = "IS_SET_DAY_FC")
    private boolean isSetDayFC;
    
    @Column(name = "DAY_FC_START")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dayFCStart;
    
    @Column(name = "DAY_FC_LEFT")
    private int dayFCLeft;
    
    @Column(name = "IS_FIRST_EF")
    private boolean isFirstEffective;
    
    @Column(name = "IS_LAST_EF")
    private boolean isLastEffective;
    
    @Column(name = "TEXT_TIME_LIMIT", length = 4000)
    private String textTimeLimit;
    
    public TimeLimit(){}
    
    @UseBuilderGenerator
    public TimeLimit(boolean isStructucted, boolean isSetDay, String dayRelation, Date dayLimit, boolean isSetFH,
                      String FHRelation, double FHLimit, boolean isSetFC, String FCRelation, int FCLimit,
                      boolean isSetDayFH, Date dayFHStart, double dayFHLeft, boolean isSetDayFC, Date dayFCStart,
                      int dayFCLeft, boolean isFirstEffective, boolean isLastEffective, String textTimeLimit){
        super();
        this.isStructucted = isStructucted;
        this.isSetDay = isSetDay;
        this.dayRelation = dayRelation;
        this.dayLimit = dayLimit;
        this.isSetFC = isSetFC;
        this.FHRelation = FHRelation;
        this.FHLimit = FHLimit;
        this.isSetFH = isSetFH;
        this.FCRelation = FCRelation;
        this.FCLimit = FCLimit;
        this.isSetDayFH = isSetDayFH;
        this.dayFHStart = dayFHStart;
        this.dayFHLeft = dayFHLeft;
        this.isSetDayFC = isSetDayFC;
        this.dayFCStart = dayFCStart;
        this.dayFCLeft = dayFCLeft;
        this.isFirstEffective = isFirstEffective;
        this.isLastEffective = isLastEffective;
        this.textTimeLimit = textTimeLimit;
    }


    /**
     * @return the isStructucted
     */
    public boolean isIsStructucted() {
        return isStructucted;
    }

    /**
     * @param isStructucted the isStructucted to set
     */
    public void setIsStructucted(boolean isStructucted) {
        this.isStructucted = isStructucted;
    }

    /**
     * @return the isSetDay
     */
    public boolean isIsSetDay() {
        return isSetDay;
    }

    /**
     * @param isSetDay the isSetDay to set
     */
    public void setIsSetDay(boolean isSetDay) {
        this.isSetDay = isSetDay;
    }

    /**
     * @return the dayRelation
     */
    public String getDayRelation() {
        return dayRelation;
    }

    /**
     * @param dayRelation the dayRelation to set
     */
    public void setDayRelation(String dayRelation) {
        this.dayRelation = dayRelation;
    }

    /**
     * @return the dayLimit
     */
    public Date getDayLimit() {
        return dayLimit;
    }

    /**
     * @param dayLimit the dayLimit to set
     */
    public void setDayLimit(Date dayLimit) {
        this.dayLimit = dayLimit;
    }

    /**
     * @return the isSetFH
     */
    public boolean isIsSetFH() {
        return isSetFH;
    }

    /**
     * @param isSetFH the isSetFH to set
     */
    public void setIsSetFH(boolean isSetFH) {
        this.isSetFH = isSetFH;
    }

    /**
     * @return the FHRelation
     */
    public String getFHRelation() {
        return FHRelation;
    }

    /**
     * @param FHRelation the FHRelation to set
     */
    public void setFHRelation(String FHRelation) {
        this.FHRelation = FHRelation;
    }

    /**
     * @return the FHLimit
     */
    public double getFHLimit() {
        return FHLimit;
    }

    /**
     * @param FHLimit the FHLimit to set
     */
    public void setFHLimit(double FHLimit) {
        this.FHLimit = FHLimit;
    }

    /**
     * @return the isSetFC
     */
    public boolean isIsSetFC() {
        return isSetFC;
    }

    /**
     * @param isSetFC the isSetFC to set
     */
    public void setIsSetFC(boolean isSetFC) {
        this.isSetFC = isSetFC;
    }

    /**
     * @return the FCRelation
     */
    public String getFCRelation() {
        return FCRelation;
    }

    /**
     * @param FCRelation the FCRelation to set
     */
    public void setFCRelation(String FCRelation) {
        this.FCRelation = FCRelation;
    }

    /**
     * @return the FCLimit
     */
    public int getFCLimit() {
        return FCLimit;
    }

    /**
     * @param FCLimit the FCLimit to set
     */
    public void setFCLimit(int FCLimit) {
        this.FCLimit = FCLimit;
    }

    /**
     * @return the isSetDayFH
     */
    public boolean isIsSetDayFH() {
        return isSetDayFH;
    }

    /**
     * @param isSetDayFH the isSetDayFH to set
     */
    public void setIsSetDayFH(boolean isSetDayFH) {
        this.isSetDayFH = isSetDayFH;
    }

    /**
     * @return the DayFHStart
     */
    public Date getDayFHStart() {
        return dayFHStart;
    }

    /**
     * @param dayFHStart
     */
    public void setDayFHStart(Date dayFHStart) {
        this.dayFHStart = dayFHStart;
    }

    /**
     * @return the dayFHLeft
     */
    public double getDayFHLeft() {
        return dayFHLeft;
    }

    /**
     * @param dayFHLeft the dayFHLeft to set
     */
    public void setDayFHLeft(double dayFHLeft) {
        this.dayFHLeft = dayFHLeft;
    }

    /**
     * @return the isSetDayFC
     */
    public boolean isIsSetDayFC() {
        return isSetDayFC;
    }

    /**
     * @param isSetDayFC the isSetDayFC to set
     */
    public void setIsSetDayFC(boolean isSetDayFC) {
        this.isSetDayFC = isSetDayFC;
    }

    /**
     * @return the dayFCStart
     */
    public Date getDayFCStart() {
        return dayFCStart;
    }

    /**
     * @param dayFCStart the dayFCStart to set
     */
    public void setDayFCStart(Date dayFCStart) {
        this.dayFCStart = dayFCStart;
    }

    /**
     * @return the dayFCLeft
     */
    public int getDayFCLeft() {
        return dayFCLeft;
    }

    /**
     * @param dayFCLeft the dayFCLeft to set
     */
    public void setDayFCLeft(int dayFCLeft) {
        this.dayFCLeft = dayFCLeft;
    }

    /**
     * @return the isFirstEffective
     */
    public boolean isIsFirstEffective() {
        return isFirstEffective;
    }

    /**
     * @param isFirstEffective the isFirstEffective to set
     */
    public void setIsFirstEffective(boolean isFirstEffective) {
        this.isFirstEffective = isFirstEffective;
    }

    /**
     * @return the isLastEffective
     */
    public boolean isIsLastEffective() {
        return isLastEffective;
    }

    /**
     * @param isLastEffective the isLastEffective to set
     */
    public void setIsLastEffective(boolean isLastEffective) {
        this.isLastEffective = isLastEffective;
    }

    /**
     * @return the textTimeLimit
     */
    public String getTextTimeLimit() {
        return textTimeLimit;
    }

    /**
     * @param textTimeLimit the textTimeLimit to set
     */
    public void setTextTimeLimit(String textTimeLimit) {
        this.textTimeLimit = textTimeLimit;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TimeLimit [id=");
        sb.append(this.getId())
                .append(", isStructucted=").append(this.isIsStructucted())
                .append(", isSetDay=").append(this.isIsSetDay())
                .append(", dayRelation=").append(this.getDayRelation())
                .append(", dayLimit=").append(this.getDayLimit())
                .append(", isSetFC=").append(this.isIsSetFC())
                .append(", FHRelation=").append(this.getFHRelation())
                .append(", FHLimit=").append(this.getFHLimit())
                .append(", isSetFH=").append(this.isIsSetFH())
                .append(", FCRelation=").append(this.getFCRelation())
                .append(", FCLimit=").append(this.getFCLimit())
                .append(", isSetDayFH=").append(this.isIsSetDayFH())
                .append(", dayFHStart=").append(this.getDayFHStart())
                .append(", dayFHLeft=").append(this.getDayFHLeft())
                .append(", isSetDayFC=").append(this.isIsSetDayFC())
                .append(", dayFCStart=").append(this.getDayFCStart())
                .append(", dayFCLeft=").append(this.getDayFCLeft())
                .append(", isFirstEffective=").append(this.isIsFirstEffective())
                .append(", isLastEffective=").append(this.isIsLastEffective())
                .append(", textTimeLimit=").append(this.getTextTimeLimit())
                .append("]");
        return sb.toString();
    }
    
}
