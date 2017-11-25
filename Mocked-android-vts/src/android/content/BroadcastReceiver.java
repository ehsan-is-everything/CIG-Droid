/*    */ package android.content;
/*    */ 
/*    */ import android.os.Bundle;
/*    */ import android.os.IBinder;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class BroadcastReceiver
/*    */ {
/*    */   public static class PendingResult
/*    */   {
/* 22 */     PendingResult() { throw new RuntimeException("Stub!"); }
/* 23 */     public final void setResultCode(int code) { throw new RuntimeException("Stub!"); }
/* 24 */     public final int getResultCode() { throw new RuntimeException("Stub!"); }
/* 25 */     public final void setResultData(String data) { throw new RuntimeException("Stub!"); }
/* 26 */     public final String getResultData() { throw new RuntimeException("Stub!"); }
/* 27 */     public final void setResultExtras(Bundle extras) { throw new RuntimeException("Stub!"); }
/* 28 */     public final Bundle getResultExtras(boolean makeMap) { throw new RuntimeException("Stub!"); }
/* 29 */     public final void setResult(int code, String data, Bundle extras) { throw new RuntimeException("Stub!"); }
/* 30 */     public final boolean getAbortBroadcast() { throw new RuntimeException("Stub!"); }
/* 31 */     public final void abortBroadcast() { throw new RuntimeException("Stub!"); }
/* 32 */     public final void clearAbortBroadcast() { throw new RuntimeException("Stub!"); }
/* 33 */     public final void finish() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 35 */   public BroadcastReceiver() { throw new RuntimeException("Stub!"); }
/*    */   public abstract void onReceive(Context paramContext, Intent paramIntent);
/* 37 */   public final PendingResult goAsync() { throw new RuntimeException("Stub!"); }
/* 38 */   public IBinder peekService(Context myContext, Intent service) { throw new RuntimeException("Stub!"); }
/* 39 */   public final void setResultCode(int code) { throw new RuntimeException("Stub!"); }
/* 40 */   public final int getResultCode() { throw new RuntimeException("Stub!"); }
/* 41 */   public final void setResultData(String data) { throw new RuntimeException("Stub!"); }
/* 42 */   public final String getResultData() { throw new RuntimeException("Stub!"); }
/* 43 */   public final void setResultExtras(Bundle extras) { throw new RuntimeException("Stub!"); }
/* 44 */   public final Bundle getResultExtras(boolean makeMap) { throw new RuntimeException("Stub!"); }
/* 45 */   public final void setResult(int code, String data, Bundle extras) { throw new RuntimeException("Stub!"); }
/* 46 */   public final boolean getAbortBroadcast() { throw new RuntimeException("Stub!"); }
/* 47 */   public final void abortBroadcast() { throw new RuntimeException("Stub!"); }
/* 48 */   public final void clearAbortBroadcast() { throw new RuntimeException("Stub!"); }
/* 49 */   public final boolean isOrderedBroadcast() { throw new RuntimeException("Stub!"); }
/* 50 */   public final boolean isInitialStickyBroadcast() { throw new RuntimeException("Stub!"); }
/* 51 */   public final void setOrderedHint(boolean isOrdered) { throw new RuntimeException("Stub!"); }
/* 52 */   public final void setDebugUnregister(boolean debug) { throw new RuntimeException("Stub!"); }
/* 53 */   public final boolean getDebugUnregister() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\content\BroadcastReceiver.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */