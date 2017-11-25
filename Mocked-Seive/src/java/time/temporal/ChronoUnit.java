/*    */ package java.time.temporal;
/*    */ 
/*    */ import java.time.Duration;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum ChronoUnit
/*    */   implements TemporalUnit
/*    */ {
/* 61 */   CENTURIES, 
/* 62 */   DAYS, 
/* 63 */   DECADES, 
/* 64 */   ERAS, 
/* 65 */   FOREVER, 
/* 66 */   HALF_DAYS, 
/* 67 */   HOURS, 
/* 68 */   MICROS, 
/* 69 */   MILLENNIA, 
/* 70 */   MILLIS, 
/* 71 */   MINUTES, 
/* 72 */   MONTHS, 
/* 73 */   NANOS, 
/* 74 */   SECONDS, 
/* 75 */   WEEKS, 
/* 76 */   YEARS;
/* 77 */   private ChronoUnit() {} public Duration getDuration() { throw new RuntimeException("Stub!"); }
/* 78 */   public boolean isDurationEstimated() { throw new RuntimeException("Stub!"); }
/* 79 */   public boolean isDateBased() { throw new RuntimeException("Stub!"); }
/* 80 */   public boolean isTimeBased() { throw new RuntimeException("Stub!"); }
/* 81 */   public boolean isSupportedBy(Temporal temporal) { throw new RuntimeException("Stub!"); }
/*    */   
/* 83 */   public <R extends Temporal> R addTo(R temporal, long amount) { throw new RuntimeException("Stub!"); }
/* 84 */   public long between(Temporal temporal1Inclusive, Temporal temporal2Exclusive) { throw new RuntimeException("Stub!"); }
/* 85 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\time\temporal\ChronoUnit.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */