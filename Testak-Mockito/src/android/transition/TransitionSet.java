/*    */ package android.transition;
/*    */ 
/*    */ import android.animation.TimeInterpolator;
/*    */ import android.content.Context;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.View;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class TransitionSet
/*    */   extends Transition
/*    */ {
/*    */   public static final int ORDERING_SEQUENTIAL = 1;
/*    */   public static final int ORDERING_TOGETHER = 0;
/*    */   
/* 21 */   public TransitionSet() { throw new RuntimeException("Stub!"); }
/* 22 */   public TransitionSet(Context context, AttributeSet attrs) { throw new RuntimeException("Stub!"); }
/* 23 */   public TransitionSet setOrdering(int ordering) { throw new RuntimeException("Stub!"); }
/* 24 */   public int getOrdering() { throw new RuntimeException("Stub!"); }
/* 25 */   public TransitionSet addTransition(Transition transition) { throw new RuntimeException("Stub!"); }
/* 26 */   public int getTransitionCount() { throw new RuntimeException("Stub!"); }
/* 27 */   public Transition getTransitionAt(int index) { throw new RuntimeException("Stub!"); }
/* 28 */   public TransitionSet setDuration(long duration) { throw new RuntimeException("Stub!"); }
/* 29 */   public TransitionSet setStartDelay(long startDelay) { throw new RuntimeException("Stub!"); }
/* 30 */   public TransitionSet setInterpolator(TimeInterpolator interpolator) { throw new RuntimeException("Stub!"); }
/* 31 */   public TransitionSet addTarget(View target) { throw new RuntimeException("Stub!"); }
/* 32 */   public TransitionSet addTarget(int targetId) { throw new RuntimeException("Stub!"); }
/* 33 */   public TransitionSet addTarget(String targetName) { throw new RuntimeException("Stub!"); }
/* 34 */   public TransitionSet addTarget(Class targetType) { throw new RuntimeException("Stub!"); }
/* 35 */   public TransitionSet addListener(Transition.TransitionListener listener) { throw new RuntimeException("Stub!"); }
/* 36 */   public TransitionSet removeTarget(int targetId) { throw new RuntimeException("Stub!"); }
/* 37 */   public TransitionSet removeTarget(View target) { throw new RuntimeException("Stub!"); }
/* 38 */   public TransitionSet removeTarget(Class target) { throw new RuntimeException("Stub!"); }
/* 39 */   public TransitionSet removeTarget(String target) { throw new RuntimeException("Stub!"); }
/* 40 */   public Transition excludeTarget(View target, boolean exclude) { throw new RuntimeException("Stub!"); }
/* 41 */   public Transition excludeTarget(String targetName, boolean exclude) { throw new RuntimeException("Stub!"); }
/* 42 */   public Transition excludeTarget(int targetId, boolean exclude) { throw new RuntimeException("Stub!"); }
/* 43 */   public Transition excludeTarget(Class type, boolean exclude) { throw new RuntimeException("Stub!"); }
/* 44 */   public TransitionSet removeListener(Transition.TransitionListener listener) { throw new RuntimeException("Stub!"); }
/* 45 */   public void setPathMotion(PathMotion pathMotion) { throw new RuntimeException("Stub!"); }
/* 46 */   public TransitionSet removeTransition(Transition transition) { throw new RuntimeException("Stub!"); }
/* 47 */   public void captureStartValues(TransitionValues transitionValues) { throw new RuntimeException("Stub!"); }
/* 48 */   public void captureEndValues(TransitionValues transitionValues) { throw new RuntimeException("Stub!"); }
/* 49 */   public void setPropagation(TransitionPropagation propagation) { throw new RuntimeException("Stub!"); }
/* 50 */   public void setEpicenterCallback(Transition.EpicenterCallback epicenterCallback) { throw new RuntimeException("Stub!"); }
/* 51 */   public TransitionSet clone() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\transition\TransitionSet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */