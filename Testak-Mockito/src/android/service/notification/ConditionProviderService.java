/*    */ package android.service.notification;
/*    */ 
/*    */ import android.app.Service;
/*    */ import android.content.ComponentName;
/*    */ import android.content.Intent;
/*    */ import android.net.Uri;
/*    */ import android.os.IBinder;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class ConditionProviderService
/*    */   extends Service
/*    */ {
/*    */   public static final String EXTRA_RULE_ID = "android.service.notification.extra.RULE_ID";
/*    */   public static final String META_DATA_CONFIGURATION_ACTIVITY = "android.service.zen.automatic.configurationActivity";
/*    */   public static final String META_DATA_RULE_INSTANCE_LIMIT = "android.service.zen.automatic.ruleInstanceLimit";
/*    */   public static final String META_DATA_RULE_TYPE = "android.service.zen.automatic.ruleType";
/*    */   public static final String SERVICE_INTERFACE = "android.service.notification.ConditionProviderService";
/*    */   
/* 21 */   public ConditionProviderService() { throw new RuntimeException("Stub!"); }
/*    */   public abstract void onConnected();
/* 23 */   public void onRequestConditions(int relevance) { throw new RuntimeException("Stub!"); }
/*    */   public abstract void onSubscribe(Uri paramUri);
/*    */   public abstract void onUnsubscribe(Uri paramUri);
/* 26 */   public static final void requestRebind(ComponentName componentName) { throw new RuntimeException("Stub!"); }
/* 27 */   public final void requestUnbind() { throw new RuntimeException("Stub!"); }
/* 28 */   public final void notifyCondition(Condition condition) { throw new RuntimeException("Stub!"); }
/* 29 */   public final void notifyConditions(Condition... conditions) { throw new RuntimeException("Stub!"); }
/* 30 */   public IBinder onBind(Intent intent) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\service\notification\ConditionProviderService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */