/*    */ package android.media.browse;
/*    */ 
/*    */ import android.content.ComponentName;
/*    */ import android.content.Context;
/*    */ import android.media.MediaDescription;
/*    */ import android.media.session.MediaSession.Token;
/*    */ import android.os.Bundle;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class MediaBrowser
/*    */ {
/*    */   public static final String EXTRA_PAGE = "android.media.browse.extra.PAGE";
/*    */   public static final String EXTRA_PAGE_SIZE = "android.media.browse.extra.PAGE_SIZE";
/*    */   
/*    */   public static class MediaItem
/*    */     implements Parcelable
/*    */   {
/* 23 */     public MediaItem(MediaDescription description, int flags) { throw new RuntimeException("Stub!"); }
/* 24 */     public int describeContents() { throw new RuntimeException("Stub!"); }
/* 25 */     public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!"); }
/* 26 */     public String toString() { throw new RuntimeException("Stub!"); }
/* 27 */     public int getFlags() { throw new RuntimeException("Stub!"); }
/* 28 */     public boolean isBrowsable() { throw new RuntimeException("Stub!"); }
/* 29 */     public boolean isPlayable() { throw new RuntimeException("Stub!"); }
/* 30 */     public MediaDescription getDescription() { throw new RuntimeException("Stub!"); }
/* 31 */     public String getMediaId() { throw new RuntimeException("Stub!"); }
/*    */     
/*    */ 
/*    */ 
/* 35 */     public static final Parcelable.Creator<MediaItem> CREATOR = null;
/*    */     public static final int FLAG_BROWSABLE = 1;
/*    */     public static final int FLAG_PLAYABLE = 2; }
/*    */   
/* 39 */   public static class ConnectionCallback { public ConnectionCallback() { throw new RuntimeException("Stub!"); }
/* 40 */     public void onConnected() { throw new RuntimeException("Stub!"); }
/* 41 */     public void onConnectionSuspended() { throw new RuntimeException("Stub!"); }
/* 42 */     public void onConnectionFailed() { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public static abstract class SubscriptionCallback {
/* 46 */     public SubscriptionCallback() { throw new RuntimeException("Stub!"); }
/* 47 */     public void onChildrenLoaded(String parentId, List<MediaBrowser.MediaItem> children) { throw new RuntimeException("Stub!"); }
/* 48 */     public void onChildrenLoaded(String parentId, List<MediaBrowser.MediaItem> children, Bundle options) { throw new RuntimeException("Stub!"); }
/* 49 */     public void onError(String parentId) { throw new RuntimeException("Stub!"); }
/* 50 */     public void onError(String parentId, Bundle options) { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public static abstract class ItemCallback {
/* 54 */     public ItemCallback() { throw new RuntimeException("Stub!"); }
/* 55 */     public void onItemLoaded(MediaBrowser.MediaItem item) { throw new RuntimeException("Stub!"); }
/* 56 */     public void onError(String mediaId) { throw new RuntimeException("Stub!"); } }
/*    */   
/* 58 */   public MediaBrowser(Context context, ComponentName serviceComponent, ConnectionCallback callback, Bundle rootHints) { throw new RuntimeException("Stub!"); }
/* 59 */   public void connect() { throw new RuntimeException("Stub!"); }
/* 60 */   public void disconnect() { throw new RuntimeException("Stub!"); }
/* 61 */   public boolean isConnected() { throw new RuntimeException("Stub!"); }
/* 62 */   public ComponentName getServiceComponent() { throw new RuntimeException("Stub!"); }
/* 63 */   public String getRoot() { throw new RuntimeException("Stub!"); }
/* 64 */   public Bundle getExtras() { throw new RuntimeException("Stub!"); }
/* 65 */   public MediaSession.Token getSessionToken() { throw new RuntimeException("Stub!"); }
/* 66 */   public void subscribe(String parentId, SubscriptionCallback callback) { throw new RuntimeException("Stub!"); }
/* 67 */   public void subscribe(String parentId, Bundle options, SubscriptionCallback callback) { throw new RuntimeException("Stub!"); }
/* 68 */   public void unsubscribe(String parentId) { throw new RuntimeException("Stub!"); }
/* 69 */   public void unsubscribe(String parentId, SubscriptionCallback callback) { throw new RuntimeException("Stub!"); }
/* 70 */   public void getItem(String mediaId, ItemCallback cb) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\media\browse\MediaBrowser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */