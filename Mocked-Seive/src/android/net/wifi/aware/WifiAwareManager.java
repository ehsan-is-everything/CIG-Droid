/*    */ package android.net.wifi.aware;
/*    */ 
/*    */ import android.os.Handler;
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
/*    */ public class WifiAwareManager
/*    */ {
/*    */   public static final String ACTION_WIFI_AWARE_STATE_CHANGED = "android.net.wifi.aware.action.WIFI_AWARE_STATE_CHANGED";
/*    */   public static final int WIFI_AWARE_DATA_PATH_ROLE_INITIATOR = 0;
/*    */   public static final int WIFI_AWARE_DATA_PATH_ROLE_RESPONDER = 1;
/*    */   
/* 20 */   WifiAwareManager() { throw new RuntimeException("Stub!"); }
/* 21 */   public boolean isAvailable() { throw new RuntimeException("Stub!"); }
/* 22 */   public Characteristics getCharacteristics() { throw new RuntimeException("Stub!"); }
/* 23 */   public void attach(AttachCallback attachCallback, Handler handler) { throw new RuntimeException("Stub!"); }
/* 24 */   public void attach(AttachCallback attachCallback, IdentityChangedListener identityChangedListener, Handler handler) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\net\wifi\aware\WifiAwareManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */