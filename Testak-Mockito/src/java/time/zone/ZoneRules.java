/*    */ package java.time.zone;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.time.Duration;
/*    */ import java.time.Instant;
/*    */ import java.time.LocalDateTime;
/*    */ import java.time.ZoneOffset;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class ZoneRules
/*    */   implements Serializable
/*    */ {
/* 66 */   ZoneRules() { throw new RuntimeException("Stub!"); }
/* 67 */   public static ZoneRules of(ZoneOffset baseStandardOffset, ZoneOffset baseWallOffset, List<ZoneOffsetTransition> standardOffsetTransitionList, List<ZoneOffsetTransition> transitionList, List<ZoneOffsetTransitionRule> lastRules) { throw new RuntimeException("Stub!"); }
/* 68 */   public static ZoneRules of(ZoneOffset offset) { throw new RuntimeException("Stub!"); }
/* 69 */   public boolean isFixedOffset() { throw new RuntimeException("Stub!"); }
/* 70 */   public ZoneOffset getOffset(Instant instant) { throw new RuntimeException("Stub!"); }
/* 71 */   public ZoneOffset getOffset(LocalDateTime localDateTime) { throw new RuntimeException("Stub!"); }
/* 72 */   public List<ZoneOffset> getValidOffsets(LocalDateTime localDateTime) { throw new RuntimeException("Stub!"); }
/* 73 */   public ZoneOffsetTransition getTransition(LocalDateTime localDateTime) { throw new RuntimeException("Stub!"); }
/* 74 */   public ZoneOffset getStandardOffset(Instant instant) { throw new RuntimeException("Stub!"); }
/* 75 */   public Duration getDaylightSavings(Instant instant) { throw new RuntimeException("Stub!"); }
/* 76 */   public boolean isDaylightSavings(Instant instant) { throw new RuntimeException("Stub!"); }
/* 77 */   public boolean isValidOffset(LocalDateTime localDateTime, ZoneOffset offset) { throw new RuntimeException("Stub!"); }
/* 78 */   public ZoneOffsetTransition nextTransition(Instant instant) { throw new RuntimeException("Stub!"); }
/* 79 */   public ZoneOffsetTransition previousTransition(Instant instant) { throw new RuntimeException("Stub!"); }
/* 80 */   public List<ZoneOffsetTransition> getTransitions() { throw new RuntimeException("Stub!"); }
/* 81 */   public List<ZoneOffsetTransitionRule> getTransitionRules() { throw new RuntimeException("Stub!"); }
/* 82 */   public boolean equals(Object otherRules) { throw new RuntimeException("Stub!"); }
/* 83 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 84 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\time\zone\ZoneRules.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */