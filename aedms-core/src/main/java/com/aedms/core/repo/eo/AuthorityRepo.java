package com.aedms.core.repo.eo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.aedms.core.entities.eo.Authority;
import com.aedms.core.entities.eo.EOOrder;

@RepositoryRestResource(collectionResourceRel = "authorities", path = "authorities")
public interface AuthorityRepo extends CrudRepository<Authority, Long> {
	
}

