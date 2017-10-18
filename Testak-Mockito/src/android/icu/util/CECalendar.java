/*    */ package android.icu.util;
/*    */ 
/*    */ import java.util.Date;
/*    */ import java.util.Locale;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ abstract class CECalendar
/*    */   extends Calendar
/*    */ {
/* 14 */   protected CECalendar() { throw new RuntimeException("Stub!"); }
/* 15 */   protected CECalendar(TimeZone zone) { throw new RuntimeException("Stub!"); }
/* 16 */   protected CECalendar(Locale aLocale) { throw new RuntimeException("Stub!"); }
/* 17 */   protected CECalendar(ULocale locale) { throw new RuntimeException("Stub!"); }
/* 18 */   protected CECalendar(TimeZone zone, Locale aLocale) { throw new RuntimeException("Stub!"); }
/* 19 */   protected CECalendar(TimeZone zone, ULocale locale) { throw new RuntimeException("Stub!"); }
/* 20 */   protected CECalendar(int year, int month, int date) { throw new RuntimeException("Stub!"); }
/* 21 */   protected CECalendar(Date date) { throw new RuntimeException("Stub!"); }
/* 22 */   protected CECalendar(int year, int month, int date, int hour, int minute, int second) { throw new RuntimeException("Stub!"); }
/* 23 */   protected int handleComputeMonthStart(int eyear, int emonth, boolean useMonth) { throw new RuntimeException("Stub!"); }
/* 24 */   protected int handleGetLimit(int field, int limitType) { throw new RuntimeException("Stub!"); }
/* 25 */   protected int handleGetMonthLength(int extendedYear, int month) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\icu\util\CECalendar.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */