/*    */ package java.security.cert;
/*    */ 
/*    */ import java.security.PublicKey;
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
/*    */ public class PKIXCertPathBuilderResult
/*    */   extends PKIXCertPathValidatorResult
/*    */   implements CertPathBuilderResult
/*    */ {
/*    */   public PKIXCertPathBuilderResult(CertPath certPath, TrustAnchor trustAnchor, PolicyNode policyTree, PublicKey subjectPublicKey)
/*    */   {
/* 31 */     super((TrustAnchor)null, (PolicyNode)null, (PublicKey)null);throw new RuntimeException("Stub!"); }
/* 32 */   public CertPath getCertPath() { throw new RuntimeException("Stub!"); }
/* 33 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\security\cert\PKIXCertPathBuilderResult.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */