/*    */ package android.media;
/*    */ 
/*    */ import java.util.UUID;
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
/*    */ public final class MediaCrypto
/*    */ {
/* 20 */   public MediaCrypto(UUID uuid, byte[] initData)
/* 20 */     throws MediaCryptoException { throw new RuntimeException("Stub!"); }
/* 21 */   public static final boolean isCryptoSchemeSupported(UUID uuid) { throw new RuntimeException("Stub!"); }
/*    */   public final native boolean requiresSecureDecoderComponent(String paramString);
/*    */   public final native void setMediaDrmSession(byte[] paramArrayOfByte) throws MediaCryptoException;
/* 24 */   protected void finalize() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public final native void release();
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\media\MediaCrypto.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */