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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class DrawableContainer
/*    */   extends Drawable
/*    */   implements Drawable.Callback
/*    */ {
/*    */   public static abstract class DrawableContainerState
/*    */     extends Drawable.ConstantState
/*    */   {
/* 25 */     DrawableContainerState() { throw new RuntimeException("Stub!"); }
/* 26 */     public int getChangingConfigurations() { throw new RuntimeException("Stub!"); }
/* 27 */     public final int addChild(Drawable dr) { throw new RuntimeException("Stub!"); }
/* 28 */     public final int getChildCount() { throw new RuntimeException("Stub!"); }
/* 29 */     public final Drawable[] getChildren() { throw new RuntimeException("Stub!"); }
/* 30 */     public final Drawable getChild(int index) { throw new RuntimeException("Stub!"); }
/* 31 */     public boolean canApplyTheme() { throw new RuntimeException("Stub!"); }
/* 32 */     public final void setVariablePadding(boolean variable) { throw new RuntimeException("Stub!"); }
/* 33 */     public final Rect getConstantPadding() { throw new RuntimeException("Stub!"); }
/* 34 */     public final void setConstantSize(boolean constant) { throw new RuntimeException("Stub!"); }
/* 35 */     public final boolean isConstantSize() { throw new RuntimeException("Stub!"); }
/* 36 */     public final int getConstantWidth() { throw new RuntimeException("Stub!"); }
/* 37 */     public final int getConstantHeight() { throw new RuntimeException("Stub!"); }
/* 38 */     public final int getConstantMinimumWidth() { throw new RuntimeException("Stub!"); }
/* 39 */     public final int getConstantMinimumHeight() { throw new RuntimeException("Stub!"); }
/* 40 */     protected void computeConstantSize() { throw new RuntimeException("Stub!"); }
/* 41 */     public final void setEnterFadeDuration(int duration) { throw new RuntimeException("Stub!"); }
/* 42 */     public final int getEnterFadeDuration() { throw new RuntimeException("Stub!"); }
/* 43 */     public final void setExitFadeDuration(int duration) { throw new RuntimeException("Stub!"); }
/* 44 */     public final int getExitFadeDuration() { throw new RuntimeException("Stub!"); }
/* 45 */     public final int getOpacity() { throw new RuntimeException("Stub!"); }
/* 46 */     public final boolean isStateful() { throw new RuntimeException("Stub!"); }
/* 47 */     public void growArray(int oldSize, int newSize) { throw new RuntimeException("Stub!"); }
/* 48 */     public synchronized boolean canConstantState() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 50 */   public DrawableContainer() { throw new RuntimeException("Stub!"); }
/* 51 */   public void draw(Canvas canvas) { throw new RuntimeException("Stub!"); }
/* 52 */   public int getChangingConfigurations() { throw new RuntimeException("Stub!"); }
/* 53 */   public boolean getPadding(Rect padding) { throw new RuntimeException("Stub!"); }
/* 54 */   public void getOutline(Outline outline) { throw new RuntimeException("Stub!"); }
/* 55 */   public void setAlpha(int alpha) { throw new RuntimeException("Stub!"); }
/* 56 */   public int getAlpha() { throw new RuntimeException("Stub!"); }
/* 57 */   public void setDither(boolean dither) { throw new RuntimeException("Stub!"); }
/* 58 */   public void setColorFilter(ColorFilter colorFilter) { throw new RuntimeException("Stub!"); }
/* 59 */   public void setTintList(ColorStateList tint) { throw new RuntimeException("Stub!"); }
/* 60 */   public void setTintMode(PorterDuff.Mode tintMode) { throw new RuntimeException("Stub!"); }
/* 61 */   public void setEnterFadeDuration(int ms) { throw new RuntimeException("Stub!"); }
/* 62 */   public void setExitFadeDuration(int ms) { throw new RuntimeException("Stub!"); }
/* 63 */   protected void onBoundsChange(Rect bounds) { throw new RuntimeException("Stub!"); }
/* 64 */   public boolean isStateful() { throw new RuntimeException("Stub!"); }
/* 65 */   public void setAutoMirrored(boolean mirrored) { throw new RuntimeException("Stub!"); }
/* 66 */   public boolean isAutoMirrored() { throw new RuntimeException("Stub!"); }
/* 67 */   public void jumpToCurrentState() { throw new RuntimeException("Stub!"); }
/* 68 */   public void setHotspot(float x, float y) { throw new RuntimeException("Stub!"); }
/* 69 */   public void setHotspotBounds(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
/* 70 */   public void getHotspotBounds(Rect outRect) { throw new RuntimeException("Stub!"); }
/* 71 */   protected boolean onStateChange(int[] state) { throw new RuntimeException("Stub!"); }
/* 72 */   protected boolean onLevelChange(int level) { throw new RuntimeException("Stub!"); }
/* 73 */   public boolean onLayoutDirectionChanged(int layoutDirection) { throw new RuntimeException("Stub!"); }
/* 74 */   public int getIntrinsicWidth() { throw new RuntimeException("Stub!"); }
/* 75 */   public int getIntrinsicHeight() { throw new RuntimeException("Stub!"); }
/* 76 */   public int getMinimumWidth() { throw new RuntimeException("Stub!"); }
/* 77 */   public int getMinimumHeight() { throw new RuntimeException("Stub!"); }
/* 78 */   public void invalidateDrawable(Drawable who) { throw new RuntimeException("Stub!"); }
/* 79 */   public void scheduleDrawable(Drawable who, Runnable what, long when) { throw new RuntimeException("Stub!"); }
/* 80 */   public void unscheduleDrawable(Drawable who, Runnable what) { throw new RuntimeException("Stub!"); }
/* 81 */   public boolean setVisible(boolean visible, boolean restart) { throw new RuntimeException("Stub!"); }
/* 82 */   public int getOpacity() { throw new RuntimeException("Stub!"); }
/* 83 */   public boolean selectDrawable(int index) { throw new RuntimeException("Stub!"); }
/* 84 */   public Drawable getCurrent() { throw new RuntimeException("Stub!"); }
/* 85 */   public void applyTheme(Resources.Theme theme) { throw new RuntimeException("Stub!"); }
/* 86 */   public boolean canApplyTheme() { throw new RuntimeException("Stub!"); }
/* 87 */   public Drawable.ConstantState getConstantState() { throw new RuntimeException("Stub!"); }
/* 88 */   public Drawable mutate() { throw new RuntimeException("Stub!"); }
/* 89 */   protected void setConstantState(DrawableContainerState state) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\graphics\drawable\DrawableContainer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */