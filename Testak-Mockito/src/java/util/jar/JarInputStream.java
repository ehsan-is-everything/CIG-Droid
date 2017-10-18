/*    */ package java.util.jar;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.nio.charset.Charset;
/*    */ import java.util.zip.ZipEntry;
/*    */ import java.util.zip.ZipInputStream;
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
/*    */ public class JarInputStream
/*    */   extends ZipInputStream
/*    */ {
/*    */   public JarInputStream(InputStream in)
/*    */     throws IOException
/*    */   {
/* 30 */     super((InputStream)null, (Charset)null);throw new RuntimeException("Stub!"); }
/* 31 */   public JarInputStream(InputStream in, boolean verify) throws IOException { super((InputStream)null, (Charset)null);throw new RuntimeException("Stub!"); }
/* 32 */   public Manifest getManifest() { throw new RuntimeException("Stub!"); }
/* 33 */   public ZipEntry getNextEntry() throws IOException { throw new RuntimeException("Stub!"); }
/* 34 */   public JarEntry getNextJarEntry() throws IOException { throw new RuntimeException("Stub!"); }
/* 35 */   public int read(byte[] b, int off, int len) throws IOException { throw new RuntimeException("Stub!"); }
/* 36 */   protected ZipEntry createZipEntry(String name) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\jar\JarInputStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */