/*    */ package java.time.temporal;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract interface Temporal
/*    */   extends TemporalAccessor
/*    */ {
/*    */   public abstract boolean isSupported(TemporalUnit paramTemporalUnit);
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 67 */   public Temporal with(TemporalAdjuster adjuster) { throw new RuntimeException("Stub!"); }
/*    */   public abstract Temporal with(TemporalField paramTemporalField, long paramLong);
/* 69 */   public Temporal plus(TemporalAmount amount) { throw new RuntimeException("Stub!"); }
/*    */   public abstract Temporal plus(long paramLong, TemporalUnit paramTemporalUnit);
/* 71 */   public Temporal minus(TemporalAmount amount) { throw new RuntimeException("Stub!"); }
/* 72 */   public Temporal minus(long amountToSubtract, TemporalUnit unit) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract long until(Temporal paramTemporal, TemporalUnit paramTemporalUnit);
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\time\temporal\Temporal.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */