package com.aedms.core.rest.source;

import com.aedms.core.entities.source.LandingGearStatusRec;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author jaly
 */
@RepositoryRestResource(collectionResourceRel = "landingGearStatusRec", path = "landingGearStatusRec")
public interface LandingGearStatusRecRestRepo extends PagingAndSortingRepository<LandingGearStatusRec, Long> {
    
}
