/*    */ package android.media;
/*    */ 
/*    */ import java.io.FileDescriptor;
/*    */ 
/*    */ public class MediaMetadataRetriever { public static final int METADATA_KEY_ALBUM = 1;
/*    */   public static final int METADATA_KEY_ALBUMARTIST = 13;
/*    */   public static final int METADATA_KEY_ARTIST = 2;
/*    */   public static final int METADATA_KEY_AUTHOR = 3;
/*    */   public static final int METADATA_KEY_BITRATE = 20;
/*    */   public static final int METADATA_KEY_CAPTURE_FRAMERATE = 25;
/*    */   public static final int METADATA_KEY_CD_TRACK_NUMBER = 0;
/*    */   public static final int METADATA_KEY_COMPILATION = 15;
/*    */   public static final int METADATA_KEY_COMPOSER = 4;
/*    */   public static final int METADATA_KEY_DATE = 5;
/*    */   public static final int METADATA_KEY_DISC_NUMBER = 14;
/*    */   public static final int METADATA_KEY_DURATION = 9;
/*    */   public static final int METADATA_KEY_GENRE = 6;
/*    */   public static final int METADATA_KEY_HAS_AUDIO = 16;
/*    */   
/* 20 */   public MediaMetadataRetriever() { throw new RuntimeException("Stub!"); }
/* 21 */   public void setDataSource(String path) throws IllegalArgumentException { throw new RuntimeException("Stub!"); }
/* 22 */   public void setDataSource(String uri, java.util.Map<String, String> headers) throws IllegalArgumentException { throw new RuntimeException("Stub!"); }
/*    */   public native void setDataSource(FileDescriptor paramFileDescriptor, long paramLong1, long paramLong2) throws IllegalArgumentException;
/* 24 */   public void setDataSource(FileDescriptor fd) throws IllegalArgumentException { throw new RuntimeException("Stub!"); }
/* 25 */   public void setDataSource(android.content.Context context, android.net.Uri uri) throws IllegalArgumentException, SecurityException { throw new RuntimeException("Stub!"); }
/* 26 */   public void setDataSource(MediaDataSource dataSource) throws IllegalArgumentException { throw new RuntimeException("Stub!"); }
/*    */   public native String extractMetadata(int paramInt);
/* 28 */   public android.graphics.Bitmap getFrameAtTime(long timeUs, int option) { throw new RuntimeException("Stub!"); }
/* 29 */   public android.graphics.Bitmap getFrameAtTime(long timeUs) { throw new RuntimeException("Stub!"); }
/* 30 */   public android.graphics.Bitmap getFrameAtTime() { throw new RuntimeException("Stub!"); }
/* 31 */   public byte[] getEmbeddedPicture() { throw new RuntimeException("Stub!"); }
/*    */   public native void release();
/* 33 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static final int METADATA_KEY_HAS_VIDEO = 17;
/*    */   public static final int METADATA_KEY_LOCATION = 23;
/*    */   public static final int METADATA_KEY_MIMETYPE = 12;
/*    */   public static final int METADATA_KEY_NUM_TRACKS = 10;
/*    */   public static final int METADATA_KEY_TITLE = 7;
/*    */   public static final int METADATA_KEY_VIDEO_HEIGHT = 19;
/*    */   public static final int METADATA_KEY_VIDEO_ROTATION = 24;
/*    */   public static final int METADATA_KEY_VIDEO_WIDTH = 18;
/*    */   public static final int METADATA_KEY_WRITER = 11;
/*    */   public static final int METADATA_KEY_YEAR = 8;
/*    */   public static final int OPTION_CLOSEST = 3;
/*    */   public static final int OPTION_CLOSEST_SYNC = 2;
/*    */   public static final int OPTION_NEXT_SYNC = 1;
/*    */   public static final int OPTION_PREVIOUS_SYNC = 0;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\media\MediaMetadataRetriever.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */