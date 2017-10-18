/*    */ package java.time.chrono;
/*    */ 
/*    */ import java.time.Instant;
/*    */ import java.time.LocalTime;
/*    */ import java.time.ZoneId;
/*    */ import java.time.ZoneOffset;
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
/*    */ public abstract interface ChronoLocalDateTime<D extends ChronoLocalDate>
/*    */   extends Temporal, TemporalAdjuster, Comparable<ChronoLocalDateTime<?>>
/*    */ {
/* 66 */   public static Comparator<ChronoLocalDateTime<?>> timeLineOrder() { throw new RuntimeException("Stub!"); }
/* 67 */   public static ChronoLocalDateTime<?> from(TemporalAccessor temporal) { throw new RuntimeException("Stub!"); }
/* 68 */   public Chronology getChronology() { throw new RuntimeException("Stub!"); }
/*    */   public abstract D toLocalDate();
/*    */   public abstract LocalTime toLocalTime();
/*    */   public abstract boolean isSupported(TemporalField paramTemporalField);
/* 72 */   public boolean isSupported(TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/* 73 */   public ChronoLocalDateTime<D> with(TemporalAdjuster adjuster) { throw new RuntimeException("Stub!"); }
/*    */   public abstract ChronoLocalDateTime<D> with(TemporalField paramTemporalField, long paramLong);
/* 75 */   public ChronoLocalDateTime<D> plus(TemporalAmount amount) { throw new RuntimeException("Stub!"); }
/*    */   public abstract ChronoLocalDateTime<D> plus(long paramLong, TemporalUnit paramTemporalUnit);
/* 77 */   public ChronoLocalDateTime<D> minus(TemporalAmount amount) { throw new RuntimeException("Stub!"); }
/* 78 */   public ChronoLocalDateTime<D> minus(long amountToSubtract, TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/*    */   
/* 80 */   public <R> R query(TemporalQuery<R> query) { throw new RuntimeException("Stub!"); }
/* 81 */   public Temporal adjustInto(Temporal temporal) { throw new RuntimeException("Stub!"); }
/* 82 */   public String format(DateTimeFormatter formatter) { throw new RuntimeException("Stub!"); }
/*    */   public abstract ChronoZonedDateTime<D> atZone(ZoneId paramZoneId);
/* 84 */   public Instant toInstant(ZoneOffset offset) { throw new RuntimeException("Stub!"); }
/* 85 */   public long toEpochSecond(ZoneOffset offset) { throw new RuntimeException("Stub!"); }
/* 86 */   public int compareTo(ChronoLocalDateTime<?> other) { throw new RuntimeException("Stub!"); }
/* 87 */   public boolean isAfter(ChronoLocalDateTime<?> other) { throw new RuntimeException("Stub!"); }
/* 88 */   public boolean isBefore(ChronoLocalDateTime<?> other) { throw new RuntimeException("Stub!"); }
/* 89 */   public boolean isEqual(ChronoLocalDateTime<?> other) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract boolean equals(Object paramObject);
/*    */   
/*    */   public abstract int hashCode();
/*    */   
/*    */   public abstract String toString();
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\time\chrono\ChronoLocalDateTime.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */