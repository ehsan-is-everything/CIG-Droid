/*    */ package java.security;
/*    */ 
/*    */ import java.io.FilterInputStream;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
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
/*    */ public class DigestInputStream
/*    */   extends FilterInputStream
/*    */ {
/*    */   protected MessageDigest digest;
/*    */   
/*    */   public DigestInputStream(InputStream stream, MessageDigest digest)
/*    */   {
/* 30 */     super((InputStream)null);throw new RuntimeException("Stub!"); }
/* 31 */   public MessageDigest getMessageDigest() { throw new RuntimeException("Stub!"); }
/* 32 */   public void setMessageDigest(MessageDigest digest) { throw new RuntimeException("Stub!"); }
/* 33 */   public int read() throws IOException { throw new RuntimeException("Stub!"); }
/* 34 */   public int read(byte[] b, int off, int len) throws IOException { throw new RuntimeException("Stub!"); }
/* 35 */   public void on(boolean on) { throw new RuntimeException("Stub!"); }
/* 36 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\security\DigestInputStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */