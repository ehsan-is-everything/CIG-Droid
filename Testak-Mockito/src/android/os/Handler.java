/*    */ package android.os;
/*    */ 
/*    */ import android.util.Printer;
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
/*    */ public class Handler
/*    */ {
/* 24 */   public Handler() { throw new RuntimeException("Stub!"); }
/* 25 */   public Handler(Callback callback) { throw new RuntimeException("Stub!"); }
/* 26 */   public Handler(Looper looper) { throw new RuntimeException("Stub!"); }
/* 27 */   public Handler(Looper looper, Callback callback) { throw new RuntimeException("Stub!"); }
/* 28 */   public void handleMessage(Message msg) { throw new RuntimeException("Stub!"); }
/* 29 */   public void dispatchMessage(Message msg) { throw new RuntimeException("Stub!"); }
/* 30 */   public String getMessageName(Message message) { throw new RuntimeException("Stub!"); }
/* 31 */   public final Message obtainMessage() { throw new RuntimeException("Stub!"); }
/* 32 */   public final Message obtainMessage(int what) { throw new RuntimeException("Stub!"); }
/* 33 */   public final Message obtainMessage(int what, Object obj) { throw new RuntimeException("Stub!"); }
/* 34 */   public final Message obtainMessage(int what, int arg1, int arg2) { throw new RuntimeException("Stub!"); }
/* 35 */   public final Message obtainMessage(int what, int arg1, int arg2, Object obj) { throw new RuntimeException("Stub!"); }
/* 36 */   public final boolean post(Runnable r) { throw new RuntimeException("Stub!"); }
/* 37 */   public final boolean postAtTime(Runnable r, long uptimeMillis) { throw new RuntimeException("Stub!"); }
/* 38 */   public final boolean postAtTime(Runnable r, Object token, long uptimeMillis) { throw new RuntimeException("Stub!"); }
/* 39 */   public final boolean postDelayed(Runnable r, long delayMillis) { throw new RuntimeException("Stub!"); }
/* 40 */   public final boolean postAtFrontOfQueue(Runnable r) { throw new RuntimeException("Stub!"); }
/* 41 */   public final void removeCallbacks(Runnable r) { throw new RuntimeException("Stub!"); }
/* 42 */   public final void removeCallbacks(Runnable r, Object token) { throw new RuntimeException("Stub!"); }
/* 43 */   public final boolean sendMessage(Message msg) { throw new RuntimeException("Stub!"); }
/* 44 */   public final boolean sendEmptyMessage(int what) { throw new RuntimeException("Stub!"); }
/* 45 */   public final boolean sendEmptyMessageDelayed(int what, long delayMillis) { throw new RuntimeException("Stub!"); }
/* 46 */   public final boolean sendEmptyMessageAtTime(int what, long uptimeMillis) { throw new RuntimeException("Stub!"); }
/* 47 */   public final boolean sendMessageDelayed(Message msg, long delayMillis) { throw new RuntimeException("Stub!"); }
/* 48 */   public boolean sendMessageAtTime(Message msg, long uptimeMillis) { throw new RuntimeException("Stub!"); }
/* 49 */   public final boolean sendMessageAtFrontOfQueue(Message msg) { throw new RuntimeException("Stub!"); }
/* 50 */   public final void removeMessages(int what) { throw new RuntimeException("Stub!"); }
/* 51 */   public final void removeMessages(int what, Object object) { throw new RuntimeException("Stub!"); }
/* 52 */   public final void removeCallbacksAndMessages(Object token) { throw new RuntimeException("Stub!"); }
/* 53 */   public final boolean hasMessages(int what) { throw new RuntimeException("Stub!"); }
/* 54 */   public final boolean hasMessages(int what, Object object) { throw new RuntimeException("Stub!"); }
/* 55 */   public final Looper getLooper() { throw new RuntimeException("Stub!"); }
/* 56 */   public final void dump(Printer pw, String prefix) { throw new RuntimeException("Stub!"); }
/* 57 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface Callback
/*    */   {
/*    */     public abstract boolean handleMessage(Message paramMessage);
/*    */   }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\os\Handler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */