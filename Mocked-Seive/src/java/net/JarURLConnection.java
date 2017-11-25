/*    */ package java.net;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.security.cert.Certificate;
/*    */ import java.util.jar.Attributes;
/*    */ import java.util.jar.JarEntry;
/*    */ import java.util.jar.JarFile;
/*    */ import java.util.jar.Manifest;
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
/*    */ public abstract class JarURLConnection
/*    */   extends URLConnection
/*    */ {
/*    */   protected URLConnection jarFileURLConnection;
/*    */   
/*    */   protected JarURLConnection(URL url)
/*    */     throws MalformedURLException
/*    */   {
/* 30 */     super((URL)null);throw new RuntimeException("Stub!"); }
/* 31 */   public URL getJarFileURL() { throw new RuntimeException("Stub!"); }
/* 32 */   public String getEntryName() { throw new RuntimeException("Stub!"); }
/*    */   public abstract JarFile getJarFile() throws IOException;
/* 34 */   public Manifest getManifest() throws IOException { throw new RuntimeException("Stub!"); }
/* 35 */   public JarEntry getJarEntry() throws IOException { throw new RuntimeException("Stub!"); }
/* 36 */   public Attributes getAttributes() throws IOException { throw new RuntimeException("Stub!"); }
/* 37 */   public Attributes getMainAttributes() throws IOException { throw new RuntimeException("Stub!"); }
/* 38 */   public Certificate[] getCertificates() throws IOException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\net\JarURLConnection.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */