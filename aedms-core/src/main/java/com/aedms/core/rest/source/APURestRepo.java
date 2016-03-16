package com.aedms.core.rest.source;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.aedms.core.entities.source.APU;
import com.aedms.core.entities.source.Engine;

@RepositoryRestResource(collectionResourceRel = "apu", path = "apu")
public interface APURestRepo extends PagingAndSortingRepository<APU, Long> {

}