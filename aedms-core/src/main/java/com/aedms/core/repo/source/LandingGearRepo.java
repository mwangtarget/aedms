package com.aedms.core.repo.source;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.aedms.core.entities.source.LandingGear;

@RepositoryRestResource(collectionResourceRel = "landinggears", path = "landinggears")
public interface LandingGearRepo extends CrudRepository<LandingGear, Long> {


}