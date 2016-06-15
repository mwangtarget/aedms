package com.aedms.core.entities.eo;

import com.aedms.core.entities.AedmsEntity;
import fr.lteconsulting.UseBuilderGenerator;
import java.util.Date;
import java.util.Set;
import javax.persistence.CascadeType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "AD")
public class AirworthDirective extends AedmsEntity {
    
    private static final long serialVersionUID = 1L;
	
	@Column(name="AD_NUMBER", length=45)
	private String adNumber;
	
	@Column(name="AD_LINK", length=200)
	private String adLink;
	

	@Column(name = "ISSUE_DATE")
	@Temporal(javax.persistence.TemporalType.DATE)
	private Date issueDate;

	// Link to authority;
	@ManyToOne
    @JoinColumn(name="AUTHORITY_ID", nullable=false)
	private Authority authority;
	
	@ManyToMany(mappedBy="airworthDirectives", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "EO_ORDER_AD")
	private Set<EOOrder> eoOrders;

    
    public AirworthDirective(){}
    
    @UseBuilderGenerator
    public AirworthDirective(String adNumber, String adLink, Date issueDate, 
            Authority authority, Set<EOOrder> eoOrders){
        super();
        this.adLink = adLink;
        this.adNumber = adNumber;
        this.issueDate = issueDate;
        this.authority = authority;
        this.eoOrders = eoOrders;
    }

    /**
     * @return the adNumber
     */
    public String getAdNumber() {
        return adNumber;
    }

    /**
     * @param adNumber the adNumber to set
     */
    public void setAdNumber(String adNumber) {
        this.adNumber = adNumber;
    }

    /**
     * @return the adLink
     */
    public String getAdLink() {
        return adLink;
    }

    /**
     * @param adLink the adLink to set
     */
    public void setAdLink(String adLink) {
        this.adLink = adLink;
    }

    /**
     * @return the issueDate
     */
    public Date getIssueDate() {
        return issueDate;
    }

    /**
     * @param issueDate the issueDate to set
     */
    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    /**
     * @return the authority
     */
    public Authority getAuthority() {
        return authority;
    }

    /**
     * @param authority the authority to set
     */
    public void setAuthority(Authority authority) {
        this.authority = authority;
    }

    /**
     * @return the eoOrders
     */
    public Set<EOOrder> getEoOrders() {
        return eoOrders;
    }

    /**
     * @param eoOrders the eoOrders to set
     */
    public void setEoOrders(Set<EOOrder> eoOrders) {
        this.eoOrders = eoOrders;
    }
	
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        return sb.toString();
    }

}
