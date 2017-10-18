/*     */ package android.media;
/*     */ 
/*     */ import android.os.Handler;
/*     */ 
/*     */ 
/*     */ public class AudioManager
/*     */ {
/*     */   public static final String ACTION_AUDIO_BECOMING_NOISY = "android.media.AUDIO_BECOMING_NOISY";
/*     */   public static final String ACTION_HDMI_AUDIO_PLUG = "android.media.action.HDMI_AUDIO_PLUG";
/*     */   public static final String ACTION_HEADSET_PLUG = "android.intent.action.HEADSET_PLUG";
/*     */   @Deprecated
/*     */   public static final String ACTION_SCO_AUDIO_STATE_CHANGED = "android.media.SCO_AUDIO_STATE_CHANGED";
/*     */   public static final String ACTION_SCO_AUDIO_STATE_UPDATED = "android.media.ACTION_SCO_AUDIO_STATE_UPDATED";
/*     */   public static final int ADJUST_LOWER = -1;
/*     */   public static final int ADJUST_MUTE = -100;
/*     */   public static final int ADJUST_RAISE = 1;
/*     */   public static final int ADJUST_SAME = 0;
/*     */   public static final int ADJUST_TOGGLE_MUTE = 101;
/*     */   public static final int ADJUST_UNMUTE = 100;
/*     */   
/*     */   public static abstract interface OnAudioFocusChangeListener {
/*     */     public abstract void onAudioFocusChange(int paramInt);
/*     */   }
/*     */   
/*     */   public static abstract class AudioPlaybackCallback {
/*  26 */     public AudioPlaybackCallback() { throw new RuntimeException("Stub!"); }
/*  27 */     public void onPlaybackConfigChanged(java.util.List<AudioPlaybackConfiguration> configs) { throw new RuntimeException("Stub!"); } }
/*     */   
/*     */   public static final int AUDIOFOCUS_GAIN = 1;
/*     */   public static final int AUDIOFOCUS_GAIN_TRANSIENT = 2;
/*  31 */   public static abstract class AudioRecordingCallback { public AudioRecordingCallback() { throw new RuntimeException("Stub!"); }
/*  32 */     public void onRecordingConfigChanged(java.util.List<AudioRecordingConfiguration> configs) { throw new RuntimeException("Stub!"); } }
/*     */   public static final int AUDIOFOCUS_GAIN_TRANSIENT_EXCLUSIVE = 4;
/*  34 */   AudioManager() { throw new RuntimeException("Stub!"); }
/*  35 */   public void dispatchMediaKeyEvent(android.view.KeyEvent keyEvent) { throw new RuntimeException("Stub!"); }
/*  36 */   public boolean isVolumeFixed() { throw new RuntimeException("Stub!"); }
/*  37 */   public void adjustStreamVolume(int streamType, int direction, int flags) { throw new RuntimeException("Stub!"); }
/*  38 */   public void adjustVolume(int direction, int flags) { throw new RuntimeException("Stub!"); }
/*  39 */   public void adjustSuggestedStreamVolume(int direction, int suggestedStreamType, int flags) { throw new RuntimeException("Stub!"); }
/*  40 */   public int getRingerMode() { throw new RuntimeException("Stub!"); }
/*  41 */   public int getStreamMaxVolume(int streamType) { throw new RuntimeException("Stub!"); }
/*  42 */   public int getStreamVolume(int streamType) { throw new RuntimeException("Stub!"); }
/*  43 */   public void setRingerMode(int ringerMode) { throw new RuntimeException("Stub!"); }
/*  44 */   public void setStreamVolume(int streamType, int index, int flags) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  46 */   public void setStreamSolo(int streamType, boolean state) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  48 */   public void setStreamMute(int streamType, boolean state) { throw new RuntimeException("Stub!"); }
/*  49 */   public boolean isStreamMute(int streamType) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  51 */   public boolean shouldVibrate(int vibrateType) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  53 */   public int getVibrateSetting(int vibrateType) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  55 */   public void setVibrateSetting(int vibrateType, int vibrateSetting) { throw new RuntimeException("Stub!"); }
/*  56 */   public void setSpeakerphoneOn(boolean on) { throw new RuntimeException("Stub!"); }
/*  57 */   public boolean isSpeakerphoneOn() { throw new RuntimeException("Stub!"); }
/*  58 */   public boolean isBluetoothScoAvailableOffCall() { throw new RuntimeException("Stub!"); }
/*  59 */   public void startBluetoothSco() { throw new RuntimeException("Stub!"); }
/*  60 */   public void stopBluetoothSco() { throw new RuntimeException("Stub!"); }
/*  61 */   public void setBluetoothScoOn(boolean on) { throw new RuntimeException("Stub!"); }
/*  62 */   public boolean isBluetoothScoOn() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  64 */   public void setBluetoothA2dpOn(boolean on) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  66 */   public boolean isBluetoothA2dpOn() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  68 */   public void setWiredHeadsetOn(boolean on) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  70 */   public boolean isWiredHeadsetOn() { throw new RuntimeException("Stub!"); }
/*  71 */   public void setMicrophoneMute(boolean on) { throw new RuntimeException("Stub!"); }
/*  72 */   public boolean isMicrophoneMute() { throw new RuntimeException("Stub!"); }
/*  73 */   public void setMode(int mode) { throw new RuntimeException("Stub!"); }
/*  74 */   public int getMode() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  76 */   public void setRouting(int mode, int routes, int mask) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  78 */   public int getRouting(int mode) { throw new RuntimeException("Stub!"); }
/*  79 */   public boolean isMusicActive() { throw new RuntimeException("Stub!"); }
/*  80 */   public int generateAudioSessionId() { throw new RuntimeException("Stub!"); }
/*  81 */   public void setParameters(String keyValuePairs) { throw new RuntimeException("Stub!"); }
/*  82 */   public String getParameters(String keys) { throw new RuntimeException("Stub!"); }
/*  83 */   public void playSoundEffect(int effectType) { throw new RuntimeException("Stub!"); }
/*  84 */   public void playSoundEffect(int effectType, float volume) { throw new RuntimeException("Stub!"); }
/*  85 */   public void loadSoundEffects() { throw new RuntimeException("Stub!"); }
/*  86 */   public void unloadSoundEffects() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  88 */   public int requestAudioFocus(OnAudioFocusChangeListener l, int streamType, int durationHint) { throw new RuntimeException("Stub!"); }
/*  89 */   public int requestAudioFocus(AudioFocusRequest focusRequest) { throw new RuntimeException("Stub!"); }
/*  90 */   public int abandonAudioFocusRequest(AudioFocusRequest focusRequest) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  92 */   public int abandonAudioFocus(OnAudioFocusChangeListener l) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  94 */   public void registerMediaButtonEventReceiver(android.content.ComponentName eventReceiver) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  96 */   public void registerMediaButtonEventReceiver(android.app.PendingIntent eventReceiver) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  98 */   public void unregisterMediaButtonEventReceiver(android.content.ComponentName eventReceiver) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 100 */   public void unregisterMediaButtonEventReceiver(android.app.PendingIntent eventReceiver) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 102 */   public void registerRemoteControlClient(RemoteControlClient rcClient) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 104 */   public void unregisterRemoteControlClient(RemoteControlClient rcClient) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 106 */   public boolean registerRemoteController(RemoteController rctlr) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 108 */   public void unregisterRemoteController(RemoteController rctlr) { throw new RuntimeException("Stub!"); }
/* 109 */   public void registerAudioPlaybackCallback(AudioPlaybackCallback cb, Handler handler) { throw new RuntimeException("Stub!"); }
/* 110 */   public void unregisterAudioPlaybackCallback(AudioPlaybackCallback cb) { throw new RuntimeException("Stub!"); }
/* 111 */   public java.util.List<AudioPlaybackConfiguration> getActivePlaybackConfigurations() { throw new RuntimeException("Stub!"); }
/* 112 */   public void registerAudioRecordingCallback(AudioRecordingCallback cb, Handler handler) { throw new RuntimeException("Stub!"); }
/* 113 */   public void unregisterAudioRecordingCallback(AudioRecordingCallback cb) { throw new RuntimeException("Stub!"); }
/* 114 */   public java.util.List<AudioRecordingConfiguration> getActiveRecordingConfigurations() { throw new RuntimeException("Stub!"); }
/* 115 */   public String getProperty(String key) { throw new RuntimeException("Stub!"); }
/* 116 */   public AudioDeviceInfo[] getDevices(int flags) { throw new RuntimeException("Stub!"); }
/* 117 */   public void registerAudioDeviceCallback(AudioDeviceCallback callback, Handler handler) { throw new RuntimeException("Stub!"); }
/* 118 */   public void unregisterAudioDeviceCallback(AudioDeviceCallback callback) { throw new RuntimeException("Stub!"); }
/*     */   
/*     */   public static final int AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK = 3;
/*     */   public static final int AUDIOFOCUS_LOSS = -1;
/*     */   public static final int AUDIOFOCUS_LOSS_TRANSIENT = -2;
/*     */   public static final int AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK = -3;
/*     */   public static final int AUDIOFOCUS_NONE = 0;
/*     */   public static final int AUDIOFOCUS_REQUEST_DELAYED = 2;
/*     */   public static final int AUDIOFOCUS_REQUEST_FAILED = 0;
/*     */   public static final int AUDIOFOCUS_REQUEST_GRANTED = 1;
/*     */   public static final int AUDIO_SESSION_ID_GENERATE = 0;
/*     */   public static final int ERROR = -1;
/*     */   public static final int ERROR_DEAD_OBJECT = -6;
/*     */   public static final String EXTRA_AUDIO_PLUG_STATE = "android.media.extra.AUDIO_PLUG_STATE";
/*     */   public static final String EXTRA_ENCODINGS = "android.media.extra.ENCODINGS";
/*     */   public static final String EXTRA_MAX_CHANNEL_COUNT = "android.media.extra.MAX_CHANNEL_COUNT";
/*     */   public static final String EXTRA_RINGER_MODE = "android.media.EXTRA_RINGER_MODE";
/*     */   public static final String EXTRA_SCO_AUDIO_PREVIOUS_STATE = "android.media.extra.SCO_AUDIO_PREVIOUS_STATE";
/*     */   public static final String EXTRA_SCO_AUDIO_STATE = "android.media.extra.SCO_AUDIO_STATE";
/*     */   @Deprecated
/*     */   public static final String EXTRA_VIBRATE_SETTING = "android.media.EXTRA_VIBRATE_SETTING";
/*     */   @Deprecated
/*     */   public static final String EXTRA_VIBRATE_TYPE = "android.media.EXTRA_VIBRATE_TYPE";
/*     */   public static final int FLAG_ALLOW_RINGER_MODES = 2;
/*     */   public static final int FLAG_PLAY_SOUND = 4;
/*     */   public static final int FLAG_REMOVE_SOUND_AND_VIBRATE = 8;
/*     */   public static final int FLAG_SHOW_UI = 1;
/*     */   public static final int FLAG_VIBRATE = 16;
/*     */   public static final int FX_FOCUS_NAVIGATION_DOWN = 2;
/*     */   public static final int FX_FOCUS_NAVIGATION_LEFT = 3;
/*     */   public static final int FX_FOCUS_NAVIGATION_RIGHT = 4;
/*     */   public static final int FX_FOCUS_NAVIGATION_UP = 1;
/*     */   public static final int FX_KEYPRESS_DELETE = 7;
/*     */   public static final int FX_KEYPRESS_INVALID = 9;
/*     */   public static final int FX_KEYPRESS_RETURN = 8;
/*     */   public static final int FX_KEYPRESS_SPACEBAR = 6;
/*     */   public static final int FX_KEYPRESS_STANDARD = 5;
/*     */   public static final int FX_KEY_CLICK = 0;
/*     */   public static final int GET_DEVICES_ALL = 3;
/*     */   public static final int GET_DEVICES_INPUTS = 1;
/*     */   public static final int GET_DEVICES_OUTPUTS = 2;
/*     */   public static final int MODE_CURRENT = -1;
/*     */   public static final int MODE_INVALID = -2;
/*     */   public static final int MODE_IN_CALL = 2;
/*     */   public static final int MODE_IN_COMMUNICATION = 3;
/*     */   public static final int MODE_NORMAL = 0;
/*     */   public static final int MODE_RINGTONE = 1;
/*     */   @Deprecated
/*     */   public static final int NUM_STREAMS = 5;
/*     */   public static final String PROPERTY_OUTPUT_FRAMES_PER_BUFFER = "android.media.property.OUTPUT_FRAMES_PER_BUFFER";
/*     */   public static final String PROPERTY_OUTPUT_SAMPLE_RATE = "android.media.property.OUTPUT_SAMPLE_RATE";
/*     */   public static final String PROPERTY_SUPPORT_AUDIO_SOURCE_UNPROCESSED = "android.media.property.SUPPORT_AUDIO_SOURCE_UNPROCESSED";
/*     */   public static final String PROPERTY_SUPPORT_MIC_NEAR_ULTRASOUND = "android.media.property.SUPPORT_MIC_NEAR_ULTRASOUND";
/*     */   public static final String PROPERTY_SUPPORT_SPEAKER_NEAR_ULTRASOUND = "android.media.property.SUPPORT_SPEAKER_NEAR_ULTRASOUND";
/*     */   public static final String RINGER_MODE_CHANGED_ACTION = "android.media.RINGER_MODE_CHANGED";
/*     */   public static final int RINGER_MODE_NORMAL = 2;
/*     */   public static final int RINGER_MODE_SILENT = 0;
/*     */   public static final int RINGER_MODE_VIBRATE = 1;
/*     */   @Deprecated
/*     */   public static final int ROUTE_ALL = -1;
/*     */   @Deprecated
/*     */   public static final int ROUTE_BLUETOOTH = 4;
/*     */   @Deprecated
/*     */   public static final int ROUTE_BLUETOOTH_A2DP = 16;
/*     */   @Deprecated
/*     */   public static final int ROUTE_BLUETOOTH_SCO = 4;
/*     */   @Deprecated
/*     */   public static final int ROUTE_EARPIECE = 1;
/*     */   @Deprecated
/*     */   public static final int ROUTE_HEADSET = 8;
/*     */   @Deprecated
/*     */   public static final int ROUTE_SPEAKER = 2;
/*     */   public static final int SCO_AUDIO_STATE_CONNECTED = 1;
/*     */   public static final int SCO_AUDIO_STATE_CONNECTING = 2;
/*     */   public static final int SCO_AUDIO_STATE_DISCONNECTED = 0;
/*     */   public static final int SCO_AUDIO_STATE_ERROR = -1;
/*     */   public static final int STREAM_ACCESSIBILITY = 10;
/*     */   public static final int STREAM_ALARM = 4;
/*     */   public static final int STREAM_DTMF = 8;
/*     */   public static final int STREAM_MUSIC = 3;
/*     */   public static final int STREAM_NOTIFICATION = 5;
/*     */   public static final int STREAM_RING = 2;
/*     */   public static final int STREAM_SYSTEM = 1;
/*     */   public static final int STREAM_VOICE_CALL = 0;
/*     */   public static final int USE_DEFAULT_STREAM_TYPE = Integer.MIN_VALUE;
/*     */   @Deprecated
/*     */   public static final String VIBRATE_SETTING_CHANGED_ACTION = "android.media.VIBRATE_SETTING_CHANGED";
/*     */   @Deprecated
/*     */   public static final int VIBRATE_SETTING_OFF = 0;
/*     */   @Deprecated
/*     */   public static final int VIBRATE_SETTING_ON = 1;
/*     */   @Deprecated
/*     */   public static final int VIBRATE_SETTING_ONLY_SILENT = 2;
/*     */   @Deprecated
/*     */   public static final int VIBRATE_TYPE_NOTIFICATION = 1;
/*     */   @Deprecated
/*     */   public static final int VIBRATE_TYPE_RINGER = 0;
/*     */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\media\AudioManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */