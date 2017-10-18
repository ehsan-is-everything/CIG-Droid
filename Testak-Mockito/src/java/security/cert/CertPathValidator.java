/*    */ package java.security.cert;
/*    */ 
/*    */ import java.security.InvalidAlgorithmParameterException;
/*    */ import java.security.NoSuchAlgorithmException;
/*    */ import java.security.NoSuchProviderException;
/*    */ import java.security.Provider;
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
/*    */ public class CertPathValidator
/*    */ {
/* 29 */   protected CertPathValidator(CertPathValidatorSpi validatorSpi, Provider provider, String algorithm) { throw new RuntimeException("Stub!"); }
/* 30 */   public static CertPathValidator getInstance(String algorithm) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
/* 31 */   public static CertPathValidator getInstance(String algorithm, String provider) throws NoSuchAlgorithmException, NoSuchProviderException { throw new RuntimeException("Stub!"); }
/* 32 */   public static CertPathValidator getInstance(String algorithm, Provider provider) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
/* 33 */   public final Provider getProvider() { throw new RuntimeException("Stub!"); }
/* 34 */   public final String getAlgorithm() { throw new RuntimeException("Stub!"); }
/* 35 */   public final CertPathValidatorResult validate(CertPath certPath, CertPathParameters params) throws CertPathValidatorException, InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); }
/* 36 */   public static final String getDefaultType() { throw new RuntimeException("Stub!"); }
/* 37 */   public final CertPathChecker getRevocationChecker() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\security\cert\CertPathValidator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */