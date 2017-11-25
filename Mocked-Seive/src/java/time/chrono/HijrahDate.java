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
/*    */ public final class HijrahDate
/*    */   extends ChronoLocalDateImpl<HijrahDate>
/*    */   implements ChronoLocalDate, Serializable
/*    */ {
/* 62 */   HijrahDate() { throw new RuntimeException("Stub!"); }
/* 63 */   public static HijrahDate now() { throw new RuntimeException("Stub!"); }
/* 64 */   public static HijrahDate now(ZoneId zone) { throw new RuntimeException("Stub!"); }
/* 65 */   public static HijrahDate now(Clock clock) { throw new RuntimeException("Stub!"); }
/* 66 */   public static HijrahDate of(int prolepticYear, int month, int dayOfMonth) { throw new RuntimeException("Stub!"); }
/* 67 */   public static HijrahDate from(TemporalAccessor temporal) { throw new RuntimeException("Stub!"); }
/* 68 */   public HijrahChronology getChronology() { throw new RuntimeException("Stub!"); }
/* 69 */   public HijrahEra getEra() { throw new RuntimeException("Stub!"); }
/* 70 */   public int lengthOfMonth() { throw new RuntimeException("Stub!"); }
/* 71 */   public int lengthOfYear() { throw new RuntimeException("Stub!"); }
/* 72 */   public ValueRange range(TemporalField field) { throw new RuntimeException("Stub!"); }
/* 73 */   public long getLong(TemporalField field) { throw new RuntimeException("Stub!"); }
/* 74 */   public HijrahDate with(TemporalField field, long newValue) { throw new RuntimeException("Stub!"); }
/* 75 */   public HijrahDate with(TemporalAdjuster adjuster) { throw new RuntimeException("Stub!"); }
/* 76 */   public HijrahDate withVariant(HijrahChronology chronology) { throw new RuntimeException("Stub!"); }
/* 77 */   public HijrahDate plus(TemporalAmount amount) { throw new RuntimeException("Stub!"); }
/* 78 */   public HijrahDate minus(TemporalAmount amount) { throw new RuntimeException("Stub!"); }
/* 79 */   public long toEpochDay() { throw new RuntimeException("Stub!"); }
/* 80 */   public boolean isLeapYear() { throw new RuntimeException("Stub!"); }
/* 81 */   public HijrahDate plus(long amountToAdd, TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/* 82 */   public HijrahDate minus(long amountToSubtract, TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/*    */   
/* 84 */   public final ChronoLocalDateTime<HijrahDate> atTime(LocalTime localTime) { throw new RuntimeException("Stub!"); }
/* 85 */   public ChronoPeriod until(ChronoLocalDate endDate) { throw new RuntimeException("Stub!"); }
/* 86 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 87 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\time\chrono\HijrahDate.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */