/*    */ package java.time.chrono;
/*    */ 
/*    */ import java.time.LocalTime;
/*    */ import java.time.format.DateTimeFormatter;
/*    */ import java.time.temporal.Temporal;
/*    */ import java.time.temporal.TemporalAccessor;
/*    */ import java.time.temporal.TemporalAdjuster;
/*    */ import java.time.temporal.TemporalAmount;
/*    */ import java.time.temporal.TemporalField;
/*    */ import java.time.temporal.TemporalQuery;
/*    */ import java.time.temporal.TemporalUnit;
/*    */ import java.util.Comparator;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract interface ChronoLocalDate
/*    */   extends Temporal, TemporalAdjuster, Comparable<ChronoLocalDate>
/*    */ {
/* 66 */   public static Comparator<ChronoLocalDate> timeLineOrder() { throw new RuntimeException("Stub!"); }
/* 67 */   public static ChronoLocalDate from(TemporalAccessor temporal) { throw new RuntimeException("Stub!"); }
/*    */   public abstract Chronology getChronology();
/* 69 */   public Era getEra() { throw new RuntimeException("Stub!"); }
/* 70 */   public boolean isLeapYear() { throw new RuntimeException("Stub!"); }
/*    */   public abstract int lengthOfMonth();
/* 72 */   public int lengthOfYear() { throw new RuntimeException("Stub!"); }
/* 73 */   public boolean isSupported(TemporalField field) { throw new RuntimeException("Stub!"); }
/* 74 */   public boolean isSupported(TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/* 75 */   public ChronoLocalDate with(TemporalAdjuster adjuster) { throw new RuntimeException("Stub!"); }
/* 76 */   public ChronoLocalDate with(TemporalField field, long newValue) { throw new RuntimeException("Stub!"); }
/* 77 */   public ChronoLocalDate plus(TemporalAmount amount) { throw new RuntimeException("Stub!"); }
/* 78 */   public ChronoLocalDate plus(long amountToAdd, TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/* 79 */   public ChronoLocalDate minus(TemporalAmount amount) { throw new RuntimeException("Stub!"); }
/* 80 */   public ChronoLocalDate minus(long amountToSubtract, TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/*    */   
/* 82 */   public <R> R query(TemporalQuery<R> query) { throw new RuntimeException("Stub!"); }
/* 83 */   public Temporal adjustInto(Temporal temporal) { throw new RuntimeException("Stub!"); }
/*    */   public abstract long until(Temporal paramTemporal, TemporalUnit paramTemporalUnit);
/*    */   public abstract ChronoPeriod until(ChronoLocalDate paramChronoLocalDate);
/* 86 */   public String format(DateTimeFormatter formatter) { throw new RuntimeException("Stub!"); }
/*    */   
/* 88 */   public ChronoLocalDateTime<?> atTime(LocalTime localTime) { throw new RuntimeException("Stub!"); }
/* 89 */   public long toEpochDay() { throw new RuntimeException("Stub!"); }
/* 90 */   public int compareTo(ChronoLocalDate other) { throw new RuntimeException("Stub!"); }
/* 91 */   public boolean isAfter(ChronoLocalDate other) { throw new RuntimeException("Stub!"); }
/* 92 */   public boolean isBefore(ChronoLocalDate other) { throw new RuntimeException("Stub!"); }
/* 93 */   public boolean isEqual(ChronoLocalDate other) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract boolean equals(Object paramObject);
/*    */   
/*    */   public abstract int hashCode();
/*    */   
/*    */   public abstract String toString();
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\time\chrono\ChronoLocalDate.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */