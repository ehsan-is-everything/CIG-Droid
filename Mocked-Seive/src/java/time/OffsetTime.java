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
/*     */ public final class OffsetTime
/*     */   implements Temporal, TemporalAdjuster, Comparable<OffsetTime>, Serializable
/*     */ {
/*  66 */   OffsetTime() { throw new RuntimeException("Stub!"); }
/*  67 */   public static OffsetTime now() { throw new RuntimeException("Stub!"); }
/*  68 */   public static OffsetTime now(ZoneId zone) { throw new RuntimeException("Stub!"); }
/*  69 */   public static OffsetTime now(Clock clock) { throw new RuntimeException("Stub!"); }
/*  70 */   public static OffsetTime of(LocalTime time, ZoneOffset offset) { throw new RuntimeException("Stub!"); }
/*  71 */   public static OffsetTime of(int hour, int minute, int second, int nanoOfSecond, ZoneOffset offset) { throw new RuntimeException("Stub!"); }
/*  72 */   public static OffsetTime ofInstant(Instant instant, ZoneId zone) { throw new RuntimeException("Stub!"); }
/*  73 */   public static OffsetTime from(TemporalAccessor temporal) { throw new RuntimeException("Stub!"); }
/*  74 */   public static OffsetTime parse(CharSequence text) { throw new RuntimeException("Stub!"); }
/*  75 */   public static OffsetTime parse(CharSequence text, DateTimeFormatter formatter) { throw new RuntimeException("Stub!"); }
/*  76 */   public boolean isSupported(TemporalField field) { throw new RuntimeException("Stub!"); }
/*  77 */   public boolean isSupported(TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/*  78 */   public ValueRange range(TemporalField field) { throw new RuntimeException("Stub!"); }
/*  79 */   public int get(TemporalField field) { throw new RuntimeException("Stub!"); }
/*  80 */   public long getLong(TemporalField field) { throw new RuntimeException("Stub!"); }
/*  81 */   public ZoneOffset getOffset() { throw new RuntimeException("Stub!"); }
/*  82 */   public OffsetTime withOffsetSameLocal(ZoneOffset offset) { throw new RuntimeException("Stub!"); }
/*  83 */   public OffsetTime withOffsetSameInstant(ZoneOffset offset) { throw new RuntimeException("Stub!"); }
/*  84 */   public LocalTime toLocalTime() { throw new RuntimeException("Stub!"); }
/*  85 */   public int getHour() { throw new RuntimeException("Stub!"); }
/*  86 */   public int getMinute() { throw new RuntimeException("Stub!"); }
/*  87 */   public int getSecond() { throw new RuntimeException("Stub!"); }
/*  88 */   public int getNano() { throw new RuntimeException("Stub!"); }
/*  89 */   public OffsetTime with(TemporalAdjuster adjuster) { throw new RuntimeException("Stub!"); }
/*  90 */   public OffsetTime with(TemporalField field, long newValue) { throw new RuntimeException("Stub!"); }
/*  91 */   public OffsetTime withHour(int hour) { throw new RuntimeException("Stub!"); }
/*  92 */   public OffsetTime withMinute(int minute) { throw new RuntimeException("Stub!"); }
/*  93 */   public OffsetTime withSecond(int second) { throw new RuntimeException("Stub!"); }
/*  94 */   public OffsetTime withNano(int nanoOfSecond) { throw new RuntimeException("Stub!"); }
/*  95 */   public OffsetTime truncatedTo(TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/*  96 */   public OffsetTime plus(TemporalAmount amountToAdd) { throw new RuntimeException("Stub!"); }
/*  97 */   public OffsetTime plus(long amountToAdd, TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/*  98 */   public OffsetTime plusHours(long hours) { throw new RuntimeException("Stub!"); }
/*  99 */   public OffsetTime plusMinutes(long minutes) { throw new RuntimeException("Stub!"); }
/* 100 */   public OffsetTime plusSeconds(long seconds) { throw new RuntimeException("Stub!"); }
/* 101 */   public OffsetTime plusNanos(long nanos) { throw new RuntimeException("Stub!"); }
/* 102 */   public OffsetTime minus(TemporalAmount amountToSubtract) { throw new RuntimeException("Stub!"); }
/* 103 */   public OffsetTime minus(long amountToSubtract, TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/* 104 */   public OffsetTime minusHours(long hours) { throw new RuntimeException("Stub!"); }
/* 105 */   public OffsetTime minusMinutes(long minutes) { throw new RuntimeException("Stub!"); }
/* 106 */   public OffsetTime minusSeconds(long seconds) { throw new RuntimeException("Stub!"); }
/* 107 */   public OffsetTime minusNanos(long nanos) { throw new RuntimeException("Stub!"); }
/*     */   
/* 109 */   public <R> R query(TemporalQuery<R> query) { throw new RuntimeException("Stub!"); }
/* 110 */   public Temporal adjustInto(Temporal temporal) { throw new RuntimeException("Stub!"); }
/* 111 */   public long until(Temporal endExclusive, TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/* 112 */   public String format(DateTimeFormatter formatter) { throw new RuntimeException("Stub!"); }
/* 113 */   public OffsetDateTime atDate(LocalDate date) { throw new RuntimeException("Stub!"); }
/* 114 */   public int compareTo(OffsetTime other) { throw new RuntimeException("Stub!"); }
/* 115 */   public boolean isAfter(OffsetTime other) { throw new RuntimeException("Stub!"); }
/* 116 */   public boolean isBefore(OffsetTime other) { throw new RuntimeException("Stub!"); }
/* 117 */   public boolean isEqual(OffsetTime other) { throw new RuntimeException("Stub!"); }
/* 118 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 119 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 120 */   public String toString() { throw new RuntimeException("Stub!"); }
/*     */   
/*     */ 
/* 123 */   public static final OffsetTime MIN = null; public static final OffsetTime MAX = null;
/*     */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\time\OffsetTime.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */