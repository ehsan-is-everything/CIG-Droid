/*     */ package android.media;
/*     */ 
/*     */ import android.view.Surface;
/*     */ 
/*     */ 
/*     */ public class MediaRecorder {
/*     */   public static final int MEDIA_ERROR_SERVER_DIED = 100;
/*     */   public static final int MEDIA_RECORDER_ERROR_UNKNOWN = 1;
/*     */   public static final int MEDIA_RECORDER_INFO_MAX_DURATION_REACHED = 800;
/*     */   public static final int MEDIA_RECORDER_INFO_MAX_FILESIZE_APPROACHING = 802;
/*     */   public static final int MEDIA_RECORDER_INFO_MAX_FILESIZE_REACHED = 801;
/*     */   public static final int MEDIA_RECORDER_INFO_NEXT_OUTPUT_FILE_STARTED = 803;
/*     */   public static final int MEDIA_RECORDER_INFO_UNKNOWN = 1;
/*     */   
/*     */   public final class AudioSource {
/*     */     public static final int CAMCORDER = 5;
/*     */     public static final int DEFAULT = 0;
/*     */     public static final int MIC = 1;
/*     */     public static final int REMOTE_SUBMIX = 8;
/*     */     public static final int UNPROCESSED = 9;
/*     */     
/*  22 */     AudioSource() { throw new RuntimeException("Stub!"); }
/*     */     
/*     */     public static final int VOICE_CALL = 4;
/*     */     public static final int VOICE_COMMUNICATION = 7;
/*     */     public static final int VOICE_DOWNLINK = 3;
/*     */     public static final int VOICE_RECOGNITION = 6;
/*     */     public static final int VOICE_UPLINK = 2;
/*     */   }
/*     */   
/*     */   public final class VideoSource {
/*     */     public static final int CAMERA = 1;
/*     */     public static final int DEFAULT = 0;
/*     */     public static final int SURFACE = 2;
/*     */     
/*  36 */     VideoSource() { throw new RuntimeException("Stub!"); } }
/*     */   
/*     */   public final class OutputFormat { public static final int AAC_ADTS = 6;
/*     */     public static final int AMR_NB = 3;
/*     */     public static final int AMR_WB = 4;
/*     */     public static final int DEFAULT = 0;
/*     */     
/*  43 */     OutputFormat() { throw new RuntimeException("Stub!"); }
/*     */     
/*     */     public static final int MPEG_2_TS = 8;
/*     */     public static final int MPEG_4 = 2;
/*     */     @Deprecated
/*     */     public static final int RAW_AMR = 3;
/*     */     public static final int THREE_GPP = 1;
/*     */     public static final int WEBM = 9;
/*     */   }
/*     */   
/*     */   public final class AudioEncoder { public static final int AAC = 3;
/*     */     public static final int AAC_ELD = 5;
/*     */     public static final int AMR_NB = 1;
/*     */     
/*  57 */     AudioEncoder() { throw new RuntimeException("Stub!"); }
/*     */     
/*     */     public static final int AMR_WB = 2;
/*     */     public static final int DEFAULT = 0;
/*     */     public static final int HE_AAC = 4;
/*     */     public static final int VORBIS = 6; }
/*     */   
/*     */   public final class VideoEncoder { public static final int DEFAULT = 0;
/*     */     public static final int H263 = 1;
/*     */     public static final int H264 = 2;
/*     */     
/*  68 */     VideoEncoder() { throw new RuntimeException("Stub!"); }
/*     */     
/*     */     public static final int HEVC = 5;
/*     */     public static final int MPEG_4_SP = 3;
/*     */     public static final int VP8 = 4;
/*     */   }
/*     */   
/*     */   public static abstract interface OnErrorListener { public abstract void onError(MediaRecorder paramMediaRecorder, int paramInt1, int paramInt2);
/*     */   }
/*     */   
/*     */   public static abstract interface OnInfoListener { public abstract void onInfo(MediaRecorder paramMediaRecorder, int paramInt1, int paramInt2);
/*     */   }
/*     */   
/*     */   public static final class MetricsConstants { public static final String AUDIO_BITRATE = "android.media.mediarecorder.audio-bitrate";
/*     */     public static final String AUDIO_CHANNELS = "android.media.mediarecorder.audio-channels";
/*     */     public static final String AUDIO_SAMPLERATE = "android.media.mediarecorder.audio-samplerate";
/*     */     public static final String AUDIO_TIMESCALE = "android.media.mediarecorder.audio-timescale";
/*     */     
/*  86 */     MetricsConstants() { throw new RuntimeException("Stub!"); }
/*     */     
/*     */ 
/*     */     public static final String CAPTURE_FPS = "android.media.mediarecorder.capture-fps";
/*     */     
/*     */     public static final String CAPTURE_FPS_ENABLE = "android.media.mediarecorder.capture-fpsenable";
/*     */     public static final String FRAMERATE = "android.media.mediarecorder.frame-rate";
/*     */     public static final String HEIGHT = "android.media.mediarecorder.height";
/*     */     public static final String MOVIE_TIMESCALE = "android.media.mediarecorder.movie-timescale";
/*     */     public static final String ROTATION = "android.media.mediarecorder.rotation";
/*     */     public static final String VIDEO_BITRATE = "android.media.mediarecorder.video-bitrate";
/*     */     public static final String VIDEO_IFRAME_INTERVAL = "android.media.mediarecorder.video-iframe-interval";
/*     */     public static final String VIDEO_LEVEL = "android.media.mediarecorder.video-encoder-level";
/*     */     public static final String VIDEO_PROFILE = "android.media.mediarecorder.video-encoder-profile";
/*     */     public static final String VIDEO_TIMESCALE = "android.media.mediarecorder.video-timescale";
/*     */     public static final String WIDTH = "android.media.mediarecorder.width";
/*     */   }
/*     */   
/* 104 */   public MediaRecorder() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*     */   public native void setCamera(android.hardware.Camera paramCamera);
/*     */   public native Surface getSurface();
/* 108 */   public void setInputSurface(Surface surface) { throw new RuntimeException("Stub!"); }
/* 109 */   public void setPreviewDisplay(Surface sv) { throw new RuntimeException("Stub!"); }
/*     */   public native void setAudioSource(int paramInt) throws IllegalStateException;
/* 111 */   public static final int getAudioSourceMax() { throw new RuntimeException("Stub!"); }
/*     */   public native void setVideoSource(int paramInt) throws IllegalStateException;
/* 113 */   public void setProfile(CamcorderProfile profile) { throw new RuntimeException("Stub!"); }
/* 114 */   public void setCaptureRate(double fps) { throw new RuntimeException("Stub!"); }
/* 115 */   public void setOrientationHint(int degrees) { throw new RuntimeException("Stub!"); }
/* 116 */   public void setLocation(float latitude, float longitude) { throw new RuntimeException("Stub!"); }
/*     */   public native void setOutputFormat(int paramInt) throws IllegalStateException;
/*     */   public native void setVideoSize(int paramInt1, int paramInt2) throws IllegalStateException;
/*     */   public native void setVideoFrameRate(int paramInt) throws IllegalStateException;
/*     */   public native void setMaxDuration(int paramInt) throws IllegalArgumentException;
/*     */   public native void setMaxFileSize(long paramLong) throws IllegalArgumentException;
/*     */   public native void setAudioEncoder(int paramInt) throws IllegalStateException;
/*     */   public native void setVideoEncoder(int paramInt) throws IllegalStateException;
/* 124 */   public void setAudioSamplingRate(int samplingRate) { throw new RuntimeException("Stub!"); }
/* 125 */   public void setAudioChannels(int numChannels) { throw new RuntimeException("Stub!"); }
/* 126 */   public void setAudioEncodingBitRate(int bitRate) { throw new RuntimeException("Stub!"); }
/* 127 */   public void setVideoEncodingBitRate(int bitRate) { throw new RuntimeException("Stub!"); }
/* 128 */   public void setVideoEncodingProfileLevel(int profile, int level) { throw new RuntimeException("Stub!"); }
/* 129 */   public void setOutputFile(java.io.FileDescriptor fd) throws IllegalStateException { throw new RuntimeException("Stub!"); }
/* 130 */   public void setOutputFile(java.io.File file) { throw new RuntimeException("Stub!"); }
/* 131 */   public void setNextOutputFile(java.io.FileDescriptor fd) throws java.io.IOException { throw new RuntimeException("Stub!"); }
/* 132 */   public void setOutputFile(String path) throws IllegalStateException { throw new RuntimeException("Stub!"); }
/* 133 */   public void setNextOutputFile(java.io.File file) throws java.io.IOException { throw new RuntimeException("Stub!"); }
/* 134 */   public void prepare() throws IllegalStateException, java.io.IOException { throw new RuntimeException("Stub!"); }
/*     */   public native void start() throws IllegalStateException;
/*     */   public native void stop() throws IllegalStateException;
/*     */   public native void pause() throws IllegalStateException;
/*     */   public native void resume() throws IllegalStateException;
/* 139 */   public void reset() { throw new RuntimeException("Stub!"); }
/*     */   public native int getMaxAmplitude() throws IllegalStateException;
/* 141 */   public void setOnErrorListener(OnErrorListener l) { throw new RuntimeException("Stub!"); }
/* 142 */   public void setOnInfoListener(OnInfoListener listener) { throw new RuntimeException("Stub!"); }
/*     */   public native void release();
/* 144 */   public android.os.PersistableBundle getMetrics() { throw new RuntimeException("Stub!"); }
/* 145 */   protected void finalize() { throw new RuntimeException("Stub!"); }
/*     */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\media\MediaRecorder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */