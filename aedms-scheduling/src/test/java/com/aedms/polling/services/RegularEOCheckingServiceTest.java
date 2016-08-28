package com.aedms.polling.services;

import com.google.common.util.concurrent.Service.Listener;
import java.lang.Thread.State;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import com.google.common.util.concurrent.AbstractScheduledService;
import com.google.common.util.concurrent.MoreExecutors;

/**
 *
 * @author jaly
 */
public class RegularEOCheckingServiceTest {

    RegularEOCheckingService service;

    public RegularEOCheckingServiceTest() {
    }

    @Before
    public void setUp() {
        service = new RegularEOCheckingService();
        service.addListener(new Listener() {
            
            @Override
            public void starting() {
                System.out.println("服务开始启动.....");
            }

            @Override
            public void running() {
                System.out.println("服务开始运行");
            }

            public void stopping(State from) {
                System.out.println("服务关闭中");
            }

            public void terminated(State from) {
                System.out.println("服务终止");
            }

            public void failed(State from, Throwable failure) {
                System.out.println("失败，cause：" + failure.getCause());
            }
        }, MoreExecutors.directExecutor());
        
        service.startAsync().awaitRunning();
        System.out.println("服务状态为:" + service.state());
    }

    @After
    public void tearDown() {
        service = null;
    }

    /**
     * Test of runOneIteration method, of class RegularEOCheckingService.
     */
    @Test
    public void testRunOneIteration() throws Exception {
        System.out.println("runOneIteration");
        RegularEOCheckingService instance = new RegularEOCheckingService();
        instance.runOneIteration();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of scheduler method, of class RegularEOCheckingService.
     */
    @Test
    public void testScheduler() {
        System.out.println("scheduler");
        RegularEOCheckingService instance = new RegularEOCheckingService();
        AbstractScheduledService.Scheduler expResult = null;
        AbstractScheduledService.Scheduler result = instance.scheduler();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
