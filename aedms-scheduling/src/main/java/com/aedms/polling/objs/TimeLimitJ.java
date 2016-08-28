package com.aedms.polling.objs;

import com.aedms.polling.util.TestDataSource;
import com.google.common.util.concurrent.AbstractScheduledService;
import java.util.Date;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import org.joda.time.DateTime;
import org.joda.time.Period;
import org.joda.time.PeriodType;

/**
 * This is an object for business logic, 
 * it maps to Hibernate entity 
 *
 * @TimeLinit
 * @author jaly
 */
public class TimeLimitJ {
    
    /*
     * 采用二进制的方式来记录哪个选项被使用
     * 例如：
     *    如果选用了“日历时间” 和 “飞行小时" 这2个方式
     *    那么标记的值就是 USED_CALENDAR + USED_FLY_HOUR = 2 + 8 = 10
     *    usedFlag = USED_CALENDAR + USED_FLY_HOUR = 2 + 8 = 10
     */
    public final int USED_CALENDAR = 2;
    public final int USED_FLY_CIRCLE = 4;
    public final int USED_FLY_HOUR = 8;
    public final int USED_CALENDAR_FLY_CIRCLE = 16;
    public final int USED_CALENDAR_FLY_HOUR = 32;
    
    private int usedFlag = 0;

    // 先到为准。如果打开“要求”选项，该值默认选中（设置为true）
    private boolean isFirstEffective;

    // 后到为准
    private boolean isLastEffective;
    
    // 当前已经飞行过的循环数
    private int currentFlyCircle; 
    
    //当前已经使用的飞行小时数
    private int currentFlyHour;

    private CalendarPlugFlyCircleTimeLimitJ calendarPlugFlyCircleTimeLimitJ;

    private CalendarPlugFlyHourTimeLimitJ calendarPlugFlyHourTimeLimitJ;

    private CalendarTimeLimitJ calendarTimeLimitJ;

    private FlyCircleTimeLimitJ flyCircleTimeLimitJ;

    private FlyHourTimeLimitJ flyHourTimeLimitJ;
    
    public TimeLimitJ() {
        calendarPlugFlyCircleTimeLimitJ = new CalendarPlugFlyCircleTimeLimitJ();
        calendarPlugFlyHourTimeLimitJ = new CalendarPlugFlyHourTimeLimitJ();
        calendarTimeLimitJ = new CalendarTimeLimitJ();
        flyCircleTimeLimitJ = new FlyCircleTimeLimitJ();
        flyHourTimeLimitJ = new FlyHourTimeLimitJ();
    }

    /**
     * @return the isFirstEffective
     */
    public boolean isIsFirstEffective() {
        return isFirstEffective;
    }

    /**
     * @param isFirstEffective the isFirstEffective to set
     */
    public void setIsFirstEffective(boolean isFirstEffective) {
        this.isFirstEffective = isFirstEffective;
    }

    /**
     * @return the isLastEffective
     */
    public boolean isIsLastEffective() {
        return isLastEffective;
    }

    /**
     * @param isLastEffective the isLastEffective to set
     */
    public void setIsLastEffective(boolean isLastEffective) {
        this.isLastEffective = isLastEffective;
    }

    public AbstractScheduledService.Scheduler transferTimeLimitToSchedule() {
        
        return AbstractScheduledService.Scheduler.newFixedRateSchedule(1, 5, TimeUnit.SECONDS);
    }

    /**
     * 计算下一次运行的scheduler 
     * 根据 isFirstEffective/isLastEffective 来判断
     *
     * @return
     */
    private Optional<TransferToScheduler> nextRunningScheduler() {
        
        Optional<TransferToScheduler> next = Optional.empty();
        
        switch(usedFlag) {
            case 2:
                next.of(getCalendarTimeLimitJ().transforToSchedule());
                break;
            case 4:
                next.of(getFlyCircleTimeLimitJ().transforToSchedule());
                break;
            case 8:
                next.of(getFlyCircleTimeLimitJ().transforToSchedule());
                break;
            case 16:
                break;
            case 32:
                break;
            default:
                return next; // 如果没有设置（0）或者其他非定义的值，直接返回空的
        }
        Date cal_circle_date = null;
        Date cal_flyHour_date = null;
        Date cal_date = null;
        Date circle_date = null;
        Date flyHour_date = null;

        if (calendarPlugFlyCircleTimeLimitJ != null) {
            cal_circle_date = calendarPlugFlyCircleTimeLimitJ.transferToCalendarDate();
        }
        if (calendarPlugFlyHourTimeLimitJ != null) {
            cal_flyHour_date = calendarPlugFlyHourTimeLimitJ.transferToCalendarDate();
        }
        if (calendarTimeLimitJ != null) {
            cal_date = calendarTimeLimitJ.transferToCalendarDate();
        }
        if (flyCircleTimeLimitJ != null) {
            circle_date = flyCircleTimeLimitJ.transferToCalendarDate();
        }
        if (flyHourTimeLimitJ != null) {
            flyHour_date = flyHourTimeLimitJ.transferToCalendarDate();
        }
        
        // Comparing dates
        if (isIsFirstEffective()) {
            
        } else {

        }

        return next;
    }

    /**
     * @return the calendarPlugFlyCircleTimeLimitJ
     */
    public CalendarPlugFlyCircleTimeLimitJ getCalendarPlugFlyCircleTimeLimitJ() {
        return calendarPlugFlyCircleTimeLimitJ;
    }

    /**
     * @param calendarPlugFlyCircleTimeLimitJ the calendarPlugFlyCircleTimeLimitJ to set
     */
    public void setCalendarPlugFlyCircleTimeLimitJ(CalendarPlugFlyCircleTimeLimitJ calendarPlugFlyCircleTimeLimitJ) {
        this.calendarPlugFlyCircleTimeLimitJ = calendarPlugFlyCircleTimeLimitJ;
    }

    /**
     * @return the calendarPlugFlyHourTimeLimitJ
     */
    public CalendarPlugFlyHourTimeLimitJ getCalendarPlugFlyHourTimeLimitJ() {
        return calendarPlugFlyHourTimeLimitJ;
    }

    /**
     * @param calendarPlugFlyHourTimeLimitJ the calendarPlugFlyHourTimeLimitJ to set
     */
    public void setCalendarPlugFlyHourTimeLimitJ(CalendarPlugFlyHourTimeLimitJ calendarPlugFlyHourTimeLimitJ) {
        this.calendarPlugFlyHourTimeLimitJ = calendarPlugFlyHourTimeLimitJ;
    }

    /**
     * @return the calendarTimeLimitJ
     */
    public CalendarTimeLimitJ getCalendarTimeLimitJ() {
        return calendarTimeLimitJ;
    }

    /**
     * @param calendarTimeLimitJ the calendarTimeLimitJ to set
     */
    public void setCalendarTimeLimitJ(CalendarTimeLimitJ calendarTimeLimitJ) {
        this.calendarTimeLimitJ = calendarTimeLimitJ;
    }

    /**
     * @return the flyCircleTimeLimitJ
     */
    public FlyCircleTimeLimitJ getFlyCircleTimeLimitJ() {
        return flyCircleTimeLimitJ;
    }

    /**
     * @param flyCircleTimeLimitJ the flyCircleTimeLimitJ to set
     */
    public void setFlyCircleTimeLimitJ(FlyCircleTimeLimitJ flyCircleTimeLimitJ) {
        this.flyCircleTimeLimitJ = flyCircleTimeLimitJ;
    }

    /**
     * @return the flyHourTimeLimitJ
     */
    public FlyHourTimeLimitJ getFlyHourTimeLimitJ() {
        return flyHourTimeLimitJ;
    }

    /**
     * @param flyHourTimeLimitJ the flyHourTimeLimitJ to set
     */
    public void setFlyHourTimeLimitJ(FlyHourTimeLimitJ flyHourTimeLimitJ) {
        this.flyHourTimeLimitJ = flyHourTimeLimitJ;
    }

    /**
     * @return the usedFlag
     */
    public int getUsedFlag() {
        return usedFlag;
    }

    /**
     * @param usedFlag the usedFlag to set
     */
    public void setUsedFlag(int usedFlag) {
        this.usedFlag = usedFlag;
    }

    /**
     * Separate the TimeLimit into 5 types
     */
    public static enum TimeLimitType {
        CALENDAR,
        FLY_HOUR,
        FLY_CIRCLE,
        CALENDAR_PLUS_FLY_HOUR,
        CALENDAR_PLUS_FLY_CIRCLE
    }

    /**
     * Define the operations
     */
    public static enum OperationType {
        EQUAL("="),
        GREATER(">"),
        GREATER_EQUAL(">="),
        LESS("<"),
        LESS_EQUAL("<=");

        private String symbol;

        private OperationType(String symbol) {
            this.symbol = symbol;
        }

        public String getSymbol() {
            return symbol;
        }

        public static OperationType of(String symbol) {
            switch (symbol) {
                case "=":
                    return OperationType.EQUAL;
                case ">":
                    return OperationType.GREATER;
                case ">=":
                    return OperationType.GREATER_EQUAL;
                case "<":
                    return OperationType.LESS;
                case "<=":
                    return OperationType.LESS_EQUAL;
                default:
                    return null;
            }
        }
    }

    // ---- Below are the internal classes to definite each type of Transfer Scheduler
    private class CalendarPlugFlyCircleTimeLimitJ implements TransferToScheduler {

        private TimeLimitType timeLimitType;

        /**
         * 是否设置了日历日+飞行循环
         */
        private boolean isSetDayFC;

        /**
         * 起始日期（日历日+飞行循环）
         */
        private Date dayFCStart;

        /**
         * 最长可用飞行循环（是否设置了日历日+飞行循环）
         */
        private int dayFCLeft;

        public CalendarPlugFlyCircleTimeLimitJ() {
            this.timeLimitType = TimeLimitType.CALENDAR_PLUS_FLY_CIRCLE;
        }

        @Override
        public AbstractScheduledService.Scheduler transforToSchedule() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public TimeLimitType getTimeLimitJ() {
            return timeLimitType;
        }

        @Override
        public Date transferToCalendarDate() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private class CalendarPlugFlyHourTimeLimitJ implements TransferToScheduler {

        private TimeLimitType timeLimitType;

        /**
         * 是否设置了日历日+飞行小时期限
         */
        private boolean isSetDayFH;

        /**
         * 起始日期（日历日+飞行小时）
         */
        private Date dayFHStart;

        /**
         * 最长可用FH（是否设置了日历日+飞行小时）
         */
        private double dayFHLeft;

        public CalendarPlugFlyHourTimeLimitJ() {
            this.timeLimitType = TimeLimitType.CALENDAR_PLUS_FLY_HOUR;
        }

        @Override
        public AbstractScheduledService.Scheduler transforToSchedule() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public TimeLimitType getTimeLimitJ() {
            return timeLimitType;
        }

        @Override
        public Date transferToCalendarDate() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private class CalendarTimeLimitJ implements TransferToScheduler {

        private TimeLimitType timeLimitType;

        /**
         * 比较关系（小于、等于）
         */
        private String dayRelation;

        /**
         * 截止日期
         */
        private Date dayLimit;

        public CalendarTimeLimitJ() {
            timeLimitType = TimeLimitType.CALENDAR;
        }

        @Override
        public AbstractScheduledService.Scheduler transforToSchedule() {
            DateTime today = DateTime.now();
            DateTime aimDate = new DateTime(dayLimit);
            Period p = new Period(today,aimDate,PeriodType.days()); //目标时间于计算当天日期相减，得到一个天数
            int days = p.getDays(); // 提取天数
            return AbstractScheduledService.Scheduler.newFixedDelaySchedule(0, days, TimeUnit.DAYS);
        }

        @Override
        public TimeLimitType getTimeLimitJ() {
            return timeLimitType;
        }

        @Override
        public Date transferToCalendarDate() {
            return dayLimit;
        }
    }

    private class FlyCircleTimeLimitJ implements TransferToScheduler {

        private TimeLimitType timeLimitType;
        
        private final int ONE_DAY_CIRCLE = 2; //一天算2个飞行循环

        /**
         * 是否设置了FC期限 (FC:飞行循环)
         */
        private boolean isSetFC;

        /**
         * 关系符（小于、等于）
         */
        private String FCRelation;

        /**
         * 截止飞行循环
         */
        private int FCLimit;
        
        /**
         * 已经使用的飞行循环
         */
        private int usedFlyCircle = 0; 

        public FlyCircleTimeLimitJ() {
            this.timeLimitType = TimeLimitType.FLY_CIRCLE;
            this.usedFlyCircle = 0;
        }
        
        public FlyCircleTimeLimitJ(int usedFlyCircle) {
            this.timeLimitType = TimeLimitType.FLY_CIRCLE;
            this.usedFlyCircle = usedFlyCircle;
        }

        @Override
        public AbstractScheduledService.Scheduler transforToSchedule() {
            int restFlyCircle = FCLimit - usedFlyCircle;
            int days = restFlyCircle / TestDataSource.getCircleToDay();
            int rest_days = restFlyCircle % TestDataSource.getCircleToDay();
            if (rest_days > 0 ) days += 1; 
            return AbstractScheduledService.Scheduler.newFixedDelaySchedule(0, days, TimeUnit.DAYS); 
        }

        @Override
        public TimeLimitType getTimeLimitJ() {
            return timeLimitType;
        }

        @Override
        public Date transferToCalendarDate() {
            if (isSetFC){
                return null;
            }else {
                return null;
            }
        }
    }

    private class FlyHourTimeLimitJ implements TransferToScheduler {

        private TimeLimitType timeLimitType;

        /**
         * 是否设置了FH期限(FH: 飞行小时)
         */
        private boolean isSetFH;

        /**
         * 关系符（小于、等于）
         */
        private String FHRelation;

        /**
         * 截止飞行小时
         */
        private double FHLimit;

        public FlyHourTimeLimitJ() {
            this.timeLimitType = TimeLimitType.FLY_HOUR;
        }

        @Override
        public AbstractScheduledService.Scheduler transforToSchedule() {
            int restFlyHours = currentFlyHour - TestDataSource.getFlyHour();
            int days = restFlyHours / TestDataSource.getFlyHour();
            int rest_days = restFlyHours % TestDataSource.getFlyHour();
            if (rest_days > 0 ) days += 1; 
            return AbstractScheduledService.Scheduler.newFixedDelaySchedule(0, days, TimeUnit.DAYS);
        }

        @Override
        public TimeLimitType getTimeLimitJ() {
            return timeLimitType;
        }

        @Override
        public Date transferToCalendarDate() {
            if (isSetFH) {
                return null;
            }else {
                return null;
            }
        }

    }

    public static void main(String[] args) {
        OperationType equal = OperationType.EQUAL;
        System.out.println("equal -> " + equal.name());

        OperationType lessEqual = OperationType.of(">=");
        System.out.println("lessEqual name -> " + lessEqual.name());
    }

}
