/*     */ package android.media;
/*     */ 
/*     */ import android.os.Handler;
/*     */ import java.nio.ByteBuffer;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class AudioTrack
/*     */   implements AudioRouting, VolumeAutomation
/*     */ {
/*     */   public static final int ERROR = -1;
/*     */   public static final int ERROR_BAD_VALUE = -2;
/*     */   public static final int ERROR_DEAD_OBJECT = -6;
/*     */   public static final int ERROR_INVALID_OPERATION = -3;
/*     */   public static final int MODE_STATIC = 0;
/*     */   public static final int MODE_STREAM = 1;
/*     */   public static final int PERFORMANCE_MODE_LOW_LATENCY = 1;
/*     */   public static final int PERFORMANCE_MODE_NONE = 0;
/*     */   public static final int PERFORMANCE_MODE_POWER_SAVING = 2;
/*     */   
/*     */   public static class Builder
/*     */   {
/*  23 */     public Builder() { throw new RuntimeException("Stub!"); }
/*  24 */     public Builder setAudioAttributes(AudioAttributes attributes) throws IllegalArgumentException { throw new RuntimeException("Stub!"); }
/*  25 */     public Builder setAudioFormat(AudioFormat format) throws IllegalArgumentException { throw new RuntimeException("Stub!"); }
/*  26 */     public Builder setBufferSizeInBytes(int bufferSizeInBytes) throws IllegalArgumentException { throw new RuntimeException("Stub!"); }
/*  27 */     public Builder setTransferMode(int mode) throws IllegalArgumentException { throw new RuntimeException("Stub!"); }
/*  28 */     public Builder setSessionId(int sessionId) throws IllegalArgumentException { throw new RuntimeException("Stub!"); }
/*  29 */     public Builder setPerformanceMode(int performanceMode) { throw new RuntimeException("Stub!"); }
/*  30 */     public AudioTrack build() throws UnsupportedOperationException { throw new RuntimeException("Stub!"); }
/*     */   }
/*     */   
/*     */   @Deprecated
/*     */   public static abstract interface OnRoutingChangedListener extends AudioRouting.OnRoutingChangedListener {
/*     */     public abstract void onRoutingChanged(AudioTrack paramAudioTrack);
/*     */     
/*  37 */     public void onRoutingChanged(AudioRouting router) { throw new RuntimeException("Stub!"); } }
/*     */   
/*     */   public static final int PLAYSTATE_PAUSED = 2;
/*     */   public static final int PLAYSTATE_PLAYING = 3;
/*     */   public static final int PLAYSTATE_STOPPED = 1;
/*     */   public static final int STATE_INITIALIZED = 1;
/*     */   
/*     */   @Deprecated
/*  45 */   public AudioTrack(int streamType, int sampleRateInHz, int channelConfig, int audioFormat, int bufferSizeInBytes, int mode) throws IllegalArgumentException { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  47 */   public AudioTrack(int streamType, int sampleRateInHz, int channelConfig, int audioFormat, int bufferSizeInBytes, int mode, int sessionId) throws IllegalArgumentException { throw new RuntimeException("Stub!"); }
/*  48 */   public AudioTrack(AudioAttributes attributes, AudioFormat format, int bufferSizeInBytes, int mode, int sessionId) throws IllegalArgumentException { throw new RuntimeException("Stub!"); }
/*  49 */   public void release() { throw new RuntimeException("Stub!"); }
/*  50 */   protected void finalize() { throw new RuntimeException("Stub!"); }
/*  51 */   public static float getMinVolume() { throw new RuntimeException("Stub!"); }
/*  52 */   public static float getMaxVolume() { throw new RuntimeException("Stub!"); }
/*  53 */   public int getSampleRate() { throw new RuntimeException("Stub!"); }
/*  54 */   public int getPlaybackRate() { throw new RuntimeException("Stub!"); }
/*  55 */   public PlaybackParams getPlaybackParams() { throw new RuntimeException("Stub!"); }
/*  56 */   public int getAudioFormat() { throw new RuntimeException("Stub!"); }
/*  57 */   public int getStreamType() { throw new RuntimeException("Stub!"); }
/*  58 */   public int getChannelConfiguration() { throw new RuntimeException("Stub!"); }
/*  59 */   public AudioFormat getFormat() { throw new RuntimeException("Stub!"); }
/*  60 */   public int getChannelCount() { throw new RuntimeException("Stub!"); }
/*  61 */   public int getState() { throw new RuntimeException("Stub!"); }
/*  62 */   public int getPlayState() { throw new RuntimeException("Stub!"); }
/*  63 */   public int getBufferSizeInFrames() { throw new RuntimeException("Stub!"); }
/*  64 */   public int setBufferSizeInFrames(int bufferSizeInFrames) { throw new RuntimeException("Stub!"); }
/*  65 */   public int getBufferCapacityInFrames() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  67 */   protected int getNativeFrameCount() { throw new RuntimeException("Stub!"); }
/*  68 */   public int getNotificationMarkerPosition() { throw new RuntimeException("Stub!"); }
/*  69 */   public int getPositionNotificationPeriod() { throw new RuntimeException("Stub!"); }
/*  70 */   public int getPlaybackHeadPosition() { throw new RuntimeException("Stub!"); }
/*  71 */   public int getUnderrunCount() { throw new RuntimeException("Stub!"); }
/*  72 */   public int getPerformanceMode() { throw new RuntimeException("Stub!"); }
/*  73 */   public static int getNativeOutputSampleRate(int streamType) { throw new RuntimeException("Stub!"); }
/*  74 */   public static int getMinBufferSize(int sampleRateInHz, int channelConfig, int audioFormat) { throw new RuntimeException("Stub!"); }
/*  75 */   public int getAudioSessionId() { throw new RuntimeException("Stub!"); }
/*  76 */   public boolean getTimestamp(AudioTimestamp timestamp) { throw new RuntimeException("Stub!"); }
/*  77 */   public void setPlaybackPositionUpdateListener(OnPlaybackPositionUpdateListener listener) { throw new RuntimeException("Stub!"); }
/*  78 */   public void setPlaybackPositionUpdateListener(OnPlaybackPositionUpdateListener listener, Handler handler) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  80 */   public int setStereoVolume(float leftGain, float rightGain) { throw new RuntimeException("Stub!"); }
/*  81 */   public int setVolume(float gain) { throw new RuntimeException("Stub!"); }
/*  82 */   public VolumeShaper createVolumeShaper(VolumeShaper.Configuration configuration) { throw new RuntimeException("Stub!"); }
/*  83 */   public int setPlaybackRate(int sampleRateInHz) { throw new RuntimeException("Stub!"); }
/*  84 */   public void setPlaybackParams(PlaybackParams params) { throw new RuntimeException("Stub!"); }
/*  85 */   public int setNotificationMarkerPosition(int markerInFrames) { throw new RuntimeException("Stub!"); }
/*  86 */   public int setPositionNotificationPeriod(int periodInFrames) { throw new RuntimeException("Stub!"); }
/*  87 */   public int setPlaybackHeadPosition(int positionInFrames) { throw new RuntimeException("Stub!"); }
/*  88 */   public int setLoopPoints(int startInFrames, int endInFrames, int loopCount) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  90 */   protected void setState(int state) { throw new RuntimeException("Stub!"); }
/*  91 */   public void play() throws IllegalStateException { throw new RuntimeException("Stub!"); }
/*  92 */   public void stop() throws IllegalStateException { throw new RuntimeException("Stub!"); }
/*  93 */   public void pause() throws IllegalStateException { throw new RuntimeException("Stub!"); }
/*  94 */   public void flush() { throw new RuntimeException("Stub!"); }
/*  95 */   public int write(byte[] audioData, int offsetInBytes, int sizeInBytes) { throw new RuntimeException("Stub!"); }
/*  96 */   public int write(byte[] audioData, int offsetInBytes, int sizeInBytes, int writeMode) { throw new RuntimeException("Stub!"); }
/*  97 */   public int write(short[] audioData, int offsetInShorts, int sizeInShorts) { throw new RuntimeException("Stub!"); }
/*  98 */   public int write(short[] audioData, int offsetInShorts, int sizeInShorts, int writeMode) { throw new RuntimeException("Stub!"); }
/*  99 */   public int write(float[] audioData, int offsetInFloats, int sizeInFloats, int writeMode) { throw new RuntimeException("Stub!"); }
/* 100 */   public int write(ByteBuffer audioData, int sizeInBytes, int writeMode) { throw new RuntimeException("Stub!"); }
/* 101 */   public int write(ByteBuffer audioData, int sizeInBytes, int writeMode, long timestamp) { throw new RuntimeException("Stub!"); }
/* 102 */   public int reloadStaticData() { throw new RuntimeException("Stub!"); }
/* 103 */   public int attachAuxEffect(int effectId) { throw new RuntimeException("Stub!"); }
/* 104 */   public int setAuxEffectSendLevel(float level) { throw new RuntimeException("Stub!"); }
/* 105 */   public boolean setPreferredDevice(AudioDeviceInfo deviceInfo) { throw new RuntimeException("Stub!"); }
/* 106 */   public AudioDeviceInfo getPreferredDevice() { throw new RuntimeException("Stub!"); }
/* 107 */   public AudioDeviceInfo getRoutedDevice() { throw new RuntimeException("Stub!"); }
/* 108 */   public void addOnRoutingChangedListener(AudioRouting.OnRoutingChangedListener listener, Handler handler) { throw new RuntimeException("Stub!"); }
/* 109 */   public void removeOnRoutingChangedListener(AudioRouting.OnRoutingChangedListener listener) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 111 */   public void addOnRoutingChangedListener(OnRoutingChangedListener listener, Handler handler) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 113 */   public void removeOnRoutingChangedListener(OnRoutingChangedListener listener) { throw new RuntimeException("Stub!"); }
/*     */   
/*     */   public static final int STATE_NO_STATIC_DATA = 2;
/*     */   public static final int STATE_UNINITIALIZED = 0;
/*     */   public static final int SUCCESS = 0;
/*     */   public static final int WRITE_BLOCKING = 0;
/*     */   public static final int WRITE_NON_BLOCKING = 1;
/*     */   public static abstract interface OnPlaybackPositionUpdateListener
/*     */   {
/*     */     public abstract void onMarkerReached(AudioTrack paramAudioTrack);
/*     */     
/*     */     public abstract void onPeriodicNotification(AudioTrack paramAudioTrack);
/*     */   }
/*     */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\media\AudioTrack.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */