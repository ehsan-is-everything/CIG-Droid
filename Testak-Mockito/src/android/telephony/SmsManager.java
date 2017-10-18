/*    */ package android.telephony;
/*    */ 
/*    */ import android.app.PendingIntent;
/*    */ 
/*    */ 
/*    */ public final class SmsManager {
/*    */   public static final String EXTRA_MMS_DATA = "android.telephony.extra.MMS_DATA";
/*    */   public static final String EXTRA_MMS_HTTP_STATUS = "android.telephony.extra.MMS_HTTP_STATUS";
/*    */   public static final String MMS_CONFIG_ALIAS_ENABLED = "aliasEnabled";
/*    */   public static final String MMS_CONFIG_ALIAS_MAX_CHARS = "aliasMaxChars";
/*    */   public static final String MMS_CONFIG_ALIAS_MIN_CHARS = "aliasMinChars";
/*    */   public static final String MMS_CONFIG_ALLOW_ATTACH_AUDIO = "allowAttachAudio";
/*    */   public static final String MMS_CONFIG_APPEND_TRANSACTION_ID = "enabledTransID";
/*    */   public static final String MMS_CONFIG_EMAIL_GATEWAY_NUMBER = "emailGatewayNumber";
/*    */   public static final String MMS_CONFIG_GROUP_MMS_ENABLED = "enableGroupMms";
/*    */   public static final String MMS_CONFIG_HTTP_PARAMS = "httpParams";
/*    */   public static final String MMS_CONFIG_HTTP_SOCKET_TIMEOUT = "httpSocketTimeout";
/*    */   public static final String MMS_CONFIG_MAX_IMAGE_HEIGHT = "maxImageHeight";
/*    */   
/* 20 */   SmsManager() { throw new RuntimeException("Stub!"); }
/* 21 */   public void sendTextMessage(String destinationAddress, String scAddress, String text, PendingIntent sentIntent, PendingIntent deliveryIntent) { throw new RuntimeException("Stub!"); }
/* 22 */   public void injectSmsPdu(byte[] pdu, String format, PendingIntent receivedIntent) { throw new RuntimeException("Stub!"); }
/* 23 */   public java.util.ArrayList<String> divideMessage(String text) { throw new RuntimeException("Stub!"); }
/* 24 */   public void sendMultipartTextMessage(String destinationAddress, String scAddress, java.util.ArrayList<String> parts, java.util.ArrayList<PendingIntent> sentIntents, java.util.ArrayList<PendingIntent> deliveryIntents) { throw new RuntimeException("Stub!"); }
/* 25 */   public void sendDataMessage(String destinationAddress, String scAddress, short destinationPort, byte[] data, PendingIntent sentIntent, PendingIntent deliveryIntent) { throw new RuntimeException("Stub!"); }
/* 26 */   public static SmsManager getDefault() { throw new RuntimeException("Stub!"); }
/* 27 */   public static SmsManager getSmsManagerForSubscriptionId(int subId) { throw new RuntimeException("Stub!"); }
/* 28 */   public int getSubscriptionId() { throw new RuntimeException("Stub!"); }
/* 29 */   public static int getDefaultSmsSubscriptionId() { throw new RuntimeException("Stub!"); }
/* 30 */   public void sendMultimediaMessage(android.content.Context context, android.net.Uri contentUri, String locationUrl, android.os.Bundle configOverrides, PendingIntent sentIntent) { throw new RuntimeException("Stub!"); }
/* 31 */   public void downloadMultimediaMessage(android.content.Context context, String locationUrl, android.net.Uri contentUri, android.os.Bundle configOverrides, PendingIntent downloadedIntent) { throw new RuntimeException("Stub!"); }
/* 32 */   public android.os.Bundle getCarrierConfigValues() { throw new RuntimeException("Stub!"); }
/* 33 */   public String createAppSpecificSmsToken(PendingIntent intent) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static final String MMS_CONFIG_MAX_IMAGE_WIDTH = "maxImageWidth";
/*    */   public static final String MMS_CONFIG_MAX_MESSAGE_SIZE = "maxMessageSize";
/*    */   public static final String MMS_CONFIG_MESSAGE_TEXT_MAX_SIZE = "maxMessageTextSize";
/*    */   public static final String MMS_CONFIG_MMS_DELIVERY_REPORT_ENABLED = "enableMMSDeliveryReports";
/*    */   public static final String MMS_CONFIG_MMS_ENABLED = "enabledMMS";
/*    */   public static final String MMS_CONFIG_MMS_READ_REPORT_ENABLED = "enableMMSReadReports";
/*    */   public static final String MMS_CONFIG_MULTIPART_SMS_ENABLED = "enableMultipartSMS";
/*    */   public static final String MMS_CONFIG_NAI_SUFFIX = "naiSuffix";
/*    */   public static final String MMS_CONFIG_NOTIFY_WAP_MMSC_ENABLED = "enabledNotifyWapMMSC";
/*    */   public static final String MMS_CONFIG_RECIPIENT_LIMIT = "recipientLimit";
/*    */   public static final String MMS_CONFIG_SEND_MULTIPART_SMS_AS_SEPARATE_MESSAGES = "sendMultipartSmsAsSeparateMessages";
/*    */   public static final String MMS_CONFIG_SHOW_CELL_BROADCAST_APP_LINKS = "config_cellBroadcastAppLinks";
/*    */   public static final String MMS_CONFIG_SMS_DELIVERY_REPORT_ENABLED = "enableSMSDeliveryReports";
/*    */   public static final String MMS_CONFIG_SMS_TO_MMS_TEXT_LENGTH_THRESHOLD = "smsToMmsTextLengthThreshold";
/*    */   public static final String MMS_CONFIG_SMS_TO_MMS_TEXT_THRESHOLD = "smsToMmsTextThreshold";
/*    */   public static final String MMS_CONFIG_SUBJECT_MAX_LENGTH = "maxSubjectLength";
/*    */   public static final String MMS_CONFIG_SUPPORT_HTTP_CHARSET_HEADER = "supportHttpCharsetHeader";
/*    */   public static final String MMS_CONFIG_SUPPORT_MMS_CONTENT_DISPOSITION = "supportMmsContentDisposition";
/*    */   public static final String MMS_CONFIG_UA_PROF_TAG_NAME = "uaProfTagName";
/*    */   public static final String MMS_CONFIG_UA_PROF_URL = "uaProfUrl";
/*    */   public static final String MMS_CONFIG_USER_AGENT = "userAgent";
/*    */   public static final int MMS_ERROR_CONFIGURATION_ERROR = 7;
/*    */   public static final int MMS_ERROR_HTTP_FAILURE = 4;
/*    */   public static final int MMS_ERROR_INVALID_APN = 2;
/*    */   public static final int MMS_ERROR_IO_ERROR = 5;
/*    */   public static final int MMS_ERROR_NO_DATA_NETWORK = 8;
/*    */   public static final int MMS_ERROR_RETRY = 6;
/*    */   public static final int MMS_ERROR_UNABLE_CONNECT_MMS = 3;
/*    */   public static final int MMS_ERROR_UNSPECIFIED = 1;
/*    */   public static final int RESULT_ERROR_GENERIC_FAILURE = 1;
/*    */   public static final int RESULT_ERROR_NO_SERVICE = 4;
/*    */   public static final int RESULT_ERROR_NULL_PDU = 3;
/*    */   public static final int RESULT_ERROR_RADIO_OFF = 2;
/*    */   public static final int STATUS_ON_ICC_FREE = 0;
/*    */   public static final int STATUS_ON_ICC_READ = 1;
/*    */   public static final int STATUS_ON_ICC_SENT = 5;
/*    */   public static final int STATUS_ON_ICC_UNREAD = 3;
/*    */   public static final int STATUS_ON_ICC_UNSENT = 7;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\telephony\SmsManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */