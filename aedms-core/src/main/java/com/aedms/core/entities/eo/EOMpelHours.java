package com.aedms.core.entities.eo;

import com.aedms.core.entities.AedmsEntity;
import fr.lteconsulting.UseBuilderGenerator;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author jaly
 */
@Entity
@Table(name = "EO_MPEL_HOURS")
public class EOMpelHours extends AedmsEntity {
    
    private static final long serialVersionUID = 1L;
    
    @Column(name = "PERSON_QUANTITY")
    private int personQuantity;
    
    @Column(name = "TOTAL_TASK_HOURS")
    private double totalTaskHours;
    
    @Column(name = "TOTAL_ELAPSED_HOURS")
    private double totalElapsedHours;
    
    @Column(name = "TASK_MEMO", length = 4000)
    private String taskMemo;
    
    @JoinColumn(name = "EO_GROUP_ID")
    @OneToOne(optional = false, fetch = FetchType.LAZY, mappedBy = "eoMpelHours")
    private EOGroup eoGroup;
    
    public EOMpelHours() {}
    
    @UseBuilderGenerator
    public EOMpelHours(EOGroup eoGroup, int personQuantity, double totalTaskHours, 
                        double totalElapsedHours, String taskMemo) {
        super();
        this.eoGroup = eoGroup;
        this.personQuantity = personQuantity;
        this.totalElapsedHours = totalElapsedHours;
        this.taskMemo = taskMemo;
        this.totalTaskHours = totalTaskHours;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        return sb.toString();
    }

    /**
     * @return the personQuantity
     */
    public int getPersonQuantity() {
        return personQuantity;
    }

    /**
     * @param personQuantity the personQuantity to set
     */
    public void setPersonQuantity(int personQuantity) {
        this.personQuantity = personQuantity;
    }

    /**
     * @return the totalTaskHours
     */
    public double getTotalTaskHours() {
        return totalTaskHours;
    }

    /**
     * @param totalTaskHours the totalTaskHours to set
     */
    public void setTotalTaskHours(double totalTaskHours) {
        this.totalTaskHours = totalTaskHours;
    }

    /**
     * @return the totalElapsedHours
     */
    public double getTotalElapsedHours() {
        return totalElapsedHours;
    }

    /**
     * @param totalElapsedHours the totalElapsedHours to set
     */
    public void setTotalElapsedHours(double totalElapsedHours) {
        this.totalElapsedHours = totalElapsedHours;
    }

    /**
     * @return the taskMemo
     */
    public String getTaskMemo() {
        return taskMemo;
    }

    /**
     * @param taskMemo the taskMemo to set
     */
    public void setTaskMemo(String taskMemo) {
        this.taskMemo = taskMemo;
    }

    /**
     * @return the eoGroup
     */
    public EOGroup getEoGroup() {
        return eoGroup;
    }

    /**
     * @param eoGroup the eoGroup to set
     */
    public void setEoGroup(EOGroup eoGroup) {
        this.eoGroup = eoGroup;
    }
    
}
