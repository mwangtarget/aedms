package com.aedms.core.dao.source;

import static org.testng.AssertJUnit.assertEquals;
import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aedms.core.config.ConfigCore;
import com.aedms.core.entities.source.AirCraft;
import com.ninja_squad.dbsetup.DbSetup;
import com.ninja_squad.dbsetup.destination.DataSourceDestination;
import com.ninja_squad.dbsetup.operation.Operation;
import static com.ninja_squad.dbsetup.Operations.deleteAllFrom;
import static com.ninja_squad.dbsetup.Operations.insertInto;
import static com.ninja_squad.dbsetup.Operations.sequenceOf;

@ContextConfiguration(classes=ConfigCore.class)
public class AirCraftDaoTest extends AbstractTransactionalTestNGSpringContextTests {

	@Autowired
	private AirCraftDao airCraftDao;
	
	
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@BeforeMethod
	public void beforeMethod(){
		Operation operation = sequenceOf(
				deleteAllFrom("AIRCRAFT"),
				insertInto("AIRCRAFT")
					.columns("id","fleet")
					.values(1,"B777")
					.values(2,"A320")
					.build()
					);
		DbSetup dbSetup = new DbSetup(new DataSourceDestination(dataSource), operation);
        dbSetup.launch();
	}
	
	
	@Test
	public void testSimpleFind(){
		AirCraft ac = airCraftDao.getAirCraft(new Long(1));
		assertEquals(ac.getFleet(), "B777");
	}
	
}
