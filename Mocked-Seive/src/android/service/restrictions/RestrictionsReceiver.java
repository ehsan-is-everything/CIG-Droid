/*    */ package android.service.restrictions;
/*    */ 
/*    */ import android.content.BroadcastReceiver;
/*    */ import android.content.Context;
/*    */ import android.content.Intent;
/*    */ import android.os.PersistableBundle;
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
/*    */ public abstract class RestrictionsReceiver
/*    */   extends BroadcastReceiver
/*    */ {
/* 21 */   public RestrictionsReceiver() { throw new RuntimeException("Stub!"); }
/*    */   public abstract void onRequestPermission(Context paramContext, String paramString1, String paramString2, String paramString3, PersistableBundle paramPersistableBundle);
/* 23 */   public void onReceive(Context context, Intent intent) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\service\restrictions\RestrictionsReceiver.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */