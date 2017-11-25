/*    */ package java.time.chrono;
/*    */ 
/*    */ import java.time.temporal.Temporal;
/*    */ import java.time.temporal.TemporalAmount;
/*    */ import java.time.temporal.TemporalUnit;
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
/*    */ 
/*    */ 
/*    */ public abstract interface ChronoPeriod
/*    */   extends TemporalAmount
/*    */ {
/* 66 */   public static ChronoPeriod between(ChronoLocalDate startDateInclusive, ChronoLocalDate endDateExclusive) { throw new RuntimeException("Stub!"); }
/*    */   public abstract long get(TemporalUnit paramTemporalUnit);
/*    */   public abstract List<TemporalUnit> getUnits();
/*    */   public abstract Chronology getChronology();
/* 70 */   public boolean isZero() { throw new RuntimeException("Stub!"); }
/* 71 */   public boolean isNegative() { throw new RuntimeException("Stub!"); }
/*    */   public abstract ChronoPeriod plus(TemporalAmount paramTemporalAmount);
/*    */   public abstract ChronoPeriod minus(TemporalAmount paramTemporalAmount);
/*    */   public abstract ChronoPeriod multipliedBy(int paramInt);
/* 75 */   public ChronoPeriod negated() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract ChronoPeriod normalized();
/*    */   
/*    */   public abstract Temporal addTo(Temporal paramTemporal);
/*    */   
/*    */   public abstract Temporal subtractFrom(Temporal paramTemporal);
/*    */   
/*    */   public abstract boolean equals(Object paramObject);
/*    */   
/*    */   public abstract int hashCode();
/*    */   
/*    */   public abstract String toString();
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\time\chrono\ChronoPeriod.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */