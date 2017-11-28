/*    */ package java.security.cert;
/*    */ 
/*    */ import java.math.BigInteger;
/*    */ import java.security.InvalidKeyException;
/*    */ import java.security.NoSuchAlgorithmException;
/*    */ import java.security.NoSuchProviderException;
/*    */ import java.security.Principal;
/*    */ import java.security.Provider;
/*    */ import java.security.PublicKey;
/*    */ import java.security.SignatureException;
/*    */ import java.util.Date;
/*    */ import java.util.Set;
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
/*    */ public abstract class X509CRL
/*    */   extends CRL
/*    */   implements X509Extension
/*    */ {
/*    */   protected X509CRL()
/*    */   {
/* 31 */     super((String)null);throw new RuntimeException("Stub!"); }
/* 32 */   public boolean equals(Object other) { throw new RuntimeException("Stub!"); }
/* 33 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/*    */   public abstract byte[] getEncoded() throws CRLException;
/*    */   public abstract void verify(PublicKey paramPublicKey) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException;
/*    */   public abstract void verify(PublicKey paramPublicKey, String paramString) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException;
/* 37 */   public void verify(PublicKey key, Provider sigProvider) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, SignatureException { throw new RuntimeException("Stub!"); }
/*    */   public abstract int getVersion();
/*    */   public abstract Principal getIssuerDN();
/* 40 */   public X500Principal getIssuerX500Principal() { throw new RuntimeException("Stub!"); }
/*    */   public abstract Date getThisUpdate();
/*    */   public abstract Date getNextUpdate();
/*    */   public abstract X509CRLEntry getRevokedCertificate(BigInteger paramBigInteger);
/* 44 */   public X509CRLEntry getRevokedCertificate(X509Certificate certificate) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract Set<? extends X509CRLEntry> getRevokedCertificates();
/*    */   
/*    */   public abstract byte[] getTBSCertList()
/*    */     throws CRLException;
/*    */   
/*    */   public abstract byte[] getSignature();
/*    */   
/*    */   public abstract String getSigAlgName();
/*    */   
/*    */   public abstract String getSigAlgOID();
/*    */   
/*    */   public abstract byte[] getSigAlgParams();
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\security\cert\X509CRL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */