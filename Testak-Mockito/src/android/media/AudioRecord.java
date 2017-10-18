/*    */ package android.media;
/*    */ 
/*    */ import android.os.Handler;
/*    */ 
/*    */ 
/*    */ public class AudioRecord
/*    */   implements AudioRouting
/*    */ {
/*    */   public static final int ERROR = -1;
/*    */   public static final int ERROR_BAD_VALUE = -2;
/*    */   public static final int ERROR_DEAD_OBJECT = -6;
/*    */   public static final int ERROR_INVALID_OPERATION = -3;
/*    */   public static final int READ_BLOCKING = 0;
/*    */   public static final int READ_NON_BLOCKING = 1;
/*    */   public static final int RECORDSTATE_RECORDING = 3;
/*    */   public static final int RECORDSTATE_STOPPED = 1;
/*    */   public static final int STATE_INITIALIZED = 1;
/*    */   public static final int STATE_UNINITIALIZED = 0;
/*    */   public static final int SUCCESS = 0;
/*    */   
/*    */   public static class Builder
/*    */   {
/* 23 */     public Builder() { throw new RuntimeException("Stub!"); }
/* 24 */     public Builder setAudioSource(int source) throws IllegalArgumentException { throw new RuntimeException("Stub!"); }
/* 25 */     public Builder setAudioFormat(AudioFormat format) throws IllegalArgumentException { throw new RuntimeException("Stub!"); }
/* 26 */     public Builder setBufferSizeInBytes(int bufferSizeInBytes) throws IllegalArgumentException { throw new RuntimeException("Stub!"); }
/* 27 */     public AudioRecord build() throws UnsupportedOperationException { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   public static abstract interface OnRoutingChangedListener extends AudioRouting.OnRoutingChangedListener {
/*    */     public abstract void onRoutingChanged(AudioRecord paramAudioRecord);
/*    */     
/* 34 */     public void onRoutingChanged(AudioRouting router) { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 41 */   public AudioRecord(int audioSource, int sampleRateInHz, int channelConfig, int audioFormat, int bufferSizeInBytes)
/* 41 */     throws IllegalArgumentException { throw new RuntimeException("Stub!"); }
/* 42 */   public void release() { throw new RuntimeException("Stub!"); }
/* 43 */   protected void finalize() { throw new RuntimeException("Stub!"); }
/* 44 */   public int getSampleRate() { throw new RuntimeException("Stub!"); }
/* 45 */   public int getAudioSource() { throw new RuntimeException("Stub!"); }
/* 46 */   public int getAudioFormat() { throw new RuntimeException("Stub!"); }
/* 47 */   public int getChannelConfiguration() { throw new RuntimeException("Stub!"); }
/* 48 */   public AudioFormat getFormat() { throw new RuntimeException("Stub!"); }
/* 49 */   public int getChannelCount() { throw new RuntimeException("Stub!"); }
/* 50 */   public int getState() { throw new RuntimeException("Stub!"); }
/* 51 */   public int getRecordingState() { throw new RuntimeException("Stub!"); }
/* 52 */   public int getBufferSizeInFrames() { throw new RuntimeException("Stub!"); }
/* 53 */   public int getNotificationMarkerPosition() { throw new RuntimeException("Stub!"); }
/* 54 */   public int getPositionNotificationPeriod() { throw new RuntimeException("Stub!"); }
/* 55 */   public int getTimestamp(AudioTimestamp outTimestamp, int timebase) { throw new RuntimeException("Stub!"); }
/* 56 */   public static int getMinBufferSize(int sampleRateInHz, int channelConfig, int audioFormat) { throw new RuntimeException("Stub!"); }
/* 57 */   public int getAudioSessionId() { throw new RuntimeException("Stub!"); }
/* 58 */   public void startRecording() throws IllegalStateException { throw new RuntimeException("Stub!"); }
/* 59 */   public void startRecording(MediaSyncEvent syncEvent) throws IllegalStateException { throw new RuntimeException("Stub!"); }
/* 60 */   public void stop() throws IllegalStateException { throw new RuntimeException("Stub!"); }
/* 61 */   public int read(byte[] audioData, int offsetInBytes, int sizeInBytes) { throw new RuntimeException("Stub!"); }
/* 62 */   public int read(byte[] audioData, int offsetInBytes, int sizeInBytes, int readMode) { throw new RuntimeException("Stub!"); }
/* 63 */   public int read(short[] audioData, int offsetInShorts, int sizeInShorts) { throw new RuntimeException("Stub!"); }
/* 64 */   public int read(short[] audioData, int offsetInShorts, int sizeInShorts, int readMode) { throw new RuntimeException("Stub!"); }
/* 65 */   public int read(float[] audioData, int offsetInFloats, int sizeInFloats, int readMode) { throw new RuntimeException("Stub!"); }
/* 66 */   public int read(java.nio.ByteBuffer audioBuffer, int sizeInBytes) { throw new RuntimeException("Stub!"); }
/* 67 */   public int read(java.nio.ByteBuffer audioBuffer, int sizeInBytes, int readMode) { throw new RuntimeException("Stub!"); }
/* 68 */   public void setRecordPositionUpdateListener(OnRecordPositionUpdateListener listener) { throw new RuntimeException("Stub!"); }
/* 69 */   public void setRecordPositionUpdateListener(OnRecordPositionUpdateListener listener, Handler handler) { throw new RuntimeException("Stub!"); }
/* 70 */   public int setNotificationMarkerPosition(int markerInFrames) { throw new RuntimeException("Stub!"); }
/* 71 */   public AudioDeviceInfo getRoutedDevice() { throw new RuntimeException("Stub!"); }
/* 72 */   public void addOnRoutingChangedListener(AudioRouting.OnRoutingChangedListener listener, Handler handler) { throw new RuntimeException("Stub!"); }
/* 73 */   public void removeOnRoutingChangedListener(AudioRouting.OnRoutingChangedListener listener) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 75 */   public void addOnRoutingChangedListener(OnRoutingChangedListener listener, Handler handler) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 77 */   public void removeOnRoutingChangedListener(OnRoutingChangedListener listener) { throw new RuntimeException("Stub!"); }
/* 78 */   public int setPositionNotificationPeriod(int periodInFrames) { throw new RuntimeException("Stub!"); }
/* 79 */   public boolean setPreferredDevice(AudioDeviceInfo deviceInfo) { throw new RuntimeException("Stub!"); }
/* 80 */   public AudioDeviceInfo getPreferredDevice() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface OnRecordPositionUpdateListener
/*    */   {
/*    */     public abstract void onMarkerReached(AudioRecord paramAudioRecord);
/*    */     
/*    */     public abstract void onPeriodicNotification(AudioRecord paramAudioRecord);
/*    */   }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\media\AudioRecord.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */