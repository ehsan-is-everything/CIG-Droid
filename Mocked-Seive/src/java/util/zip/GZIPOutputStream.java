/*    */ package java.util.zip;
/*    */ 
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
/*    */ public class GZIPOutputStream
/*    */   extends DeflaterOutputStream
/*    */ {
/*    */   protected CRC32 crc;
/*    */   
/*    */   public GZIPOutputStream(OutputStream out, int size)
/*    */     throws IOException
/*    */   {
/* 30 */     super((OutputStream)null);throw new RuntimeException("Stub!"); }
/* 31 */   public GZIPOutputStream(OutputStream out, int size, boolean syncFlush) throws IOException { super((OutputStream)null);throw new RuntimeException("Stub!"); }
/* 32 */   public GZIPOutputStream(OutputStream out) throws IOException { super((OutputStream)null);throw new RuntimeException("Stub!"); }
/* 33 */   public GZIPOutputStream(OutputStream out, boolean syncFlush) throws IOException { super((OutputStream)null);throw new RuntimeException("Stub!"); }
/* 34 */   public synchronized void write(byte[] buf, int off, int len) throws IOException { throw new RuntimeException("Stub!"); }
/* 35 */   public void finish() throws IOException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\util\zip\GZIPOutputStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */