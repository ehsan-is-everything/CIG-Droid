/*    */ package javax.net.ssl;
/*    */ 
/*    */ import java.net.HttpURLConnection;
/*    */ import java.net.URL;
/*    */ import java.security.Principal;
/*    */ import java.security.cert.Certificate;
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
/*    */ public abstract class HttpsURLConnection
/*    */   extends HttpURLConnection
/*    */ {
/*    */   protected HostnameVerifier hostnameVerifier;
/*    */   
/*    */   protected HttpsURLConnection(URL url)
/*    */   {
/* 31 */     super((URL)null);throw new RuntimeException("Stub!"); }
/*    */   public abstract String getCipherSuite();
/*    */   public abstract Certificate[] getLocalCertificates();
/*    */   public abstract Certificate[] getServerCertificates() throws SSLPeerUnverifiedException;
/* 35 */   public Principal getPeerPrincipal() throws SSLPeerUnverifiedException { throw new RuntimeException("Stub!"); }
/* 36 */   public Principal getLocalPrincipal() { throw new RuntimeException("Stub!"); }
/* 37 */   public static void setDefaultHostnameVerifier(HostnameVerifier v) { throw new RuntimeException("Stub!"); }
/* 38 */   public static HostnameVerifier getDefaultHostnameVerifier() { throw new RuntimeException("Stub!"); }
/* 39 */   public void setHostnameVerifier(HostnameVerifier v) { throw new RuntimeException("Stub!"); }
/* 40 */   public HostnameVerifier getHostnameVerifier() { throw new RuntimeException("Stub!"); }
/* 41 */   public static void setDefaultSSLSocketFactory(SSLSocketFactory sf) { throw new RuntimeException("Stub!"); }
/* 42 */   public static SSLSocketFactory getDefaultSSLSocketFactory() { throw new RuntimeException("Stub!"); }
/* 43 */   public void setSSLSocketFactory(SSLSocketFactory sf) { throw new RuntimeException("Stub!"); }
/* 44 */   public SSLSocketFactory getSSLSocketFactory() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\javax\net\ssl\HttpsURLConnection.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */