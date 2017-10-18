/*    */ package java.net;
/*    */ 
/*    */ import java.security.Principal;
/*    */ import java.security.cert.Certificate;
/*    */ import java.util.List;
/*    */ import javax.net.ssl.SSLPeerUnverifiedException;
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
/*    */ public abstract class SecureCacheResponse
/*    */   extends CacheResponse
/*    */ {
/*    */   public SecureCacheResponse()
/*    */   {
/* 30 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract String getCipherSuite();
/*    */   
/*    */   public abstract List<Certificate> getLocalCertificateChain();
/*    */   
/*    */   public abstract List<Certificate> getServerCertificateChain()
/*    */     throws SSLPeerUnverifiedException;
/*    */   
/*    */   public abstract Principal getPeerPrincipal()
/*    */     throws SSLPeerUnverifiedException;
/*    */   
/*    */   public abstract Principal getLocalPrincipal();
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\net\SecureCacheResponse.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */