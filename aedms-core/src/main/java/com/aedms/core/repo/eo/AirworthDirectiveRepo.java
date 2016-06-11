package com.aedms.core.repo.eo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.aedms.core.entities.eo.AirworthDirective;

@RepositoryRestResource(collectionResourceRel = "airworthdirectives", path = "airworthdirectives")
public interface AirworthDirectiveRepo extends CrudRepository<AirworthDirective, Long> {
	
}

