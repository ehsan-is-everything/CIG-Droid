/*    */ package javax.crypto;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.security.AlgorithmParameters;
/*    */ import java.security.InvalidKeyException;
/*    */ import java.security.Key;
/*    */ import java.security.NoSuchAlgorithmException;
/*    */ import java.security.NoSuchProviderException;
/*    */ import java.security.Provider;
/*    */ import java.security.spec.InvalidKeySpecException;
/*    */ import java.security.spec.PKCS8EncodedKeySpec;
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
/*    */ public class EncryptedPrivateKeyInfo
/*    */ {
/* 29 */   public EncryptedPrivateKeyInfo(byte[] encoded)
/* 29 */     throws IOException { throw new RuntimeException("Stub!"); }
/* 30 */   public EncryptedPrivateKeyInfo(String algName, byte[] encryptedData) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
/* 31 */   public EncryptedPrivateKeyInfo(AlgorithmParameters algParams, byte[] encryptedData) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
/* 32 */   public String getAlgName() { throw new RuntimeException("Stub!"); }
/* 33 */   public AlgorithmParameters getAlgParameters() { throw new RuntimeException("Stub!"); }
/* 34 */   public byte[] getEncryptedData() { throw new RuntimeException("Stub!"); }
/* 35 */   public PKCS8EncodedKeySpec getKeySpec(Cipher cipher) throws InvalidKeySpecException { throw new RuntimeException("Stub!"); }
/* 36 */   public PKCS8EncodedKeySpec getKeySpec(Key decryptKey) throws NoSuchAlgorithmException, InvalidKeyException { throw new RuntimeException("Stub!"); }
/* 37 */   public PKCS8EncodedKeySpec getKeySpec(Key decryptKey, String providerName) throws NoSuchProviderException, NoSuchAlgorithmException, InvalidKeyException { throw new RuntimeException("Stub!"); }
/* 38 */   public PKCS8EncodedKeySpec getKeySpec(Key decryptKey, Provider provider) throws NoSuchAlgorithmException, InvalidKeyException { throw new RuntimeException("Stub!"); }
/* 39 */   public byte[] getEncoded() throws IOException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\javax\crypto\EncryptedPrivateKeyInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */