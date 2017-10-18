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
/*    */ public class CharArrayReader
/*    */   extends Reader
/*    */ {
/* 30 */   public CharArrayReader(char[] buf) { throw new RuntimeException("Stub!"); }
/* 31 */   public CharArrayReader(char[] buf, int offset, int length) { throw new RuntimeException("Stub!"); }
/* 32 */   public int read() throws IOException { throw new RuntimeException("Stub!"); }
/* 33 */   public int read(char[] b, int off, int len) throws IOException { throw new RuntimeException("Stub!"); }
/* 34 */   public long skip(long n) throws IOException { throw new RuntimeException("Stub!"); }
/* 35 */   public boolean ready() throws IOException { throw new RuntimeException("Stub!"); }
/* 36 */   public boolean markSupported() { throw new RuntimeException("Stub!"); }
/* 37 */   public void mark(int readAheadLimit) throws IOException { throw new RuntimeException("Stub!"); }
/* 38 */   public void reset() throws IOException { throw new RuntimeException("Stub!"); }
/* 39 */   public void close() { throw new RuntimeException("Stub!"); }
/* 40 */   protected char[] buf = null;
/*    */   protected int count;
/*    */   protected int markedPos;
/*    */   protected int pos;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\io\CharArrayReader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */