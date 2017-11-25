/*    */ package java.security.cert;
/*    */ 
/*    */ import java.net.URI;
/*    */ import java.util.List;
/*    */ import java.util.Map;
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
/*    */ 
/*    */ 
/*    */ public abstract class PKIXRevocationChecker
/*    */   extends PKIXCertPathChecker
/*    */ {
/*    */   public static enum Option
/*    */   {
/* 31 */     NO_FALLBACK, 
/* 32 */     ONLY_END_ENTITY, 
/* 33 */     PREFER_CRLS, 
/* 34 */     SOFT_FAIL;
/*    */     private Option() {} }
/* 36 */   protected PKIXRevocationChecker() { throw new RuntimeException("Stub!"); }
/* 37 */   public void setOcspResponder(URI uri) { throw new RuntimeException("Stub!"); }
/* 38 */   public URI getOcspResponder() { throw new RuntimeException("Stub!"); }
/* 39 */   public void setOcspResponderCert(X509Certificate cert) { throw new RuntimeException("Stub!"); }
/* 40 */   public X509Certificate getOcspResponderCert() { throw new RuntimeException("Stub!"); }
/* 41 */   public void setOcspExtensions(List<Extension> extensions) { throw new RuntimeException("Stub!"); }
/* 42 */   public List<Extension> getOcspExtensions() { throw new RuntimeException("Stub!"); }
/* 43 */   public void setOcspResponses(Map<X509Certificate, byte[]> responses) { throw new RuntimeException("Stub!"); }
/* 44 */   public Map<X509Certificate, byte[]> getOcspResponses() { throw new RuntimeException("Stub!"); }
/* 45 */   public void setOptions(Set<Option> options) { throw new RuntimeException("Stub!"); }
/* 46 */   public Set<Option> getOptions() { throw new RuntimeException("Stub!"); }
/*    */   public abstract List<CertPathValidatorException> getSoftFailExceptions();
/* 48 */   public PKIXRevocationChecker clone() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\security\cert\PKIXRevocationChecker.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */