/*    */ package android.animation;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class Animator
/*    */   implements Cloneable
/*    */ {
/*    */   public static final long DURATION_INFINITE = -1L;
/*    */   
/*    */   public static abstract interface AnimatorPauseListener
/*    */   {
/*    */     public abstract void onAnimationPause(Animator paramAnimator);
/*    */     
/*    */     public abstract void onAnimationResume(Animator paramAnimator);
/*    */   }
/*    */   
/*    */   public static abstract interface AnimatorListener
/*    */   {
/* 23 */     public void onAnimationStart(Animator animation, boolean isReverse) { throw new RuntimeException("Stub!"); }
/* 24 */     public void onAnimationEnd(Animator animation, boolean isReverse) { throw new RuntimeException("Stub!"); }
/*    */     
/*    */     public abstract void onAnimationStart(Animator paramAnimator);
/*    */     
/*    */     public abstract void onAnimationEnd(Animator paramAnimator);
/*    */     
/*    */     public abstract void onAnimationCancel(Animator paramAnimator);
/*    */     
/*    */     public abstract void onAnimationRepeat(Animator paramAnimator);
/*    */   }
/*    */   
/* 35 */   public Animator() { throw new RuntimeException("Stub!"); }
/* 36 */   public void start() { throw new RuntimeException("Stub!"); }
/* 37 */   public void cancel() { throw new RuntimeException("Stub!"); }
/* 38 */   public void end() { throw new RuntimeException("Stub!"); }
/* 39 */   public void pause() { throw new RuntimeException("Stub!"); }
/* 40 */   public void resume() { throw new RuntimeException("Stub!"); }
/* 41 */   public boolean isPaused() { throw new RuntimeException("Stub!"); }
/*    */   public abstract long getStartDelay();
/*    */   public abstract void setStartDelay(long paramLong);
/*    */   public abstract Animator setDuration(long paramLong);
/*    */   public abstract long getDuration();
/* 46 */   public long getTotalDuration() { throw new RuntimeException("Stub!"); }
/*    */   public abstract void setInterpolator(TimeInterpolator paramTimeInterpolator);
/* 48 */   public TimeInterpolator getInterpolator() { throw new RuntimeException("Stub!"); }
/*    */   public abstract boolean isRunning();
/* 50 */   public boolean isStarted() { throw new RuntimeException("Stub!"); }
/* 51 */   public void addListener(AnimatorListener listener) { throw new RuntimeException("Stub!"); }
/* 52 */   public void removeListener(AnimatorListener listener) { throw new RuntimeException("Stub!"); }
/* 53 */   public ArrayList<AnimatorListener> getListeners() { throw new RuntimeException("Stub!"); }
/* 54 */   public void addPauseListener(AnimatorPauseListener listener) { throw new RuntimeException("Stub!"); }
/* 55 */   public void removePauseListener(AnimatorPauseListener listener) { throw new RuntimeException("Stub!"); }
/* 56 */   public void removeAllListeners() { throw new RuntimeException("Stub!"); }
/* 57 */   public Animator clone() { throw new RuntimeException("Stub!"); }
/* 58 */   public void setupStartValues() { throw new RuntimeException("Stub!"); }
/* 59 */   public void setupEndValues() { throw new RuntimeException("Stub!"); }
/* 60 */   public void setTarget(Object target) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\animation\Animator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */