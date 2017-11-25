/*    */ package org.apache.http.conn.ssl;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.net.InetAddress;
/*    */ import java.net.Socket;
/*    */ import java.net.UnknownHostException;
/*    */ import java.security.KeyManagementException;
/*    */ import java.security.KeyStore;
/*    */ import java.security.KeyStoreException;
/*    */ import java.security.NoSuchAlgorithmException;
/*    */ import java.security.SecureRandom;
/*    */ import java.security.UnrecoverableKeyException;
/*    */ import org.apache.http.conn.scheme.HostNameResolver;
/*    */ import org.apache.http.conn.scheme.LayeredSocketFactory;
/*    */ import org.apache.http.params.HttpParams;
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
/*    */ @Deprecated
/*    */ public class SSLSocketFactory
/*    */   implements LayeredSocketFactory
/*    */ {
/*    */   public static final String TLS = "TLS";
/*    */   
/* 37 */   public SSLSocketFactory(String algorithm, KeyStore keystore, String keystorePassword, KeyStore truststore, SecureRandom random, HostNameResolver nameResolver)
/* 37 */     throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException { throw new RuntimeException("Stub!"); }
/* 38 */   public SSLSocketFactory(KeyStore keystore, String keystorePassword, KeyStore truststore) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException { throw new RuntimeException("Stub!"); }
/* 39 */   public SSLSocketFactory(KeyStore keystore, String keystorePassword) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException { throw new RuntimeException("Stub!"); }
/* 40 */   public SSLSocketFactory(KeyStore truststore) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException { throw new RuntimeException("Stub!"); }
/* 41 */   public static SSLSocketFactory getSocketFactory() { throw new RuntimeException("Stub!"); }
/* 42 */   public Socket createSocket() throws IOException { throw new RuntimeException("Stub!"); }
/* 43 */   public Socket connectSocket(Socket sock, String host, int port, InetAddress localAddress, int localPort, HttpParams params) throws IOException { throw new RuntimeException("Stub!"); }
/* 44 */   public boolean isSecure(Socket sock) throws IllegalArgumentException { throw new RuntimeException("Stub!"); }
/* 45 */   public Socket createSocket(Socket socket, String host, int port, boolean autoClose) throws IOException, UnknownHostException { throw new RuntimeException("Stub!"); }
/* 46 */   public void setHostnameVerifier(X509HostnameVerifier hostnameVerifier) { throw new RuntimeException("Stub!"); }
/* 47 */   public X509HostnameVerifier getHostnameVerifier() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 54 */   public static final X509HostnameVerifier STRICT_HOSTNAME_VERIFIER = null; public static final String SSLV2 = "SSLv2"; public static final String SSL = "SSL"; public static final X509HostnameVerifier BROWSER_COMPATIBLE_HOSTNAME_VERIFIER = null; public static final X509HostnameVerifier ALLOW_ALL_HOSTNAME_VERIFIER = null;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\org\apache\http\conn\ssl\SSLSocketFactory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */