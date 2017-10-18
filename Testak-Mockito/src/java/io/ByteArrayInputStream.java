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
/*    */ public class ByteArrayInputStream
/*    */   extends InputStream
/*    */ {
/* 30 */   public ByteArrayInputStream(byte[] buf) { throw new RuntimeException("Stub!"); }
/* 31 */   public ByteArrayInputStream(byte[] buf, int offset, int length) { throw new RuntimeException("Stub!"); }
/* 32 */   public synchronized int read() { throw new RuntimeException("Stub!"); }
/* 33 */   public synchronized int read(byte[] b, int off, int len) { throw new RuntimeException("Stub!"); }
/* 34 */   public synchronized long skip(long n) { throw new RuntimeException("Stub!"); }
/* 35 */   public synchronized int available() { throw new RuntimeException("Stub!"); }
/* 36 */   public boolean markSupported() { throw new RuntimeException("Stub!"); }
/* 37 */   public void mark(int readAheadLimit) { throw new RuntimeException("Stub!"); }
/* 38 */   public synchronized void reset() { throw new RuntimeException("Stub!"); }
/* 39 */   public void close() throws IOException { throw new RuntimeException("Stub!"); }
/* 40 */   protected byte[] buf = null;
/*    */   protected int count;
/*    */   protected int mark;
/*    */   protected int pos;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\io\ByteArrayInputStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */