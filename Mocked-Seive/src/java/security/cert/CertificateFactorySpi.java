/*    */ package java.security.cert;
/*    */ 
/*    */ import java.io.InputStream;
/*    */ import java.util.Collection;
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
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
/*    */ public abstract class CertificateFactorySpi
/*    */ {
/* 29 */   public CertificateFactorySpi() { throw new RuntimeException("Stub!"); }
/*    */   public abstract Certificate engineGenerateCertificate(InputStream paramInputStream) throws CertificateException;
/* 31 */   public CertPath engineGenerateCertPath(InputStream inStream) throws CertificateException { throw new RuntimeException("Stub!"); }
/* 32 */   public CertPath engineGenerateCertPath(InputStream inStream, String encoding) throws CertificateException { throw new RuntimeException("Stub!"); }
/* 33 */   public CertPath engineGenerateCertPath(List<? extends Certificate> certificates) throws CertificateException { throw new RuntimeException("Stub!"); }
/* 34 */   public Iterator<String> engineGetCertPathEncodings() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract Collection<? extends Certificate> engineGenerateCertificates(InputStream paramInputStream)
/*    */     throws CertificateException;
/*    */   
/*    */   public abstract CRL engineGenerateCRL(InputStream paramInputStream)
/*    */     throws CRLException;
/*    */   
/*    */   public abstract Collection<? extends CRL> engineGenerateCRLs(InputStream paramInputStream)
/*    */     throws CRLException;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\security\cert\CertificateFactorySpi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */