/*     */ package java.lang;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class Math
/*     */ {
/*     */   public static final double E = 2.718281828459045D;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static final double PI = 3.141592653589793D;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  30 */   Math() { throw new RuntimeException("Stub!"); }
/*     */   public static native double sin(double paramDouble);
/*     */   public static native double cos(double paramDouble);
/*     */   public static native double tan(double paramDouble);
/*     */   public static native double asin(double paramDouble);
/*     */   public static native double acos(double paramDouble);
/*     */   public static native double atan(double paramDouble);
/*  37 */   public static double toRadians(double angdeg) { throw new RuntimeException("Stub!"); }
/*  38 */   public static double toDegrees(double angrad) { throw new RuntimeException("Stub!"); }
/*     */   public static native double exp(double paramDouble);
/*     */   public static native double log(double paramDouble);
/*     */   public static native double log10(double paramDouble);
/*     */   public static native double sqrt(double paramDouble);
/*     */   public static native double cbrt(double paramDouble);
/*     */   public static native double IEEEremainder(double paramDouble1, double paramDouble2);
/*     */   public static native double ceil(double paramDouble);
/*     */   public static native double floor(double paramDouble);
/*     */   public static native double rint(double paramDouble);
/*     */   public static native double atan2(double paramDouble1, double paramDouble2);
/*     */   public static native double pow(double paramDouble1, double paramDouble2);
/*  50 */   public static int round(float a) { throw new RuntimeException("Stub!"); }
/*  51 */   public static long round(double a) { throw new RuntimeException("Stub!"); }
/*  52 */   public static double random() { throw new RuntimeException("Stub!"); }
/*  53 */   public static int addExact(int x, int y) { throw new RuntimeException("Stub!"); }
/*  54 */   public static long addExact(long x, long y) { throw new RuntimeException("Stub!"); }
/*  55 */   public static int subtractExact(int x, int y) { throw new RuntimeException("Stub!"); }
/*  56 */   public static long subtractExact(long x, long y) { throw new RuntimeException("Stub!"); }
/*  57 */   public static int multiplyExact(int x, int y) { throw new RuntimeException("Stub!"); }
/*  58 */   public static long multiplyExact(long x, long y) { throw new RuntimeException("Stub!"); }
/*  59 */   public static int incrementExact(int a) { throw new RuntimeException("Stub!"); }
/*  60 */   public static long incrementExact(long a) { throw new RuntimeException("Stub!"); }
/*  61 */   public static int decrementExact(int a) { throw new RuntimeException("Stub!"); }
/*  62 */   public static long decrementExact(long a) { throw new RuntimeException("Stub!"); }
/*  63 */   public static int negateExact(int a) { throw new RuntimeException("Stub!"); }
/*  64 */   public static long negateExact(long a) { throw new RuntimeException("Stub!"); }
/*  65 */   public static int toIntExact(long value) { throw new RuntimeException("Stub!"); }
/*  66 */   public static int floorDiv(int x, int y) { throw new RuntimeException("Stub!"); }
/*  67 */   public static long floorDiv(long x, long y) { throw new RuntimeException("Stub!"); }
/*  68 */   public static int floorMod(int x, int y) { throw new RuntimeException("Stub!"); }
/*  69 */   public static long floorMod(long x, long y) { throw new RuntimeException("Stub!"); }
/*  70 */   public static int abs(int a) { throw new RuntimeException("Stub!"); }
/*  71 */   public static long abs(long a) { throw new RuntimeException("Stub!"); }
/*  72 */   public static float abs(float a) { throw new RuntimeException("Stub!"); }
/*  73 */   public static double abs(double a) { throw new RuntimeException("Stub!"); }
/*  74 */   public static int max(int a, int b) { throw new RuntimeException("Stub!"); }
/*  75 */   public static long max(long a, long b) { throw new RuntimeException("Stub!"); }
/*  76 */   public static float max(float a, float b) { throw new RuntimeException("Stub!"); }
/*  77 */   public static double max(double a, double b) { throw new RuntimeException("Stub!"); }
/*  78 */   public static int min(int a, int b) { throw new RuntimeException("Stub!"); }
/*  79 */   public static long min(long a, long b) { throw new RuntimeException("Stub!"); }
/*  80 */   public static float min(float a, float b) { throw new RuntimeException("Stub!"); }
/*  81 */   public static double min(double a, double b) { throw new RuntimeException("Stub!"); }
/*  82 */   public static double ulp(double d) { throw new RuntimeException("Stub!"); }
/*  83 */   public static float ulp(float f) { throw new RuntimeException("Stub!"); }
/*  84 */   public static double signum(double d) { throw new RuntimeException("Stub!"); }
/*  85 */   public static float signum(float f) { throw new RuntimeException("Stub!"); }
/*     */   public static native double sinh(double paramDouble);
/*     */   public static native double cosh(double paramDouble);
/*     */   public static native double tanh(double paramDouble);
/*     */   public static native double hypot(double paramDouble1, double paramDouble2);
/*     */   public static native double expm1(double paramDouble);
/*     */   public static native double log1p(double paramDouble);
/*  92 */   public static double copySign(double magnitude, double sign) { throw new RuntimeException("Stub!"); }
/*  93 */   public static float copySign(float magnitude, float sign) { throw new RuntimeException("Stub!"); }
/*  94 */   public static int getExponent(float f) { throw new RuntimeException("Stub!"); }
/*  95 */   public static int getExponent(double d) { throw new RuntimeException("Stub!"); }
/*  96 */   public static double nextAfter(double start, double direction) { throw new RuntimeException("Stub!"); }
/*  97 */   public static float nextAfter(float start, double direction) { throw new RuntimeException("Stub!"); }
/*  98 */   public static double nextUp(double d) { throw new RuntimeException("Stub!"); }
/*  99 */   public static float nextUp(float f) { throw new RuntimeException("Stub!"); }
/* 100 */   public static double nextDown(double d) { throw new RuntimeException("Stub!"); }
/* 101 */   public static float nextDown(float f) { throw new RuntimeException("Stub!"); }
/* 102 */   public static double scalb(double d, int scaleFactor) { throw new RuntimeException("Stub!"); }
/* 103 */   public static float scalb(float f, int scaleFactor) { throw new RuntimeException("Stub!"); }
/*     */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\lang\Math.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */