/*    */ package org.apache.http.conn.ssl;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.security.cert.X509Certificate;
/*    */ import javax.net.ssl.SSLException;
/*    */ import javax.net.ssl.SSLSession;
/*    */ import javax.net.ssl.SSLSocket;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ @Deprecated
/*    */ public abstract class AbstractVerifier
/*    */   implements X509HostnameVerifier
/*    */ {
/* 37 */   public AbstractVerifier() { throw new RuntimeException("Stub!"); }
/* 38 */   public final void verify(String host, SSLSocket ssl) throws IOException { throw new RuntimeException("Stub!"); }
/* 39 */   public final boolean verify(String host, SSLSession session) { throw new RuntimeException("Stub!"); }
/* 40 */   public final void verify(String host, X509Certificate cert) throws SSLException { throw new RuntimeException("Stub!"); }
/* 41 */   public final void verify(String host, String[] cns, String[] subjectAlts, boolean strictWithSubDomains) throws SSLException { throw new RuntimeException("Stub!"); }
/* 42 */   public static boolean acceptableCountryWildcard(String cn) { throw new RuntimeException("Stub!"); }
/* 43 */   public static String[] getCNs(X509Certificate cert) { throw new RuntimeException("Stub!"); }
/* 44 */   public static String[] getDNSSubjectAlts(X509Certificate cert) { throw new RuntimeException("Stub!"); }
/* 45 */   public static int countDots(String s) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\org\apache\http\conn\ssl\AbstractVerifier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */