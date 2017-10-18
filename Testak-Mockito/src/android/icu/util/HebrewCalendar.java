/*    */ package android.icu.util;
/*    */ 
/*    */ import java.util.Locale;
/*    */ 
/*    */ public class HebrewCalendar
/*    */   extends Calendar {
/*    */   public static final int ADAR = 6;
/*    */   public static final int ADAR_1 = 5;
/*    */   public static final int AV = 11;
/*    */   public static final int ELUL = 12;
/*    */   public static final int HESHVAN = 1;
/*    */   public static final int IYAR = 8;
/*    */   
/* 14 */   public HebrewCalendar() { throw new RuntimeException("Stub!"); }
/* 15 */   public HebrewCalendar(TimeZone zone) { throw new RuntimeException("Stub!"); }
/* 16 */   public HebrewCalendar(Locale aLocale) { throw new RuntimeException("Stub!"); }
/* 17 */   public HebrewCalendar(ULocale locale) { throw new RuntimeException("Stub!"); }
/* 18 */   public HebrewCalendar(TimeZone zone, Locale aLocale) { throw new RuntimeException("Stub!"); }
/* 19 */   public HebrewCalendar(TimeZone zone, ULocale locale) { throw new RuntimeException("Stub!"); }
/* 20 */   public HebrewCalendar(int year, int month, int date) { throw new RuntimeException("Stub!"); }
/* 21 */   public HebrewCalendar(java.util.Date date) { throw new RuntimeException("Stub!"); }
/* 22 */   public HebrewCalendar(int year, int month, int date, int hour, int minute, int second) { throw new RuntimeException("Stub!"); }
/* 23 */   public void add(int field, int amount) { throw new RuntimeException("Stub!"); }
/* 24 */   public void roll(int field, int amount) { throw new RuntimeException("Stub!"); }
/* 25 */   protected int handleGetLimit(int field, int limitType) { throw new RuntimeException("Stub!"); }
/* 26 */   protected int handleGetMonthLength(int extendedYear, int month) { throw new RuntimeException("Stub!"); }
/* 27 */   protected int handleGetYearLength(int eyear) { throw new RuntimeException("Stub!"); }
/* 28 */   protected void handleComputeFields(int julianDay) { throw new RuntimeException("Stub!"); }
/* 29 */   protected int handleGetExtendedYear() { throw new RuntimeException("Stub!"); }
/* 30 */   protected int handleComputeMonthStart(int eyear, int month, boolean useMonth) { throw new RuntimeException("Stub!"); }
/* 31 */   public String getType() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static final int KISLEV = 2;
/*    */   public static final int NISAN = 7;
/*    */   public static final int SHEVAT = 4;
/*    */   public static final int SIVAN = 9;
/*    */   public static final int TAMUZ = 10;
/*    */   public static final int TEVET = 3;
/*    */   public static final int TISHRI = 0;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\icu\util\HebrewCalendar.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */