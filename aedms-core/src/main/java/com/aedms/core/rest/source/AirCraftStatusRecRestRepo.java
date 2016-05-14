package com.aedms.core.rest.source;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.aedms.core.entities.source.AirCraftStatusRec;

/**
 *
 * @author jaly
 */
@RepositoryRestResource(collectionResourceRel = "aircraftStatusRec", path = "aircraftStatusRec")
public interface AirCraftStatusRecRestRepo extends PagingAndSortingRepository<AirCraftStatusRec, Long> {
    
}
