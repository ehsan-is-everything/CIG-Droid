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
/*    */ 
/*    */ public class DeflaterInputStream
/*    */   extends FilterInputStream
/*    */ {
/*    */   public DeflaterInputStream(InputStream in)
/*    */   {
/* 31 */     super((InputStream)null);throw new RuntimeException("Stub!"); }
/* 32 */   public DeflaterInputStream(InputStream in, Deflater defl) { super((InputStream)null);throw new RuntimeException("Stub!"); }
/* 33 */   public DeflaterInputStream(InputStream in, Deflater defl, int bufLen) { super((InputStream)null);throw new RuntimeException("Stub!"); }
/* 34 */   public void close() throws IOException { throw new RuntimeException("Stub!"); }
/* 35 */   public int read() throws IOException { throw new RuntimeException("Stub!"); }
/* 36 */   public int read(byte[] b, int off, int len) throws IOException { throw new RuntimeException("Stub!"); }
/* 37 */   public long skip(long n) throws IOException { throw new RuntimeException("Stub!"); }
/* 38 */   public int available() throws IOException { throw new RuntimeException("Stub!"); }
/* 39 */   public boolean markSupported() { throw new RuntimeException("Stub!"); }
/* 40 */   public void mark(int limit) { throw new RuntimeException("Stub!"); }
/* 41 */   public void reset() throws IOException { throw new RuntimeException("Stub!"); }
/* 42 */   protected final byte[] buf = null;
/*    */   protected final Deflater def;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\zip\DeflaterInputStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */