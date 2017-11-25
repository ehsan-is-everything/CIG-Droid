/*    */ package android.icu.util;
/*    */ 
/*    */ import java.util.Locale;
/*    */ 
/*    */ public class GregorianCalendar
/*    */   extends Calendar
/*    */ {
/*    */   public static final int AD = 1;
/*    */   public static final int BC = 0;
/*    */   protected transient boolean invertGregorian;
/*    */   protected transient boolean isGregorian;
/*    */   
/* 13 */   public GregorianCalendar() { throw new RuntimeException("Stub!"); }
/* 14 */   public GregorianCalendar(TimeZone zone) { throw new RuntimeException("Stub!"); }
/* 15 */   public GregorianCalendar(Locale aLocale) { throw new RuntimeException("Stub!"); }
/* 16 */   public GregorianCalendar(ULocale locale) { throw new RuntimeException("Stub!"); }
/* 17 */   public GregorianCalendar(TimeZone zone, Locale aLocale) { throw new RuntimeException("Stub!"); }
/* 18 */   public GregorianCalendar(TimeZone zone, ULocale locale) { throw new RuntimeException("Stub!"); }
/* 19 */   public GregorianCalendar(int year, int month, int date) { throw new RuntimeException("Stub!"); }
/* 20 */   public GregorianCalendar(int year, int month, int date, int hour, int minute) { throw new RuntimeException("Stub!"); }
/* 21 */   public GregorianCalendar(int year, int month, int date, int hour, int minute, int second) { throw new RuntimeException("Stub!"); }
/* 22 */   protected int handleGetLimit(int field, int limitType) { throw new RuntimeException("Stub!"); }
/* 23 */   public void setGregorianChange(java.util.Date date) { throw new RuntimeException("Stub!"); }
/* 24 */   public final java.util.Date getGregorianChange() { throw new RuntimeException("Stub!"); }
/* 25 */   public boolean isLeapYear(int year) { throw new RuntimeException("Stub!"); }
/* 26 */   public boolean isEquivalentTo(Calendar other) { throw new RuntimeException("Stub!"); }
/* 27 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 28 */   public void roll(int field, int amount) { throw new RuntimeException("Stub!"); }
/* 29 */   public int getActualMinimum(int field) { throw new RuntimeException("Stub!"); }
/* 30 */   public int getActualMaximum(int field) { throw new RuntimeException("Stub!"); }
/* 31 */   protected int handleGetMonthLength(int extendedYear, int month) { throw new RuntimeException("Stub!"); }
/* 32 */   protected int handleGetYearLength(int eyear) { throw new RuntimeException("Stub!"); }
/* 33 */   protected void handleComputeFields(int julianDay) { throw new RuntimeException("Stub!"); }
/* 34 */   protected int handleGetExtendedYear() { throw new RuntimeException("Stub!"); }
/* 35 */   protected int handleComputeJulianDay(int bestField) { throw new RuntimeException("Stub!"); }
/* 36 */   protected int handleComputeMonthStart(int eyear, int month, boolean useMonth) { throw new RuntimeException("Stub!"); }
/* 37 */   public String getType() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\icu\util\GregorianCalendar.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */