/*    */ package javax.crypto;
/*    */ 
/*    */ import java.security.AlgorithmParameters;
/*    */ import java.security.InvalidAlgorithmParameterException;
/*    */ import java.security.InvalidKeyException;
/*    */ import java.security.Key;
/*    */ import java.security.NoSuchAlgorithmException;
/*    */ import java.security.NoSuchProviderException;
/*    */ import java.security.Provider;
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
/*    */ public class ExemptionMechanism
/*    */ {
/* 29 */   protected ExemptionMechanism(ExemptionMechanismSpi exmechSpi, Provider provider, String mechanism) { throw new RuntimeException("Stub!"); }
/* 30 */   public final String getName() { throw new RuntimeException("Stub!"); }
/* 31 */   public static final ExemptionMechanism getInstance(String algorithm) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
/* 32 */   public static final ExemptionMechanism getInstance(String algorithm, String provider) throws NoSuchAlgorithmException, NoSuchProviderException { throw new RuntimeException("Stub!"); }
/* 33 */   public static final ExemptionMechanism getInstance(String algorithm, Provider provider) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
/* 34 */   public final Provider getProvider() { throw new RuntimeException("Stub!"); }
/* 35 */   public final boolean isCryptoAllowed(Key key) throws ExemptionMechanismException { throw new RuntimeException("Stub!"); }
/* 36 */   public final int getOutputSize(int inputLen) throws IllegalStateException { throw new RuntimeException("Stub!"); }
/* 37 */   public final void init(Key key) throws InvalidKeyException, ExemptionMechanismException { throw new RuntimeException("Stub!"); }
/* 38 */   public final void init(Key key, AlgorithmParameterSpec params) throws InvalidKeyException, InvalidAlgorithmParameterException, ExemptionMechanismException { throw new RuntimeException("Stub!"); }
/* 39 */   public final void init(Key key, AlgorithmParameters params) throws InvalidKeyException, InvalidAlgorithmParameterException, ExemptionMechanismException { throw new RuntimeException("Stub!"); }
/* 40 */   public final byte[] genExemptionBlob() throws IllegalStateException, ExemptionMechanismException { throw new RuntimeException("Stub!"); }
/* 41 */   public final int genExemptionBlob(byte[] output) throws IllegalStateException, ShortBufferException, ExemptionMechanismException { throw new RuntimeException("Stub!"); }
/* 42 */   public final int genExemptionBlob(byte[] output, int outputOffset) throws IllegalStateException, ShortBufferException, ExemptionMechanismException { throw new RuntimeException("Stub!"); }
/* 43 */   protected void finalize() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\javax\crypto\ExemptionMechanism.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */