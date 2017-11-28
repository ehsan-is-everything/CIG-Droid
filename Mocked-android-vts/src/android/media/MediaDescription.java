/*    */ package android.media;
/*    */ 
/*    */ import android.net.Uri;
/*    */ 
/*    */ public class MediaDescription implements android.os.Parcelable { public static final long BT_FOLDER_TYPE_ALBUMS = 2L;
/*    */   
/*  7 */   public static class Builder { public Builder() { throw new RuntimeException("Stub!"); }
/*  8 */     public Builder setMediaId(String mediaId) { throw new RuntimeException("Stub!"); }
/*  9 */     public Builder setTitle(CharSequence title) { throw new RuntimeException("Stub!"); }
/* 10 */     public Builder setSubtitle(CharSequence subtitle) { throw new RuntimeException("Stub!"); }
/* 11 */     public Builder setDescription(CharSequence description) { throw new RuntimeException("Stub!"); }
/* 12 */     public Builder setIconBitmap(android.graphics.Bitmap icon) { throw new RuntimeException("Stub!"); }
/* 13 */     public Builder setIconUri(Uri iconUri) { throw new RuntimeException("Stub!"); }
/* 14 */     public Builder setExtras(android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
/* 15 */     public Builder setMediaUri(Uri mediaUri) { throw new RuntimeException("Stub!"); }
/* 16 */     public MediaDescription build() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 18 */   MediaDescription() { throw new RuntimeException("Stub!"); }
/* 19 */   public String getMediaId() { throw new RuntimeException("Stub!"); }
/* 20 */   public CharSequence getTitle() { throw new RuntimeException("Stub!"); }
/* 21 */   public CharSequence getSubtitle() { throw new RuntimeException("Stub!"); }
/* 22 */   public CharSequence getDescription() { throw new RuntimeException("Stub!"); }
/* 23 */   public android.graphics.Bitmap getIconBitmap() { throw new RuntimeException("Stub!"); }
/* 24 */   public Uri getIconUri() { throw new RuntimeException("Stub!"); }
/* 25 */   public android.os.Bundle getExtras() { throw new RuntimeException("Stub!"); }
/* 26 */   public Uri getMediaUri() { throw new RuntimeException("Stub!"); }
/* 27 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 28 */   public void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 29 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */   public static final long BT_FOLDER_TYPE_ARTISTS = 3L;
/*    */   
/*    */   public static final long BT_FOLDER_TYPE_GENRES = 4L;
/*    */   public static final long BT_FOLDER_TYPE_MIXED = 0L;
/*    */   public static final long BT_FOLDER_TYPE_PLAYLISTS = 5L;
/*    */   public static final long BT_FOLDER_TYPE_TITLES = 1L;
/*    */   public static final long BT_FOLDER_TYPE_YEARS = 6L;
/* 39 */   public static final android.os.Parcelable.Creator<MediaDescription> CREATOR = null;
/*    */   public static final String EXTRA_BT_FOLDER_TYPE = "android.media.extra.BT_FOLDER_TYPE";
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\media\MediaDescription.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */