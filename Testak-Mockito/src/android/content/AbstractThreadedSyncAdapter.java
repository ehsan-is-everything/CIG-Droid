/*    */ package android.content;
/*    */ 
/*    */ import android.accounts.Account;
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
/*    */ public abstract class AbstractThreadedSyncAdapter
/*    */ {
/*    */   @Deprecated
/*    */   public static final int LOG_SYNC_DETAILS = 2743;
/*    */   
/* 20 */   public AbstractThreadedSyncAdapter(Context context, boolean autoInitialize) { throw new RuntimeException("Stub!"); }
/* 21 */   public AbstractThreadedSyncAdapter(Context context, boolean autoInitialize, boolean allowParallelSyncs) { throw new RuntimeException("Stub!"); }
/* 22 */   public Context getContext() { throw new RuntimeException("Stub!"); }
/* 23 */   public final IBinder getSyncAdapterBinder() { throw new RuntimeException("Stub!"); }
/*    */   public abstract void onPerformSync(Account paramAccount, Bundle paramBundle, String paramString, ContentProviderClient paramContentProviderClient, SyncResult paramSyncResult);
/* 25 */   public void onSecurityException(Account account, Bundle extras, String authority, SyncResult syncResult) { throw new RuntimeException("Stub!"); }
/* 26 */   public void onSyncCanceled() { throw new RuntimeException("Stub!"); }
/* 27 */   public void onSyncCanceled(Thread thread) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\content\AbstractThreadedSyncAdapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */