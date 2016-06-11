package com.aedms.core.repo.source;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.aedms.core.entities.source.APU;

@RepositoryRestResource(collectionResourceRel = "apus", path = "apus")
public interface APURepo extends CrudRepository<APU, Long> {


}