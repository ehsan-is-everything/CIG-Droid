/*    */ package android.location;
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
/*    */ public abstract class SettingInjectorService
/*    */   extends Service
/*    */ {
/*    */   public static final String ACTION_INJECTED_SETTING_CHANGED = "android.location.InjectedSettingChanged";
/*    */   public static final String ACTION_SERVICE_INTENT = "android.location.SettingInjectorService";
/*    */   public static final String ATTRIBUTES_NAME = "injected-location-setting";
/*    */   public static final String META_DATA_NAME = "android.location.SettingInjectorService";
/*    */   
/* 21 */   public SettingInjectorService(String name) { throw new RuntimeException("Stub!"); }
/* 22 */   public final IBinder onBind(Intent intent) { throw new RuntimeException("Stub!"); }
/* 23 */   public final void onStart(Intent intent, int startId) { throw new RuntimeException("Stub!"); }
/* 24 */   public final int onStartCommand(Intent intent, int flags, int startId) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   @Deprecated
/*    */   protected abstract String onGetSummary();
/*    */   
/*    */   protected abstract boolean onGetEnabled();
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\location\SettingInjectorService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */