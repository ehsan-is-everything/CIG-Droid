/*    */ package java.security;
/*    */ 
/*    */ import java.nio.ByteBuffer;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class SignatureSpi
/*    */ {
/*    */   protected SecureRandom appRandom;
/*    */   
/* 30 */   public SignatureSpi() { throw new RuntimeException("Stub!"); }
/*    */   protected abstract void engineInitVerify(PublicKey paramPublicKey) throws InvalidKeyException;
/*    */   protected abstract void engineInitSign(PrivateKey paramPrivateKey) throws InvalidKeyException;
/* 33 */   protected void engineInitSign(PrivateKey privateKey, SecureRandom random) throws InvalidKeyException { throw new RuntimeException("Stub!"); }
/*    */   protected abstract void engineUpdate(byte paramByte) throws SignatureException;
/*    */   protected abstract void engineUpdate(byte[] paramArrayOfByte, int paramInt1, int paramInt2) throws SignatureException;
/* 36 */   protected void engineUpdate(ByteBuffer input) { throw new RuntimeException("Stub!"); }
/*    */   protected abstract byte[] engineSign() throws SignatureException;
/* 38 */   protected int engineSign(byte[] outbuf, int offset, int len) throws SignatureException { throw new RuntimeException("Stub!"); }
/*    */   protected abstract boolean engineVerify(byte[] paramArrayOfByte) throws SignatureException;
/* 40 */   protected boolean engineVerify(byte[] sigBytes, int offset, int length) throws SignatureException { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/*    */   protected abstract void engineSetParameter(String paramString, Object paramObject) throws InvalidParameterException;
/* 43 */   protected void engineSetParameter(AlgorithmParameterSpec params) throws InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); }
/* 44 */   protected AlgorithmParameters engineGetParameters() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/*    */   protected abstract Object engineGetParameter(String paramString) throws InvalidParameterException;
/* 47 */   public Object clone() throws CloneNotSupportedException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\security\SignatureSpi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */