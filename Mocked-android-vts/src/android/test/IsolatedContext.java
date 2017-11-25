/*    */ package android.test;
/*    */ 
/*    */ import android.content.BroadcastReceiver;
/*    */ import android.content.ContentResolver;
/*    */ import android.content.Context;
/*    */ import android.content.ContextWrapper;
/*    */ import android.content.Intent;
/*    */ import android.content.IntentFilter;
/*    */ import android.content.ServiceConnection;
/*    */ import android.net.Uri;
/*    */ import java.io.File;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Deprecated
/*    */ public class IsolatedContext
/*    */   extends ContextWrapper
/*    */ {
/*    */   public IsolatedContext(ContentResolver resolver, Context targetContext)
/*    */   {
/* 22 */     super((Context)null);throw new RuntimeException("Stub!"); }
/* 23 */   public List<Intent> getAndClearBroadcastIntents() { throw new RuntimeException("Stub!"); }
/* 24 */   public ContentResolver getContentResolver() { throw new RuntimeException("Stub!"); }
/* 25 */   public boolean bindService(Intent service, ServiceConnection conn, int flags) { throw new RuntimeException("Stub!"); }
/* 26 */   public Intent registerReceiver(BroadcastReceiver receiver, IntentFilter filter) { throw new RuntimeException("Stub!"); }
/* 27 */   public void unregisterReceiver(BroadcastReceiver receiver) { throw new RuntimeException("Stub!"); }
/* 28 */   public void sendBroadcast(Intent intent) { throw new RuntimeException("Stub!"); }
/* 29 */   public void sendOrderedBroadcast(Intent intent, String receiverPermission) { throw new RuntimeException("Stub!"); }
/* 30 */   public int checkUriPermission(Uri uri, String readPermission, String writePermission, int pid, int uid, int modeFlags) { throw new RuntimeException("Stub!"); }
/* 31 */   public int checkUriPermission(Uri uri, int pid, int uid, int modeFlags) { throw new RuntimeException("Stub!"); }
/* 32 */   public Object getSystemService(String name) { throw new RuntimeException("Stub!"); }
/* 33 */   public File getFilesDir() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\test\IsolatedContext.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */