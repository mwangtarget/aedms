package com.aedms.core.repo.source;

import com.aedms.core.entities.source.Organization;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author jaly
 */
@RepositoryRestResource(collectionResourceRel = "organizations", path = "organizations")
public interface OrganizationRepo extends CrudRepository<Organization, Long> {
    
}
