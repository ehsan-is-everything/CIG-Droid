/*    */ package android.media.session;
/*    */ 
/*    */ import android.app.PendingIntent;
/*    */ import android.content.Intent;
/*    */ import android.media.MediaDescription;
/*    */ import android.media.MediaMetadata;
/*    */ import android.net.Uri;
/*    */ import android.os.Bundle;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ 
/*    */ 
/*    */ public final class MediaSession
/*    */ {
/*    */   @Deprecated
/*    */   public static final int FLAG_HANDLES_MEDIA_BUTTONS = 1;
/*    */   @Deprecated
/*    */   public static final int FLAG_HANDLES_TRANSPORT_CONTROLS = 2;
/*    */   
/*    */   public static final class Token
/*    */     implements Parcelable
/*    */   {
/* 23 */     Token() { throw new RuntimeException("Stub!"); }
/* 24 */     public int describeContents() { throw new RuntimeException("Stub!"); }
/* 25 */     public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 26 */     public int hashCode() { throw new RuntimeException("Stub!"); }
/* 27 */     public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/*    */     
/* 29 */     public static final android.os.Parcelable.Creator<Token> CREATOR = null;
/*    */   }
/*    */   
/*    */   public static abstract class Callback {
/* 33 */     public Callback() { throw new RuntimeException("Stub!"); }
/* 34 */     public void onCommand(String command, Bundle args, android.os.ResultReceiver cb) { throw new RuntimeException("Stub!"); }
/* 35 */     public boolean onMediaButtonEvent(Intent mediaButtonIntent) { throw new RuntimeException("Stub!"); }
/* 36 */     public void onPrepare() { throw new RuntimeException("Stub!"); }
/* 37 */     public void onPrepareFromMediaId(String mediaId, Bundle extras) { throw new RuntimeException("Stub!"); }
/* 38 */     public void onPrepareFromSearch(String query, Bundle extras) { throw new RuntimeException("Stub!"); }
/* 39 */     public void onPrepareFromUri(Uri uri, Bundle extras) { throw new RuntimeException("Stub!"); }
/* 40 */     public void onPlay() { throw new RuntimeException("Stub!"); }
/* 41 */     public void onPlayFromSearch(String query, Bundle extras) { throw new RuntimeException("Stub!"); }
/* 42 */     public void onPlayFromMediaId(String mediaId, Bundle extras) { throw new RuntimeException("Stub!"); }
/* 43 */     public void onPlayFromUri(Uri uri, Bundle extras) { throw new RuntimeException("Stub!"); }
/* 44 */     public void onSkipToQueueItem(long id) { throw new RuntimeException("Stub!"); }
/* 45 */     public void onPause() { throw new RuntimeException("Stub!"); }
/* 46 */     public void onSkipToNext() { throw new RuntimeException("Stub!"); }
/* 47 */     public void onSkipToPrevious() { throw new RuntimeException("Stub!"); }
/* 48 */     public void onFastForward() { throw new RuntimeException("Stub!"); }
/* 49 */     public void onRewind() { throw new RuntimeException("Stub!"); }
/* 50 */     public void onStop() { throw new RuntimeException("Stub!"); }
/* 51 */     public void onSeekTo(long pos) { throw new RuntimeException("Stub!"); }
/* 52 */     public void onSetRating(android.media.Rating rating) { throw new RuntimeException("Stub!"); }
/* 53 */     public void onCustomAction(String action, Bundle extras) { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public static final class QueueItem
/*    */     implements Parcelable {
/* 58 */     public QueueItem(MediaDescription description, long id) { throw new RuntimeException("Stub!"); }
/* 59 */     public MediaDescription getDescription() { throw new RuntimeException("Stub!"); }
/* 60 */     public long getQueueId() { throw new RuntimeException("Stub!"); }
/* 61 */     public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 62 */     public int describeContents() { throw new RuntimeException("Stub!"); }
/* 63 */     public String toString() { throw new RuntimeException("Stub!"); }
/*    */     
/*    */ 
/* 66 */     public static final android.os.Parcelable.Creator<QueueItem> CREATOR = null;
/*    */     public static final int UNKNOWN_ID = -1; }
/* 68 */   public MediaSession(android.content.Context context, String tag) { throw new RuntimeException("Stub!"); }
/* 69 */   public void setCallback(Callback callback) { throw new RuntimeException("Stub!"); }
/* 70 */   public void setCallback(Callback callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
/* 71 */   public void setSessionActivity(PendingIntent pi) { throw new RuntimeException("Stub!"); }
/* 72 */   public void setMediaButtonReceiver(PendingIntent mbr) { throw new RuntimeException("Stub!"); }
/* 73 */   public void setFlags(int flags) { throw new RuntimeException("Stub!"); }
/* 74 */   public void setPlaybackToLocal(android.media.AudioAttributes attributes) { throw new RuntimeException("Stub!"); }
/* 75 */   public void setPlaybackToRemote(android.media.VolumeProvider volumeProvider) { throw new RuntimeException("Stub!"); }
/* 76 */   public void setActive(boolean active) { throw new RuntimeException("Stub!"); }
/* 77 */   public boolean isActive() { throw new RuntimeException("Stub!"); }
/* 78 */   public void sendSessionEvent(String event, Bundle extras) { throw new RuntimeException("Stub!"); }
/* 79 */   public void release() { throw new RuntimeException("Stub!"); }
/* 80 */   public Token getSessionToken() { throw new RuntimeException("Stub!"); }
/* 81 */   public MediaController getController() { throw new RuntimeException("Stub!"); }
/* 82 */   public void setPlaybackState(PlaybackState state) { throw new RuntimeException("Stub!"); }
/* 83 */   public void setMetadata(MediaMetadata metadata) { throw new RuntimeException("Stub!"); }
/* 84 */   public void setQueue(java.util.List<QueueItem> queue) { throw new RuntimeException("Stub!"); }
/* 85 */   public void setQueueTitle(CharSequence title) { throw new RuntimeException("Stub!"); }
/* 86 */   public void setRatingType(int type) { throw new RuntimeException("Stub!"); }
/* 87 */   public void setExtras(Bundle extras) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\media\session\MediaSession.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */