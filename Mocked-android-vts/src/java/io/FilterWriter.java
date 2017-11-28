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
/*    */ public abstract class FilterWriter
/*    */   extends Writer
/*    */ {
/*    */   protected Writer out;
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
/* 30 */   protected FilterWriter(Writer out) { throw new RuntimeException("Stub!"); }
/* 31 */   public void write(int c) throws IOException { throw new RuntimeException("Stub!"); }
/* 32 */   public void write(char[] cbuf, int off, int len) throws IOException { throw new RuntimeException("Stub!"); }
/* 33 */   public void write(String str, int off, int len) throws IOException { throw new RuntimeException("Stub!"); }
/* 34 */   public void flush() throws IOException { throw new RuntimeException("Stub!"); }
/* 35 */   public void close() throws IOException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\io\FilterWriter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */