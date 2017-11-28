/*    */ package android.app;
/*    */ 
/*    */ import android.content.Intent;
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
/*    */ public abstract class IntentService
/*    */   extends Service
/*    */ {
/* 21 */   public IntentService(String name) { throw new RuntimeException("Stub!"); }
/* 22 */   public void setIntentRedelivery(boolean enabled) { throw new RuntimeException("Stub!"); }
/* 23 */   public void onCreate() { throw new RuntimeException("Stub!"); }
/* 24 */   public void onStart(Intent intent, int startId) { throw new RuntimeException("Stub!"); }
/* 25 */   public int onStartCommand(Intent intent, int flags, int startId) { throw new RuntimeException("Stub!"); }
/* 26 */   public void onDestroy() { throw new RuntimeException("Stub!"); }
/* 27 */   public IBinder onBind(Intent intent) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   protected abstract void onHandleIntent(Intent paramIntent);
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\app\IntentService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */