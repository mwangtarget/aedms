package com.aedms.core.dao.source;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.aedms.core.dao.AbstractDao;
import com.aedms.core.entities.source.Engine;


@Component
@Repository("engineDAO")
public class EngineDao extends AbstractDao implements IEngineDao{

	@Override
	public Long saveEngine(Engine engine) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteEngine(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateAirCraft(Engine user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Engine loadEngine(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Engine getEngine(Long id) {
		return (Engine) getSession().get(Engine.class, id);
	}

}
