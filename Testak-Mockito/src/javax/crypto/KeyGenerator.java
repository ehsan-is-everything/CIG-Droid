/*    */ package javax.crypto;
/*    */ 
/*    */ import java.security.InvalidAlgorithmParameterException;
/*    */ import java.security.NoSuchAlgorithmException;
/*    */ import java.security.NoSuchProviderException;
/*    */ import java.security.Provider;
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
/*    */ public class KeyGenerator
/*    */ {
/* 29 */   protected KeyGenerator(KeyGeneratorSpi keyGenSpi, Provider provider, String algorithm) { throw new RuntimeException("Stub!"); }
/* 30 */   public final String getAlgorithm() { throw new RuntimeException("Stub!"); }
/* 31 */   public static final KeyGenerator getInstance(String algorithm) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
/* 32 */   public static final KeyGenerator getInstance(String algorithm, String provider) throws NoSuchAlgorithmException, NoSuchProviderException { throw new RuntimeException("Stub!"); }
/* 33 */   public static final KeyGenerator getInstance(String algorithm, Provider provider) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
/* 34 */   public final Provider getProvider() { throw new RuntimeException("Stub!"); }
/* 35 */   public final void init(SecureRandom random) { throw new RuntimeException("Stub!"); }
/* 36 */   public final void init(AlgorithmParameterSpec params) throws InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); }
/* 37 */   public final void init(AlgorithmParameterSpec params, SecureRandom random) throws InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); }
/* 38 */   public final void init(int keysize) { throw new RuntimeException("Stub!"); }
/* 39 */   public final void init(int keysize, SecureRandom random) { throw new RuntimeException("Stub!"); }
/* 40 */   public final SecretKey generateKey() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\javax\crypto\KeyGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */