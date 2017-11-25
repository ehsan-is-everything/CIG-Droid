/*     */ package android.telecom;
/*     */ 
/*     */ import java.util.List;
/*     */ 
/*     */ public final class Call { public static final String AVAILABLE_PHONE_ACCOUNTS = "selectPhoneAccountAccounts";
/*     */   public static final String EXTRA_LAST_EMERGENCY_CALLBACK_TIME_MILLIS = "android.telecom.extra.LAST_EMERGENCY_CALLBACK_TIME_MILLIS";
/*     */   public static final int STATE_ACTIVE = 4;
/*     */   public static final int STATE_CONNECTING = 9;
/*     */   public static final int STATE_DIALING = 1;
/*     */   public static final int STATE_DISCONNECTED = 7;
/*     */   public static final int STATE_DISCONNECTING = 10;
/*     */   public static final int STATE_HOLDING = 3;
/*     */   public static final int STATE_NEW = 0;
/*     */   public static final int STATE_PULLING_CALL = 11;
/*     */   public static final int STATE_RINGING = 2;
/*     */   public static final int STATE_SELECT_PHONE_ACCOUNT = 8;
/*     */   
/*     */   public static class Details { public static final int CAPABILITY_CANNOT_DOWNGRADE_VIDEO_TO_AUDIO = 4194304;
/*     */     public static final int CAPABILITY_CAN_PAUSE_VIDEO = 1048576;
/*     */     public static final int CAPABILITY_CAN_PULL_CALL = 8388608;
/*     */     
/*  22 */     Details() { throw new RuntimeException("Stub!"); }
/*  23 */     public static boolean can(int capabilities, int capability) { throw new RuntimeException("Stub!"); }
/*  24 */     public boolean can(int capability) { throw new RuntimeException("Stub!"); }
/*  25 */     public static String capabilitiesToString(int capabilities) { throw new RuntimeException("Stub!"); }
/*  26 */     public static boolean hasProperty(int properties, int property) { throw new RuntimeException("Stub!"); }
/*  27 */     public boolean hasProperty(int property) { throw new RuntimeException("Stub!"); }
/*  28 */     public static String propertiesToString(int properties) { throw new RuntimeException("Stub!"); }
/*  29 */     public android.net.Uri getHandle() { throw new RuntimeException("Stub!"); }
/*  30 */     public int getHandlePresentation() { throw new RuntimeException("Stub!"); }
/*  31 */     public String getCallerDisplayName() { throw new RuntimeException("Stub!"); }
/*  32 */     public int getCallerDisplayNamePresentation() { throw new RuntimeException("Stub!"); }
/*  33 */     public PhoneAccountHandle getAccountHandle() { throw new RuntimeException("Stub!"); }
/*  34 */     public int getCallCapabilities() { throw new RuntimeException("Stub!"); }
/*  35 */     public int getCallProperties() { throw new RuntimeException("Stub!"); }
/*  36 */     public DisconnectCause getDisconnectCause() { throw new RuntimeException("Stub!"); }
/*  37 */     public final long getConnectTimeMillis() { throw new RuntimeException("Stub!"); }
/*  38 */     public GatewayInfo getGatewayInfo() { throw new RuntimeException("Stub!"); }
/*  39 */     public int getVideoState() { throw new RuntimeException("Stub!"); }
/*  40 */     public StatusHints getStatusHints() { throw new RuntimeException("Stub!"); }
/*  41 */     public android.os.Bundle getExtras() { throw new RuntimeException("Stub!"); }
/*  42 */     public android.os.Bundle getIntentExtras() { throw new RuntimeException("Stub!"); }
/*  43 */     public long getCreationTimeMillis() { throw new RuntimeException("Stub!"); }
/*  44 */     public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/*  45 */     public int hashCode() { throw new RuntimeException("Stub!"); }
/*  46 */     public String toString() { throw new RuntimeException("Stub!"); }
/*     */     
/*     */ 
/*     */     public static final int CAPABILITY_DISCONNECT_FROM_CONFERENCE = 8192;
/*     */     public static final int CAPABILITY_HOLD = 1;
/*     */     public static final int CAPABILITY_MANAGE_CONFERENCE = 128;
/*     */     public static final int CAPABILITY_MERGE_CONFERENCE = 4;
/*     */     public static final int CAPABILITY_MUTE = 64;
/*     */     public static final int CAPABILITY_RESPOND_VIA_TEXT = 32;
/*     */     public static final int CAPABILITY_SEPARATE_FROM_CONFERENCE = 4096;
/*     */     public static final int CAPABILITY_SUPPORTS_VT_LOCAL_BIDIRECTIONAL = 768;
/*     */     public static final int CAPABILITY_SUPPORTS_VT_LOCAL_RX = 256;
/*     */     public static final int CAPABILITY_SUPPORTS_VT_LOCAL_TX = 512;
/*     */     public static final int CAPABILITY_SUPPORTS_VT_REMOTE_BIDIRECTIONAL = 3072;
/*     */     public static final int CAPABILITY_SUPPORTS_VT_REMOTE_RX = 1024;
/*     */     public static final int CAPABILITY_SUPPORTS_VT_REMOTE_TX = 2048;
/*     */     public static final int CAPABILITY_SUPPORT_HOLD = 2;
/*     */     public static final int CAPABILITY_SWAP_CONFERENCE = 8;
/*     */     public static final int PROPERTY_CONFERENCE = 1;
/*     */     public static final int PROPERTY_EMERGENCY_CALLBACK_MODE = 4;
/*     */     public static final int PROPERTY_ENTERPRISE_CALL = 32;
/*     */     public static final int PROPERTY_GENERIC_CONFERENCE = 2;
/*     */     public static final int PROPERTY_HAS_CDMA_VOICE_PRIVACY = 128;
/*     */     public static final int PROPERTY_HIGH_DEF_AUDIO = 16;
/*     */     public static final int PROPERTY_IS_EXTERNAL_CALL = 64;
/*     */     public static final int PROPERTY_SELF_MANAGED = 256;
/*     */     public static final int PROPERTY_WIFI = 8;
/*     */   }
/*     */   
/*     */   public static abstract class Callback
/*     */   {
/*  77 */     public Callback() { throw new RuntimeException("Stub!"); }
/*  78 */     public void onStateChanged(Call call, int state) { throw new RuntimeException("Stub!"); }
/*  79 */     public void onParentChanged(Call call, Call parent) { throw new RuntimeException("Stub!"); }
/*  80 */     public void onChildrenChanged(Call call, List<Call> children) { throw new RuntimeException("Stub!"); }
/*  81 */     public void onDetailsChanged(Call call, Call.Details details) { throw new RuntimeException("Stub!"); }
/*  82 */     public void onCannedTextResponsesLoaded(Call call, List<String> cannedTextResponses) { throw new RuntimeException("Stub!"); }
/*  83 */     public void onPostDialWait(Call call, String remainingPostDialSequence) { throw new RuntimeException("Stub!"); }
/*  84 */     public void onVideoCallChanged(Call call, InCallService.VideoCall videoCall) { throw new RuntimeException("Stub!"); }
/*  85 */     public void onCallDestroyed(Call call) { throw new RuntimeException("Stub!"); }
/*  86 */     public void onConferenceableCallsChanged(Call call, List<Call> conferenceableCalls) { throw new RuntimeException("Stub!"); }
/*  87 */     public void onConnectionEvent(Call call, String event, android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
/*  88 */     public void onRttModeChanged(Call call, int mode) { throw new RuntimeException("Stub!"); }
/*  89 */     public void onRttStatusChanged(Call call, boolean enabled, Call.RttCall rttCall) { throw new RuntimeException("Stub!"); }
/*  90 */     public void onRttRequest(Call call, int id) { throw new RuntimeException("Stub!"); }
/*  91 */     public void onRttInitiationFailure(Call call, int reason) { throw new RuntimeException("Stub!"); } }
/*     */   
/*     */   public static final class RttCall { public static final int RTT_MODE_FULL = 1;
/*     */     
/*  95 */     RttCall() { throw new RuntimeException("Stub!"); }
/*  96 */     public int getRttAudioMode() { throw new RuntimeException("Stub!"); }
/*  97 */     public void setRttMode(int mode) { throw new RuntimeException("Stub!"); }
/*  98 */     public void write(String input) throws java.io.IOException { throw new RuntimeException("Stub!"); }
/*  99 */     public String read() { throw new RuntimeException("Stub!"); }
/*     */     
/*     */     public static final int RTT_MODE_HCO = 2;
/*     */     public static final int RTT_MODE_VCO = 3; }
/*     */   
/* 104 */   Call() { throw new RuntimeException("Stub!"); }
/* 105 */   public String getRemainingPostDialSequence() { throw new RuntimeException("Stub!"); }
/* 106 */   public void answer(int videoState) { throw new RuntimeException("Stub!"); }
/* 107 */   public void reject(boolean rejectWithMessage, String textMessage) { throw new RuntimeException("Stub!"); }
/* 108 */   public void disconnect() { throw new RuntimeException("Stub!"); }
/* 109 */   public void hold() { throw new RuntimeException("Stub!"); }
/* 110 */   public void unhold() { throw new RuntimeException("Stub!"); }
/* 111 */   public void playDtmfTone(char digit) { throw new RuntimeException("Stub!"); }
/* 112 */   public void stopDtmfTone() { throw new RuntimeException("Stub!"); }
/* 113 */   public void postDialContinue(boolean proceed) { throw new RuntimeException("Stub!"); }
/* 114 */   public void phoneAccountSelected(PhoneAccountHandle accountHandle, boolean setDefault) { throw new RuntimeException("Stub!"); }
/* 115 */   public void conference(Call callToConferenceWith) { throw new RuntimeException("Stub!"); }
/* 116 */   public void splitFromConference() { throw new RuntimeException("Stub!"); }
/* 117 */   public void mergeConference() { throw new RuntimeException("Stub!"); }
/* 118 */   public void swapConference() { throw new RuntimeException("Stub!"); }
/* 119 */   public void pullExternalCall() { throw new RuntimeException("Stub!"); }
/* 120 */   public void sendCallEvent(String event, android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
/* 121 */   public void sendRttRequest() { throw new RuntimeException("Stub!"); }
/* 122 */   public void respondToRttRequest(int id, boolean accept) { throw new RuntimeException("Stub!"); }
/* 123 */   public void stopRtt() { throw new RuntimeException("Stub!"); }
/* 124 */   public final void putExtras(android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
/* 125 */   public final void removeExtras(List<String> keys) { throw new RuntimeException("Stub!"); }
/* 126 */   public final void removeExtras(String... keys) { throw new RuntimeException("Stub!"); }
/* 127 */   public Call getParent() { throw new RuntimeException("Stub!"); }
/* 128 */   public List<Call> getChildren() { throw new RuntimeException("Stub!"); }
/* 129 */   public List<Call> getConferenceableCalls() { throw new RuntimeException("Stub!"); }
/* 130 */   public int getState() { throw new RuntimeException("Stub!"); }
/* 131 */   public List<String> getCannedTextResponses() { throw new RuntimeException("Stub!"); }
/* 132 */   public InCallService.VideoCall getVideoCall() { throw new RuntimeException("Stub!"); }
/* 133 */   public Details getDetails() { throw new RuntimeException("Stub!"); }
/* 134 */   public RttCall getRttCall() { throw new RuntimeException("Stub!"); }
/* 135 */   public boolean isRttActive() { throw new RuntimeException("Stub!"); }
/* 136 */   public void registerCallback(Callback callback) { throw new RuntimeException("Stub!"); }
/* 137 */   public void registerCallback(Callback callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
/* 138 */   public void unregisterCallback(Callback callback) { throw new RuntimeException("Stub!"); }
/* 139 */   public String toString() { throw new RuntimeException("Stub!"); }
/*     */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\telecom\Call.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */