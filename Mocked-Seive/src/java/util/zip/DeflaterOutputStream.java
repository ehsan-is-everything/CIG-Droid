/*    */ package java.util.zip;
/*    */ 
/*    */ import java.io.FilterOutputStream;
/*    */ import java.io.IOException;
/*    */ import java.io.OutputStream;
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
/*    */ public class DeflaterOutputStream
/*    */   extends FilterOutputStream
/*    */ {
/*    */   public DeflaterOutputStream(OutputStream out, Deflater def, int size, boolean syncFlush)
/*    */   {
/* 31 */     super((OutputStream)null);throw new RuntimeException("Stub!"); }
/* 32 */   public DeflaterOutputStream(OutputStream out, Deflater def, int size) { super((OutputStream)null);throw new RuntimeException("Stub!"); }
/* 33 */   public DeflaterOutputStream(OutputStream out, Deflater def, boolean syncFlush) { super((OutputStream)null);throw new RuntimeException("Stub!"); }
/* 34 */   public DeflaterOutputStream(OutputStream out, Deflater def) { super((OutputStream)null);throw new RuntimeException("Stub!"); }
/* 35 */   public DeflaterOutputStream(OutputStream out, boolean syncFlush) { super((OutputStream)null);throw new RuntimeException("Stub!"); }
/* 36 */   public DeflaterOutputStream(OutputStream out) { super((OutputStream)null);throw new RuntimeException("Stub!"); }
/* 37 */   public void write(int b) throws IOException { throw new RuntimeException("Stub!"); }
/* 38 */   public void write(byte[] b, int off, int len) throws IOException { throw new RuntimeException("Stub!"); }
/* 39 */   public void finish() throws IOException { throw new RuntimeException("Stub!"); }
/* 40 */   public void close() throws IOException { throw new RuntimeException("Stub!"); }
/* 41 */   protected void deflate() throws IOException { throw new RuntimeException("Stub!"); }
/* 42 */   public void flush() throws IOException { throw new RuntimeException("Stub!"); }
/* 43 */   protected byte[] buf = null;
/*    */   protected Deflater def;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\util\zip\DeflaterOutputStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */