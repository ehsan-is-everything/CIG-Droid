/*    */ package java.time;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.time.temporal.Temporal;
/*    */ import java.time.temporal.TemporalAccessor;
/*    */ import java.time.temporal.TemporalAdjuster;
/*    */ import java.time.temporal.TemporalField;
/*    */ import java.time.temporal.TemporalQuery;
/*    */ import java.time.temporal.ValueRange;
/*    */ import java.time.zone.ZoneRules;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class ZoneOffset
/*    */   extends ZoneId
/*    */   implements TemporalAccessor, TemporalAdjuster, Comparable<ZoneOffset>, Serializable
/*    */ {
/* 67 */   ZoneOffset() { throw new RuntimeException("Stub!"); }
/*    */   
/* 69 */   public static ZoneOffset of(String offsetId) { throw new RuntimeException("Stub!"); }
/* 70 */   public static ZoneOffset ofHours(int hours) { throw new RuntimeException("Stub!"); }
/* 71 */   public static ZoneOffset ofHoursMinutes(int hours, int minutes) { throw new RuntimeException("Stub!"); }
/* 72 */   public static ZoneOffset ofHoursMinutesSeconds(int hours, int minutes, int seconds) { throw new RuntimeException("Stub!"); }
/* 73 */   public static ZoneOffset from(TemporalAccessor temporal) { throw new RuntimeException("Stub!"); }
/* 74 */   public static ZoneOffset ofTotalSeconds(int totalSeconds) { throw new RuntimeException("Stub!"); }
/* 75 */   public int getTotalSeconds() { throw new RuntimeException("Stub!"); }
/* 76 */   public String getId() { throw new RuntimeException("Stub!"); }
/* 77 */   public ZoneRules getRules() { throw new RuntimeException("Stub!"); }
/* 78 */   public boolean isSupported(TemporalField field) { throw new RuntimeException("Stub!"); }
/* 79 */   public ValueRange range(TemporalField field) { throw new RuntimeException("Stub!"); }
/* 80 */   public int get(TemporalField field) { throw new RuntimeException("Stub!"); }
/* 81 */   public long getLong(TemporalField field) { throw new RuntimeException("Stub!"); }
/*    */   
/* 83 */   public <R> R query(TemporalQuery<R> query) { throw new RuntimeException("Stub!"); }
/* 84 */   public Temporal adjustInto(Temporal temporal) { throw new RuntimeException("Stub!"); }
/* 85 */   public int compareTo(ZoneOffset other) { throw new RuntimeException("Stub!"); }
/* 86 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 87 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 88 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/* 92 */   public static final ZoneOffset UTC = null; public static final ZoneOffset MIN = null; public static final ZoneOffset MAX = null;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\time\ZoneOffset.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */