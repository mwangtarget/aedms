package com.aedms.core.repo.source;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.aedms.core.entities.source.Engine;
import com.aedms.core.entities.source.EngineOperationRec;

@RepositoryRestResource(collectionResourceRel = "engineoperationrecs", path = "engineoperationrecs")
public interface EngineOperationRecRepo extends CrudRepository<EngineOperationRec, Long> {


}
