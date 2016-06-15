package com.aedms.core.repo.eo;

import com.aedms.core.entities.eo.Authority;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jaly
 */
@Repository(value="autorityRepo")
public interface AuthorityRepo extends CrudRepository<Authority, Long>{
    
}
