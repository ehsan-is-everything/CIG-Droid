/*     */ package java.time;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.time.format.DateTimeFormatter;
/*     */ import java.time.temporal.Temporal;
/*     */ import java.time.temporal.TemporalAccessor;
/*     */ import java.time.temporal.TemporalAdjuster;
/*     */ import java.time.temporal.TemporalAmount;
/*     */ import java.time.temporal.TemporalField;
/*     */ import java.time.temporal.TemporalQuery;
/*     */ import java.time.temporal.TemporalUnit;
/*     */ import java.time.temporal.ValueRange;
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
/*     */ public final class Year
/*     */   implements Temporal, TemporalAdjuster, Comparable<Year>, Serializable
/*     */ {
/*     */   public static final int MAX_VALUE = 999999999;
/*     */   public static final int MIN_VALUE = -999999999;
/*     */   
/*  66 */   Year() { throw new RuntimeException("Stub!"); }
/*  67 */   public static Year now() { throw new RuntimeException("Stub!"); }
/*  68 */   public static Year now(ZoneId zone) { throw new RuntimeException("Stub!"); }
/*  69 */   public static Year now(Clock clock) { throw new RuntimeException("Stub!"); }
/*  70 */   public static Year of(int isoYear) { throw new RuntimeException("Stub!"); }
/*  71 */   public static Year from(TemporalAccessor temporal) { throw new RuntimeException("Stub!"); }
/*  72 */   public static Year parse(CharSequence text) { throw new RuntimeException("Stub!"); }
/*  73 */   public static Year parse(CharSequence text, DateTimeFormatter formatter) { throw new RuntimeException("Stub!"); }
/*  74 */   public static boolean isLeap(long year) { throw new RuntimeException("Stub!"); }
/*  75 */   public int getValue() { throw new RuntimeException("Stub!"); }
/*  76 */   public boolean isSupported(TemporalField field) { throw new RuntimeException("Stub!"); }
/*  77 */   public boolean isSupported(TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/*  78 */   public ValueRange range(TemporalField field) { throw new RuntimeException("Stub!"); }
/*  79 */   public int get(TemporalField field) { throw new RuntimeException("Stub!"); }
/*  80 */   public long getLong(TemporalField field) { throw new RuntimeException("Stub!"); }
/*  81 */   public boolean isLeap() { throw new RuntimeException("Stub!"); }
/*  82 */   public boolean isValidMonthDay(MonthDay monthDay) { throw new RuntimeException("Stub!"); }
/*  83 */   public int length() { throw new RuntimeException("Stub!"); }
/*  84 */   public Year with(TemporalAdjuster adjuster) { throw new RuntimeException("Stub!"); }
/*  85 */   public Year with(TemporalField field, long newValue) { throw new RuntimeException("Stub!"); }
/*  86 */   public Year plus(TemporalAmount amountToAdd) { throw new RuntimeException("Stub!"); }
/*  87 */   public Year plus(long amountToAdd, TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/*  88 */   public Year plusYears(long yearsToAdd) { throw new RuntimeException("Stub!"); }
/*  89 */   public Year minus(TemporalAmount amountToSubtract) { throw new RuntimeException("Stub!"); }
/*  90 */   public Year minus(long amountToSubtract, TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/*  91 */   public Year minusYears(long yearsToSubtract) { throw new RuntimeException("Stub!"); }
/*     */   
/*  93 */   public <R> R query(TemporalQuery<R> query) { throw new RuntimeException("Stub!"); }
/*  94 */   public Temporal adjustInto(Temporal temporal) { throw new RuntimeException("Stub!"); }
/*  95 */   public long until(Temporal endExclusive, TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/*  96 */   public String format(DateTimeFormatter formatter) { throw new RuntimeException("Stub!"); }
/*  97 */   public LocalDate atDay(int dayOfYear) { throw new RuntimeException("Stub!"); }
/*  98 */   public YearMonth atMonth(Month month) { throw new RuntimeException("Stub!"); }
/*  99 */   public YearMonth atMonth(int month) { throw new RuntimeException("Stub!"); }
/* 100 */   public LocalDate atMonthDay(MonthDay monthDay) { throw new RuntimeException("Stub!"); }
/* 101 */   public int compareTo(Year other) { throw new RuntimeException("Stub!"); }
/* 102 */   public boolean isAfter(Year other) { throw new RuntimeException("Stub!"); }
/* 103 */   public boolean isBefore(Year other) { throw new RuntimeException("Stub!"); }
/* 104 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 105 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 106 */   public String toString() { throw new RuntimeException("Stub!"); }
/*     */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\time\Year.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */