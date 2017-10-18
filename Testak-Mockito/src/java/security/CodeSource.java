/*    */ package java.security;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.net.URL;
/*    */ import java.security.cert.Certificate;
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
/*    */ public class CodeSource
/*    */   implements Serializable
/*    */ {
/* 30 */   public CodeSource(URL url, Certificate[] certs) { throw new RuntimeException("Stub!"); }
/* 31 */   public CodeSource(URL url, CodeSigner[] signers) { throw new RuntimeException("Stub!"); }
/* 32 */   public final URL getLocation() { throw new RuntimeException("Stub!"); }
/* 33 */   public final Certificate[] getCertificates() { throw new RuntimeException("Stub!"); }
/* 34 */   public final CodeSigner[] getCodeSigners() { throw new RuntimeException("Stub!"); }
/* 35 */   public boolean implies(CodeSource codesource) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\security\CodeSource.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */