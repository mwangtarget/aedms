package com.aedms.core.repo.source;

import com.aedms.core.entities.source.Organization;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author jaly
 */
public interface OrganizationRepo extends CrudRepository<Organization, Long> {
    
}
