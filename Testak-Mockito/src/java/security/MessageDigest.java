/*    */ package java.security;
/*    */ 
/*    */ import java.nio.ByteBuffer;
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
/*    */ public abstract class MessageDigest
/*    */   extends MessageDigestSpi
/*    */ {
/* 30 */   protected MessageDigest(String algorithm) { throw new RuntimeException("Stub!"); }
/* 31 */   public static MessageDigest getInstance(String algorithm) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
/* 32 */   public static MessageDigest getInstance(String algorithm, String provider) throws NoSuchAlgorithmException, NoSuchProviderException { throw new RuntimeException("Stub!"); }
/* 33 */   public static MessageDigest getInstance(String algorithm, Provider provider) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
/* 34 */   public final Provider getProvider() { throw new RuntimeException("Stub!"); }
/* 35 */   public void update(byte input) { throw new RuntimeException("Stub!"); }
/* 36 */   public void update(byte[] input, int offset, int len) { throw new RuntimeException("Stub!"); }
/* 37 */   public void update(byte[] input) { throw new RuntimeException("Stub!"); }
/* 38 */   public final void update(ByteBuffer input) { throw new RuntimeException("Stub!"); }
/* 39 */   public byte[] digest() { throw new RuntimeException("Stub!"); }
/* 40 */   public int digest(byte[] buf, int offset, int len) throws DigestException { throw new RuntimeException("Stub!"); }
/* 41 */   public byte[] digest(byte[] input) { throw new RuntimeException("Stub!"); }
/* 42 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 43 */   public static boolean isEqual(byte[] digesta, byte[] digestb) { throw new RuntimeException("Stub!"); }
/* 44 */   public void reset() { throw new RuntimeException("Stub!"); }
/* 45 */   public final String getAlgorithm() { throw new RuntimeException("Stub!"); }
/* 46 */   public final int getDigestLength() { throw new RuntimeException("Stub!"); }
/* 47 */   public Object clone() throws CloneNotSupportedException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\security\MessageDigest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */