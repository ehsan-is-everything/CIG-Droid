/*    */ package android.animation;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class AnimatorSet
/*    */   extends Animator
/*    */ {
/*    */   public class Builder
/*    */   {
/* 23 */     Builder() { throw new RuntimeException("Stub!"); }
/* 24 */     public Builder with(Animator anim) { throw new RuntimeException("Stub!"); }
/* 25 */     public Builder before(Animator anim) { throw new RuntimeException("Stub!"); }
/* 26 */     public Builder after(Animator anim) { throw new RuntimeException("Stub!"); }
/* 27 */     public Builder after(long delay) { throw new RuntimeException("Stub!"); } }
/*    */   
/* 29 */   public AnimatorSet() { throw new RuntimeException("Stub!"); }
/* 30 */   public void playTogether(Animator... items) { throw new RuntimeException("Stub!"); }
/* 31 */   public void playTogether(Collection<Animator> items) { throw new RuntimeException("Stub!"); }
/* 32 */   public void playSequentially(Animator... items) { throw new RuntimeException("Stub!"); }
/* 33 */   public void playSequentially(List<Animator> items) { throw new RuntimeException("Stub!"); }
/* 34 */   public ArrayList<Animator> getChildAnimations() { throw new RuntimeException("Stub!"); }
/* 35 */   public void setTarget(Object target) { throw new RuntimeException("Stub!"); }
/* 36 */   public void setInterpolator(TimeInterpolator interpolator) { throw new RuntimeException("Stub!"); }
/* 37 */   public TimeInterpolator getInterpolator() { throw new RuntimeException("Stub!"); }
/* 38 */   public Builder play(Animator anim) { throw new RuntimeException("Stub!"); }
/*    */   
/* 40 */   public void cancel() { throw new RuntimeException("Stub!"); }
/* 41 */   public void end() { throw new RuntimeException("Stub!"); }
/* 42 */   public boolean isRunning() { throw new RuntimeException("Stub!"); }
/* 43 */   public boolean isStarted() { throw new RuntimeException("Stub!"); }
/* 44 */   public long getStartDelay() { throw new RuntimeException("Stub!"); }
/* 45 */   public void setStartDelay(long startDelay) { throw new RuntimeException("Stub!"); }
/* 46 */   public long getDuration() { throw new RuntimeException("Stub!"); }
/* 47 */   public AnimatorSet setDuration(long duration) { throw new RuntimeException("Stub!"); }
/* 48 */   public void setupStartValues() { throw new RuntimeException("Stub!"); }
/* 49 */   public void setupEndValues() { throw new RuntimeException("Stub!"); }
/* 50 */   public void pause() { throw new RuntimeException("Stub!"); }
/* 51 */   public void resume() { throw new RuntimeException("Stub!"); }
/*    */   
/* 53 */   public void start() { throw new RuntimeException("Stub!"); }
/* 54 */   public void setCurrentPlayTime(long playTime) { throw new RuntimeException("Stub!"); }
/* 55 */   public long getCurrentPlayTime() { throw new RuntimeException("Stub!"); }
/* 56 */   public AnimatorSet clone() { throw new RuntimeException("Stub!"); }
/* 57 */   public void reverse() { throw new RuntimeException("Stub!"); }
/* 58 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 59 */   public long getTotalDuration() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\animation\AnimatorSet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */