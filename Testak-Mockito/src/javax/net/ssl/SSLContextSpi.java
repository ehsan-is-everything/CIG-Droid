/*    */ package javax.net.ssl;
/*    */ 
/*    */ import java.security.KeyManagementException;
/*    */ import java.security.SecureRandom;
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
/*    */ 
/*    */ public abstract class SSLContextSpi
/*    */ {
/* 29 */   public SSLContextSpi() { throw new RuntimeException("Stub!"); }
/*    */   protected abstract void engineInit(KeyManager[] paramArrayOfKeyManager, TrustManager[] paramArrayOfTrustManager, SecureRandom paramSecureRandom) throws KeyManagementException;
/*    */   protected abstract SSLSocketFactory engineGetSocketFactory();
/*    */   protected abstract SSLServerSocketFactory engineGetServerSocketFactory();
/*    */   protected abstract SSLEngine engineCreateSSLEngine();
/*    */   protected abstract SSLEngine engineCreateSSLEngine(String paramString, int paramInt);
/*    */   protected abstract SSLSessionContext engineGetServerSessionContext();
/*    */   protected abstract SSLSessionContext engineGetClientSessionContext();
/* 37 */   protected SSLParameters engineGetDefaultSSLParameters() { throw new RuntimeException("Stub!"); }
/* 38 */   protected SSLParameters engineGetSupportedSSLParameters() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\javax\net\ssl\SSLContextSpi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */