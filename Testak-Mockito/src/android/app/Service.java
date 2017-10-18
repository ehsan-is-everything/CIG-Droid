/*    */ package android.app;
/*    */ 
/*    */ import android.content.ContextWrapper;
/*    */ import android.content.Intent;
/*    */ import java.io.FileDescriptor;
/*    */ import java.io.PrintWriter;
/*    */ 
/*    */ public abstract class Service extends ContextWrapper implements android.content.ComponentCallbacks2
/*    */ {
/*    */   public static final int START_CONTINUATION_MASK = 15;
/*    */   public static final int START_FLAG_REDELIVERY = 1;
/*    */   public static final int START_FLAG_RETRY = 2;
/*    */   public static final int START_NOT_STICKY = 2;
/*    */   public static final int START_REDELIVER_INTENT = 3;
/*    */   public static final int START_STICKY = 1;
/*    */   public static final int START_STICKY_COMPATIBILITY = 0;
/*    */   public static final int STOP_FOREGROUND_DETACH = 2;
/*    */   public static final int STOP_FOREGROUND_REMOVE = 1;
/*    */   
/*    */   public Service()
/*    */   {
/* 22 */     super((android.content.Context)null);throw new RuntimeException("Stub!"); }
/* 23 */   public final Application getApplication() { throw new RuntimeException("Stub!"); }
/* 24 */   public void onCreate() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 26 */   public void onStart(Intent intent, int startId) { throw new RuntimeException("Stub!"); }
/* 27 */   public int onStartCommand(Intent intent, int flags, int startId) { throw new RuntimeException("Stub!"); }
/* 28 */   public void onDestroy() { throw new RuntimeException("Stub!"); }
/* 29 */   public void onConfigurationChanged(android.content.res.Configuration newConfig) { throw new RuntimeException("Stub!"); }
/* 30 */   public void onLowMemory() { throw new RuntimeException("Stub!"); }
/* 31 */   public void onTrimMemory(int level) { throw new RuntimeException("Stub!"); }
/*    */   public abstract android.os.IBinder onBind(Intent paramIntent);
/* 33 */   public boolean onUnbind(Intent intent) { throw new RuntimeException("Stub!"); }
/* 34 */   public void onRebind(Intent intent) { throw new RuntimeException("Stub!"); }
/* 35 */   public void onTaskRemoved(Intent rootIntent) { throw new RuntimeException("Stub!"); }
/* 36 */   public final void stopSelf() { throw new RuntimeException("Stub!"); }
/* 37 */   public final void stopSelf(int startId) { throw new RuntimeException("Stub!"); }
/* 38 */   public final boolean stopSelfResult(int startId) { throw new RuntimeException("Stub!"); }
/* 39 */   public final void startForeground(int id, Notification notification) { throw new RuntimeException("Stub!"); }
/* 40 */   public final void stopForeground(boolean removeNotification) { throw new RuntimeException("Stub!"); }
/* 41 */   public final void stopForeground(int flags) { throw new RuntimeException("Stub!"); }
/* 42 */   protected void dump(FileDescriptor fd, PrintWriter writer, String[] args) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\app\Service.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */