/*    */ package java.io;
/*    */ 
/*    */ import java.util.Locale;
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
/*    */ public class PrintStream
/*    */   extends FilterOutputStream
/*    */   implements Appendable, Closeable
/*    */ {
/*    */   public PrintStream(OutputStream out)
/*    */   {
/* 32 */     super((OutputStream)null);throw new RuntimeException("Stub!"); }
/* 33 */   public PrintStream(OutputStream out, boolean autoFlush) { super((OutputStream)null);throw new RuntimeException("Stub!"); }
/* 34 */   public PrintStream(OutputStream out, boolean autoFlush, String encoding) throws UnsupportedEncodingException { super((OutputStream)null);throw new RuntimeException("Stub!"); }
/* 35 */   public PrintStream(String fileName) throws FileNotFoundException { super((OutputStream)null);throw new RuntimeException("Stub!"); }
/* 36 */   public PrintStream(String fileName, String csn) throws FileNotFoundException, UnsupportedEncodingException { super((OutputStream)null);throw new RuntimeException("Stub!"); }
/* 37 */   public PrintStream(File file) throws FileNotFoundException { super((OutputStream)null);throw new RuntimeException("Stub!"); }
/* 38 */   public PrintStream(File file, String csn) throws FileNotFoundException, UnsupportedEncodingException { super((OutputStream)null);throw new RuntimeException("Stub!"); }
/* 39 */   public void flush() { throw new RuntimeException("Stub!"); }
/* 40 */   public void close() { throw new RuntimeException("Stub!"); }
/* 41 */   public boolean checkError() { throw new RuntimeException("Stub!"); }
/* 42 */   protected void setError() { throw new RuntimeException("Stub!"); }
/* 43 */   protected void clearError() { throw new RuntimeException("Stub!"); }
/* 44 */   public void write(int b) { throw new RuntimeException("Stub!"); }
/* 45 */   public void write(byte[] buf, int off, int len) { throw new RuntimeException("Stub!"); }
/* 46 */   public void print(boolean b) { throw new RuntimeException("Stub!"); }
/* 47 */   public void print(char c) { throw new RuntimeException("Stub!"); }
/* 48 */   public void print(int i) { throw new RuntimeException("Stub!"); }
/* 49 */   public void print(long l) { throw new RuntimeException("Stub!"); }
/* 50 */   public void print(float f) { throw new RuntimeException("Stub!"); }
/* 51 */   public void print(double d) { throw new RuntimeException("Stub!"); }
/* 52 */   public void print(char[] s) { throw new RuntimeException("Stub!"); }
/* 53 */   public void print(String s) { throw new RuntimeException("Stub!"); }
/* 54 */   public void print(Object obj) { throw new RuntimeException("Stub!"); }
/* 55 */   public void println() { throw new RuntimeException("Stub!"); }
/* 56 */   public void println(boolean x) { throw new RuntimeException("Stub!"); }
/* 57 */   public void println(char x) { throw new RuntimeException("Stub!"); }
/* 58 */   public void println(int x) { throw new RuntimeException("Stub!"); }
/* 59 */   public void println(long x) { throw new RuntimeException("Stub!"); }
/* 60 */   public void println(float x) { throw new RuntimeException("Stub!"); }
/* 61 */   public void println(double x) { throw new RuntimeException("Stub!"); }
/* 62 */   public void println(char[] x) { throw new RuntimeException("Stub!"); }
/* 63 */   public void println(String x) { throw new RuntimeException("Stub!"); }
/* 64 */   public void println(Object x) { throw new RuntimeException("Stub!"); }
/* 65 */   public PrintStream printf(String format, Object... args) { throw new RuntimeException("Stub!"); }
/* 66 */   public PrintStream printf(Locale l, String format, Object... args) { throw new RuntimeException("Stub!"); }
/* 67 */   public PrintStream format(String format, Object... args) { throw new RuntimeException("Stub!"); }
/* 68 */   public PrintStream format(Locale l, String format, Object... args) { throw new RuntimeException("Stub!"); }
/* 69 */   public PrintStream append(CharSequence csq) { throw new RuntimeException("Stub!"); }
/* 70 */   public PrintStream append(CharSequence csq, int start, int end) { throw new RuntimeException("Stub!"); }
/* 71 */   public PrintStream append(char c) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\io\PrintStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */