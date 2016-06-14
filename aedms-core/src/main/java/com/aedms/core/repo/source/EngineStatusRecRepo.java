package com.aedms.core.repo.source;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.aedms.core.entities.source.Engine;
import com.aedms.core.entities.source.EngineOperationRec;
import com.aedms.core.entities.source.EngineStatusRec;

@RepositoryRestResource(collectionResourceRel = "enginestatusrecs", path = "enginestatusrecs")
public interface EngineStatusRecRepo extends CrudRepository<EngineStatusRec, Long> {


}
