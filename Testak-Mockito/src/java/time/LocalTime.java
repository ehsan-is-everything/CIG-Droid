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
/*     */ public final class LocalTime
/*     */   implements Temporal, TemporalAdjuster, Comparable<LocalTime>, Serializable
/*     */ {
/*  66 */   LocalTime() { throw new RuntimeException("Stub!"); }
/*  67 */   public static LocalTime now() { throw new RuntimeException("Stub!"); }
/*  68 */   public static LocalTime now(ZoneId zone) { throw new RuntimeException("Stub!"); }
/*  69 */   public static LocalTime now(Clock clock) { throw new RuntimeException("Stub!"); }
/*  70 */   public static LocalTime of(int hour, int minute) { throw new RuntimeException("Stub!"); }
/*  71 */   public static LocalTime of(int hour, int minute, int second) { throw new RuntimeException("Stub!"); }
/*  72 */   public static LocalTime of(int hour, int minute, int second, int nanoOfSecond) { throw new RuntimeException("Stub!"); }
/*  73 */   public static LocalTime ofSecondOfDay(long secondOfDay) { throw new RuntimeException("Stub!"); }
/*  74 */   public static LocalTime ofNanoOfDay(long nanoOfDay) { throw new RuntimeException("Stub!"); }
/*  75 */   public static LocalTime from(TemporalAccessor temporal) { throw new RuntimeException("Stub!"); }
/*  76 */   public static LocalTime parse(CharSequence text) { throw new RuntimeException("Stub!"); }
/*  77 */   public static LocalTime parse(CharSequence text, DateTimeFormatter formatter) { throw new RuntimeException("Stub!"); }
/*  78 */   public boolean isSupported(TemporalField field) { throw new RuntimeException("Stub!"); }
/*  79 */   public boolean isSupported(TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/*  80 */   public ValueRange range(TemporalField field) { throw new RuntimeException("Stub!"); }
/*  81 */   public int get(TemporalField field) { throw new RuntimeException("Stub!"); }
/*  82 */   public long getLong(TemporalField field) { throw new RuntimeException("Stub!"); }
/*  83 */   public int getHour() { throw new RuntimeException("Stub!"); }
/*  84 */   public int getMinute() { throw new RuntimeException("Stub!"); }
/*  85 */   public int getSecond() { throw new RuntimeException("Stub!"); }
/*  86 */   public int getNano() { throw new RuntimeException("Stub!"); }
/*  87 */   public LocalTime with(TemporalAdjuster adjuster) { throw new RuntimeException("Stub!"); }
/*  88 */   public LocalTime with(TemporalField field, long newValue) { throw new RuntimeException("Stub!"); }
/*  89 */   public LocalTime withHour(int hour) { throw new RuntimeException("Stub!"); }
/*  90 */   public LocalTime withMinute(int minute) { throw new RuntimeException("Stub!"); }
/*  91 */   public LocalTime withSecond(int second) { throw new RuntimeException("Stub!"); }
/*  92 */   public LocalTime withNano(int nanoOfSecond) { throw new RuntimeException("Stub!"); }
/*  93 */   public LocalTime truncatedTo(TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/*  94 */   public LocalTime plus(TemporalAmount amountToAdd) { throw new RuntimeException("Stub!"); }
/*  95 */   public LocalTime plus(long amountToAdd, TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/*  96 */   public LocalTime plusHours(long hoursToAdd) { throw new RuntimeException("Stub!"); }
/*  97 */   public LocalTime plusMinutes(long minutesToAdd) { throw new RuntimeException("Stub!"); }
/*  98 */   public LocalTime plusSeconds(long secondstoAdd) { throw new RuntimeException("Stub!"); }
/*  99 */   public LocalTime plusNanos(long nanosToAdd) { throw new RuntimeException("Stub!"); }
/* 100 */   public LocalTime minus(TemporalAmount amountToSubtract) { throw new RuntimeException("Stub!"); }
/* 101 */   public LocalTime minus(long amountToSubtract, TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/* 102 */   public LocalTime minusHours(long hoursToSubtract) { throw new RuntimeException("Stub!"); }
/* 103 */   public LocalTime minusMinutes(long minutesToSubtract) { throw new RuntimeException("Stub!"); }
/* 104 */   public LocalTime minusSeconds(long secondsToSubtract) { throw new RuntimeException("Stub!"); }
/* 105 */   public LocalTime minusNanos(long nanosToSubtract) { throw new RuntimeException("Stub!"); }
/*     */   
/* 107 */   public <R> R query(TemporalQuery<R> query) { throw new RuntimeException("Stub!"); }
/* 108 */   public Temporal adjustInto(Temporal temporal) { throw new RuntimeException("Stub!"); }
/* 109 */   public long until(Temporal endExclusive, TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/* 110 */   public String format(DateTimeFormatter formatter) { throw new RuntimeException("Stub!"); }
/* 111 */   public LocalDateTime atDate(LocalDate date) { throw new RuntimeException("Stub!"); }
/* 112 */   public OffsetTime atOffset(ZoneOffset offset) { throw new RuntimeException("Stub!"); }
/* 113 */   public int toSecondOfDay() { throw new RuntimeException("Stub!"); }
/* 114 */   public long toNanoOfDay() { throw new RuntimeException("Stub!"); }
/* 115 */   public int compareTo(LocalTime other) { throw new RuntimeException("Stub!"); }
/* 116 */   public boolean isAfter(LocalTime other) { throw new RuntimeException("Stub!"); }
/* 117 */   public boolean isBefore(LocalTime other) { throw new RuntimeException("Stub!"); }
/* 118 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 119 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 120 */   public String toString() { throw new RuntimeException("Stub!"); }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/* 125 */   public static final LocalTime NOON = null; public static final LocalTime MIN = null; public static final LocalTime MIDNIGHT = null; public static final LocalTime MAX = null;
/*     */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\time\LocalTime.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */