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
/*    */ public class RSAMultiPrimePrivateCrtKeySpec
/*    */   extends RSAPrivateKeySpec
/*    */ {
/*    */   public RSAMultiPrimePrivateCrtKeySpec(BigInteger modulus, BigInteger publicExponent, BigInteger privateExponent, BigInteger primeP, BigInteger primeQ, BigInteger primeExponentP, BigInteger primeExponentQ, BigInteger crtCoefficient, RSAOtherPrimeInfo[] otherPrimeInfo)
/*    */   {
/* 30 */     super((BigInteger)null, (BigInteger)null);throw new RuntimeException("Stub!"); }
/* 31 */   public BigInteger getPublicExponent() { throw new RuntimeException("Stub!"); }
/* 32 */   public BigInteger getPrimeP() { throw new RuntimeException("Stub!"); }
/* 33 */   public BigInteger getPrimeQ() { throw new RuntimeException("Stub!"); }
/* 34 */   public BigInteger getPrimeExponentP() { throw new RuntimeException("Stub!"); }
/* 35 */   public BigInteger getPrimeExponentQ() { throw new RuntimeException("Stub!"); }
/* 36 */   public BigInteger getCrtCoefficient() { throw new RuntimeException("Stub!"); }
/* 37 */   public RSAOtherPrimeInfo[] getOtherPrimeInfo() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\security\spec\RSAMultiPrimePrivateCrtKeySpec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */