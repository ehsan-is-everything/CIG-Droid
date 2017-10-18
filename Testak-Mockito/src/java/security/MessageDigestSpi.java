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
/*    */ public abstract class MessageDigestSpi
/*    */ {
/* 29 */   public MessageDigestSpi() { throw new RuntimeException("Stub!"); }
/* 30 */   protected int engineGetDigestLength() { throw new RuntimeException("Stub!"); }
/*    */   protected abstract void engineUpdate(byte paramByte);
/*    */   protected abstract void engineUpdate(byte[] paramArrayOfByte, int paramInt1, int paramInt2);
/* 33 */   protected void engineUpdate(ByteBuffer input) { throw new RuntimeException("Stub!"); }
/*    */   protected abstract byte[] engineDigest();
/* 35 */   protected int engineDigest(byte[] buf, int offset, int len) throws DigestException { throw new RuntimeException("Stub!"); }
/*    */   protected abstract void engineReset();
/* 37 */   public Object clone() throws CloneNotSupportedException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\security\MessageDigestSpi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */