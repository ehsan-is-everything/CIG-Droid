/*    */ package javax.crypto;
/*    */ 
/*    */ import java.security.InvalidAlgorithmParameterException;
/*    */ import java.security.InvalidKeyException;
/*    */ import java.security.Key;
/*    */ import java.security.NoSuchAlgorithmException;
/*    */ import java.security.SecureRandom;
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
/*    */ public abstract class KeyAgreementSpi
/*    */ {
/*    */   public KeyAgreementSpi()
/*    */   {
/* 29 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   protected abstract void engineInit(Key paramKey, SecureRandom paramSecureRandom)
/*    */     throws InvalidKeyException;
/*    */   
/*    */   protected abstract void engineInit(Key paramKey, AlgorithmParameterSpec paramAlgorithmParameterSpec, SecureRandom paramSecureRandom)
/*    */     throws InvalidKeyException, InvalidAlgorithmParameterException;
/*    */   
/*    */   protected abstract Key engineDoPhase(Key paramKey, boolean paramBoolean)
/*    */     throws InvalidKeyException, IllegalStateException;
/*    */   
/*    */   protected abstract byte[] engineGenerateSecret()
/*    */     throws IllegalStateException;
/*    */   
/*    */   protected abstract int engineGenerateSecret(byte[] paramArrayOfByte, int paramInt)
/*    */     throws IllegalStateException, ShortBufferException;
/*    */   
/*    */   protected abstract SecretKey engineGenerateSecret(String paramString)
/*    */     throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\javax\crypto\KeyAgreementSpi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */