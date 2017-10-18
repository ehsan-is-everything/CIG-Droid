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
/*    */ public class ByteArrayOutputStream
/*    */   extends OutputStream
/*    */ {
/* 30 */   public ByteArrayOutputStream() { throw new RuntimeException("Stub!"); }
/* 31 */   public ByteArrayOutputStream(int size) { throw new RuntimeException("Stub!"); }
/* 32 */   public synchronized void write(int b) { throw new RuntimeException("Stub!"); }
/* 33 */   public synchronized void write(byte[] b, int off, int len) { throw new RuntimeException("Stub!"); }
/* 34 */   public synchronized void writeTo(OutputStream out) throws IOException { throw new RuntimeException("Stub!"); }
/* 35 */   public synchronized void reset() { throw new RuntimeException("Stub!"); }
/* 36 */   public synchronized byte[] toByteArray() { throw new RuntimeException("Stub!"); }
/* 37 */   public synchronized int size() { throw new RuntimeException("Stub!"); }
/* 38 */   public synchronized String toString() { throw new RuntimeException("Stub!"); }
/* 39 */   public synchronized String toString(String charsetName) throws UnsupportedEncodingException { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 41 */   public synchronized String toString(int hibyte) { throw new RuntimeException("Stub!"); }
/* 42 */   public void close() throws IOException { throw new RuntimeException("Stub!"); }
/* 43 */   protected byte[] buf = null;
/*    */   protected int count;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\io\ByteArrayOutputStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */