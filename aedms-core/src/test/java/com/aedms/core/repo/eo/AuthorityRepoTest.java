package com.aedms.core.repo.eo;

import com.aedms.core.entities.eo.AirworthDirective;
import com.aedms.core.entities.eo.Authority;
import com.aedms.core.entities.eo.AuthorityBuilder;
import java.util.HashSet;
import java.util.Set;
import org.junit.runner.RunWith;
import org.junit.runners.model.InitializationError;
import org.testng.Assert;
import org.testng.annotations.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 *
 * @author jaly
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {com.aedms.core.test.config.ConfigCore.class, com.aedms.core.test.config.EntityConfig.class, com.aedms.core.test.config.RepositoryConfig.class})
@Transactional
public class AuthorityRepoTest {

    @Autowired
    private AuthorityRepo repo;

    @Autowired
    private Authority authority;

    @Autowired
    private static ApplicationContext context;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

//    public AuthorityRepoTest(Class<?> clazz) throws InitializationError {
//        super(clazz);
//    }
    /**
     *
     */
    @Test
    public void testSave() {
        authority = (Authority) context.getBean("authority", Authority.class);
        repo = (AuthorityRepo) context.getBean("authorityRepo", AuthorityRepo.class);
        Set<AirworthDirective> ads = new HashSet<>();
        authority = AuthorityBuilder.create()
                .withName("test_Authority")
                .withAirworthDirectives(ads)
                .build();
        repo.save(authority);

        Assert.assertTrue(repo.findAll().iterator().hasNext());
    }

}
