/*     */ package android.icu.text;
/*     */ 
/*     */ import android.icu.util.Calendar;
/*     */ 
/*     */ public abstract class DateFormat extends UFormat
/*     */ {
/*     */   public static final String ABBR_GENERIC_TZ = "v";
/*     */   public static final String ABBR_MONTH = "MMM";
/*     */   public static final String ABBR_MONTH_DAY = "MMMd";
/*     */   public static final String ABBR_MONTH_WEEKDAY_DAY = "MMMEd";
/*     */   public static final String ABBR_QUARTER = "QQQ";
/*     */   
/*     */   public static enum BooleanAttribute
/*     */   {
/*  15 */     PARSE_ALLOW_NUMERIC, 
/*  16 */     PARSE_ALLOW_WHITESPACE, 
/*  17 */     PARSE_MULTIPLE_PATTERNS_FOR_MATCH, 
/*  18 */     PARSE_PARTIAL_LITERAL_MATCH;
/*     */     
/*     */     private BooleanAttribute() {} }
/*     */   
/*     */   public static final String ABBR_SPECIFIC_TZ = "z"; public static final String ABBR_UTC_TZ = "ZZZZ"; public static final String ABBR_WEEKDAY = "E"; public static final int AM_PM_FIELD = 14; public static final int DATE_FIELD = 3; public static final String DAY = "d"; public static final int DAY_OF_WEEK_FIELD = 9;
/*  23 */   public static class Field extends java.text.Format.Field { protected Field(String name, int calendarField) { super();throw new RuntimeException("Stub!"); }
/*  24 */     public static Field ofCalendarField(int calendarField) { throw new RuntimeException("Stub!"); }
/*  25 */     public int getCalendarField() { throw new RuntimeException("Stub!"); }
/*  26 */     protected Object readResolve() throws java.io.InvalidObjectException { throw new RuntimeException("Stub!"); }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  51 */     public static final Field YEAR_WOY = null; public static final Field YEAR = null; public static final Field WEEK_OF_YEAR = null; public static final Field WEEK_OF_MONTH = null; public static final Field TIME_ZONE = null; public static final Field SECOND = null; public static final Field QUARTER = null; public static final Field MONTH = null; public static final Field MINUTE = null; public static final Field MILLISECONDS_IN_DAY = null; public static final Field MILLISECOND = null; public static final Field JULIAN_DAY = null; public static final Field HOUR_OF_DAY1 = null; public static final Field HOUR_OF_DAY0 = null; public static final Field HOUR1 = null; public static final Field HOUR0 = null; public static final Field EXTENDED_YEAR = null; public static final Field ERA = null; public static final Field DOW_LOCAL = null; public static final Field DAY_OF_YEAR = null; public static final Field DAY_OF_WEEK_IN_MONTH = null; public static final Field DAY_OF_WEEK = null; public static final Field DAY_OF_MONTH = null; public static final Field AM_PM = null; }
/*     */   public static final int DAY_OF_WEEK_IN_MONTH_FIELD = 11;
/*  53 */   protected DateFormat() { throw new RuntimeException("Stub!"); }
/*  54 */   public final StringBuffer format(Object obj, StringBuffer toAppendTo, java.text.FieldPosition fieldPosition) { throw new RuntimeException("Stub!"); }
/*     */   public abstract StringBuffer format(Calendar paramCalendar, StringBuffer paramStringBuffer, java.text.FieldPosition paramFieldPosition);
/*  56 */   public StringBuffer format(java.util.Date date, StringBuffer toAppendTo, java.text.FieldPosition fieldPosition) { throw new RuntimeException("Stub!"); }
/*  57 */   public final String format(java.util.Date date) { throw new RuntimeException("Stub!"); }
/*  58 */   public java.util.Date parse(String text) throws java.text.ParseException { throw new RuntimeException("Stub!"); }
/*     */   public abstract void parse(String paramString, Calendar paramCalendar, java.text.ParsePosition paramParsePosition);
/*  60 */   public java.util.Date parse(String text, java.text.ParsePosition pos) { throw new RuntimeException("Stub!"); }
/*  61 */   public Object parseObject(String source, java.text.ParsePosition pos) { throw new RuntimeException("Stub!"); }
/*  62 */   public static final DateFormat getTimeInstance() { throw new RuntimeException("Stub!"); }
/*  63 */   public static final DateFormat getTimeInstance(int style) { throw new RuntimeException("Stub!"); }
/*  64 */   public static final DateFormat getTimeInstance(int style, java.util.Locale aLocale) { throw new RuntimeException("Stub!"); }
/*  65 */   public static final DateFormat getTimeInstance(int style, android.icu.util.ULocale locale) { throw new RuntimeException("Stub!"); }
/*  66 */   public static final DateFormat getDateInstance() { throw new RuntimeException("Stub!"); }
/*  67 */   public static final DateFormat getDateInstance(int style) { throw new RuntimeException("Stub!"); }
/*  68 */   public static final DateFormat getDateInstance(int style, java.util.Locale aLocale) { throw new RuntimeException("Stub!"); }
/*  69 */   public static final DateFormat getDateInstance(int style, android.icu.util.ULocale locale) { throw new RuntimeException("Stub!"); }
/*  70 */   public static final DateFormat getDateTimeInstance() { throw new RuntimeException("Stub!"); }
/*  71 */   public static final DateFormat getDateTimeInstance(int dateStyle, int timeStyle) { throw new RuntimeException("Stub!"); }
/*  72 */   public static final DateFormat getDateTimeInstance(int dateStyle, int timeStyle, java.util.Locale aLocale) { throw new RuntimeException("Stub!"); }
/*  73 */   public static final DateFormat getDateTimeInstance(int dateStyle, int timeStyle, android.icu.util.ULocale locale) { throw new RuntimeException("Stub!"); }
/*  74 */   public static final DateFormat getInstance() { throw new RuntimeException("Stub!"); }
/*  75 */   public static java.util.Locale[] getAvailableLocales() { throw new RuntimeException("Stub!"); }
/*  76 */   public void setCalendar(Calendar newCalendar) { throw new RuntimeException("Stub!"); }
/*  77 */   public Calendar getCalendar() { throw new RuntimeException("Stub!"); }
/*  78 */   public void setNumberFormat(NumberFormat newNumberFormat) { throw new RuntimeException("Stub!"); }
/*  79 */   public NumberFormat getNumberFormat() { throw new RuntimeException("Stub!"); }
/*  80 */   public void setTimeZone(android.icu.util.TimeZone zone) { throw new RuntimeException("Stub!"); }
/*  81 */   public android.icu.util.TimeZone getTimeZone() { throw new RuntimeException("Stub!"); }
/*  82 */   public void setLenient(boolean lenient) { throw new RuntimeException("Stub!"); }
/*  83 */   public boolean isLenient() { throw new RuntimeException("Stub!"); }
/*  84 */   public void setCalendarLenient(boolean lenient) { throw new RuntimeException("Stub!"); }
/*  85 */   public boolean isCalendarLenient() { throw new RuntimeException("Stub!"); }
/*  86 */   public DateFormat setBooleanAttribute(BooleanAttribute key, boolean value) { throw new RuntimeException("Stub!"); }
/*  87 */   public boolean getBooleanAttribute(BooleanAttribute key) { throw new RuntimeException("Stub!"); }
/*  88 */   public void setContext(DisplayContext context) { throw new RuntimeException("Stub!"); }
/*  89 */   public DisplayContext getContext(DisplayContext.Type type) { throw new RuntimeException("Stub!"); }
/*  90 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/*  91 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/*  92 */   public Object clone() { throw new RuntimeException("Stub!"); }
/*  93 */   public static final DateFormat getDateInstance(Calendar cal, int dateStyle, java.util.Locale locale) { throw new RuntimeException("Stub!"); }
/*  94 */   public static final DateFormat getDateInstance(Calendar cal, int dateStyle, android.icu.util.ULocale locale) { throw new RuntimeException("Stub!"); }
/*  95 */   public static final DateFormat getTimeInstance(Calendar cal, int timeStyle, java.util.Locale locale) { throw new RuntimeException("Stub!"); }
/*  96 */   public static final DateFormat getTimeInstance(Calendar cal, int timeStyle, android.icu.util.ULocale locale) { throw new RuntimeException("Stub!"); }
/*  97 */   public static final DateFormat getDateTimeInstance(Calendar cal, int dateStyle, int timeStyle, java.util.Locale locale) { throw new RuntimeException("Stub!"); }
/*  98 */   public static final DateFormat getDateTimeInstance(Calendar cal, int dateStyle, int timeStyle, android.icu.util.ULocale locale) { throw new RuntimeException("Stub!"); }
/*  99 */   public static final DateFormat getInstance(Calendar cal, java.util.Locale locale) { throw new RuntimeException("Stub!"); }
/* 100 */   public static final DateFormat getInstance(Calendar cal) { throw new RuntimeException("Stub!"); }
/* 101 */   public static final DateFormat getDateInstance(Calendar cal, int dateStyle) { throw new RuntimeException("Stub!"); }
/* 102 */   public static final DateFormat getTimeInstance(Calendar cal, int timeStyle) { throw new RuntimeException("Stub!"); }
/* 103 */   public static final DateFormat getDateTimeInstance(Calendar cal, int dateStyle, int timeStyle) { throw new RuntimeException("Stub!"); }
/* 104 */   public static final DateFormat getInstanceForSkeleton(String skeleton) { throw new RuntimeException("Stub!"); }
/* 105 */   public static final DateFormat getInstanceForSkeleton(String skeleton, java.util.Locale locale) { throw new RuntimeException("Stub!"); }
/* 106 */   public static final DateFormat getInstanceForSkeleton(String skeleton, android.icu.util.ULocale locale) { throw new RuntimeException("Stub!"); }
/* 107 */   public static final DateFormat getInstanceForSkeleton(Calendar cal, String skeleton, java.util.Locale locale) { throw new RuntimeException("Stub!"); }
/* 108 */   public static final DateFormat getInstanceForSkeleton(Calendar cal, String skeleton, android.icu.util.ULocale locale) { throw new RuntimeException("Stub!"); }
/* 109 */   public static final DateFormat getPatternInstance(String skeleton) { throw new RuntimeException("Stub!"); }
/* 110 */   public static final DateFormat getPatternInstance(String skeleton, java.util.Locale locale) { throw new RuntimeException("Stub!"); }
/* 111 */   public static final DateFormat getPatternInstance(String skeleton, android.icu.util.ULocale locale) { throw new RuntimeException("Stub!"); }
/* 112 */   public static final DateFormat getPatternInstance(Calendar cal, String skeleton, java.util.Locale locale) { throw new RuntimeException("Stub!"); }
/* 113 */   public static final DateFormat getPatternInstance(Calendar cal, String skeleton, android.icu.util.ULocale locale) { throw new RuntimeException("Stub!"); }
/*     */   
/*     */   public static final int DAY_OF_YEAR_FIELD = 10;
/*     */   public static final int DEFAULT = 2;
/*     */   public static final int DOW_LOCAL_FIELD = 19;
/*     */   public static final int ERA_FIELD = 0;
/*     */   public static final int EXTENDED_YEAR_FIELD = 20;
/*     */   public static final int FRACTIONAL_SECOND_FIELD = 8;
/*     */   public static final int FULL = 0;
/*     */   public static final String GENERIC_TZ = "vvvv";
/*     */   public static final String HOUR = "j";
/*     */   public static final int HOUR0_FIELD = 16;
/*     */   public static final int HOUR1_FIELD = 15;
/*     */   public static final String HOUR24 = "H";
/*     */   public static final String HOUR24_MINUTE = "Hm";
/*     */   public static final String HOUR24_MINUTE_SECOND = "Hms";
/*     */   public static final String HOUR_MINUTE = "jm";
/*     */   public static final String HOUR_MINUTE_SECOND = "jms";
/*     */   public static final int HOUR_OF_DAY0_FIELD = 5;
/*     */   public static final int HOUR_OF_DAY1_FIELD = 4;
/*     */   public static final int JULIAN_DAY_FIELD = 21;
/*     */   public static final String LOCATION_TZ = "VVVV";
/*     */   public static final int LONG = 1;
/*     */   public static final int MEDIUM = 2;
/*     */   public static final int MILLISECONDS_IN_DAY_FIELD = 22;
/*     */   public static final int MILLISECOND_FIELD = 8;
/*     */   public static final String MINUTE = "m";
/*     */   public static final int MINUTE_FIELD = 6;
/*     */   public static final String MINUTE_SECOND = "ms";
/*     */   public static final String MONTH = "MMMM";
/*     */   public static final String MONTH_DAY = "MMMMd";
/*     */   public static final int MONTH_FIELD = 2;
/*     */   public static final String MONTH_WEEKDAY_DAY = "MMMMEEEEd";
/*     */   public static final int NONE = -1;
/*     */   public static final String NUM_MONTH = "M";
/*     */   public static final String NUM_MONTH_DAY = "Md";
/*     */   public static final String NUM_MONTH_WEEKDAY_DAY = "MEd";
/*     */   public static final String QUARTER = "QQQQ";
/*     */   public static final int QUARTER_FIELD = 27;
/*     */   public static final int RELATIVE = 128;
/*     */   public static final int RELATIVE_DEFAULT = 130;
/*     */   public static final int RELATIVE_FULL = 128;
/*     */   public static final int RELATIVE_LONG = 129;
/*     */   public static final int RELATIVE_MEDIUM = 130;
/*     */   public static final int RELATIVE_SHORT = 131;
/*     */   public static final String SECOND = "s";
/*     */   public static final int SECOND_FIELD = 7;
/*     */   public static final int SHORT = 3;
/*     */   public static final String SPECIFIC_TZ = "zzzz";
/*     */   public static final int STANDALONE_DAY_FIELD = 25;
/*     */   public static final int STANDALONE_MONTH_FIELD = 26;
/*     */   public static final int STANDALONE_QUARTER_FIELD = 28;
/*     */   public static final int TIMEZONE_FIELD = 17;
/*     */   public static final int TIMEZONE_GENERIC_FIELD = 24;
/*     */   public static final int TIMEZONE_ISO_FIELD = 32;
/*     */   public static final int TIMEZONE_ISO_LOCAL_FIELD = 33;
/*     */   public static final int TIMEZONE_LOCALIZED_GMT_OFFSET_FIELD = 31;
/*     */   public static final int TIMEZONE_RFC_FIELD = 23;
/*     */   public static final int TIMEZONE_SPECIAL_FIELD = 29;
/*     */   public static final String WEEKDAY = "EEEE";
/*     */   public static final int WEEK_OF_MONTH_FIELD = 13;
/*     */   public static final int WEEK_OF_YEAR_FIELD = 12;
/*     */   public static final String YEAR = "y";
/*     */   public static final String YEAR_ABBR_MONTH = "yMMM";
/*     */   public static final String YEAR_ABBR_MONTH_DAY = "yMMMd";
/*     */   public static final String YEAR_ABBR_MONTH_WEEKDAY_DAY = "yMMMEd";
/*     */   public static final String YEAR_ABBR_QUARTER = "yQQQ";
/*     */   public static final int YEAR_FIELD = 1;
/*     */   public static final String YEAR_MONTH = "yMMMM";
/*     */   public static final String YEAR_MONTH_DAY = "yMMMMd";
/*     */   public static final String YEAR_MONTH_WEEKDAY_DAY = "yMMMMEEEEd";
/*     */   public static final int YEAR_NAME_FIELD = 30;
/*     */   public static final String YEAR_NUM_MONTH = "yM";
/*     */   public static final String YEAR_NUM_MONTH_DAY = "yMd";
/*     */   public static final String YEAR_NUM_MONTH_WEEKDAY_DAY = "yMEd";
/*     */   public static final String YEAR_QUARTER = "yQQQQ";
/*     */   public static final int YEAR_WOY_FIELD = 18;
/*     */   protected Calendar calendar;
/*     */   protected NumberFormat numberFormat;
/*     */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\icu\text\DateFormat.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */