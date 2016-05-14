package com.aedms.core.rest.source;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import com.aedms.core.entities.source.EngineStatusRec;

@RepositoryRestResource(collectionResourceRel = "enginestat", path = "enginestat")
public interface EngineStatRestRepo extends PagingAndSortingRepository<EngineStatusRec, Long> {

}
