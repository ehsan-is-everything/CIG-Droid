/*    */ package javax.crypto.spec;
/*    */ 
/*    */ import java.security.InvalidKeyException;
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
/*    */ public class DESedeKeySpec
/*    */   implements KeySpec
/*    */ {
/*    */   public static final int DES_EDE_KEY_LEN = 24;
/*    */   
/* 30 */   public DESedeKeySpec(byte[] key)
/* 30 */     throws InvalidKeyException { throw new RuntimeException("Stub!"); }
/* 31 */   public DESedeKeySpec(byte[] key, int offset) throws InvalidKeyException { throw new RuntimeException("Stub!"); }
/* 32 */   public byte[] getKey() { throw new RuntimeException("Stub!"); }
/* 33 */   public static boolean isParityAdjusted(byte[] key, int offset) throws InvalidKeyException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\javax\crypto\spec\DESedeKeySpec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */