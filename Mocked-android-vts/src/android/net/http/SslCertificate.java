/*    */ package android.net.http;
/*    */ 
/*    */ import android.os.Bundle;
/*    */ import java.security.cert.X509Certificate;
/*    */ import java.util.Date;
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
/*    */ public class SslCertificate
/*    */ {
/*    */   public class DName
/*    */   {
/* 22 */     public DName(String dName) { throw new RuntimeException("Stub!"); }
/* 23 */     public String getDName() { throw new RuntimeException("Stub!"); }
/* 24 */     public String getCName() { throw new RuntimeException("Stub!"); }
/* 25 */     public String getOName() { throw new RuntimeException("Stub!"); }
/* 26 */     public String getUName() { throw new RuntimeException("Stub!"); } }
/*    */   
/*    */   @Deprecated
/* 29 */   public SslCertificate(String issuedTo, String issuedBy, String validNotBefore, String validNotAfter) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 31 */   public SslCertificate(String issuedTo, String issuedBy, Date validNotBefore, Date validNotAfter) { throw new RuntimeException("Stub!"); }
/* 32 */   public SslCertificate(X509Certificate certificate) { throw new RuntimeException("Stub!"); }
/* 33 */   public static Bundle saveState(SslCertificate certificate) { throw new RuntimeException("Stub!"); }
/* 34 */   public static SslCertificate restoreState(Bundle bundle) { throw new RuntimeException("Stub!"); }
/* 35 */   public Date getValidNotBeforeDate() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 37 */   public String getValidNotBefore() { throw new RuntimeException("Stub!"); }
/* 38 */   public Date getValidNotAfterDate() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 40 */   public String getValidNotAfter() { throw new RuntimeException("Stub!"); }
/* 41 */   public DName getIssuedTo() { throw new RuntimeException("Stub!"); }
/* 42 */   public DName getIssuedBy() { throw new RuntimeException("Stub!"); }
/* 43 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\net\http\SslCertificate.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */