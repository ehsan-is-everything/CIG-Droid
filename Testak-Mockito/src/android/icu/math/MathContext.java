/*    */ package android.icu.math;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class MathContext
/*    */   implements Serializable
/*    */ {
/* 10 */   public MathContext(int setdigits) { throw new RuntimeException("Stub!"); }
/* 11 */   public MathContext(int setdigits, int setform) { throw new RuntimeException("Stub!"); }
/* 12 */   public MathContext(int setdigits, int setform, boolean setlostdigits) { throw new RuntimeException("Stub!"); }
/* 13 */   public MathContext(int setdigits, int setform, boolean setlostdigits, int setroundingmode) { throw new RuntimeException("Stub!"); }
/* 14 */   public int getDigits() { throw new RuntimeException("Stub!"); }
/* 15 */   public int getForm() { throw new RuntimeException("Stub!"); }
/* 16 */   public boolean getLostDigits() { throw new RuntimeException("Stub!"); }
/* 17 */   public int getRoundingMode() { throw new RuntimeException("Stub!"); }
/* 18 */   public String toString() { throw new RuntimeException("Stub!"); }
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
/* 31 */   public static final MathContext DEFAULT = null;
/*    */   public static final int ENGINEERING = 2;
/*    */   public static final int PLAIN = 0;
/*    */   public static final int ROUND_CEILING = 2;
/*    */   public static final int ROUND_DOWN = 1;
/*    */   public static final int ROUND_FLOOR = 3;
/*    */   public static final int ROUND_HALF_DOWN = 5;
/*    */   public static final int ROUND_HALF_EVEN = 6;
/*    */   public static final int ROUND_HALF_UP = 4;
/*    */   public static final int ROUND_UNNECESSARY = 7;
/*    */   public static final int ROUND_UP = 0;
/*    */   public static final int SCIENTIFIC = 1;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\icu\math\MathContext.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */