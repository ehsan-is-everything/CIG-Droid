/*    */ package javax.net.ssl;
/*    */ 
/*    */ import java.security.InvalidAlgorithmParameterException;
/*    */ import java.security.KeyStore;
/*    */ import java.security.KeyStoreException;
/*    */ import java.security.NoSuchAlgorithmException;
/*    */ import java.security.NoSuchProviderException;
/*    */ import java.security.Provider;
/*    */ import java.security.UnrecoverableKeyException;
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
/*    */ public class KeyManagerFactory
/*    */ {
/* 29 */   protected KeyManagerFactory(KeyManagerFactorySpi factorySpi, Provider provider, String algorithm) { throw new RuntimeException("Stub!"); }
/* 30 */   public static final String getDefaultAlgorithm() { throw new RuntimeException("Stub!"); }
/* 31 */   public final String getAlgorithm() { throw new RuntimeException("Stub!"); }
/* 32 */   public static final KeyManagerFactory getInstance(String algorithm) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
/* 33 */   public static final KeyManagerFactory getInstance(String algorithm, String provider) throws NoSuchAlgorithmException, NoSuchProviderException { throw new RuntimeException("Stub!"); }
/* 34 */   public static final KeyManagerFactory getInstance(String algorithm, Provider provider) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
/* 35 */   public final Provider getProvider() { throw new RuntimeException("Stub!"); }
/* 36 */   public final void init(KeyStore ks, char[] password) throws KeyStoreException, NoSuchAlgorithmException, UnrecoverableKeyException { throw new RuntimeException("Stub!"); }
/* 37 */   public final void init(ManagerFactoryParameters spec) throws InvalidAlgorithmParameterException { throw new RuntimeException("Stub!"); }
/* 38 */   public final KeyManager[] getKeyManagers() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\javax\net\ssl\KeyManagerFactory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */