package com.aedms.core.entities.eo;

import com.aedms.core.entities.AedmsEntity;
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
@Table(name = "EO_GROUP")
public class EOGroup extends AedmsEntity {
    
    private static final long serialVersionUID = 1L;
    
    @Column(name = "GROUP_NO", length = 50)
    private String groupNumber;
    
    @Column(name = "EFF_TEXT", length = 4000)
    private String effText;
    
    @Column(name = "OTHER", length = 4000)
    private String other;
    
    @Column(name = "EO_ORDER_ID")
    @OneToOne
    private EOOrder eoOrder;
    
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "EO_GROUP_AFFECT")
    private Set<Affect> affects;
    
    public EOGroup(){}
    
    @UseBuilderGenerator
    public EOGroup(String groupNumber,  String effText, String other, 
            EOOrder eoOrder, Set<Affect> affects){
        super();
        this.groupNumber = groupNumber;
        this.effText = effText;
        this.other = other;
        this.eoOrder = eoOrder;
        this.affects= affects;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        return sb.toString();
    }

    /**
     * @return the groupNumber
     */
    public String getGroupNumber() {
        return groupNumber;
    }

    /**
     * @param groupNumber the groupNumber to set
     */
    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    /**
     * @return the effText
     */
    public String getEffText() {
        return effText;
    }

    /**
     * @param effText the effText to set
     */
    public void setEffText(String effText) {
        this.effText = effText;
    }

    /**
     * @return the other
     */
    public String getOther() {
        return other;
    }

    /**
     * @param other the other to set
     */
    public void setOther(String other) {
        this.other = other;
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
     * @return the affects
     */
    public Set<Affect> getAffects() {
        return affects;
    }

    /**
     * @param affects the affects to set
     */
    public void setAffects(Set<Affect> affects) {
        this.affects = affects;
    }
    
}
