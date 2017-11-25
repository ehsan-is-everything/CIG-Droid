/*    */ package android.service.carrier;
/*    */ 
/*    */ import android.net.Uri;
/*    */ 
/*    */ 
/*    */ public abstract class CarrierMessagingService
/*    */   extends android.app.Service
/*    */ {
/*    */   public static final int DOWNLOAD_STATUS_ERROR = 2;
/*    */   public static final int DOWNLOAD_STATUS_OK = 0;
/*    */   public static final int DOWNLOAD_STATUS_RETRY_ON_CARRIER_NETWORK = 1;
/*    */   public static final int RECEIVE_OPTIONS_DEFAULT = 0;
/*    */   public static final int RECEIVE_OPTIONS_DROP = 1;
/*    */   public static final int RECEIVE_OPTIONS_SKIP_NOTIFY_WHEN_CREDENTIAL_PROTECTED_STORAGE_UNAVAILABLE = 2;
/*    */   public static final int SEND_FLAG_REQUEST_DELIVERY_STATUS = 1;
/*    */   public static final int SEND_STATUS_ERROR = 2;
/*    */   public static final int SEND_STATUS_OK = 0;
/*    */   public static final int SEND_STATUS_RETRY_ON_CARRIER_NETWORK = 1;
/*    */   public static final String SERVICE_INTERFACE = "android.service.carrier.CarrierMessagingService";
/*    */   
/*    */   public static final class SendMmsResult
/*    */   {
/* 23 */     public SendMmsResult(int sendStatus, byte[] sendConfPdu) { throw new RuntimeException("Stub!"); }
/* 24 */     public int getSendStatus() { throw new RuntimeException("Stub!"); }
/* 25 */     public byte[] getSendConfPdu() { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public static final class SendSmsResult {
/* 29 */     public SendSmsResult(int sendStatus, int messageRef) { throw new RuntimeException("Stub!"); }
/* 30 */     public int getMessageRef() { throw new RuntimeException("Stub!"); }
/* 31 */     public int getSendStatus() { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public static final class SendMultipartSmsResult {
/* 35 */     public SendMultipartSmsResult(int sendStatus, int[] messageRefs) { throw new RuntimeException("Stub!"); }
/* 36 */     public int[] getMessageRefs() { throw new RuntimeException("Stub!"); }
/* 37 */     public int getSendStatus() { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 43 */   public CarrierMessagingService() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 45 */   public void onFilterSms(MessagePdu pdu, String format, int destPort, int subId, ResultCallback<Boolean> callback) { throw new RuntimeException("Stub!"); }
/* 46 */   public void onReceiveTextSms(MessagePdu pdu, String format, int destPort, int subId, ResultCallback<Integer> callback) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 48 */   public void onSendTextSms(String text, int subId, String destAddress, ResultCallback<SendSmsResult> callback) { throw new RuntimeException("Stub!"); }
/* 49 */   public void onSendTextSms(String text, int subId, String destAddress, int sendSmsFlag, ResultCallback<SendSmsResult> callback) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 51 */   public void onSendDataSms(byte[] data, int subId, String destAddress, int destPort, ResultCallback<SendSmsResult> callback) { throw new RuntimeException("Stub!"); }
/* 52 */   public void onSendDataSms(byte[] data, int subId, String destAddress, int destPort, int sendSmsFlag, ResultCallback<SendSmsResult> callback) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 54 */   public void onSendMultipartTextSms(java.util.List<String> parts, int subId, String destAddress, ResultCallback<SendMultipartSmsResult> callback) { throw new RuntimeException("Stub!"); }
/* 55 */   public void onSendMultipartTextSms(java.util.List<String> parts, int subId, String destAddress, int sendSmsFlag, ResultCallback<SendMultipartSmsResult> callback) { throw new RuntimeException("Stub!"); }
/* 56 */   public void onSendMms(Uri pduUri, int subId, Uri location, ResultCallback<SendMmsResult> callback) { throw new RuntimeException("Stub!"); }
/* 57 */   public void onDownloadMms(Uri contentUri, int subId, Uri location, ResultCallback<Integer> callback) { throw new RuntimeException("Stub!"); }
/* 58 */   public android.os.IBinder onBind(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface ResultCallback<T>
/*    */   {
/*    */     public abstract void onReceiveResult(T paramT)
/*    */       throws android.os.RemoteException;
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\service\carrier\CarrierMessagingService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */