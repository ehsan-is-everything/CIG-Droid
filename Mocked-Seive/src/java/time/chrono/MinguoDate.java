/*    */ package java.time.chrono;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.time.Clock;
/*    */ import java.time.LocalTime;
/*    */ import java.time.ZoneId;
/*    */ import java.time.temporal.TemporalAccessor;
/*    */ import java.time.temporal.TemporalAdjuster;
/*    */ import java.time.temporal.TemporalAmount;
/*    */ import java.time.temporal.TemporalField;
/*    */ import java.time.temporal.TemporalUnit;
/*    */ import java.time.temporal.ValueRange;
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
/*    */ public final class MinguoDate
/*    */   extends ChronoLocalDateImpl<MinguoDate>
/*    */   implements ChronoLocalDate, Serializable
/*    */ {
/* 62 */   MinguoDate() { throw new RuntimeException("Stub!"); }
/* 63 */   public static MinguoDate now() { throw new RuntimeException("Stub!"); }
/* 64 */   public static MinguoDate now(ZoneId zone) { throw new RuntimeException("Stub!"); }
/* 65 */   public static MinguoDate now(Clock clock) { throw new RuntimeException("Stub!"); }
/* 66 */   public static MinguoDate of(int prolepticYear, int month, int dayOfMonth) { throw new RuntimeException("Stub!"); }
/* 67 */   public static MinguoDate from(TemporalAccessor temporal) { throw new RuntimeException("Stub!"); }
/* 68 */   public MinguoChronology getChronology() { throw new RuntimeException("Stub!"); }
/* 69 */   public MinguoEra getEra() { throw new RuntimeException("Stub!"); }
/* 70 */   public int lengthOfMonth() { throw new RuntimeException("Stub!"); }
/* 71 */   public ValueRange range(TemporalField field) { throw new RuntimeException("Stub!"); }
/* 72 */   public long getLong(TemporalField field) { throw new RuntimeException("Stub!"); }
/* 73 */   public MinguoDate with(TemporalField field, long newValue) { throw new RuntimeException("Stub!"); }
/* 74 */   public MinguoDate with(TemporalAdjuster adjuster) { throw new RuntimeException("Stub!"); }
/* 75 */   public MinguoDate plus(TemporalAmount amount) { throw new RuntimeException("Stub!"); }
/* 76 */   public MinguoDate minus(TemporalAmount amount) { throw new RuntimeException("Stub!"); }
/* 77 */   public MinguoDate plus(long amountToAdd, TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/* 78 */   public MinguoDate minus(long amountToAdd, TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/*    */   
/* 80 */   public final ChronoLocalDateTime<MinguoDate> atTime(LocalTime localTime) { throw new RuntimeException("Stub!"); }
/* 81 */   public ChronoPeriod until(ChronoLocalDate endDate) { throw new RuntimeException("Stub!"); }
/* 82 */   public long toEpochDay() { throw new RuntimeException("Stub!"); }
/* 83 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 84 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\time\chrono\MinguoDate.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */