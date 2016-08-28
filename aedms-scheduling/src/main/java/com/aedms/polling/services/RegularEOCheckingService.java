package com.aedms.polling.services;

import com.google.common.util.concurrent.AbstractScheduledService;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.TimeUnit;

/**
 * For EO, there is a service will check whether is EO is executed or not
 *
 * @author jaly
 */
public class RegularEOCheckingService extends AbstractScheduledService {

    @Override
    protected void startUp() throws Exception {
        //TODO:  read the last execute data
    }

    @Override
    protected void shutDown() throws Exception {
        //TODO: write current data into db
    }

    /**
     * 定义一个周期执行的任务，以及相应的startUp()和shutDown()方法
     *
     * @throws Exception
     */
    @Override
    protected void runOneIteration() throws Exception {
        try {
            System.out.println("Testing  the begin to working ... ");
        } catch (Exception e) {
        }
    }

    /**
     * 使用AbstractScheduledService.Scheduler 类提供的两种调度器： 
     * newFixedRateSchedule(initialDelay, delay, TimeUnit) 
     * 和
     * newFixedDelaySchedule(initialDelay, delay, TimeUnit)
     *
     * @return
     */
    @Override
    protected Scheduler scheduler() {
        //TODO: Before return a "Scheduler", need calculate the next running time
        //return Scheduler.newFixedDelaySchedule(1, 5, TimeUnit.SECONDS);
        return Scheduler.newFixedRateSchedule(1,5, TimeUnit.SECONDS);
    }

    public static void main(String[] args) throws InterruptedException {
        RegularEOCheckingService service = new RegularEOCheckingService();
        service.addListener(new Listener() {

            @Override
            public void starting() {
                System.out.println("服务开始启动.....");
            }

            @Override
            public void running() {
                System.out.println("服务开始运行");
            }

            public void stopping(Thread.State from) {
                System.out.println("服务关闭中");
            }

            public void terminated(Thread.State from) {
                System.out.println("服务终止");
            }

            public void failed(Thread.State from, Throwable failure) {
                System.out.println("失败，cause：" + failure.getCause());
            }
        }, MoreExecutors.directExecutor());

        service.startAsync().awaitRunning();
        System.out.println("服务状态为:" + service.state());
        Thread.sleep(10 * 1000);
        service.stopAsync().awaitTerminated();
        System.out.println("服务状态为:" + service.state());
    }
}
