/*    */ package javax.crypto;
/*    */ 
/*    */ import java.nio.ByteBuffer;
/*    */ import java.security.InvalidAlgorithmParameterException;
/*    */ import java.security.InvalidKeyException;
/*    */ import java.security.Key;
/*    */ import java.security.NoSuchAlgorithmException;
/*    */ import java.security.NoSuchProviderException;
/*    */ import java.security.Provider;
/*    */ import java.security.spec.AlgorithmParameterSpec;
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
/*    */ public class Mac
/*    */   implements Cloneable
/*    */ {
/* 31 */   protected Mac(MacSpi macSpi, Provider provider, String algorithm) { throw new RuntimeException("Stub!"); }
/* 32 */   public final String getAlgorithm() { throw new RuntimeException("Stub!"); }
/* 33 */   public static final Mac getInstance(String algorithm) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
/* 34 */   public static final Mac getInstance(String algorithm, String provider) throws NoSuchAlgorithmException, NoSuchProviderException { throw new RuntimeException("Stub!"); }
/* 35 */   public static final Mac getInstance(String algorithm, Provider provider) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
/* 36 */   public final Provider getProvider() { throw new RuntimeException("Stub!"); }
/* 37 */   public final int getMacLength() { throw new RuntimeException("Stub!"); }
/* 38 */   public final void init(Key key) throws InvalidKeyException { throw new RuntimeException("Stub!"); }
/* 39 */   public final void init(Key key, AlgorithmParameterSpec params) throws InvalidKeyException, InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); }
/* 40 */   public final void update(byte input) throws IllegalStateException { throw new RuntimeException("Stub!"); }
/* 41 */   public final void update(byte[] input) throws IllegalStateException { throw new RuntimeException("Stub!"); }
/* 42 */   public final void update(byte[] input, int offset, int len) throws IllegalStateException { throw new RuntimeException("Stub!"); }
/* 43 */   public final void update(ByteBuffer input) { throw new RuntimeException("Stub!"); }
/* 44 */   public final byte[] doFinal() throws IllegalStateException { throw new RuntimeException("Stub!"); }
/* 45 */   public final void doFinal(byte[] output, int outOffset) throws ShortBufferException, IllegalStateException { throw new RuntimeException("Stub!"); }
/* 46 */   public final byte[] doFinal(byte[] input) throws IllegalStateException { throw new RuntimeException("Stub!"); }
/* 47 */   public final void reset() { throw new RuntimeException("Stub!"); }
/* 48 */   public final Object clone() throws CloneNotSupportedException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\javax\crypto\Mac.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */