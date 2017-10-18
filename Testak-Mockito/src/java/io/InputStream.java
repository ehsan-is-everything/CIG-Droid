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
/*    */ 
/*    */ 
/*    */ public abstract class InputStream
/*    */   implements Closeable
/*    */ {
/* 30 */   public InputStream() { throw new RuntimeException("Stub!"); }
/*    */   public abstract int read() throws IOException;
/* 32 */   public int read(byte[] b) throws IOException { throw new RuntimeException("Stub!"); }
/* 33 */   public int read(byte[] b, int off, int len) throws IOException { throw new RuntimeException("Stub!"); }
/* 34 */   public long skip(long n) throws IOException { throw new RuntimeException("Stub!"); }
/* 35 */   public int available() throws IOException { throw new RuntimeException("Stub!"); }
/* 36 */   public void close() throws IOException { throw new RuntimeException("Stub!"); }
/* 37 */   public synchronized void mark(int readlimit) { throw new RuntimeException("Stub!"); }
/* 38 */   public synchronized void reset() throws IOException { throw new RuntimeException("Stub!"); }
/* 39 */   public boolean markSupported() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\io\InputStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */