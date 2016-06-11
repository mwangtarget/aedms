package com.aedms.core.repo.source;

import com.aedms.core.entities.source.AirCraftFlightRec;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author jaly
 */
@RepositoryRestResource(collectionResourceRel = "aircraftflightrecs", path = "aircraftflightrecs")
public interface AircraftFlightRecRepo extends CrudRepository<AirCraftFlightRec, Long>{
    
}
