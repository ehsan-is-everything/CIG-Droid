/*    */ package android.os;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class CountDownTimer
/*    */ {
/* 20 */   public CountDownTimer(long millisInFuture, long countDownInterval) { throw new RuntimeException("Stub!"); }
/* 21 */   public final synchronized void cancel() { throw new RuntimeException("Stub!"); }
/* 22 */   public final synchronized CountDownTimer start() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract void onTick(long paramLong);
/*    */   
/*    */   public abstract void onFinish();
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\os\CountDownTimer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */