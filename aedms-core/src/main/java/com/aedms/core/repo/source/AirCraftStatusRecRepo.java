package com.aedms.core.repo.source;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.aedms.core.entities.source.AirCraftStatusRec;





/**
 *
 * @author jaly
 */
@RepositoryRestResource(collectionResourceRel = "aircraftstatus", path = "aircraftstatus")
public interface AirCraftStatusRecRepo extends CrudRepository<AirCraftStatusRec, Long>{
    
}
