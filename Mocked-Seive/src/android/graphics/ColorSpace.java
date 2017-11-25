/*     */ package android.graphics;
/*     */ 
/*     */ import java.util.function.DoubleUnaryOperator;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class ColorSpace
/*     */ {
/*     */   public static enum Named
/*     */   {
/*  23 */     ACES, 
/*  24 */     ACESCG, 
/*  25 */     ADOBE_RGB, 
/*  26 */     BT2020, 
/*  27 */     BT709, 
/*  28 */     CIE_LAB, 
/*  29 */     CIE_XYZ, 
/*  30 */     DCI_P3, 
/*  31 */     DISPLAY_P3, 
/*  32 */     EXTENDED_SRGB, 
/*  33 */     LINEAR_EXTENDED_SRGB, 
/*  34 */     LINEAR_SRGB, 
/*  35 */     NTSC_1953, 
/*  36 */     PRO_PHOTO_RGB, 
/*  37 */     SMPTE_C, 
/*  38 */     SRGB;
/*     */     
/*     */     private Named() {} }
/*     */   
/*  42 */   public static enum RenderIntent { ABSOLUTE, 
/*  43 */     PERCEPTUAL, 
/*  44 */     RELATIVE, 
/*  45 */     SATURATION;
/*     */     
/*     */     private RenderIntent() {} }
/*     */   
/*  49 */   public static enum Adaptation { BRADFORD, 
/*  50 */     CIECAT02, 
/*  51 */     VON_KRIES;
/*     */     
/*     */     private Adaptation() {} }
/*     */   
/*  55 */   public static enum Model { CMYK, 
/*  56 */     LAB, 
/*  57 */     RGB, 
/*  58 */     XYZ;
/*  59 */     private Model() {} public int getComponentCount() { throw new RuntimeException("Stub!"); }
/*     */   }
/*     */   
/*     */   public static class Rgb extends ColorSpace { public static class TransferParameters { public final double a;
/*     */       public final double b;
/*     */       public final double c;
/*     */       
/*  66 */       public TransferParameters(double a, double b, double c, double d, double g) { throw new RuntimeException("Stub!"); }
/*  67 */       public TransferParameters(double a, double b, double c, double d, double e, double f, double g) { throw new RuntimeException("Stub!"); }
/*     */       
/*  69 */       public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/*  70 */       public int hashCode() { throw new RuntimeException("Stub!"); }
/*     */       
/*     */ 
/*     */       public final double d;
/*     */       public final double e;
/*     */       public final double f;
/*     */       public final double g;
/*     */     }
/*     */     
/*  79 */     public Rgb(String name, float[] toXYZ, DoubleUnaryOperator oetf, DoubleUnaryOperator eotf) { throw new RuntimeException("Stub!"); }
/*  80 */     public Rgb(String name, float[] primaries, float[] whitePoint, DoubleUnaryOperator oetf, DoubleUnaryOperator eotf, float min, float max) { throw new RuntimeException("Stub!"); }
/*  81 */     public Rgb(String name, float[] toXYZ, TransferParameters function) { throw new RuntimeException("Stub!"); }
/*  82 */     public Rgb(String name, float[] primaries, float[] whitePoint, TransferParameters function) { throw new RuntimeException("Stub!"); }
/*  83 */     public Rgb(String name, float[] toXYZ, double gamma) { throw new RuntimeException("Stub!"); }
/*  84 */     public Rgb(String name, float[] primaries, float[] whitePoint, double gamma) { throw new RuntimeException("Stub!"); }
/*  85 */     public float[] getWhitePoint(float[] whitePoint) { throw new RuntimeException("Stub!"); }
/*  86 */     public float[] getWhitePoint() { throw new RuntimeException("Stub!"); }
/*  87 */     public float[] getPrimaries(float[] primaries) { throw new RuntimeException("Stub!"); }
/*  88 */     public float[] getPrimaries() { throw new RuntimeException("Stub!"); }
/*  89 */     public float[] getTransform(float[] transform) { throw new RuntimeException("Stub!"); }
/*  90 */     public float[] getTransform() { throw new RuntimeException("Stub!"); }
/*  91 */     public float[] getInverseTransform(float[] inverseTransform) { throw new RuntimeException("Stub!"); }
/*  92 */     public float[] getInverseTransform() { throw new RuntimeException("Stub!"); }
/*  93 */     public DoubleUnaryOperator getOetf() { throw new RuntimeException("Stub!"); }
/*  94 */     public DoubleUnaryOperator getEotf() { throw new RuntimeException("Stub!"); }
/*  95 */     public TransferParameters getTransferParameters() { throw new RuntimeException("Stub!"); }
/*  96 */     public boolean isSrgb() { throw new RuntimeException("Stub!"); }
/*  97 */     public boolean isWideGamut() { throw new RuntimeException("Stub!"); }
/*  98 */     public float getMinValue(int component) { throw new RuntimeException("Stub!"); }
/*  99 */     public float getMaxValue(int component) { throw new RuntimeException("Stub!"); }
/* 100 */     public float[] toLinear(float r, float g, float b) { throw new RuntimeException("Stub!"); }
/* 101 */     public float[] toLinear(float[] v) { throw new RuntimeException("Stub!"); }
/* 102 */     public float[] fromLinear(float r, float g, float b) { throw new RuntimeException("Stub!"); }
/* 103 */     public float[] fromLinear(float[] v) { throw new RuntimeException("Stub!"); }
/* 104 */     public float[] toXyz(float[] v) { throw new RuntimeException("Stub!"); }
/* 105 */     public float[] fromXyz(float[] v) { throw new RuntimeException("Stub!"); }
/* 106 */     public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/* 107 */     public int hashCode() { throw new RuntimeException("Stub!"); }
/*     */   }
/*     */   
/*     */   public static class Connector {
/* 111 */     Connector() { throw new RuntimeException("Stub!"); }
/* 112 */     public ColorSpace getSource() { throw new RuntimeException("Stub!"); }
/* 113 */     public ColorSpace getDestination() { throw new RuntimeException("Stub!"); }
/* 114 */     public ColorSpace.RenderIntent getRenderIntent() { throw new RuntimeException("Stub!"); }
/* 115 */     public float[] transform(float r, float g, float b) { throw new RuntimeException("Stub!"); }
/* 116 */     public float[] transform(float[] v) { throw new RuntimeException("Stub!"); } }
/*     */   
/* 118 */   ColorSpace() { throw new RuntimeException("Stub!"); }
/* 119 */   public String getName() { throw new RuntimeException("Stub!"); }
/* 120 */   public int getId() { throw new RuntimeException("Stub!"); }
/* 121 */   public Model getModel() { throw new RuntimeException("Stub!"); }
/* 122 */   public int getComponentCount() { throw new RuntimeException("Stub!"); }
/*     */   public abstract boolean isWideGamut();
/* 124 */   public boolean isSrgb() { throw new RuntimeException("Stub!"); }
/*     */   public abstract float getMinValue(int paramInt);
/*     */   public abstract float getMaxValue(int paramInt);
/* 127 */   public float[] toXyz(float r, float g, float b) { throw new RuntimeException("Stub!"); }
/*     */   public abstract float[] toXyz(float[] paramArrayOfFloat);
/* 129 */   public float[] fromXyz(float x, float y, float z) { throw new RuntimeException("Stub!"); }
/*     */   public abstract float[] fromXyz(float[] paramArrayOfFloat);
/* 131 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 132 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/* 133 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 134 */   public static Connector connect(ColorSpace source, ColorSpace destination) { throw new RuntimeException("Stub!"); }
/*     */   
/* 136 */   public static Connector connect(ColorSpace source, ColorSpace destination, RenderIntent intent) { throw new RuntimeException("Stub!"); }
/* 137 */   public static Connector connect(ColorSpace source) { throw new RuntimeException("Stub!"); }
/* 138 */   public static Connector connect(ColorSpace source, RenderIntent intent) { throw new RuntimeException("Stub!"); }
/* 139 */   public static ColorSpace adapt(ColorSpace colorSpace, float[] whitePoint) { throw new RuntimeException("Stub!"); }
/* 140 */   public static ColorSpace adapt(ColorSpace colorSpace, float[] whitePoint, Adaptation adaptation) { throw new RuntimeException("Stub!"); }
/* 141 */   public static ColorSpace get(Named name) { throw new RuntimeException("Stub!"); }
/* 142 */   public static ColorSpace match(float[] toXYZD50, ColorSpace.Rgb.TransferParameters function) { throw new RuntimeException("Stub!"); }
/* 143 */   public static final float[] ILLUMINANT_A = null;
/* 144 */   public static final float[] ILLUMINANT_B = null;
/* 145 */   public static final float[] ILLUMINANT_C = null;
/* 146 */   public static final float[] ILLUMINANT_D50 = null;
/* 147 */   public static final float[] ILLUMINANT_D55 = null;
/* 148 */   public static final float[] ILLUMINANT_D60 = null;
/* 149 */   public static final float[] ILLUMINANT_D65 = null;
/* 150 */   public static final float[] ILLUMINANT_D75 = null;
/* 151 */   public static final float[] ILLUMINANT_E = null;
/*     */   public static final int MAX_ID = 63;
/*     */   public static final int MIN_ID = -1;
/*     */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\graphics\ColorSpace.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */