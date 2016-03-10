package org.aedms.core.dao.source;

import org.aedms.core.entities.source.AirCraft;

public interface IAirCraftDao {
	
    public Long saveAirCraft(AirCraft airCraft);

    public boolean deleteAirCraft(Long id);

    public boolean updateAirCraft(AirCraft user);

    public AirCraft loadAirCraft(Long id);

    public AirCraft getAirCraft(Long id);
}