//package com.aedms.core.dao.source;
//
//import static org.testng.AssertJUnit.assertEquals;
//import static org.testng.AssertJUnit.assertNotNull;
//
//import javax.sql.DataSource;
//
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import com.aedms.core.config.ConfigCore;
//import com.aedms.core.entities.source.AirCraft;
//import com.aedms.core.entities.source.Engine;
//import com.ninja_squad.dbsetup.DbSetup;
//import com.ninja_squad.dbsetup.destination.DataSourceDestination;
//import com.ninja_squad.dbsetup.operation.Operation;
//import static com.ninja_squad.dbsetup.Operations.deleteAllFrom;
//import static com.ninja_squad.dbsetup.Operations.insertInto;
//import static com.ninja_squad.dbsetup.Operations.sequenceOf;
//
//@ContextConfiguration(classes=ConfigCore.class)
//public class AirCraftDaoTest extends AbstractTransactionalTestNGSpringContextTests {
//
//	@Autowired
//	private AirCraftDao airCraftDao;
//	
//	@Autowired
//	private EngineDao engineDao;
//	
//	
//	@Autowired
//	private DataSource dataSource;
//	
//	@Autowired
//	private SessionFactory sessionFactory;
//	
//	@BeforeMethod
//	public void beforeMethod(){
//		Operation operation = sequenceOf(
//				deleteAllFrom("AIRCRAFT"),
//				insertInto("AIRCRAFT")
//					.columns("fleet", "BUS_SEAT_COUNT")
//					.values("B777", 200)
//					.values("A320", 300)
//					.build()
//					);
//		
//		DbSetup dbSetup = new DbSetup(new DataSourceDestination(dataSource), operation);
//        dbSetup.launch();
//	}
//	
//	
//	@Test
//	public void testSimpleFind(){
//		AirCraft ac = airCraftDao.getAirCraft(new Long(1));
//		assertEquals(ac.getFleet(), "B777");
//	}
//	
//	@Test
//	public void testSimpleInsert(){
//		AirCraft airCraft = new AirCraft();
//		airCraft.setFleet("B777");
//		airCraft.setModel("ABC");
//		airCraftDao.saveAirCraft(airCraft);
//
//		assertNotNull(Long.toString(airCraft.getId()),"ID of AirCraft after persistence");
//		
//		AirCraft postInsertAirCraft = airCraftDao.getAirCraft(airCraft.getId());
//		assertEquals(airCraft.getId(),postInsertAirCraft.getId());
//		assertEquals(postInsertAirCraft.getFleet(),"B777");
//		assertEquals(postInsertAirCraft.getModel(),"ABC");
//	}
//	
//	@Test
//	public void testSimpleInsertWithEngine(){
//		
//		Engine engine1 = new Engine();
//		engine1.setFleet("HP");
//		engine1.setModel("HP1");
//		engineDao.saveEngine(engine1);
//		
//		AirCraft airCraft = new AirCraft();
//		airCraft.setFleet("B777");
//		airCraft.setModel("ABC");
//		airCraft.setEngineOne(engine1);
//		airCraftDao.saveAirCraft(airCraft);
//
//		assertNotNull(Long.toString(airCraft.getId()),"ID of AirCraft after persistence");
//		
//		AirCraft postInsertAirCraft = airCraftDao.getAirCraft(airCraft.getId());
//		assertEquals(airCraft.getId(),postInsertAirCraft.getId());
//		assertEquals(airCraft.getFleet(),"B777");
//		assertEquals(airCraft.getModel(),"ABC");
//		
//		assertEquals(airCraft.getEngineOne().getFleet(),"HP");
//		assertEquals(airCraft.getEngineOne().getModel(), "HP1");
//		
//	}
//	
//}
