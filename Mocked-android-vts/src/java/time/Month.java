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
/*    */ public enum Month
/*    */   implements TemporalAccessor, TemporalAdjuster
/*    */ {
/* 66 */   APRIL, 
/* 67 */   AUGUST, 
/* 68 */   DECEMBER, 
/* 69 */   FEBRUARY, 
/* 70 */   JANUARY, 
/* 71 */   JULY, 
/* 72 */   JUNE, 
/* 73 */   MARCH, 
/* 74 */   MAY, 
/* 75 */   NOVEMBER, 
/* 76 */   OCTOBER, 
/* 77 */   SEPTEMBER;
/* 78 */   private Month() {} public static Month of(int month) { throw new RuntimeException("Stub!"); }
/* 79 */   public static Month from(TemporalAccessor temporal) { throw new RuntimeException("Stub!"); }
/* 80 */   public int getValue() { throw new RuntimeException("Stub!"); }
/* 81 */   public String getDisplayName(TextStyle style, Locale locale) { throw new RuntimeException("Stub!"); }
/* 82 */   public boolean isSupported(TemporalField field) { throw new RuntimeException("Stub!"); }
/* 83 */   public ValueRange range(TemporalField field) { throw new RuntimeException("Stub!"); }
/* 84 */   public int get(TemporalField field) { throw new RuntimeException("Stub!"); }
/* 85 */   public long getLong(TemporalField field) { throw new RuntimeException("Stub!"); }
/* 86 */   public Month plus(long months) { throw new RuntimeException("Stub!"); }
/* 87 */   public Month minus(long months) { throw new RuntimeException("Stub!"); }
/* 88 */   public int length(boolean leapYear) { throw new RuntimeException("Stub!"); }
/* 89 */   public int minLength() { throw new RuntimeException("Stub!"); }
/* 90 */   public int maxLength() { throw new RuntimeException("Stub!"); }
/* 91 */   public int firstDayOfYear(boolean leapYear) { throw new RuntimeException("Stub!"); }
/* 92 */   public Month firstMonthOfQuarter() { throw new RuntimeException("Stub!"); }
/*    */   
/* 94 */   public <R> R query(TemporalQuery<R> query) { throw new RuntimeException("Stub!"); }
/* 95 */   public Temporal adjustInto(Temporal temporal) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\time\Month.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */