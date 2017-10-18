/*    */ package android.service.vr;
/*    */ 
/*    */ import android.app.Service;
/*    */ import android.content.ComponentName;
/*    */ import android.content.Context;
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
/*    */ public abstract class VrListenerService
/*    */   extends Service
/*    */ {
/*    */   public static final String SERVICE_INTERFACE = "android.service.vr.VrListenerService";
/*    */   
/* 21 */   public VrListenerService() { throw new RuntimeException("Stub!"); }
/* 22 */   public IBinder onBind(Intent intent) { throw new RuntimeException("Stub!"); }
/* 23 */   public void onCurrentVrActivityChanged(ComponentName component) { throw new RuntimeException("Stub!"); }
/* 24 */   public static final boolean isVrModePackageEnabled(Context context, ComponentName requestedComponent) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\service\vr\VrListenerService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */