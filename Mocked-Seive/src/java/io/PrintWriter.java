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
/*    */ public class PrintWriter
/*    */   extends Writer
/*    */ {
/*    */   protected Writer out;
/*    */   
/* 30 */   public PrintWriter(Writer out) { throw new RuntimeException("Stub!"); }
/* 31 */   public PrintWriter(Writer out, boolean autoFlush) { throw new RuntimeException("Stub!"); }
/* 32 */   public PrintWriter(OutputStream out) { throw new RuntimeException("Stub!"); }
/* 33 */   public PrintWriter(OutputStream out, boolean autoFlush) { throw new RuntimeException("Stub!"); }
/* 34 */   public PrintWriter(String fileName) throws FileNotFoundException { throw new RuntimeException("Stub!"); }
/* 35 */   public PrintWriter(String fileName, String csn) throws FileNotFoundException, UnsupportedEncodingException { throw new RuntimeException("Stub!"); }
/* 36 */   public PrintWriter(File file) throws FileNotFoundException { throw new RuntimeException("Stub!"); }
/* 37 */   public PrintWriter(File file, String csn) throws FileNotFoundException, UnsupportedEncodingException { throw new RuntimeException("Stub!"); }
/* 38 */   public void flush() { throw new RuntimeException("Stub!"); }
/* 39 */   public void close() { throw new RuntimeException("Stub!"); }
/* 40 */   public boolean checkError() { throw new RuntimeException("Stub!"); }
/* 41 */   protected void setError() { throw new RuntimeException("Stub!"); }
/* 42 */   protected void clearError() { throw new RuntimeException("Stub!"); }
/* 43 */   public void write(int c) { throw new RuntimeException("Stub!"); }
/* 44 */   public void write(char[] buf, int off, int len) { throw new RuntimeException("Stub!"); }
/* 45 */   public void write(char[] buf) { throw new RuntimeException("Stub!"); }
/* 46 */   public void write(String s, int off, int len) { throw new RuntimeException("Stub!"); }
/* 47 */   public void write(String s) { throw new RuntimeException("Stub!"); }
/* 48 */   public void print(boolean b) { throw new RuntimeException("Stub!"); }
/* 49 */   public void print(char c) { throw new RuntimeException("Stub!"); }
/* 50 */   public void print(int i) { throw new RuntimeException("Stub!"); }
/* 51 */   public void print(long l) { throw new RuntimeException("Stub!"); }
/* 52 */   public void print(float f) { throw new RuntimeException("Stub!"); }
/* 53 */   public void print(double d) { throw new RuntimeException("Stub!"); }
/* 54 */   public void print(char[] s) { throw new RuntimeException("Stub!"); }
/* 55 */   public void print(String s) { throw new RuntimeException("Stub!"); }
/* 56 */   public void print(Object obj) { throw new RuntimeException("Stub!"); }
/* 57 */   public void println() { throw new RuntimeException("Stub!"); }
/* 58 */   public void println(boolean x) { throw new RuntimeException("Stub!"); }
/* 59 */   public void println(char x) { throw new RuntimeException("Stub!"); }
/* 60 */   public void println(int x) { throw new RuntimeException("Stub!"); }
/* 61 */   public void println(long x) { throw new RuntimeException("Stub!"); }
/* 62 */   public void println(float x) { throw new RuntimeException("Stub!"); }
/* 63 */   public void println(double x) { throw new RuntimeException("Stub!"); }
/* 64 */   public void println(char[] x) { throw new RuntimeException("Stub!"); }
/* 65 */   public void println(String x) { throw new RuntimeException("Stub!"); }
/* 66 */   public void println(Object x) { throw new RuntimeException("Stub!"); }
/* 67 */   public PrintWriter printf(String format, Object... args) { throw new RuntimeException("Stub!"); }
/* 68 */   public PrintWriter printf(Locale l, String format, Object... args) { throw new RuntimeException("Stub!"); }
/* 69 */   public PrintWriter format(String format, Object... args) { throw new RuntimeException("Stub!"); }
/* 70 */   public PrintWriter format(Locale l, String format, Object... args) { throw new RuntimeException("Stub!"); }
/* 71 */   public PrintWriter append(CharSequence csq) { throw new RuntimeException("Stub!"); }
/* 72 */   public PrintWriter append(CharSequence csq, int start, int end) { throw new RuntimeException("Stub!"); }
/* 73 */   public PrintWriter append(char c) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\io\PrintWriter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */