package com.aedms.core.rest.source;

import com.aedms.core.entities.source.Organization;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author jaly
 */
@RepositoryRestResource(collectionResourceRel = "organization", path = "organization")
public interface OrganizationRestRepo extends PagingAndSortingRepository<Organization, Long>{
    
}
