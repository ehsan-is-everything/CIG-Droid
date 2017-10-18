/*     */ package android.media;
/*     */ 
/*     */ import android.content.Context;
/*     */ 
/*     */ public class MediaPlayer
/*     */   implements VolumeAutomation {
/*     */   public static final int MEDIA_ERROR_IO = -1004;
/*     */   public static final int MEDIA_ERROR_MALFORMED = -1007;
/*     */   public static final int MEDIA_ERROR_NOT_VALID_FOR_PROGRESSIVE_PLAYBACK = 200;
/*     */   public static final int MEDIA_ERROR_SERVER_DIED = 100;
/*     */   public static final int MEDIA_ERROR_TIMED_OUT = -110;
/*     */   public static final int MEDIA_ERROR_UNKNOWN = 1;
/*     */   public static final int MEDIA_ERROR_UNSUPPORTED = -1010;
/*     */   public static final int MEDIA_INFO_AUDIO_NOT_PLAYING = 804;
/*     */   public static final int MEDIA_INFO_BAD_INTERLEAVING = 800;
/*     */   public static final int MEDIA_INFO_BUFFERING_END = 702;
/*     */   public static final int MEDIA_INFO_BUFFERING_START = 701;
/*     */   public static final int MEDIA_INFO_METADATA_UPDATE = 802;
/*     */   public static final int MEDIA_INFO_NOT_SEEKABLE = 801;
/*     */   public static final int MEDIA_INFO_SUBTITLE_TIMED_OUT = 902;
/*     */   public static final int MEDIA_INFO_UNKNOWN = 1;
/*     */   
/*     */   public static class TrackInfo implements android.os.Parcelable {
/*  24 */     TrackInfo() { throw new RuntimeException("Stub!"); }
/*  25 */     public int getTrackType() { throw new RuntimeException("Stub!"); }
/*  26 */     public String getLanguage() { throw new RuntimeException("Stub!"); }
/*  27 */     public MediaFormat getFormat() { throw new RuntimeException("Stub!"); }
/*  28 */     public int describeContents() { throw new RuntimeException("Stub!"); }
/*  29 */     public void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*  30 */     public String toString() { throw new RuntimeException("Stub!"); }
/*     */     
/*     */     public static final int MEDIA_TRACK_TYPE_AUDIO = 2;
/*     */     public static final int MEDIA_TRACK_TYPE_METADATA = 5;
/*     */     public static final int MEDIA_TRACK_TYPE_SUBTITLE = 4;
/*     */     public static final int MEDIA_TRACK_TYPE_TIMEDTEXT = 3;
/*     */     public static final int MEDIA_TRACK_TYPE_UNKNOWN = 0;
/*     */     public static final int MEDIA_TRACK_TYPE_VIDEO = 1;
/*     */   }
/*     */   
/*     */   public static abstract interface OnPreparedListener {
/*     */     public abstract void onPrepared(MediaPlayer paramMediaPlayer);
/*     */   }
/*     */   
/*     */   public static abstract interface OnCompletionListener {
/*     */     public abstract void onCompletion(MediaPlayer paramMediaPlayer);
/*     */   }
/*     */   
/*     */   public static abstract interface OnBufferingUpdateListener {
/*     */     public abstract void onBufferingUpdate(MediaPlayer paramMediaPlayer, int paramInt);
/*     */   }
/*     */   
/*     */   public static abstract interface OnSeekCompleteListener {
/*     */     public abstract void onSeekComplete(MediaPlayer paramMediaPlayer);
/*     */   }
/*     */   
/*     */   public static abstract interface OnVideoSizeChangedListener {
/*     */     public abstract void onVideoSizeChanged(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2);
/*     */   }
/*     */   
/*     */   public static abstract interface OnTimedTextListener {
/*     */     public abstract void onTimedText(MediaPlayer paramMediaPlayer, TimedText paramTimedText);
/*     */   }
/*     */   
/*     */   public static abstract interface OnTimedMetaDataAvailableListener {
/*     */     public abstract void onTimedMetaDataAvailable(MediaPlayer paramMediaPlayer, TimedMetaData paramTimedMetaData);
/*     */   }
/*     */   
/*     */   public static abstract interface OnErrorListener {
/*     */     public abstract boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2);
/*     */   }
/*     */   
/*     */   public static abstract interface OnInfoListener {
/*     */     public abstract boolean onInfo(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2);
/*     */   }
/*     */   
/*     */   public static abstract interface OnDrmConfigHelper {
/*     */     public abstract void onDrmConfig(MediaPlayer paramMediaPlayer);
/*     */   }
/*     */   
/*     */   public static abstract interface OnDrmInfoListener {
/*     */     public abstract void onDrmInfo(MediaPlayer paramMediaPlayer, MediaPlayer.DrmInfo paramDrmInfo);
/*     */   }
/*     */   
/*     */   public static abstract interface OnDrmPreparedListener {
/*     */     public abstract void onDrmPrepared(MediaPlayer paramMediaPlayer, int paramInt);
/*     */   }
/*     */   
/*  88 */   public static final class DrmInfo { DrmInfo() { throw new RuntimeException("Stub!"); }
/*  89 */     public java.util.Map<java.util.UUID, byte[]> getPssh() { throw new RuntimeException("Stub!"); }
/*  90 */     public java.util.UUID[] getSupportedSchemes() { throw new RuntimeException("Stub!"); }
/*     */   }
/*     */   
/*     */   public static final class NoDrmSchemeException extends MediaDrmException {
/*     */     public NoDrmSchemeException(String detailMessage) {
/*  95 */       super();throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */   
/*     */   public static final class ProvisioningNetworkErrorException extends MediaDrmException {
/* 100 */     public ProvisioningNetworkErrorException(String detailMessage) { super();throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */   
/*     */   public static final class ProvisioningServerErrorException extends MediaDrmException {
/* 105 */     public ProvisioningServerErrorException(String detailMessage) { super();throw new RuntimeException("Stub!"); } }
/*     */   
/*     */   public static final class MetricsConstants { public static final String CODEC_AUDIO = "android.media.mediaplayer.audio.codec";
/*     */     
/* 109 */     MetricsConstants() { throw new RuntimeException("Stub!"); }
/*     */     
/*     */     public static final String CODEC_VIDEO = "android.media.mediaplayer.video.codec";
/*     */     public static final String DURATION = "android.media.mediaplayer.durationMs";
/*     */     public static final String ERRORS = "android.media.mediaplayer.err";
/*     */     public static final String ERROR_CODE = "android.media.mediaplayer.errcode";
/*     */     public static final String FRAMES = "android.media.mediaplayer.frames";
/*     */     public static final String FRAMES_DROPPED = "android.media.mediaplayer.dropped";
/*     */     public static final String HEIGHT = "android.media.mediaplayer.height";
/*     */     public static final String MIME_TYPE_AUDIO = "android.media.mediaplayer.audio.mime";
/*     */     public static final String MIME_TYPE_VIDEO = "android.media.mediaplayer.video.mime";
/*     */     public static final String PLAYING = "android.media.mediaplayer.playingMs";
/*     */     public static final String WIDTH = "android.media.mediaplayer.width"; }
/*     */   
/* 123 */   public MediaPlayer() { throw new RuntimeException("Stub!"); }
/* 124 */   public void setDisplay(android.view.SurfaceHolder sh) { throw new RuntimeException("Stub!"); }
/* 125 */   public void setSurface(android.view.Surface surface) { throw new RuntimeException("Stub!"); }
/* 126 */   public void setVideoScalingMode(int mode) { throw new RuntimeException("Stub!"); }
/* 127 */   public static MediaPlayer create(Context context, android.net.Uri uri) { throw new RuntimeException("Stub!"); }
/* 128 */   public static MediaPlayer create(Context context, android.net.Uri uri, android.view.SurfaceHolder holder) { throw new RuntimeException("Stub!"); }
/* 129 */   public static MediaPlayer create(Context context, android.net.Uri uri, android.view.SurfaceHolder holder, AudioAttributes audioAttributes, int audioSessionId) { throw new RuntimeException("Stub!"); }
/* 130 */   public static MediaPlayer create(Context context, int resid) { throw new RuntimeException("Stub!"); }
/* 131 */   public static MediaPlayer create(Context context, int resid, AudioAttributes audioAttributes, int audioSessionId) { throw new RuntimeException("Stub!"); }
/* 132 */   public void setDataSource(Context context, android.net.Uri uri) throws java.io.IOException, IllegalArgumentException, SecurityException, IllegalStateException { throw new RuntimeException("Stub!"); }
/* 133 */   public void setDataSource(Context context, android.net.Uri uri, java.util.Map<String, String> headers, java.util.List<java.net.HttpCookie> cookies) throws java.io.IOException { throw new RuntimeException("Stub!"); }
/* 134 */   public void setDataSource(Context context, android.net.Uri uri, java.util.Map<String, String> headers) throws java.io.IOException, IllegalArgumentException, SecurityException, IllegalStateException { throw new RuntimeException("Stub!"); }
/* 135 */   public void setDataSource(String path) throws java.io.IOException, IllegalArgumentException, SecurityException, IllegalStateException { throw new RuntimeException("Stub!"); }
/* 136 */   public void setDataSource(android.content.res.AssetFileDescriptor afd) throws java.io.IOException, IllegalArgumentException, IllegalStateException { throw new RuntimeException("Stub!"); }
/* 137 */   public void setDataSource(java.io.FileDescriptor fd) throws java.io.IOException, IllegalArgumentException, IllegalStateException { throw new RuntimeException("Stub!"); }
/* 138 */   public void setDataSource(java.io.FileDescriptor fd, long offset, long length) throws java.io.IOException, IllegalArgumentException, IllegalStateException { throw new RuntimeException("Stub!"); }
/* 139 */   public void setDataSource(MediaDataSource dataSource) throws IllegalArgumentException, IllegalStateException { throw new RuntimeException("Stub!"); }
/* 140 */   public void prepare() throws java.io.IOException, IllegalStateException { throw new RuntimeException("Stub!"); }
/*     */   public native void prepareAsync() throws IllegalStateException;
/* 142 */   public void start() throws IllegalStateException { throw new RuntimeException("Stub!"); }
/* 143 */   public void stop() throws IllegalStateException { throw new RuntimeException("Stub!"); }
/* 144 */   public void pause() throws IllegalStateException { throw new RuntimeException("Stub!"); }
/* 145 */   public VolumeShaper createVolumeShaper(VolumeShaper.Configuration configuration) { throw new RuntimeException("Stub!"); }
/* 146 */   public void setWakeMode(Context context, int mode) { throw new RuntimeException("Stub!"); }
/* 147 */   public void setScreenOnWhilePlaying(boolean screenOn) { throw new RuntimeException("Stub!"); }
/*     */   public native int getVideoWidth();
/*     */   public native int getVideoHeight();
/* 150 */   public android.os.PersistableBundle getMetrics() { throw new RuntimeException("Stub!"); }
/*     */   public native boolean isPlaying();
/*     */   public native void setPlaybackParams(PlaybackParams paramPlaybackParams);
/*     */   public native PlaybackParams getPlaybackParams();
/*     */   public native void setSyncParams(SyncParams paramSyncParams);
/*     */   public native SyncParams getSyncParams();
/* 156 */   public void seekTo(long msec, int mode) { throw new RuntimeException("Stub!"); }
/* 157 */   public void seekTo(int msec) throws IllegalStateException { throw new RuntimeException("Stub!"); }
/* 158 */   public MediaTimestamp getTimestamp() { throw new RuntimeException("Stub!"); }
/*     */   public native int getCurrentPosition();
/*     */   public native int getDuration();
/*     */   public native void setNextMediaPlayer(MediaPlayer paramMediaPlayer);
/* 162 */   public void release() { throw new RuntimeException("Stub!"); }
/* 163 */   public void reset() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 165 */   public void setAudioStreamType(int streamtype) { throw new RuntimeException("Stub!"); }
/* 166 */   public void setAudioAttributes(AudioAttributes attributes) throws IllegalArgumentException { throw new RuntimeException("Stub!"); }
/*     */   public native void setLooping(boolean paramBoolean);
/*     */   public native boolean isLooping();
/* 169 */   public void setVolume(float leftVolume, float rightVolume) { throw new RuntimeException("Stub!"); }
/*     */   public native void setAudioSessionId(int paramInt) throws IllegalArgumentException, IllegalStateException;
/*     */   public native int getAudioSessionId();
/*     */   public native void attachAuxEffect(int paramInt);
/* 173 */   public void setAuxEffectSendLevel(float level) { throw new RuntimeException("Stub!"); }
/* 174 */   public TrackInfo[] getTrackInfo() throws IllegalStateException { throw new RuntimeException("Stub!"); }
/* 175 */   public void addTimedTextSource(String path, String mimeType) throws java.io.IOException, IllegalArgumentException, IllegalStateException { throw new RuntimeException("Stub!"); }
/* 176 */   public void addTimedTextSource(Context context, android.net.Uri uri, String mimeType) throws java.io.IOException, IllegalArgumentException, IllegalStateException { throw new RuntimeException("Stub!"); }
/* 177 */   public void addTimedTextSource(java.io.FileDescriptor fd, String mimeType) throws IllegalArgumentException, IllegalStateException { throw new RuntimeException("Stub!"); }
/* 178 */   public void addTimedTextSource(java.io.FileDescriptor fd, long offset, long length, String mime) throws IllegalArgumentException, IllegalStateException { throw new RuntimeException("Stub!"); }
/* 179 */   public int getSelectedTrack(int trackType) throws IllegalStateException { throw new RuntimeException("Stub!"); }
/* 180 */   public void selectTrack(int index) throws IllegalStateException { throw new RuntimeException("Stub!"); }
/* 181 */   public void deselectTrack(int index) throws IllegalStateException { throw new RuntimeException("Stub!"); }
/* 182 */   protected void finalize() { throw new RuntimeException("Stub!"); }
/* 183 */   public void setOnPreparedListener(OnPreparedListener listener) { throw new RuntimeException("Stub!"); }
/* 184 */   public void setOnCompletionListener(OnCompletionListener listener) { throw new RuntimeException("Stub!"); }
/* 185 */   public void setOnBufferingUpdateListener(OnBufferingUpdateListener listener) { throw new RuntimeException("Stub!"); }
/* 186 */   public void setOnSeekCompleteListener(OnSeekCompleteListener listener) { throw new RuntimeException("Stub!"); }
/* 187 */   public void setOnVideoSizeChangedListener(OnVideoSizeChangedListener listener) { throw new RuntimeException("Stub!"); }
/* 188 */   public void setOnTimedTextListener(OnTimedTextListener listener) { throw new RuntimeException("Stub!"); }
/* 189 */   public void setOnTimedMetaDataAvailableListener(OnTimedMetaDataAvailableListener listener) { throw new RuntimeException("Stub!"); }
/* 190 */   public void setOnErrorListener(OnErrorListener listener) { throw new RuntimeException("Stub!"); }
/* 191 */   public void setOnInfoListener(OnInfoListener listener) { throw new RuntimeException("Stub!"); }
/* 192 */   public void setOnDrmConfigHelper(OnDrmConfigHelper listener) { throw new RuntimeException("Stub!"); }
/* 193 */   public void setOnDrmInfoListener(OnDrmInfoListener listener) { throw new RuntimeException("Stub!"); }
/* 194 */   public void setOnDrmInfoListener(OnDrmInfoListener listener, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
/* 195 */   public void setOnDrmPreparedListener(OnDrmPreparedListener listener) { throw new RuntimeException("Stub!"); }
/* 196 */   public void setOnDrmPreparedListener(OnDrmPreparedListener listener, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
/* 197 */   public DrmInfo getDrmInfo() { throw new RuntimeException("Stub!"); }
/* 198 */   public void prepareDrm(java.util.UUID uuid) throws UnsupportedSchemeException, ResourceBusyException, MediaPlayer.ProvisioningNetworkErrorException, MediaPlayer.ProvisioningServerErrorException { throw new RuntimeException("Stub!"); }
/* 199 */   public void releaseDrm() throws MediaPlayer.NoDrmSchemeException { throw new RuntimeException("Stub!"); }
/* 200 */   public MediaDrm.KeyRequest getKeyRequest(byte[] keySetId, byte[] initData, String mimeType, int keyType, java.util.Map<String, String> optionalParameters) throws MediaPlayer.NoDrmSchemeException { throw new RuntimeException("Stub!"); }
/* 201 */   public byte[] provideKeyResponse(byte[] keySetId, byte[] response) throws MediaPlayer.NoDrmSchemeException, DeniedByServerException { throw new RuntimeException("Stub!"); }
/* 202 */   public void restoreKeys(byte[] keySetId) throws MediaPlayer.NoDrmSchemeException { throw new RuntimeException("Stub!"); }
/* 203 */   public String getDrmPropertyString(String propertyName) throws MediaPlayer.NoDrmSchemeException { throw new RuntimeException("Stub!"); }
/* 204 */   public void setDrmPropertyString(String propertyName, String value) throws MediaPlayer.NoDrmSchemeException { throw new RuntimeException("Stub!"); }
/*     */   
/*     */   public static final int MEDIA_INFO_UNSUPPORTED_SUBTITLE = 901;
/*     */   public static final int MEDIA_INFO_VIDEO_NOT_PLAYING = 805;
/*     */   public static final int MEDIA_INFO_VIDEO_RENDERING_START = 3;
/*     */   public static final int MEDIA_INFO_VIDEO_TRACK_LAGGING = 700;
/*     */   public static final String MEDIA_MIMETYPE_TEXT_SUBRIP = "application/x-subrip";
/*     */   public static final int PREPARE_DRM_STATUS_PREPARATION_ERROR = 3;
/*     */   public static final int PREPARE_DRM_STATUS_PROVISIONING_NETWORK_ERROR = 1;
/*     */   public static final int PREPARE_DRM_STATUS_PROVISIONING_SERVER_ERROR = 2;
/*     */   public static final int PREPARE_DRM_STATUS_SUCCESS = 0;
/*     */   public static final int SEEK_CLOSEST = 3;
/*     */   public static final int SEEK_CLOSEST_SYNC = 2;
/*     */   public static final int SEEK_NEXT_SYNC = 1;
/*     */   public static final int SEEK_PREVIOUS_SYNC = 0;
/*     */   public static final int VIDEO_SCALING_MODE_SCALE_TO_FIT = 1;
/*     */   public static final int VIDEO_SCALING_MODE_SCALE_TO_FIT_WITH_CROPPING = 2;
/*     */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\media\MediaPlayer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */