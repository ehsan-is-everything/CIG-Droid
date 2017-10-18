/*    */ package android.graphics.drawable;
/*    */ 
/*    */ import android.content.res.ColorStateList;
/*    */ import android.content.res.Resources;
/*    */ import android.content.res.Resources.Theme;
/*    */ import android.graphics.Canvas;
/*    */ import android.graphics.ColorFilter;
/*    */ import android.graphics.Outline;
/*    */ import android.graphics.PorterDuff.Mode;
/*    */ import android.graphics.Rect;
/*    */ import android.util.AttributeSet;
/*    */ import org.xmlpull.v1.XmlPullParser;
/*    */ 
/*    */ public class LayerDrawable
/*    */   extends Drawable
/*    */   implements Drawable.Callback
/*    */ {
/*    */   public static final int INSET_UNDEFINED = Integer.MIN_VALUE;
/*    */   public static final int PADDING_MODE_NEST = 0;
/*    */   public static final int PADDING_MODE_STACK = 1;
/*    */   
/* 22 */   public LayerDrawable(Drawable[] layers) { throw new RuntimeException("Stub!"); }
/* 23 */   public void inflate(Resources r, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { throw new RuntimeException("Stub!"); }
/* 24 */   public void applyTheme(Resources.Theme t) { throw new RuntimeException("Stub!"); }
/* 25 */   public boolean canApplyTheme() { throw new RuntimeException("Stub!"); }
/* 26 */   public int addLayer(Drawable dr) { throw new RuntimeException("Stub!"); }
/* 27 */   public Drawable findDrawableByLayerId(int id) { throw new RuntimeException("Stub!"); }
/* 28 */   public void setId(int index, int id) { throw new RuntimeException("Stub!"); }
/* 29 */   public int getId(int index) { throw new RuntimeException("Stub!"); }
/* 30 */   public int getNumberOfLayers() { throw new RuntimeException("Stub!"); }
/* 31 */   public boolean setDrawableByLayerId(int id, Drawable drawable) { throw new RuntimeException("Stub!"); }
/* 32 */   public int findIndexByLayerId(int id) { throw new RuntimeException("Stub!"); }
/* 33 */   public void setDrawable(int index, Drawable drawable) { throw new RuntimeException("Stub!"); }
/* 34 */   public Drawable getDrawable(int index) { throw new RuntimeException("Stub!"); }
/* 35 */   public void setLayerSize(int index, int w, int h) { throw new RuntimeException("Stub!"); }
/* 36 */   public void setLayerWidth(int index, int w) { throw new RuntimeException("Stub!"); }
/* 37 */   public int getLayerWidth(int index) { throw new RuntimeException("Stub!"); }
/* 38 */   public void setLayerHeight(int index, int h) { throw new RuntimeException("Stub!"); }
/* 39 */   public int getLayerHeight(int index) { throw new RuntimeException("Stub!"); }
/* 40 */   public void setLayerGravity(int index, int gravity) { throw new RuntimeException("Stub!"); }
/* 41 */   public int getLayerGravity(int index) { throw new RuntimeException("Stub!"); }
/* 42 */   public void setLayerInset(int index, int l, int t, int r, int b) { throw new RuntimeException("Stub!"); }
/* 43 */   public void setLayerInsetRelative(int index, int s, int t, int e, int b) { throw new RuntimeException("Stub!"); }
/* 44 */   public void setLayerInsetLeft(int index, int l) { throw new RuntimeException("Stub!"); }
/* 45 */   public int getLayerInsetLeft(int index) { throw new RuntimeException("Stub!"); }
/* 46 */   public void setLayerInsetRight(int index, int r) { throw new RuntimeException("Stub!"); }
/* 47 */   public int getLayerInsetRight(int index) { throw new RuntimeException("Stub!"); }
/* 48 */   public void setLayerInsetTop(int index, int t) { throw new RuntimeException("Stub!"); }
/* 49 */   public int getLayerInsetTop(int index) { throw new RuntimeException("Stub!"); }
/* 50 */   public void setLayerInsetBottom(int index, int b) { throw new RuntimeException("Stub!"); }
/* 51 */   public int getLayerInsetBottom(int index) { throw new RuntimeException("Stub!"); }
/* 52 */   public void setLayerInsetStart(int index, int s) { throw new RuntimeException("Stub!"); }
/* 53 */   public int getLayerInsetStart(int index) { throw new RuntimeException("Stub!"); }
/* 54 */   public void setLayerInsetEnd(int index, int e) { throw new RuntimeException("Stub!"); }
/* 55 */   public int getLayerInsetEnd(int index) { throw new RuntimeException("Stub!"); }
/* 56 */   public void setPaddingMode(int mode) { throw new RuntimeException("Stub!"); }
/* 57 */   public int getPaddingMode() { throw new RuntimeException("Stub!"); }
/* 58 */   public void invalidateDrawable(Drawable who) { throw new RuntimeException("Stub!"); }
/* 59 */   public void scheduleDrawable(Drawable who, Runnable what, long when) { throw new RuntimeException("Stub!"); }
/* 60 */   public void unscheduleDrawable(Drawable who, Runnable what) { throw new RuntimeException("Stub!"); }
/* 61 */   public void draw(Canvas canvas) { throw new RuntimeException("Stub!"); }
/* 62 */   public int getChangingConfigurations() { throw new RuntimeException("Stub!"); }
/* 63 */   public boolean getPadding(Rect padding) { throw new RuntimeException("Stub!"); }
/* 64 */   public void setPadding(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
/* 65 */   public void setPaddingRelative(int start, int top, int end, int bottom) { throw new RuntimeException("Stub!"); }
/* 66 */   public int getLeftPadding() { throw new RuntimeException("Stub!"); }
/* 67 */   public int getRightPadding() { throw new RuntimeException("Stub!"); }
/* 68 */   public int getStartPadding() { throw new RuntimeException("Stub!"); }
/* 69 */   public int getEndPadding() { throw new RuntimeException("Stub!"); }
/* 70 */   public int getTopPadding() { throw new RuntimeException("Stub!"); }
/* 71 */   public int getBottomPadding() { throw new RuntimeException("Stub!"); }
/* 72 */   public void getOutline(Outline outline) { throw new RuntimeException("Stub!"); }
/* 73 */   public void setHotspot(float x, float y) { throw new RuntimeException("Stub!"); }
/* 74 */   public void setHotspotBounds(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
/* 75 */   public void getHotspotBounds(Rect outRect) { throw new RuntimeException("Stub!"); }
/* 76 */   public boolean setVisible(boolean visible, boolean restart) { throw new RuntimeException("Stub!"); }
/* 77 */   public void setDither(boolean dither) { throw new RuntimeException("Stub!"); }
/* 78 */   public void setAlpha(int alpha) { throw new RuntimeException("Stub!"); }
/* 79 */   public int getAlpha() { throw new RuntimeException("Stub!"); }
/* 80 */   public void setColorFilter(ColorFilter colorFilter) { throw new RuntimeException("Stub!"); }
/* 81 */   public void setTintList(ColorStateList tint) { throw new RuntimeException("Stub!"); }
/* 82 */   public void setTintMode(PorterDuff.Mode tintMode) { throw new RuntimeException("Stub!"); }
/* 83 */   public void setOpacity(int opacity) { throw new RuntimeException("Stub!"); }
/* 84 */   public int getOpacity() { throw new RuntimeException("Stub!"); }
/* 85 */   public void setAutoMirrored(boolean mirrored) { throw new RuntimeException("Stub!"); }
/* 86 */   public boolean isAutoMirrored() { throw new RuntimeException("Stub!"); }
/* 87 */   public void jumpToCurrentState() { throw new RuntimeException("Stub!"); }
/* 88 */   public boolean isStateful() { throw new RuntimeException("Stub!"); }
/* 89 */   protected boolean onStateChange(int[] state) { throw new RuntimeException("Stub!"); }
/* 90 */   protected boolean onLevelChange(int level) { throw new RuntimeException("Stub!"); }
/* 91 */   protected void onBoundsChange(Rect bounds) { throw new RuntimeException("Stub!"); }
/* 92 */   public int getIntrinsicWidth() { throw new RuntimeException("Stub!"); }
/* 93 */   public int getIntrinsicHeight() { throw new RuntimeException("Stub!"); }
/* 94 */   public Drawable.ConstantState getConstantState() { throw new RuntimeException("Stub!"); }
/* 95 */   public Drawable mutate() { throw new RuntimeException("Stub!"); }
/* 96 */   public boolean onLayoutDirectionChanged(int layoutDirection) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\graphics\drawable\LayerDrawable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */