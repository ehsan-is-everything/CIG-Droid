/*    */ package android.webkit;
/*    */ 
/*    */ import java.security.Principal;
/*    */ import java.security.PrivateKey;
/*    */ import java.security.cert.X509Certificate;
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
/*    */ public abstract class ClientCertRequest
/*    */ {
/*    */   public ClientCertRequest()
/*    */   {
/* 20 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract String[] getKeyTypes();
/*    */   
/*    */   public abstract Principal[] getPrincipals();
/*    */   
/*    */   public abstract String getHost();
/*    */   
/*    */   public abstract int getPort();
/*    */   
/*    */   public abstract void proceed(PrivateKey paramPrivateKey, X509Certificate[] paramArrayOfX509Certificate);
/*    */   
/*    */   public abstract void ignore();
/*    */   
/*    */   public abstract void cancel();
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\webkit\ClientCertRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */