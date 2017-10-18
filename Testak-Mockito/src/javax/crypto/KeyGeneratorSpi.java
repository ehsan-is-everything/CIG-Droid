/*    */ package javax.crypto;
/*    */ 
/*    */ import java.security.InvalidAlgorithmParameterException;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class KeyGeneratorSpi
/*    */ {
/*    */   public KeyGeneratorSpi()
/*    */   {
/* 29 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   protected abstract void engineInit(SecureRandom paramSecureRandom);
/*    */   
/*    */   protected abstract void engineInit(AlgorithmParameterSpec paramAlgorithmParameterSpec, SecureRandom paramSecureRandom)
/*    */     throws InvalidAlgorithmParameterException;
/*    */   
/*    */   protected abstract void engineInit(int paramInt, SecureRandom paramSecureRandom);
/*    */   
/*    */   protected abstract SecretKey engineGenerateKey();
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\javax\crypto\KeyGeneratorSpi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */