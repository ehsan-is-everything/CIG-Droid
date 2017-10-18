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
/*    */ public class RSAPrivateCrtKeySpec
/*    */   extends RSAPrivateKeySpec
/*    */ {
/*    */   public RSAPrivateCrtKeySpec(BigInteger modulus, BigInteger publicExponent, BigInteger privateExponent, BigInteger primeP, BigInteger primeQ, BigInteger primeExponentP, BigInteger primeExponentQ, BigInteger crtCoefficient)
/*    */   {
/* 30 */     super((BigInteger)null, (BigInteger)null);throw new RuntimeException("Stub!"); }
/* 31 */   public BigInteger getPublicExponent() { throw new RuntimeException("Stub!"); }
/* 32 */   public BigInteger getPrimeP() { throw new RuntimeException("Stub!"); }
/* 33 */   public BigInteger getPrimeQ() { throw new RuntimeException("Stub!"); }
/* 34 */   public BigInteger getPrimeExponentP() { throw new RuntimeException("Stub!"); }
/* 35 */   public BigInteger getPrimeExponentQ() { throw new RuntimeException("Stub!"); }
/* 36 */   public BigInteger getCrtCoefficient() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\security\spec\RSAPrivateCrtKeySpec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */