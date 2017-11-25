/*     */ package android.telephony;
/*     */ 
/*     */ import android.net.Uri;
/*     */ import android.telecom.PhoneAccountHandle;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class TelephonyManager
/*     */ {
/*     */   public static final String VVM_TYPE_OMTP = "vvm_type_omtp";
/*     */   public static final String VVM_TYPE_CVVM = "vvm_type_cvvm";
/*     */   public static final int USSD_RETURN_FAILURE = -1;
/*     */   public static final int USSD_ERROR_SERVICE_UNAVAIL = -2;
/*     */   public static final int SIM_STATE_UNKNOWN = 0;
/*     */   public static final int SIM_STATE_READY = 5;
/*     */   public static final int SIM_STATE_PUK_REQUIRED = 3;
/*     */   public static final int SIM_STATE_PIN_REQUIRED = 2;
/*     */   public static final int SIM_STATE_PERM_DISABLED = 7;
/*     */   
/*     */   public static abstract class UssdResponseCallback
/*     */   {
/*  22 */     public UssdResponseCallback() { throw new RuntimeException("Stub!"); }
/*  23 */     public void onReceiveUssdResponse(TelephonyManager telephonyManager, String request, CharSequence response) { throw new RuntimeException("Stub!"); }
/*  24 */     public void onReceiveUssdResponseFailed(TelephonyManager telephonyManager, String request, int failureCode) { throw new RuntimeException("Stub!"); } }
/*     */   
/*  26 */   TelephonyManager() { throw new RuntimeException("Stub!"); }
/*  27 */   public int getPhoneCount() { throw new RuntimeException("Stub!"); }
/*  28 */   public TelephonyManager createForSubscriptionId(int subId) { throw new RuntimeException("Stub!"); }
/*  29 */   public TelephonyManager createForPhoneAccountHandle(PhoneAccountHandle phoneAccountHandle) { throw new RuntimeException("Stub!"); }
/*  30 */   public String getDeviceSoftwareVersion() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  32 */   public String getDeviceId() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  34 */   public String getDeviceId(int slotIndex) { throw new RuntimeException("Stub!"); }
/*  35 */   public String getImei() { throw new RuntimeException("Stub!"); }
/*  36 */   public String getImei(int slotIndex) { throw new RuntimeException("Stub!"); }
/*  37 */   public String getMeid() { throw new RuntimeException("Stub!"); }
/*  38 */   public String getMeid(int slotIndex) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  40 */   public CellLocation getCellLocation() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  42 */   public java.util.List<NeighboringCellInfo> getNeighboringCellInfo() { throw new RuntimeException("Stub!"); }
/*  43 */   public int getPhoneType() { throw new RuntimeException("Stub!"); }
/*  44 */   public String getNetworkOperatorName() { throw new RuntimeException("Stub!"); }
/*  45 */   public String getNetworkOperator() { throw new RuntimeException("Stub!"); }
/*  46 */   public String getNetworkSpecifier() { throw new RuntimeException("Stub!"); }
/*  47 */   public android.os.PersistableBundle getCarrierConfig() { throw new RuntimeException("Stub!"); }
/*  48 */   public boolean isNetworkRoaming() { throw new RuntimeException("Stub!"); }
/*  49 */   public String getNetworkCountryIso() { throw new RuntimeException("Stub!"); }
/*  50 */   public int getNetworkType() { throw new RuntimeException("Stub!"); }
/*  51 */   public int getDataNetworkType() { throw new RuntimeException("Stub!"); }
/*  52 */   public int getVoiceNetworkType() { throw new RuntimeException("Stub!"); }
/*  53 */   public boolean hasIccCard() { throw new RuntimeException("Stub!"); }
/*  54 */   public int getSimState() { throw new RuntimeException("Stub!"); }
/*  55 */   public int getSimState(int slotIndex) { throw new RuntimeException("Stub!"); }
/*  56 */   public String getSimOperator() { throw new RuntimeException("Stub!"); }
/*  57 */   public String getSimOperatorName() { throw new RuntimeException("Stub!"); }
/*  58 */   public String getSimCountryIso() { throw new RuntimeException("Stub!"); }
/*  59 */   public String getSimSerialNumber() { throw new RuntimeException("Stub!"); }
/*  60 */   public String getSubscriberId() { throw new RuntimeException("Stub!"); }
/*  61 */   public String getGroupIdLevel1() { throw new RuntimeException("Stub!"); }
/*  62 */   public String getLine1Number() { throw new RuntimeException("Stub!"); }
/*  63 */   public boolean setLine1NumberForDisplay(String alphaTag, String number) { throw new RuntimeException("Stub!"); }
/*  64 */   public String getVoiceMailNumber() { throw new RuntimeException("Stub!"); }
/*  65 */   public boolean setVoiceMailNumber(String alphaTag, String number) { throw new RuntimeException("Stub!"); }
/*  66 */   public String getVisualVoicemailPackageName() { throw new RuntimeException("Stub!"); }
/*  67 */   public void setVisualVoicemailSmsFilterSettings(VisualVoicemailSmsFilterSettings settings) { throw new RuntimeException("Stub!"); }
/*  68 */   public void sendVisualVoicemailSms(String number, int port, String text, android.app.PendingIntent sentIntent) { throw new RuntimeException("Stub!"); }
/*  69 */   public String getVoiceMailAlphaTag() { throw new RuntimeException("Stub!"); }
/*  70 */   public void sendDialerSpecialCode(String inputCode) { throw new RuntimeException("Stub!"); }
/*  71 */   public int getCallState() { throw new RuntimeException("Stub!"); }
/*  72 */   public int getDataActivity() { throw new RuntimeException("Stub!"); }
/*  73 */   public int getDataState() { throw new RuntimeException("Stub!"); }
/*  74 */   public void listen(PhoneStateListener listener, int events) { throw new RuntimeException("Stub!"); }
/*  75 */   public boolean isVoiceCapable() { throw new RuntimeException("Stub!"); }
/*  76 */   public boolean isSmsCapable() { throw new RuntimeException("Stub!"); }
/*  77 */   public java.util.List<CellInfo> getAllCellInfo() { throw new RuntimeException("Stub!"); }
/*  78 */   public String getMmsUserAgent() { throw new RuntimeException("Stub!"); }
/*  79 */   public String getMmsUAProfUrl() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  81 */   public IccOpenLogicalChannelResponse iccOpenLogicalChannel(String AID) { throw new RuntimeException("Stub!"); }
/*  82 */   public IccOpenLogicalChannelResponse iccOpenLogicalChannel(String AID, int p2) { throw new RuntimeException("Stub!"); }
/*  83 */   public boolean iccCloseLogicalChannel(int channel) { throw new RuntimeException("Stub!"); }
/*  84 */   public String iccTransmitApduLogicalChannel(int channel, int cla, int instruction, int p1, int p2, int p3, String data) { throw new RuntimeException("Stub!"); }
/*  85 */   public String iccTransmitApduBasicChannel(int cla, int instruction, int p1, int p2, int p3, String data) { throw new RuntimeException("Stub!"); }
/*  86 */   public byte[] iccExchangeSimIO(int fileID, int command, int p1, int p2, int p3, String filePath) { throw new RuntimeException("Stub!"); }
/*  87 */   public String sendEnvelopeWithStatus(String content) { throw new RuntimeException("Stub!"); }
/*  88 */   public String getIccAuthentication(int appType, int authType, String data) { throw new RuntimeException("Stub!"); }
/*  89 */   public String[] getForbiddenPlmns() { throw new RuntimeException("Stub!"); }
/*  90 */   public boolean setPreferredNetworkTypeToGlobal() { throw new RuntimeException("Stub!"); }
/*  91 */   public boolean hasCarrierPrivileges() { throw new RuntimeException("Stub!"); }
/*  92 */   public boolean setOperatorBrandOverride(String brand) { throw new RuntimeException("Stub!"); }
/*  93 */   public void sendUssdRequest(String ussdRequest, UssdResponseCallback callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
/*  94 */   public boolean isConcurrentVoiceAndDataSupported() { throw new RuntimeException("Stub!"); }
/*  95 */   public void setDataEnabled(boolean enable) { throw new RuntimeException("Stub!"); }
/*     */   
/*  97 */   public boolean isDataEnabled() { throw new RuntimeException("Stub!"); }
/*  98 */   public boolean canChangeDtmfToneLength() { throw new RuntimeException("Stub!"); }
/*  99 */   public boolean isWorldPhone() { throw new RuntimeException("Stub!"); }
/* 100 */   public boolean isTtyModeSupported() { throw new RuntimeException("Stub!"); }
/* 101 */   public boolean isHearingAidCompatibilitySupported() { throw new RuntimeException("Stub!"); }
/* 102 */   public ServiceState getServiceState() { throw new RuntimeException("Stub!"); }
/* 103 */   public Uri getVoicemailRingtoneUri(PhoneAccountHandle accountHandle) { throw new RuntimeException("Stub!"); }
/* 104 */   public void setVoicemailRingtoneUri(PhoneAccountHandle phoneAccountHandle, Uri uri) { throw new RuntimeException("Stub!"); }
/* 105 */   public boolean isVoicemailVibrationEnabled(PhoneAccountHandle accountHandle) { throw new RuntimeException("Stub!"); }
/* 106 */   public void setVoicemailVibrationEnabled(PhoneAccountHandle phoneAccountHandle, boolean enabled) { throw new RuntimeException("Stub!"); }
/*     */   
/*     */ 
/*     */ 
/*     */   public static final int SIM_STATE_NOT_READY = 6;
/*     */   
/*     */ 
/*     */   public static final int SIM_STATE_NETWORK_LOCKED = 4;
/*     */   
/*     */ 
/*     */   public static final int SIM_STATE_CARD_RESTRICTED = 9;
/*     */   
/*     */ 
/*     */   public static final int SIM_STATE_CARD_IO_ERROR = 8;
/*     */   
/*     */ 
/*     */   public static final int SIM_STATE_ABSENT = 1;
/*     */   
/*     */ 
/*     */   public static final int PHONE_TYPE_SIP = 3;
/*     */   
/*     */ 
/*     */   public static final int PHONE_TYPE_NONE = 0;
/*     */   
/*     */ 
/*     */   public static final int PHONE_TYPE_GSM = 1;
/*     */   
/*     */ 
/*     */   public static final int PHONE_TYPE_CDMA = 2;
/*     */   
/*     */ 
/*     */   public static final int NETWORK_TYPE_UNKNOWN = 0;
/*     */   
/*     */   public static final int NETWORK_TYPE_UMTS = 3;
/*     */   
/*     */   public static final int NETWORK_TYPE_TD_SCDMA = 17;
/*     */   
/*     */   public static final int NETWORK_TYPE_LTE = 13;
/*     */   
/*     */   public static final int NETWORK_TYPE_IWLAN = 18;
/*     */   
/*     */   public static final int NETWORK_TYPE_IDEN = 11;
/*     */   
/*     */   public static final int NETWORK_TYPE_HSUPA = 9;
/*     */   
/*     */   public static final int NETWORK_TYPE_HSPAP = 15;
/*     */   
/*     */   public static final int NETWORK_TYPE_HSPA = 10;
/*     */   
/*     */   public static final int NETWORK_TYPE_HSDPA = 8;
/*     */   
/*     */   public static final int NETWORK_TYPE_GSM = 16;
/*     */   
/*     */   public static final int NETWORK_TYPE_GPRS = 1;
/*     */   
/*     */   public static final int NETWORK_TYPE_EVDO_B = 12;
/*     */   
/*     */   public static final int NETWORK_TYPE_EVDO_A = 6;
/*     */   
/*     */   public static final int NETWORK_TYPE_EVDO_0 = 5;
/*     */   
/*     */   public static final int NETWORK_TYPE_EHRPD = 14;
/*     */   
/*     */   public static final int NETWORK_TYPE_EDGE = 2;
/*     */   
/*     */   public static final int NETWORK_TYPE_CDMA = 4;
/*     */   
/*     */   public static final int NETWORK_TYPE_1xRTT = 7;
/*     */   
/*     */   public static final String METADATA_HIDE_VOICEMAIL_SETTINGS_MENU = "android.telephony.HIDE_VOICEMAIL_SETTINGS_MENU";
/*     */   
/*     */   public static final String EXTRA_VOICEMAIL_NUMBER = "android.telephony.extra.VOICEMAIL_NUMBER";
/*     */   
/* 179 */   public static final String EXTRA_STATE_RINGING = null; public static final String EXTRA_STATE_OFFHOOK = null; public static final String EXTRA_STATE_IDLE = null;
/*     */   public static final String EXTRA_STATE = "state";
/*     */   public static final String EXTRA_PHONE_ACCOUNT_HANDLE = "android.telephony.extra.PHONE_ACCOUNT_HANDLE";
/*     */   public static final String EXTRA_NOTIFICATION_COUNT = "android.telephony.extra.NOTIFICATION_COUNT";
/*     */   public static final String EXTRA_LAUNCH_VOICEMAIL_SETTINGS_INTENT = "android.telephony.extra.LAUNCH_VOICEMAIL_SETTINGS_INTENT";
/*     */   public static final String EXTRA_INCOMING_NUMBER = "incoming_number";
/*     */   public static final String EXTRA_HIDE_PUBLIC_SETTINGS = "android.telephony.extra.HIDE_PUBLIC_SETTINGS";
/*     */   public static final String EXTRA_CALL_VOICEMAIL_INTENT = "android.telephony.extra.CALL_VOICEMAIL_INTENT";
/*     */   public static final int DATA_SUSPENDED = 3;
/*     */   public static final int DATA_DISCONNECTED = 0;
/*     */   public static final int DATA_CONNECTING = 1;
/*     */   public static final int DATA_CONNECTED = 2;
/*     */   public static final int DATA_ACTIVITY_OUT = 2;
/*     */   public static final int DATA_ACTIVITY_NONE = 0;
/*     */   public static final int DATA_ACTIVITY_INOUT = 3;
/*     */   public static final int DATA_ACTIVITY_IN = 1;
/*     */   public static final int DATA_ACTIVITY_DORMANT = 4;
/*     */   public static final int CALL_STATE_RINGING = 1;
/*     */   public static final int CALL_STATE_OFFHOOK = 2;
/*     */   public static final int CALL_STATE_IDLE = 0;
/*     */   public static final int AUTHTYPE_EAP_SIM = 128;
/*     */   public static final int AUTHTYPE_EAP_AKA = 129;
/*     */   public static final int APPTYPE_USIM = 2;
/*     */   public static final int APPTYPE_SIM = 1;
/*     */   public static final int APPTYPE_RUIM = 3;
/*     */   public static final int APPTYPE_ISIM = 5;
/*     */   public static final int APPTYPE_CSIM = 4;
/*     */   public static final String ACTION_SHOW_VOICEMAIL_NOTIFICATION = "android.telephony.action.SHOW_VOICEMAIL_NOTIFICATION";
/*     */   public static final String ACTION_RESPOND_VIA_MESSAGE = "android.intent.action.RESPOND_VIA_MESSAGE";
/*     */   public static final String ACTION_PHONE_STATE_CHANGED = "android.intent.action.PHONE_STATE";
/*     */   public static final String ACTION_CONFIGURE_VOICEMAIL = "android.telephony.action.CONFIGURE_VOICEMAIL";
/*     */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\telephony\TelephonyManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */