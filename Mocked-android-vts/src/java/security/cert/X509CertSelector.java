/*    */ package java.security.cert;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.math.BigInteger;
/*    */ import java.security.PublicKey;
/*    */ import java.util.Collection;
/*    */ import java.util.Date;
/*    */ import java.util.List;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class X509CertSelector
/*    */   implements CertSelector
/*    */ {
/* 31 */   public X509CertSelector() { throw new RuntimeException("Stub!"); }
/* 32 */   public void setCertificate(X509Certificate cert) { throw new RuntimeException("Stub!"); }
/* 33 */   public void setSerialNumber(BigInteger serial) { throw new RuntimeException("Stub!"); }
/* 34 */   public void setIssuer(X500Principal issuer) { throw new RuntimeException("Stub!"); }
/* 35 */   public void setIssuer(String issuerDN) throws IOException { throw new RuntimeException("Stub!"); }
/* 36 */   public void setIssuer(byte[] issuerDN) throws IOException { throw new RuntimeException("Stub!"); }
/* 37 */   public void setSubject(X500Principal subject) { throw new RuntimeException("Stub!"); }
/* 38 */   public void setSubject(String subjectDN) throws IOException { throw new RuntimeException("Stub!"); }
/* 39 */   public void setSubject(byte[] subjectDN) throws IOException { throw new RuntimeException("Stub!"); }
/* 40 */   public void setSubjectKeyIdentifier(byte[] subjectKeyID) { throw new RuntimeException("Stub!"); }
/* 41 */   public void setAuthorityKeyIdentifier(byte[] authorityKeyID) { throw new RuntimeException("Stub!"); }
/* 42 */   public void setCertificateValid(Date certValid) { throw new RuntimeException("Stub!"); }
/* 43 */   public void setPrivateKeyValid(Date privateKeyValid) { throw new RuntimeException("Stub!"); }
/* 44 */   public void setSubjectPublicKeyAlgID(String oid) throws IOException { throw new RuntimeException("Stub!"); }
/* 45 */   public void setSubjectPublicKey(PublicKey key) { throw new RuntimeException("Stub!"); }
/* 46 */   public void setSubjectPublicKey(byte[] key) throws IOException { throw new RuntimeException("Stub!"); }
/* 47 */   public void setKeyUsage(boolean[] keyUsage) { throw new RuntimeException("Stub!"); }
/* 48 */   public void setExtendedKeyUsage(Set<String> keyPurposeSet) throws IOException { throw new RuntimeException("Stub!"); }
/* 49 */   public void setMatchAllSubjectAltNames(boolean matchAllNames) { throw new RuntimeException("Stub!"); }
/* 50 */   public void setSubjectAlternativeNames(Collection<List<?>> names) throws IOException { throw new RuntimeException("Stub!"); }
/* 51 */   public void addSubjectAlternativeName(int type, String name) throws IOException { throw new RuntimeException("Stub!"); }
/* 52 */   public void addSubjectAlternativeName(int type, byte[] name) throws IOException { throw new RuntimeException("Stub!"); }
/* 53 */   public void setNameConstraints(byte[] bytes) throws IOException { throw new RuntimeException("Stub!"); }
/* 54 */   public void setBasicConstraints(int minMaxPathLen) { throw new RuntimeException("Stub!"); }
/* 55 */   public void setPolicy(Set<String> certPolicySet) throws IOException { throw new RuntimeException("Stub!"); }
/* 56 */   public void setPathToNames(Collection<List<?>> names) throws IOException { throw new RuntimeException("Stub!"); }
/* 57 */   public void addPathToName(int type, String name) throws IOException { throw new RuntimeException("Stub!"); }
/* 58 */   public void addPathToName(int type, byte[] name) throws IOException { throw new RuntimeException("Stub!"); }
/* 59 */   public X509Certificate getCertificate() { throw new RuntimeException("Stub!"); }
/* 60 */   public BigInteger getSerialNumber() { throw new RuntimeException("Stub!"); }
/* 61 */   public X500Principal getIssuer() { throw new RuntimeException("Stub!"); }
/* 62 */   public String getIssuerAsString() { throw new RuntimeException("Stub!"); }
/* 63 */   public byte[] getIssuerAsBytes() throws IOException { throw new RuntimeException("Stub!"); }
/* 64 */   public X500Principal getSubject() { throw new RuntimeException("Stub!"); }
/* 65 */   public String getSubjectAsString() { throw new RuntimeException("Stub!"); }
/* 66 */   public byte[] getSubjectAsBytes() throws IOException { throw new RuntimeException("Stub!"); }
/* 67 */   public byte[] getSubjectKeyIdentifier() { throw new RuntimeException("Stub!"); }
/* 68 */   public byte[] getAuthorityKeyIdentifier() { throw new RuntimeException("Stub!"); }
/* 69 */   public Date getCertificateValid() { throw new RuntimeException("Stub!"); }
/* 70 */   public Date getPrivateKeyValid() { throw new RuntimeException("Stub!"); }
/* 71 */   public String getSubjectPublicKeyAlgID() { throw new RuntimeException("Stub!"); }
/* 72 */   public PublicKey getSubjectPublicKey() { throw new RuntimeException("Stub!"); }
/* 73 */   public boolean[] getKeyUsage() { throw new RuntimeException("Stub!"); }
/* 74 */   public Set<String> getExtendedKeyUsage() { throw new RuntimeException("Stub!"); }
/* 75 */   public boolean getMatchAllSubjectAltNames() { throw new RuntimeException("Stub!"); }
/* 76 */   public Collection<List<?>> getSubjectAlternativeNames() { throw new RuntimeException("Stub!"); }
/* 77 */   public byte[] getNameConstraints() { throw new RuntimeException("Stub!"); }
/* 78 */   public int getBasicConstraints() { throw new RuntimeException("Stub!"); }
/* 79 */   public Set<String> getPolicy() { throw new RuntimeException("Stub!"); }
/* 80 */   public Collection<List<?>> getPathToNames() { throw new RuntimeException("Stub!"); }
/* 81 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 82 */   public boolean match(Certificate cert) { throw new RuntimeException("Stub!"); }
/* 83 */   public Object clone() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\security\cert\X509CertSelector.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */