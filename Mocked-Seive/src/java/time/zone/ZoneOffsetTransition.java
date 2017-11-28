/*    */ package java.time.zone;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.time.Duration;
/*    */ import java.time.Instant;
/*    */ import java.time.LocalDateTime;
/*    */ import java.time.ZoneOffset;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class ZoneOffsetTransition
/*    */   implements Comparable<ZoneOffsetTransition>, Serializable
/*    */ {
/* 66 */   ZoneOffsetTransition() { throw new RuntimeException("Stub!"); }
/* 67 */   public static ZoneOffsetTransition of(LocalDateTime transition, ZoneOffset offsetBefore, ZoneOffset offsetAfter) { throw new RuntimeException("Stub!"); }
/* 68 */   public Instant getInstant() { throw new RuntimeException("Stub!"); }
/* 69 */   public long toEpochSecond() { throw new RuntimeException("Stub!"); }
/* 70 */   public LocalDateTime getDateTimeBefore() { throw new RuntimeException("Stub!"); }
/* 71 */   public LocalDateTime getDateTimeAfter() { throw new RuntimeException("Stub!"); }
/* 72 */   public ZoneOffset getOffsetBefore() { throw new RuntimeException("Stub!"); }
/* 73 */   public ZoneOffset getOffsetAfter() { throw new RuntimeException("Stub!"); }
/* 74 */   public Duration getDuration() { throw new RuntimeException("Stub!"); }
/* 75 */   public boolean isGap() { throw new RuntimeException("Stub!"); }
/* 76 */   public boolean isOverlap() { throw new RuntimeException("Stub!"); }
/* 77 */   public boolean isValidOffset(ZoneOffset offset) { throw new RuntimeException("Stub!"); }
/* 78 */   public int compareTo(ZoneOffsetTransition transition) { throw new RuntimeException("Stub!"); }
/* 79 */   public boolean equals(Object other) { throw new RuntimeException("Stub!"); }
/* 80 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 81 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\time\zone\ZoneOffsetTransition.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */