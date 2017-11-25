/*    */ package javax.net.ssl;
/*    */ 
/*    */ import java.security.KeyManagementException;
/*    */ import java.security.NoSuchAlgorithmException;
/*    */ import java.security.NoSuchProviderException;
/*    */ import java.security.Provider;
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
/*    */ public class SSLContext
/*    */ {
/* 29 */   protected SSLContext(SSLContextSpi contextSpi, Provider provider, String protocol) { throw new RuntimeException("Stub!"); }
/* 30 */   public static synchronized SSLContext getDefault() throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
/* 31 */   public static synchronized void setDefault(SSLContext context) { throw new RuntimeException("Stub!"); }
/* 32 */   public static SSLContext getInstance(String protocol) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
/* 33 */   public static SSLContext getInstance(String protocol, String provider) throws NoSuchAlgorithmException, NoSuchProviderException { throw new RuntimeException("Stub!"); }
/* 34 */   public static SSLContext getInstance(String protocol, Provider provider) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
/* 35 */   public final String getProtocol() { throw new RuntimeException("Stub!"); }
/* 36 */   public final Provider getProvider() { throw new RuntimeException("Stub!"); }
/* 37 */   public final void init(KeyManager[] km, TrustManager[] tm, SecureRandom random) throws KeyManagementException { throw new RuntimeException("Stub!"); }
/* 38 */   public final SSLSocketFactory getSocketFactory() { throw new RuntimeException("Stub!"); }
/* 39 */   public final SSLServerSocketFactory getServerSocketFactory() { throw new RuntimeException("Stub!"); }
/* 40 */   public final SSLEngine createSSLEngine() { throw new RuntimeException("Stub!"); }
/* 41 */   public final SSLEngine createSSLEngine(String peerHost, int peerPort) { throw new RuntimeException("Stub!"); }
/* 42 */   public final SSLSessionContext getServerSessionContext() { throw new RuntimeException("Stub!"); }
/* 43 */   public final SSLSessionContext getClientSessionContext() { throw new RuntimeException("Stub!"); }
/* 44 */   public final SSLParameters getDefaultSSLParameters() { throw new RuntimeException("Stub!"); }
/* 45 */   public final SSLParameters getSupportedSSLParameters() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\javax\net\ssl\SSLContext.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */