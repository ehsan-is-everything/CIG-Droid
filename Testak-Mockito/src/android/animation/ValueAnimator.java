/*    */ package android.animation;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ValueAnimator
/*    */   extends Animator
/*    */ {
/*    */   public static final int INFINITE = -1;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public static final int RESTART = 1;
/*    */   
/*    */ 
/*    */ 
/*    */   public static final int REVERSE = 2;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 26 */   public ValueAnimator() { throw new RuntimeException("Stub!"); }
/* 27 */   public static boolean areAnimatorsEnabled() { throw new RuntimeException("Stub!"); }
/* 28 */   public static ValueAnimator ofInt(int... values) { throw new RuntimeException("Stub!"); }
/* 29 */   public static ValueAnimator ofArgb(int... values) { throw new RuntimeException("Stub!"); }
/* 30 */   public static ValueAnimator ofFloat(float... values) { throw new RuntimeException("Stub!"); }
/* 31 */   public static ValueAnimator ofPropertyValuesHolder(PropertyValuesHolder... values) { throw new RuntimeException("Stub!"); }
/* 32 */   public static ValueAnimator ofObject(TypeEvaluator evaluator, Object... values) { throw new RuntimeException("Stub!"); }
/* 33 */   public void setIntValues(int... values) { throw new RuntimeException("Stub!"); }
/* 34 */   public void setFloatValues(float... values) { throw new RuntimeException("Stub!"); }
/* 35 */   public void setObjectValues(Object... values) { throw new RuntimeException("Stub!"); }
/* 36 */   public void setValues(PropertyValuesHolder... values) { throw new RuntimeException("Stub!"); }
/* 37 */   public PropertyValuesHolder[] getValues() { throw new RuntimeException("Stub!"); }
/* 38 */   public ValueAnimator setDuration(long duration) { throw new RuntimeException("Stub!"); }
/* 39 */   public long getDuration() { throw new RuntimeException("Stub!"); }
/* 40 */   public long getTotalDuration() { throw new RuntimeException("Stub!"); }
/* 41 */   public void setCurrentPlayTime(long playTime) { throw new RuntimeException("Stub!"); }
/* 42 */   public void setCurrentFraction(float fraction) { throw new RuntimeException("Stub!"); }
/* 43 */   public long getCurrentPlayTime() { throw new RuntimeException("Stub!"); }
/* 44 */   public long getStartDelay() { throw new RuntimeException("Stub!"); }
/* 45 */   public void setStartDelay(long startDelay) { throw new RuntimeException("Stub!"); }
/* 46 */   public static long getFrameDelay() { throw new RuntimeException("Stub!"); }
/* 47 */   public static void setFrameDelay(long frameDelay) { throw new RuntimeException("Stub!"); }
/* 48 */   public Object getAnimatedValue() { throw new RuntimeException("Stub!"); }
/* 49 */   public Object getAnimatedValue(String propertyName) { throw new RuntimeException("Stub!"); }
/* 50 */   public void setRepeatCount(int value) { throw new RuntimeException("Stub!"); }
/* 51 */   public int getRepeatCount() { throw new RuntimeException("Stub!"); }
/* 52 */   public void setRepeatMode(int value) { throw new RuntimeException("Stub!"); }
/* 53 */   public int getRepeatMode() { throw new RuntimeException("Stub!"); }
/* 54 */   public void addUpdateListener(AnimatorUpdateListener listener) { throw new RuntimeException("Stub!"); }
/* 55 */   public void removeAllUpdateListeners() { throw new RuntimeException("Stub!"); }
/* 56 */   public void removeUpdateListener(AnimatorUpdateListener listener) { throw new RuntimeException("Stub!"); }
/* 57 */   public void setInterpolator(TimeInterpolator value) { throw new RuntimeException("Stub!"); }
/* 58 */   public TimeInterpolator getInterpolator() { throw new RuntimeException("Stub!"); }
/* 59 */   public void setEvaluator(TypeEvaluator value) { throw new RuntimeException("Stub!"); }
/* 60 */   public void start() { throw new RuntimeException("Stub!"); }
/* 61 */   public void cancel() { throw new RuntimeException("Stub!"); }
/* 62 */   public void end() { throw new RuntimeException("Stub!"); }
/* 63 */   public void resume() { throw new RuntimeException("Stub!"); }
/* 64 */   public void pause() { throw new RuntimeException("Stub!"); }
/* 65 */   public boolean isRunning() { throw new RuntimeException("Stub!"); }
/* 66 */   public boolean isStarted() { throw new RuntimeException("Stub!"); }
/* 67 */   public void reverse() { throw new RuntimeException("Stub!"); }
/* 68 */   public float getAnimatedFraction() { throw new RuntimeException("Stub!"); }
/* 69 */   public ValueAnimator clone() { throw new RuntimeException("Stub!"); }
/* 70 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface AnimatorUpdateListener
/*    */   {
/*    */     public abstract void onAnimationUpdate(ValueAnimator paramValueAnimator);
/*    */   }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\animation\ValueAnimator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */