/*    */ package java.security;
/*    */ 
/*    */ import java.security.spec.InvalidKeySpecException;
/*    */ import java.security.spec.KeySpec;
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
/*    */ 
/*    */ public class KeyFactory
/*    */ {
/* 29 */   protected KeyFactory(KeyFactorySpi keyFacSpi, Provider provider, String algorithm) { throw new RuntimeException("Stub!"); }
/* 30 */   public static KeyFactory getInstance(String algorithm) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
/* 31 */   public static KeyFactory getInstance(String algorithm, String provider) throws NoSuchAlgorithmException, NoSuchProviderException { throw new RuntimeException("Stub!"); }
/* 32 */   public static KeyFactory getInstance(String algorithm, Provider provider) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
/* 33 */   public final Provider getProvider() { throw new RuntimeException("Stub!"); }
/* 34 */   public final String getAlgorithm() { throw new RuntimeException("Stub!"); }
/* 35 */   public final PublicKey generatePublic(KeySpec keySpec) throws InvalidKeySpecException { throw new RuntimeException("Stub!"); }
/* 36 */   public final PrivateKey generatePrivate(KeySpec keySpec) throws InvalidKeySpecException { throw new RuntimeException("Stub!"); }
/* 37 */   public final <T extends KeySpec> T getKeySpec(Key key, Class<T> keySpec) throws InvalidKeySpecException { throw new RuntimeException("Stub!"); }
/* 38 */   public final Key translateKey(Key key) throws InvalidKeyException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\security\KeyFactory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */