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
/*    */ @Deprecated
/*    */ public final class CookieSyncManager
/*    */   extends WebSyncManager
/*    */ {
/*    */   protected static final String LOGTAG = "websync";
/*    */   protected WebViewDatabase mDataBase;
/*    */   protected Handler mHandler;
/*    */   
/*    */   CookieSyncManager()
/*    */   {
/* 22 */     super((Context)null, (String)null);throw new RuntimeException("Stub!"); }
/* 23 */   public static CookieSyncManager getInstance() { throw new RuntimeException("Stub!"); }
/* 24 */   public static CookieSyncManager createInstance(Context context) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 26 */   public void sync() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 28 */   protected void syncFromRamToFlash() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 30 */   public void resetSync() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 32 */   public void startSync() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 34 */   public void stopSync() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\webkit\CookieSyncManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */