/*     */ package java.time;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.time.chrono.ChronoPeriod;
/*     */ import java.time.chrono.IsoChronology;
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
/*     */ public final class Period
/*     */   implements ChronoPeriod, Serializable
/*     */ {
/*  66 */   Period() { throw new RuntimeException("Stub!"); }
/*  67 */   public static Period ofYears(int years) { throw new RuntimeException("Stub!"); }
/*  68 */   public static Period ofMonths(int months) { throw new RuntimeException("Stub!"); }
/*  69 */   public static Period ofWeeks(int weeks) { throw new RuntimeException("Stub!"); }
/*  70 */   public static Period ofDays(int days) { throw new RuntimeException("Stub!"); }
/*  71 */   public static Period of(int years, int months, int days) { throw new RuntimeException("Stub!"); }
/*  72 */   public static Period from(TemporalAmount amount) { throw new RuntimeException("Stub!"); }
/*  73 */   public static Period parse(CharSequence text) { throw new RuntimeException("Stub!"); }
/*  74 */   public static Period between(LocalDate startDateInclusive, LocalDate endDateExclusive) { throw new RuntimeException("Stub!"); }
/*  75 */   public long get(TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/*  76 */   public List<TemporalUnit> getUnits() { throw new RuntimeException("Stub!"); }
/*  77 */   public IsoChronology getChronology() { throw new RuntimeException("Stub!"); }
/*  78 */   public boolean isZero() { throw new RuntimeException("Stub!"); }
/*  79 */   public boolean isNegative() { throw new RuntimeException("Stub!"); }
/*  80 */   public int getYears() { throw new RuntimeException("Stub!"); }
/*  81 */   public int getMonths() { throw new RuntimeException("Stub!"); }
/*  82 */   public int getDays() { throw new RuntimeException("Stub!"); }
/*  83 */   public Period withYears(int years) { throw new RuntimeException("Stub!"); }
/*  84 */   public Period withMonths(int months) { throw new RuntimeException("Stub!"); }
/*  85 */   public Period withDays(int days) { throw new RuntimeException("Stub!"); }
/*  86 */   public Period plus(TemporalAmount amountToAdd) { throw new RuntimeException("Stub!"); }
/*  87 */   public Period plusYears(long yearsToAdd) { throw new RuntimeException("Stub!"); }
/*  88 */   public Period plusMonths(long monthsToAdd) { throw new RuntimeException("Stub!"); }
/*  89 */   public Period plusDays(long daysToAdd) { throw new RuntimeException("Stub!"); }
/*  90 */   public Period minus(TemporalAmount amountToSubtract) { throw new RuntimeException("Stub!"); }
/*  91 */   public Period minusYears(long yearsToSubtract) { throw new RuntimeException("Stub!"); }
/*  92 */   public Period minusMonths(long monthsToSubtract) { throw new RuntimeException("Stub!"); }
/*  93 */   public Period minusDays(long daysToSubtract) { throw new RuntimeException("Stub!"); }
/*  94 */   public Period multipliedBy(int scalar) { throw new RuntimeException("Stub!"); }
/*  95 */   public Period negated() { throw new RuntimeException("Stub!"); }
/*  96 */   public Period normalized() { throw new RuntimeException("Stub!"); }
/*  97 */   public long toTotalMonths() { throw new RuntimeException("Stub!"); }
/*  98 */   public Temporal addTo(Temporal temporal) { throw new RuntimeException("Stub!"); }
/*  99 */   public Temporal subtractFrom(Temporal temporal) { throw new RuntimeException("Stub!"); }
/* 100 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 101 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 102 */   public String toString() { throw new RuntimeException("Stub!"); }
/*     */   
/* 104 */   public static final Period ZERO = null;
/*     */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\time\Period.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */