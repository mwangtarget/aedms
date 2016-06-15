package com.aedms.core.repo.eo;

import com.aedms.core.entities.eo.EOOrder;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author jaly
 */
public interface EOOrderRepo extends CrudRepository<EOOrder, Long> {
    
}
