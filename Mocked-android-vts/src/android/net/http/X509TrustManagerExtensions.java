/*    */ package android.net.http;
/*    */ 
/*    */ import java.security.cert.CertificateException;
/*    */ import java.security.cert.X509Certificate;
/*    */ import java.util.List;
/*    */ import javax.net.ssl.X509TrustManager;
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
/*    */ public class X509TrustManagerExtensions
/*    */ {
/* 20 */   public X509TrustManagerExtensions(X509TrustManager tm)
/* 20 */     throws IllegalArgumentException { throw new RuntimeException("Stub!"); }
/* 21 */   public List<X509Certificate> checkServerTrusted(X509Certificate[] chain, String authType, String host) throws CertificateException { throw new RuntimeException("Stub!"); }
/* 22 */   public boolean isUserAddedCertificate(X509Certificate cert) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\net\http\X509TrustManagerExtensions.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */