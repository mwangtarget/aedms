package com.aedms.core.repo.source;

import com.aedms.core.entities.source.APUOperationRec;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author jaly
 */
@RepositoryRestResource(collectionResourceRel = "apuoperationrecs", path = "apuoperationrecs")
public interface APUOperationRecRepo extends CrudRepository<APUOperationRec, Long> {
    
}
