/*    */ package android.telephony;
/*    */ 
/*    */ 
/*    */ public class SmsMessage
/*    */ {
/*    */   public static final int ENCODING_16BIT = 3;
/*    */   
/*    */   public static final int ENCODING_7BIT = 1;
/*    */   
/*    */   public static final int ENCODING_8BIT = 2;
/*    */   
/*    */   public static final int ENCODING_UNKNOWN = 0;
/*    */   
/*    */   public static final int MAX_USER_DATA_BYTES = 140;
/*    */   
/*    */   public static final int MAX_USER_DATA_BYTES_WITH_HEADER = 134;
/*    */   public static final int MAX_USER_DATA_SEPTETS = 160;
/*    */   public static final int MAX_USER_DATA_SEPTETS_WITH_HEADER = 153;
/*    */   
/*    */   public static enum MessageClass
/*    */   {
/* 22 */     CLASS_0, 
/* 23 */     CLASS_1, 
/* 24 */     CLASS_2, 
/* 25 */     CLASS_3, 
/* 26 */     UNKNOWN;
/*    */     
/*    */     private MessageClass() {} }
/*    */   
/* 30 */   public static class SubmitPdu { SubmitPdu() { throw new RuntimeException("Stub!"); }
/* 31 */     public String toString() { throw new RuntimeException("Stub!"); }
/* 32 */     public byte[] encodedMessage = null;
/* 33 */     public byte[] encodedScAddress = null; }
/*    */   
/* 35 */   SmsMessage() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 37 */   public static SmsMessage createFromPdu(byte[] pdu) { throw new RuntimeException("Stub!"); }
/* 38 */   public static SmsMessage createFromPdu(byte[] pdu, String format) { throw new RuntimeException("Stub!"); }
/* 39 */   public static int getTPLayerLengthForPDU(String pdu) { throw new RuntimeException("Stub!"); }
/* 40 */   public static int[] calculateLength(CharSequence msgBody, boolean use7bitOnly) { throw new RuntimeException("Stub!"); }
/* 41 */   public static int[] calculateLength(String messageBody, boolean use7bitOnly) { throw new RuntimeException("Stub!"); }
/* 42 */   public static SubmitPdu getSubmitPdu(String scAddress, String destinationAddress, String message, boolean statusReportRequested) { throw new RuntimeException("Stub!"); }
/* 43 */   public static SubmitPdu getSubmitPdu(String scAddress, String destinationAddress, short destinationPort, byte[] data, boolean statusReportRequested) { throw new RuntimeException("Stub!"); }
/* 44 */   public String getServiceCenterAddress() { throw new RuntimeException("Stub!"); }
/* 45 */   public String getOriginatingAddress() { throw new RuntimeException("Stub!"); }
/* 46 */   public String getDisplayOriginatingAddress() { throw new RuntimeException("Stub!"); }
/* 47 */   public String getMessageBody() { throw new RuntimeException("Stub!"); }
/* 48 */   public MessageClass getMessageClass() { throw new RuntimeException("Stub!"); }
/* 49 */   public String getDisplayMessageBody() { throw new RuntimeException("Stub!"); }
/* 50 */   public String getPseudoSubject() { throw new RuntimeException("Stub!"); }
/* 51 */   public long getTimestampMillis() { throw new RuntimeException("Stub!"); }
/* 52 */   public boolean isEmail() { throw new RuntimeException("Stub!"); }
/* 53 */   public String getEmailBody() { throw new RuntimeException("Stub!"); }
/* 54 */   public String getEmailFrom() { throw new RuntimeException("Stub!"); }
/* 55 */   public int getProtocolIdentifier() { throw new RuntimeException("Stub!"); }
/* 56 */   public boolean isReplace() { throw new RuntimeException("Stub!"); }
/* 57 */   public boolean isCphsMwiMessage() { throw new RuntimeException("Stub!"); }
/* 58 */   public boolean isMWIClearMessage() { throw new RuntimeException("Stub!"); }
/* 59 */   public boolean isMWISetMessage() { throw new RuntimeException("Stub!"); }
/* 60 */   public boolean isMwiDontStore() { throw new RuntimeException("Stub!"); }
/* 61 */   public byte[] getUserData() { throw new RuntimeException("Stub!"); }
/* 62 */   public byte[] getPdu() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 64 */   public int getStatusOnSim() { throw new RuntimeException("Stub!"); }
/* 65 */   public int getStatusOnIcc() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 67 */   public int getIndexOnSim() { throw new RuntimeException("Stub!"); }
/* 68 */   public int getIndexOnIcc() { throw new RuntimeException("Stub!"); }
/* 69 */   public int getStatus() { throw new RuntimeException("Stub!"); }
/* 70 */   public boolean isStatusReportMessage() { throw new RuntimeException("Stub!"); }
/* 71 */   public boolean isReplyPathPresent() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\telephony\SmsMessage.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */