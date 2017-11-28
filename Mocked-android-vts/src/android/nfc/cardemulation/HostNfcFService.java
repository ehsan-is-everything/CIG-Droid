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
/*    */ 
/*    */ public abstract class HostNfcFService
/*    */   extends Service
/*    */ {
/*    */   public static final int DEACTIVATION_LINK_LOSS = 0;
/*    */   public static final String SERVICE_INTERFACE = "android.nfc.cardemulation.action.HOST_NFCF_SERVICE";
/*    */   public static final String SERVICE_META_DATA = "android.nfc.cardemulation.host_nfcf_service";
/*    */   
/* 21 */   public HostNfcFService() { throw new RuntimeException("Stub!"); }
/* 22 */   public final IBinder onBind(Intent intent) { throw new RuntimeException("Stub!"); }
/* 23 */   public final void sendResponsePacket(byte[] responsePacket) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract byte[] processNfcFPacket(byte[] paramArrayOfByte, Bundle paramBundle);
/*    */   
/*    */   public abstract void onDeactivated(int paramInt);
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\nfc\cardemulation\HostNfcFService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */