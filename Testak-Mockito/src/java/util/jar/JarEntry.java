/*    */ package java.util.jar;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.security.CodeSigner;
/*    */ import java.security.cert.Certificate;
/*    */ import java.util.zip.ZipEntry;
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
/*    */ public class JarEntry
/*    */   extends ZipEntry
/*    */ {
/*    */   public JarEntry(String name)
/*    */   {
/* 30 */     super((ZipEntry)null);throw new RuntimeException("Stub!"); }
/* 31 */   public JarEntry(ZipEntry ze) { super((ZipEntry)null);throw new RuntimeException("Stub!"); }
/* 32 */   public JarEntry(JarEntry je) { super((ZipEntry)null);throw new RuntimeException("Stub!"); }
/* 33 */   public Attributes getAttributes() throws IOException { throw new RuntimeException("Stub!"); }
/* 34 */   public Certificate[] getCertificates() { throw new RuntimeException("Stub!"); }
/* 35 */   public CodeSigner[] getCodeSigners() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\jar\JarEntry.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */