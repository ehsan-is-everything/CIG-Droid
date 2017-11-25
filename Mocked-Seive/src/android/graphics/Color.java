/*    */ package android.graphics;
/*    */ 
/*    */ 
/*    */ public class Color
/*    */ {
/*    */   public static final int BLACK = -16777216;
/*    */   
/*    */   public static final int BLUE = -16776961;
/*    */   public static final int CYAN = -16711681;
/*    */   public static final int DKGRAY = -12303292;
/*    */   public static final int GRAY = -7829368;
/*    */   public static final int GREEN = -16711936;
/*    */   public static final int LTGRAY = -3355444;
/*    */   public static final int MAGENTA = -65281;
/*    */   public static final int RED = -65536;
/*    */   public static final int TRANSPARENT = 0;
/*    */   public static final int WHITE = -1;
/*    */   public static final int YELLOW = -256;
/*    */   
/* 20 */   public Color() { throw new RuntimeException("Stub!"); }
/* 21 */   public ColorSpace getColorSpace() { throw new RuntimeException("Stub!"); }
/* 22 */   public ColorSpace.Model getModel() { throw new RuntimeException("Stub!"); }
/* 23 */   public boolean isWideGamut() { throw new RuntimeException("Stub!"); }
/* 24 */   public boolean isSrgb() { throw new RuntimeException("Stub!"); }
/* 25 */   public int getComponentCount() { throw new RuntimeException("Stub!"); }
/* 26 */   public long pack() { throw new RuntimeException("Stub!"); }
/* 27 */   public Color convert(ColorSpace colorSpace) { throw new RuntimeException("Stub!"); }
/* 28 */   public int toArgb() { throw new RuntimeException("Stub!"); }
/* 29 */   public float red() { throw new RuntimeException("Stub!"); }
/* 30 */   public float green() { throw new RuntimeException("Stub!"); }
/* 31 */   public float blue() { throw new RuntimeException("Stub!"); }
/* 32 */   public float alpha() { throw new RuntimeException("Stub!"); }
/* 33 */   public float[] getComponents() { throw new RuntimeException("Stub!"); }
/* 34 */   public float[] getComponents(float[] components) { throw new RuntimeException("Stub!"); }
/* 35 */   public float getComponent(int component) { throw new RuntimeException("Stub!"); }
/* 36 */   public float luminance() { throw new RuntimeException("Stub!"); }
/* 37 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/* 38 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 39 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 40 */   public static ColorSpace colorSpace(long color) { throw new RuntimeException("Stub!"); }
/* 41 */   public static float red(long color) { throw new RuntimeException("Stub!"); }
/* 42 */   public static float green(long color) { throw new RuntimeException("Stub!"); }
/* 43 */   public static float blue(long color) { throw new RuntimeException("Stub!"); }
/* 44 */   public static float alpha(long color) { throw new RuntimeException("Stub!"); }
/* 45 */   public static boolean isSrgb(long color) { throw new RuntimeException("Stub!"); }
/* 46 */   public static boolean isWideGamut(long color) { throw new RuntimeException("Stub!"); }
/* 47 */   public static boolean isInColorSpace(long color, ColorSpace colorSpace) { throw new RuntimeException("Stub!"); }
/* 48 */   public static int toArgb(long color) { throw new RuntimeException("Stub!"); }
/* 49 */   public static Color valueOf(int color) { throw new RuntimeException("Stub!"); }
/* 50 */   public static Color valueOf(long color) { throw new RuntimeException("Stub!"); }
/* 51 */   public static Color valueOf(float r, float g, float b) { throw new RuntimeException("Stub!"); }
/* 52 */   public static Color valueOf(float r, float g, float b, float a) { throw new RuntimeException("Stub!"); }
/* 53 */   public static Color valueOf(float r, float g, float b, float a, ColorSpace colorSpace) { throw new RuntimeException("Stub!"); }
/* 54 */   public static Color valueOf(float[] components, ColorSpace colorSpace) { throw new RuntimeException("Stub!"); }
/* 55 */   public static long pack(int color) { throw new RuntimeException("Stub!"); }
/* 56 */   public static long pack(float red, float green, float blue) { throw new RuntimeException("Stub!"); }
/* 57 */   public static long pack(float red, float green, float blue, float alpha) { throw new RuntimeException("Stub!"); }
/* 58 */   public static long pack(float red, float green, float blue, float alpha, ColorSpace colorSpace) { throw new RuntimeException("Stub!"); }
/* 59 */   public static long convert(int color, ColorSpace colorSpace) { throw new RuntimeException("Stub!"); }
/* 60 */   public static long convert(long color, ColorSpace colorSpace) { throw new RuntimeException("Stub!"); }
/* 61 */   public static long convert(float r, float g, float b, float a, ColorSpace source, ColorSpace destination) { throw new RuntimeException("Stub!"); }
/* 62 */   public static long convert(long color, ColorSpace.Connector connector) { throw new RuntimeException("Stub!"); }
/* 63 */   public static long convert(float r, float g, float b, float a, ColorSpace.Connector connector) { throw new RuntimeException("Stub!"); }
/* 64 */   public static float luminance(long color) { throw new RuntimeException("Stub!"); }
/* 65 */   public static int alpha(int color) { throw new RuntimeException("Stub!"); }
/* 66 */   public static int red(int color) { throw new RuntimeException("Stub!"); }
/* 67 */   public static int green(int color) { throw new RuntimeException("Stub!"); }
/* 68 */   public static int blue(int color) { throw new RuntimeException("Stub!"); }
/* 69 */   public static int rgb(int red, int green, int blue) { throw new RuntimeException("Stub!"); }
/* 70 */   public static int rgb(float red, float green, float blue) { throw new RuntimeException("Stub!"); }
/* 71 */   public static int argb(int alpha, int red, int green, int blue) { throw new RuntimeException("Stub!"); }
/* 72 */   public static int argb(float alpha, float red, float green, float blue) { throw new RuntimeException("Stub!"); }
/* 73 */   public static float luminance(int color) { throw new RuntimeException("Stub!"); }
/* 74 */   public static int parseColor(String colorString) { throw new RuntimeException("Stub!"); }
/* 75 */   public static void RGBToHSV(int red, int green, int blue, float[] hsv) { throw new RuntimeException("Stub!"); }
/* 76 */   public static void colorToHSV(int color, float[] hsv) { throw new RuntimeException("Stub!"); }
/* 77 */   public static int HSVToColor(float[] hsv) { throw new RuntimeException("Stub!"); }
/* 78 */   public static int HSVToColor(int alpha, float[] hsv) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\graphics\Color.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */