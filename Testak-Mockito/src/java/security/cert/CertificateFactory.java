/*    */ package java.security.cert;
/*    */ 
/*    */ import java.io.InputStream;
/*    */ import java.security.NoSuchProviderException;
/*    */ import java.security.Provider;
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
/*    */ public class CertificateFactory
/*    */ {
/* 29 */   protected CertificateFactory(CertificateFactorySpi certFacSpi, Provider provider, String type) { throw new RuntimeException("Stub!"); }
/* 30 */   public static final CertificateFactory getInstance(String type) throws CertificateException { throw new RuntimeException("Stub!"); }
/* 31 */   public static final CertificateFactory getInstance(String type, String provider) throws CertificateException, NoSuchProviderException { throw new RuntimeException("Stub!"); }
/* 32 */   public static final CertificateFactory getInstance(String type, Provider provider) throws CertificateException { throw new RuntimeException("Stub!"); }
/* 33 */   public final Provider getProvider() { throw new RuntimeException("Stub!"); }
/* 34 */   public final String getType() { throw new RuntimeException("Stub!"); }
/* 35 */   public final Certificate generateCertificate(InputStream inStream) throws CertificateException { throw new RuntimeException("Stub!"); }
/* 36 */   public final Iterator<String> getCertPathEncodings() { throw new RuntimeException("Stub!"); }
/* 37 */   public final CertPath generateCertPath(InputStream inStream) throws CertificateException { throw new RuntimeException("Stub!"); }
/* 38 */   public final CertPath generateCertPath(InputStream inStream, String encoding) throws CertificateException { throw new RuntimeException("Stub!"); }
/* 39 */   public final CertPath generateCertPath(List<? extends Certificate> certificates) throws CertificateException { throw new RuntimeException("Stub!"); }
/* 40 */   public final Collection<? extends Certificate> generateCertificates(InputStream inStream) throws CertificateException { throw new RuntimeException("Stub!"); }
/* 41 */   public final CRL generateCRL(InputStream inStream) throws CRLException { throw new RuntimeException("Stub!"); }
/* 42 */   public final Collection<? extends CRL> generateCRLs(InputStream inStream) throws CRLException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\security\cert\CertificateFactory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */