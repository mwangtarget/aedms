package com.aedms.core.repo.source;

import org.springframework.data.repository.CrudRepository;

import com.aedms.core.entities.source.Engine;
import com.aedms.core.entities.source.EngineOperationRec;
import com.aedms.core.entities.source.EngineStatusRec;

public interface EngineStatRepo extends CrudRepository<EngineStatusRec, Long> {


}
