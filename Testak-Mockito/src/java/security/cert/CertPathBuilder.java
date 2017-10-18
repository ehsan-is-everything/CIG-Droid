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
/*    */ public class CertPathBuilder
/*    */ {
/* 29 */   protected CertPathBuilder(CertPathBuilderSpi builderSpi, Provider provider, String algorithm) { throw new RuntimeException("Stub!"); }
/* 30 */   public static CertPathBuilder getInstance(String algorithm) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
/* 31 */   public static CertPathBuilder getInstance(String algorithm, String provider) throws NoSuchAlgorithmException, NoSuchProviderException { throw new RuntimeException("Stub!"); }
/* 32 */   public static CertPathBuilder getInstance(String algorithm, Provider provider) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
/* 33 */   public final Provider getProvider() { throw new RuntimeException("Stub!"); }
/* 34 */   public final String getAlgorithm() { throw new RuntimeException("Stub!"); }
/* 35 */   public final CertPathBuilderResult build(CertPathParameters params) throws CertPathBuilderException, InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); }
/* 36 */   public static final String getDefaultType() { throw new RuntimeException("Stub!"); }
/* 37 */   public final CertPathChecker getRevocationChecker() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\security\cert\CertPathBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */