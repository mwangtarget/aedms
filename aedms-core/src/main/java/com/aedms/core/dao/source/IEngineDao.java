package com.aedms.core.dao.source;

import com.aedms.core.entities.source.Engine;

public interface  IEngineDao {
	public Long saveEngine(Engine engine);

	public boolean deleteEngine(Long id);

	public boolean updateEngine(Engine user);

	public Engine loadEngine(Long id);

	public Engine getEngine(Long id);

}
