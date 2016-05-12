package com.aedms.core.rest.source;

import com.aedms.core.entities.source.AirCraftStatusRec;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author jaly
 */
@RepositoryRestResource(collectionResourceRel = "airCraftStatusRec", path = "airCraftStatusRec")
public interface AirCraftStatusRecRestRepo extends PagingAndSortingRepository<AirCraftStatusRec, Long>{
    
}
