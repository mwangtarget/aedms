package com.aedms.core.entities.eo;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "AD")
public class AirworthDirective implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private long id;
	
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
	
	@ManyToMany(mappedBy="airworthDirectives")
	private Set<EOOrder> eorders;
	

}
