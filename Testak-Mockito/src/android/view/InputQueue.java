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
/*    */ 
/*    */ public final class InputQueue
/*    */ {
/* 25 */   InputQueue() { throw new RuntimeException("Stub!"); }
/* 26 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface Callback
/*    */   {
/*    */     public abstract void onInputQueueCreated(InputQueue paramInputQueue);
/*    */     
/*    */     public abstract void onInputQueueDestroyed(InputQueue paramInputQueue);
/*    */   }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\view\InputQueue.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */