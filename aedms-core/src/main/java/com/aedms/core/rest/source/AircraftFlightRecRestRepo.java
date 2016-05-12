package com.aedms.core.rest.source;

import com.aedms.core.entities.source.AircraftFlightRec;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author jaly
 */
@RepositoryRestResource(collectionResourceRel = "aircraftFlightRec", path = "aircraftFlightRec")
public interface AircraftFlightRecRestRepo extends PagingAndSortingRepository<AircraftFlightRec, Long>{
    
}
