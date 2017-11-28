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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class CancellationSignal
/*    */ {
/* 24 */   public CancellationSignal() { throw new RuntimeException("Stub!"); }
/* 25 */   public boolean isCanceled() { throw new RuntimeException("Stub!"); }
/* 26 */   public void throwIfCanceled() { throw new RuntimeException("Stub!"); }
/* 27 */   public void cancel() { throw new RuntimeException("Stub!"); }
/* 28 */   public void setOnCancelListener(OnCancelListener listener) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface OnCancelListener
/*    */   {
/*    */     public abstract void onCancel();
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\os\CancellationSignal.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */