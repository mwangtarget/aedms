package com.aedms.core.repo.source;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.aedms.core.entities.source.AirCraft;

@RepositoryRestResource(collectionResourceRel = "aircrafts", path = "aircrafts")
public interface AirCraftRepo extends CrudRepository<AirCraft, Long> {


}
