/*    */ package android.media;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class MediaCodecList
/*    */ {
/*    */   public static final int ALL_CODECS = 1;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static final int REGULAR_CODECS = 0;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 20 */   public MediaCodecList(int kind) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 22 */   public static final int getCodecCount() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 24 */   public static final MediaCodecInfo getCodecInfoAt(int index) { throw new RuntimeException("Stub!"); }
/* 25 */   public final MediaCodecInfo[] getCodecInfos() { throw new RuntimeException("Stub!"); }
/* 26 */   public final String findDecoderForFormat(MediaFormat format) { throw new RuntimeException("Stub!"); }
/* 27 */   public final String findEncoderForFormat(MediaFormat format) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\media\MediaCodecList.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */