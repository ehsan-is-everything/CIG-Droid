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
/*    */ public abstract class KeyPairGenerator
/*    */   extends KeyPairGeneratorSpi
/*    */ {
/* 30 */   protected KeyPairGenerator(String algorithm) { throw new RuntimeException("Stub!"); }
/* 31 */   public String getAlgorithm() { throw new RuntimeException("Stub!"); }
/* 32 */   public static KeyPairGenerator getInstance(String algorithm) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
/* 33 */   public static KeyPairGenerator getInstance(String algorithm, String provider) throws NoSuchAlgorithmException, NoSuchProviderException { throw new RuntimeException("Stub!"); }
/* 34 */   public static KeyPairGenerator getInstance(String algorithm, Provider provider) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
/* 35 */   public final Provider getProvider() { throw new RuntimeException("Stub!"); }
/* 36 */   public void initialize(int keysize) { throw new RuntimeException("Stub!"); }
/* 37 */   public void initialize(int keysize, SecureRandom random) { throw new RuntimeException("Stub!"); }
/* 38 */   public void initialize(AlgorithmParameterSpec params) throws InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); }
/* 39 */   public void initialize(AlgorithmParameterSpec params, SecureRandom random) throws InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); }
/* 40 */   public final KeyPair genKeyPair() { throw new RuntimeException("Stub!"); }
/* 41 */   public KeyPair generateKeyPair() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\security\KeyPairGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */