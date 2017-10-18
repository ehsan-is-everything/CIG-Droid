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
/*    */ public abstract class OutputStream
/*    */   implements Closeable, Flushable
/*    */ {
/* 30 */   public OutputStream() { throw new RuntimeException("Stub!"); }
/*    */   public abstract void write(int paramInt) throws IOException;
/* 32 */   public void write(byte[] b) throws IOException { throw new RuntimeException("Stub!"); }
/* 33 */   public void write(byte[] b, int off, int len) throws IOException { throw new RuntimeException("Stub!"); }
/* 34 */   public void flush() throws IOException { throw new RuntimeException("Stub!"); }
/* 35 */   public void close() throws IOException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\io\OutputStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */