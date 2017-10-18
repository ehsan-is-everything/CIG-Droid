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
/*    */ public abstract class CertPathBuilderSpi
/*    */ {
/* 29 */   public CertPathBuilderSpi() { throw new RuntimeException("Stub!"); }
/*    */   public abstract CertPathBuilderResult engineBuild(CertPathParameters paramCertPathParameters) throws CertPathBuilderException, InvalidAlgorithmParameterException;
/* 31 */   public CertPathChecker engineGetRevocationChecker() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\security\cert\CertPathBuilderSpi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */