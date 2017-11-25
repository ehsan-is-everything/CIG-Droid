/*    */ package android.service.chooser;
/*    */ 
/*    */ import android.app.Service;
/*    */ import android.content.ComponentName;
/*    */ import android.content.Intent;
/*    */ import android.content.IntentFilter;
/*    */ import android.os.IBinder;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class ChooserTargetService
/*    */   extends Service
/*    */ {
/*    */   public static final String BIND_PERMISSION = "android.permission.BIND_CHOOSER_TARGET_SERVICE";
/*    */   public static final String META_DATA_NAME = "android.service.chooser.chooser_target_service";
/*    */   public static final String SERVICE_INTERFACE = "android.service.chooser.ChooserTargetService";
/*    */   
/* 22 */   public ChooserTargetService() { throw new RuntimeException("Stub!"); }
/*    */   public abstract List<ChooserTarget> onGetChooserTargets(ComponentName paramComponentName, IntentFilter paramIntentFilter);
/* 24 */   public IBinder onBind(Intent intent) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\service\chooser\ChooserTargetService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */