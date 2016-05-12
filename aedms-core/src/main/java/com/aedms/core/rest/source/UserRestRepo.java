package com.aedms.core.rest.source;

import com.aedms.core.entities.source.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author jaly
 */
@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface UserRestRepo extends PagingAndSortingRepository<User, Long>{
    
}
