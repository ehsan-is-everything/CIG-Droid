/*    */ package java.security;
/*    */ 
/*    */ import java.io.FilterOutputStream;
/*    */ import java.io.IOException;
/*    */ import java.io.OutputStream;
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
/*    */ public class DigestOutputStream
/*    */   extends FilterOutputStream
/*    */ {
/*    */   protected MessageDigest digest;
/*    */   
/*    */   public DigestOutputStream(OutputStream stream, MessageDigest digest)
/*    */   {
/* 30 */     super((OutputStream)null);throw new RuntimeException("Stub!"); }
/* 31 */   public MessageDigest getMessageDigest() { throw new RuntimeException("Stub!"); }
/* 32 */   public void setMessageDigest(MessageDigest digest) { throw new RuntimeException("Stub!"); }
/* 33 */   public void write(int b) throws IOException { throw new RuntimeException("Stub!"); }
/* 34 */   public void write(byte[] b, int off, int len) throws IOException { throw new RuntimeException("Stub!"); }
/* 35 */   public void on(boolean on) { throw new RuntimeException("Stub!"); }
/* 36 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\security\DigestOutputStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */