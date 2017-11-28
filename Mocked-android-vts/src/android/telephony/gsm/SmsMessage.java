/*     */ package android.telephony.gsm;
/*     */ 
/*     */ @Deprecated
/*     */ public class SmsMessage
/*     */ {
/*     */   @Deprecated
/*     */   public static final int ENCODING_16BIT = 3;
/*     */   @Deprecated
/*     */   public static final int ENCODING_7BIT = 1;
/*     */   @Deprecated
/*     */   public static final int ENCODING_8BIT = 2;
/*     */   @Deprecated
/*     */   public static final int ENCODING_UNKNOWN = 0;
/*     */   @Deprecated
/*     */   public static final int MAX_USER_DATA_BYTES = 140;
/*     */   @Deprecated
/*     */   public static final int MAX_USER_DATA_SEPTETS = 160;
/*     */   @Deprecated
/*     */   public static final int MAX_USER_DATA_SEPTETS_WITH_HEADER = 153;
/*     */   
/*     */   @Deprecated
/*     */   public static enum MessageClass
/*     */   {
/*  24 */     CLASS_0, 
/*  25 */     CLASS_1, 
/*  26 */     CLASS_2, 
/*  27 */     CLASS_3, 
/*  28 */     UNKNOWN;
/*     */     
/*     */     private MessageClass() {} }
/*     */   
/*     */   @Deprecated
/*     */   public static class SubmitPdu { @Deprecated
/*  34 */     public SubmitPdu() { throw new RuntimeException("Stub!"); }
/*     */     @Deprecated
/*  36 */     public String toString() { throw new RuntimeException("Stub!"); } @Deprecated
/*  37 */     public byte[] encodedMessage = null;
/*     */     @Deprecated
/*  39 */     public byte[] encodedScAddress = null;
/*     */   }
/*     */   
/*     */   @Deprecated
/*  43 */   public SmsMessage() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  45 */   public static SmsMessage createFromPdu(byte[] pdu) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  47 */   public static int getTPLayerLengthForPDU(String pdu) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  49 */   public static int[] calculateLength(CharSequence messageBody, boolean use7bitOnly) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  51 */   public static int[] calculateLength(String messageBody, boolean use7bitOnly) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  53 */   public static SubmitPdu getSubmitPdu(String scAddress, String destinationAddress, String message, boolean statusReportRequested) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  55 */   public static SubmitPdu getSubmitPdu(String scAddress, String destinationAddress, short destinationPort, byte[] data, boolean statusReportRequested) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  57 */   public String getServiceCenterAddress() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  59 */   public String getOriginatingAddress() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  61 */   public String getDisplayOriginatingAddress() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  63 */   public String getMessageBody() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  65 */   public MessageClass getMessageClass() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  67 */   public String getDisplayMessageBody() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  69 */   public String getPseudoSubject() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  71 */   public long getTimestampMillis() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  73 */   public boolean isEmail() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  75 */   public String getEmailBody() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  77 */   public String getEmailFrom() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  79 */   public int getProtocolIdentifier() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  81 */   public boolean isReplace() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  83 */   public boolean isCphsMwiMessage() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  85 */   public boolean isMWIClearMessage() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  87 */   public boolean isMWISetMessage() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  89 */   public boolean isMwiDontStore() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  91 */   public byte[] getUserData() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  93 */   public byte[] getPdu() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  95 */   public int getStatusOnSim() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  97 */   public int getIndexOnSim() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  99 */   public int getStatus() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 101 */   public boolean isStatusReportMessage() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 103 */   public boolean isReplyPathPresent() { throw new RuntimeException("Stub!"); }
/*     */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\telephony\gsm\SmsMessage.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */