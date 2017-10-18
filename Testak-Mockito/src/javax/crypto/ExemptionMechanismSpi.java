/*    */ package javax.crypto;
/*    */ 
/*    */ import java.security.AlgorithmParameters;
/*    */ import java.security.InvalidAlgorithmParameterException;
/*    */ import java.security.InvalidKeyException;
/*    */ import java.security.Key;
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
/*    */ public abstract class ExemptionMechanismSpi
/*    */ {
/*    */   public ExemptionMechanismSpi()
/*    */   {
/* 29 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   protected abstract int engineGetOutputSize(int paramInt);
/*    */   
/*    */   protected abstract void engineInit(Key paramKey)
/*    */     throws InvalidKeyException, ExemptionMechanismException;
/*    */   
/*    */   protected abstract void engineInit(Key paramKey, AlgorithmParameterSpec paramAlgorithmParameterSpec)
/*    */     throws InvalidKeyException, InvalidAlgorithmParameterException, ExemptionMechanismException;
/*    */   
/*    */   protected abstract void engineInit(Key paramKey, AlgorithmParameters paramAlgorithmParameters)
/*    */     throws InvalidKeyException, InvalidAlgorithmParameterException, ExemptionMechanismException;
/*    */   
/*    */   protected abstract byte[] engineGenExemptionBlob()
/*    */     throws ExemptionMechanismException;
/*    */   
/*    */   protected abstract int engineGenExemptionBlob(byte[] paramArrayOfByte, int paramInt)
/*    */     throws ShortBufferException, ExemptionMechanismException;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\javax\crypto\ExemptionMechanismSpi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */