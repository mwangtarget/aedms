package com.aedms.core.rest.source;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.aedms.core.entities.source.AirCraft;

@RepositoryRestResource(collectionResourceRel = "aircraft", path = "aircraft")
public interface AirCraftRestRepo extends PagingAndSortingRepository<AirCraft, Long> {

}