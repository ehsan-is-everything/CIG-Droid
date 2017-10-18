/*    */ package android.nfc.cardemulation;
/*    */ 
/*    */ import android.app.Service;
/*    */ import android.content.Intent;
/*    */ import android.os.Bundle;
/*    */ import android.os.IBinder;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class HostApduService
/*    */   extends Service
/*    */ {
/*    */   public static final int DEACTIVATION_DESELECTED = 1;
/*    */   public static final int DEACTIVATION_LINK_LOSS = 0;
/*    */   public static final String SERVICE_INTERFACE = "android.nfc.cardemulation.action.HOST_APDU_SERVICE";
/*    */   public static final String SERVICE_META_DATA = "android.nfc.cardemulation.host_apdu_service";
/*    */   
/* 21 */   public HostApduService() { throw new RuntimeException("Stub!"); }
/* 22 */   public final IBinder onBind(Intent intent) { throw new RuntimeException("Stub!"); }
/* 23 */   public final void sendResponseApdu(byte[] responseApdu) { throw new RuntimeException("Stub!"); }
/* 24 */   public final void notifyUnhandled() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract byte[] processCommandApdu(byte[] paramArrayOfByte, Bundle paramBundle);
/*    */   
/*    */   public abstract void onDeactivated(int paramInt);
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\nfc\cardemulation\HostApduService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */