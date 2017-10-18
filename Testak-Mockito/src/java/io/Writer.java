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
/*    */ public abstract class Writer
/*    */   implements Appendable, Closeable, Flushable
/*    */ {
/*    */   protected Object lock;
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
/* 30 */   protected Writer() { throw new RuntimeException("Stub!"); }
/* 31 */   protected Writer(Object lock) { throw new RuntimeException("Stub!"); }
/* 32 */   public void write(int c) throws IOException { throw new RuntimeException("Stub!"); }
/* 33 */   public void write(char[] cbuf) throws IOException { throw new RuntimeException("Stub!"); }
/*    */   public abstract void write(char[] paramArrayOfChar, int paramInt1, int paramInt2) throws IOException;
/* 35 */   public void write(String str) throws IOException { throw new RuntimeException("Stub!"); }
/* 36 */   public void write(String str, int off, int len) throws IOException { throw new RuntimeException("Stub!"); }
/* 37 */   public Writer append(CharSequence csq) throws IOException { throw new RuntimeException("Stub!"); }
/* 38 */   public Writer append(CharSequence csq, int start, int end) throws IOException { throw new RuntimeException("Stub!"); }
/* 39 */   public Writer append(char c) throws IOException { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract void flush()
/*    */     throws IOException;
/*    */   
/*    */   public abstract void close()
/*    */     throws IOException;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\io\Writer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */