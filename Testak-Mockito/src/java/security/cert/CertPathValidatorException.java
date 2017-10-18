/*    */ package java.security.cert;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.security.GeneralSecurityException;
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
/*    */ 
/*    */ public class CertPathValidatorException
/*    */   extends GeneralSecurityException
/*    */ {
/*    */   public static enum BasicReason
/*    */     implements CertPathValidatorException.Reason
/*    */   {
/* 37 */     ALGORITHM_CONSTRAINED, 
/* 38 */     EXPIRED, 
/* 39 */     INVALID_SIGNATURE, 
/* 40 */     NOT_YET_VALID, 
/* 41 */     REVOKED, 
/* 42 */     UNDETERMINED_REVOCATION_STATUS, 
/* 43 */     UNSPECIFIED;
/*    */     private BasicReason() {} }
/* 45 */   public CertPathValidatorException() { throw new RuntimeException("Stub!"); }
/* 46 */   public CertPathValidatorException(String msg) { throw new RuntimeException("Stub!"); }
/* 47 */   public CertPathValidatorException(Throwable cause) { throw new RuntimeException("Stub!"); }
/* 48 */   public CertPathValidatorException(String msg, Throwable cause) { throw new RuntimeException("Stub!"); }
/* 49 */   public CertPathValidatorException(String msg, Throwable cause, CertPath certPath, int index) { throw new RuntimeException("Stub!"); }
/* 50 */   public CertPathValidatorException(String msg, Throwable cause, CertPath certPath, int index, Reason reason) { throw new RuntimeException("Stub!"); }
/* 51 */   public CertPath getCertPath() { throw new RuntimeException("Stub!"); }
/* 52 */   public int getIndex() { throw new RuntimeException("Stub!"); }
/* 53 */   public Reason getReason() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface Reason
/*    */     extends Serializable
/*    */   {}
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\security\cert\CertPathValidatorException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */