/*    */ package java.io;
/*    */ 
/*    */ import java.nio.CharBuffer;
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
/*    */ public abstract class Reader
/*    */   implements Readable, Closeable
/*    */ {
/*    */   protected Object lock;
/*    */   
/* 30 */   protected Reader() { throw new RuntimeException("Stub!"); }
/* 31 */   protected Reader(Object lock) { throw new RuntimeException("Stub!"); }
/* 32 */   public int read(CharBuffer target) throws IOException { throw new RuntimeException("Stub!"); }
/* 33 */   public int read() throws IOException { throw new RuntimeException("Stub!"); }
/* 34 */   public int read(char[] cbuf) throws IOException { throw new RuntimeException("Stub!"); }
/*    */   public abstract int read(char[] paramArrayOfChar, int paramInt1, int paramInt2) throws IOException;
/* 36 */   public long skip(long n) throws IOException { throw new RuntimeException("Stub!"); }
/* 37 */   public boolean ready() throws IOException { throw new RuntimeException("Stub!"); }
/* 38 */   public boolean markSupported() { throw new RuntimeException("Stub!"); }
/* 39 */   public void mark(int readAheadLimit) throws IOException { throw new RuntimeException("Stub!"); }
/* 40 */   public void reset() throws IOException { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract void close()
/*    */     throws IOException;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\io\Reader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */