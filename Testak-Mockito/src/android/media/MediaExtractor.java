/*    */ package android.media;
/*    */ 
/*    */ import android.net.Uri;
/*    */ import java.io.FileDescriptor;
/*    */ import java.io.IOException;
/*    */ import java.nio.ByteBuffer;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class MediaExtractor
/*    */ {
/*    */   public static final int SAMPLE_FLAG_ENCRYPTED = 2;
/*    */   public static final int SAMPLE_FLAG_PARTIAL_FRAME = 4;
/*    */   public static final int SAMPLE_FLAG_SYNC = 1;
/*    */   public static final int SEEK_TO_CLOSEST_SYNC = 2;
/*    */   public static final int SEEK_TO_NEXT_SYNC = 1;
/*    */   public static final int SEEK_TO_PREVIOUS_SYNC = 0;
/*    */   
/*    */   public static final class CasInfo
/*    */   {
/* 22 */     CasInfo() { throw new RuntimeException("Stub!"); }
/* 23 */     public int getSystemId() { throw new RuntimeException("Stub!"); }
/* 24 */     public MediaCas.Session getSession() { throw new RuntimeException("Stub!"); } }
/*    */   
/*    */   public static final class MetricsConstants { public static final String FORMAT = "android.media.mediaextractor.fmt";
/*    */     
/* 28 */     MetricsConstants() { throw new RuntimeException("Stub!"); }
/*    */     
/*    */     public static final String MIME_TYPE = "android.media.mediaextractor.mime";
/*    */     public static final String TRACKS = "android.media.mediaextractor.ntrk"; }
/*    */   
/* 33 */   public MediaExtractor() { throw new RuntimeException("Stub!"); }
/*    */   public final native void setDataSource(MediaDataSource paramMediaDataSource) throws IOException;
/* 35 */   public final void setDataSource(android.content.Context context, Uri uri, Map<String, String> headers) throws IOException { throw new RuntimeException("Stub!"); }
/* 36 */   public final void setDataSource(String path, Map<String, String> headers) throws IOException { throw new RuntimeException("Stub!"); }
/* 37 */   public final void setDataSource(String path) throws IOException { throw new RuntimeException("Stub!"); }
/* 38 */   public final void setDataSource(android.content.res.AssetFileDescriptor afd) throws IOException, IllegalArgumentException, IllegalStateException { throw new RuntimeException("Stub!"); }
/* 39 */   public final void setDataSource(FileDescriptor fd) throws IOException { throw new RuntimeException("Stub!"); }
/*    */   public final native void setDataSource(FileDescriptor paramFileDescriptor, long paramLong1, long paramLong2) throws IOException;
/* 41 */   public final void setMediaCas(MediaCas mediaCas) { throw new RuntimeException("Stub!"); }
/* 42 */   public CasInfo getCasInfo(int index) { throw new RuntimeException("Stub!"); }
/* 43 */   protected void finalize() { throw new RuntimeException("Stub!"); }
/*    */   public final native void release();
/*    */   public final native int getTrackCount();
/* 46 */   public DrmInitData getDrmInitData() { throw new RuntimeException("Stub!"); }
/* 47 */   public Map<java.util.UUID, byte[]> getPsshInfo() { throw new RuntimeException("Stub!"); }
/* 48 */   public MediaFormat getTrackFormat(int index) { throw new RuntimeException("Stub!"); }
/*    */   public native void selectTrack(int paramInt);
/*    */   public native void unselectTrack(int paramInt);
/*    */   public native void seekTo(long paramLong, int paramInt);
/*    */   public native boolean advance();
/*    */   public native int readSampleData(ByteBuffer paramByteBuffer, int paramInt);
/*    */   public native int getSampleTrackIndex();
/*    */   public native long getSampleTime();
/*    */   public native int getSampleFlags();
/*    */   public native boolean getSampleCryptoInfo(MediaCodec.CryptoInfo paramCryptoInfo);
/*    */   public native long getCachedDuration();
/*    */   public native boolean hasCacheReachedEndOfStream();
/* 60 */   public android.os.PersistableBundle getMetrics() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\media\MediaExtractor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */