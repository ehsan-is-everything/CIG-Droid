/*    */ package android.media;
/*    */ 
/*    */ import java.nio.ByteBuffer;
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
/*    */ public final class MediaDescrambler
/*    */   implements AutoCloseable
/*    */ {
/* 21 */   public MediaDescrambler(int CA_system_id)
/* 21 */     throws MediaCasException.UnsupportedCasException { throw new RuntimeException("Stub!"); }
/* 22 */   public final boolean requiresSecureDecoderComponent(String mime) { throw new RuntimeException("Stub!"); }
/* 23 */   public final void setMediaCasSession(MediaCas.Session session) { throw new RuntimeException("Stub!"); }
/* 24 */   public final int descramble(ByteBuffer srcBuf, ByteBuffer dstBuf, MediaCodec.CryptoInfo cryptoInfo) { throw new RuntimeException("Stub!"); }
/* 25 */   public void close() { throw new RuntimeException("Stub!"); }
/* 26 */   protected void finalize() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\media\MediaDescrambler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */