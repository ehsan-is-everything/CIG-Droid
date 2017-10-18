/*     */ package java.time;
/*     */ 
/*     */ import java.io.Serializable;
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
/*     */ 
/*     */ public final class Instant
/*     */   implements Temporal, TemporalAdjuster, Comparable<Instant>, Serializable
/*     */ {
/*  66 */   Instant() { throw new RuntimeException("Stub!"); }
/*  67 */   public static Instant now() { throw new RuntimeException("Stub!"); }
/*  68 */   public static Instant now(Clock clock) { throw new RuntimeException("Stub!"); }
/*  69 */   public static Instant ofEpochSecond(long epochSecond) { throw new RuntimeException("Stub!"); }
/*  70 */   public static Instant ofEpochSecond(long epochSecond, long nanoAdjustment) { throw new RuntimeException("Stub!"); }
/*  71 */   public static Instant ofEpochMilli(long epochMilli) { throw new RuntimeException("Stub!"); }
/*  72 */   public static Instant from(TemporalAccessor temporal) { throw new RuntimeException("Stub!"); }
/*  73 */   public static Instant parse(CharSequence text) { throw new RuntimeException("Stub!"); }
/*  74 */   public boolean isSupported(TemporalField field) { throw new RuntimeException("Stub!"); }
/*  75 */   public boolean isSupported(TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/*  76 */   public ValueRange range(TemporalField field) { throw new RuntimeException("Stub!"); }
/*  77 */   public int get(TemporalField field) { throw new RuntimeException("Stub!"); }
/*  78 */   public long getLong(TemporalField field) { throw new RuntimeException("Stub!"); }
/*  79 */   public long getEpochSecond() { throw new RuntimeException("Stub!"); }
/*  80 */   public int getNano() { throw new RuntimeException("Stub!"); }
/*  81 */   public Instant with(TemporalAdjuster adjuster) { throw new RuntimeException("Stub!"); }
/*  82 */   public Instant with(TemporalField field, long newValue) { throw new RuntimeException("Stub!"); }
/*  83 */   public Instant truncatedTo(TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/*  84 */   public Instant plus(TemporalAmount amountToAdd) { throw new RuntimeException("Stub!"); }
/*  85 */   public Instant plus(long amountToAdd, TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/*  86 */   public Instant plusSeconds(long secondsToAdd) { throw new RuntimeException("Stub!"); }
/*  87 */   public Instant plusMillis(long millisToAdd) { throw new RuntimeException("Stub!"); }
/*  88 */   public Instant plusNanos(long nanosToAdd) { throw new RuntimeException("Stub!"); }
/*  89 */   public Instant minus(TemporalAmount amountToSubtract) { throw new RuntimeException("Stub!"); }
/*  90 */   public Instant minus(long amountToSubtract, TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/*  91 */   public Instant minusSeconds(long secondsToSubtract) { throw new RuntimeException("Stub!"); }
/*  92 */   public Instant minusMillis(long millisToSubtract) { throw new RuntimeException("Stub!"); }
/*  93 */   public Instant minusNanos(long nanosToSubtract) { throw new RuntimeException("Stub!"); }
/*     */   
/*  95 */   public <R> R query(TemporalQuery<R> query) { throw new RuntimeException("Stub!"); }
/*  96 */   public Temporal adjustInto(Temporal temporal) { throw new RuntimeException("Stub!"); }
/*  97 */   public long until(Temporal endExclusive, TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/*  98 */   public OffsetDateTime atOffset(ZoneOffset offset) { throw new RuntimeException("Stub!"); }
/*  99 */   public ZonedDateTime atZone(ZoneId zone) { throw new RuntimeException("Stub!"); }
/* 100 */   public long toEpochMilli() { throw new RuntimeException("Stub!"); }
/* 101 */   public int compareTo(Instant otherInstant) { throw new RuntimeException("Stub!"); }
/* 102 */   public boolean isAfter(Instant otherInstant) { throw new RuntimeException("Stub!"); }
/* 103 */   public boolean isBefore(Instant otherInstant) { throw new RuntimeException("Stub!"); }
/* 104 */   public boolean equals(Object otherInstant) { throw new RuntimeException("Stub!"); }
/* 105 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 106 */   public String toString() { throw new RuntimeException("Stub!"); }
/*     */   
/*     */ 
/*     */ 
/* 110 */   public static final Instant MIN = null; public static final Instant MAX = null; public static final Instant EPOCH = null;
/*     */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\time\Instant.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */