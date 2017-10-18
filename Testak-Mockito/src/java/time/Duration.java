/*     */ package java.time;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.time.temporal.Temporal;
/*     */ import java.time.temporal.TemporalAmount;
/*     */ import java.time.temporal.TemporalUnit;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class Duration
/*     */   implements TemporalAmount, Comparable<Duration>, Serializable
/*     */ {
/*  66 */   Duration() { throw new RuntimeException("Stub!"); }
/*  67 */   public static Duration ofDays(long days) { throw new RuntimeException("Stub!"); }
/*  68 */   public static Duration ofHours(long hours) { throw new RuntimeException("Stub!"); }
/*  69 */   public static Duration ofMinutes(long minutes) { throw new RuntimeException("Stub!"); }
/*  70 */   public static Duration ofSeconds(long seconds) { throw new RuntimeException("Stub!"); }
/*  71 */   public static Duration ofSeconds(long seconds, long nanoAdjustment) { throw new RuntimeException("Stub!"); }
/*  72 */   public static Duration ofMillis(long millis) { throw new RuntimeException("Stub!"); }
/*  73 */   public static Duration ofNanos(long nanos) { throw new RuntimeException("Stub!"); }
/*  74 */   public static Duration of(long amount, TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/*  75 */   public static Duration from(TemporalAmount amount) { throw new RuntimeException("Stub!"); }
/*  76 */   public static Duration parse(CharSequence text) { throw new RuntimeException("Stub!"); }
/*  77 */   public static Duration between(Temporal startInclusive, Temporal endExclusive) { throw new RuntimeException("Stub!"); }
/*  78 */   public long get(TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/*  79 */   public List<TemporalUnit> getUnits() { throw new RuntimeException("Stub!"); }
/*  80 */   public boolean isZero() { throw new RuntimeException("Stub!"); }
/*  81 */   public boolean isNegative() { throw new RuntimeException("Stub!"); }
/*  82 */   public long getSeconds() { throw new RuntimeException("Stub!"); }
/*  83 */   public int getNano() { throw new RuntimeException("Stub!"); }
/*  84 */   public Duration withSeconds(long seconds) { throw new RuntimeException("Stub!"); }
/*  85 */   public Duration withNanos(int nanoOfSecond) { throw new RuntimeException("Stub!"); }
/*  86 */   public Duration plus(Duration duration) { throw new RuntimeException("Stub!"); }
/*  87 */   public Duration plus(long amountToAdd, TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/*  88 */   public Duration plusDays(long daysToAdd) { throw new RuntimeException("Stub!"); }
/*  89 */   public Duration plusHours(long hoursToAdd) { throw new RuntimeException("Stub!"); }
/*  90 */   public Duration plusMinutes(long minutesToAdd) { throw new RuntimeException("Stub!"); }
/*  91 */   public Duration plusSeconds(long secondsToAdd) { throw new RuntimeException("Stub!"); }
/*  92 */   public Duration plusMillis(long millisToAdd) { throw new RuntimeException("Stub!"); }
/*  93 */   public Duration plusNanos(long nanosToAdd) { throw new RuntimeException("Stub!"); }
/*  94 */   public Duration minus(Duration duration) { throw new RuntimeException("Stub!"); }
/*  95 */   public Duration minus(long amountToSubtract, TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/*  96 */   public Duration minusDays(long daysToSubtract) { throw new RuntimeException("Stub!"); }
/*  97 */   public Duration minusHours(long hoursToSubtract) { throw new RuntimeException("Stub!"); }
/*  98 */   public Duration minusMinutes(long minutesToSubtract) { throw new RuntimeException("Stub!"); }
/*  99 */   public Duration minusSeconds(long secondsToSubtract) { throw new RuntimeException("Stub!"); }
/* 100 */   public Duration minusMillis(long millisToSubtract) { throw new RuntimeException("Stub!"); }
/* 101 */   public Duration minusNanos(long nanosToSubtract) { throw new RuntimeException("Stub!"); }
/* 102 */   public Duration multipliedBy(long multiplicand) { throw new RuntimeException("Stub!"); }
/* 103 */   public Duration dividedBy(long divisor) { throw new RuntimeException("Stub!"); }
/* 104 */   public Duration negated() { throw new RuntimeException("Stub!"); }
/* 105 */   public Duration abs() { throw new RuntimeException("Stub!"); }
/* 106 */   public Temporal addTo(Temporal temporal) { throw new RuntimeException("Stub!"); }
/* 107 */   public Temporal subtractFrom(Temporal temporal) { throw new RuntimeException("Stub!"); }
/* 108 */   public long toDays() { throw new RuntimeException("Stub!"); }
/* 109 */   public long toHours() { throw new RuntimeException("Stub!"); }
/* 110 */   public long toMinutes() { throw new RuntimeException("Stub!"); }
/* 111 */   public long toMillis() { throw new RuntimeException("Stub!"); }
/* 112 */   public long toNanos() { throw new RuntimeException("Stub!"); }
/* 113 */   public int compareTo(Duration otherDuration) { throw new RuntimeException("Stub!"); }
/* 114 */   public boolean equals(Object otherDuration) { throw new RuntimeException("Stub!"); }
/* 115 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 116 */   public String toString() { throw new RuntimeException("Stub!"); }
/*     */   
/* 118 */   public static final Duration ZERO = null;
/*     */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\time\Duration.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */