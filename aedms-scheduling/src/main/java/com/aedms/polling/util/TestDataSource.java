package com.aedms.polling.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.joda.time.DateTime;

/**
 * This class only for testing. Some testing data are holding on a properties file
 *
 * @author jaly
 */
public class TestDataSource {

    final static Properties pps = new Properties();

    static {
        try {
            pps.load(new FileInputStream("testing_data.properties"));
        } catch (IOException ex) {
            Logger.getLogger(TestDataSource.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static Date getCalendar() {
        String dateStr = pps.getProperty("CALENDAR");
        return DateTime.parse(dateStr).toDate();
    }
    
    public static int getFlyCircle() {
        return Integer.valueOf(pps.getProperty("FLY_CIRCLE"));
    }
    
    public static int getFlyHour() {
        return Integer.valueOf(pps.getProperty("FLY_HOUR"));
    }
    
    public static Date getCalendarOfCalendarFlyCircle() {
        String tmp = pps.getProperty("CALENDAR_FLY_CIRCLE");
        if (tmp != null && !tmp.isEmpty()) {
            return DateTime.parse(tmp.split(";")[0]).toDate();
        }else {
            return null;
        }
    }
    
    public static int getFlyCircleOfCalendarFlyCircle() {
        String tmp = pps.getProperty("CALENDAR_FLY_CIRCLE");
        if (tmp != null && !tmp.isEmpty()) {
            return Integer.valueOf(tmp.split(";")[1]);
        }else {
            return 0;
        }
    }
    
    public static Date getCalendarOfCalendarFlyHour() {
        String tmp = pps.getProperty("CALENDAR_FLY_HOUR");
        if (tmp != null && !tmp.isEmpty()) {
            return DateTime.parse(tmp.split(";")[0]).toDate();
        }else {
            return null;
        }
    }
    
    public static int getFlyHourOfCalendarFlyHour() {
        String tmp = pps.getProperty("CALENDAR_FLY_HOUR");
        if (tmp != null && !tmp.isEmpty()) {
            return Integer.valueOf(tmp.split(";")[1]);
        }else {
            return 0;
        }
    }
    
    public static int getCircleToDay() {
        return Integer.valueOf(pps.getProperty("CIRCLE_TO_DAY"));
    }
    
    public static int getFlyHourToDay() {
        return Integer.valueOf(pps.getProperty("FLY_HOUR_TO_DAY"));
    }
}
