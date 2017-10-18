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
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class YearMonth
/*     */   implements Temporal, TemporalAdjuster, Comparable<YearMonth>, Serializable
/*     */ {
/*  66 */   YearMonth() { throw new RuntimeException("Stub!"); }
/*  67 */   public static YearMonth now() { throw new RuntimeException("Stub!"); }
/*  68 */   public static YearMonth now(ZoneId zone) { throw new RuntimeException("Stub!"); }
/*  69 */   public static YearMonth now(Clock clock) { throw new RuntimeException("Stub!"); }
/*  70 */   public static YearMonth of(int year, Month month) { throw new RuntimeException("Stub!"); }
/*  71 */   public static YearMonth of(int year, int month) { throw new RuntimeException("Stub!"); }
/*  72 */   public static YearMonth from(TemporalAccessor temporal) { throw new RuntimeException("Stub!"); }
/*  73 */   public static YearMonth parse(CharSequence text) { throw new RuntimeException("Stub!"); }
/*  74 */   public static YearMonth parse(CharSequence text, DateTimeFormatter formatter) { throw new RuntimeException("Stub!"); }
/*  75 */   public boolean isSupported(TemporalField field) { throw new RuntimeException("Stub!"); }
/*  76 */   public boolean isSupported(TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/*  77 */   public ValueRange range(TemporalField field) { throw new RuntimeException("Stub!"); }
/*  78 */   public int get(TemporalField field) { throw new RuntimeException("Stub!"); }
/*  79 */   public long getLong(TemporalField field) { throw new RuntimeException("Stub!"); }
/*  80 */   public int getYear() { throw new RuntimeException("Stub!"); }
/*  81 */   public int getMonthValue() { throw new RuntimeException("Stub!"); }
/*  82 */   public Month getMonth() { throw new RuntimeException("Stub!"); }
/*  83 */   public boolean isLeapYear() { throw new RuntimeException("Stub!"); }
/*  84 */   public boolean isValidDay(int dayOfMonth) { throw new RuntimeException("Stub!"); }
/*  85 */   public int lengthOfMonth() { throw new RuntimeException("Stub!"); }
/*  86 */   public int lengthOfYear() { throw new RuntimeException("Stub!"); }
/*  87 */   public YearMonth with(TemporalAdjuster adjuster) { throw new RuntimeException("Stub!"); }
/*  88 */   public YearMonth with(TemporalField field, long newValue) { throw new RuntimeException("Stub!"); }
/*  89 */   public YearMonth withYear(int year) { throw new RuntimeException("Stub!"); }
/*  90 */   public YearMonth withMonth(int month) { throw new RuntimeException("Stub!"); }
/*  91 */   public YearMonth plus(TemporalAmount amountToAdd) { throw new RuntimeException("Stub!"); }
/*  92 */   public YearMonth plus(long amountToAdd, TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/*  93 */   public YearMonth plusYears(long yearsToAdd) { throw new RuntimeException("Stub!"); }
/*  94 */   public YearMonth plusMonths(long monthsToAdd) { throw new RuntimeException("Stub!"); }
/*  95 */   public YearMonth minus(TemporalAmount amountToSubtract) { throw new RuntimeException("Stub!"); }
/*  96 */   public YearMonth minus(long amountToSubtract, TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/*  97 */   public YearMonth minusYears(long yearsToSubtract) { throw new RuntimeException("Stub!"); }
/*  98 */   public YearMonth minusMonths(long monthsToSubtract) { throw new RuntimeException("Stub!"); }
/*     */   
/* 100 */   public <R> R query(TemporalQuery<R> query) { throw new RuntimeException("Stub!"); }
/* 101 */   public Temporal adjustInto(Temporal temporal) { throw new RuntimeException("Stub!"); }
/* 102 */   public long until(Temporal endExclusive, TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/* 103 */   public String format(DateTimeFormatter formatter) { throw new RuntimeException("Stub!"); }
/* 104 */   public LocalDate atDay(int dayOfMonth) { throw new RuntimeException("Stub!"); }
/* 105 */   public LocalDate atEndOfMonth() { throw new RuntimeException("Stub!"); }
/* 106 */   public int compareTo(YearMonth other) { throw new RuntimeException("Stub!"); }
/* 107 */   public boolean isAfter(YearMonth other) { throw new RuntimeException("Stub!"); }
/* 108 */   public boolean isBefore(YearMonth other) { throw new RuntimeException("Stub!"); }
/* 109 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 110 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 111 */   public String toString() { throw new RuntimeException("Stub!"); }
/*     */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\time\YearMonth.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */