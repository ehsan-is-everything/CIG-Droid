/*    */ package javax.security.cert;
/*    */ 
/*    */ import java.security.InvalidKeyException;
/*    */ import java.security.NoSuchAlgorithmException;
/*    */ import java.security.NoSuchProviderException;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class Certificate
/*    */ {
/* 30 */   public Certificate() { throw new RuntimeException("Stub!"); }
/* 31 */   public boolean equals(Object other) { throw new RuntimeException("Stub!"); }
/* 32 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract byte[] getEncoded()
/*    */     throws CertificateEncodingException;
/*    */   
/*    */   public abstract void verify(PublicKey paramPublicKey)
/*    */     throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException;
/*    */   
/*    */   public abstract void verify(PublicKey paramPublicKey, String paramString)
/*    */     throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException;
/*    */   
/*    */   public abstract String toString();
/*    */   
/*    */   public abstract PublicKey getPublicKey();
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\javax\security\cert\Certificate.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */