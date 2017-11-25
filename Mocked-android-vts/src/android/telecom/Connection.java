/*     */ package android.telecom;
/*     */ 
/*     */ import android.net.Uri;
/*     */ import android.os.Bundle;
/*     */ import android.view.Surface;
/*     */ import java.util.List;
/*     */ 
/*     */ public abstract class Connection
/*     */   extends Conferenceable
/*     */ {
/*     */   public static final int CAPABILITY_CANNOT_DOWNGRADE_VIDEO_TO_AUDIO = 8388608;
/*     */   public static final int CAPABILITY_CAN_PAUSE_VIDEO = 1048576;
/*     */   public static final int CAPABILITY_CAN_PULL_CALL = 16777216;
/*     */   public static final int CAPABILITY_CAN_SEND_RESPONSE_VIA_CONNECTION = 4194304;
/*     */   public static final int CAPABILITY_CAN_UPGRADE_TO_VIDEO = 524288;
/*     */   public static final int CAPABILITY_DISCONNECT_FROM_CONFERENCE = 8192;
/*     */   public static final int CAPABILITY_HOLD = 1;
/*     */   public static final int CAPABILITY_MANAGE_CONFERENCE = 128;
/*     */   public static final int CAPABILITY_MERGE_CONFERENCE = 4;
/*     */   public static final int CAPABILITY_MUTE = 64;
/*     */   public static final int CAPABILITY_RESPOND_VIA_TEXT = 32;
/*     */   public static final int CAPABILITY_SEPARATE_FROM_CONFERENCE = 4096;
/*     */   public static final int CAPABILITY_SUPPORTS_VT_LOCAL_BIDIRECTIONAL = 768;
/*     */   public static final int CAPABILITY_SUPPORTS_VT_LOCAL_RX = 256;
/*     */   public static final int CAPABILITY_SUPPORTS_VT_LOCAL_TX = 512;
/*     */   public static final int CAPABILITY_SUPPORTS_VT_REMOTE_BIDIRECTIONAL = 3072;
/*     */   public static final int CAPABILITY_SUPPORTS_VT_REMOTE_RX = 1024;
/*     */   public static final int CAPABILITY_SUPPORTS_VT_REMOTE_TX = 2048;
/*     */   public static final int CAPABILITY_SUPPORT_HOLD = 2;
/*     */   
/*     */   public static final class RttModifyStatus
/*     */   {
/*     */     public static final int SESSION_MODIFY_REQUEST_FAIL = 2;
/*     */     public static final int SESSION_MODIFY_REQUEST_INVALID = 3;
/*     */     public static final int SESSION_MODIFY_REQUEST_REJECTED_BY_REMOTE = 5;
/*     */     
/*     */     RttModifyStatus()
/*     */     {
/*  23 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */     
/*     */     public static final int SESSION_MODIFY_REQUEST_SUCCESS = 1;
/*     */     public static final int SESSION_MODIFY_REQUEST_TIMED_OUT = 4;
/*     */   }
/*     */   
/*     */   public static abstract class VideoProvider
/*     */   {
/*     */     public static final int SESSION_EVENT_CAMERA_FAILURE = 5;
/*     */     public static final int SESSION_EVENT_CAMERA_PERMISSION_ERROR = 7;
/*     */     public static final int SESSION_EVENT_CAMERA_READY = 6;
/*     */     public static final int SESSION_EVENT_RX_PAUSE = 1;
/*     */     public static final int SESSION_EVENT_RX_RESUME = 2;
/*     */     
/*     */     public VideoProvider()
/*     */     {
/*  32 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */     
/*     */     public abstract void onSetCamera(String paramString);
/*     */     
/*     */     public abstract void onSetPreviewSurface(Surface paramSurface);
/*     */     
/*     */     public abstract void onSetDisplaySurface(Surface paramSurface);
/*     */     
/*     */     public abstract void onSetDeviceOrientation(int paramInt);
/*     */     
/*     */     public abstract void onSetZoom(float paramFloat);
/*     */     
/*     */     public abstract void onSendSessionModifyRequest(VideoProfile paramVideoProfile1, VideoProfile paramVideoProfile2);
/*     */     
/*     */     public abstract void onSendSessionModifyResponse(VideoProfile paramVideoProfile);
/*     */     
/*     */     public abstract void onRequestCameraCapabilities();
/*     */     
/*     */     public abstract void onRequestConnectionDataUsage();
/*     */     
/*     */     public abstract void onSetPauseImage(Uri paramUri);
/*     */     
/*     */     public void receiveSessionModifyRequest(VideoProfile videoProfile)
/*     */     {
/*  43 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */     public static final int SESSION_EVENT_TX_START = 3;
/*     */     public static final int SESSION_EVENT_TX_STOP = 4;
/*     */     
/*     */     public void receiveSessionModifyResponse(int status, VideoProfile requestedProfile, VideoProfile responseProfile)
/*     */     {
/*  44 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */     
/*     */     public static final int SESSION_MODIFY_REQUEST_FAIL = 2;
/*     */     
/*     */     public void handleCallSessionEvent(int event)
/*     */     {
/*  45 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */     
/*     */     public static final int SESSION_MODIFY_REQUEST_INVALID = 3;
/*     */     
/*     */     public void changePeerDimensions(int width, int height)
/*     */     {
/*  46 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */     
/*     */     public static final int SESSION_MODIFY_REQUEST_REJECTED_BY_REMOTE = 5;
/*     */     
/*     */     public void setCallDataUsage(long dataUsage)
/*     */     {
/*  47 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */     
/*     */     public void changeCameraCapabilities(VideoProfile.CameraCapabilities cameraCapabilities)
/*     */     {
/*  48 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */     
/*     */     public static final int SESSION_MODIFY_REQUEST_SUCCESS = 1;
/*     */     
/*     */     public void changeVideoQuality(int videoQuality)
/*     */     {
/*  49 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */     
/*     */     public static final int SESSION_MODIFY_REQUEST_TIMED_OUT = 4;
/*     */   }
/*     */   
/*     */   public static final int CAPABILITY_SWAP_CONFERENCE = 8;
/*     */   public static final String EVENT_CALL_MERGE_FAILED = "android.telecom.event.CALL_MERGE_FAILED";
/*     */   public static final String EVENT_CALL_PULL_FAILED = "android.telecom.event.CALL_PULL_FAILED";
/*     */   public static final String EXTRA_ANSWERING_DROPS_FG_CALL = "android.telecom.extra.ANSWERING_DROPS_FG_CALL";
/*     */   public static final String EXTRA_ANSWERING_DROPS_FG_CALL_APP_NAME = "android.telecom.extra.ANSWERING_DROPS_FG_CALL_APP_NAME";
/*     */   public static final String EXTRA_CALL_SUBJECT = "android.telecom.extra.CALL_SUBJECT";
/*     */   public static final String EXTRA_CHILD_ADDRESS = "android.telecom.extra.CHILD_ADDRESS";
/*     */   public static final String EXTRA_LAST_FORWARDED_NUMBER = "android.telecom.extra.LAST_FORWARDED_NUMBER";
/*     */   public static final int PROPERTY_HAS_CDMA_VOICE_PRIVACY = 32;
/*     */   
/*     */   public Connection()
/*     */   {
/*  63 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public static String capabilitiesToString(int capabilities)
/*     */   {
/*  64 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public static String propertiesToString(int properties)
/*     */   {
/*  65 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public final Uri getAddress()
/*     */   {
/*  66 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public final int getAddressPresentation()
/*     */   {
/*  67 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public final String getCallerDisplayName()
/*     */   {
/*  68 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public final int getCallerDisplayNamePresentation()
/*     */   {
/*  69 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public final int getState()
/*     */   {
/*  70 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public final CallAudioState getCallAudioState()
/*     */   {
/*  71 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public final Conference getConference()
/*     */   {
/*  72 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public final boolean isRingbackRequested()
/*     */   {
/*  73 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public final boolean getAudioModeIsVoip()
/*     */   {
/*  74 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public final StatusHints getStatusHints()
/*     */   {
/*  75 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public final Bundle getExtras()
/*     */   {
/*  76 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public final DisconnectCause getDisconnectCause()
/*     */   {
/*  77 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public static String stateToString(int state)
/*     */   {
/*  78 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public final int getConnectionCapabilities()
/*     */   {
/*  79 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public final int getConnectionProperties()
/*     */   {
/*  80 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public final void setAddress(Uri address, int presentation)
/*     */   {
/*  81 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public final void setCallerDisplayName(String callerDisplayName, int presentation)
/*     */   {
/*  82 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public final void setVideoState(int videoState)
/*     */   {
/*  83 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public final void setActive()
/*     */   {
/*  84 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public final void setRinging()
/*     */   {
/*  85 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public final void setInitializing()
/*     */   {
/*  86 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public final void setInitialized()
/*     */   {
/*  87 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public final void setDialing()
/*     */   {
/*  88 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public final void setPulling()
/*     */   {
/*  89 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public final void setOnHold()
/*     */   {
/*  90 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public final void setVideoProvider(VideoProvider videoProvider)
/*     */   {
/*  91 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public final VideoProvider getVideoProvider()
/*     */   {
/*  92 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public final void setDisconnected(DisconnectCause disconnectCause)
/*     */   {
/*  93 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public final void setPostDialWait(String remaining)
/*     */   {
/*  94 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public final void setNextPostDialChar(char nextChar)
/*     */   {
/*  95 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public final void setRingbackRequested(boolean ringback)
/*     */   {
/*  96 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public final void setConnectionCapabilities(int connectionCapabilities)
/*     */   {
/*  97 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public final void setConnectionProperties(int connectionProperties)
/*     */   {
/*  98 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public final void destroy()
/*     */   {
/*  99 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public final void setAudioModeIsVoip(boolean isVoip)
/*     */   {
/* 100 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public final void setStatusHints(StatusHints statusHints)
/*     */   {
/* 101 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public final void setConferenceableConnections(List<Connection> conferenceableConnections)
/*     */   {
/* 102 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public final void setConferenceables(List<Conferenceable> conferenceables)
/*     */   {
/* 103 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public final List<Conferenceable> getConferenceables()
/*     */   {
/* 104 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public final void setExtras(Bundle extras)
/*     */   {
/* 105 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public final void putExtras(Bundle extras)
/*     */   {
/* 106 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public final void removeExtras(List<String> keys)
/*     */   {
/* 107 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public final void removeExtras(String... keys)
/*     */   {
/* 108 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public final void setAudioRoute(int route)
/*     */   {
/* 109 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public void onCallAudioStateChanged(CallAudioState state)
/*     */   {
/* 110 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public void onStateChanged(int state)
/*     */   {
/* 111 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public void onPlayDtmfTone(char c)
/*     */   {
/* 112 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public void onStopDtmfTone()
/*     */   {
/* 113 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public void onDisconnect()
/*     */   {
/* 114 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public void onSeparate()
/*     */   {
/* 115 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public void onAbort()
/*     */   {
/* 116 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public void onHold()
/*     */   {
/* 117 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public void onUnhold()
/*     */   {
/* 118 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public void onAnswer(int videoState)
/*     */   {
/* 119 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public void onAnswer()
/*     */   {
/* 120 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public void onReject()
/*     */   {
/* 121 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public void onReject(String replyMessage)
/*     */   {
/* 122 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public void onPostDialContinue(boolean proceed)
/*     */   {
/* 123 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public void onPullExternalCall()
/*     */   {
/* 124 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public void onCallEvent(String event, Bundle extras)
/*     */   {
/* 125 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public void onExtrasChanged(Bundle extras)
/*     */   {
/* 126 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public void onShowIncomingCallUi()
/*     */   {
/* 127 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public static Connection createFailedConnection(DisconnectCause disconnectCause)
/*     */   {
/* 128 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public static Connection createCanceledConnection()
/*     */   {
/* 129 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public void sendConnectionEvent(String event, Bundle extras)
/*     */   {
/* 130 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public static final int PROPERTY_IS_EXTERNAL_CALL = 16;
/*     */   public static final int PROPERTY_SELF_MANAGED = 128;
/*     */   public static final int STATE_ACTIVE = 4;
/*     */   public static final int STATE_DIALING = 3;
/*     */   public static final int STATE_DISCONNECTED = 6;
/*     */   public static final int STATE_HOLDING = 5;
/*     */   public static final int STATE_INITIALIZING = 0;
/*     */   public static final int STATE_NEW = 1;
/*     */   public static final int STATE_PULLING_CALL = 7;
/*     */   public static final int STATE_RINGING = 2;
/*     */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\telecom\Connection.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */