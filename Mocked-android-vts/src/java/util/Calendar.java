/*     */ package java.util;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.time.Instant;
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
/*     */ public abstract class Calendar
/*     */   implements Serializable, Cloneable, Comparable<Calendar>
/*     */ {
/*     */   public static final int ALL_STYLES = 0;
/*     */   public static final int AM = 0;
/*     */   public static final int AM_PM = 9;
/*     */   public static final int APRIL = 3;
/*     */   public static final int AUGUST = 7;
/*     */   public static final int DATE = 5;
/*     */   public static final int DAY_OF_MONTH = 5;
/*     */   public static final int DAY_OF_WEEK = 7;
/*     */   public static final int DAY_OF_WEEK_IN_MONTH = 8;
/*     */   public static final int DAY_OF_YEAR = 6;
/*     */   public static final int DECEMBER = 11;
/*     */   public static final int DST_OFFSET = 16;
/*     */   public static final int ERA = 0;
/*     */   public static final int FEBRUARY = 1;
/*     */   public static final int FIELD_COUNT = 17;
/*     */   public static final int FRIDAY = 6;
/*     */   public static final int HOUR = 10;
/*     */   public static final int HOUR_OF_DAY = 11;
/*     */   public static final int JANUARY = 0;
/*     */   public static final int JULY = 6;
/*     */   public static final int JUNE = 5;
/*     */   public static final int LONG = 2;
/*     */   public static final int LONG_FORMAT = 2;
/*     */   public static final int LONG_STANDALONE = 32770;
/*     */   public static final int MARCH = 2;
/*     */   
/*     */   public static class Builder
/*     */   {
/*  46 */     public Builder() { throw new RuntimeException("Stub!"); }
/*  47 */     public Builder setInstant(long instant) { throw new RuntimeException("Stub!"); }
/*  48 */     public Builder setInstant(Date instant) { throw new RuntimeException("Stub!"); }
/*  49 */     public Builder set(int field, int value) { throw new RuntimeException("Stub!"); }
/*  50 */     public Builder setFields(int... fieldValuePairs) { throw new RuntimeException("Stub!"); }
/*  51 */     public Builder setDate(int year, int month, int dayOfMonth) { throw new RuntimeException("Stub!"); }
/*  52 */     public Builder setTimeOfDay(int hourOfDay, int minute, int second) { throw new RuntimeException("Stub!"); }
/*  53 */     public Builder setTimeOfDay(int hourOfDay, int minute, int second, int millis) { throw new RuntimeException("Stub!"); }
/*  54 */     public Builder setWeekDate(int weekYear, int weekOfYear, int dayOfWeek) { throw new RuntimeException("Stub!"); }
/*  55 */     public Builder setTimeZone(TimeZone zone) { throw new RuntimeException("Stub!"); }
/*  56 */     public Builder setLenient(boolean lenient) { throw new RuntimeException("Stub!"); }
/*  57 */     public Builder setCalendarType(String type) { throw new RuntimeException("Stub!"); }
/*  58 */     public Builder setLocale(Locale locale) { throw new RuntimeException("Stub!"); }
/*  59 */     public Builder setWeekDefinition(int firstDayOfWeek, int minimalDaysInFirstWeek) { throw new RuntimeException("Stub!"); }
/*  60 */     public Calendar build() { throw new RuntimeException("Stub!"); } }
/*     */   
/*  62 */   protected Calendar() { throw new RuntimeException("Stub!"); }
/*  63 */   protected Calendar(TimeZone zone, Locale aLocale) { throw new RuntimeException("Stub!"); }
/*  64 */   public static Calendar getInstance() { throw new RuntimeException("Stub!"); }
/*  65 */   public static Calendar getInstance(TimeZone zone) { throw new RuntimeException("Stub!"); }
/*  66 */   public static Calendar getInstance(Locale aLocale) { throw new RuntimeException("Stub!"); }
/*  67 */   public static Calendar getInstance(TimeZone zone, Locale aLocale) { throw new RuntimeException("Stub!"); }
/*  68 */   public static synchronized Locale[] getAvailableLocales() { throw new RuntimeException("Stub!"); }
/*     */   protected abstract void computeTime();
/*     */   protected abstract void computeFields();
/*  71 */   public final Date getTime() { throw new RuntimeException("Stub!"); }
/*  72 */   public final void setTime(Date date) { throw new RuntimeException("Stub!"); }
/*  73 */   public long getTimeInMillis() { throw new RuntimeException("Stub!"); }
/*  74 */   public void setTimeInMillis(long millis) { throw new RuntimeException("Stub!"); }
/*  75 */   public int get(int field) { throw new RuntimeException("Stub!"); }
/*  76 */   protected final int internalGet(int field) { throw new RuntimeException("Stub!"); }
/*  77 */   public void set(int field, int value) { throw new RuntimeException("Stub!"); }
/*  78 */   public final void set(int year, int month, int date) { throw new RuntimeException("Stub!"); }
/*  79 */   public final void set(int year, int month, int date, int hourOfDay, int minute) { throw new RuntimeException("Stub!"); }
/*  80 */   public final void set(int year, int month, int date, int hourOfDay, int minute, int second) { throw new RuntimeException("Stub!"); }
/*  81 */   public final void clear() { throw new RuntimeException("Stub!"); }
/*  82 */   public final void clear(int field) { throw new RuntimeException("Stub!"); }
/*  83 */   public final boolean isSet(int field) { throw new RuntimeException("Stub!"); }
/*  84 */   public String getDisplayName(int field, int style, Locale locale) { throw new RuntimeException("Stub!"); }
/*  85 */   public Map<String, Integer> getDisplayNames(int field, int style, Locale locale) { throw new RuntimeException("Stub!"); }
/*  86 */   protected void complete() { throw new RuntimeException("Stub!"); }
/*  87 */   public static Set<String> getAvailableCalendarTypes() { throw new RuntimeException("Stub!"); }
/*  88 */   public String getCalendarType() { throw new RuntimeException("Stub!"); }
/*     */   
/*  90 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/*  91 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/*  92 */   public boolean before(Object when) { throw new RuntimeException("Stub!"); }
/*  93 */   public boolean after(Object when) { throw new RuntimeException("Stub!"); }
/*  94 */   public int compareTo(Calendar anotherCalendar) { throw new RuntimeException("Stub!"); }
/*     */   public abstract void add(int paramInt1, int paramInt2);
/*     */   public abstract void roll(int paramInt, boolean paramBoolean);
/*  97 */   public void roll(int field, int amount) { throw new RuntimeException("Stub!"); }
/*  98 */   public void setTimeZone(TimeZone value) { throw new RuntimeException("Stub!"); }
/*  99 */   public TimeZone getTimeZone() { throw new RuntimeException("Stub!"); }
/* 100 */   public void setLenient(boolean lenient) { throw new RuntimeException("Stub!"); }
/* 101 */   public boolean isLenient() { throw new RuntimeException("Stub!"); }
/* 102 */   public void setFirstDayOfWeek(int value) { throw new RuntimeException("Stub!"); }
/* 103 */   public int getFirstDayOfWeek() { throw new RuntimeException("Stub!"); }
/* 104 */   public void setMinimalDaysInFirstWeek(int value) { throw new RuntimeException("Stub!"); }
/* 105 */   public int getMinimalDaysInFirstWeek() { throw new RuntimeException("Stub!"); }
/* 106 */   public boolean isWeekDateSupported() { throw new RuntimeException("Stub!"); }
/* 107 */   public int getWeekYear() { throw new RuntimeException("Stub!"); }
/* 108 */   public void setWeekDate(int weekYear, int weekOfYear, int dayOfWeek) { throw new RuntimeException("Stub!"); }
/* 109 */   public int getWeeksInWeekYear() { throw new RuntimeException("Stub!"); }
/*     */   public abstract int getMinimum(int paramInt);
/*     */   public abstract int getMaximum(int paramInt);
/*     */   public abstract int getGreatestMinimum(int paramInt);
/*     */   public abstract int getLeastMaximum(int paramInt);
/* 114 */   public int getActualMinimum(int field) { throw new RuntimeException("Stub!"); }
/* 115 */   public int getActualMaximum(int field) { throw new RuntimeException("Stub!"); }
/* 116 */   public Object clone() { throw new RuntimeException("Stub!"); }
/* 117 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 118 */   public final Instant toInstant() { throw new RuntimeException("Stub!"); }
/*     */   
/*     */ 
/*     */   public static final int MAY = 4;
/*     */   
/*     */   public static final int MILLISECOND = 14;
/*     */   
/*     */   public static final int MINUTE = 12;
/*     */   
/*     */   public static final int MONDAY = 2;
/*     */   
/*     */   public static final int MONTH = 2;
/*     */   
/*     */   public static final int NARROW_FORMAT = 4;
/*     */   
/*     */   public static final int NARROW_STANDALONE = 32772;
/*     */   
/*     */   public static final int NOVEMBER = 10;
/*     */   
/*     */   public static final int OCTOBER = 9;
/*     */   
/*     */   public static final int PM = 1;
/*     */   
/*     */   public static final int SATURDAY = 7;
/*     */   
/*     */   public static final int SECOND = 13;
/*     */   
/*     */   public static final int SEPTEMBER = 8;
/*     */   
/*     */   public static final int SHORT = 1;
/*     */   
/*     */   public static final int SHORT_FORMAT = 1;
/*     */   
/*     */   public static final int SHORT_STANDALONE = 32769;
/*     */   
/*     */   public static final int SUNDAY = 1;
/*     */   
/*     */   public static final int THURSDAY = 5;
/*     */   
/*     */   public static final int TUESDAY = 3;
/*     */   
/*     */   public static final int UNDECIMBER = 12;
/*     */   
/*     */   public static final int WEDNESDAY = 4;
/*     */   
/*     */   public static final int WEEK_OF_MONTH = 4;
/*     */   
/*     */   public static final int WEEK_OF_YEAR = 3;
/*     */   
/*     */   public static final int YEAR = 1;
/*     */   
/*     */   public static final int ZONE_OFFSET = 15;
/*     */   protected boolean areFieldsSet;
/* 171 */   protected int[] fields = null;
/*     */   
/* 173 */   protected boolean[] isSet = null;
/*     */   protected boolean isTimeSet;
/*     */   protected long time;
/*     */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\util\Calendar.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */