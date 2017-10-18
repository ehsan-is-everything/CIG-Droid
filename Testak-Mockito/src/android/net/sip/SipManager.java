/*    */ package android.net.sip;
/*    */ 
/*    */ import android.app.PendingIntent;
/*    */ import android.content.Context;
/*    */ import android.content.Intent;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SipManager
/*    */ {
/*    */   public static final String EXTRA_CALL_ID = "android:sipCallID";
/*    */   public static final String EXTRA_OFFER_SD = "android:sipOfferSD";
/*    */   public static final int INCOMING_CALL_RESULT_CODE = 101;
/*    */   
/* 20 */   SipManager() { throw new RuntimeException("Stub!"); }
/* 21 */   public static SipManager newInstance(Context context) { throw new RuntimeException("Stub!"); }
/* 22 */   public static boolean isApiSupported(Context context) { throw new RuntimeException("Stub!"); }
/* 23 */   public static boolean isVoipSupported(Context context) { throw new RuntimeException("Stub!"); }
/* 24 */   public static boolean isSipWifiOnly(Context context) { throw new RuntimeException("Stub!"); }
/* 25 */   public void open(SipProfile localProfile) throws SipException { throw new RuntimeException("Stub!"); }
/* 26 */   public void open(SipProfile localProfile, PendingIntent incomingCallPendingIntent, SipRegistrationListener listener) throws SipException { throw new RuntimeException("Stub!"); }
/* 27 */   public void setRegistrationListener(String localProfileUri, SipRegistrationListener listener) throws SipException { throw new RuntimeException("Stub!"); }
/* 28 */   public void close(String localProfileUri) throws SipException { throw new RuntimeException("Stub!"); }
/* 29 */   public boolean isOpened(String localProfileUri) throws SipException { throw new RuntimeException("Stub!"); }
/* 30 */   public boolean isRegistered(String localProfileUri) throws SipException { throw new RuntimeException("Stub!"); }
/* 31 */   public SipAudioCall makeAudioCall(SipProfile localProfile, SipProfile peerProfile, SipAudioCall.Listener listener, int timeout) throws SipException { throw new RuntimeException("Stub!"); }
/* 32 */   public SipAudioCall makeAudioCall(String localProfileUri, String peerProfileUri, SipAudioCall.Listener listener, int timeout) throws SipException { throw new RuntimeException("Stub!"); }
/* 33 */   public SipAudioCall takeAudioCall(Intent incomingCallIntent, SipAudioCall.Listener listener) throws SipException { throw new RuntimeException("Stub!"); }
/* 34 */   public static boolean isIncomingCallIntent(Intent intent) { throw new RuntimeException("Stub!"); }
/* 35 */   public static String getCallId(Intent incomingCallIntent) { throw new RuntimeException("Stub!"); }
/* 36 */   public static String getOfferSessionDescription(Intent incomingCallIntent) { throw new RuntimeException("Stub!"); }
/* 37 */   public void register(SipProfile localProfile, int expiryTime, SipRegistrationListener listener) throws SipException { throw new RuntimeException("Stub!"); }
/* 38 */   public void unregister(SipProfile localProfile, SipRegistrationListener listener) throws SipException { throw new RuntimeException("Stub!"); }
/* 39 */   public SipSession getSessionFor(Intent incomingCallIntent) throws SipException { throw new RuntimeException("Stub!"); }
/* 40 */   public SipSession createSipSession(SipProfile localProfile, SipSession.Listener listener) throws SipException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\net\sip\SipManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */