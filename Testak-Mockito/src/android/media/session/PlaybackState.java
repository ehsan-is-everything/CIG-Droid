/*     */ package android.media.session;
/*     */ 
/*     */ import android.os.Bundle;
/*     */ 
/*     */ public final class PlaybackState implements android.os.Parcelable {
/*     */   public static final long ACTION_FAST_FORWARD = 64L;
/*     */   public static final long ACTION_PAUSE = 2L;
/*     */   public static final long ACTION_PLAY = 4L;
/*     */   public static final long ACTION_PLAY_FROM_MEDIA_ID = 1024L;
/*     */   public static final long ACTION_PLAY_FROM_SEARCH = 2048L;
/*     */   public static final long ACTION_PLAY_FROM_URI = 8192L;
/*     */   public static final long ACTION_PLAY_PAUSE = 512L;
/*     */   public static final long ACTION_PREPARE = 16384L;
/*     */   public static final long ACTION_PREPARE_FROM_MEDIA_ID = 32768L;
/*     */   public static final long ACTION_PREPARE_FROM_SEARCH = 65536L;
/*     */   public static final long ACTION_PREPARE_FROM_URI = 131072L;
/*     */   public static final long ACTION_REWIND = 8L;
/*     */   public static final long ACTION_SEEK_TO = 256L;
/*     */   public static final long ACTION_SET_RATING = 128L;
/*     */   public static final long ACTION_SKIP_TO_NEXT = 32L;
/*     */   public static final long ACTION_SKIP_TO_PREVIOUS = 16L;
/*     */   public static final long ACTION_SKIP_TO_QUEUE_ITEM = 4096L;
/*     */   public static final long ACTION_STOP = 1L;
/*     */   
/*  25 */   public static final class CustomAction implements android.os.Parcelable { public static final class Builder { public Builder(String action, CharSequence name, int icon) { throw new RuntimeException("Stub!"); }
/*  26 */       public Builder setExtras(Bundle extras) { throw new RuntimeException("Stub!"); }
/*  27 */       public PlaybackState.CustomAction build() { throw new RuntimeException("Stub!"); } }
/*     */     
/*  29 */     CustomAction() { throw new RuntimeException("Stub!"); }
/*  30 */     public void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*  31 */     public int describeContents() { throw new RuntimeException("Stub!"); }
/*  32 */     public String getAction() { throw new RuntimeException("Stub!"); }
/*  33 */     public CharSequence getName() { throw new RuntimeException("Stub!"); }
/*  34 */     public int getIcon() { throw new RuntimeException("Stub!"); }
/*  35 */     public Bundle getExtras() { throw new RuntimeException("Stub!"); }
/*  36 */     public String toString() { throw new RuntimeException("Stub!"); }
/*     */     
/*  38 */     public static final android.os.Parcelable.Creator<CustomAction> CREATOR = null;
/*     */   }
/*     */   
/*     */   public static final class Builder {
/*  42 */     public Builder() { throw new RuntimeException("Stub!"); }
/*  43 */     public Builder(PlaybackState from) { throw new RuntimeException("Stub!"); }
/*  44 */     public Builder setState(int state, long position, float playbackSpeed, long updateTime) { throw new RuntimeException("Stub!"); }
/*  45 */     public Builder setState(int state, long position, float playbackSpeed) { throw new RuntimeException("Stub!"); }
/*  46 */     public Builder setActions(long actions) { throw new RuntimeException("Stub!"); }
/*  47 */     public Builder addCustomAction(String action, String name, int icon) { throw new RuntimeException("Stub!"); }
/*  48 */     public Builder addCustomAction(PlaybackState.CustomAction customAction) { throw new RuntimeException("Stub!"); }
/*  49 */     public Builder setBufferedPosition(long bufferedPosition) { throw new RuntimeException("Stub!"); }
/*  50 */     public Builder setActiveQueueItemId(long id) { throw new RuntimeException("Stub!"); }
/*  51 */     public Builder setErrorMessage(CharSequence error) { throw new RuntimeException("Stub!"); }
/*  52 */     public Builder setExtras(Bundle extras) { throw new RuntimeException("Stub!"); }
/*  53 */     public PlaybackState build() { throw new RuntimeException("Stub!"); } }
/*     */   
/*  55 */   PlaybackState() { throw new RuntimeException("Stub!"); }
/*  56 */   public String toString() { throw new RuntimeException("Stub!"); }
/*  57 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/*  58 */   public void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*  59 */   public int getState() { throw new RuntimeException("Stub!"); }
/*  60 */   public long getPosition() { throw new RuntimeException("Stub!"); }
/*  61 */   public long getBufferedPosition() { throw new RuntimeException("Stub!"); }
/*  62 */   public float getPlaybackSpeed() { throw new RuntimeException("Stub!"); }
/*  63 */   public long getActions() { throw new RuntimeException("Stub!"); }
/*  64 */   public java.util.List<CustomAction> getCustomActions() { throw new RuntimeException("Stub!"); }
/*  65 */   public CharSequence getErrorMessage() { throw new RuntimeException("Stub!"); }
/*  66 */   public long getLastPositionUpdateTime() { throw new RuntimeException("Stub!"); }
/*  67 */   public long getActiveQueueItemId() { throw new RuntimeException("Stub!"); }
/*  68 */   public Bundle getExtras() { throw new RuntimeException("Stub!"); }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 101 */   public static final android.os.Parcelable.Creator<PlaybackState> CREATOR = null;
/*     */   public static final long PLAYBACK_POSITION_UNKNOWN = -1L;
/*     */   public static final int STATE_BUFFERING = 6;
/*     */   public static final int STATE_CONNECTING = 8;
/*     */   public static final int STATE_ERROR = 7;
/*     */   public static final int STATE_FAST_FORWARDING = 4;
/*     */   public static final int STATE_NONE = 0;
/*     */   public static final int STATE_PAUSED = 2;
/*     */   public static final int STATE_PLAYING = 3;
/*     */   public static final int STATE_REWINDING = 5;
/*     */   public static final int STATE_SKIPPING_TO_NEXT = 10;
/*     */   public static final int STATE_SKIPPING_TO_PREVIOUS = 9;
/*     */   public static final int STATE_SKIPPING_TO_QUEUE_ITEM = 11;
/*     */   public static final int STATE_STOPPED = 1;
/*     */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\media\session\PlaybackState.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */