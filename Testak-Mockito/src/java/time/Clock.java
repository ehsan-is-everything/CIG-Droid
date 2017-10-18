/*    */ package java.time;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class Clock
/*    */ {
/* 65 */   protected Clock() { throw new RuntimeException("Stub!"); }
/* 66 */   public static Clock systemUTC() { throw new RuntimeException("Stub!"); }
/* 67 */   public static Clock systemDefaultZone() { throw new RuntimeException("Stub!"); }
/* 68 */   public static Clock system(ZoneId zone) { throw new RuntimeException("Stub!"); }
/* 69 */   public static Clock tickSeconds(ZoneId zone) { throw new RuntimeException("Stub!"); }
/* 70 */   public static Clock tickMinutes(ZoneId zone) { throw new RuntimeException("Stub!"); }
/* 71 */   public static Clock tick(Clock baseClock, Duration tickDuration) { throw new RuntimeException("Stub!"); }
/* 72 */   public static Clock fixed(Instant fixedInstant, ZoneId zone) { throw new RuntimeException("Stub!"); }
/* 73 */   public static Clock offset(Clock baseClock, Duration offsetDuration) { throw new RuntimeException("Stub!"); }
/*    */   public abstract ZoneId getZone();
/*    */   public abstract Clock withZone(ZoneId paramZoneId);
/* 76 */   public long millis() { throw new RuntimeException("Stub!"); }
/*    */   public abstract Instant instant();
/* 78 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 79 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\time\Clock.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */