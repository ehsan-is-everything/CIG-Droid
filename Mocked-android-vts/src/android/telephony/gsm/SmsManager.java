/*    */ package android.telephony.gsm;
/*    */ 
/*    */ import android.app.PendingIntent;
/*    */ import java.util.ArrayList;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Deprecated
/*    */ public final class SmsManager
/*    */ {
/*    */   @Deprecated
/*    */   public static final int RESULT_ERROR_GENERIC_FAILURE = 1;
/*    */   @Deprecated
/*    */   public static final int RESULT_ERROR_NO_SERVICE = 4;
/*    */   @Deprecated
/*    */   public static final int RESULT_ERROR_NULL_PDU = 3;
/*    */   @Deprecated
/*    */   public static final int RESULT_ERROR_RADIO_OFF = 2;
/*    */   
/* 21 */   SmsManager() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 23 */   public static final SmsManager getDefault() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 25 */   public final void sendTextMessage(String destinationAddress, String scAddress, String text, PendingIntent sentIntent, PendingIntent deliveryIntent) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 27 */   public final ArrayList<String> divideMessage(String text) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 29 */   public final void sendMultipartTextMessage(String destinationAddress, String scAddress, ArrayList<String> parts, ArrayList<PendingIntent> sentIntents, ArrayList<PendingIntent> deliveryIntents) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 31 */   public final void sendDataMessage(String destinationAddress, String scAddress, short destinationPort, byte[] data, PendingIntent sentIntent, PendingIntent deliveryIntent) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   @Deprecated
/*    */   public static final int STATUS_ON_SIM_FREE = 0;
/*    */   @Deprecated
/*    */   public static final int STATUS_ON_SIM_READ = 1;
/*    */   @Deprecated
/*    */   public static final int STATUS_ON_SIM_SENT = 5;
/*    */   @Deprecated
/*    */   public static final int STATUS_ON_SIM_UNREAD = 3;
/*    */   @Deprecated
/*    */   public static final int STATUS_ON_SIM_UNSENT = 7;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\telephony\gsm\SmsManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */