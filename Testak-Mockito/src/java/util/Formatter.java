/*    */ package java.util;
/*    */ 
/*    */ import java.io.Closeable;
/*    */ import java.io.File;
/*    */ import java.io.FileNotFoundException;
/*    */ import java.io.Flushable;
/*    */ import java.io.IOException;
/*    */ import java.io.OutputStream;
/*    */ import java.io.PrintStream;
/*    */ import java.io.UnsupportedEncodingException;
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
/*    */ public final class Formatter
/*    */   implements Closeable, Flushable
/*    */ {
/*    */   public static enum BigDecimalLayoutForm
/*    */   {
/* 33 */     DECIMAL_FLOAT, 
/* 34 */     SCIENTIFIC;
/*    */     private BigDecimalLayoutForm() {} }
/* 36 */   public Formatter() { throw new RuntimeException("Stub!"); }
/* 37 */   public Formatter(Appendable a) { throw new RuntimeException("Stub!"); }
/* 38 */   public Formatter(Locale l) { throw new RuntimeException("Stub!"); }
/* 39 */   public Formatter(Appendable a, Locale l) { throw new RuntimeException("Stub!"); }
/* 40 */   public Formatter(String fileName) throws FileNotFoundException { throw new RuntimeException("Stub!"); }
/* 41 */   public Formatter(String fileName, String csn) throws FileNotFoundException, UnsupportedEncodingException { throw new RuntimeException("Stub!"); }
/* 42 */   public Formatter(String fileName, String csn, Locale l) throws FileNotFoundException, UnsupportedEncodingException { throw new RuntimeException("Stub!"); }
/* 43 */   public Formatter(File file) throws FileNotFoundException { throw new RuntimeException("Stub!"); }
/* 44 */   public Formatter(File file, String csn) throws FileNotFoundException, UnsupportedEncodingException { throw new RuntimeException("Stub!"); }
/* 45 */   public Formatter(File file, String csn, Locale l) throws FileNotFoundException, UnsupportedEncodingException { throw new RuntimeException("Stub!"); }
/* 46 */   public Formatter(PrintStream ps) { throw new RuntimeException("Stub!"); }
/* 47 */   public Formatter(OutputStream os) { throw new RuntimeException("Stub!"); }
/* 48 */   public Formatter(OutputStream os, String csn) throws UnsupportedEncodingException { throw new RuntimeException("Stub!"); }
/* 49 */   public Formatter(OutputStream os, String csn, Locale l) throws UnsupportedEncodingException { throw new RuntimeException("Stub!"); }
/* 50 */   public Locale locale() { throw new RuntimeException("Stub!"); }
/* 51 */   public Appendable out() { throw new RuntimeException("Stub!"); }
/* 52 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 53 */   public void flush() { throw new RuntimeException("Stub!"); }
/* 54 */   public void close() { throw new RuntimeException("Stub!"); }
/* 55 */   public IOException ioException() { throw new RuntimeException("Stub!"); }
/* 56 */   public Formatter format(String format, Object... args) { throw new RuntimeException("Stub!"); }
/* 57 */   public Formatter format(Locale l, String format, Object... args) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\Formatter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */