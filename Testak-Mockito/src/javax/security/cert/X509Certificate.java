/*    */ package javax.security.cert;
/*    */ 
/*    */ import java.io.InputStream;
/*    */ import java.math.BigInteger;
/*    */ import java.security.Principal;
/*    */ import java.util.Date;
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
/*    */ 
/*    */ public abstract class X509Certificate
/*    */   extends Certificate
/*    */ {
/* 32 */   public X509Certificate() { throw new RuntimeException("Stub!"); }
/* 33 */   public static final X509Certificate getInstance(InputStream inStream) throws CertificateException { throw new RuntimeException("Stub!"); }
/* 34 */   public static final X509Certificate getInstance(byte[] certData) throws CertificateException { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract void checkValidity()
/*    */     throws CertificateExpiredException, CertificateNotYetValidException;
/*    */   
/*    */   public abstract void checkValidity(Date paramDate)
/*    */     throws CertificateExpiredException, CertificateNotYetValidException;
/*    */   
/*    */   public abstract int getVersion();
/*    */   
/*    */   public abstract BigInteger getSerialNumber();
/*    */   
/*    */   public abstract Principal getIssuerDN();
/*    */   
/*    */   public abstract Principal getSubjectDN();
/*    */   
/*    */   public abstract Date getNotBefore();
/*    */   
/*    */   public abstract Date getNotAfter();
/*    */   
/*    */   public abstract String getSigAlgName();
/*    */   
/*    */   public abstract String getSigAlgOID();
/*    */   
/*    */   public abstract byte[] getSigAlgParams();
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\javax\security\cert\X509Certificate.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */