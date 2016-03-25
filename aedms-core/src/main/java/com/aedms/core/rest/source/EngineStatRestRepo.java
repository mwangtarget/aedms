package com.aedms.core.rest.source;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import com.aedms.core.entities.source.EngineStatRec;

@RepositoryRestResource(collectionResourceRel = "enginestat", path = "enginestat")
public interface EngineStatRestRepo extends PagingAndSortingRepository<EngineStatRec, Long> {

}
