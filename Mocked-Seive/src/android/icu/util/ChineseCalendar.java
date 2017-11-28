/*    */ package android.icu.util;
/*    */ 
/*    */ import android.icu.text.DateFormat;
/*    */ import java.util.Date;
/*    */ import java.util.Locale;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ChineseCalendar
/*    */   extends Calendar
/*    */ {
/* 14 */   public ChineseCalendar() { throw new RuntimeException("Stub!"); }
/* 15 */   public ChineseCalendar(Date date) { throw new RuntimeException("Stub!"); }
/* 16 */   public ChineseCalendar(int year, int month, int isLeapMonth, int date) { throw new RuntimeException("Stub!"); }
/* 17 */   public ChineseCalendar(int year, int month, int isLeapMonth, int date, int hour, int minute, int second) { throw new RuntimeException("Stub!"); }
/* 18 */   public ChineseCalendar(int era, int year, int month, int isLeapMonth, int date) { throw new RuntimeException("Stub!"); }
/* 19 */   public ChineseCalendar(int era, int year, int month, int isLeapMonth, int date, int hour, int minute, int second) { throw new RuntimeException("Stub!"); }
/* 20 */   public ChineseCalendar(Locale aLocale) { throw new RuntimeException("Stub!"); }
/* 21 */   public ChineseCalendar(TimeZone zone) { throw new RuntimeException("Stub!"); }
/* 22 */   public ChineseCalendar(TimeZone zone, Locale aLocale) { throw new RuntimeException("Stub!"); }
/* 23 */   public ChineseCalendar(ULocale locale) { throw new RuntimeException("Stub!"); }
/* 24 */   public ChineseCalendar(TimeZone zone, ULocale locale) { throw new RuntimeException("Stub!"); }
/* 25 */   protected int handleGetLimit(int field, int limitType) { throw new RuntimeException("Stub!"); }
/* 26 */   protected int handleGetExtendedYear() { throw new RuntimeException("Stub!"); }
/* 27 */   protected int handleGetMonthLength(int extendedYear, int month) { throw new RuntimeException("Stub!"); }
/* 28 */   protected DateFormat handleGetDateFormat(String pattern, String override, ULocale locale) { throw new RuntimeException("Stub!"); }
/* 29 */   protected int[][][] getFieldResolutionTable() { throw new RuntimeException("Stub!"); }
/* 30 */   public void add(int field, int amount) { throw new RuntimeException("Stub!"); }
/* 31 */   public void roll(int field, int amount) { throw new RuntimeException("Stub!"); }
/* 32 */   protected void handleComputeFields(int julianDay) { throw new RuntimeException("Stub!"); }
/* 33 */   protected int handleComputeMonthStart(int eyear, int month, boolean useMonth) { throw new RuntimeException("Stub!"); }
/* 34 */   public String getType() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\icu\util\ChineseCalendar.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */