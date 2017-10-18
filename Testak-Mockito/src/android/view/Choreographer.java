/*    */ package android.view;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class Choreographer
/*    */ {
/* 24 */   Choreographer() { throw new RuntimeException("Stub!"); }
/* 25 */   public static Choreographer getInstance() { throw new RuntimeException("Stub!"); }
/* 26 */   public void postFrameCallback(FrameCallback callback) { throw new RuntimeException("Stub!"); }
/* 27 */   public void postFrameCallbackDelayed(FrameCallback callback, long delayMillis) { throw new RuntimeException("Stub!"); }
/* 28 */   public void removeFrameCallback(FrameCallback callback) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface FrameCallback
/*    */   {
/*    */     public abstract void doFrame(long paramLong);
/*    */   }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\view\Choreographer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */