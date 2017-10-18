/*    */ package java.util;
/*    */ 
/*    */ import java.time.ZonedDateTime;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class GregorianCalendar
/*    */   extends Calendar
/*    */ {
/*    */   public static final int AD = 1;
/*    */   public static final int BC = 0;
/*    */   
/* 44 */   public GregorianCalendar() { throw new RuntimeException("Stub!"); }
/* 45 */   public GregorianCalendar(TimeZone zone) { throw new RuntimeException("Stub!"); }
/* 46 */   public GregorianCalendar(Locale aLocale) { throw new RuntimeException("Stub!"); }
/* 47 */   public GregorianCalendar(TimeZone zone, Locale aLocale) { throw new RuntimeException("Stub!"); }
/* 48 */   public GregorianCalendar(int year, int month, int dayOfMonth) { throw new RuntimeException("Stub!"); }
/* 49 */   public GregorianCalendar(int year, int month, int dayOfMonth, int hourOfDay, int minute) { throw new RuntimeException("Stub!"); }
/* 50 */   public GregorianCalendar(int year, int month, int dayOfMonth, int hourOfDay, int minute, int second) { throw new RuntimeException("Stub!"); }
/* 51 */   public void setGregorianChange(Date date) { throw new RuntimeException("Stub!"); }
/* 52 */   public final Date getGregorianChange() { throw new RuntimeException("Stub!"); }
/* 53 */   public boolean isLeapYear(int year) { throw new RuntimeException("Stub!"); }
/* 54 */   public String getCalendarType() { throw new RuntimeException("Stub!"); }
/* 55 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 56 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 57 */   public void add(int field, int amount) { throw new RuntimeException("Stub!"); }
/* 58 */   public void roll(int field, boolean up) { throw new RuntimeException("Stub!"); }
/* 59 */   public void roll(int field, int amount) { throw new RuntimeException("Stub!"); }
/* 60 */   public int getMinimum(int field) { throw new RuntimeException("Stub!"); }
/* 61 */   public int getMaximum(int field) { throw new RuntimeException("Stub!"); }
/* 62 */   public int getGreatestMinimum(int field) { throw new RuntimeException("Stub!"); }
/* 63 */   public int getLeastMaximum(int field) { throw new RuntimeException("Stub!"); }
/* 64 */   public int getActualMinimum(int field) { throw new RuntimeException("Stub!"); }
/* 65 */   public int getActualMaximum(int field) { throw new RuntimeException("Stub!"); }
/* 66 */   public Object clone() { throw new RuntimeException("Stub!"); }
/* 67 */   public TimeZone getTimeZone() { throw new RuntimeException("Stub!"); }
/* 68 */   public void setTimeZone(TimeZone zone) { throw new RuntimeException("Stub!"); }
/* 69 */   public final boolean isWeekDateSupported() { throw new RuntimeException("Stub!"); }
/* 70 */   public int getWeekYear() { throw new RuntimeException("Stub!"); }
/* 71 */   public void setWeekDate(int weekYear, int weekOfYear, int dayOfWeek) { throw new RuntimeException("Stub!"); }
/* 72 */   public int getWeeksInWeekYear() { throw new RuntimeException("Stub!"); }
/* 73 */   protected void computeFields() { throw new RuntimeException("Stub!"); }
/* 74 */   protected void computeTime() { throw new RuntimeException("Stub!"); }
/* 75 */   public ZonedDateTime toZonedDateTime() { throw new RuntimeException("Stub!"); }
/* 76 */   public static GregorianCalendar from(ZonedDateTime zdt) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\GregorianCalendar.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */