/*    */ package android.media.session;
/*    */ 
/*    */ import android.app.PendingIntent;
/*    */ import android.content.Context;
/*    */ import android.media.AudioAttributes;
/*    */ import android.media.MediaMetadata;
/*    */ import android.media.Rating;
/*    */ import android.net.Uri;
/*    */ import android.os.Bundle;
/*    */ import android.os.Handler;
/*    */ import android.os.ResultReceiver;
/*    */ import android.view.KeyEvent;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class MediaController
/*    */ {
/*    */   public static abstract class Callback
/*    */   {
/* 22 */     public Callback() { throw new RuntimeException("Stub!"); }
/* 23 */     public void onSessionDestroyed() { throw new RuntimeException("Stub!"); }
/* 24 */     public void onSessionEvent(String event, Bundle extras) { throw new RuntimeException("Stub!"); }
/* 25 */     public void onPlaybackStateChanged(PlaybackState state) { throw new RuntimeException("Stub!"); }
/* 26 */     public void onMetadataChanged(MediaMetadata metadata) { throw new RuntimeException("Stub!"); }
/* 27 */     public void onQueueChanged(List<MediaSession.QueueItem> queue) { throw new RuntimeException("Stub!"); }
/* 28 */     public void onQueueTitleChanged(CharSequence title) { throw new RuntimeException("Stub!"); }
/* 29 */     public void onExtrasChanged(Bundle extras) { throw new RuntimeException("Stub!"); }
/* 30 */     public void onAudioInfoChanged(MediaController.PlaybackInfo info) { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public final class TransportControls {
/* 34 */     TransportControls() { throw new RuntimeException("Stub!"); }
/* 35 */     public void prepare() { throw new RuntimeException("Stub!"); }
/* 36 */     public void prepareFromMediaId(String mediaId, Bundle extras) { throw new RuntimeException("Stub!"); }
/* 37 */     public void prepareFromSearch(String query, Bundle extras) { throw new RuntimeException("Stub!"); }
/* 38 */     public void prepareFromUri(Uri uri, Bundle extras) { throw new RuntimeException("Stub!"); }
/* 39 */     public void play() { throw new RuntimeException("Stub!"); }
/* 40 */     public void playFromMediaId(String mediaId, Bundle extras) { throw new RuntimeException("Stub!"); }
/* 41 */     public void playFromSearch(String query, Bundle extras) { throw new RuntimeException("Stub!"); }
/* 42 */     public void playFromUri(Uri uri, Bundle extras) { throw new RuntimeException("Stub!"); }
/* 43 */     public void skipToQueueItem(long id) { throw new RuntimeException("Stub!"); }
/* 44 */     public void pause() { throw new RuntimeException("Stub!"); }
/* 45 */     public void stop() { throw new RuntimeException("Stub!"); }
/* 46 */     public void seekTo(long pos) { throw new RuntimeException("Stub!"); }
/* 47 */     public void fastForward() { throw new RuntimeException("Stub!"); }
/* 48 */     public void skipToNext() { throw new RuntimeException("Stub!"); }
/* 49 */     public void rewind() { throw new RuntimeException("Stub!"); }
/* 50 */     public void skipToPrevious() { throw new RuntimeException("Stub!"); }
/* 51 */     public void setRating(Rating rating) { throw new RuntimeException("Stub!"); }
/* 52 */     public void sendCustomAction(PlaybackState.CustomAction customAction, Bundle args) { throw new RuntimeException("Stub!"); }
/* 53 */     public void sendCustomAction(String action, Bundle args) { throw new RuntimeException("Stub!"); } }
/*    */   
/*    */   public static final class PlaybackInfo { public static final int PLAYBACK_TYPE_LOCAL = 1;
/*    */     
/* 57 */     PlaybackInfo() { throw new RuntimeException("Stub!"); }
/* 58 */     public int getPlaybackType() { throw new RuntimeException("Stub!"); }
/* 59 */     public AudioAttributes getAudioAttributes() { throw new RuntimeException("Stub!"); }
/* 60 */     public int getVolumeControl() { throw new RuntimeException("Stub!"); }
/* 61 */     public int getMaxVolume() { throw new RuntimeException("Stub!"); }
/* 62 */     public int getCurrentVolume() { throw new RuntimeException("Stub!"); }
/*    */     
/*    */     public static final int PLAYBACK_TYPE_REMOTE = 2; }
/*    */   
/* 66 */   public MediaController(Context context, MediaSession.Token token) { throw new RuntimeException("Stub!"); }
/* 67 */   public TransportControls getTransportControls() { throw new RuntimeException("Stub!"); }
/* 68 */   public boolean dispatchMediaButtonEvent(KeyEvent keyEvent) { throw new RuntimeException("Stub!"); }
/* 69 */   public PlaybackState getPlaybackState() { throw new RuntimeException("Stub!"); }
/* 70 */   public MediaMetadata getMetadata() { throw new RuntimeException("Stub!"); }
/* 71 */   public List<MediaSession.QueueItem> getQueue() { throw new RuntimeException("Stub!"); }
/* 72 */   public CharSequence getQueueTitle() { throw new RuntimeException("Stub!"); }
/* 73 */   public Bundle getExtras() { throw new RuntimeException("Stub!"); }
/* 74 */   public int getRatingType() { throw new RuntimeException("Stub!"); }
/* 75 */   public long getFlags() { throw new RuntimeException("Stub!"); }
/* 76 */   public PlaybackInfo getPlaybackInfo() { throw new RuntimeException("Stub!"); }
/* 77 */   public PendingIntent getSessionActivity() { throw new RuntimeException("Stub!"); }
/* 78 */   public MediaSession.Token getSessionToken() { throw new RuntimeException("Stub!"); }
/* 79 */   public void setVolumeTo(int value, int flags) { throw new RuntimeException("Stub!"); }
/* 80 */   public void adjustVolume(int direction, int flags) { throw new RuntimeException("Stub!"); }
/* 81 */   public void registerCallback(Callback callback) { throw new RuntimeException("Stub!"); }
/* 82 */   public void registerCallback(Callback callback, Handler handler) { throw new RuntimeException("Stub!"); }
/* 83 */   public void unregisterCallback(Callback callback) { throw new RuntimeException("Stub!"); }
/* 84 */   public void sendCommand(String command, Bundle args, ResultReceiver cb) { throw new RuntimeException("Stub!"); }
/* 85 */   public String getPackageName() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\media\session\MediaController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */