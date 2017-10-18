/*     */ package java.time;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.time.chrono.ChronoLocalDate;
/*     */ import java.time.chrono.Era;
/*     */ import java.time.chrono.IsoChronology;
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
/*     */ public final class LocalDate
/*     */   implements Temporal, TemporalAdjuster, ChronoLocalDate, Serializable
/*     */ {
/*  66 */   LocalDate() { throw new RuntimeException("Stub!"); }
/*  67 */   public static LocalDate now() { throw new RuntimeException("Stub!"); }
/*  68 */   public static LocalDate now(ZoneId zone) { throw new RuntimeException("Stub!"); }
/*  69 */   public static LocalDate now(Clock clock) { throw new RuntimeException("Stub!"); }
/*  70 */   public static LocalDate of(int year, Month month, int dayOfMonth) { throw new RuntimeException("Stub!"); }
/*  71 */   public static LocalDate of(int year, int month, int dayOfMonth) { throw new RuntimeException("Stub!"); }
/*  72 */   public static LocalDate ofYearDay(int year, int dayOfYear) { throw new RuntimeException("Stub!"); }
/*  73 */   public static LocalDate ofEpochDay(long epochDay) { throw new RuntimeException("Stub!"); }
/*  74 */   public static LocalDate from(TemporalAccessor temporal) { throw new RuntimeException("Stub!"); }
/*  75 */   public static LocalDate parse(CharSequence text) { throw new RuntimeException("Stub!"); }
/*  76 */   public static LocalDate parse(CharSequence text, DateTimeFormatter formatter) { throw new RuntimeException("Stub!"); }
/*  77 */   public boolean isSupported(TemporalField field) { throw new RuntimeException("Stub!"); }
/*  78 */   public boolean isSupported(TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/*  79 */   public ValueRange range(TemporalField field) { throw new RuntimeException("Stub!"); }
/*  80 */   public int get(TemporalField field) { throw new RuntimeException("Stub!"); }
/*  81 */   public long getLong(TemporalField field) { throw new RuntimeException("Stub!"); }
/*  82 */   public IsoChronology getChronology() { throw new RuntimeException("Stub!"); }
/*  83 */   public Era getEra() { throw new RuntimeException("Stub!"); }
/*  84 */   public int getYear() { throw new RuntimeException("Stub!"); }
/*  85 */   public int getMonthValue() { throw new RuntimeException("Stub!"); }
/*  86 */   public Month getMonth() { throw new RuntimeException("Stub!"); }
/*  87 */   public int getDayOfMonth() { throw new RuntimeException("Stub!"); }
/*  88 */   public int getDayOfYear() { throw new RuntimeException("Stub!"); }
/*  89 */   public DayOfWeek getDayOfWeek() { throw new RuntimeException("Stub!"); }
/*  90 */   public boolean isLeapYear() { throw new RuntimeException("Stub!"); }
/*  91 */   public int lengthOfMonth() { throw new RuntimeException("Stub!"); }
/*  92 */   public int lengthOfYear() { throw new RuntimeException("Stub!"); }
/*  93 */   public LocalDate with(TemporalAdjuster adjuster) { throw new RuntimeException("Stub!"); }
/*  94 */   public LocalDate with(TemporalField field, long newValue) { throw new RuntimeException("Stub!"); }
/*  95 */   public LocalDate withYear(int year) { throw new RuntimeException("Stub!"); }
/*  96 */   public LocalDate withMonth(int month) { throw new RuntimeException("Stub!"); }
/*  97 */   public LocalDate withDayOfMonth(int dayOfMonth) { throw new RuntimeException("Stub!"); }
/*  98 */   public LocalDate withDayOfYear(int dayOfYear) { throw new RuntimeException("Stub!"); }
/*  99 */   public LocalDate plus(TemporalAmount amountToAdd) { throw new RuntimeException("Stub!"); }
/* 100 */   public LocalDate plus(long amountToAdd, TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/* 101 */   public LocalDate plusYears(long yearsToAdd) { throw new RuntimeException("Stub!"); }
/* 102 */   public LocalDate plusMonths(long monthsToAdd) { throw new RuntimeException("Stub!"); }
/* 103 */   public LocalDate plusWeeks(long weeksToAdd) { throw new RuntimeException("Stub!"); }
/* 104 */   public LocalDate plusDays(long daysToAdd) { throw new RuntimeException("Stub!"); }
/* 105 */   public LocalDate minus(TemporalAmount amountToSubtract) { throw new RuntimeException("Stub!"); }
/* 106 */   public LocalDate minus(long amountToSubtract, TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/* 107 */   public LocalDate minusYears(long yearsToSubtract) { throw new RuntimeException("Stub!"); }
/* 108 */   public LocalDate minusMonths(long monthsToSubtract) { throw new RuntimeException("Stub!"); }
/* 109 */   public LocalDate minusWeeks(long weeksToSubtract) { throw new RuntimeException("Stub!"); }
/* 110 */   public LocalDate minusDays(long daysToSubtract) { throw new RuntimeException("Stub!"); }
/*     */   
/* 112 */   public <R> R query(TemporalQuery<R> query) { throw new RuntimeException("Stub!"); }
/* 113 */   public Temporal adjustInto(Temporal temporal) { throw new RuntimeException("Stub!"); }
/* 114 */   public long until(Temporal endExclusive, TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/* 115 */   public Period until(ChronoLocalDate endDateExclusive) { throw new RuntimeException("Stub!"); }
/* 116 */   public String format(DateTimeFormatter formatter) { throw new RuntimeException("Stub!"); }
/* 117 */   public LocalDateTime atTime(LocalTime time) { throw new RuntimeException("Stub!"); }
/* 118 */   public LocalDateTime atTime(int hour, int minute) { throw new RuntimeException("Stub!"); }
/* 119 */   public LocalDateTime atTime(int hour, int minute, int second) { throw new RuntimeException("Stub!"); }
/* 120 */   public LocalDateTime atTime(int hour, int minute, int second, int nanoOfSecond) { throw new RuntimeException("Stub!"); }
/* 121 */   public OffsetDateTime atTime(OffsetTime time) { throw new RuntimeException("Stub!"); }
/* 122 */   public LocalDateTime atStartOfDay() { throw new RuntimeException("Stub!"); }
/* 123 */   public ZonedDateTime atStartOfDay(ZoneId zone) { throw new RuntimeException("Stub!"); }
/* 124 */   public long toEpochDay() { throw new RuntimeException("Stub!"); }
/* 125 */   public int compareTo(ChronoLocalDate other) { throw new RuntimeException("Stub!"); }
/* 126 */   public boolean isAfter(ChronoLocalDate other) { throw new RuntimeException("Stub!"); }
/* 127 */   public boolean isBefore(ChronoLocalDate other) { throw new RuntimeException("Stub!"); }
/* 128 */   public boolean isEqual(ChronoLocalDate other) { throw new RuntimeException("Stub!"); }
/* 129 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 130 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 131 */   public String toString() { throw new RuntimeException("Stub!"); }
/*     */   
/*     */ 
/* 134 */   public static final LocalDate MIN = null; public static final LocalDate MAX = null;
/*     */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\time\LocalDate.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */