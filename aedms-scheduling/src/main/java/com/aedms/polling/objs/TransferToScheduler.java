package com.aedms.polling.objs;

import com.google.common.util.concurrent.AbstractScheduledService.Scheduler;
import java.util.Date;

/**
 *
 * @author jaly
 */
public interface TransferToScheduler {
    Scheduler transforToSchedule();
    TimeLimitJ.TimeLimitType getTimeLimitJ();
    Date transferToCalendarDate();
}
