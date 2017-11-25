/*    */ package java.security.cert;
/*    */ 
/*    */ import java.util.Collection;
/*    */ import java.util.Set;
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
/*    */ public abstract class PKIXCertPathChecker
/*    */   implements CertPathChecker, Cloneable
/*    */ {
/* 30 */   protected PKIXCertPathChecker() { throw new RuntimeException("Stub!"); }
/*    */   public abstract void init(boolean paramBoolean) throws CertPathValidatorException;
/*    */   public abstract boolean isForwardCheckingSupported();
/*    */   public abstract Set<String> getSupportedExtensions();
/*    */   public abstract void check(Certificate paramCertificate, Collection<String> paramCollection) throws CertPathValidatorException;
/* 35 */   public void check(Certificate cert) throws CertPathValidatorException { throw new RuntimeException("Stub!"); }
/* 36 */   public Object clone() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\security\cert\PKIXCertPathChecker.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */