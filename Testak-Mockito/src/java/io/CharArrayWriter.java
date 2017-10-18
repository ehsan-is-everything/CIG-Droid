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
/*    */ public class CharArrayWriter
/*    */   extends Writer
/*    */ {
/* 30 */   public CharArrayWriter() { throw new RuntimeException("Stub!"); }
/* 31 */   public CharArrayWriter(int initialSize) { throw new RuntimeException("Stub!"); }
/* 32 */   public void write(int c) { throw new RuntimeException("Stub!"); }
/* 33 */   public void write(char[] c, int off, int len) { throw new RuntimeException("Stub!"); }
/* 34 */   public void write(String str, int off, int len) { throw new RuntimeException("Stub!"); }
/* 35 */   public void writeTo(Writer out) throws IOException { throw new RuntimeException("Stub!"); }
/* 36 */   public CharArrayWriter append(CharSequence csq) { throw new RuntimeException("Stub!"); }
/* 37 */   public CharArrayWriter append(CharSequence csq, int start, int end) { throw new RuntimeException("Stub!"); }
/* 38 */   public CharArrayWriter append(char c) { throw new RuntimeException("Stub!"); }
/* 39 */   public void reset() { throw new RuntimeException("Stub!"); }
/* 40 */   public char[] toCharArray() { throw new RuntimeException("Stub!"); }
/* 41 */   public int size() { throw new RuntimeException("Stub!"); }
/* 42 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 43 */   public void flush() { throw new RuntimeException("Stub!"); }
/* 44 */   public void close() { throw new RuntimeException("Stub!"); }
/* 45 */   protected char[] buf = null;
/*    */   protected int count;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\io\CharArrayWriter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */