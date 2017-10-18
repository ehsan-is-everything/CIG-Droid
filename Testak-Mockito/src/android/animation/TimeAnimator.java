/*    */ package android.animation;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class TimeAnimator
/*    */   extends ValueAnimator
/*    */ {
/* 25 */   public TimeAnimator() { throw new RuntimeException("Stub!"); }
/* 26 */   public void start() { throw new RuntimeException("Stub!"); }
/* 27 */   public void setCurrentPlayTime(long playTime) { throw new RuntimeException("Stub!"); }
/* 28 */   public void setTimeListener(TimeListener listener) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface TimeListener
/*    */   {
/*    */     public abstract void onTimeUpdate(TimeAnimator paramTimeAnimator, long paramLong1, long paramLong2);
/*    */   }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\animation\TimeAnimator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */