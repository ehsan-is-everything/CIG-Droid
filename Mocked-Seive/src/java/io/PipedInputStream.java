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
/*    */ public class PipedInputStream
/*    */   extends InputStream
/*    */ {
/*    */   protected static final int PIPE_SIZE = 1024;
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
/* 31 */   public PipedInputStream(PipedOutputStream src)
/* 31 */     throws IOException { throw new RuntimeException("Stub!"); }
/* 32 */   public PipedInputStream(PipedOutputStream src, int pipeSize) throws IOException { throw new RuntimeException("Stub!"); }
/* 33 */   public PipedInputStream() { throw new RuntimeException("Stub!"); }
/* 34 */   public PipedInputStream(int pipeSize) { throw new RuntimeException("Stub!"); }
/* 35 */   public void connect(PipedOutputStream src) throws IOException { throw new RuntimeException("Stub!"); }
/* 36 */   protected synchronized void receive(int b) throws IOException { throw new RuntimeException("Stub!"); }
/* 37 */   public synchronized int read() throws IOException { throw new RuntimeException("Stub!"); }
/* 38 */   public synchronized int read(byte[] b, int off, int len) throws IOException { throw new RuntimeException("Stub!"); }
/* 39 */   public synchronized int available() throws IOException { throw new RuntimeException("Stub!"); }
/* 40 */   public void close() throws IOException { throw new RuntimeException("Stub!"); }
/*    */   
/* 42 */   protected byte[] buffer = null;
/*    */   protected int in;
/*    */   protected int out;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\io\PipedInputStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */