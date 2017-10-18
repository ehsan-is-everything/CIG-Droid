/*     */ package java.time;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.time.chrono.ChronoLocalDateTime;
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
/*     */ public final class LocalDateTime
/*     */   implements Temporal, TemporalAdjuster, ChronoLocalDateTime<LocalDate>, Serializable
/*     */ {
/*  66 */   LocalDateTime() { throw new RuntimeException("Stub!"); }
/*  67 */   public static LocalDateTime now() { throw new RuntimeException("Stub!"); }
/*  68 */   public static LocalDateTime now(ZoneId zone) { throw new RuntimeException("Stub!"); }
/*  69 */   public static LocalDateTime now(Clock clock) { throw new RuntimeException("Stub!"); }
/*  70 */   public static LocalDateTime of(int year, Month month, int dayOfMonth, int hour, int minute) { throw new RuntimeException("Stub!"); }
/*  71 */   public static LocalDateTime of(int year, Month month, int dayOfMonth, int hour, int minute, int second) { throw new RuntimeException("Stub!"); }
/*  72 */   public static LocalDateTime of(int year, Month month, int dayOfMonth, int hour, int minute, int second, int nanoOfSecond) { throw new RuntimeException("Stub!"); }
/*  73 */   public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute) { throw new RuntimeException("Stub!"); }
/*  74 */   public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second) { throw new RuntimeException("Stub!"); }
/*  75 */   public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second, int nanoOfSecond) { throw new RuntimeException("Stub!"); }
/*  76 */   public static LocalDateTime of(LocalDate date, LocalTime time) { throw new RuntimeException("Stub!"); }
/*  77 */   public static LocalDateTime ofInstant(Instant instant, ZoneId zone) { throw new RuntimeException("Stub!"); }
/*  78 */   public static LocalDateTime ofEpochSecond(long epochSecond, int nanoOfSecond, ZoneOffset offset) { throw new RuntimeException("Stub!"); }
/*  79 */   public static LocalDateTime from(TemporalAccessor temporal) { throw new RuntimeException("Stub!"); }
/*  80 */   public static LocalDateTime parse(CharSequence text) { throw new RuntimeException("Stub!"); }
/*  81 */   public static LocalDateTime parse(CharSequence text, DateTimeFormatter formatter) { throw new RuntimeException("Stub!"); }
/*  82 */   public boolean isSupported(TemporalField field) { throw new RuntimeException("Stub!"); }
/*  83 */   public boolean isSupported(TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/*  84 */   public ValueRange range(TemporalField field) { throw new RuntimeException("Stub!"); }
/*  85 */   public int get(TemporalField field) { throw new RuntimeException("Stub!"); }
/*  86 */   public long getLong(TemporalField field) { throw new RuntimeException("Stub!"); }
/*  87 */   public LocalDate toLocalDate() { throw new RuntimeException("Stub!"); }
/*  88 */   public int getYear() { throw new RuntimeException("Stub!"); }
/*  89 */   public int getMonthValue() { throw new RuntimeException("Stub!"); }
/*  90 */   public Month getMonth() { throw new RuntimeException("Stub!"); }
/*  91 */   public int getDayOfMonth() { throw new RuntimeException("Stub!"); }
/*  92 */   public int getDayOfYear() { throw new RuntimeException("Stub!"); }
/*  93 */   public DayOfWeek getDayOfWeek() { throw new RuntimeException("Stub!"); }
/*  94 */   public LocalTime toLocalTime() { throw new RuntimeException("Stub!"); }
/*  95 */   public int getHour() { throw new RuntimeException("Stub!"); }
/*  96 */   public int getMinute() { throw new RuntimeException("Stub!"); }
/*  97 */   public int getSecond() { throw new RuntimeException("Stub!"); }
/*  98 */   public int getNano() { throw new RuntimeException("Stub!"); }
/*  99 */   public LocalDateTime with(TemporalAdjuster adjuster) { throw new RuntimeException("Stub!"); }
/* 100 */   public LocalDateTime with(TemporalField field, long newValue) { throw new RuntimeException("Stub!"); }
/* 101 */   public LocalDateTime withYear(int year) { throw new RuntimeException("Stub!"); }
/* 102 */   public LocalDateTime withMonth(int month) { throw new RuntimeException("Stub!"); }
/* 103 */   public LocalDateTime withDayOfMonth(int dayOfMonth) { throw new RuntimeException("Stub!"); }
/* 104 */   public LocalDateTime withDayOfYear(int dayOfYear) { throw new RuntimeException("Stub!"); }
/* 105 */   public LocalDateTime withHour(int hour) { throw new RuntimeException("Stub!"); }
/* 106 */   public LocalDateTime withMinute(int minute) { throw new RuntimeException("Stub!"); }
/* 107 */   public LocalDateTime withSecond(int second) { throw new RuntimeException("Stub!"); }
/* 108 */   public LocalDateTime withNano(int nanoOfSecond) { throw new RuntimeException("Stub!"); }
/* 109 */   public LocalDateTime truncatedTo(TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/* 110 */   public LocalDateTime plus(TemporalAmount amountToAdd) { throw new RuntimeException("Stub!"); }
/* 111 */   public LocalDateTime plus(long amountToAdd, TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/* 112 */   public LocalDateTime plusYears(long years) { throw new RuntimeException("Stub!"); }
/* 113 */   public LocalDateTime plusMonths(long months) { throw new RuntimeException("Stub!"); }
/* 114 */   public LocalDateTime plusWeeks(long weeks) { throw new RuntimeException("Stub!"); }
/* 115 */   public LocalDateTime plusDays(long days) { throw new RuntimeException("Stub!"); }
/* 116 */   public LocalDateTime plusHours(long hours) { throw new RuntimeException("Stub!"); }
/* 117 */   public LocalDateTime plusMinutes(long minutes) { throw new RuntimeException("Stub!"); }
/* 118 */   public LocalDateTime plusSeconds(long seconds) { throw new RuntimeException("Stub!"); }
/* 119 */   public LocalDateTime plusNanos(long nanos) { throw new RuntimeException("Stub!"); }
/* 120 */   public LocalDateTime minus(TemporalAmount amountToSubtract) { throw new RuntimeException("Stub!"); }
/* 121 */   public LocalDateTime minus(long amountToSubtract, TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/* 122 */   public LocalDateTime minusYears(long years) { throw new RuntimeException("Stub!"); }
/* 123 */   public LocalDateTime minusMonths(long months) { throw new RuntimeException("Stub!"); }
/* 124 */   public LocalDateTime minusWeeks(long weeks) { throw new RuntimeException("Stub!"); }
/* 125 */   public LocalDateTime minusDays(long days) { throw new RuntimeException("Stub!"); }
/* 126 */   public LocalDateTime minusHours(long hours) { throw new RuntimeException("Stub!"); }
/* 127 */   public LocalDateTime minusMinutes(long minutes) { throw new RuntimeException("Stub!"); }
/* 128 */   public LocalDateTime minusSeconds(long seconds) { throw new RuntimeException("Stub!"); }
/* 129 */   public LocalDateTime minusNanos(long nanos) { throw new RuntimeException("Stub!"); }
/*     */   
/* 131 */   public <R> R query(TemporalQuery<R> query) { throw new RuntimeException("Stub!"); }
/* 132 */   public Temporal adjustInto(Temporal temporal) { throw new RuntimeException("Stub!"); }
/* 133 */   public long until(Temporal endExclusive, TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/* 134 */   public String format(DateTimeFormatter formatter) { throw new RuntimeException("Stub!"); }
/* 135 */   public OffsetDateTime atOffset(ZoneOffset offset) { throw new RuntimeException("Stub!"); }
/* 136 */   public ZonedDateTime atZone(ZoneId zone) { throw new RuntimeException("Stub!"); }
/* 137 */   public int compareTo(ChronoLocalDateTime<?> other) { throw new RuntimeException("Stub!"); }
/* 138 */   public boolean isAfter(ChronoLocalDateTime<?> other) { throw new RuntimeException("Stub!"); }
/* 139 */   public boolean isBefore(ChronoLocalDateTime<?> other) { throw new RuntimeException("Stub!"); }
/* 140 */   public boolean isEqual(ChronoLocalDateTime<?> other) { throw new RuntimeException("Stub!"); }
/* 141 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 142 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 143 */   public String toString() { throw new RuntimeException("Stub!"); }
/*     */   
/*     */ 
/* 146 */   public static final LocalDateTime MIN = null; public static final LocalDateTime MAX = null;
/*     */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\time\LocalDateTime.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */