/*    */ package java.security;
/*    */ 
/*    */ import java.util.Random;
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
/*    */ public class SecureRandom
/*    */   extends Random
/*    */ {
/* 30 */   public SecureRandom() { throw new RuntimeException("Stub!"); }
/* 31 */   public SecureRandom(byte[] seed) { throw new RuntimeException("Stub!"); }
/* 32 */   protected SecureRandom(SecureRandomSpi secureRandomSpi, Provider provider) { throw new RuntimeException("Stub!"); }
/* 33 */   public static SecureRandom getInstance(String algorithm) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
/* 34 */   public static SecureRandom getInstance(String algorithm, String provider) throws NoSuchAlgorithmException, NoSuchProviderException { throw new RuntimeException("Stub!"); }
/* 35 */   public static SecureRandom getInstance(String algorithm, Provider provider) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
/* 36 */   public final Provider getProvider() { throw new RuntimeException("Stub!"); }
/* 37 */   public String getAlgorithm() { throw new RuntimeException("Stub!"); }
/* 38 */   public synchronized void setSeed(byte[] seed) { throw new RuntimeException("Stub!"); }
/* 39 */   public void setSeed(long seed) { throw new RuntimeException("Stub!"); }
/* 40 */   public synchronized void nextBytes(byte[] bytes) { throw new RuntimeException("Stub!"); }
/* 41 */   protected final int next(int numBits) { throw new RuntimeException("Stub!"); }
/* 42 */   public static byte[] getSeed(int numBytes) { throw new RuntimeException("Stub!"); }
/* 43 */   public byte[] generateSeed(int numBytes) { throw new RuntimeException("Stub!"); }
/* 44 */   public static SecureRandom getInstanceStrong() throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\security\SecureRandom.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */