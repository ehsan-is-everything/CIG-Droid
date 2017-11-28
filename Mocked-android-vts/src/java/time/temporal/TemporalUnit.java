/*    */ package java.time.temporal;
/*    */ 
/*    */ import java.time.Duration;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract interface TemporalUnit
/*    */ {
/*    */   public abstract Duration getDuration();
/*    */   
/*    */   public abstract boolean isDurationEstimated();
/*    */   
/*    */   public abstract boolean isDateBased();
/*    */   
/*    */   public abstract boolean isTimeBased();
/*    */   
/*    */   public boolean isSupportedBy(Temporal temporal)
/*    */   {
/* 69 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract <R extends Temporal> R addTo(R paramR, long paramLong);
/*    */   
/*    */   public abstract long between(Temporal paramTemporal1, Temporal paramTemporal2);
/*    */   
/*    */   public abstract String toString();
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\time\temporal\TemporalUnit.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */