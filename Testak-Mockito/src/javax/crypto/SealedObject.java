/*    */ package javax.crypto;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.Serializable;
/*    */ import java.security.InvalidKeyException;
/*    */ import java.security.Key;
/*    */ import java.security.NoSuchAlgorithmException;
/*    */ import java.security.NoSuchProviderException;
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
/*    */ public class SealedObject
/*    */   implements Serializable
/*    */ {
/* 30 */   public SealedObject(Serializable object, Cipher c)
/* 30 */     throws IOException, IllegalBlockSizeException { throw new RuntimeException("Stub!"); }
/* 31 */   protected SealedObject(SealedObject so) { throw new RuntimeException("Stub!"); }
/* 32 */   public final String getAlgorithm() { throw new RuntimeException("Stub!"); }
/* 33 */   public final Object getObject(Key key) throws IOException, ClassNotFoundException, NoSuchAlgorithmException, InvalidKeyException { throw new RuntimeException("Stub!"); }
/* 34 */   public final Object getObject(Cipher c) throws IOException, ClassNotFoundException, IllegalBlockSizeException, BadPaddingException { throw new RuntimeException("Stub!"); }
/* 35 */   public final Object getObject(Key key, String provider) throws IOException, ClassNotFoundException, NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException { throw new RuntimeException("Stub!"); }
/* 36 */   protected byte[] encodedParams = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\javax\crypto\SealedObject.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */