package com.aedms.core.repo.eo;

import com.aedms.core.entities.eo.Affect;
import org.testng.annotations.Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

/**
 *
 * @author jaly
 */
@ContextConfiguration
public class AffectRepoTest extends AbstractTestNGSpringContextTests{
    
    @Autowired
    private AffectRepo repo;
    
    private Affect affect;
    
    public AffectRepoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Test
    public void testSave() {
    }
    
    public void testFindOne(){
        
    }
    
    public void testFindAffectById(long id){
        
    }
    
}
