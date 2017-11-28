/*    */ package java.util;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SimpleTimeZone
/*    */   extends TimeZone
/*    */ {
/*    */   public static final int STANDARD_TIME = 1;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public static final int UTC_TIME = 2;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public static final int WALL_TIME = 0;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 43 */   public SimpleTimeZone(int rawOffset, String ID) { throw new RuntimeException("Stub!"); }
/* 44 */   public SimpleTimeZone(int rawOffset, String ID, int startMonth, int startDay, int startDayOfWeek, int startTime, int endMonth, int endDay, int endDayOfWeek, int endTime) { throw new RuntimeException("Stub!"); }
/* 45 */   public SimpleTimeZone(int rawOffset, String ID, int startMonth, int startDay, int startDayOfWeek, int startTime, int endMonth, int endDay, int endDayOfWeek, int endTime, int dstSavings) { throw new RuntimeException("Stub!"); }
/* 46 */   public SimpleTimeZone(int rawOffset, String ID, int startMonth, int startDay, int startDayOfWeek, int startTime, int startTimeMode, int endMonth, int endDay, int endDayOfWeek, int endTime, int endTimeMode, int dstSavings) { throw new RuntimeException("Stub!"); }
/* 47 */   public void setStartYear(int year) { throw new RuntimeException("Stub!"); }
/* 48 */   public void setStartRule(int startMonth, int startDay, int startDayOfWeek, int startTime) { throw new RuntimeException("Stub!"); }
/* 49 */   public void setStartRule(int startMonth, int startDay, int startTime) { throw new RuntimeException("Stub!"); }
/* 50 */   public void setStartRule(int startMonth, int startDay, int startDayOfWeek, int startTime, boolean after) { throw new RuntimeException("Stub!"); }
/* 51 */   public void setEndRule(int endMonth, int endDay, int endDayOfWeek, int endTime) { throw new RuntimeException("Stub!"); }
/* 52 */   public void setEndRule(int endMonth, int endDay, int endTime) { throw new RuntimeException("Stub!"); }
/* 53 */   public void setEndRule(int endMonth, int endDay, int endDayOfWeek, int endTime, boolean after) { throw new RuntimeException("Stub!"); }
/* 54 */   public int getOffset(long date) { throw new RuntimeException("Stub!"); }
/* 55 */   public int getOffset(int era, int year, int month, int day, int dayOfWeek, int millis) { throw new RuntimeException("Stub!"); }
/* 56 */   public int getRawOffset() { throw new RuntimeException("Stub!"); }
/* 57 */   public void setRawOffset(int offsetMillis) { throw new RuntimeException("Stub!"); }
/* 58 */   public void setDSTSavings(int millisSavedDuringDST) { throw new RuntimeException("Stub!"); }
/* 59 */   public int getDSTSavings() { throw new RuntimeException("Stub!"); }
/* 60 */   public boolean useDaylightTime() { throw new RuntimeException("Stub!"); }
/* 61 */   public boolean observesDaylightTime() { throw new RuntimeException("Stub!"); }
/* 62 */   public boolean inDaylightTime(Date date) { throw new RuntimeException("Stub!"); }
/* 63 */   public Object clone() { throw new RuntimeException("Stub!"); }
/* 64 */   public synchronized int hashCode() { throw new RuntimeException("Stub!"); }
/* 65 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 66 */   public boolean hasSameRules(TimeZone other) { throw new RuntimeException("Stub!"); }
/* 67 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\util\SimpleTimeZone.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */