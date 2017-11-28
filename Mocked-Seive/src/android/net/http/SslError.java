/*    */ package android.net.http;
/*    */ 
/*    */ import java.security.cert.X509Certificate;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SslError
/*    */ {
/*    */   public static final int SSL_DATE_INVALID = 4;
/*    */   public static final int SSL_EXPIRED = 1;
/*    */   public static final int SSL_IDMISMATCH = 2;
/*    */   public static final int SSL_INVALID = 5;
/*    */   @Deprecated
/*    */   public static final int SSL_MAX_ERROR = 6;
/*    */   public static final int SSL_NOTYETVALID = 0;
/*    */   public static final int SSL_UNTRUSTED = 3;
/*    */   
/*    */   @Deprecated
/* 21 */   public SslError(int error, SslCertificate certificate) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 23 */   public SslError(int error, X509Certificate certificate) { throw new RuntimeException("Stub!"); }
/* 24 */   public SslError(int error, SslCertificate certificate, String url) { throw new RuntimeException("Stub!"); }
/* 25 */   public SslError(int error, X509Certificate certificate, String url) { throw new RuntimeException("Stub!"); }
/* 26 */   public SslCertificate getCertificate() { throw new RuntimeException("Stub!"); }
/* 27 */   public String getUrl() { throw new RuntimeException("Stub!"); }
/* 28 */   public boolean addError(int error) { throw new RuntimeException("Stub!"); }
/* 29 */   public boolean hasError(int error) { throw new RuntimeException("Stub!"); }
/* 30 */   public int getPrimaryError() { throw new RuntimeException("Stub!"); }
/* 31 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\net\http\SslError.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */