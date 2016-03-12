package com.aedms.core.dao.source;

import com.aedms.core.dao.AbstractDao;
import com.aedms.core.entities.source.AirCraft;
import com.aedms.core.entities.source.Engine;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Component
@Repository("airCraftDAO")
public class AirCraftDao extends AbstractDao implements IAirCraftDao {

	@Override
	public Long saveAirCraft(AirCraft airCraft) {
		Long id = 0L;
		getSession().save(airCraft);
		getSession().flush();
		getSession().getTransaction().commit();
		id = airCraft.getId();
		return id;
	}

	@Override
	public boolean deleteAirCraft(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateAirCraft(AirCraft user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public AirCraft loadAirCraft(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AirCraft getAirCraft(Long id) {
		return (AirCraft) getSession().get(AirCraft.class, id);
	} 

}
