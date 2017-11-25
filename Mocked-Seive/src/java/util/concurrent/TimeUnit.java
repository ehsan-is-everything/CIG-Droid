/*    */ package java.util.concurrent;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum TimeUnit
/*    */ {
/* 39 */   DAYS, 
/* 40 */   HOURS, 
/* 41 */   MICROSECONDS, 
/* 42 */   MILLISECONDS, 
/* 43 */   MINUTES, 
/* 44 */   NANOSECONDS, 
/* 45 */   SECONDS;
/* 46 */   private TimeUnit() {} public long convert(long sourceDuration, TimeUnit sourceUnit) { throw new RuntimeException("Stub!"); }
/* 47 */   public long toNanos(long duration) { throw new RuntimeException("Stub!"); }
/* 48 */   public long toMicros(long duration) { throw new RuntimeException("Stub!"); }
/* 49 */   public long toMillis(long duration) { throw new RuntimeException("Stub!"); }
/* 50 */   public long toSeconds(long duration) { throw new RuntimeException("Stub!"); }
/* 51 */   public long toMinutes(long duration) { throw new RuntimeException("Stub!"); }
/* 52 */   public long toHours(long duration) { throw new RuntimeException("Stub!"); }
/* 53 */   public long toDays(long duration) { throw new RuntimeException("Stub!"); }
/* 54 */   public void timedWait(Object obj, long timeout) throws InterruptedException { throw new RuntimeException("Stub!"); }
/* 55 */   public void timedJoin(Thread thread, long timeout) throws InterruptedException { throw new RuntimeException("Stub!"); }
/* 56 */   public void sleep(long timeout) throws InterruptedException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\util\concurrent\TimeUnit.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */