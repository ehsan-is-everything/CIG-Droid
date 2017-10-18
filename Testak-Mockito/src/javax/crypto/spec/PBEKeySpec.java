/*    */ package javax.crypto.spec;
/*    */ 
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
/*    */ 
/*    */ public class PBEKeySpec
/*    */   implements KeySpec
/*    */ {
/* 30 */   public PBEKeySpec(char[] password) { throw new RuntimeException("Stub!"); }
/* 31 */   public PBEKeySpec(char[] password, byte[] salt, int iterationCount, int keyLength) { throw new RuntimeException("Stub!"); }
/* 32 */   public PBEKeySpec(char[] password, byte[] salt, int iterationCount) { throw new RuntimeException("Stub!"); }
/* 33 */   public final void clearPassword() { throw new RuntimeException("Stub!"); }
/* 34 */   public final char[] getPassword() { throw new RuntimeException("Stub!"); }
/* 35 */   public final byte[] getSalt() { throw new RuntimeException("Stub!"); }
/* 36 */   public final int getIterationCount() { throw new RuntimeException("Stub!"); }
/* 37 */   public final int getKeyLength() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\javax\crypto\spec\PBEKeySpec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */