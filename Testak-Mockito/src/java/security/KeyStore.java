/*     */ package java.security;
/*     */ 
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.OutputStream;
/*     */ import java.security.cert.Certificate;
/*     */ import java.security.cert.CertificateException;
/*     */ import java.security.spec.AlgorithmParameterSpec;
/*     */ import java.util.Date;
/*     */ import java.util.Enumeration;
/*     */ import java.util.Set;
/*     */ import javax.crypto.SecretKey;
/*     */ import javax.security.auth.DestroyFailedException;
/*     */ import javax.security.auth.Destroyable;
/*     */ import javax.security.auth.callback.CallbackHandler;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class KeyStore
/*     */ {
/*     */   public static abstract interface LoadStoreParameter
/*     */   {
/*     */     public abstract KeyStore.ProtectionParameter getProtectionParameter();
/*     */   }
/*     */   
/*     */   public static abstract interface ProtectionParameter {}
/*     */   
/*     */   public static class PasswordProtection
/*     */     implements KeyStore.ProtectionParameter, Destroyable
/*     */   {
/*  39 */     public PasswordProtection(char[] password) { throw new RuntimeException("Stub!"); }
/*  40 */     public PasswordProtection(char[] password, String protectionAlgorithm, AlgorithmParameterSpec protectionParameters) { throw new RuntimeException("Stub!"); }
/*  41 */     public String getProtectionAlgorithm() { throw new RuntimeException("Stub!"); }
/*  42 */     public AlgorithmParameterSpec getProtectionParameters() { throw new RuntimeException("Stub!"); }
/*  43 */     public synchronized char[] getPassword() { throw new RuntimeException("Stub!"); }
/*  44 */     public synchronized void destroy() throws DestroyFailedException { throw new RuntimeException("Stub!"); }
/*  45 */     public synchronized boolean isDestroyed() { throw new RuntimeException("Stub!"); }
/*     */   }
/*     */   
/*     */   public static class CallbackHandlerProtection
/*     */     implements KeyStore.ProtectionParameter {
/*  50 */     public CallbackHandlerProtection(CallbackHandler handler) { throw new RuntimeException("Stub!"); }
/*  51 */     public CallbackHandler getCallbackHandler() { throw new RuntimeException("Stub!"); }
/*     */   }
/*     */   
/*     */   public static abstract interface Entry {
/*     */     public static abstract interface Attribute { public abstract String getName();
/*     */       
/*     */       public abstract String getValue();
/*     */     }
/*     */     
/*  60 */     public Set<Attribute> getAttributes() { throw new RuntimeException("Stub!"); }
/*     */     
/*     */     
/*     */   }
/*     */   
/*  65 */   public static final class PrivateKeyEntry implements KeyStore.Entry { public PrivateKeyEntry(PrivateKey privateKey, Certificate[] chain) { throw new RuntimeException("Stub!"); }
/*  66 */     public PrivateKeyEntry(PrivateKey privateKey, Certificate[] chain, Set<KeyStore.Entry.Attribute> attributes) { throw new RuntimeException("Stub!"); }
/*  67 */     public PrivateKey getPrivateKey() { throw new RuntimeException("Stub!"); }
/*  68 */     public Certificate[] getCertificateChain() { throw new RuntimeException("Stub!"); }
/*  69 */     public Certificate getCertificate() { throw new RuntimeException("Stub!"); }
/*  70 */     public Set<KeyStore.Entry.Attribute> getAttributes() { throw new RuntimeException("Stub!"); }
/*  71 */     public String toString() { throw new RuntimeException("Stub!"); }
/*     */   }
/*     */   
/*     */   public static final class SecretKeyEntry
/*     */     implements KeyStore.Entry {
/*  76 */     public SecretKeyEntry(SecretKey secretKey) { throw new RuntimeException("Stub!"); }
/*  77 */     public SecretKeyEntry(SecretKey secretKey, Set<KeyStore.Entry.Attribute> attributes) { throw new RuntimeException("Stub!"); }
/*  78 */     public SecretKey getSecretKey() { throw new RuntimeException("Stub!"); }
/*  79 */     public Set<KeyStore.Entry.Attribute> getAttributes() { throw new RuntimeException("Stub!"); }
/*  80 */     public String toString() { throw new RuntimeException("Stub!"); }
/*     */   }
/*     */   
/*     */   public static final class TrustedCertificateEntry
/*     */     implements KeyStore.Entry {
/*  85 */     public TrustedCertificateEntry(Certificate trustedCert) { throw new RuntimeException("Stub!"); }
/*  86 */     public TrustedCertificateEntry(Certificate trustedCert, Set<KeyStore.Entry.Attribute> attributes) { throw new RuntimeException("Stub!"); }
/*  87 */     public Certificate getTrustedCertificate() { throw new RuntimeException("Stub!"); }
/*  88 */     public Set<KeyStore.Entry.Attribute> getAttributes() { throw new RuntimeException("Stub!"); }
/*  89 */     public String toString() { throw new RuntimeException("Stub!"); }
/*     */   }
/*     */   
/*     */   public static abstract class Builder {
/*  93 */     protected Builder() { throw new RuntimeException("Stub!"); }
/*     */     public abstract KeyStore getKeyStore() throws KeyStoreException;
/*     */     public abstract KeyStore.ProtectionParameter getProtectionParameter(String paramString) throws KeyStoreException;
/*  96 */     public static Builder newInstance(KeyStore keyStore, KeyStore.ProtectionParameter protectionParameter) { throw new RuntimeException("Stub!"); }
/*  97 */     public static Builder newInstance(String type, Provider provider, File file, KeyStore.ProtectionParameter protection) { throw new RuntimeException("Stub!"); }
/*  98 */     public static Builder newInstance(String type, Provider provider, KeyStore.ProtectionParameter protection) { throw new RuntimeException("Stub!"); } }
/*     */   
/* 100 */   protected KeyStore(KeyStoreSpi keyStoreSpi, Provider provider, String type) { throw new RuntimeException("Stub!"); }
/* 101 */   public static KeyStore getInstance(String type) throws KeyStoreException { throw new RuntimeException("Stub!"); }
/* 102 */   public static KeyStore getInstance(String type, String provider) throws KeyStoreException, NoSuchProviderException { throw new RuntimeException("Stub!"); }
/* 103 */   public static KeyStore getInstance(String type, Provider provider) throws KeyStoreException { throw new RuntimeException("Stub!"); }
/* 104 */   public static final String getDefaultType() { throw new RuntimeException("Stub!"); }
/* 105 */   public final Provider getProvider() { throw new RuntimeException("Stub!"); }
/* 106 */   public final String getType() { throw new RuntimeException("Stub!"); }
/* 107 */   public final Key getKey(String alias, char[] password) throws KeyStoreException, NoSuchAlgorithmException, UnrecoverableKeyException { throw new RuntimeException("Stub!"); }
/* 108 */   public final Certificate[] getCertificateChain(String alias) throws KeyStoreException { throw new RuntimeException("Stub!"); }
/* 109 */   public final Certificate getCertificate(String alias) throws KeyStoreException { throw new RuntimeException("Stub!"); }
/* 110 */   public final Date getCreationDate(String alias) throws KeyStoreException { throw new RuntimeException("Stub!"); }
/* 111 */   public final void setKeyEntry(String alias, Key key, char[] password, Certificate[] chain) throws KeyStoreException { throw new RuntimeException("Stub!"); }
/* 112 */   public final void setKeyEntry(String alias, byte[] key, Certificate[] chain) throws KeyStoreException { throw new RuntimeException("Stub!"); }
/* 113 */   public final void setCertificateEntry(String alias, Certificate cert) throws KeyStoreException { throw new RuntimeException("Stub!"); }
/* 114 */   public final void deleteEntry(String alias) throws KeyStoreException { throw new RuntimeException("Stub!"); }
/* 115 */   public final Enumeration<String> aliases() throws KeyStoreException { throw new RuntimeException("Stub!"); }
/* 116 */   public final boolean containsAlias(String alias) throws KeyStoreException { throw new RuntimeException("Stub!"); }
/* 117 */   public final int size() throws KeyStoreException { throw new RuntimeException("Stub!"); }
/* 118 */   public final boolean isKeyEntry(String alias) throws KeyStoreException { throw new RuntimeException("Stub!"); }
/* 119 */   public final boolean isCertificateEntry(String alias) throws KeyStoreException { throw new RuntimeException("Stub!"); }
/* 120 */   public final String getCertificateAlias(Certificate cert) throws KeyStoreException { throw new RuntimeException("Stub!"); }
/* 121 */   public final void store(OutputStream stream, char[] password) throws KeyStoreException, IOException, NoSuchAlgorithmException, CertificateException { throw new RuntimeException("Stub!"); }
/* 122 */   public final void store(LoadStoreParameter param) throws KeyStoreException, IOException, NoSuchAlgorithmException, CertificateException { throw new RuntimeException("Stub!"); }
/* 123 */   public final void load(InputStream stream, char[] password) throws IOException, NoSuchAlgorithmException, CertificateException { throw new RuntimeException("Stub!"); }
/* 124 */   public final void load(LoadStoreParameter param) throws IOException, NoSuchAlgorithmException, CertificateException { throw new RuntimeException("Stub!"); }
/* 125 */   public final Entry getEntry(String alias, ProtectionParameter protParam) throws NoSuchAlgorithmException, UnrecoverableEntryException, KeyStoreException { throw new RuntimeException("Stub!"); }
/* 126 */   public final void setEntry(String alias, Entry entry, ProtectionParameter protParam) throws KeyStoreException { throw new RuntimeException("Stub!"); }
/* 127 */   public final boolean entryInstanceOf(String alias, Class<? extends Entry> entryClass) throws KeyStoreException { throw new RuntimeException("Stub!"); }
/*     */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\security\KeyStore.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */