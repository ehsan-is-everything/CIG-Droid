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
/*    */ import java.time.temporal.ValueRange;
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
/*    */ public abstract interface ChronoZonedDateTime<D extends ChronoLocalDate>
/*    */   extends Temporal, Comparable<ChronoZonedDateTime<?>>
/*    */ {
/* 66 */   public static Comparator<ChronoZonedDateTime<?>> timeLineOrder() { throw new RuntimeException("Stub!"); }
/* 67 */   public static ChronoZonedDateTime<?> from(TemporalAccessor temporal) { throw new RuntimeException("Stub!"); }
/* 68 */   public ValueRange range(TemporalField field) { throw new RuntimeException("Stub!"); }
/* 69 */   public int get(TemporalField field) { throw new RuntimeException("Stub!"); }
/* 70 */   public long getLong(TemporalField field) { throw new RuntimeException("Stub!"); }
/* 71 */   public D toLocalDate() { throw new RuntimeException("Stub!"); }
/* 72 */   public LocalTime toLocalTime() { throw new RuntimeException("Stub!"); }
/*    */   public abstract ChronoLocalDateTime<D> toLocalDateTime();
/* 74 */   public Chronology getChronology() { throw new RuntimeException("Stub!"); }
/*    */   public abstract ZoneOffset getOffset();
/*    */   public abstract ZoneId getZone();
/*    */   public abstract ChronoZonedDateTime<D> withEarlierOffsetAtOverlap();
/*    */   public abstract ChronoZonedDateTime<D> withLaterOffsetAtOverlap();
/*    */   public abstract ChronoZonedDateTime<D> withZoneSameLocal(ZoneId paramZoneId);
/*    */   public abstract ChronoZonedDateTime<D> withZoneSameInstant(ZoneId paramZoneId);
/*    */   public abstract boolean isSupported(TemporalField paramTemporalField);
/* 82 */   public boolean isSupported(TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/* 83 */   public ChronoZonedDateTime<D> with(TemporalAdjuster adjuster) { throw new RuntimeException("Stub!"); }
/*    */   public abstract ChronoZonedDateTime<D> with(TemporalField paramTemporalField, long paramLong);
/* 85 */   public ChronoZonedDateTime<D> plus(TemporalAmount amount) { throw new RuntimeException("Stub!"); }
/*    */   public abstract ChronoZonedDateTime<D> plus(long paramLong, TemporalUnit paramTemporalUnit);
/* 87 */   public ChronoZonedDateTime<D> minus(TemporalAmount amount) { throw new RuntimeException("Stub!"); }
/* 88 */   public ChronoZonedDateTime<D> minus(long amountToSubtract, TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/*    */   
/* 90 */   public <R> R query(TemporalQuery<R> query) { throw new RuntimeException("Stub!"); }
/* 91 */   public String format(DateTimeFormatter formatter) { throw new RuntimeException("Stub!"); }
/* 92 */   public Instant toInstant() { throw new RuntimeException("Stub!"); }
/* 93 */   public long toEpochSecond() { throw new RuntimeException("Stub!"); }
/* 94 */   public int compareTo(ChronoZonedDateTime<?> other) { throw new RuntimeException("Stub!"); }
/* 95 */   public boolean isBefore(ChronoZonedDateTime<?> other) { throw new RuntimeException("Stub!"); }
/* 96 */   public boolean isAfter(ChronoZonedDateTime<?> other) { throw new RuntimeException("Stub!"); }
/* 97 */   public boolean isEqual(ChronoZonedDateTime<?> other) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract boolean equals(Object paramObject);
/*    */   
/*    */   public abstract int hashCode();
/*    */   
/*    */   public abstract String toString();
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\time\chrono\ChronoZonedDateTime.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */