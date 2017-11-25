/*    */ package android.telecom;
/*    */ 
/*    */ import android.os.Bundle;
/*    */ 
/*    */ 
/*    */ public class TelecomManager {
/*    */   public static final String ACTION_CHANGE_DEFAULT_DIALER = "android.telecom.action.CHANGE_DEFAULT_DIALER";
/*    */   public static final String ACTION_CHANGE_PHONE_ACCOUNTS = "android.telecom.action.CHANGE_PHONE_ACCOUNTS";
/*    */   public static final String ACTION_CONFIGURE_PHONE_ACCOUNT = "android.telecom.action.CONFIGURE_PHONE_ACCOUNT";
/*    */   public static final String ACTION_DEFAULT_DIALER_CHANGED = "android.telecom.action.DEFAULT_DIALER_CHANGED";
/*    */   @Deprecated
/*    */   public static final String ACTION_INCOMING_CALL = "android.telecom.action.INCOMING_CALL";
/*    */   public static final String ACTION_PHONE_ACCOUNT_REGISTERED = "android.telecom.action.PHONE_ACCOUNT_REGISTERED";
/*    */   public static final String ACTION_PHONE_ACCOUNT_UNREGISTERED = "android.telecom.action.PHONE_ACCOUNT_UNREGISTERED";
/*    */   public static final String ACTION_SHOW_CALL_ACCESSIBILITY_SETTINGS = "android.telecom.action.SHOW_CALL_ACCESSIBILITY_SETTINGS";
/*    */   public static final String ACTION_SHOW_CALL_SETTINGS = "android.telecom.action.SHOW_CALL_SETTINGS";
/*    */   
/* 18 */   TelecomManager() { throw new RuntimeException("Stub!"); }
/* 19 */   public PhoneAccountHandle getDefaultOutgoingPhoneAccount(String uriScheme) { throw new RuntimeException("Stub!"); }
/* 20 */   public PhoneAccountHandle getSimCallManager() { throw new RuntimeException("Stub!"); }
/* 21 */   public java.util.List<PhoneAccountHandle> getCallCapablePhoneAccounts() { throw new RuntimeException("Stub!"); }
/* 22 */   public java.util.List<PhoneAccountHandle> getSelfManagedPhoneAccounts() { throw new RuntimeException("Stub!"); }
/* 23 */   public PhoneAccount getPhoneAccount(PhoneAccountHandle account) { throw new RuntimeException("Stub!"); }
/* 24 */   public void registerPhoneAccount(PhoneAccount account) { throw new RuntimeException("Stub!"); }
/* 25 */   public void unregisterPhoneAccount(PhoneAccountHandle accountHandle) { throw new RuntimeException("Stub!"); }
/* 26 */   public String getDefaultDialerPackage() { throw new RuntimeException("Stub!"); }
/* 27 */   public boolean isVoiceMailNumber(PhoneAccountHandle accountHandle, String number) { throw new RuntimeException("Stub!"); }
/* 28 */   public String getVoiceMailNumber(PhoneAccountHandle accountHandle) { throw new RuntimeException("Stub!"); }
/* 29 */   public String getLine1Number(PhoneAccountHandle accountHandle) { throw new RuntimeException("Stub!"); }
/* 30 */   public boolean isInCall() { throw new RuntimeException("Stub!"); }
/* 31 */   public boolean isInManagedCall() { throw new RuntimeException("Stub!"); }
/* 32 */   public void acceptRingingCall() { throw new RuntimeException("Stub!"); }
/* 33 */   public void acceptRingingCall(int videoState) { throw new RuntimeException("Stub!"); }
/* 34 */   public void silenceRinger() { throw new RuntimeException("Stub!"); }
/* 35 */   public void addNewIncomingCall(PhoneAccountHandle phoneAccount, Bundle extras) { throw new RuntimeException("Stub!"); }
/* 36 */   public boolean handleMmi(String dialString) { throw new RuntimeException("Stub!"); }
/* 37 */   public boolean handleMmi(String dialString, PhoneAccountHandle accountHandle) { throw new RuntimeException("Stub!"); }
/* 38 */   public android.net.Uri getAdnUriForPhoneAccount(PhoneAccountHandle accountHandle) { throw new RuntimeException("Stub!"); }
/* 39 */   public void cancelMissedCallsNotification() { throw new RuntimeException("Stub!"); }
/* 40 */   public void showInCallScreen(boolean showDialpad) { throw new RuntimeException("Stub!"); }
/* 41 */   public void placeCall(android.net.Uri address, Bundle extras) { throw new RuntimeException("Stub!"); }
/* 42 */   public android.content.Intent createManageBlockedNumbersIntent() { throw new RuntimeException("Stub!"); }
/* 43 */   public boolean isIncomingCallPermitted(PhoneAccountHandle phoneAccountHandle) { throw new RuntimeException("Stub!"); }
/* 44 */   public boolean isOutgoingCallPermitted(PhoneAccountHandle phoneAccountHandle) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static final String ACTION_SHOW_MISSED_CALLS_NOTIFICATION = "android.telecom.action.SHOW_MISSED_CALLS_NOTIFICATION";
/*    */   public static final String ACTION_SHOW_RESPOND_VIA_SMS_SETTINGS = "android.telecom.action.SHOW_RESPOND_VIA_SMS_SETTINGS";
/*    */   public static final char DTMF_CHARACTER_PAUSE = ',';
/*    */   public static final char DTMF_CHARACTER_WAIT = ';';
/*    */   public static final String EXTRA_CALL_BACK_NUMBER = "android.telecom.extra.CALL_BACK_NUMBER";
/*    */   public static final String EXTRA_CALL_DISCONNECT_CAUSE = "android.telecom.extra.CALL_DISCONNECT_CAUSE";
/*    */   public static final String EXTRA_CALL_DISCONNECT_MESSAGE = "android.telecom.extra.CALL_DISCONNECT_MESSAGE";
/*    */   public static final String EXTRA_CALL_SUBJECT = "android.telecom.extra.CALL_SUBJECT";
/*    */   public static final String EXTRA_CHANGE_DEFAULT_DIALER_PACKAGE_NAME = "android.telecom.extra.CHANGE_DEFAULT_DIALER_PACKAGE_NAME";
/*    */   public static final String EXTRA_INCOMING_CALL_ADDRESS = "android.telecom.extra.INCOMING_CALL_ADDRESS";
/*    */   public static final String EXTRA_INCOMING_CALL_EXTRAS = "android.telecom.extra.INCOMING_CALL_EXTRAS";
/*    */   public static final String EXTRA_INCOMING_VIDEO_STATE = "android.telecom.extra.INCOMING_VIDEO_STATE";
/*    */   public static final String EXTRA_NOTIFICATION_COUNT = "android.telecom.extra.NOTIFICATION_COUNT";
/*    */   public static final String EXTRA_NOTIFICATION_PHONE_NUMBER = "android.telecom.extra.NOTIFICATION_PHONE_NUMBER";
/*    */   public static final String EXTRA_OUTGOING_CALL_EXTRAS = "android.telecom.extra.OUTGOING_CALL_EXTRAS";
/*    */   public static final String EXTRA_PHONE_ACCOUNT_HANDLE = "android.telecom.extra.PHONE_ACCOUNT_HANDLE";
/*    */   public static final String EXTRA_START_CALL_WITH_RTT = "android.telecom.extra.START_CALL_WITH_RTT";
/*    */   public static final String EXTRA_START_CALL_WITH_SPEAKERPHONE = "android.telecom.extra.START_CALL_WITH_SPEAKERPHONE";
/*    */   public static final String EXTRA_START_CALL_WITH_VIDEO_STATE = "android.telecom.extra.START_CALL_WITH_VIDEO_STATE";
/*    */   public static final String GATEWAY_ORIGINAL_ADDRESS = "android.telecom.extra.GATEWAY_ORIGINAL_ADDRESS";
/*    */   public static final String GATEWAY_PROVIDER_PACKAGE = "android.telecom.extra.GATEWAY_PROVIDER_PACKAGE";
/*    */   public static final String METADATA_INCLUDE_EXTERNAL_CALLS = "android.telecom.INCLUDE_EXTERNAL_CALLS";
/*    */   public static final String METADATA_INCLUDE_SELF_MANAGED_CALLS = "android.telecom.INCLUDE_SELF_MANAGED_CALLS";
/*    */   public static final String METADATA_IN_CALL_SERVICE_RINGING = "android.telecom.IN_CALL_SERVICE_RINGING";
/*    */   public static final String METADATA_IN_CALL_SERVICE_UI = "android.telecom.IN_CALL_SERVICE_UI";
/*    */   public static final int PRESENTATION_ALLOWED = 1;
/*    */   public static final int PRESENTATION_PAYPHONE = 4;
/*    */   public static final int PRESENTATION_RESTRICTED = 2;
/*    */   public static final int PRESENTATION_UNKNOWN = 3;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\telecom\TelecomManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */