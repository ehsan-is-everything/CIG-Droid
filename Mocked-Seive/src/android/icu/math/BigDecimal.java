/*    */ package android.icu.math;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.math.BigInteger;
/*    */ 
/*    */ 
/*    */ public class BigDecimal
/*    */   extends Number
/*    */   implements Serializable, Comparable<BigDecimal>
/*    */ {
/* 11 */   public BigDecimal(java.math.BigDecimal bd) { throw new RuntimeException("Stub!"); }
/* 12 */   public BigDecimal(BigInteger bi) { throw new RuntimeException("Stub!"); }
/* 13 */   public BigDecimal(BigInteger bi, int scale) { throw new RuntimeException("Stub!"); }
/* 14 */   public BigDecimal(char[] inchars) { throw new RuntimeException("Stub!"); }
/* 15 */   public BigDecimal(char[] inchars, int offset, int length) { throw new RuntimeException("Stub!"); }
/* 16 */   public BigDecimal(double num) { throw new RuntimeException("Stub!"); }
/* 17 */   public BigDecimal(int num) { throw new RuntimeException("Stub!"); }
/* 18 */   public BigDecimal(long num) { throw new RuntimeException("Stub!"); }
/* 19 */   public BigDecimal(String string) { throw new RuntimeException("Stub!"); }
/* 20 */   public BigDecimal abs() { throw new RuntimeException("Stub!"); }
/* 21 */   public BigDecimal abs(MathContext set) { throw new RuntimeException("Stub!"); }
/* 22 */   public BigDecimal add(BigDecimal rhs) { throw new RuntimeException("Stub!"); }
/* 23 */   public BigDecimal add(BigDecimal rhs, MathContext set) { throw new RuntimeException("Stub!"); }
/* 24 */   public int compareTo(BigDecimal rhs) { throw new RuntimeException("Stub!"); }
/* 25 */   public int compareTo(BigDecimal rhs, MathContext set) { throw new RuntimeException("Stub!"); }
/* 26 */   public BigDecimal divide(BigDecimal rhs) { throw new RuntimeException("Stub!"); }
/* 27 */   public BigDecimal divide(BigDecimal rhs, int round) { throw new RuntimeException("Stub!"); }
/* 28 */   public BigDecimal divide(BigDecimal rhs, int scale, int round) { throw new RuntimeException("Stub!"); }
/* 29 */   public BigDecimal divide(BigDecimal rhs, MathContext set) { throw new RuntimeException("Stub!"); }
/* 30 */   public BigDecimal divideInteger(BigDecimal rhs) { throw new RuntimeException("Stub!"); }
/* 31 */   public BigDecimal divideInteger(BigDecimal rhs, MathContext set) { throw new RuntimeException("Stub!"); }
/* 32 */   public BigDecimal max(BigDecimal rhs) { throw new RuntimeException("Stub!"); }
/* 33 */   public BigDecimal max(BigDecimal rhs, MathContext set) { throw new RuntimeException("Stub!"); }
/* 34 */   public BigDecimal min(BigDecimal rhs) { throw new RuntimeException("Stub!"); }
/* 35 */   public BigDecimal min(BigDecimal rhs, MathContext set) { throw new RuntimeException("Stub!"); }
/* 36 */   public BigDecimal multiply(BigDecimal rhs) { throw new RuntimeException("Stub!"); }
/* 37 */   public BigDecimal multiply(BigDecimal rhs, MathContext set) { throw new RuntimeException("Stub!"); }
/* 38 */   public BigDecimal negate() { throw new RuntimeException("Stub!"); }
/* 39 */   public BigDecimal negate(MathContext set) { throw new RuntimeException("Stub!"); }
/* 40 */   public BigDecimal plus() { throw new RuntimeException("Stub!"); }
/* 41 */   public BigDecimal plus(MathContext set) { throw new RuntimeException("Stub!"); }
/* 42 */   public BigDecimal pow(BigDecimal rhs) { throw new RuntimeException("Stub!"); }
/* 43 */   public BigDecimal pow(BigDecimal rhs, MathContext set) { throw new RuntimeException("Stub!"); }
/* 44 */   public BigDecimal remainder(BigDecimal rhs) { throw new RuntimeException("Stub!"); }
/* 45 */   public BigDecimal remainder(BigDecimal rhs, MathContext set) { throw new RuntimeException("Stub!"); }
/* 46 */   public BigDecimal subtract(BigDecimal rhs) { throw new RuntimeException("Stub!"); }
/* 47 */   public BigDecimal subtract(BigDecimal rhs, MathContext set) { throw new RuntimeException("Stub!"); }
/* 48 */   public byte byteValueExact() { throw new RuntimeException("Stub!"); }
/* 49 */   public double doubleValue() { throw new RuntimeException("Stub!"); }
/* 50 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 51 */   public float floatValue() { throw new RuntimeException("Stub!"); }
/* 52 */   public String format(int before, int after) { throw new RuntimeException("Stub!"); }
/* 53 */   public String format(int before, int after, int explaces, int exdigits, int exformint, int exround) { throw new RuntimeException("Stub!"); }
/* 54 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 55 */   public int intValue() { throw new RuntimeException("Stub!"); }
/* 56 */   public int intValueExact() { throw new RuntimeException("Stub!"); }
/* 57 */   public long longValue() { throw new RuntimeException("Stub!"); }
/* 58 */   public long longValueExact() { throw new RuntimeException("Stub!"); }
/* 59 */   public BigDecimal movePointLeft(int n) { throw new RuntimeException("Stub!"); }
/* 60 */   public BigDecimal movePointRight(int n) { throw new RuntimeException("Stub!"); }
/* 61 */   public int scale() { throw new RuntimeException("Stub!"); }
/* 62 */   public BigDecimal setScale(int scale) { throw new RuntimeException("Stub!"); }
/* 63 */   public BigDecimal setScale(int scale, int round) { throw new RuntimeException("Stub!"); }
/* 64 */   public short shortValueExact() { throw new RuntimeException("Stub!"); }
/* 65 */   public int signum() { throw new RuntimeException("Stub!"); }
/* 66 */   public java.math.BigDecimal toBigDecimal() { throw new RuntimeException("Stub!"); }
/* 67 */   public BigInteger toBigInteger() { throw new RuntimeException("Stub!"); }
/* 68 */   public BigInteger toBigIntegerExact() { throw new RuntimeException("Stub!"); }
/* 69 */   public char[] toCharArray() { throw new RuntimeException("Stub!"); }
/* 70 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 71 */   public BigInteger unscaledValue() { throw new RuntimeException("Stub!"); }
/* 72 */   public static BigDecimal valueOf(double dub) { throw new RuntimeException("Stub!"); }
/* 73 */   public static BigDecimal valueOf(long lint) { throw new RuntimeException("Stub!"); }
/* 74 */   public static BigDecimal valueOf(long lint, int scale) { throw new RuntimeException("Stub!"); }
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
/* 86 */   public static final BigDecimal ZERO = null; public static final BigDecimal TEN = null; public static final int ROUND_UP = 0; public static final int ROUND_UNNECESSARY = 7; public static final int ROUND_HALF_UP = 4; public static final int ROUND_HALF_EVEN = 6; public static final int ROUND_HALF_DOWN = 5; public static final int ROUND_FLOOR = 3; public static final int ROUND_DOWN = 1; public static final int ROUND_CEILING = 2; public static final BigDecimal ONE = null;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\icu\math\BigDecimal.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */