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
/*    */ public class PushbackInputStream
/*    */   extends FilterInputStream
/*    */ {
/*    */   public PushbackInputStream(InputStream in, int size)
/*    */   {
/* 30 */     super((InputStream)null);throw new RuntimeException("Stub!"); }
/* 31 */   public PushbackInputStream(InputStream in) { super((InputStream)null);throw new RuntimeException("Stub!"); }
/* 32 */   public int read() throws IOException { throw new RuntimeException("Stub!"); }
/* 33 */   public int read(byte[] b, int off, int len) throws IOException { throw new RuntimeException("Stub!"); }
/* 34 */   public void unread(int b) throws IOException { throw new RuntimeException("Stub!"); }
/* 35 */   public void unread(byte[] b, int off, int len) throws IOException { throw new RuntimeException("Stub!"); }
/* 36 */   public void unread(byte[] b) throws IOException { throw new RuntimeException("Stub!"); }
/* 37 */   public int available() throws IOException { throw new RuntimeException("Stub!"); }
/* 38 */   public long skip(long n) throws IOException { throw new RuntimeException("Stub!"); }
/* 39 */   public boolean markSupported() { throw new RuntimeException("Stub!"); }
/* 40 */   public synchronized void mark(int readlimit) { throw new RuntimeException("Stub!"); }
/* 41 */   public synchronized void reset() throws IOException { throw new RuntimeException("Stub!"); }
/* 42 */   public synchronized void close() throws IOException { throw new RuntimeException("Stub!"); }
/* 43 */   protected byte[] buf = null;
/*    */   protected int pos;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\io\PushbackInputStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */