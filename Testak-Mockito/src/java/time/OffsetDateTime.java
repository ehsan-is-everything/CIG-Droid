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
/*     */ import java.util.Comparator;
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
/*     */ public final class OffsetDateTime
/*     */   implements Temporal, TemporalAdjuster, Comparable<OffsetDateTime>, Serializable
/*     */ {
/*  66 */   OffsetDateTime() { throw new RuntimeException("Stub!"); }
/*  67 */   public static Comparator<OffsetDateTime> timeLineOrder() { throw new RuntimeException("Stub!"); }
/*  68 */   public static OffsetDateTime now() { throw new RuntimeException("Stub!"); }
/*  69 */   public static OffsetDateTime now(ZoneId zone) { throw new RuntimeException("Stub!"); }
/*  70 */   public static OffsetDateTime now(Clock clock) { throw new RuntimeException("Stub!"); }
/*  71 */   public static OffsetDateTime of(LocalDate date, LocalTime time, ZoneOffset offset) { throw new RuntimeException("Stub!"); }
/*  72 */   public static OffsetDateTime of(LocalDateTime dateTime, ZoneOffset offset) { throw new RuntimeException("Stub!"); }
/*  73 */   public static OffsetDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second, int nanoOfSecond, ZoneOffset offset) { throw new RuntimeException("Stub!"); }
/*  74 */   public static OffsetDateTime ofInstant(Instant instant, ZoneId zone) { throw new RuntimeException("Stub!"); }
/*  75 */   public static OffsetDateTime from(TemporalAccessor temporal) { throw new RuntimeException("Stub!"); }
/*  76 */   public static OffsetDateTime parse(CharSequence text) { throw new RuntimeException("Stub!"); }
/*  77 */   public static OffsetDateTime parse(CharSequence text, DateTimeFormatter formatter) { throw new RuntimeException("Stub!"); }
/*  78 */   public boolean isSupported(TemporalField field) { throw new RuntimeException("Stub!"); }
/*  79 */   public boolean isSupported(TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/*  80 */   public ValueRange range(TemporalField field) { throw new RuntimeException("Stub!"); }
/*  81 */   public int get(TemporalField field) { throw new RuntimeException("Stub!"); }
/*  82 */   public long getLong(TemporalField field) { throw new RuntimeException("Stub!"); }
/*  83 */   public ZoneOffset getOffset() { throw new RuntimeException("Stub!"); }
/*  84 */   public OffsetDateTime withOffsetSameLocal(ZoneOffset offset) { throw new RuntimeException("Stub!"); }
/*  85 */   public OffsetDateTime withOffsetSameInstant(ZoneOffset offset) { throw new RuntimeException("Stub!"); }
/*  86 */   public LocalDateTime toLocalDateTime() { throw new RuntimeException("Stub!"); }
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
/*  99 */   public OffsetDateTime with(TemporalAdjuster adjuster) { throw new RuntimeException("Stub!"); }
/* 100 */   public OffsetDateTime with(TemporalField field, long newValue) { throw new RuntimeException("Stub!"); }
/* 101 */   public OffsetDateTime withYear(int year) { throw new RuntimeException("Stub!"); }
/* 102 */   public OffsetDateTime withMonth(int month) { throw new RuntimeException("Stub!"); }
/* 103 */   public OffsetDateTime withDayOfMonth(int dayOfMonth) { throw new RuntimeException("Stub!"); }
/* 104 */   public OffsetDateTime withDayOfYear(int dayOfYear) { throw new RuntimeException("Stub!"); }
/* 105 */   public OffsetDateTime withHour(int hour) { throw new RuntimeException("Stub!"); }
/* 106 */   public OffsetDateTime withMinute(int minute) { throw new RuntimeException("Stub!"); }
/* 107 */   public OffsetDateTime withSecond(int second) { throw new RuntimeException("Stub!"); }
/* 108 */   public OffsetDateTime withNano(int nanoOfSecond) { throw new RuntimeException("Stub!"); }
/* 109 */   public OffsetDateTime truncatedTo(TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/* 110 */   public OffsetDateTime plus(TemporalAmount amountToAdd) { throw new RuntimeException("Stub!"); }
/* 111 */   public OffsetDateTime plus(long amountToAdd, TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/* 112 */   public OffsetDateTime plusYears(long years) { throw new RuntimeException("Stub!"); }
/* 113 */   public OffsetDateTime plusMonths(long months) { throw new RuntimeException("Stub!"); }
/* 114 */   public OffsetDateTime plusWeeks(long weeks) { throw new RuntimeException("Stub!"); }
/* 115 */   public OffsetDateTime plusDays(long days) { throw new RuntimeException("Stub!"); }
/* 116 */   public OffsetDateTime plusHours(long hours) { throw new RuntimeException("Stub!"); }
/* 117 */   public OffsetDateTime plusMinutes(long minutes) { throw new RuntimeException("Stub!"); }
/* 118 */   public OffsetDateTime plusSeconds(long seconds) { throw new RuntimeException("Stub!"); }
/* 119 */   public OffsetDateTime plusNanos(long nanos) { throw new RuntimeException("Stub!"); }
/* 120 */   public OffsetDateTime minus(TemporalAmount amountToSubtract) { throw new RuntimeException("Stub!"); }
/* 121 */   public OffsetDateTime minus(long amountToSubtract, TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/* 122 */   public OffsetDateTime minusYears(long years) { throw new RuntimeException("Stub!"); }
/* 123 */   public OffsetDateTime minusMonths(long months) { throw new RuntimeException("Stub!"); }
/* 124 */   public OffsetDateTime minusWeeks(long weeks) { throw new RuntimeException("Stub!"); }
/* 125 */   public OffsetDateTime minusDays(long days) { throw new RuntimeException("Stub!"); }
/* 126 */   public OffsetDateTime minusHours(long hours) { throw new RuntimeException("Stub!"); }
/* 127 */   public OffsetDateTime minusMinutes(long minutes) { throw new RuntimeException("Stub!"); }
/* 128 */   public OffsetDateTime minusSeconds(long seconds) { throw new RuntimeException("Stub!"); }
/* 129 */   public OffsetDateTime minusNanos(long nanos) { throw new RuntimeException("Stub!"); }
/*     */   
/* 131 */   public <R> R query(TemporalQuery<R> query) { throw new RuntimeException("Stub!"); }
/* 132 */   public Temporal adjustInto(Temporal temporal) { throw new RuntimeException("Stub!"); }
/* 133 */   public long until(Temporal endExclusive, TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/* 134 */   public String format(DateTimeFormatter formatter) { throw new RuntimeException("Stub!"); }
/* 135 */   public ZonedDateTime atZoneSameInstant(ZoneId zone) { throw new RuntimeException("Stub!"); }
/* 136 */   public ZonedDateTime atZoneSimilarLocal(ZoneId zone) { throw new RuntimeException("Stub!"); }
/* 137 */   public OffsetTime toOffsetTime() { throw new RuntimeException("Stub!"); }
/* 138 */   public ZonedDateTime toZonedDateTime() { throw new RuntimeException("Stub!"); }
/* 139 */   public Instant toInstant() { throw new RuntimeException("Stub!"); }
/* 140 */   public long toEpochSecond() { throw new RuntimeException("Stub!"); }
/* 141 */   public int compareTo(OffsetDateTime other) { throw new RuntimeException("Stub!"); }
/* 142 */   public boolean isAfter(OffsetDateTime other) { throw new RuntimeException("Stub!"); }
/* 143 */   public boolean isBefore(OffsetDateTime other) { throw new RuntimeException("Stub!"); }
/* 144 */   public boolean isEqual(OffsetDateTime other) { throw new RuntimeException("Stub!"); }
/* 145 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 146 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 147 */   public String toString() { throw new RuntimeException("Stub!"); }
/*     */   
/*     */ 
/* 150 */   public static final OffsetDateTime MIN = null; public static final OffsetDateTime MAX = null;
/*     */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\time\OffsetDateTime.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */