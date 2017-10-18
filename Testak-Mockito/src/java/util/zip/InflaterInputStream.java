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
/*    */ public class InflaterInputStream
/*    */   extends FilterInputStream
/*    */ {
/*    */   public InflaterInputStream(InputStream in, Inflater inf, int size)
/*    */   {
/* 31 */     super((InputStream)null);throw new RuntimeException("Stub!"); }
/* 32 */   public InflaterInputStream(InputStream in, Inflater inf) { super((InputStream)null);throw new RuntimeException("Stub!"); }
/* 33 */   public InflaterInputStream(InputStream in) { super((InputStream)null);throw new RuntimeException("Stub!"); }
/* 34 */   public int read() throws IOException { throw new RuntimeException("Stub!"); }
/* 35 */   public int read(byte[] b, int off, int len) throws IOException { throw new RuntimeException("Stub!"); }
/* 36 */   public int available() throws IOException { throw new RuntimeException("Stub!"); }
/* 37 */   public long skip(long n) throws IOException { throw new RuntimeException("Stub!"); }
/* 38 */   public void close() throws IOException { throw new RuntimeException("Stub!"); }
/* 39 */   protected void fill() throws IOException { throw new RuntimeException("Stub!"); }
/* 40 */   public boolean markSupported() { throw new RuntimeException("Stub!"); }
/* 41 */   public synchronized void mark(int readlimit) { throw new RuntimeException("Stub!"); }
/* 42 */   public synchronized void reset() throws IOException { throw new RuntimeException("Stub!"); }
/* 43 */   protected byte[] buf = null;
/*    */   protected boolean closed;
/*    */   protected Inflater inf;
/*    */   protected int len;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\zip\InflaterInputStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */