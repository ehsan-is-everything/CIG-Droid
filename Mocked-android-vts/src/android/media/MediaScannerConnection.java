/*    */ package android.media;
/*    */ 
/*    */ import android.content.ComponentName;
/*    */ import android.content.Context;
/*    */ import android.content.ServiceConnection;
/*    */ import android.net.Uri;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class MediaScannerConnection
/*    */   implements ServiceConnection
/*    */ {
/* 31 */   public MediaScannerConnection(Context context, MediaScannerConnectionClient client) { throw new RuntimeException("Stub!"); }
/* 32 */   public void connect() { throw new RuntimeException("Stub!"); }
/* 33 */   public void disconnect() { throw new RuntimeException("Stub!"); }
/* 34 */   public synchronized boolean isConnected() { throw new RuntimeException("Stub!"); }
/* 35 */   public void scanFile(String path, String mimeType) { throw new RuntimeException("Stub!"); }
/* 36 */   public static void scanFile(Context context, String[] paths, String[] mimeTypes, OnScanCompletedListener callback) { throw new RuntimeException("Stub!"); }
/* 37 */   public void onServiceConnected(ComponentName className, IBinder service) { throw new RuntimeException("Stub!"); }
/* 38 */   public void onServiceDisconnected(ComponentName className) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface MediaScannerConnectionClient
/*    */     extends MediaScannerConnection.OnScanCompletedListener
/*    */   {
/*    */     public abstract void onMediaScannerConnected();
/*    */     
/*    */     public abstract void onScanCompleted(String paramString, Uri paramUri);
/*    */   }
/*    */   
/*    */   public static abstract interface OnScanCompletedListener
/*    */   {
/*    */     public abstract void onScanCompleted(String paramString, Uri paramUri);
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\media\MediaScannerConnection.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */