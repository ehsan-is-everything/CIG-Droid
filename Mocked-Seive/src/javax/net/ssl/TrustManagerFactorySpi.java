/*    */ package javax.net.ssl;
/*    */ 
/*    */ import java.security.InvalidAlgorithmParameterException;
/*    */ import java.security.KeyStore;
/*    */ import java.security.KeyStoreException;
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
/*    */ public abstract class TrustManagerFactorySpi
/*    */ {
/*    */   public TrustManagerFactorySpi()
/*    */   {
/* 29 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   protected abstract void engineInit(KeyStore paramKeyStore)
/*    */     throws KeyStoreException;
/*    */   
/*    */   protected abstract void engineInit(ManagerFactoryParameters paramManagerFactoryParameters)
/*    */     throws InvalidAlgorithmParameterException;
/*    */   
/*    */   protected abstract TrustManager[] engineGetTrustManagers();
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\javax\net\ssl\TrustManagerFactorySpi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */