package com.aedms.core.repo.eo;

import com.aedms.core.entities.eo.AirworthDirective;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

/**
 *
 * @author jaly
 */
@ContextConfiguration
public class AirworthDirectiveRepoTest extends AbstractTestNGSpringContextTests{
    
    @Autowired
    private AirworthDirectiveRepo repo;
    
    @Autowired
    private AirworthDirective ad;
    
    public AirworthDirectiveRepoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
