/*    */ package java.security.cert;
/*    */ 
/*    */ import java.util.Date;
/*    */ import java.util.Map;
/*    */ import javax.security.auth.x500.X500Principal;
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
/*    */ public class CertificateRevokedException
/*    */   extends CertificateException
/*    */ {
/* 30 */   public CertificateRevokedException(Date revocationDate, CRLReason reason, X500Principal authority, Map<String, Extension> extensions) { throw new RuntimeException("Stub!"); }
/* 31 */   public Date getRevocationDate() { throw new RuntimeException("Stub!"); }
/* 32 */   public CRLReason getRevocationReason() { throw new RuntimeException("Stub!"); }
/* 33 */   public X500Principal getAuthorityName() { throw new RuntimeException("Stub!"); }
/* 34 */   public Date getInvalidityDate() { throw new RuntimeException("Stub!"); }
/* 35 */   public Map<String, Extension> getExtensions() { throw new RuntimeException("Stub!"); }
/* 36 */   public String getMessage() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\security\cert\CertificateRevokedException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */