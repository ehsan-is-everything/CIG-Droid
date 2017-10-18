/*    */ package java.security.cert;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.math.BigInteger;
/*    */ import java.util.Collection;
/*    */ import java.util.Date;
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
/*    */ 
/*    */ 
/*    */ public class X509CRLSelector
/*    */   implements CRLSelector
/*    */ {
/* 30 */   public X509CRLSelector() { throw new RuntimeException("Stub!"); }
/* 31 */   public void setIssuers(Collection<X500Principal> issuers) { throw new RuntimeException("Stub!"); }
/* 32 */   public void setIssuerNames(Collection<?> names) throws IOException { throw new RuntimeException("Stub!"); }
/* 33 */   public void addIssuer(X500Principal issuer) { throw new RuntimeException("Stub!"); }
/* 34 */   public void addIssuerName(String name) throws IOException { throw new RuntimeException("Stub!"); }
/* 35 */   public void addIssuerName(byte[] name) throws IOException { throw new RuntimeException("Stub!"); }
/* 36 */   public void setMinCRLNumber(BigInteger minCRL) { throw new RuntimeException("Stub!"); }
/* 37 */   public void setMaxCRLNumber(BigInteger maxCRL) { throw new RuntimeException("Stub!"); }
/* 38 */   public void setDateAndTime(Date dateAndTime) { throw new RuntimeException("Stub!"); }
/* 39 */   public void setCertificateChecking(X509Certificate cert) { throw new RuntimeException("Stub!"); }
/* 40 */   public Collection<X500Principal> getIssuers() { throw new RuntimeException("Stub!"); }
/* 41 */   public Collection<Object> getIssuerNames() { throw new RuntimeException("Stub!"); }
/* 42 */   public BigInteger getMinCRL() { throw new RuntimeException("Stub!"); }
/* 43 */   public BigInteger getMaxCRL() { throw new RuntimeException("Stub!"); }
/* 44 */   public Date getDateAndTime() { throw new RuntimeException("Stub!"); }
/* 45 */   public X509Certificate getCertificateChecking() { throw new RuntimeException("Stub!"); }
/* 46 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 47 */   public boolean match(CRL crl) { throw new RuntimeException("Stub!"); }
/* 48 */   public Object clone() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\security\cert\X509CRLSelector.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */