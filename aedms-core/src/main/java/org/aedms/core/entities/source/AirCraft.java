package org.aedms.core.entities.source;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 * The Entity to representing AirCraft.
 * 
 * @author mwang
 *
 */

@Entity
@Table(name = "SRC_AIRCRAFT")
public class AirCraft implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name = "SRC_SEQ", allocationSize = 1, sequenceName = "SRC_SEQ")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "SRC_SEQ")
	@Basic(optional = false)
	@Column(name = "AIRCRAFT_ID")
	private Long airCraftID;
	
	@Column(name = "AIRCRAFT_MODEL")
	private String airCraftModel;
	


}
