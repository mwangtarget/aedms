package com.aedms.core.rest.source;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.aedms.core.entities.source.Engine;
import com.aedms.core.entities.source.EngineOperationRec;

@RepositoryRestResource(collectionResourceRel = "engineopr", path = "engineopr")
public interface EngineOprRestRepo extends PagingAndSortingRepository<EngineOperationRec, Long> {

}
