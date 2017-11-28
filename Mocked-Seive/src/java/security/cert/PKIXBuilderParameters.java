/*    */ package java.security.cert;
/*    */ 
/*    */ import java.security.InvalidAlgorithmParameterException;
/*    */ import java.security.KeyStore;
/*    */ import java.security.KeyStoreException;
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
/*    */ public class PKIXBuilderParameters
/*    */   extends PKIXParameters
/*    */ {
/*    */   public PKIXBuilderParameters(Set<TrustAnchor> trustAnchors, CertSelector targetConstraints)
/*    */     throws InvalidAlgorithmParameterException
/*    */   {
/* 30 */     super((Set)null);throw new RuntimeException("Stub!"); }
/* 31 */   public PKIXBuilderParameters(KeyStore keystore, CertSelector targetConstraints) throws KeyStoreException, InvalidAlgorithmParameterException { super((KeyStore)null);throw new RuntimeException("Stub!"); }
/* 32 */   public void setMaxPathLength(int maxPathLength) { throw new RuntimeException("Stub!"); }
/* 33 */   public int getMaxPathLength() { throw new RuntimeException("Stub!"); }
/* 34 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\security\cert\PKIXBuilderParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */