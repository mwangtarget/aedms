package com.aedms.core.rest.source;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.aedms.core.entities.source.Engine;


@RepositoryRestResource(collectionResourceRel = "engine", path = "engine")
public interface EngineRestRepo extends PagingAndSortingRepository<Engine, Long> {

}