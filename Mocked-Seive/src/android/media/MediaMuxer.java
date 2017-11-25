/*    */ package android.media;
/*    */ 
/*    */ import java.io.FileDescriptor;
/*    */ import java.io.IOException;
/*    */ import java.nio.ByteBuffer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class MediaMuxer
/*    */ {
/*    */   public static final class OutputFormat
/*    */   {
/*    */     public static final int MUXER_OUTPUT_3GPP = 2;
/*    */     public static final int MUXER_OUTPUT_MPEG_4 = 0;
/*    */     public static final int MUXER_OUTPUT_WEBM = 1;
/*    */     
/*    */     OutputFormat()
/*    */     {
/* 22 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */   
/*    */ 
/* 27 */   public MediaMuxer(String path, int format) throws IOException { throw new RuntimeException("Stub!"); }
/* 28 */   public MediaMuxer(FileDescriptor fd, int format) throws IOException { throw new RuntimeException("Stub!"); }
/* 29 */   public void setOrientationHint(int degrees) { throw new RuntimeException("Stub!"); }
/* 30 */   public void setLocation(float latitude, float longitude) { throw new RuntimeException("Stub!"); }
/* 31 */   public void start() { throw new RuntimeException("Stub!"); }
/* 32 */   public void stop() { throw new RuntimeException("Stub!"); }
/* 33 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }
/* 34 */   public int addTrack(MediaFormat format) { throw new RuntimeException("Stub!"); }
/* 35 */   public void writeSampleData(int trackIndex, ByteBuffer byteBuf, MediaCodec.BufferInfo bufferInfo) { throw new RuntimeException("Stub!"); }
/* 36 */   public void release() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\media\MediaMuxer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */