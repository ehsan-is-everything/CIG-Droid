/*    */ package java.util.jar;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.OutputStream;
/*    */ import java.nio.charset.Charset;
/*    */ import java.util.zip.ZipEntry;
/*    */ import java.util.zip.ZipOutputStream;
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
/*    */ public class JarOutputStream
/*    */   extends ZipOutputStream
/*    */ {
/*    */   public JarOutputStream(OutputStream out, Manifest man)
/*    */     throws IOException
/*    */   {
/* 30 */     super((OutputStream)null, (Charset)null);throw new RuntimeException("Stub!"); }
/* 31 */   public JarOutputStream(OutputStream out) throws IOException { super((OutputStream)null, (Charset)null);throw new RuntimeException("Stub!"); }
/* 32 */   public void putNextEntry(ZipEntry ze) throws IOException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\jar\JarOutputStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */