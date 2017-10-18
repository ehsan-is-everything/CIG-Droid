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
/*    */ public class BufferedOutputStream
/*    */   extends FilterOutputStream
/*    */ {
/*    */   public BufferedOutputStream(OutputStream out)
/*    */   {
/* 30 */     super((OutputStream)null);throw new RuntimeException("Stub!"); }
/* 31 */   public BufferedOutputStream(OutputStream out, int size) { super((OutputStream)null);throw new RuntimeException("Stub!"); }
/* 32 */   public synchronized void write(int b) throws IOException { throw new RuntimeException("Stub!"); }
/* 33 */   public synchronized void write(byte[] b, int off, int len) throws IOException { throw new RuntimeException("Stub!"); }
/* 34 */   public synchronized void flush() throws IOException { throw new RuntimeException("Stub!"); }
/* 35 */   protected byte[] buf = null;
/*    */   protected int count;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\io\BufferedOutputStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */