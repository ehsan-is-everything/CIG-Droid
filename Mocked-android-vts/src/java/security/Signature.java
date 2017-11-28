/*    */ package java.security;
/*    */ 
/*    */ import java.nio.ByteBuffer;
/*    */ import java.security.cert.Certificate;
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
/*    */ public abstract class Signature
/*    */   extends SignatureSpi
/*    */ {
/*    */   protected static final int SIGN = 2;
/*    */   protected static final int UNINITIALIZED = 0;
/*    */   protected static final int VERIFY = 3;
/*    */   protected int state;
/*    */   
/* 31 */   protected Signature(String algorithm) { throw new RuntimeException("Stub!"); }
/* 32 */   public static Signature getInstance(String algorithm) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
/* 33 */   public static Signature getInstance(String algorithm, String provider) throws NoSuchAlgorithmException, NoSuchProviderException { throw new RuntimeException("Stub!"); }
/* 34 */   public static Signature getInstance(String algorithm, Provider provider) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
/* 35 */   public final Provider getProvider() { throw new RuntimeException("Stub!"); }
/* 36 */   public final void initVerify(PublicKey publicKey) throws InvalidKeyException { throw new RuntimeException("Stub!"); }
/* 37 */   public final void initVerify(Certificate certificate) throws InvalidKeyException { throw new RuntimeException("Stub!"); }
/* 38 */   public final void initSign(PrivateKey privateKey) throws InvalidKeyException { throw new RuntimeException("Stub!"); }
/* 39 */   public final void initSign(PrivateKey privateKey, SecureRandom random) throws InvalidKeyException { throw new RuntimeException("Stub!"); }
/* 40 */   public final byte[] sign() throws SignatureException { throw new RuntimeException("Stub!"); }
/* 41 */   public final int sign(byte[] outbuf, int offset, int len) throws SignatureException { throw new RuntimeException("Stub!"); }
/* 42 */   public final boolean verify(byte[] signature) throws SignatureException { throw new RuntimeException("Stub!"); }
/* 43 */   public final boolean verify(byte[] signature, int offset, int length) throws SignatureException { throw new RuntimeException("Stub!"); }
/* 44 */   public final void update(byte b) throws SignatureException { throw new RuntimeException("Stub!"); }
/* 45 */   public final void update(byte[] data) throws SignatureException { throw new RuntimeException("Stub!"); }
/* 46 */   public final void update(byte[] data, int off, int len) throws SignatureException { throw new RuntimeException("Stub!"); }
/* 47 */   public final void update(ByteBuffer data) throws SignatureException { throw new RuntimeException("Stub!"); }
/* 48 */   public final String getAlgorithm() { throw new RuntimeException("Stub!"); }
/* 49 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 51 */   public final void setParameter(String param, Object value) throws InvalidParameterException { throw new RuntimeException("Stub!"); }
/* 52 */   public final void setParameter(AlgorithmParameterSpec params) throws InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); }
/* 53 */   public final AlgorithmParameters getParameters() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 55 */   public final Object getParameter(String param) throws InvalidParameterException { throw new RuntimeException("Stub!"); }
/* 56 */   public Object clone() throws CloneNotSupportedException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\security\Signature.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */