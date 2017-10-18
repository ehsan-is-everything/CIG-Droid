/*    */ package java.security.cert;
/*    */ 
/*    */ import java.security.InvalidAlgorithmParameterException;
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
/*    */ public abstract class CertPathValidatorSpi
/*    */ {
/* 29 */   public CertPathValidatorSpi() { throw new RuntimeException("Stub!"); }
/*    */   public abstract CertPathValidatorResult engineValidate(CertPath paramCertPath, CertPathParameters paramCertPathParameters) throws CertPathValidatorException, InvalidAlgorithmParameterException;
/* 31 */   public CertPathChecker engineGetRevocationChecker() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\security\cert\CertPathValidatorSpi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */