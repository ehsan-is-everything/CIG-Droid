/*     */ package java.time;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.time.chrono.ChronoZonedDateTime;
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
/*     */ public final class ZonedDateTime
/*     */   implements Temporal, ChronoZonedDateTime<LocalDate>, Serializable
/*     */ {
/*  66 */   ZonedDateTime() { throw new RuntimeException("Stub!"); }
/*  67 */   public static ZonedDateTime now() { throw new RuntimeException("Stub!"); }
/*  68 */   public static ZonedDateTime now(ZoneId zone) { throw new RuntimeException("Stub!"); }
/*  69 */   public static ZonedDateTime now(Clock clock) { throw new RuntimeException("Stub!"); }
/*  70 */   public static ZonedDateTime of(LocalDate date, LocalTime time, ZoneId zone) { throw new RuntimeException("Stub!"); }
/*  71 */   public static ZonedDateTime of(LocalDateTime localDateTime, ZoneId zone) { throw new RuntimeException("Stub!"); }
/*  72 */   public static ZonedDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second, int nanoOfSecond, ZoneId zone) { throw new RuntimeException("Stub!"); }
/*  73 */   public static ZonedDateTime ofLocal(LocalDateTime localDateTime, ZoneId zone, ZoneOffset preferredOffset) { throw new RuntimeException("Stub!"); }
/*  74 */   public static ZonedDateTime ofInstant(Instant instant, ZoneId zone) { throw new RuntimeException("Stub!"); }
/*  75 */   public static ZonedDateTime ofInstant(LocalDateTime localDateTime, ZoneOffset offset, ZoneId zone) { throw new RuntimeException("Stub!"); }
/*  76 */   public static ZonedDateTime ofStrict(LocalDateTime localDateTime, ZoneOffset offset, ZoneId zone) { throw new RuntimeException("Stub!"); }
/*  77 */   public static ZonedDateTime from(TemporalAccessor temporal) { throw new RuntimeException("Stub!"); }
/*  78 */   public static ZonedDateTime parse(CharSequence text) { throw new RuntimeException("Stub!"); }
/*  79 */   public static ZonedDateTime parse(CharSequence text, DateTimeFormatter formatter) { throw new RuntimeException("Stub!"); }
/*  80 */   public boolean isSupported(TemporalField field) { throw new RuntimeException("Stub!"); }
/*  81 */   public boolean isSupported(TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/*  82 */   public ValueRange range(TemporalField field) { throw new RuntimeException("Stub!"); }
/*  83 */   public int get(TemporalField field) { throw new RuntimeException("Stub!"); }
/*  84 */   public long getLong(TemporalField field) { throw new RuntimeException("Stub!"); }
/*  85 */   public ZoneOffset getOffset() { throw new RuntimeException("Stub!"); }
/*  86 */   public ZonedDateTime withEarlierOffsetAtOverlap() { throw new RuntimeException("Stub!"); }
/*  87 */   public ZonedDateTime withLaterOffsetAtOverlap() { throw new RuntimeException("Stub!"); }
/*  88 */   public ZoneId getZone() { throw new RuntimeException("Stub!"); }
/*  89 */   public ZonedDateTime withZoneSameLocal(ZoneId zone) { throw new RuntimeException("Stub!"); }
/*  90 */   public ZonedDateTime withZoneSameInstant(ZoneId zone) { throw new RuntimeException("Stub!"); }
/*  91 */   public ZonedDateTime withFixedOffsetZone() { throw new RuntimeException("Stub!"); }
/*  92 */   public LocalDateTime toLocalDateTime() { throw new RuntimeException("Stub!"); }
/*  93 */   public LocalDate toLocalDate() { throw new RuntimeException("Stub!"); }
/*  94 */   public int getYear() { throw new RuntimeException("Stub!"); }
/*  95 */   public int getMonthValue() { throw new RuntimeException("Stub!"); }
/*  96 */   public Month getMonth() { throw new RuntimeException("Stub!"); }
/*  97 */   public int getDayOfMonth() { throw new RuntimeException("Stub!"); }
/*  98 */   public int getDayOfYear() { throw new RuntimeException("Stub!"); }
/*  99 */   public DayOfWeek getDayOfWeek() { throw new RuntimeException("Stub!"); }
/* 100 */   public LocalTime toLocalTime() { throw new RuntimeException("Stub!"); }
/* 101 */   public int getHour() { throw new RuntimeException("Stub!"); }
/* 102 */   public int getMinute() { throw new RuntimeException("Stub!"); }
/* 103 */   public int getSecond() { throw new RuntimeException("Stub!"); }
/* 104 */   public int getNano() { throw new RuntimeException("Stub!"); }
/* 105 */   public ZonedDateTime with(TemporalAdjuster adjuster) { throw new RuntimeException("Stub!"); }
/* 106 */   public ZonedDateTime with(TemporalField field, long newValue) { throw new RuntimeException("Stub!"); }
/* 107 */   public ZonedDateTime withYear(int year) { throw new RuntimeException("Stub!"); }
/* 108 */   public ZonedDateTime withMonth(int month) { throw new RuntimeException("Stub!"); }
/* 109 */   public ZonedDateTime withDayOfMonth(int dayOfMonth) { throw new RuntimeException("Stub!"); }
/* 110 */   public ZonedDateTime withDayOfYear(int dayOfYear) { throw new RuntimeException("Stub!"); }
/* 111 */   public ZonedDateTime withHour(int hour) { throw new RuntimeException("Stub!"); }
/* 112 */   public ZonedDateTime withMinute(int minute) { throw new RuntimeException("Stub!"); }
/* 113 */   public ZonedDateTime withSecond(int second) { throw new RuntimeException("Stub!"); }
/* 114 */   public ZonedDateTime withNano(int nanoOfSecond) { throw new RuntimeException("Stub!"); }
/* 115 */   public ZonedDateTime truncatedTo(TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/* 116 */   public ZonedDateTime plus(TemporalAmount amountToAdd) { throw new RuntimeException("Stub!"); }
/* 117 */   public ZonedDateTime plus(long amountToAdd, TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/* 118 */   public ZonedDateTime plusYears(long years) { throw new RuntimeException("Stub!"); }
/* 119 */   public ZonedDateTime plusMonths(long months) { throw new RuntimeException("Stub!"); }
/* 120 */   public ZonedDateTime plusWeeks(long weeks) { throw new RuntimeException("Stub!"); }
/* 121 */   public ZonedDateTime plusDays(long days) { throw new RuntimeException("Stub!"); }
/* 122 */   public ZonedDateTime plusHours(long hours) { throw new RuntimeException("Stub!"); }
/* 123 */   public ZonedDateTime plusMinutes(long minutes) { throw new RuntimeException("Stub!"); }
/* 124 */   public ZonedDateTime plusSeconds(long seconds) { throw new RuntimeException("Stub!"); }
/* 125 */   public ZonedDateTime plusNanos(long nanos) { throw new RuntimeException("Stub!"); }
/* 126 */   public ZonedDateTime minus(TemporalAmount amountToSubtract) { throw new RuntimeException("Stub!"); }
/* 127 */   public ZonedDateTime minus(long amountToSubtract, TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/* 128 */   public ZonedDateTime minusYears(long years) { throw new RuntimeException("Stub!"); }
/* 129 */   public ZonedDateTime minusMonths(long months) { throw new RuntimeException("Stub!"); }
/* 130 */   public ZonedDateTime minusWeeks(long weeks) { throw new RuntimeException("Stub!"); }
/* 131 */   public ZonedDateTime minusDays(long days) { throw new RuntimeException("Stub!"); }
/* 132 */   public ZonedDateTime minusHours(long hours) { throw new RuntimeException("Stub!"); }
/* 133 */   public ZonedDateTime minusMinutes(long minutes) { throw new RuntimeException("Stub!"); }
/* 134 */   public ZonedDateTime minusSeconds(long seconds) { throw new RuntimeException("Stub!"); }
/* 135 */   public ZonedDateTime minusNanos(long nanos) { throw new RuntimeException("Stub!"); }
/*     */   
/* 137 */   public <R> R query(TemporalQuery<R> query) { throw new RuntimeException("Stub!"); }
/* 138 */   public long until(Temporal endExclusive, TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/* 139 */   public String format(DateTimeFormatter formatter) { throw new RuntimeException("Stub!"); }
/* 140 */   public OffsetDateTime toOffsetDateTime() { throw new RuntimeException("Stub!"); }
/* 141 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 142 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 143 */   public String toString() { throw new RuntimeException("Stub!"); }
/*     */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\time\ZonedDateTime.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */