package com.aedms.core.repo.eo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.aedms.core.entities.eo.EOOrder;
import com.aedms.core.entities.source.User;

@RepositoryRestResource(collectionResourceRel = "eoorders", path = "eoorders")
public interface EOOrderRepo extends CrudRepository<EOOrder, Long> {
	
}
