package com.aedms.core.repo.source;

import org.springframework.data.repository.CrudRepository;

import com.aedms.core.entities.source.Engine;
import com.aedms.core.entities.source.EngineOprRec;

public interface EngineOprRepo extends CrudRepository<EngineOprRec, Long> {


}
