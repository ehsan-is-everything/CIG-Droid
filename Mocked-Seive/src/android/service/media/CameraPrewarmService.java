/*    */ package android.service.media;
/*    */ 
/*    */ import android.app.Service;
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
/*    */ public abstract class CameraPrewarmService
/*    */   extends Service
/*    */ {
/* 21 */   public CameraPrewarmService() { throw new RuntimeException("Stub!"); }
/* 22 */   public IBinder onBind(Intent intent) { throw new RuntimeException("Stub!"); }
/* 23 */   public boolean onUnbind(Intent intent) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract void onPrewarm();
/*    */   
/*    */   public abstract void onCooldown(boolean paramBoolean);
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\service\media\CameraPrewarmService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */