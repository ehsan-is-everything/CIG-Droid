/*    */ package java.security.cert;
/*    */ 
/*    */ import java.security.InvalidAlgorithmParameterException;
/*    */ import java.util.Collection;
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
/*    */ public abstract class CertStoreSpi
/*    */ {
/*    */   public CertStoreSpi(CertStoreParameters params)
/*    */     throws InvalidAlgorithmParameterException
/*    */   {
/* 29 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract Collection<? extends Certificate> engineGetCertificates(CertSelector paramCertSelector)
/*    */     throws CertStoreException;
/*    */   
/*    */   public abstract Collection<? extends CRL> engineGetCRLs(CRLSelector paramCRLSelector)
/*    */     throws CertStoreException;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\security\cert\CertStoreSpi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */