package com.aedms.core.repo.source;

import com.aedms.core.entities.source.LandingGearStatusRec;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author jaly
 */
@RepositoryRestResource(collectionResourceRel = "ladinggearstatusrecs", path = "ladinggearstatusrecs")
public interface LandingGearStatusRecRepo extends CrudRepository<LandingGearStatusRec, Long> {
    
}
