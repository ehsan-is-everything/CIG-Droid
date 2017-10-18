/*    */ package android.media;
/*    */ 
/*    */ import android.app.PendingIntent;
/*    */ 
/*    */ @Deprecated
/*    */ public class RemoteControlClient { public static final int FLAG_KEY_MEDIA_FAST_FORWARD = 64;
/*    */   public static final int FLAG_KEY_MEDIA_NEXT = 128;
/*    */   public static final int FLAG_KEY_MEDIA_PAUSE = 16;
/*    */   public static final int FLAG_KEY_MEDIA_PLAY = 4;
/*    */   public static final int FLAG_KEY_MEDIA_PLAY_PAUSE = 8;
/*    */   public static final int FLAG_KEY_MEDIA_POSITION_UPDATE = 256;
/*    */   public static final int FLAG_KEY_MEDIA_PREVIOUS = 1;
/*    */   public static final int FLAG_KEY_MEDIA_RATING = 512;
/*    */   public static final int FLAG_KEY_MEDIA_REWIND = 2;
/*    */   
/*    */   public static abstract interface OnGetPlaybackPositionListener { public abstract long onGetPlaybackPosition();
/*    */   }
/*    */   
/*    */   public static abstract interface OnPlaybackPositionUpdateListener { public abstract void onPlaybackPositionUpdate(long paramLong);
/*    */   }
/*    */   
/*    */   public static abstract interface OnMetadataUpdateListener { public abstract void onMetadataUpdate(int paramInt, Object paramObject); }
/*    */   
/*    */   @Deprecated
/* 25 */   public class MetadataEditor extends MediaMetadataEditor { MetadataEditor() { throw new RuntimeException("Stub!"); }
/* 26 */     public synchronized MetadataEditor putString(int key, String value) throws IllegalArgumentException { throw new RuntimeException("Stub!"); }
/* 27 */     public synchronized MetadataEditor putLong(int key, long value) throws IllegalArgumentException { throw new RuntimeException("Stub!"); }
/* 28 */     public synchronized MetadataEditor putBitmap(int key, android.graphics.Bitmap bitmap) throws IllegalArgumentException { throw new RuntimeException("Stub!"); }
/* 29 */     public synchronized MetadataEditor putObject(int key, Object object) throws IllegalArgumentException { throw new RuntimeException("Stub!"); }
/* 30 */     public synchronized void clear() { throw new RuntimeException("Stub!"); }
/* 31 */     public synchronized void apply() { throw new RuntimeException("Stub!"); }
/*    */     
/*    */     public static final int BITMAP_KEY_ARTWORK = 100;
/*    */   }
/*    */   
/*    */   public static final int FLAG_KEY_MEDIA_STOP = 32;
/*    */   public static final int PLAYSTATE_BUFFERING = 8;
/*    */   public static final int PLAYSTATE_ERROR = 9;
/*    */   public static final int PLAYSTATE_FAST_FORWARDING = 4;
/*    */   public static final int PLAYSTATE_PAUSED = 2;
/*    */   public static final int PLAYSTATE_PLAYING = 3;
/*    */   public static final int PLAYSTATE_REWINDING = 5;
/*    */   public static final int PLAYSTATE_SKIPPING_BACKWARDS = 7;
/*    */   public static final int PLAYSTATE_SKIPPING_FORWARDS = 6;
/*    */   public static final int PLAYSTATE_STOPPED = 1;
/* 46 */   public RemoteControlClient(PendingIntent mediaButtonIntent) { throw new RuntimeException("Stub!"); }
/* 47 */   public RemoteControlClient(PendingIntent mediaButtonIntent, android.os.Looper looper) { throw new RuntimeException("Stub!"); }
/* 48 */   public android.media.session.MediaSession getMediaSession() { throw new RuntimeException("Stub!"); }
/* 49 */   public MetadataEditor editMetadata(boolean startEmpty) { throw new RuntimeException("Stub!"); }
/* 50 */   public void setPlaybackState(int state) { throw new RuntimeException("Stub!"); }
/* 51 */   public void setPlaybackState(int state, long timeInMs, float playbackSpeed) { throw new RuntimeException("Stub!"); }
/* 52 */   public void setTransportControlFlags(int transportControlFlags) { throw new RuntimeException("Stub!"); }
/* 53 */   public void setMetadataUpdateListener(OnMetadataUpdateListener l) { throw new RuntimeException("Stub!"); }
/* 54 */   public void setPlaybackPositionUpdateListener(OnPlaybackPositionUpdateListener l) { throw new RuntimeException("Stub!"); }
/* 55 */   public void setOnGetPlaybackPositionListener(OnGetPlaybackPositionListener l) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\media\RemoteControlClient.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */