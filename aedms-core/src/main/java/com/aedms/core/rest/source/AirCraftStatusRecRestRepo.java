package com.aedms.core.rest.source;

import com.aedms.core.entities.source.AircraftStatusRec;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author jaly
 */
@RepositoryRestResource(collectionResourceRel = "aircraftStatusRec", path = "aircraftStatusRec")
public interface AircraftStatusRecRestRepo extends PagingAndSortingRepository<AircraftStatusRec, Long> {
    
}
