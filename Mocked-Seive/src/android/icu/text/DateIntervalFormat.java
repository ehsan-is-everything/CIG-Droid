/*    */ package android.icu.text;
/*    */ 
/*    */ import android.icu.util.Calendar;
/*    */ import android.icu.util.TimeZone;
/*    */ import android.icu.util.ULocale;
/*    */ import java.text.FieldPosition;
/*    */ import java.util.Locale;
/*    */ 
/*    */ 
/*    */ public class DateIntervalFormat
/*    */   extends UFormat
/*    */ {
/* 13 */   DateIntervalFormat() { throw new RuntimeException("Stub!"); }
/* 14 */   public static final DateIntervalFormat getInstance(String skeleton) { throw new RuntimeException("Stub!"); }
/* 15 */   public static final DateIntervalFormat getInstance(String skeleton, Locale locale) { throw new RuntimeException("Stub!"); }
/* 16 */   public static final DateIntervalFormat getInstance(String skeleton, ULocale locale) { throw new RuntimeException("Stub!"); }
/* 17 */   public static final DateIntervalFormat getInstance(String skeleton, DateIntervalInfo dtitvinf) { throw new RuntimeException("Stub!"); }
/* 18 */   public static final DateIntervalFormat getInstance(String skeleton, Locale locale, DateIntervalInfo dtitvinf) { throw new RuntimeException("Stub!"); }
/* 19 */   public static final DateIntervalFormat getInstance(String skeleton, ULocale locale, DateIntervalInfo dtitvinf) { throw new RuntimeException("Stub!"); }
/* 20 */   public synchronized Object clone() { throw new RuntimeException("Stub!"); }
/* 21 */   public final StringBuffer format(Object obj, StringBuffer appendTo, FieldPosition fieldPosition) { throw new RuntimeException("Stub!"); }
/* 22 */   public final synchronized StringBuffer format(android.icu.util.DateInterval dtInterval, StringBuffer appendTo, FieldPosition fieldPosition) { throw new RuntimeException("Stub!"); }
/* 23 */   public final synchronized StringBuffer format(Calendar fromCalendar, Calendar toCalendar, StringBuffer appendTo, FieldPosition pos) { throw new RuntimeException("Stub!"); }
/* 24 */   public DateIntervalInfo getDateIntervalInfo() { throw new RuntimeException("Stub!"); }
/* 25 */   public void setDateIntervalInfo(DateIntervalInfo newItvPattern) { throw new RuntimeException("Stub!"); }
/* 26 */   public TimeZone getTimeZone() { throw new RuntimeException("Stub!"); }
/* 27 */   public void setTimeZone(TimeZone zone) { throw new RuntimeException("Stub!"); }
/* 28 */   public synchronized DateFormat getDateFormat() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 30 */   public Object parseObject(String source, java.text.ParsePosition parse_pos) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\icu\text\DateIntervalFormat.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */