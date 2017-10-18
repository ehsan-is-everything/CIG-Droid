/*    */ package android.text.format;
/*    */ 
/*    */ @Deprecated
/*    */ public class Time {
/*    */   public static final int EPOCH_JULIAN_DAY = 2440588;
/*    */   public static final int FRIDAY = 5;
/*    */   public static final int HOUR = 3;
/*    */   public static final int MINUTE = 2;
/*    */   public static final int MONDAY = 1;
/*    */   public static final int MONDAY_BEFORE_JULIAN_EPOCH = 2440585;
/*    */   public static final int MONTH = 5;
/*    */   public static final int MONTH_DAY = 4;
/*    */   public static final int SATURDAY = 6;
/*    */   public static final int SECOND = 1;
/*    */   public static final int SUNDAY = 0;
/*    */   public static final int THURSDAY = 4;
/*    */   public static final String TIMEZONE_UTC = "UTC";
/*    */   public static final int TUESDAY = 2;
/*    */   public static final int WEDNESDAY = 3;
/*    */   
/* 21 */   public Time(String timezoneId) { throw new RuntimeException("Stub!"); }
/* 22 */   public Time() { throw new RuntimeException("Stub!"); }
/* 23 */   public Time(Time other) { throw new RuntimeException("Stub!"); }
/* 24 */   public long normalize(boolean ignoreDst) { throw new RuntimeException("Stub!"); }
/* 25 */   public void switchTimezone(String timezone) { throw new RuntimeException("Stub!"); }
/* 26 */   public int getActualMaximum(int field) { throw new RuntimeException("Stub!"); }
/* 27 */   public void clear(String timezoneId) { throw new RuntimeException("Stub!"); }
/* 28 */   public static int compare(Time a, Time b) { throw new RuntimeException("Stub!"); }
/* 29 */   public String format(String format) { throw new RuntimeException("Stub!"); }
/* 30 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 31 */   public boolean parse(String s) { throw new RuntimeException("Stub!"); }
/* 32 */   public boolean parse3339(String s) { throw new RuntimeException("Stub!"); }
/* 33 */   public static String getCurrentTimezone() { throw new RuntimeException("Stub!"); }
/* 34 */   public void setToNow() { throw new RuntimeException("Stub!"); }
/* 35 */   public long toMillis(boolean ignoreDst) { throw new RuntimeException("Stub!"); }
/* 36 */   public void set(long millis) { throw new RuntimeException("Stub!"); }
/* 37 */   public String format2445() { throw new RuntimeException("Stub!"); }
/* 38 */   public void set(Time that) { throw new RuntimeException("Stub!"); }
/* 39 */   public void set(int second, int minute, int hour, int monthDay, int month, int year) { throw new RuntimeException("Stub!"); }
/* 40 */   public void set(int monthDay, int month, int year) { throw new RuntimeException("Stub!"); }
/* 41 */   public boolean before(Time that) { throw new RuntimeException("Stub!"); }
/* 42 */   public boolean after(Time that) { throw new RuntimeException("Stub!"); }
/* 43 */   public int getWeekNumber() { throw new RuntimeException("Stub!"); }
/* 44 */   public String format3339(boolean allDay) { throw new RuntimeException("Stub!"); }
/* 45 */   public static boolean isEpoch(Time time) { throw new RuntimeException("Stub!"); }
/* 46 */   public static int getJulianDay(long millis, long gmtoff) { throw new RuntimeException("Stub!"); }
/* 47 */   public long setJulianDay(int julianDay) { throw new RuntimeException("Stub!"); }
/* 48 */   public static int getWeeksSinceEpochFromJulianDay(int julianDay, int firstDayOfWeek) { throw new RuntimeException("Stub!"); }
/* 49 */   public static int getJulianMondayFromWeeksSinceEpoch(int week) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static final int WEEK_DAY = 7;
/*    */   public static final int WEEK_NUM = 9;
/*    */   public static final int YEAR = 6;
/*    */   public static final int YEAR_DAY = 8;
/*    */   public boolean allDay;
/*    */   public long gmtoff;
/*    */   public int hour;
/*    */   public int isDst;
/*    */   public int minute;
/*    */   public int month;
/*    */   public int monthDay;
/*    */   public int second;
/*    */   public String timezone;
/*    */   public int weekDay;
/*    */   public int year;
/*    */   public int yearDay;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\text\format\Time.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */