/*    */ package java.math;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.Random;
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
/*    */ public class BigInteger
/*    */   extends Number
/*    */   implements Comparable<BigInteger>, Serializable
/*    */ {
/* 23 */   public BigInteger(int numBits, Random random) { throw new RuntimeException("Stub!"); }
/* 24 */   public BigInteger(int bitLength, int certainty, Random random) { throw new RuntimeException("Stub!"); }
/* 25 */   public BigInteger(String value) { throw new RuntimeException("Stub!"); }
/* 26 */   public BigInteger(String value, int radix) { throw new RuntimeException("Stub!"); }
/* 27 */   public BigInteger(int signum, byte[] magnitude) { throw new RuntimeException("Stub!"); }
/* 28 */   public BigInteger(byte[] value) { throw new RuntimeException("Stub!"); }
/* 29 */   public static BigInteger valueOf(long value) { throw new RuntimeException("Stub!"); }
/* 30 */   public byte[] toByteArray() { throw new RuntimeException("Stub!"); }
/* 31 */   public BigInteger abs() { throw new RuntimeException("Stub!"); }
/* 32 */   public BigInteger negate() { throw new RuntimeException("Stub!"); }
/* 33 */   public BigInteger add(BigInteger value) { throw new RuntimeException("Stub!"); }
/* 34 */   public BigInteger subtract(BigInteger value) { throw new RuntimeException("Stub!"); }
/* 35 */   public int signum() { throw new RuntimeException("Stub!"); }
/* 36 */   public BigInteger shiftRight(int n) { throw new RuntimeException("Stub!"); }
/* 37 */   public BigInteger shiftLeft(int n) { throw new RuntimeException("Stub!"); }
/* 38 */   public int bitLength() { throw new RuntimeException("Stub!"); }
/* 39 */   public boolean testBit(int n) { throw new RuntimeException("Stub!"); }
/* 40 */   public BigInteger setBit(int n) { throw new RuntimeException("Stub!"); }
/* 41 */   public BigInteger clearBit(int n) { throw new RuntimeException("Stub!"); }
/* 42 */   public BigInteger flipBit(int n) { throw new RuntimeException("Stub!"); }
/* 43 */   public int getLowestSetBit() { throw new RuntimeException("Stub!"); }
/* 44 */   public int bitCount() { throw new RuntimeException("Stub!"); }
/* 45 */   public BigInteger not() { throw new RuntimeException("Stub!"); }
/* 46 */   public BigInteger and(BigInteger value) { throw new RuntimeException("Stub!"); }
/* 47 */   public BigInteger or(BigInteger value) { throw new RuntimeException("Stub!"); }
/* 48 */   public BigInteger xor(BigInteger value) { throw new RuntimeException("Stub!"); }
/* 49 */   public BigInteger andNot(BigInteger value) { throw new RuntimeException("Stub!"); }
/* 50 */   public int intValue() { throw new RuntimeException("Stub!"); }
/* 51 */   public long longValue() { throw new RuntimeException("Stub!"); }
/* 52 */   public float floatValue() { throw new RuntimeException("Stub!"); }
/* 53 */   public double doubleValue() { throw new RuntimeException("Stub!"); }
/* 54 */   public int compareTo(BigInteger value) { throw new RuntimeException("Stub!"); }
/* 55 */   public BigInteger min(BigInteger value) { throw new RuntimeException("Stub!"); }
/* 56 */   public BigInteger max(BigInteger value) { throw new RuntimeException("Stub!"); }
/* 57 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 58 */   public boolean equals(Object x) { throw new RuntimeException("Stub!"); }
/* 59 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 60 */   public String toString(int radix) { throw new RuntimeException("Stub!"); }
/* 61 */   public BigInteger gcd(BigInteger value) { throw new RuntimeException("Stub!"); }
/* 62 */   public BigInteger multiply(BigInteger value) { throw new RuntimeException("Stub!"); }
/* 63 */   public BigInteger pow(int exp) { throw new RuntimeException("Stub!"); }
/* 64 */   public BigInteger[] divideAndRemainder(BigInteger divisor) { throw new RuntimeException("Stub!"); }
/* 65 */   public BigInteger divide(BigInteger divisor) { throw new RuntimeException("Stub!"); }
/* 66 */   public BigInteger remainder(BigInteger divisor) { throw new RuntimeException("Stub!"); }
/* 67 */   public BigInteger modInverse(BigInteger m) { throw new RuntimeException("Stub!"); }
/* 68 */   public BigInteger modPow(BigInteger exponent, BigInteger modulus) { throw new RuntimeException("Stub!"); }
/* 69 */   public BigInteger mod(BigInteger m) { throw new RuntimeException("Stub!"); }
/* 70 */   public boolean isProbablePrime(int certainty) { throw new RuntimeException("Stub!"); }
/* 71 */   public BigInteger nextProbablePrime() { throw new RuntimeException("Stub!"); }
/* 72 */   public static BigInteger probablePrime(int bitLength, Random random) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/* 76 */   public static final BigInteger ZERO = null; public static final BigInteger TEN = null; public static final BigInteger ONE = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\math\BigInteger.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */