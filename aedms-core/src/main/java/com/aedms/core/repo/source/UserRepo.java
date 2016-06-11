package com.aedms.core.repo.source;

import com.aedms.core.entities.source.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author jaly
 */

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepo extends CrudRepository<User, Long> {
	
	User findByLoginName(String loginName);
    
}
