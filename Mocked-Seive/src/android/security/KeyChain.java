/*    */ package android.security;
/*    */ 
/*    */ import android.app.Activity;
/*    */ 
/*    */ 
/*    */ public final class KeyChain
/*    */ {
/*    */   public static final String ACTION_KEYCHAIN_CHANGED = "android.security.action.KEYCHAIN_CHANGED";
/*    */   public static final String ACTION_KEY_ACCESS_CHANGED = "android.security.action.KEY_ACCESS_CHANGED";
/*    */   @Deprecated
/*    */   public static final String ACTION_STORAGE_CHANGED = "android.security.STORAGE_CHANGED";
/*    */   public static final String ACTION_TRUST_STORE_CHANGED = "android.security.action.TRUST_STORE_CHANGED";
/*    */   public static final String EXTRA_CERTIFICATE = "CERT";
/*    */   public static final String EXTRA_KEY_ACCESSIBLE = "android.security.extra.KEY_ACCESSIBLE";
/*    */   public static final String EXTRA_KEY_ALIAS = "android.security.extra.KEY_ALIAS";
/*    */   public static final String EXTRA_NAME = "name";
/*    */   public static final String EXTRA_PKCS12 = "PKCS12";
/*    */   
/* 19 */   public KeyChain() { throw new RuntimeException("Stub!"); }
/* 20 */   public static android.content.Intent createInstallIntent() { throw new RuntimeException("Stub!"); }
/* 21 */   public static void choosePrivateKeyAlias(Activity activity, KeyChainAliasCallback response, String[] keyTypes, java.security.Principal[] issuers, String host, int port, String alias) { throw new RuntimeException("Stub!"); }
/* 22 */   public static void choosePrivateKeyAlias(Activity activity, KeyChainAliasCallback response, String[] keyTypes, java.security.Principal[] issuers, android.net.Uri uri, String alias) { throw new RuntimeException("Stub!"); }
/* 23 */   public static java.security.PrivateKey getPrivateKey(android.content.Context context, String alias) throws KeyChainException, InterruptedException { throw new RuntimeException("Stub!"); }
/* 24 */   public static java.security.cert.X509Certificate[] getCertificateChain(android.content.Context context, String alias) throws KeyChainException, InterruptedException { throw new RuntimeException("Stub!"); }
/* 25 */   public static boolean isKeyAlgorithmSupported(String algorithm) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 27 */   public static boolean isBoundKeyAlgorithm(String algorithm) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\security\KeyChain.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */