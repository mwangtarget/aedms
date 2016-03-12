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
import com.aedms.core.entities.source.Engine;
import com.ninja_squad.dbsetup.DbSetup;
import com.ninja_squad.dbsetup.destination.DataSourceDestination;
import com.ninja_squad.dbsetup.operation.Operation;
import static com.ninja_squad.dbsetup.Operations.deleteAllFrom;
import static com.ninja_squad.dbsetup.Operations.insertInto;
import static com.ninja_squad.dbsetup.Operations.sequenceOf;

@ContextConfiguration(classes=ConfigCore.class)
public class EngineDaoTest extends AbstractTransactionalTestNGSpringContextTests {

	@Autowired
	private EngineDao engineDao;
	
	
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@BeforeMethod
	public void beforeMethod(){
		Operation operation = sequenceOf(
				deleteAllFrom("ENGINE"),
				insertInto("ENGINE")
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
		Engine engine = engineDao.getEngine(new Long(1));
		assertEquals(engine.getFleet(), "B777");
	}
	
}
