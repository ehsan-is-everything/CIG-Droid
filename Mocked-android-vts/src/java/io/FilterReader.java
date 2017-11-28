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
/*    */ public abstract class FilterReader
/*    */   extends Reader
/*    */ {
/*    */   protected Reader in;
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
/* 30 */   protected FilterReader(Reader in) { throw new RuntimeException("Stub!"); }
/* 31 */   public int read() throws IOException { throw new RuntimeException("Stub!"); }
/* 32 */   public int read(char[] cbuf, int off, int len) throws IOException { throw new RuntimeException("Stub!"); }
/* 33 */   public long skip(long n) throws IOException { throw new RuntimeException("Stub!"); }
/* 34 */   public boolean ready() throws IOException { throw new RuntimeException("Stub!"); }
/* 35 */   public boolean markSupported() { throw new RuntimeException("Stub!"); }
/* 36 */   public void mark(int readAheadLimit) throws IOException { throw new RuntimeException("Stub!"); }
/* 37 */   public void reset() throws IOException { throw new RuntimeException("Stub!"); }
/* 38 */   public void close() throws IOException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\io\FilterReader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */