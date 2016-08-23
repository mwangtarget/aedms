/*
 * 
 */
package com.aedms.polling;

import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.Service;
import com.google.common.util.concurrent.ServiceManager.Listener;
import com.google.common.util.concurrent.ServiceManager;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.log4j.Logger;

/**
 * This is the polling service entrance. 
 * Here will start & stop the polling service, 
 * and monitor the polling service status
 *
 * @author jaly
 */
public class PollingServer {

    private final Logger logger = Logger.getLogger(PollingServer.class);
    private final Set<Service> services;
    private final ServiceManager serviceManager;

    public PollingServer(Set<Service> services) {
        this.services = services;
        serviceManager = new ServiceManager(this.services);
        this.startServices();
    }

    private void startServices() {
        logger.info("Begin starting the PollingServer.... ");
        serviceManager.addListener(new Listener() {
            @Override
            public void stopped() {
            }

            @Override
            public void healthy() {
                // Services have been initialized and are healthy, start accepting requests...
            }

            @Override
            public void failure(Service service) {
                // Something failed, at this point we could log it, notify a load balancer, or take
                // some other action.  For now we will just exit.
                logger.error("Starting PollerServer fail !");
                System.exit(1);
            }
        }, MoreExecutors.directExecutor()
        );

        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Give the services 5 seconds to stop to ensure that 
                // we are responsive to shutdown requests.
                try {
                    serviceManager.stopAsync().awaitStopped(5, TimeUnit.SECONDS);
                } catch (TimeoutException timeout) {
                    // stopping timed out
                    logger.error("Stop Polling service fail: {} ", timeout);
                }
            }
        });
        // start all the services asynchronously
        serviceManager.startAsync();
        logger.info("Started the PollingServer.... ");
    }
}
