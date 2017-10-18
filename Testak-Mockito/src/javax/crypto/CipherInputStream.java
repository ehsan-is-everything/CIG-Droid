/*    */ package javax.crypto;
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
/*    */ 
/*    */ 
/*    */ public class CipherInputStream
/*    */   extends FilterInputStream
/*    */ {
/*    */   public CipherInputStream(InputStream is, Cipher c)
/*    */   {
/* 30 */     super((InputStream)null);throw new RuntimeException("Stub!"); }
/* 31 */   protected CipherInputStream(InputStream is) { super((InputStream)null);throw new RuntimeException("Stub!"); }
/* 32 */   public int read() throws IOException { throw new RuntimeException("Stub!"); }
/* 33 */   public int read(byte[] b) throws IOException { throw new RuntimeException("Stub!"); }
/* 34 */   public int read(byte[] b, int off, int len) throws IOException { throw new RuntimeException("Stub!"); }
/* 35 */   public long skip(long n) throws IOException { throw new RuntimeException("Stub!"); }
/* 36 */   public int available() throws IOException { throw new RuntimeException("Stub!"); }
/* 37 */   public void close() throws IOException { throw new RuntimeException("Stub!"); }
/* 38 */   public boolean markSupported() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\javax\crypto\CipherInputStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */