package com.aedms.core.entities.eo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.aedms.core.entities.source.Engine;

@Entity
@Table(name = "EO_AFF_PUB")
public class EOAffectedPub implements Serializable {

	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private long id;
	
	@Column(name="AFF_PUB_TYPE", length=50)
	private String affectedPubType;
	
	@Column(name="AFF_PUB_NR", length=50)
	private String affectedPubNo;
	
	@Column(name="AFF_PUB_MEMO", length=4000)
	private String affectedPubMemo;
	
	@ManyToOne
    @JoinColumn(name="EORDER_ID", nullable=false)
	private EOOrder eoder;
	
}
