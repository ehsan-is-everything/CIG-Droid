/*    */ package android.transition;
/*    */ 
/*    */ import android.animation.Animator;
/*    */ import android.animation.TimeInterpolator;
/*    */ import android.content.Context;
/*    */ import android.graphics.Rect;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.View;
/*    */ import android.view.ViewGroup;
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
/*    */ public abstract class Transition
/*    */   implements Cloneable
/*    */ {
/*    */   public static final int MATCH_ID = 3;
/*    */   public static final int MATCH_INSTANCE = 1;
/*    */   public static final int MATCH_ITEM_ID = 4;
/*    */   public static final int MATCH_NAME = 2;
/*    */   
/*    */   public static abstract class EpicenterCallback
/*    */   {
/* 31 */     public EpicenterCallback() { throw new RuntimeException("Stub!"); }
/*    */     
/*    */     public abstract Rect onGetEpicenter(Transition paramTransition); }
/* 34 */   public Transition() { throw new RuntimeException("Stub!"); }
/* 35 */   public Transition(Context context, AttributeSet attrs) { throw new RuntimeException("Stub!"); }
/* 36 */   public Transition setDuration(long duration) { throw new RuntimeException("Stub!"); }
/* 37 */   public long getDuration() { throw new RuntimeException("Stub!"); }
/* 38 */   public Transition setStartDelay(long startDelay) { throw new RuntimeException("Stub!"); }
/* 39 */   public long getStartDelay() { throw new RuntimeException("Stub!"); }
/* 40 */   public Transition setInterpolator(TimeInterpolator interpolator) { throw new RuntimeException("Stub!"); }
/* 41 */   public TimeInterpolator getInterpolator() { throw new RuntimeException("Stub!"); }
/* 42 */   public String[] getTransitionProperties() { throw new RuntimeException("Stub!"); }
/* 43 */   public Animator createAnimator(ViewGroup sceneRoot, TransitionValues startValues, TransitionValues endValues) { throw new RuntimeException("Stub!"); }
/* 44 */   public void setMatchOrder(int... matches) { throw new RuntimeException("Stub!"); }
/*    */   public abstract void captureStartValues(TransitionValues paramTransitionValues);
/*    */   public abstract void captureEndValues(TransitionValues paramTransitionValues);
/* 47 */   public Transition addTarget(int targetId) { throw new RuntimeException("Stub!"); }
/* 48 */   public Transition addTarget(String targetName) { throw new RuntimeException("Stub!"); }
/* 49 */   public Transition addTarget(Class targetType) { throw new RuntimeException("Stub!"); }
/* 50 */   public Transition removeTarget(int targetId) { throw new RuntimeException("Stub!"); }
/* 51 */   public Transition removeTarget(String targetName) { throw new RuntimeException("Stub!"); }
/* 52 */   public Transition excludeTarget(int targetId, boolean exclude) { throw new RuntimeException("Stub!"); }
/* 53 */   public Transition excludeTarget(String targetName, boolean exclude) { throw new RuntimeException("Stub!"); }
/* 54 */   public Transition excludeChildren(int targetId, boolean exclude) { throw new RuntimeException("Stub!"); }
/* 55 */   public Transition excludeTarget(View target, boolean exclude) { throw new RuntimeException("Stub!"); }
/* 56 */   public Transition excludeChildren(View target, boolean exclude) { throw new RuntimeException("Stub!"); }
/* 57 */   public Transition excludeTarget(Class type, boolean exclude) { throw new RuntimeException("Stub!"); }
/* 58 */   public Transition excludeChildren(Class type, boolean exclude) { throw new RuntimeException("Stub!"); }
/* 59 */   public Transition addTarget(View target) { throw new RuntimeException("Stub!"); }
/* 60 */   public Transition removeTarget(View target) { throw new RuntimeException("Stub!"); }
/* 61 */   public Transition removeTarget(Class target) { throw new RuntimeException("Stub!"); }
/* 62 */   public List<Integer> getTargetIds() { throw new RuntimeException("Stub!"); }
/* 63 */   public List<View> getTargets() { throw new RuntimeException("Stub!"); }
/* 64 */   public List<String> getTargetNames() { throw new RuntimeException("Stub!"); }
/* 65 */   public List<Class> getTargetTypes() { throw new RuntimeException("Stub!"); }
/* 66 */   public TransitionValues getTransitionValues(View view, boolean start) { throw new RuntimeException("Stub!"); }
/* 67 */   public boolean isTransitionRequired(TransitionValues startValues, TransitionValues endValues) { throw new RuntimeException("Stub!"); }
/* 68 */   public Transition addListener(TransitionListener listener) { throw new RuntimeException("Stub!"); }
/* 69 */   public Transition removeListener(TransitionListener listener) { throw new RuntimeException("Stub!"); }
/* 70 */   public void setEpicenterCallback(EpicenterCallback epicenterCallback) { throw new RuntimeException("Stub!"); }
/* 71 */   public EpicenterCallback getEpicenterCallback() { throw new RuntimeException("Stub!"); }
/* 72 */   public Rect getEpicenter() { throw new RuntimeException("Stub!"); }
/* 73 */   public void setPathMotion(PathMotion pathMotion) { throw new RuntimeException("Stub!"); }
/* 74 */   public PathMotion getPathMotion() { throw new RuntimeException("Stub!"); }
/* 75 */   public void setPropagation(TransitionPropagation transitionPropagation) { throw new RuntimeException("Stub!"); }
/* 76 */   public TransitionPropagation getPropagation() { throw new RuntimeException("Stub!"); }
/* 77 */   public boolean canRemoveViews() { throw new RuntimeException("Stub!"); }
/* 78 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 79 */   public Transition clone() { throw new RuntimeException("Stub!"); }
/* 80 */   public String getName() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface TransitionListener
/*    */   {
/*    */     public abstract void onTransitionStart(Transition paramTransition);
/*    */     
/*    */     public abstract void onTransitionEnd(Transition paramTransition);
/*    */     
/*    */     public abstract void onTransitionCancel(Transition paramTransition);
/*    */     
/*    */     public abstract void onTransitionPause(Transition paramTransition);
/*    */     
/*    */     public abstract void onTransitionResume(Transition paramTransition);
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\transition\Transition.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */