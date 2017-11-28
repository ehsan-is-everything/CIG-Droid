/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.content.res.ColorStateList;
/*    */ import android.graphics.Canvas;
/*    */ import android.graphics.PorterDuff.Mode;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.os.Parcelable;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.View;
/*    */ import android.view.ViewDebug.ExportedProperty;
/*    */ import android.view.animation.Interpolator;
/*    */ 
/*    */ 
/*    */ 
/*    */ @RemoteViews.RemoteView
/*    */ public class ProgressBar
/*    */   extends View
/*    */ {
/*    */   public ProgressBar(Context context)
/*    */   {
/* 22 */     super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 23 */   public ProgressBar(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 24 */   public ProgressBar(Context context, AttributeSet attrs, int defStyleAttr) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 25 */   public ProgressBar(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/*    */   @ViewDebug.ExportedProperty(category="progress")
/* 27 */   public synchronized boolean isIndeterminate() { throw new RuntimeException("Stub!"); }
/* 28 */   public synchronized void setIndeterminate(boolean indeterminate) { throw new RuntimeException("Stub!"); }
/* 29 */   public Drawable getIndeterminateDrawable() { throw new RuntimeException("Stub!"); }
/* 30 */   public void setIndeterminateDrawable(Drawable d) { throw new RuntimeException("Stub!"); }
/* 31 */   public void setIndeterminateTintList(ColorStateList tint) { throw new RuntimeException("Stub!"); }
/* 32 */   public ColorStateList getIndeterminateTintList() { throw new RuntimeException("Stub!"); }
/* 33 */   public void setIndeterminateTintMode(PorterDuff.Mode tintMode) { throw new RuntimeException("Stub!"); }
/* 34 */   public PorterDuff.Mode getIndeterminateTintMode() { throw new RuntimeException("Stub!"); }
/* 35 */   public void setIndeterminateDrawableTiled(Drawable d) { throw new RuntimeException("Stub!"); }
/* 36 */   public Drawable getProgressDrawable() { throw new RuntimeException("Stub!"); }
/* 37 */   public void setProgressDrawable(Drawable d) { throw new RuntimeException("Stub!"); }
/* 38 */   public void setProgressTintList(ColorStateList tint) { throw new RuntimeException("Stub!"); }
/* 39 */   public ColorStateList getProgressTintList() { throw new RuntimeException("Stub!"); }
/* 40 */   public void setProgressTintMode(PorterDuff.Mode tintMode) { throw new RuntimeException("Stub!"); }
/* 41 */   public PorterDuff.Mode getProgressTintMode() { throw new RuntimeException("Stub!"); }
/* 42 */   public void setProgressBackgroundTintList(ColorStateList tint) { throw new RuntimeException("Stub!"); }
/* 43 */   public ColorStateList getProgressBackgroundTintList() { throw new RuntimeException("Stub!"); }
/* 44 */   public void setProgressBackgroundTintMode(PorterDuff.Mode tintMode) { throw new RuntimeException("Stub!"); }
/* 45 */   public PorterDuff.Mode getProgressBackgroundTintMode() { throw new RuntimeException("Stub!"); }
/* 46 */   public void setSecondaryProgressTintList(ColorStateList tint) { throw new RuntimeException("Stub!"); }
/* 47 */   public ColorStateList getSecondaryProgressTintList() { throw new RuntimeException("Stub!"); }
/* 48 */   public void setSecondaryProgressTintMode(PorterDuff.Mode tintMode) { throw new RuntimeException("Stub!"); }
/* 49 */   public PorterDuff.Mode getSecondaryProgressTintMode() { throw new RuntimeException("Stub!"); }
/* 50 */   public void setProgressDrawableTiled(Drawable d) { throw new RuntimeException("Stub!"); }
/* 51 */   protected boolean verifyDrawable(Drawable who) { throw new RuntimeException("Stub!"); }
/* 52 */   public void jumpDrawablesToCurrentState() { throw new RuntimeException("Stub!"); }
/* 53 */   public void postInvalidate() { throw new RuntimeException("Stub!"); }
/* 54 */   public synchronized void setProgress(int progress) { throw new RuntimeException("Stub!"); }
/* 55 */   public void setProgress(int progress, boolean animate) { throw new RuntimeException("Stub!"); }
/* 56 */   public synchronized void setSecondaryProgress(int secondaryProgress) { throw new RuntimeException("Stub!"); }
/*    */   @ViewDebug.ExportedProperty(category="progress")
/* 58 */   public synchronized int getProgress() { throw new RuntimeException("Stub!"); }
/*    */   @ViewDebug.ExportedProperty(category="progress")
/* 60 */   public synchronized int getSecondaryProgress() { throw new RuntimeException("Stub!"); }
/*    */   @ViewDebug.ExportedProperty(category="progress")
/* 62 */   public synchronized int getMin() { throw new RuntimeException("Stub!"); }
/*    */   @ViewDebug.ExportedProperty(category="progress")
/* 64 */   public synchronized int getMax() { throw new RuntimeException("Stub!"); }
/* 65 */   public synchronized void setMin(int min) { throw new RuntimeException("Stub!"); }
/* 66 */   public synchronized void setMax(int max) { throw new RuntimeException("Stub!"); }
/* 67 */   public final synchronized void incrementProgressBy(int diff) { throw new RuntimeException("Stub!"); }
/* 68 */   public final synchronized void incrementSecondaryProgressBy(int diff) { throw new RuntimeException("Stub!"); }
/* 69 */   public void setInterpolator(Context context, int resID) { throw new RuntimeException("Stub!"); }
/* 70 */   public void setInterpolator(Interpolator interpolator) { throw new RuntimeException("Stub!"); }
/* 71 */   public Interpolator getInterpolator() { throw new RuntimeException("Stub!"); }
/* 72 */   public void onVisibilityAggregated(boolean isVisible) { throw new RuntimeException("Stub!"); }
/* 73 */   public void invalidateDrawable(Drawable dr) { throw new RuntimeException("Stub!"); }
/* 74 */   protected void onSizeChanged(int w, int h, int oldw, int oldh) { throw new RuntimeException("Stub!"); }
/* 75 */   protected synchronized void onDraw(Canvas canvas) { throw new RuntimeException("Stub!"); }
/* 76 */   protected synchronized void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
/* 77 */   protected void drawableStateChanged() { throw new RuntimeException("Stub!"); }
/* 78 */   public void drawableHotspotChanged(float x, float y) { throw new RuntimeException("Stub!"); }
/* 79 */   public Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); }
/* 80 */   public void onRestoreInstanceState(Parcelable state) { throw new RuntimeException("Stub!"); }
/* 81 */   protected void onAttachedToWindow() { throw new RuntimeException("Stub!"); }
/* 82 */   protected void onDetachedFromWindow() { throw new RuntimeException("Stub!"); }
/* 83 */   public CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
/* 84 */   public boolean isAnimating() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\widget\ProgressBar.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */