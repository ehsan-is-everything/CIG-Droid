/*    */ package javax.crypto;
/*    */ 
/*    */ import java.security.InvalidKeyException;
/*    */ import java.security.NoSuchAlgorithmException;
/*    */ import java.security.NoSuchProviderException;
/*    */ import java.security.Provider;
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
/*    */ public class SecretKeyFactory
/*    */ {
/* 29 */   protected SecretKeyFactory(SecretKeyFactorySpi keyFacSpi, Provider provider, String algorithm) { throw new RuntimeException("Stub!"); }
/* 30 */   public static final SecretKeyFactory getInstance(String algorithm) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
/* 31 */   public static final SecretKeyFactory getInstance(String algorithm, String provider) throws NoSuchAlgorithmException, NoSuchProviderException { throw new RuntimeException("Stub!"); }
/* 32 */   public static final SecretKeyFactory getInstance(String algorithm, Provider provider) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
/* 33 */   public final Provider getProvider() { throw new RuntimeException("Stub!"); }
/* 34 */   public final String getAlgorithm() { throw new RuntimeException("Stub!"); }
/* 35 */   public final SecretKey generateSecret(KeySpec keySpec) throws InvalidKeySpecException { throw new RuntimeException("Stub!"); }
/* 36 */   public final KeySpec getKeySpec(SecretKey key, Class<?> keySpec) throws InvalidKeySpecException { throw new RuntimeException("Stub!"); }
/* 37 */   public final SecretKey translateKey(SecretKey key) throws InvalidKeyException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\javax\crypto\SecretKeyFactory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */