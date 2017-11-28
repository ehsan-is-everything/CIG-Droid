/*    */ package android.media;
/*    */ 
/*    */ import android.graphics.Bitmap;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class MediaMetadata
/*    */   implements Parcelable
/*    */ {
/*    */   public static final class Builder
/*    */   {
/* 22 */     public Builder() { throw new RuntimeException("Stub!"); }
/* 23 */     public Builder(MediaMetadata source) { throw new RuntimeException("Stub!"); }
/* 24 */     public Builder putText(String key, CharSequence value) { throw new RuntimeException("Stub!"); }
/* 25 */     public Builder putString(String key, String value) { throw new RuntimeException("Stub!"); }
/* 26 */     public Builder putLong(String key, long value) { throw new RuntimeException("Stub!"); }
/* 27 */     public Builder putRating(String key, Rating value) { throw new RuntimeException("Stub!"); }
/* 28 */     public Builder putBitmap(String key, Bitmap value) { throw new RuntimeException("Stub!"); }
/* 29 */     public MediaMetadata build() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 31 */   MediaMetadata() { throw new RuntimeException("Stub!"); }
/* 32 */   public boolean containsKey(String key) { throw new RuntimeException("Stub!"); }
/* 33 */   public CharSequence getText(String key) { throw new RuntimeException("Stub!"); }
/* 34 */   public String getString(String key) { throw new RuntimeException("Stub!"); }
/* 35 */   public long getLong(String key) { throw new RuntimeException("Stub!"); }
/* 36 */   public Rating getRating(String key) { throw new RuntimeException("Stub!"); }
/* 37 */   public Bitmap getBitmap(String key) { throw new RuntimeException("Stub!"); }
/* 38 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 39 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 40 */   public int size() { throw new RuntimeException("Stub!"); }
/* 41 */   public Set<String> keySet() { throw new RuntimeException("Stub!"); }
/* 42 */   public MediaDescription getDescription() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 73 */   public static final Parcelable.Creator<MediaMetadata> CREATOR = null;
/*    */   public static final String METADATA_KEY_ALBUM = "android.media.metadata.ALBUM";
/*    */   public static final String METADATA_KEY_ALBUM_ART = "android.media.metadata.ALBUM_ART";
/*    */   public static final String METADATA_KEY_ALBUM_ARTIST = "android.media.metadata.ALBUM_ARTIST";
/*    */   public static final String METADATA_KEY_ALBUM_ART_URI = "android.media.metadata.ALBUM_ART_URI";
/*    */   public static final String METADATA_KEY_ART = "android.media.metadata.ART";
/*    */   public static final String METADATA_KEY_ARTIST = "android.media.metadata.ARTIST";
/*    */   public static final String METADATA_KEY_ART_URI = "android.media.metadata.ART_URI";
/*    */   public static final String METADATA_KEY_AUTHOR = "android.media.metadata.AUTHOR";
/*    */   public static final String METADATA_KEY_BT_FOLDER_TYPE = "android.media.metadata.BT_FOLDER_TYPE";
/*    */   public static final String METADATA_KEY_COMPILATION = "android.media.metadata.COMPILATION";
/*    */   public static final String METADATA_KEY_COMPOSER = "android.media.metadata.COMPOSER";
/*    */   public static final String METADATA_KEY_DATE = "android.media.metadata.DATE";
/*    */   public static final String METADATA_KEY_DISC_NUMBER = "android.media.metadata.DISC_NUMBER";
/*    */   public static final String METADATA_KEY_DISPLAY_DESCRIPTION = "android.media.metadata.DISPLAY_DESCRIPTION";
/*    */   public static final String METADATA_KEY_DISPLAY_ICON = "android.media.metadata.DISPLAY_ICON";
/*    */   public static final String METADATA_KEY_DISPLAY_ICON_URI = "android.media.metadata.DISPLAY_ICON_URI";
/*    */   public static final String METADATA_KEY_DISPLAY_SUBTITLE = "android.media.metadata.DISPLAY_SUBTITLE";
/*    */   public static final String METADATA_KEY_DISPLAY_TITLE = "android.media.metadata.DISPLAY_TITLE";
/*    */   public static final String METADATA_KEY_DURATION = "android.media.metadata.DURATION";
/*    */   public static final String METADATA_KEY_GENRE = "android.media.metadata.GENRE";
/*    */   public static final String METADATA_KEY_MEDIA_ID = "android.media.metadata.MEDIA_ID";
/*    */   public static final String METADATA_KEY_MEDIA_URI = "android.media.metadata.MEDIA_URI";
/*    */   public static final String METADATA_KEY_NUM_TRACKS = "android.media.metadata.NUM_TRACKS";
/*    */   public static final String METADATA_KEY_RATING = "android.media.metadata.RATING";
/*    */   public static final String METADATA_KEY_TITLE = "android.media.metadata.TITLE";
/*    */   public static final String METADATA_KEY_TRACK_NUMBER = "android.media.metadata.TRACK_NUMBER";
/*    */   public static final String METADATA_KEY_USER_RATING = "android.media.metadata.USER_RATING";
/*    */   public static final String METADATA_KEY_WRITER = "android.media.metadata.WRITER";
/*    */   public static final String METADATA_KEY_YEAR = "android.media.metadata.YEAR";
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\media\MediaMetadata.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */