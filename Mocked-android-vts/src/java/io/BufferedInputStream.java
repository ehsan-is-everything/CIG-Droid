/*    */ package java.io;
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
/*    */ public class BufferedInputStream
/*    */   extends FilterInputStream
/*    */ {
/*    */   public BufferedInputStream(InputStream in)
/*    */   {
/* 30 */     super((InputStream)null);throw new RuntimeException("Stub!"); }
/* 31 */   public BufferedInputStream(InputStream in, int size) { super((InputStream)null);throw new RuntimeException("Stub!"); }
/* 32 */   public synchronized int read() throws IOException { throw new RuntimeException("Stub!"); }
/* 33 */   public synchronized int read(byte[] b, int off, int len) throws IOException { throw new RuntimeException("Stub!"); }
/* 34 */   public synchronized long skip(long n) throws IOException { throw new RuntimeException("Stub!"); }
/* 35 */   public synchronized int available() throws IOException { throw new RuntimeException("Stub!"); }
/* 36 */   public synchronized void mark(int readlimit) { throw new RuntimeException("Stub!"); }
/* 37 */   public synchronized void reset() throws IOException { throw new RuntimeException("Stub!"); }
/* 38 */   public boolean markSupported() { throw new RuntimeException("Stub!"); }
/* 39 */   public void close() throws IOException { throw new RuntimeException("Stub!"); }
/* 40 */   protected volatile byte[] buf = null;
/*    */   protected int count;
/*    */   protected int marklimit;
/*    */   protected int markpos;
/*    */   protected int pos;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\io\BufferedInputStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */