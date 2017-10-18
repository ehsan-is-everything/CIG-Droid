/*    */ package java.security;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.Serializable;
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
/*    */ 
/*    */ public final class SignedObject
/*    */   implements Serializable
/*    */ {
/* 30 */   public SignedObject(Serializable object, PrivateKey signingKey, Signature signingEngine)
/* 30 */     throws IOException, InvalidKeyException, SignatureException { throw new RuntimeException("Stub!"); }
/* 31 */   public Object getObject() throws IOException, ClassNotFoundException { throw new RuntimeException("Stub!"); }
/* 32 */   public byte[] getSignature() { throw new RuntimeException("Stub!"); }
/* 33 */   public String getAlgorithm() { throw new RuntimeException("Stub!"); }
/* 34 */   public boolean verify(PublicKey verificationKey, Signature verificationEngine) throws InvalidKeyException, SignatureException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\security\SignedObject.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */