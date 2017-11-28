/*    */ package java.security.cert;
/*    */ 
/*    */ import java.security.InvalidAlgorithmParameterException;
/*    */ import java.security.KeyStore;
/*    */ import java.security.KeyStoreException;
/*    */ import java.util.Date;
/*    */ import java.util.List;
/*    */ import java.util.Set;
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
/*    */ public class PKIXParameters
/*    */   implements CertPathParameters
/*    */ {
/* 30 */   public PKIXParameters(Set<TrustAnchor> trustAnchors)
/* 30 */     throws InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); }
/* 31 */   public PKIXParameters(KeyStore keystore) throws KeyStoreException, InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); }
/* 32 */   public Set<TrustAnchor> getTrustAnchors() { throw new RuntimeException("Stub!"); }
/* 33 */   public void setTrustAnchors(Set<TrustAnchor> trustAnchors) throws InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); }
/* 34 */   public Set<String> getInitialPolicies() { throw new RuntimeException("Stub!"); }
/* 35 */   public void setInitialPolicies(Set<String> initialPolicies) { throw new RuntimeException("Stub!"); }
/* 36 */   public void setCertStores(List<CertStore> stores) { throw new RuntimeException("Stub!"); }
/* 37 */   public void addCertStore(CertStore store) { throw new RuntimeException("Stub!"); }
/* 38 */   public List<CertStore> getCertStores() { throw new RuntimeException("Stub!"); }
/* 39 */   public void setRevocationEnabled(boolean val) { throw new RuntimeException("Stub!"); }
/* 40 */   public boolean isRevocationEnabled() { throw new RuntimeException("Stub!"); }
/* 41 */   public void setExplicitPolicyRequired(boolean val) { throw new RuntimeException("Stub!"); }
/* 42 */   public boolean isExplicitPolicyRequired() { throw new RuntimeException("Stub!"); }
/* 43 */   public void setPolicyMappingInhibited(boolean val) { throw new RuntimeException("Stub!"); }
/* 44 */   public boolean isPolicyMappingInhibited() { throw new RuntimeException("Stub!"); }
/* 45 */   public void setAnyPolicyInhibited(boolean val) { throw new RuntimeException("Stub!"); }
/* 46 */   public boolean isAnyPolicyInhibited() { throw new RuntimeException("Stub!"); }
/* 47 */   public void setPolicyQualifiersRejected(boolean qualifiersRejected) { throw new RuntimeException("Stub!"); }
/* 48 */   public boolean getPolicyQualifiersRejected() { throw new RuntimeException("Stub!"); }
/* 49 */   public Date getDate() { throw new RuntimeException("Stub!"); }
/* 50 */   public void setDate(Date date) { throw new RuntimeException("Stub!"); }
/* 51 */   public void setCertPathCheckers(List<PKIXCertPathChecker> checkers) { throw new RuntimeException("Stub!"); }
/* 52 */   public List<PKIXCertPathChecker> getCertPathCheckers() { throw new RuntimeException("Stub!"); }
/* 53 */   public void addCertPathChecker(PKIXCertPathChecker checker) { throw new RuntimeException("Stub!"); }
/* 54 */   public String getSigProvider() { throw new RuntimeException("Stub!"); }
/* 55 */   public void setSigProvider(String sigProvider) { throw new RuntimeException("Stub!"); }
/* 56 */   public CertSelector getTargetCertConstraints() { throw new RuntimeException("Stub!"); }
/* 57 */   public void setTargetCertConstraints(CertSelector selector) { throw new RuntimeException("Stub!"); }
/* 58 */   public Object clone() { throw new RuntimeException("Stub!"); }
/* 59 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\security\cert\PKIXParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */