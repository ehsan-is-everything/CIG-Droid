/*    */ package java.security.cert;
/*    */ 
/*    */ import java.io.ObjectStreamException;
/*    */ import java.io.Serializable;
/*    */ import java.security.InvalidKeyException;
/*    */ import java.security.NoSuchAlgorithmException;
/*    */ import java.security.NoSuchProviderException;
/*    */ import java.security.Provider;
/*    */ import java.security.PublicKey;
/*    */ import java.security.SignatureException;
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
/*    */ public abstract class Certificate
/*    */   implements Serializable
/*    */ {
/*    */   protected static class CertificateRep
/*    */     implements Serializable
/*    */   {
/* 33 */     protected CertificateRep(String type, byte[] data) { throw new RuntimeException("Stub!"); }
/* 34 */     protected Object readResolve() throws ObjectStreamException { throw new RuntimeException("Stub!"); } }
/*    */   
/* 36 */   protected Certificate(String type) { throw new RuntimeException("Stub!"); }
/* 37 */   public final String getType() { throw new RuntimeException("Stub!"); }
/* 38 */   public boolean equals(Object other) { throw new RuntimeException("Stub!"); }
/* 39 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/*    */   public abstract byte[] getEncoded() throws CertificateEncodingException;
/*    */   public abstract void verify(PublicKey paramPublicKey) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException;
/*    */   public abstract void verify(PublicKey paramPublicKey, String paramString) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException;
/* 43 */   public void verify(PublicKey key, Provider sigProvider) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, SignatureException { throw new RuntimeException("Stub!"); }
/*    */   public abstract String toString();
/*    */   public abstract PublicKey getPublicKey();
/* 46 */   protected Object writeReplace() throws ObjectStreamException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\security\cert\Certificate.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */