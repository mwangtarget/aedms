package com.aedms.core.rest.source;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.aedms.core.entities.source.LandingGear;

@RepositoryRestResource(collectionResourceRel = "landinggear", path = "landinggear")
public interface LandingGearRestRepo extends PagingAndSortingRepository<LandingGear, Long> {

}