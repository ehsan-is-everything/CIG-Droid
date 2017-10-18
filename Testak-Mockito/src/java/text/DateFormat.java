/*    */ package java.text;
/*    */ 
/*    */ import java.io.InvalidObjectException;
/*    */ import java.util.Calendar;
/*    */ import java.util.Date;
/*    */ import java.util.Locale;
/*    */ import java.util.TimeZone;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class DateFormat
/*    */   extends Format
/*    */ {
/*    */   public static final int AM_PM_FIELD = 14;
/*    */   public static final int DATE_FIELD = 3;
/*    */   public static final int DAY_OF_WEEK_FIELD = 9;
/*    */   public static final int DAY_OF_WEEK_IN_MONTH_FIELD = 11;
/*    */   public static final int DAY_OF_YEAR_FIELD = 10;
/*    */   public static final int DEFAULT = 2;
/*    */   public static final int ERA_FIELD = 0;
/*    */   public static final int FULL = 0;
/*    */   public static final int HOUR0_FIELD = 16;
/*    */   public static final int HOUR1_FIELD = 15;
/*    */   public static final int HOUR_OF_DAY0_FIELD = 5;
/*    */   public static final int HOUR_OF_DAY1_FIELD = 4;
/*    */   public static final int LONG = 1;
/*    */   public static final int MEDIUM = 2;
/*    */   public static final int MILLISECOND_FIELD = 8;
/*    */   public static final int MINUTE_FIELD = 6;
/*    */   public static final int MONTH_FIELD = 2;
/*    */   public static final int SECOND_FIELD = 7;
/*    */   public static final int SHORT = 3;
/*    */   public static final int TIMEZONE_FIELD = 17;
/*    */   public static final int WEEK_OF_MONTH_FIELD = 13;
/*    */   public static final int WEEK_OF_YEAR_FIELD = 12;
/*    */   public static final int YEAR_FIELD = 1;
/*    */   protected Calendar calendar;
/*    */   protected NumberFormat numberFormat;
/*    */   
/*    */   public static class Field
/*    */     extends Format.Field
/*    */   {
/*    */     protected Field(String name, int calendarField)
/*    */     {
/* 47 */       super();throw new RuntimeException("Stub!"); }
/* 48 */     public static Field ofCalendarField(int calendarField) { throw new RuntimeException("Stub!"); }
/* 49 */     public int getCalendarField() { throw new RuntimeException("Stub!"); }
/* 50 */     protected Object readResolve() throws InvalidObjectException { throw new RuntimeException("Stub!"); }
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
/* 69 */     public static final Field YEAR = null; public static final Field WEEK_OF_YEAR = null; public static final Field WEEK_OF_MONTH = null; public static final Field TIME_ZONE = null; public static final Field SECOND = null; public static final Field MONTH = null; public static final Field MINUTE = null; public static final Field MILLISECOND = null; public static final Field HOUR_OF_DAY1 = null; public static final Field HOUR_OF_DAY0 = null; public static final Field HOUR1 = null; public static final Field HOUR0 = null; public static final Field ERA = null; public static final Field DAY_OF_YEAR = null; public static final Field DAY_OF_WEEK_IN_MONTH = null; public static final Field DAY_OF_WEEK = null; public static final Field DAY_OF_MONTH = null; public static final Field AM_PM = null; }
/*    */   
/* 71 */   protected DateFormat() { throw new RuntimeException("Stub!"); }
/* 72 */   public final StringBuffer format(Object obj, StringBuffer toAppendTo, FieldPosition fieldPosition) { throw new RuntimeException("Stub!"); }
/*    */   public abstract StringBuffer format(Date paramDate, StringBuffer paramStringBuffer, FieldPosition paramFieldPosition);
/* 74 */   public final String format(Date date) { throw new RuntimeException("Stub!"); }
/* 75 */   public Date parse(String source) throws ParseException { throw new RuntimeException("Stub!"); }
/*    */   public abstract Date parse(String paramString, ParsePosition paramParsePosition);
/* 77 */   public Object parseObject(String source, ParsePosition pos) { throw new RuntimeException("Stub!"); }
/* 78 */   public static final DateFormat getTimeInstance() { throw new RuntimeException("Stub!"); }
/* 79 */   public static final DateFormat getTimeInstance(int style) { throw new RuntimeException("Stub!"); }
/* 80 */   public static final DateFormat getTimeInstance(int style, Locale aLocale) { throw new RuntimeException("Stub!"); }
/* 81 */   public static final DateFormat getDateInstance() { throw new RuntimeException("Stub!"); }
/* 82 */   public static final DateFormat getDateInstance(int style) { throw new RuntimeException("Stub!"); }
/* 83 */   public static final DateFormat getDateInstance(int style, Locale aLocale) { throw new RuntimeException("Stub!"); }
/* 84 */   public static final DateFormat getDateTimeInstance() { throw new RuntimeException("Stub!"); }
/* 85 */   public static final DateFormat getDateTimeInstance(int dateStyle, int timeStyle) { throw new RuntimeException("Stub!"); }
/* 86 */   public static final DateFormat getDateTimeInstance(int dateStyle, int timeStyle, Locale aLocale) { throw new RuntimeException("Stub!"); }
/* 87 */   public static final DateFormat getInstance() { throw new RuntimeException("Stub!"); }
/* 88 */   public static Locale[] getAvailableLocales() { throw new RuntimeException("Stub!"); }
/* 89 */   public void setCalendar(Calendar newCalendar) { throw new RuntimeException("Stub!"); }
/* 90 */   public Calendar getCalendar() { throw new RuntimeException("Stub!"); }
/* 91 */   public void setNumberFormat(NumberFormat newNumberFormat) { throw new RuntimeException("Stub!"); }
/* 92 */   public NumberFormat getNumberFormat() { throw new RuntimeException("Stub!"); }
/* 93 */   public void setTimeZone(TimeZone zone) { throw new RuntimeException("Stub!"); }
/* 94 */   public TimeZone getTimeZone() { throw new RuntimeException("Stub!"); }
/* 95 */   public void setLenient(boolean lenient) { throw new RuntimeException("Stub!"); }
/* 96 */   public boolean isLenient() { throw new RuntimeException("Stub!"); }
/* 97 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 98 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 99 */   public Object clone() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\text\DateFormat.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */