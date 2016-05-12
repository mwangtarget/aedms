package com.aedms.core.repo.source;

import com.aedms.core.entities.source.User;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author jaly
 */
public interface UserRepo extends CrudRepository<User, Long> {
    
}
