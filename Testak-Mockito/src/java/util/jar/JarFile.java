/*    */ package java.util.jar;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.nio.charset.Charset;
/*    */ import java.util.Enumeration;
/*    */ import java.util.stream.Stream;
/*    */ import java.util.zip.ZipEntry;
/*    */ import java.util.zip.ZipFile;
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
/*    */ public class JarFile
/*    */   extends ZipFile
/*    */ {
/*    */   public static final String MANIFEST_NAME = "META-INF/MANIFEST.MF";
/*    */   
/*    */   public JarFile(String name)
/*    */     throws IOException
/*    */   {
/* 31 */     super((File)null, (Charset)null);throw new RuntimeException("Stub!"); }
/* 32 */   public JarFile(String name, boolean verify) throws IOException { super((File)null, (Charset)null);throw new RuntimeException("Stub!"); }
/* 33 */   public JarFile(File file) throws IOException { super((File)null, (Charset)null);throw new RuntimeException("Stub!"); }
/* 34 */   public JarFile(File file, boolean verify) throws IOException { super((File)null, (Charset)null);throw new RuntimeException("Stub!"); }
/* 35 */   public JarFile(File file, boolean verify, int mode) throws IOException { super((File)null, (Charset)null);throw new RuntimeException("Stub!"); }
/* 36 */   public Manifest getManifest() throws IOException { throw new RuntimeException("Stub!"); }
/* 37 */   public JarEntry getJarEntry(String name) { throw new RuntimeException("Stub!"); }
/* 38 */   public ZipEntry getEntry(String name) { throw new RuntimeException("Stub!"); }
/* 39 */   public Enumeration<JarEntry> entries() { throw new RuntimeException("Stub!"); }
/* 40 */   public Stream<JarEntry> stream() { throw new RuntimeException("Stub!"); }
/* 41 */   public synchronized InputStream getInputStream(ZipEntry ze) throws IOException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\jar\JarFile.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */