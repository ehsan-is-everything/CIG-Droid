/*    */ package java.security.cert;
/*    */ 
/*    */ import java.math.BigInteger;
/*    */ import java.security.InvalidKeyException;
/*    */ import java.security.NoSuchAlgorithmException;
/*    */ import java.security.Principal;
/*    */ import java.security.Provider;
/*    */ import java.security.PublicKey;
/*    */ import java.security.SignatureException;
/*    */ import java.util.Collection;
/*    */ import java.util.Date;
/*    */ import java.util.List;
/*    */ import javax.security.auth.x500.X500Principal;
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
/*    */   implements X509Extension
/*    */ {
/*    */   protected X509Certificate()
/*    */   {
/* 31 */     super((String)null);throw new RuntimeException("Stub!"); }
/*    */   public abstract void checkValidity() throws CertificateExpiredException, CertificateNotYetValidException;
/*    */   public abstract void checkValidity(Date paramDate) throws CertificateExpiredException, CertificateNotYetValidException;
/*    */   public abstract int getVersion();
/*    */   public abstract BigInteger getSerialNumber();
/*    */   public abstract Principal getIssuerDN();
/* 37 */   public X500Principal getIssuerX500Principal() { throw new RuntimeException("Stub!"); }
/*    */   public abstract Principal getSubjectDN();
/* 39 */   public X500Principal getSubjectX500Principal() { throw new RuntimeException("Stub!"); }
/*    */   public abstract Date getNotBefore();
/*    */   public abstract Date getNotAfter();
/*    */   public abstract byte[] getTBSCertificate() throws CertificateEncodingException;
/*    */   public abstract byte[] getSignature();
/*    */   public abstract String getSigAlgName();
/*    */   public abstract String getSigAlgOID();
/*    */   public abstract byte[] getSigAlgParams();
/*    */   public abstract boolean[] getIssuerUniqueID();
/*    */   public abstract boolean[] getSubjectUniqueID();
/*    */   public abstract boolean[] getKeyUsage();
/* 50 */   public List<String> getExtendedKeyUsage() throws CertificateParsingException { throw new RuntimeException("Stub!"); }
/*    */   public abstract int getBasicConstraints();
/* 52 */   public Collection<List<?>> getSubjectAlternativeNames() throws CertificateParsingException { throw new RuntimeException("Stub!"); }
/* 53 */   public Collection<List<?>> getIssuerAlternativeNames() throws CertificateParsingException { throw new RuntimeException("Stub!"); }
/* 54 */   public void verify(PublicKey key, Provider sigProvider) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, SignatureException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\security\cert\X509Certificate.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */