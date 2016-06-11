package com.aedms.core.repo.source;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.aedms.core.entities.source.Engine;

@RepositoryRestResource(collectionResourceRel = "engines", path = "engines")
public interface EngineRepo extends CrudRepository<Engine, Long> {


}
