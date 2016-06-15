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
@Table(name="EO_MAT_LIST")
public class EOMatList extends AedmsEntity {
    
    private static final long serialVersionUID = 1L;
    
    @Column(name = "MAT_NO", length = 50)
    private String matNumber;
    
    @Column(name = "MAT_NAME", length = 500)
    private String matName;
    
    @Column(name = "MAT_PRICE")
    private double matPrice;
    
    @Column(name = "MAT_PRICE_UNIT", length = 20)
    private String matPriceUnit;
    
    @Column(name = "MAT_MEMO", length = 4000)
    private String matMemo;
    
    @JoinColumn(name = "EO_GROUP_ID")
    @OneToOne(optional = false, fetch = FetchType.LAZY, mappedBy = "eoMatList")
    private EOGroup eoGroup;
    
    public EOMatList() {}
    
    @UseBuilderGenerator
    public EOMatList(String matNumber, String matName, double matPrice, 
            String matPriceUnit, String matMemo, EOGroup eoGroup) {
        super();
        this.matMemo = matMemo;
        this.matName = matName;
        this.matPrice = matPrice;
        this.matPriceUnit = matPriceUnit;
        this.matNumber = matNumber;
        this.eoGroup = eoGroup;
    }
            

    /**
     * @return the matNumber
     */
    public String getMatNumber() {
        return matNumber;
    }

    /**
     * @param matNumber the matNumber to set
     */
    public void setMatNumber(String matNumber) {
        this.matNumber = matNumber;
    }

    /**
     * @return the matName
     */
    public String getMatName() {
        return matName;
    }

    /**
     * @param matName the matName to set
     */
    public void setMatName(String matName) {
        this.matName = matName;
    }

    /**
     * @return the matPrice
     */
    public double getMatPrice() {
        return matPrice;
    }

    /**
     * @param matPrice the matPrice to set
     */
    public void setMatPrice(double matPrice) {
        this.matPrice = matPrice;
    }

    /**
     * @return the matPriceUnit
     */
    public String getMatPriceUnit() {
        return matPriceUnit;
    }

    /**
     * @param matPriceUnit the matPriceUnit to set
     */
    public void setMatPriceUnit(String matPriceUnit) {
        this.matPriceUnit = matPriceUnit;
    }

    /**
     * @return the matMemo
     */
    public String getMatMemo() {
        return matMemo;
    }

    /**
     * @param matMemo the matMemo to set
     */
    public void setMatMemo(String matMemo) {
        this.matMemo = matMemo;
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
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        return sb.toString();
    }
}
