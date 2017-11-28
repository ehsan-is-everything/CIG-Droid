/*    */ package javax.crypto;
/*    */ 
/*    */ import java.security.InvalidAlgorithmParameterException;
/*    */ import java.security.InvalidKeyException;
/*    */ import java.security.Key;
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
/*    */ public class KeyAgreement
/*    */ {
/* 30 */   protected KeyAgreement(KeyAgreementSpi keyAgreeSpi, Provider provider, String algorithm) { throw new RuntimeException("Stub!"); }
/* 31 */   public final String getAlgorithm() { throw new RuntimeException("Stub!"); }
/* 32 */   public static final KeyAgreement getInstance(String algorithm) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
/* 33 */   public static final KeyAgreement getInstance(String algorithm, String provider) throws NoSuchAlgorithmException, NoSuchProviderException { throw new RuntimeException("Stub!"); }
/* 34 */   public static final KeyAgreement getInstance(String algorithm, Provider provider) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
/* 35 */   public final Provider getProvider() { throw new RuntimeException("Stub!"); }
/* 36 */   public final void init(Key key) throws InvalidKeyException { throw new RuntimeException("Stub!"); }
/* 37 */   public final void init(Key key, SecureRandom random) throws InvalidKeyException { throw new RuntimeException("Stub!"); }
/* 38 */   public final void init(Key key, AlgorithmParameterSpec params) throws InvalidKeyException, InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); }
/* 39 */   public final void init(Key key, AlgorithmParameterSpec params, SecureRandom random) throws InvalidKeyException, InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); }
/* 40 */   public final Key doPhase(Key key, boolean lastPhase) throws InvalidKeyException, IllegalStateException { throw new RuntimeException("Stub!"); }
/* 41 */   public final byte[] generateSecret() throws IllegalStateException { throw new RuntimeException("Stub!"); }
/* 42 */   public final int generateSecret(byte[] sharedSecret, int offset) throws IllegalStateException, ShortBufferException { throw new RuntimeException("Stub!"); }
/* 43 */   public final SecretKey generateSecret(String algorithm) throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\javax\crypto\KeyAgreement.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */