/*    */ package android.graphics.drawable;
/*    */ 
/*    */ import android.content.res.ColorStateList;
/*    */ import android.content.res.Resources;
/*    */ import android.content.res.Resources.Theme;
/*    */ import android.graphics.Bitmap;
/*    */ import android.graphics.Canvas;
/*    */ import android.graphics.ColorFilter;
/*    */ import android.graphics.NinePatch;
/*    */ import android.graphics.Outline;
/*    */ import android.graphics.PorterDuff.Mode;
/*    */ import android.graphics.Rect;
/*    */ import android.util.AttributeSet;
/*    */ import android.util.DisplayMetrics;
/*    */ import org.xmlpull.v1.XmlPullParser;
/*    */ 
/*    */ 
/*    */ public class NinePatchDrawable
/*    */   extends Drawable
/*    */ {
/*    */   @Deprecated
/* 22 */   public NinePatchDrawable(Bitmap bitmap, byte[] chunk, Rect padding, String srcName) { throw new RuntimeException("Stub!"); }
/* 23 */   public NinePatchDrawable(Resources res, Bitmap bitmap, byte[] chunk, Rect padding, String srcName) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 25 */   public NinePatchDrawable(NinePatch patch) { throw new RuntimeException("Stub!"); }
/* 26 */   public NinePatchDrawable(Resources res, NinePatch patch) { throw new RuntimeException("Stub!"); }
/* 27 */   public void setTargetDensity(Canvas canvas) { throw new RuntimeException("Stub!"); }
/* 28 */   public void setTargetDensity(DisplayMetrics metrics) { throw new RuntimeException("Stub!"); }
/* 29 */   public void setTargetDensity(int density) { throw new RuntimeException("Stub!"); }
/* 30 */   public void draw(Canvas canvas) { throw new RuntimeException("Stub!"); }
/* 31 */   public int getChangingConfigurations() { throw new RuntimeException("Stub!"); }
/* 32 */   public boolean getPadding(Rect padding) { throw new RuntimeException("Stub!"); }
/* 33 */   public void getOutline(Outline outline) { throw new RuntimeException("Stub!"); }
/* 34 */   public void setAlpha(int alpha) { throw new RuntimeException("Stub!"); }
/* 35 */   public int getAlpha() { throw new RuntimeException("Stub!"); }
/* 36 */   public void setColorFilter(ColorFilter colorFilter) { throw new RuntimeException("Stub!"); }
/* 37 */   public void setTintList(ColorStateList tint) { throw new RuntimeException("Stub!"); }
/* 38 */   public void setTintMode(PorterDuff.Mode tintMode) { throw new RuntimeException("Stub!"); }
/* 39 */   public void setDither(boolean dither) { throw new RuntimeException("Stub!"); }
/* 40 */   public void setAutoMirrored(boolean mirrored) { throw new RuntimeException("Stub!"); }
/* 41 */   public boolean isAutoMirrored() { throw new RuntimeException("Stub!"); }
/* 42 */   public void setFilterBitmap(boolean filter) { throw new RuntimeException("Stub!"); }
/* 43 */   public boolean isFilterBitmap() { throw new RuntimeException("Stub!"); }
/* 44 */   public void inflate(Resources r, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { throw new RuntimeException("Stub!"); }
/* 45 */   public void applyTheme(Resources.Theme t) { throw new RuntimeException("Stub!"); }
/* 46 */   public boolean canApplyTheme() { throw new RuntimeException("Stub!"); }
/* 47 */   public android.graphics.Paint getPaint() { throw new RuntimeException("Stub!"); }
/* 48 */   public int getIntrinsicWidth() { throw new RuntimeException("Stub!"); }
/* 49 */   public int getIntrinsicHeight() { throw new RuntimeException("Stub!"); }
/* 50 */   public int getOpacity() { throw new RuntimeException("Stub!"); }
/* 51 */   public android.graphics.Region getTransparentRegion() { throw new RuntimeException("Stub!"); }
/* 52 */   public Drawable.ConstantState getConstantState() { throw new RuntimeException("Stub!"); }
/* 53 */   public Drawable mutate() { throw new RuntimeException("Stub!"); }
/* 54 */   protected boolean onStateChange(int[] stateSet) { throw new RuntimeException("Stub!"); }
/* 55 */   public boolean isStateful() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\graphics\drawable\NinePatchDrawable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */