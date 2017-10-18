/*    */ package java.time;
/*    */ 
/*    */ import java.time.format.TextStyle;
/*    */ import java.time.temporal.Temporal;
/*    */ import java.time.temporal.TemporalAccessor;
/*    */ import java.time.temporal.TemporalAdjuster;
/*    */ import java.time.temporal.TemporalField;
/*    */ import java.time.temporal.TemporalQuery;
/*    */ import java.time.temporal.ValueRange;
/*    */ import java.util.Locale;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum DayOfWeek
/*    */   implements TemporalAccessor, TemporalAdjuster
/*    */ {
/* 66 */   FRIDAY, 
/* 67 */   MONDAY, 
/* 68 */   SATURDAY, 
/* 69 */   SUNDAY, 
/* 70 */   THURSDAY, 
/* 71 */   TUESDAY, 
/* 72 */   WEDNESDAY;
/* 73 */   private DayOfWeek() {} public static DayOfWeek of(int dayOfWeek) { throw new RuntimeException("Stub!"); }
/* 74 */   public static DayOfWeek from(TemporalAccessor temporal) { throw new RuntimeException("Stub!"); }
/* 75 */   public int getValue() { throw new RuntimeException("Stub!"); }
/* 76 */   public String getDisplayName(TextStyle style, Locale locale) { throw new RuntimeException("Stub!"); }
/* 77 */   public boolean isSupported(TemporalField field) { throw new RuntimeException("Stub!"); }
/* 78 */   public ValueRange range(TemporalField field) { throw new RuntimeException("Stub!"); }
/* 79 */   public int get(TemporalField field) { throw new RuntimeException("Stub!"); }
/* 80 */   public long getLong(TemporalField field) { throw new RuntimeException("Stub!"); }
/* 81 */   public DayOfWeek plus(long days) { throw new RuntimeException("Stub!"); }
/* 82 */   public DayOfWeek minus(long days) { throw new RuntimeException("Stub!"); }
/*    */   
/* 84 */   public <R> R query(TemporalQuery<R> query) { throw new RuntimeException("Stub!"); }
/* 85 */   public Temporal adjustInto(Temporal temporal) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\time\DayOfWeek.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */