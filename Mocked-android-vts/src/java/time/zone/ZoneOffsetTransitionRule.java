/*    */ package java.time.zone;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.time.DayOfWeek;
/*    */ import java.time.LocalDateTime;
/*    */ import java.time.LocalTime;
/*    */ import java.time.Month;
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
/*    */ public final class ZoneOffsetTransitionRule
/*    */   implements Serializable
/*    */ {
/*    */   public static enum TimeDefinition
/*    */   {
/* 68 */     STANDARD, 
/* 69 */     UTC, 
/* 70 */     WALL;
/* 71 */     private TimeDefinition() {} public LocalDateTime createDateTime(LocalDateTime dateTime, ZoneOffset standardOffset, ZoneOffset wallOffset) { throw new RuntimeException("Stub!"); } }
/*    */   
/* 73 */   ZoneOffsetTransitionRule() { throw new RuntimeException("Stub!"); }
/* 74 */   public static ZoneOffsetTransitionRule of(Month month, int dayOfMonthIndicator, DayOfWeek dayOfWeek, LocalTime time, boolean timeEndOfDay, TimeDefinition timeDefnition, ZoneOffset standardOffset, ZoneOffset offsetBefore, ZoneOffset offsetAfter) { throw new RuntimeException("Stub!"); }
/* 75 */   public Month getMonth() { throw new RuntimeException("Stub!"); }
/* 76 */   public int getDayOfMonthIndicator() { throw new RuntimeException("Stub!"); }
/* 77 */   public DayOfWeek getDayOfWeek() { throw new RuntimeException("Stub!"); }
/* 78 */   public LocalTime getLocalTime() { throw new RuntimeException("Stub!"); }
/* 79 */   public boolean isMidnightEndOfDay() { throw new RuntimeException("Stub!"); }
/* 80 */   public TimeDefinition getTimeDefinition() { throw new RuntimeException("Stub!"); }
/* 81 */   public ZoneOffset getStandardOffset() { throw new RuntimeException("Stub!"); }
/* 82 */   public ZoneOffset getOffsetBefore() { throw new RuntimeException("Stub!"); }
/* 83 */   public ZoneOffset getOffsetAfter() { throw new RuntimeException("Stub!"); }
/* 84 */   public ZoneOffsetTransition createTransition(int year) { throw new RuntimeException("Stub!"); }
/* 85 */   public boolean equals(Object otherRule) { throw new RuntimeException("Stub!"); }
/* 86 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 87 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\time\zone\ZoneOffsetTransitionRule.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */