/*    */ package android.util;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class TypedValue
/*    */ {
/*    */   public static final int COMPLEX_MANTISSA_MASK = 16777215;
/*    */   
/*    */   public static final int COMPLEX_MANTISSA_SHIFT = 8;
/*    */   public static final int COMPLEX_RADIX_0p23 = 3;
/*    */   public static final int COMPLEX_RADIX_16p7 = 1;
/*    */   public static final int COMPLEX_RADIX_23p0 = 0;
/*    */   public static final int COMPLEX_RADIX_8p15 = 2;
/*    */   public static final int COMPLEX_RADIX_MASK = 3;
/*    */   public static final int COMPLEX_RADIX_SHIFT = 4;
/*    */   public static final int COMPLEX_UNIT_DIP = 1;
/*    */   public static final int COMPLEX_UNIT_FRACTION = 0;
/*    */   public static final int COMPLEX_UNIT_FRACTION_PARENT = 1;
/*    */   
/* 20 */   public TypedValue() { throw new RuntimeException("Stub!"); }
/* 21 */   public final float getFloat() { throw new RuntimeException("Stub!"); }
/* 22 */   public static float complexToFloat(int complex) { throw new RuntimeException("Stub!"); }
/* 23 */   public static float complexToDimension(int data, DisplayMetrics metrics) { throw new RuntimeException("Stub!"); }
/* 24 */   public static int complexToDimensionPixelOffset(int data, DisplayMetrics metrics) { throw new RuntimeException("Stub!"); }
/* 25 */   public static int complexToDimensionPixelSize(int data, DisplayMetrics metrics) { throw new RuntimeException("Stub!"); }
/* 26 */   public int getComplexUnit() { throw new RuntimeException("Stub!"); }
/* 27 */   public static float applyDimension(int unit, float value, DisplayMetrics metrics) { throw new RuntimeException("Stub!"); }
/* 28 */   public float getDimension(DisplayMetrics metrics) { throw new RuntimeException("Stub!"); }
/* 29 */   public static float complexToFraction(int data, float base, float pbase) { throw new RuntimeException("Stub!"); }
/* 30 */   public float getFraction(float base, float pbase) { throw new RuntimeException("Stub!"); }
/* 31 */   public final CharSequence coerceToString() { throw new RuntimeException("Stub!"); }
/* 32 */   public static final String coerceToString(int type, int data) { throw new RuntimeException("Stub!"); }
/* 33 */   public void setTo(TypedValue other) { throw new RuntimeException("Stub!"); }
/* 34 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static final int COMPLEX_UNIT_IN = 4;
/*    */   public static final int COMPLEX_UNIT_MASK = 15;
/*    */   public static final int COMPLEX_UNIT_MM = 5;
/*    */   public static final int COMPLEX_UNIT_PT = 3;
/*    */   public static final int COMPLEX_UNIT_PX = 0;
/*    */   public static final int COMPLEX_UNIT_SHIFT = 0;
/*    */   public static final int COMPLEX_UNIT_SP = 2;
/*    */   public static final int DATA_NULL_EMPTY = 1;
/*    */   public static final int DATA_NULL_UNDEFINED = 0;
/*    */   public static final int DENSITY_DEFAULT = 0;
/*    */   public static final int DENSITY_NONE = 65535;
/*    */   public static final int TYPE_ATTRIBUTE = 2;
/*    */   public static final int TYPE_DIMENSION = 5;
/*    */   public static final int TYPE_FIRST_COLOR_INT = 28;
/*    */   public static final int TYPE_FIRST_INT = 16;
/*    */   public static final int TYPE_FLOAT = 4;
/*    */   public static final int TYPE_FRACTION = 6;
/*    */   public static final int TYPE_INT_BOOLEAN = 18;
/*    */   public static final int TYPE_INT_COLOR_ARGB4 = 30;
/*    */   public static final int TYPE_INT_COLOR_ARGB8 = 28;
/*    */   public static final int TYPE_INT_COLOR_RGB4 = 31;
/*    */   public static final int TYPE_INT_COLOR_RGB8 = 29;
/*    */   public static final int TYPE_INT_DEC = 16;
/*    */   public static final int TYPE_INT_HEX = 17;
/*    */   public static final int TYPE_LAST_COLOR_INT = 31;
/*    */   public static final int TYPE_LAST_INT = 31;
/*    */   public static final int TYPE_NULL = 0;
/*    */   public static final int TYPE_REFERENCE = 1;
/*    */   public static final int TYPE_STRING = 3;
/*    */   public int assetCookie;
/*    */   public int changingConfigurations;
/*    */   public int data;
/*    */   public int density;
/*    */   public int resourceId;
/*    */   public CharSequence string;
/*    */   public int type;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\util\TypedValue.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */