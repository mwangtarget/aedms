package com.aedms.core.repo.source;

import org.springframework.data.repository.CrudRepository;

import com.aedms.core.entities.source.Engine;
import com.aedms.core.entities.source.EngineOprRec;
import com.aedms.core.entities.source.EngineStatRec;

public interface EngineStatRepo extends CrudRepository<EngineStatRec, Long> {


}
