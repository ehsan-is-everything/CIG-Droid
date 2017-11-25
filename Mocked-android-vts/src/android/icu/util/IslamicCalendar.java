/*    */ package android.icu.util;
/*    */ 
/*    */ import java.util.Locale;
/*    */ 
/*    */ public class IslamicCalendar extends Calendar
/*    */ {
/*    */   public static final int DHU_AL_HIJJAH = 11;
/*    */   public static final int DHU_AL_QIDAH = 10;
/*    */   public static final int JUMADA_1 = 4;
/*    */   public static final int JUMADA_2 = 5;
/*    */   public static final int MUHARRAM = 0;
/*    */   public static final int RABI_1 = 2;
/*    */   
/*    */   public static enum CalculationType
/*    */   {
/* 16 */     ISLAMIC, 
/* 17 */     ISLAMIC_CIVIL, 
/* 18 */     ISLAMIC_TBLA, 
/* 19 */     ISLAMIC_UMALQURA;
/*    */     private CalculationType() {} }
/* 21 */   public IslamicCalendar() { throw new RuntimeException("Stub!"); }
/* 22 */   public IslamicCalendar(TimeZone zone) { throw new RuntimeException("Stub!"); }
/* 23 */   public IslamicCalendar(Locale aLocale) { throw new RuntimeException("Stub!"); }
/* 24 */   public IslamicCalendar(ULocale locale) { throw new RuntimeException("Stub!"); }
/* 25 */   public IslamicCalendar(TimeZone zone, Locale aLocale) { throw new RuntimeException("Stub!"); }
/* 26 */   public IslamicCalendar(TimeZone zone, ULocale locale) { throw new RuntimeException("Stub!"); }
/* 27 */   public IslamicCalendar(java.util.Date date) { throw new RuntimeException("Stub!"); }
/* 28 */   public IslamicCalendar(int year, int month, int date) { throw new RuntimeException("Stub!"); }
/* 29 */   public IslamicCalendar(int year, int month, int date, int hour, int minute, int second) { throw new RuntimeException("Stub!"); }
/* 30 */   protected int handleGetLimit(int field, int limitType) { throw new RuntimeException("Stub!"); }
/* 31 */   protected int handleGetMonthLength(int extendedYear, int month) { throw new RuntimeException("Stub!"); }
/* 32 */   protected int handleGetYearLength(int extendedYear) { throw new RuntimeException("Stub!"); }
/* 33 */   protected int handleComputeMonthStart(int eyear, int month, boolean useMonth) { throw new RuntimeException("Stub!"); }
/* 34 */   protected int handleGetExtendedYear() { throw new RuntimeException("Stub!"); }
/* 35 */   protected void handleComputeFields(int julianDay) { throw new RuntimeException("Stub!"); }
/* 36 */   public void setCalculationType(CalculationType type) { throw new RuntimeException("Stub!"); }
/* 37 */   public CalculationType getCalculationType() { throw new RuntimeException("Stub!"); }
/* 38 */   public String getType() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static final int RABI_2 = 3;
/*    */   public static final int RAJAB = 6;
/*    */   public static final int RAMADAN = 8;
/*    */   public static final int SAFAR = 1;
/*    */   public static final int SHABAN = 7;
/*    */   public static final int SHAWWAL = 9;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\icu\util\IslamicCalendar.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */