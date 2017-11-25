/*    */ package javax.crypto;
/*    */ 
/*    */ import java.security.InvalidKeyException;
/*    */ import java.security.spec.InvalidKeySpecException;
/*    */ import java.security.spec.KeySpec;
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
/*    */ public abstract class SecretKeyFactorySpi
/*    */ {
/*    */   public SecretKeyFactorySpi()
/*    */   {
/* 29 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   protected abstract SecretKey engineGenerateSecret(KeySpec paramKeySpec)
/*    */     throws InvalidKeySpecException;
/*    */   
/*    */   protected abstract KeySpec engineGetKeySpec(SecretKey paramSecretKey, Class<?> paramClass)
/*    */     throws InvalidKeySpecException;
/*    */   
/*    */   protected abstract SecretKey engineTranslateKey(SecretKey paramSecretKey)
/*    */     throws InvalidKeyException;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\javax\crypto\SecretKeyFactorySpi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */