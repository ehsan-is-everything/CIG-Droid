/*    */ package java.time.chrono;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.time.temporal.Temporal;
/*    */ import java.time.temporal.TemporalAdjuster;
/*    */ import java.time.temporal.TemporalAmount;
/*    */ import java.time.temporal.TemporalField;
/*    */ import java.time.temporal.TemporalUnit;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ abstract class ChronoLocalDateImpl<D extends ChronoLocalDate>
/*    */   implements ChronoLocalDate, Temporal, TemporalAdjuster, Serializable
/*    */ {
/* 61 */   ChronoLocalDateImpl() { throw new RuntimeException("Stub!"); }
/*    */   
/* 63 */   public D with(TemporalAdjuster adjuster) { throw new RuntimeException("Stub!"); }
/*    */   
/* 65 */   public D with(TemporalField field, long value) { throw new RuntimeException("Stub!"); }
/*    */   
/* 67 */   public D plus(TemporalAmount amount) { throw new RuntimeException("Stub!"); }
/*    */   
/* 69 */   public D plus(long amountToAdd, TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/*    */   
/* 71 */   public D minus(TemporalAmount amount) { throw new RuntimeException("Stub!"); }
/*    */   
/* 73 */   public D minus(long amountToSubtract, TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/* 74 */   public long until(Temporal endExclusive, TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/* 75 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 76 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 77 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\time\chrono\ChronoLocalDateImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */