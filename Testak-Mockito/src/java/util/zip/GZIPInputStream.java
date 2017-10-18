/*    */ package java.util.zip;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
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
/*    */ public class GZIPInputStream
/*    */   extends InflaterInputStream
/*    */ {
/*    */   public static final int GZIP_MAGIC = 35615;
/*    */   protected CRC32 crc;
/*    */   protected boolean eos;
/*    */   
/*    */   public GZIPInputStream(InputStream in, int size)
/*    */     throws IOException
/*    */   {
/* 30 */     super((InputStream)null);throw new RuntimeException("Stub!"); }
/* 31 */   public GZIPInputStream(InputStream in) throws IOException { super((InputStream)null);throw new RuntimeException("Stub!"); }
/* 32 */   public int read(byte[] buf, int off, int len) throws IOException { throw new RuntimeException("Stub!"); }
/* 33 */   public void close() throws IOException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\zip\GZIPInputStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */