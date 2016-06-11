package com.aedms.core.repo.source;

import com.aedms.core.entities.source.APUStatusRec;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author jaly
 */
@RepositoryRestResource(collectionResourceRel = "apustatusrecs", path = "apustatusrecs")
public interface APUStatusRecRepo extends CrudRepository<APUStatusRec, Long>{
    
}
