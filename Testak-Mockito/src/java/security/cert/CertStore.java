/*    */ package java.security.cert;
/*    */ 
/*    */ import java.security.InvalidAlgorithmParameterException;
/*    */ import java.security.NoSuchAlgorithmException;
/*    */ import java.security.NoSuchProviderException;
/*    */ import java.security.Provider;
/*    */ import java.util.Collection;
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
/*    */ public class CertStore
/*    */ {
/* 29 */   protected CertStore(CertStoreSpi storeSpi, Provider provider, String type, CertStoreParameters params) { throw new RuntimeException("Stub!"); }
/* 30 */   public final Collection<? extends Certificate> getCertificates(CertSelector selector) throws CertStoreException { throw new RuntimeException("Stub!"); }
/* 31 */   public final Collection<? extends CRL> getCRLs(CRLSelector selector) throws CertStoreException { throw new RuntimeException("Stub!"); }
/* 32 */   public static CertStore getInstance(String type, CertStoreParameters params) throws InvalidAlgorithmParameterException, NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
/* 33 */   public static CertStore getInstance(String type, CertStoreParameters params, String provider) throws InvalidAlgorithmParameterException, NoSuchAlgorithmException, NoSuchProviderException { throw new RuntimeException("Stub!"); }
/* 34 */   public static CertStore getInstance(String type, CertStoreParameters params, Provider provider) throws NoSuchAlgorithmException, InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); }
/* 35 */   public final CertStoreParameters getCertStoreParameters() { throw new RuntimeException("Stub!"); }
/* 36 */   public final String getType() { throw new RuntimeException("Stub!"); }
/* 37 */   public final Provider getProvider() { throw new RuntimeException("Stub!"); }
/* 38 */   public static final String getDefaultType() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\security\cert\CertStore.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */