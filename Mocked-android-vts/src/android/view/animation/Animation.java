/*    */ package android.view.animation;
/*    */ 
/*    */ import android.content.Context;
/*    */ 
/*    */ public abstract class Animation implements Cloneable { public static final int ABSOLUTE = 0;
/*    */   public static final int INFINITE = -1;
/*    */   public static final int RELATIVE_TO_PARENT = 2;
/*    */   public static final int RELATIVE_TO_SELF = 1;
/*    */   public static final int RESTART = 1;
/*    */   public static final int REVERSE = 2;
/*    */   public static final int START_ON_FIRST_FRAME = -1;
/*    */   public static final int ZORDER_BOTTOM = -1;
/*    */   public static final int ZORDER_NORMAL = 0;
/*    */   public static final int ZORDER_TOP = 1;
/*    */   
/*    */   public static abstract interface AnimationListener { public abstract void onAnimationStart(Animation paramAnimation);
/*    */     
/*    */     public abstract void onAnimationEnd(Animation paramAnimation);
/*    */     
/*    */     public abstract void onAnimationRepeat(Animation paramAnimation);
/*    */   }
/*    */   
/* 23 */   protected static class Description { protected Description() { throw new RuntimeException("Stub!"); }
/*    */     
/*    */ 
/*    */ 
/*    */     public int type;
/*    */     
/*    */ 
/*    */     public float value;
/*    */   }
/*    */   
/* 33 */   public Animation() { throw new RuntimeException("Stub!"); }
/* 34 */   public Animation(Context context, android.util.AttributeSet attrs) { throw new RuntimeException("Stub!"); }
/* 35 */   protected Animation clone() throws CloneNotSupportedException { throw new RuntimeException("Stub!"); }
/* 36 */   public void reset() { throw new RuntimeException("Stub!"); }
/* 37 */   public void cancel() { throw new RuntimeException("Stub!"); }
/* 38 */   public boolean isInitialized() { throw new RuntimeException("Stub!"); }
/* 39 */   public void initialize(int width, int height, int parentWidth, int parentHeight) { throw new RuntimeException("Stub!"); }
/* 40 */   public void setInterpolator(Context context, int resID) { throw new RuntimeException("Stub!"); }
/* 41 */   public void setInterpolator(Interpolator i) { throw new RuntimeException("Stub!"); }
/* 42 */   public void setStartOffset(long startOffset) { throw new RuntimeException("Stub!"); }
/* 43 */   public void setDuration(long durationMillis) { throw new RuntimeException("Stub!"); }
/* 44 */   public void restrictDuration(long durationMillis) { throw new RuntimeException("Stub!"); }
/* 45 */   public void scaleCurrentDuration(float scale) { throw new RuntimeException("Stub!"); }
/* 46 */   public void setStartTime(long startTimeMillis) { throw new RuntimeException("Stub!"); }
/* 47 */   public void start() { throw new RuntimeException("Stub!"); }
/* 48 */   public void startNow() { throw new RuntimeException("Stub!"); }
/* 49 */   public void setRepeatMode(int repeatMode) { throw new RuntimeException("Stub!"); }
/* 50 */   public void setRepeatCount(int repeatCount) { throw new RuntimeException("Stub!"); }
/* 51 */   public boolean isFillEnabled() { throw new RuntimeException("Stub!"); }
/* 52 */   public void setFillEnabled(boolean fillEnabled) { throw new RuntimeException("Stub!"); }
/* 53 */   public void setFillBefore(boolean fillBefore) { throw new RuntimeException("Stub!"); }
/* 54 */   public void setFillAfter(boolean fillAfter) { throw new RuntimeException("Stub!"); }
/* 55 */   public void setZAdjustment(int zAdjustment) { throw new RuntimeException("Stub!"); }
/* 56 */   public void setBackgroundColor(int bg) { throw new RuntimeException("Stub!"); }
/* 57 */   protected float getScaleFactor() { throw new RuntimeException("Stub!"); }
/* 58 */   public void setDetachWallpaper(boolean detachWallpaper) { throw new RuntimeException("Stub!"); }
/* 59 */   public Interpolator getInterpolator() { throw new RuntimeException("Stub!"); }
/* 60 */   public long getStartTime() { throw new RuntimeException("Stub!"); }
/* 61 */   public long getDuration() { throw new RuntimeException("Stub!"); }
/* 62 */   public long getStartOffset() { throw new RuntimeException("Stub!"); }
/* 63 */   public int getRepeatMode() { throw new RuntimeException("Stub!"); }
/* 64 */   public int getRepeatCount() { throw new RuntimeException("Stub!"); }
/* 65 */   public boolean getFillBefore() { throw new RuntimeException("Stub!"); }
/* 66 */   public boolean getFillAfter() { throw new RuntimeException("Stub!"); }
/* 67 */   public int getZAdjustment() { throw new RuntimeException("Stub!"); }
/* 68 */   public int getBackgroundColor() { throw new RuntimeException("Stub!"); }
/* 69 */   public boolean getDetachWallpaper() { throw new RuntimeException("Stub!"); }
/* 70 */   public boolean willChangeTransformationMatrix() { throw new RuntimeException("Stub!"); }
/* 71 */   public boolean willChangeBounds() { throw new RuntimeException("Stub!"); }
/* 72 */   public void setAnimationListener(AnimationListener listener) { throw new RuntimeException("Stub!"); }
/* 73 */   protected void ensureInterpolator() { throw new RuntimeException("Stub!"); }
/* 74 */   public long computeDurationHint() { throw new RuntimeException("Stub!"); }
/* 75 */   public boolean getTransformation(long currentTime, Transformation outTransformation) { throw new RuntimeException("Stub!"); }
/* 76 */   public boolean getTransformation(long currentTime, Transformation outTransformation, float scale) { throw new RuntimeException("Stub!"); }
/* 77 */   public boolean hasStarted() { throw new RuntimeException("Stub!"); }
/* 78 */   public boolean hasEnded() { throw new RuntimeException("Stub!"); }
/* 79 */   protected void applyTransformation(float interpolatedTime, Transformation t) { throw new RuntimeException("Stub!"); }
/* 80 */   protected float resolveSize(int type, float value, int size, int parentSize) { throw new RuntimeException("Stub!"); }
/* 81 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\view\animation\Animation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */