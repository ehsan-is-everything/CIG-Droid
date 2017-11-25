/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.content.res.ColorStateList;
/*    */ import android.graphics.Bitmap;
/*    */ import android.graphics.Canvas;
/*    */ import android.graphics.ColorFilter;
/*    */ import android.graphics.Matrix;
/*    */ import android.graphics.PorterDuff.Mode;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.graphics.drawable.Icon;
/*    */ import android.net.Uri;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.View;
/*    */ import android.view.ViewDebug.ExportedProperty;
/*    */ 
/*    */ 
/*    */ @RemoteViews.RemoteView
/*    */ public class ImageView
/*    */   extends View
/*    */ {
/*    */   public static enum ScaleType
/*    */   {
/* 24 */     CENTER, 
/* 25 */     CENTER_CROP, 
/* 26 */     CENTER_INSIDE, 
/* 27 */     FIT_CENTER, 
/* 28 */     FIT_END, 
/* 29 */     FIT_START, 
/* 30 */     FIT_XY, 
/* 31 */     MATRIX;
/*    */     private ScaleType() {} }
/* 33 */   public ImageView(Context context) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 34 */   public ImageView(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 35 */   public ImageView(Context context, AttributeSet attrs, int defStyleAttr) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 36 */   public ImageView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 37 */   protected boolean verifyDrawable(Drawable dr) { throw new RuntimeException("Stub!"); }
/* 38 */   public void jumpDrawablesToCurrentState() { throw new RuntimeException("Stub!"); }
/* 39 */   public void invalidateDrawable(Drawable dr) { throw new RuntimeException("Stub!"); }
/* 40 */   public boolean hasOverlappingRendering() { throw new RuntimeException("Stub!"); }
/* 41 */   public boolean getAdjustViewBounds() { throw new RuntimeException("Stub!"); }
/* 42 */   public void setAdjustViewBounds(boolean adjustViewBounds) { throw new RuntimeException("Stub!"); }
/* 43 */   public int getMaxWidth() { throw new RuntimeException("Stub!"); }
/* 44 */   public void setMaxWidth(int maxWidth) { throw new RuntimeException("Stub!"); }
/* 45 */   public int getMaxHeight() { throw new RuntimeException("Stub!"); }
/* 46 */   public void setMaxHeight(int maxHeight) { throw new RuntimeException("Stub!"); }
/* 47 */   public Drawable getDrawable() { throw new RuntimeException("Stub!"); }
/* 48 */   public void setImageResource(int resId) { throw new RuntimeException("Stub!"); }
/* 49 */   public void setImageURI(Uri uri) { throw new RuntimeException("Stub!"); }
/* 50 */   public void setImageDrawable(Drawable drawable) { throw new RuntimeException("Stub!"); }
/* 51 */   public void setImageIcon(Icon icon) { throw new RuntimeException("Stub!"); }
/* 52 */   public void setImageTintList(ColorStateList tint) { throw new RuntimeException("Stub!"); }
/* 53 */   public ColorStateList getImageTintList() { throw new RuntimeException("Stub!"); }
/* 54 */   public void setImageTintMode(PorterDuff.Mode tintMode) { throw new RuntimeException("Stub!"); }
/* 55 */   public PorterDuff.Mode getImageTintMode() { throw new RuntimeException("Stub!"); }
/* 56 */   public void setImageBitmap(Bitmap bm) { throw new RuntimeException("Stub!"); }
/* 57 */   public void setImageState(int[] state, boolean merge) { throw new RuntimeException("Stub!"); }
/* 58 */   public void setSelected(boolean selected) { throw new RuntimeException("Stub!"); }
/* 59 */   public void setImageLevel(int level) { throw new RuntimeException("Stub!"); }
/* 60 */   public void setScaleType(ScaleType scaleType) { throw new RuntimeException("Stub!"); }
/* 61 */   public ScaleType getScaleType() { throw new RuntimeException("Stub!"); }
/* 62 */   public Matrix getImageMatrix() { throw new RuntimeException("Stub!"); }
/* 63 */   public void setImageMatrix(Matrix matrix) { throw new RuntimeException("Stub!"); }
/* 64 */   public boolean getCropToPadding() { throw new RuntimeException("Stub!"); }
/* 65 */   public void setCropToPadding(boolean cropToPadding) { throw new RuntimeException("Stub!"); }
/* 66 */   public int[] onCreateDrawableState(int extraSpace) { throw new RuntimeException("Stub!"); }
/* 67 */   public void onRtlPropertiesChanged(int layoutDirection) { throw new RuntimeException("Stub!"); }
/* 68 */   protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
/* 69 */   protected boolean setFrame(int l, int t, int r, int b) { throw new RuntimeException("Stub!"); }
/* 70 */   protected void drawableStateChanged() { throw new RuntimeException("Stub!"); }
/* 71 */   public void drawableHotspotChanged(float x, float y) { throw new RuntimeException("Stub!"); }
/* 72 */   protected void onDraw(Canvas canvas) { throw new RuntimeException("Stub!"); }
/*    */   @ViewDebug.ExportedProperty(category="layout")
/* 74 */   public int getBaseline() { throw new RuntimeException("Stub!"); }
/* 75 */   public void setBaseline(int baseline) { throw new RuntimeException("Stub!"); }
/* 76 */   public void setBaselineAlignBottom(boolean aligned) { throw new RuntimeException("Stub!"); }
/* 77 */   public boolean getBaselineAlignBottom() { throw new RuntimeException("Stub!"); }
/* 78 */   public final void setColorFilter(int color, PorterDuff.Mode mode) { throw new RuntimeException("Stub!"); }
/* 79 */   public final void setColorFilter(int color) { throw new RuntimeException("Stub!"); }
/* 80 */   public final void clearColorFilter() { throw new RuntimeException("Stub!"); }
/* 81 */   public ColorFilter getColorFilter() { throw new RuntimeException("Stub!"); }
/* 82 */   public void setColorFilter(ColorFilter cf) { throw new RuntimeException("Stub!"); }
/* 83 */   public int getImageAlpha() { throw new RuntimeException("Stub!"); }
/* 84 */   public void setImageAlpha(int alpha) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 86 */   public void setAlpha(int alpha) { throw new RuntimeException("Stub!"); }
/* 87 */   public boolean isOpaque() { throw new RuntimeException("Stub!"); }
/* 88 */   public void onVisibilityAggregated(boolean isVisible) { throw new RuntimeException("Stub!"); }
/* 89 */   public void setVisibility(int visibility) { throw new RuntimeException("Stub!"); }
/* 90 */   protected void onAttachedToWindow() { throw new RuntimeException("Stub!"); }
/* 91 */   protected void onDetachedFromWindow() { throw new RuntimeException("Stub!"); }
/* 92 */   public CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\widget\ImageView.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */