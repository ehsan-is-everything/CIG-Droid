/*    */ package android.transition;
/*    */ 
/*    */ import android.animation.Animator;
/*    */ import android.content.Context;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.View;
/*    */ import android.view.ViewGroup;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class Visibility
/*    */   extends Transition
/*    */ {
/*    */   public static final int MODE_IN = 1;
/*    */   public static final int MODE_OUT = 2;
/*    */   
/* 21 */   public Visibility() { throw new RuntimeException("Stub!"); }
/* 22 */   public Visibility(Context context, AttributeSet attrs) { throw new RuntimeException("Stub!"); }
/* 23 */   public void setMode(int mode) { throw new RuntimeException("Stub!"); }
/* 24 */   public int getMode() { throw new RuntimeException("Stub!"); }
/* 25 */   public String[] getTransitionProperties() { throw new RuntimeException("Stub!"); }
/* 26 */   public void captureStartValues(TransitionValues transitionValues) { throw new RuntimeException("Stub!"); }
/* 27 */   public void captureEndValues(TransitionValues transitionValues) { throw new RuntimeException("Stub!"); }
/* 28 */   public boolean isVisible(TransitionValues values) { throw new RuntimeException("Stub!"); }
/* 29 */   public Animator createAnimator(ViewGroup sceneRoot, TransitionValues startValues, TransitionValues endValues) { throw new RuntimeException("Stub!"); }
/* 30 */   public Animator onAppear(ViewGroup sceneRoot, TransitionValues startValues, int startVisibility, TransitionValues endValues, int endVisibility) { throw new RuntimeException("Stub!"); }
/* 31 */   public Animator onAppear(ViewGroup sceneRoot, View view, TransitionValues startValues, TransitionValues endValues) { throw new RuntimeException("Stub!"); }
/* 32 */   public Animator onDisappear(ViewGroup sceneRoot, TransitionValues startValues, int startVisibility, TransitionValues endValues, int endVisibility) { throw new RuntimeException("Stub!"); }
/* 33 */   public boolean isTransitionRequired(TransitionValues startValues, TransitionValues newValues) { throw new RuntimeException("Stub!"); }
/* 34 */   public Animator onDisappear(ViewGroup sceneRoot, View view, TransitionValues startValues, TransitionValues endValues) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\transition\Visibility.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */