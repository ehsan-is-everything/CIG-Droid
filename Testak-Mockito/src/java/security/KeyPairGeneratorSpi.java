/*    */ package java.security;
/*    */ 
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
/*    */ 
/*    */ 
/*    */ public abstract class KeyPairGeneratorSpi
/*    */ {
/* 29 */   public KeyPairGeneratorSpi() { throw new RuntimeException("Stub!"); }
/*    */   public abstract void initialize(int paramInt, SecureRandom paramSecureRandom);
/* 31 */   public void initialize(AlgorithmParameterSpec params, SecureRandom random) throws InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract KeyPair generateKeyPair();
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\security\KeyPairGeneratorSpi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */