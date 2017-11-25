/*    */ package android.webkit;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.os.Handler;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Deprecated
/*    */ abstract class WebSyncManager
/*    */   implements Runnable
/*    */ {
/*    */   protected static final String LOGTAG = "websync";
/*    */   protected WebViewDatabase mDataBase;
/*    */   protected Handler mHandler;
/*    */   
/* 22 */   protected WebSyncManager(Context context, String name) { throw new RuntimeException("Stub!"); }
/* 23 */   protected Object clone() throws CloneNotSupportedException { throw new RuntimeException("Stub!"); }
/* 24 */   public void run() { throw new RuntimeException("Stub!"); }
/* 25 */   public void sync() { throw new RuntimeException("Stub!"); }
/* 26 */   public void resetSync() { throw new RuntimeException("Stub!"); }
/* 27 */   public void startSync() { throw new RuntimeException("Stub!"); }
/* 28 */   public void stopSync() { throw new RuntimeException("Stub!"); }
/* 29 */   protected void onSyncInit() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\webkit\WebSyncManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */