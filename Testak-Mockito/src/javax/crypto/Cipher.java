/*    */ package javax.crypto;
/*    */ 
/*    */ import java.nio.ByteBuffer;
/*    */ import java.security.AlgorithmParameters;
/*    */ import java.security.InvalidAlgorithmParameterException;
/*    */ import java.security.InvalidKeyException;
/*    */ import java.security.Key;
/*    */ import java.security.NoSuchAlgorithmException;
/*    */ import java.security.NoSuchProviderException;
/*    */ import java.security.Provider;
/*    */ import java.security.SecureRandom;
/*    */ import java.security.cert.Certificate;
/*    */ import java.security.spec.AlgorithmParameterSpec;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Cipher
/*    */ {
/*    */   public static final int DECRYPT_MODE = 2;
/*    */   public static final int ENCRYPT_MODE = 1;
/*    */   public static final int PRIVATE_KEY = 2;
/*    */   public static final int PUBLIC_KEY = 1;
/*    */   public static final int SECRET_KEY = 3;
/*    */   public static final int UNWRAP_MODE = 4;
/*    */   public static final int WRAP_MODE = 3;
/*    */   
/* 30 */   protected Cipher(CipherSpi cipherSpi, Provider provider, String transformation) { throw new RuntimeException("Stub!"); }
/* 31 */   public static final Cipher getInstance(String transformation) throws NoSuchAlgorithmException, NoSuchPaddingException { throw new RuntimeException("Stub!"); }
/* 32 */   public static final Cipher getInstance(String transformation, String provider) throws NoSuchAlgorithmException, NoSuchProviderException, NoSuchPaddingException { throw new RuntimeException("Stub!"); }
/* 33 */   public static final Cipher getInstance(String transformation, Provider provider) throws NoSuchAlgorithmException, NoSuchPaddingException { throw new RuntimeException("Stub!"); }
/* 34 */   public final Provider getProvider() { throw new RuntimeException("Stub!"); }
/* 35 */   public final String getAlgorithm() { throw new RuntimeException("Stub!"); }
/* 36 */   public final int getBlockSize() { throw new RuntimeException("Stub!"); }
/* 37 */   public final int getOutputSize(int inputLen) { throw new RuntimeException("Stub!"); }
/* 38 */   public final byte[] getIV() { throw new RuntimeException("Stub!"); }
/* 39 */   public final AlgorithmParameters getParameters() { throw new RuntimeException("Stub!"); }
/* 40 */   public final ExemptionMechanism getExemptionMechanism() { throw new RuntimeException("Stub!"); }
/* 41 */   public final void init(int opmode, Key key) throws InvalidKeyException { throw new RuntimeException("Stub!"); }
/* 42 */   public final void init(int opmode, Key key, SecureRandom random) throws InvalidKeyException { throw new RuntimeException("Stub!"); }
/* 43 */   public final void init(int opmode, Key key, AlgorithmParameterSpec params) throws InvalidKeyException, InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); }
/* 44 */   public final void init(int opmode, Key key, AlgorithmParameterSpec params, SecureRandom random) throws InvalidKeyException, InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); }
/* 45 */   public final void init(int opmode, Key key, AlgorithmParameters params) throws InvalidKeyException, InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); }
/* 46 */   public final void init(int opmode, Key key, AlgorithmParameters params, SecureRandom random) throws InvalidKeyException, InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); }
/* 47 */   public final void init(int opmode, Certificate certificate) throws InvalidKeyException { throw new RuntimeException("Stub!"); }
/* 48 */   public final void init(int opmode, Certificate certificate, SecureRandom random) throws InvalidKeyException { throw new RuntimeException("Stub!"); }
/* 49 */   public final byte[] update(byte[] input) { throw new RuntimeException("Stub!"); }
/* 50 */   public final byte[] update(byte[] input, int inputOffset, int inputLen) { throw new RuntimeException("Stub!"); }
/* 51 */   public final int update(byte[] input, int inputOffset, int inputLen, byte[] output) throws ShortBufferException { throw new RuntimeException("Stub!"); }
/* 52 */   public final int update(byte[] input, int inputOffset, int inputLen, byte[] output, int outputOffset) throws ShortBufferException { throw new RuntimeException("Stub!"); }
/* 53 */   public final int update(ByteBuffer input, ByteBuffer output) throws ShortBufferException { throw new RuntimeException("Stub!"); }
/* 54 */   public final byte[] doFinal() throws IllegalBlockSizeException, BadPaddingException { throw new RuntimeException("Stub!"); }
/* 55 */   public final int doFinal(byte[] output, int outputOffset) throws IllegalBlockSizeException, ShortBufferException, BadPaddingException { throw new RuntimeException("Stub!"); }
/* 56 */   public final byte[] doFinal(byte[] input) throws IllegalBlockSizeException, BadPaddingException { throw new RuntimeException("Stub!"); }
/* 57 */   public final byte[] doFinal(byte[] input, int inputOffset, int inputLen) throws IllegalBlockSizeException, BadPaddingException { throw new RuntimeException("Stub!"); }
/* 58 */   public final int doFinal(byte[] input, int inputOffset, int inputLen, byte[] output) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException { throw new RuntimeException("Stub!"); }
/* 59 */   public final int doFinal(byte[] input, int inputOffset, int inputLen, byte[] output, int outputOffset) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException { throw new RuntimeException("Stub!"); }
/* 60 */   public final int doFinal(ByteBuffer input, ByteBuffer output) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException { throw new RuntimeException("Stub!"); }
/* 61 */   public final byte[] wrap(Key key) throws IllegalBlockSizeException, InvalidKeyException { throw new RuntimeException("Stub!"); }
/* 62 */   public final Key unwrap(byte[] wrappedKey, String wrappedKeyAlgorithm, int wrappedKeyType) throws InvalidKeyException, NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
/* 63 */   public static final int getMaxAllowedKeyLength(String transformation) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
/* 64 */   public static final AlgorithmParameterSpec getMaxAllowedParameterSpec(String transformation) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
/* 65 */   public final void updateAAD(byte[] src) { throw new RuntimeException("Stub!"); }
/* 66 */   public final void updateAAD(byte[] src, int offset, int len) { throw new RuntimeException("Stub!"); }
/* 67 */   public final void updateAAD(ByteBuffer src) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\javax\crypto\Cipher.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */