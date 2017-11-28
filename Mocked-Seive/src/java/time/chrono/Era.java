/*    */ package java.time.chrono;
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
/*    */ public abstract interface Era
/*    */   extends TemporalAccessor, TemporalAdjuster
/*    */ {
/*    */   public abstract int getValue();
/*    */   
/* 67 */   public boolean isSupported(TemporalField field) { throw new RuntimeException("Stub!"); }
/* 68 */   public ValueRange range(TemporalField field) { throw new RuntimeException("Stub!"); }
/* 69 */   public int get(TemporalField field) { throw new RuntimeException("Stub!"); }
/* 70 */   public long getLong(TemporalField field) { throw new RuntimeException("Stub!"); }
/*    */   
/* 72 */   public <R> R query(TemporalQuery<R> query) { throw new RuntimeException("Stub!"); }
/* 73 */   public Temporal adjustInto(Temporal temporal) { throw new RuntimeException("Stub!"); }
/* 74 */   public String getDisplayName(TextStyle style, Locale locale) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\time\chrono\Era.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */