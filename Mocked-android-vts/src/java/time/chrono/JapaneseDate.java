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
/*    */ public final class JapaneseDate
/*    */   extends ChronoLocalDateImpl<JapaneseDate>
/*    */   implements ChronoLocalDate, Serializable
/*    */ {
/* 62 */   JapaneseDate() { throw new RuntimeException("Stub!"); }
/* 63 */   public static JapaneseDate now() { throw new RuntimeException("Stub!"); }
/* 64 */   public static JapaneseDate now(ZoneId zone) { throw new RuntimeException("Stub!"); }
/* 65 */   public static JapaneseDate now(Clock clock) { throw new RuntimeException("Stub!"); }
/* 66 */   public static JapaneseDate of(JapaneseEra era, int yearOfEra, int month, int dayOfMonth) { throw new RuntimeException("Stub!"); }
/* 67 */   public static JapaneseDate of(int prolepticYear, int month, int dayOfMonth) { throw new RuntimeException("Stub!"); }
/* 68 */   public static JapaneseDate from(TemporalAccessor temporal) { throw new RuntimeException("Stub!"); }
/* 69 */   public JapaneseChronology getChronology() { throw new RuntimeException("Stub!"); }
/* 70 */   public JapaneseEra getEra() { throw new RuntimeException("Stub!"); }
/* 71 */   public int lengthOfMonth() { throw new RuntimeException("Stub!"); }
/* 72 */   public int lengthOfYear() { throw new RuntimeException("Stub!"); }
/* 73 */   public boolean isSupported(TemporalField field) { throw new RuntimeException("Stub!"); }
/* 74 */   public ValueRange range(TemporalField field) { throw new RuntimeException("Stub!"); }
/* 75 */   public long getLong(TemporalField field) { throw new RuntimeException("Stub!"); }
/* 76 */   public JapaneseDate with(TemporalField field, long newValue) { throw new RuntimeException("Stub!"); }
/* 77 */   public JapaneseDate with(TemporalAdjuster adjuster) { throw new RuntimeException("Stub!"); }
/* 78 */   public JapaneseDate plus(TemporalAmount amount) { throw new RuntimeException("Stub!"); }
/* 79 */   public JapaneseDate minus(TemporalAmount amount) { throw new RuntimeException("Stub!"); }
/* 80 */   public JapaneseDate plus(long amountToAdd, TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/* 81 */   public JapaneseDate minus(long amountToAdd, TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/*    */   
/* 83 */   public final ChronoLocalDateTime<JapaneseDate> atTime(LocalTime localTime) { throw new RuntimeException("Stub!"); }
/* 84 */   public ChronoPeriod until(ChronoLocalDate endDate) { throw new RuntimeException("Stub!"); }
/* 85 */   public long toEpochDay() { throw new RuntimeException("Stub!"); }
/* 86 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 87 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\time\chrono\JapaneseDate.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */