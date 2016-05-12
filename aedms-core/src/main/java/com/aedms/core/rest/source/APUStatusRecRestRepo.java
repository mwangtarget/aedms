package com.aedms.core.rest.source;

import com.aedms.core.entities.source.APUStatusRec;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author jaly
 */
@RepositoryRestResource(collectionResourceRel = "apuStatusRec", path = "apuStatusRec")
public interface APUStatusRecRestRepo extends PagingAndSortingRepository<APUStatusRec,Long>{
    
}
