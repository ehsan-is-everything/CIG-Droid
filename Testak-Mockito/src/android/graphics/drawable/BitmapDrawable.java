/*    */ package android.graphics.drawable;
/*    */ 
/*    */ import android.content.res.ColorStateList;
/*    */ import android.content.res.Resources;
/*    */ import android.content.res.Resources.Theme;
/*    */ import android.graphics.Bitmap;
/*    */ import android.graphics.Canvas;
/*    */ import android.graphics.ColorFilter;
/*    */ import android.graphics.Outline;
/*    */ import android.graphics.PorterDuff.Mode;
/*    */ import android.graphics.Shader.TileMode;
/*    */ import android.util.AttributeSet;
/*    */ import android.util.DisplayMetrics;
/*    */ import java.io.InputStream;
/*    */ import org.xmlpull.v1.XmlPullParser;
/*    */ 
/*    */ 
/*    */ public class BitmapDrawable
/*    */   extends Drawable
/*    */ {
/*    */   @Deprecated
/* 22 */   public BitmapDrawable() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   @Deprecated
/* 25 */   public BitmapDrawable(Resources res) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 27 */   public BitmapDrawable(Bitmap bitmap) { throw new RuntimeException("Stub!"); }
/* 28 */   public BitmapDrawable(Resources res, Bitmap bitmap) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 30 */   public BitmapDrawable(String filepath) { throw new RuntimeException("Stub!"); }
/*    */   
/* 32 */   public BitmapDrawable(Resources res, String filepath) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 34 */   public BitmapDrawable(InputStream is) { throw new RuntimeException("Stub!"); }
/*    */   
/* 36 */   public BitmapDrawable(Resources res, InputStream is) { throw new RuntimeException("Stub!"); }
/* 37 */   public final android.graphics.Paint getPaint() { throw new RuntimeException("Stub!"); }
/* 38 */   public final Bitmap getBitmap() { throw new RuntimeException("Stub!"); }
/* 39 */   public void setTargetDensity(Canvas canvas) { throw new RuntimeException("Stub!"); }
/* 40 */   public void setTargetDensity(DisplayMetrics metrics) { throw new RuntimeException("Stub!"); }
/* 41 */   public void setTargetDensity(int density) { throw new RuntimeException("Stub!"); }
/* 42 */   public int getGravity() { throw new RuntimeException("Stub!"); }
/* 43 */   public void setGravity(int gravity) { throw new RuntimeException("Stub!"); }
/* 44 */   public void setMipMap(boolean mipMap) { throw new RuntimeException("Stub!"); }
/* 45 */   public boolean hasMipMap() { throw new RuntimeException("Stub!"); }
/* 46 */   public void setAntiAlias(boolean aa) { throw new RuntimeException("Stub!"); }
/* 47 */   public boolean hasAntiAlias() { throw new RuntimeException("Stub!"); }
/* 48 */   public void setFilterBitmap(boolean filter) { throw new RuntimeException("Stub!"); }
/* 49 */   public boolean isFilterBitmap() { throw new RuntimeException("Stub!"); }
/* 50 */   public void setDither(boolean dither) { throw new RuntimeException("Stub!"); }
/* 51 */   public Shader.TileMode getTileModeX() { throw new RuntimeException("Stub!"); }
/* 52 */   public Shader.TileMode getTileModeY() { throw new RuntimeException("Stub!"); }
/* 53 */   public void setTileModeX(Shader.TileMode mode) { throw new RuntimeException("Stub!"); }
/* 54 */   public final void setTileModeY(Shader.TileMode mode) { throw new RuntimeException("Stub!"); }
/* 55 */   public void setTileModeXY(Shader.TileMode xmode, Shader.TileMode ymode) { throw new RuntimeException("Stub!"); }
/* 56 */   public void setAutoMirrored(boolean mirrored) { throw new RuntimeException("Stub!"); }
/* 57 */   public final boolean isAutoMirrored() { throw new RuntimeException("Stub!"); }
/* 58 */   public int getChangingConfigurations() { throw new RuntimeException("Stub!"); }
/* 59 */   protected void onBoundsChange(android.graphics.Rect bounds) { throw new RuntimeException("Stub!"); }
/* 60 */   public void draw(Canvas canvas) { throw new RuntimeException("Stub!"); }
/* 61 */   public void getOutline(Outline outline) { throw new RuntimeException("Stub!"); }
/* 62 */   public void setAlpha(int alpha) { throw new RuntimeException("Stub!"); }
/* 63 */   public int getAlpha() { throw new RuntimeException("Stub!"); }
/* 64 */   public void setColorFilter(ColorFilter colorFilter) { throw new RuntimeException("Stub!"); }
/* 65 */   public ColorFilter getColorFilter() { throw new RuntimeException("Stub!"); }
/* 66 */   public void setTintList(ColorStateList tint) { throw new RuntimeException("Stub!"); }
/* 67 */   public void setTintMode(PorterDuff.Mode tintMode) { throw new RuntimeException("Stub!"); }
/* 68 */   public Drawable mutate() { throw new RuntimeException("Stub!"); }
/* 69 */   protected boolean onStateChange(int[] stateSet) { throw new RuntimeException("Stub!"); }
/* 70 */   public boolean isStateful() { throw new RuntimeException("Stub!"); }
/* 71 */   public void inflate(Resources r, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { throw new RuntimeException("Stub!"); }
/* 72 */   public void applyTheme(Resources.Theme t) { throw new RuntimeException("Stub!"); }
/* 73 */   public boolean canApplyTheme() { throw new RuntimeException("Stub!"); }
/* 74 */   public int getIntrinsicWidth() { throw new RuntimeException("Stub!"); }
/* 75 */   public int getIntrinsicHeight() { throw new RuntimeException("Stub!"); }
/* 76 */   public int getOpacity() { throw new RuntimeException("Stub!"); }
/* 77 */   public final Drawable.ConstantState getConstantState() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\graphics\drawable\BitmapDrawable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */