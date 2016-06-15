package com.aedms.core.entities.eo;

import com.aedms.core.entities.AedmsEntity;
import fr.lteconsulting.UseBuilderGenerator;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "AUTHORITY")
public class Authority extends AedmsEntity {
	
    private static final long serialVersionUID = 1L;
    
	@Column(name="NAME", length=100)
	private String name;
	

	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="authority")
    private Set<AirworthDirective>   airworthDirectives; 
    
    public Authority() {}
    
    @UseBuilderGenerator
    public Authority(String name, Set<AirworthDirective>   airworthDirectives) {
        super();
        this.name = name;
        this.airworthDirectives = airworthDirectives;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        return sb.toString();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the airworthDirectives
     */
    public Set<AirworthDirective> getAirworthDirectives() {
        return airworthDirectives;
    }

    /**
     * @param airworthDirectives the airworthDirectives to set
     */
    public void setAirworthDirectives(Set<AirworthDirective> airworthDirectives) {
        this.airworthDirectives = airworthDirectives;
    }
	 
}
