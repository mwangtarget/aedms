package com.aedms.core.dao.source;

import com.aedms.core.entities.source.Engine;

public interface  IEngineDao {
	public Long saveEngine(Engine engine);

	public boolean deleteEngine(Long id);

	public boolean updateAirCraft(Engine user);

	public Engine loadEngine(Long id);

	public Engine getEngine(Long id);

}
