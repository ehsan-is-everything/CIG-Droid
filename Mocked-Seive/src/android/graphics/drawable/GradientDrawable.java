/*    */ package android.graphics.drawable;
/*    */ 
/*    */ import android.content.res.ColorStateList;
/*    */ import android.content.res.Resources.Theme;
/*    */ import android.graphics.Canvas;
/*    */ import android.graphics.ColorFilter;
/*    */ import android.graphics.Outline;
/*    */ import android.graphics.PorterDuff.Mode;
/*    */ import android.graphics.Rect;
/*    */ 
/*    */ public class GradientDrawable extends Drawable
/*    */ {
/*    */   public static final int LINE = 2;
/*    */   public static final int LINEAR_GRADIENT = 0;
/*    */   public static final int OVAL = 1;
/*    */   public static final int RADIAL_GRADIENT = 1;
/*    */   public static final int RECTANGLE = 0;
/*    */   public static final int RING = 3;
/*    */   public static final int SWEEP_GRADIENT = 2;
/*    */   
/*    */   public static enum Orientation
/*    */   {
/* 23 */     BL_TR, 
/* 24 */     BOTTOM_TOP, 
/* 25 */     BR_TL, 
/* 26 */     LEFT_RIGHT, 
/* 27 */     RIGHT_LEFT, 
/* 28 */     TL_BR, 
/* 29 */     TOP_BOTTOM, 
/* 30 */     TR_BL;
/*    */     private Orientation() {} }
/* 32 */   public GradientDrawable() { throw new RuntimeException("Stub!"); }
/* 33 */   public GradientDrawable(Orientation orientation, int[] colors) { throw new RuntimeException("Stub!"); }
/* 34 */   public boolean getPadding(Rect padding) { throw new RuntimeException("Stub!"); }
/* 35 */   public void setCornerRadii(float[] radii) { throw new RuntimeException("Stub!"); }
/* 36 */   public float[] getCornerRadii() { throw new RuntimeException("Stub!"); }
/* 37 */   public void setCornerRadius(float radius) { throw new RuntimeException("Stub!"); }
/* 38 */   public float getCornerRadius() { throw new RuntimeException("Stub!"); }
/* 39 */   public void setStroke(int width, int color) { throw new RuntimeException("Stub!"); }
/* 40 */   public void setStroke(int width, ColorStateList colorStateList) { throw new RuntimeException("Stub!"); }
/* 41 */   public void setStroke(int width, int color, float dashWidth, float dashGap) { throw new RuntimeException("Stub!"); }
/* 42 */   public void setStroke(int width, ColorStateList colorStateList, float dashWidth, float dashGap) { throw new RuntimeException("Stub!"); }
/* 43 */   public void setSize(int width, int height) { throw new RuntimeException("Stub!"); }
/* 44 */   public void setShape(int shape) { throw new RuntimeException("Stub!"); }
/* 45 */   public int getShape() { throw new RuntimeException("Stub!"); }
/* 46 */   public void setGradientType(int gradient) { throw new RuntimeException("Stub!"); }
/* 47 */   public int getGradientType() { throw new RuntimeException("Stub!"); }
/* 48 */   public void setGradientCenter(float x, float y) { throw new RuntimeException("Stub!"); }
/* 49 */   public float getGradientCenterX() { throw new RuntimeException("Stub!"); }
/* 50 */   public float getGradientCenterY() { throw new RuntimeException("Stub!"); }
/* 51 */   public void setGradientRadius(float gradientRadius) { throw new RuntimeException("Stub!"); }
/* 52 */   public float getGradientRadius() { throw new RuntimeException("Stub!"); }
/* 53 */   public void setUseLevel(boolean useLevel) { throw new RuntimeException("Stub!"); }
/* 54 */   public boolean getUseLevel() { throw new RuntimeException("Stub!"); }
/* 55 */   public Orientation getOrientation() { throw new RuntimeException("Stub!"); }
/* 56 */   public void setOrientation(Orientation orientation) { throw new RuntimeException("Stub!"); }
/* 57 */   public void setColors(int[] colors) { throw new RuntimeException("Stub!"); }
/* 58 */   public int[] getColors() { throw new RuntimeException("Stub!"); }
/* 59 */   public void draw(Canvas canvas) { throw new RuntimeException("Stub!"); }
/* 60 */   public void setColor(int argb) { throw new RuntimeException("Stub!"); }
/* 61 */   public void setColor(ColorStateList colorStateList) { throw new RuntimeException("Stub!"); }
/* 62 */   public ColorStateList getColor() { throw new RuntimeException("Stub!"); }
/* 63 */   protected boolean onStateChange(int[] stateSet) { throw new RuntimeException("Stub!"); }
/* 64 */   public boolean isStateful() { throw new RuntimeException("Stub!"); }
/* 65 */   public int getChangingConfigurations() { throw new RuntimeException("Stub!"); }
/* 66 */   public void setAlpha(int alpha) { throw new RuntimeException("Stub!"); }
/* 67 */   public int getAlpha() { throw new RuntimeException("Stub!"); }
/* 68 */   public void setDither(boolean dither) { throw new RuntimeException("Stub!"); }
/* 69 */   public ColorFilter getColorFilter() { throw new RuntimeException("Stub!"); }
/* 70 */   public void setColorFilter(ColorFilter colorFilter) { throw new RuntimeException("Stub!"); }
/* 71 */   public void setTintList(ColorStateList tint) { throw new RuntimeException("Stub!"); }
/* 72 */   public void setTintMode(PorterDuff.Mode tintMode) { throw new RuntimeException("Stub!"); }
/* 73 */   public int getOpacity() { throw new RuntimeException("Stub!"); }
/* 74 */   protected void onBoundsChange(Rect r) { throw new RuntimeException("Stub!"); }
/* 75 */   protected boolean onLevelChange(int level) { throw new RuntimeException("Stub!"); }
/* 76 */   public void inflate(android.content.res.Resources r, org.xmlpull.v1.XmlPullParser parser, android.util.AttributeSet attrs, Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { throw new RuntimeException("Stub!"); }
/* 77 */   public void applyTheme(Resources.Theme t) { throw new RuntimeException("Stub!"); }
/* 78 */   public boolean canApplyTheme() { throw new RuntimeException("Stub!"); }
/* 79 */   public int getIntrinsicWidth() { throw new RuntimeException("Stub!"); }
/* 80 */   public int getIntrinsicHeight() { throw new RuntimeException("Stub!"); }
/* 81 */   public Drawable.ConstantState getConstantState() { throw new RuntimeException("Stub!"); }
/* 82 */   public void getOutline(Outline outline) { throw new RuntimeException("Stub!"); }
/* 83 */   public Drawable mutate() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\graphics\drawable\GradientDrawable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */