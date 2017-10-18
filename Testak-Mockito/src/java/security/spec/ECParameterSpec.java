/*    */ package java.security.spec;
/*    */ 
/*    */ import java.math.BigInteger;
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
/*    */ public class ECParameterSpec
/*    */   implements AlgorithmParameterSpec
/*    */ {
/* 30 */   public ECParameterSpec(EllipticCurve curve, ECPoint g, BigInteger n, int h) { throw new RuntimeException("Stub!"); }
/* 31 */   public EllipticCurve getCurve() { throw new RuntimeException("Stub!"); }
/* 32 */   public ECPoint getGenerator() { throw new RuntimeException("Stub!"); }
/* 33 */   public BigInteger getOrder() { throw new RuntimeException("Stub!"); }
/* 34 */   public int getCofactor() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\security\spec\ECParameterSpec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */