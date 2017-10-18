/*    */ package java.security.spec;
/*    */ 
/*    */ import java.math.BigInteger;
/*    */ import java.security.interfaces.DSAParams;
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
/*    */ public class DSAParameterSpec
/*    */   implements AlgorithmParameterSpec, DSAParams
/*    */ {
/* 30 */   public DSAParameterSpec(BigInteger p, BigInteger q, BigInteger g) { throw new RuntimeException("Stub!"); }
/* 31 */   public BigInteger getP() { throw new RuntimeException("Stub!"); }
/* 32 */   public BigInteger getQ() { throw new RuntimeException("Stub!"); }
/* 33 */   public BigInteger getG() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\security\spec\DSAParameterSpec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */