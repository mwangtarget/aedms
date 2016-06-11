package com.aedms.core.repo.eo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.aedms.core.entities.eo.EOAffectedPub;
import com.aedms.core.entities.eo.EOOrder;

@RepositoryRestResource(collectionResourceRel = "eoaffectedpubs", path = "eoaffectedpubs")
public interface EOAffectedPubRepo extends CrudRepository<EOAffectedPub, Long> {
	
}

