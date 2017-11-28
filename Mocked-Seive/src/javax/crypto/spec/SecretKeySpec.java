/*    */ package javax.crypto.spec;
/*    */ 
/*    */ import java.security.spec.KeySpec;
/*    */ import javax.crypto.SecretKey;
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
/*    */ public class SecretKeySpec
/*    */   implements KeySpec, SecretKey
/*    */ {
/* 30 */   public SecretKeySpec(byte[] key, String algorithm) { throw new RuntimeException("Stub!"); }
/* 31 */   public SecretKeySpec(byte[] key, int offset, int len, String algorithm) { throw new RuntimeException("Stub!"); }
/* 32 */   public String getAlgorithm() { throw new RuntimeException("Stub!"); }
/* 33 */   public String getFormat() { throw new RuntimeException("Stub!"); }
/* 34 */   public byte[] getEncoded() { throw new RuntimeException("Stub!"); }
/* 35 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 36 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\javax\crypto\spec\SecretKeySpec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */