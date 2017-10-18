/*    */ package java.util.zip;
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
/*    */ public class CheckedInputStream
/*    */   extends FilterInputStream
/*    */ {
/*    */   public CheckedInputStream(InputStream in, Checksum cksum)
/*    */   {
/* 30 */     super((InputStream)null);throw new RuntimeException("Stub!"); }
/* 31 */   public int read() throws IOException { throw new RuntimeException("Stub!"); }
/* 32 */   public int read(byte[] buf, int off, int len) throws IOException { throw new RuntimeException("Stub!"); }
/* 33 */   public long skip(long n) throws IOException { throw new RuntimeException("Stub!"); }
/* 34 */   public Checksum getChecksum() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\zip\CheckedInputStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */