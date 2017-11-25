/*     */ package android.icu.util;
/*     */ 
/*     */ import java.util.Locale;
/*     */ 
/*     */ public abstract class Calendar implements java.io.Serializable, Cloneable, Comparable<Calendar> { public static final int ZONE_OFFSET = 15;
/*     */   public static final int YEAR_WOY = 17;
/*     */   public static final int YEAR = 1;
/*     */   public static final int WEEK_OF_YEAR = 3;
/*     */   public static final int WEEK_OF_MONTH = 4;
/*     */   public static final int WEDNESDAY = 4;
/*     */   public static final int WALLTIME_NEXT_VALID = 2;
/*     */   
/*     */   public static final class WeekData { public final int firstDayOfWeek;
/*     */     public final int minimalDaysInFirstWeek; public final int weekendCease;
/*  15 */     public WeekData(int fdow, int mdifw, int weekendOnset, int weekendOnsetMillis, int weekendCease, int weekendCeaseMillis) { throw new RuntimeException("Stub!"); }
/*  16 */     public int hashCode() { throw new RuntimeException("Stub!"); }
/*  17 */     public boolean equals(Object other) { throw new RuntimeException("Stub!"); }
/*  18 */     public String toString() { throw new RuntimeException("Stub!"); }
/*     */     
/*     */     public final int weekendCeaseMillis;
/*     */     public final int weekendOnset;
/*     */     public final int weekendOnsetMillis;
/*     */   }
/*     */   
/*     */   protected Calendar() {
/*  26 */     throw new RuntimeException("Stub!"); }
/*  27 */   protected Calendar(TimeZone zone, Locale aLocale) { throw new RuntimeException("Stub!"); }
/*  28 */   protected Calendar(TimeZone zone, ULocale locale) { throw new RuntimeException("Stub!"); }
/*  29 */   public static Calendar getInstance() { throw new RuntimeException("Stub!"); }
/*  30 */   public static Calendar getInstance(TimeZone zone) { throw new RuntimeException("Stub!"); }
/*  31 */   public static Calendar getInstance(Locale aLocale) { throw new RuntimeException("Stub!"); }
/*  32 */   public static Calendar getInstance(ULocale locale) { throw new RuntimeException("Stub!"); }
/*  33 */   public static Calendar getInstance(TimeZone zone, Locale aLocale) { throw new RuntimeException("Stub!"); }
/*  34 */   public static Calendar getInstance(TimeZone zone, ULocale locale) { throw new RuntimeException("Stub!"); }
/*  35 */   public static Locale[] getAvailableLocales() { throw new RuntimeException("Stub!"); }
/*  36 */   public static final String[] getKeywordValuesForLocale(String key, ULocale locale, boolean commonlyUsed) { throw new RuntimeException("Stub!"); }
/*  37 */   public final java.util.Date getTime() { throw new RuntimeException("Stub!"); }
/*  38 */   public final void setTime(java.util.Date date) { throw new RuntimeException("Stub!"); }
/*  39 */   public long getTimeInMillis() { throw new RuntimeException("Stub!"); }
/*  40 */   public void setTimeInMillis(long millis) { throw new RuntimeException("Stub!"); }
/*  41 */   public final int get(int field) { throw new RuntimeException("Stub!"); }
/*  42 */   protected final int internalGet(int field) { throw new RuntimeException("Stub!"); }
/*  43 */   protected final int internalGet(int field, int defaultValue) { throw new RuntimeException("Stub!"); }
/*  44 */   public final void set(int field, int value) { throw new RuntimeException("Stub!"); }
/*  45 */   public final void set(int year, int month, int date) { throw new RuntimeException("Stub!"); }
/*  46 */   public final void set(int year, int month, int date, int hour, int minute) { throw new RuntimeException("Stub!"); }
/*  47 */   public final void set(int year, int month, int date, int hour, int minute, int second) { throw new RuntimeException("Stub!"); }
/*  48 */   public final void clear() { throw new RuntimeException("Stub!"); }
/*  49 */   public final void clear(int field) { throw new RuntimeException("Stub!"); }
/*  50 */   public final boolean isSet(int field) { throw new RuntimeException("Stub!"); }
/*  51 */   protected void complete() { throw new RuntimeException("Stub!"); }
/*  52 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/*  53 */   public boolean isEquivalentTo(Calendar other) { throw new RuntimeException("Stub!"); }
/*  54 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/*  55 */   public boolean before(Object when) { throw new RuntimeException("Stub!"); }
/*  56 */   public boolean after(Object when) { throw new RuntimeException("Stub!"); }
/*  57 */   public int getActualMaximum(int field) { throw new RuntimeException("Stub!"); }
/*  58 */   public int getActualMinimum(int field) { throw new RuntimeException("Stub!"); }
/*  59 */   protected void prepareGetActual(int field, boolean isMinimum) { throw new RuntimeException("Stub!"); }
/*  60 */   public final void roll(int field, boolean up) { throw new RuntimeException("Stub!"); }
/*  61 */   public void roll(int field, int amount) { throw new RuntimeException("Stub!"); }
/*     */   
/*  63 */   public void add(int field, int amount) { throw new RuntimeException("Stub!"); }
/*  64 */   public String getDisplayName(Locale loc) { throw new RuntimeException("Stub!"); }
/*  65 */   public String getDisplayName(ULocale loc) { throw new RuntimeException("Stub!"); }
/*  66 */   public int compareTo(Calendar that) { throw new RuntimeException("Stub!"); }
/*  67 */   public android.icu.text.DateFormat getDateTimeFormat(int dateStyle, int timeStyle, Locale loc) { throw new RuntimeException("Stub!"); }
/*  68 */   public android.icu.text.DateFormat getDateTimeFormat(int dateStyle, int timeStyle, ULocale loc) { throw new RuntimeException("Stub!"); }
/*  69 */   protected android.icu.text.DateFormat handleGetDateFormat(String pattern, Locale locale) { throw new RuntimeException("Stub!"); }
/*  70 */   protected android.icu.text.DateFormat handleGetDateFormat(String pattern, String override, Locale locale) { throw new RuntimeException("Stub!"); }
/*  71 */   protected android.icu.text.DateFormat handleGetDateFormat(String pattern, ULocale locale) { throw new RuntimeException("Stub!"); }
/*  72 */   protected void pinField(int field) { throw new RuntimeException("Stub!"); }
/*  73 */   protected int weekNumber(int desiredDay, int dayOfPeriod, int dayOfWeek) { throw new RuntimeException("Stub!"); }
/*  74 */   protected final int weekNumber(int dayOfPeriod, int dayOfWeek) { throw new RuntimeException("Stub!"); }
/*  75 */   public int fieldDifference(java.util.Date when, int field) { throw new RuntimeException("Stub!"); }
/*  76 */   public void setTimeZone(TimeZone value) { throw new RuntimeException("Stub!"); }
/*  77 */   public TimeZone getTimeZone() { throw new RuntimeException("Stub!"); }
/*  78 */   public void setLenient(boolean lenient) { throw new RuntimeException("Stub!"); }
/*  79 */   public boolean isLenient() { throw new RuntimeException("Stub!"); }
/*  80 */   public void setRepeatedWallTimeOption(int option) { throw new RuntimeException("Stub!"); }
/*  81 */   public int getRepeatedWallTimeOption() { throw new RuntimeException("Stub!"); }
/*  82 */   public void setSkippedWallTimeOption(int option) { throw new RuntimeException("Stub!"); }
/*  83 */   public int getSkippedWallTimeOption() { throw new RuntimeException("Stub!"); }
/*  84 */   public void setFirstDayOfWeek(int value) { throw new RuntimeException("Stub!"); }
/*  85 */   public int getFirstDayOfWeek() { throw new RuntimeException("Stub!"); }
/*  86 */   public void setMinimalDaysInFirstWeek(int value) { throw new RuntimeException("Stub!"); }
/*  87 */   public int getMinimalDaysInFirstWeek() { throw new RuntimeException("Stub!"); }
/*     */   protected abstract int handleGetLimit(int paramInt1, int paramInt2);
/*  89 */   protected int getLimit(int field, int limitType) { throw new RuntimeException("Stub!"); }
/*  90 */   public final int getMinimum(int field) { throw new RuntimeException("Stub!"); }
/*  91 */   public final int getMaximum(int field) { throw new RuntimeException("Stub!"); }
/*  92 */   public final int getGreatestMinimum(int field) { throw new RuntimeException("Stub!"); }
/*  93 */   public final int getLeastMaximum(int field) { throw new RuntimeException("Stub!"); }
/*  94 */   public boolean isWeekend(java.util.Date date) { throw new RuntimeException("Stub!"); }
/*  95 */   public boolean isWeekend() { throw new RuntimeException("Stub!"); }
/*  96 */   public Object clone() { throw new RuntimeException("Stub!"); }
/*  97 */   public String toString() { throw new RuntimeException("Stub!"); }
/*  98 */   public static WeekData getWeekDataForRegion(String region) { throw new RuntimeException("Stub!"); }
/*  99 */   public WeekData getWeekData() { throw new RuntimeException("Stub!"); }
/* 100 */   public Calendar setWeekData(WeekData wdata) { throw new RuntimeException("Stub!"); }
/* 101 */   protected void computeFields() { throw new RuntimeException("Stub!"); }
/* 102 */   protected final void computeGregorianFields(int julianDay) { throw new RuntimeException("Stub!"); }
/* 103 */   protected int resolveFields(int[][][] precedenceTable) { throw new RuntimeException("Stub!"); }
/* 104 */   protected int newestStamp(int first, int last, int bestStampSoFar) { throw new RuntimeException("Stub!"); }
/* 105 */   protected final int getStamp(int field) { throw new RuntimeException("Stub!"); }
/* 106 */   protected int newerField(int defaultField, int alternateField) { throw new RuntimeException("Stub!"); }
/* 107 */   protected void validateFields() { throw new RuntimeException("Stub!"); }
/* 108 */   protected void validateField(int field) { throw new RuntimeException("Stub!"); }
/* 109 */   protected final void validateField(int field, int min, int max) { throw new RuntimeException("Stub!"); }
/* 110 */   protected void computeTime() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 112 */   protected int computeMillisInDay() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 114 */   protected int computeZoneOffset(long millis, int millisInDay) { throw new RuntimeException("Stub!"); }
/* 115 */   protected int computeJulianDay() { throw new RuntimeException("Stub!"); }
/* 116 */   protected int[][][] getFieldResolutionTable() { throw new RuntimeException("Stub!"); }
/*     */   protected abstract int handleComputeMonthStart(int paramInt1, int paramInt2, boolean paramBoolean);
/*     */   protected abstract int handleGetExtendedYear();
/* 119 */   protected int handleGetMonthLength(int extendedYear, int month) { throw new RuntimeException("Stub!"); }
/* 120 */   protected int handleGetYearLength(int eyear) { throw new RuntimeException("Stub!"); }
/* 121 */   protected int[] handleCreateFields() { throw new RuntimeException("Stub!"); }
/* 122 */   protected int handleComputeJulianDay(int bestField) { throw new RuntimeException("Stub!"); }
/* 123 */   protected int computeGregorianMonthStart(int year, int month) { throw new RuntimeException("Stub!"); }
/* 124 */   protected void handleComputeFields(int julianDay) { throw new RuntimeException("Stub!"); }
/* 125 */   protected final int getGregorianYear() { throw new RuntimeException("Stub!"); }
/* 126 */   protected final int getGregorianMonth() { throw new RuntimeException("Stub!"); }
/* 127 */   protected final int getGregorianDayOfYear() { throw new RuntimeException("Stub!"); }
/* 128 */   protected final int getGregorianDayOfMonth() { throw new RuntimeException("Stub!"); }
/* 129 */   public final int getFieldCount() { throw new RuntimeException("Stub!"); }
/* 130 */   protected final void internalSet(int field, int value) { throw new RuntimeException("Stub!"); }
/* 131 */   protected static final boolean isGregorianLeapYear(int year) { throw new RuntimeException("Stub!"); }
/* 132 */   protected static final int gregorianMonthLength(int y, int m) { throw new RuntimeException("Stub!"); }
/* 133 */   protected static final int gregorianPreviousMonthLength(int y, int m) { throw new RuntimeException("Stub!"); }
/* 134 */   protected static final long floorDivide(long numerator, long denominator) { throw new RuntimeException("Stub!"); }
/* 135 */   protected static final int floorDivide(int numerator, int denominator) { throw new RuntimeException("Stub!"); }
/* 136 */   protected static final int floorDivide(int numerator, int denominator, int[] remainder) { throw new RuntimeException("Stub!"); }
/* 137 */   protected static final int floorDivide(long numerator, int denominator, int[] remainder) { throw new RuntimeException("Stub!"); }
/* 138 */   protected String fieldName(int field) { throw new RuntimeException("Stub!"); }
/* 139 */   protected static final int millisToJulianDay(long millis) { throw new RuntimeException("Stub!"); }
/* 140 */   protected static final long julianDayToMillis(int julian) { throw new RuntimeException("Stub!"); }
/* 141 */   protected static final int julianDayToDayOfWeek(int julian) { throw new RuntimeException("Stub!"); }
/* 142 */   protected final long internalGetTimeInMillis() { throw new RuntimeException("Stub!"); }
/* 143 */   public String getType() { throw new RuntimeException("Stub!"); }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public static final int WALLTIME_LAST = 0;
/*     */   
/*     */ 
/*     */ 
/*     */   public static final int WALLTIME_FIRST = 1;
/*     */   
/*     */ 
/*     */   protected static final int UNSET = 0;
/*     */   
/*     */ 
/*     */   public static final int UNDECIMBER = 12;
/*     */   
/*     */ 
/*     */   public static final int TUESDAY = 3;
/*     */   
/*     */ 
/*     */   public static final int THURSDAY = 5;
/*     */   
/*     */ 
/*     */   public static final int SUNDAY = 1;
/*     */   
/*     */ 
/*     */   public static final int SEPTEMBER = 8;
/*     */   
/*     */ 
/*     */   public static final int SECOND = 13;
/*     */   
/*     */ 
/*     */   public static final int SATURDAY = 7;
/*     */   
/*     */ 
/*     */   protected static final int RESOLVE_REMAP = 32;
/*     */   
/*     */ 
/*     */   public static final int PM = 1;
/*     */   
/*     */ 
/*     */   protected static final long ONE_WEEK = 604800000L;
/*     */   
/*     */ 
/*     */   protected static final int ONE_SECOND = 1000;
/*     */   
/*     */ 
/*     */   protected static final int ONE_MINUTE = 60000;
/*     */   
/*     */ 
/*     */   protected static final int ONE_HOUR = 3600000;
/*     */   
/*     */ 
/*     */   protected static final long ONE_DAY = 86400000L;
/*     */   
/*     */ 
/*     */   public static final int OCTOBER = 9;
/*     */   
/*     */ 
/*     */   public static final int NOVEMBER = 10;
/*     */   
/*     */ 
/*     */   public static final int MONTH = 2;
/*     */   
/*     */ 
/*     */   public static final int MONDAY = 2;
/*     */   
/*     */ 
/*     */   protected static final long MIN_MILLIS = -184303902528000000L;
/*     */   
/*     */ 
/*     */   protected static final int MIN_JULIAN = -2130706432;
/*     */   
/*     */ 
/* 218 */   protected static final java.util.Date MIN_DATE = null; public static final int MINUTE = 12; protected static final int MINIMUM_USER_STAMP = 2; protected static final int MINIMUM = 0; public static final int MILLISECONDS_IN_DAY = 21; public static final int MILLISECOND = 14; public static final int MAY = 4; protected static final long MAX_MILLIS = 183882168921600000L; protected static final int MAX_JULIAN = 2130706432; @Deprecated
/* 218 */   protected static final int MAX_FIELD_COUNT = 32; protected static final java.util.Date MAX_DATE = null;
/*     */   protected static final int MAXIMUM = 3;
/*     */   public static final int MARCH = 2;
/*     */   protected static final int LEAST_MAXIMUM = 2;
/*     */   public static final int JUNE = 5;
/*     */   public static final int JULY = 6;
/*     */   public static final int JULIAN_DAY = 20;
/*     */   protected static final int JAN_1_1_JULIAN_DAY = 1721426;
/*     */   public static final int JANUARY = 0;
/*     */   public static final int IS_LEAP_MONTH = 22;
/*     */   protected static final int INTERNALLY_SET = 1;
/*     */   public static final int HOUR_OF_DAY = 11;
/*     */   public static final int HOUR = 10;
/*     */   protected static final int GREATEST_MINIMUM = 1;
/*     */   public static final int FRIDAY = 6;
/*     */   public static final int FEBRUARY = 1;
/*     */   public static final int EXTENDED_YEAR = 19;
/*     */   public static final int ERA = 0;
/*     */   protected static final int EPOCH_JULIAN_DAY = 2440588;
/*     */   public static final int DST_OFFSET = 16;
/*     */   public static final int DOW_LOCAL = 18;
/*     */   public static final int DECEMBER = 11;
/*     */   public static final int DAY_OF_YEAR = 6;
/*     */   public static final int DAY_OF_WEEK_IN_MONTH = 8;
/*     */   public static final int DAY_OF_WEEK = 7;
/*     */   public static final int DAY_OF_MONTH = 5;
/*     */   public static final int DATE = 5;
/*     */   @Deprecated
/*     */   protected static final int BASE_FIELD_COUNT = 23;
/*     */   public static final int AUGUST = 7;
/*     */   public static final int APRIL = 3;
/*     */   public static final int AM_PM = 9;
/*     */   public static final int AM = 0;
/*     */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\icu\util\Calendar.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */