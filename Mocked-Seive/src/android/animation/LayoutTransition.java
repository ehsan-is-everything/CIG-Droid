/*    */ package android.animation;
/*    */ 
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
/*    */ 
/*    */ public class LayoutTransition
/*    */ {
/*    */   public static final int APPEARING = 2;
/*    */   public static final int CHANGE_APPEARING = 0;
/*    */   public static final int CHANGE_DISAPPEARING = 1;
/*    */   public static final int CHANGING = 4;
/*    */   public static final int DISAPPEARING = 3;
/*    */   
/* 25 */   public LayoutTransition() { throw new RuntimeException("Stub!"); }
/* 26 */   public void setDuration(long duration) { throw new RuntimeException("Stub!"); }
/* 27 */   public void enableTransitionType(int transitionType) { throw new RuntimeException("Stub!"); }
/* 28 */   public void disableTransitionType(int transitionType) { throw new RuntimeException("Stub!"); }
/* 29 */   public boolean isTransitionTypeEnabled(int transitionType) { throw new RuntimeException("Stub!"); }
/* 30 */   public void setStartDelay(int transitionType, long delay) { throw new RuntimeException("Stub!"); }
/* 31 */   public long getStartDelay(int transitionType) { throw new RuntimeException("Stub!"); }
/* 32 */   public void setDuration(int transitionType, long duration) { throw new RuntimeException("Stub!"); }
/* 33 */   public long getDuration(int transitionType) { throw new RuntimeException("Stub!"); }
/* 34 */   public void setStagger(int transitionType, long duration) { throw new RuntimeException("Stub!"); }
/* 35 */   public long getStagger(int transitionType) { throw new RuntimeException("Stub!"); }
/* 36 */   public void setInterpolator(int transitionType, TimeInterpolator interpolator) { throw new RuntimeException("Stub!"); }
/* 37 */   public TimeInterpolator getInterpolator(int transitionType) { throw new RuntimeException("Stub!"); }
/* 38 */   public void setAnimator(int transitionType, Animator animator) { throw new RuntimeException("Stub!"); }
/* 39 */   public Animator getAnimator(int transitionType) { throw new RuntimeException("Stub!"); }
/* 40 */   public void setAnimateParentHierarchy(boolean animateParentHierarchy) { throw new RuntimeException("Stub!"); }
/* 41 */   public boolean isChangingLayout() { throw new RuntimeException("Stub!"); }
/* 42 */   public boolean isRunning() { throw new RuntimeException("Stub!"); }
/* 43 */   public void addChild(ViewGroup parent, View child) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 45 */   public void showChild(ViewGroup parent, View child) { throw new RuntimeException("Stub!"); }
/* 46 */   public void showChild(ViewGroup parent, View child, int oldVisibility) { throw new RuntimeException("Stub!"); }
/* 47 */   public void removeChild(ViewGroup parent, View child) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 49 */   public void hideChild(ViewGroup parent, View child) { throw new RuntimeException("Stub!"); }
/* 50 */   public void hideChild(ViewGroup parent, View child, int newVisibility) { throw new RuntimeException("Stub!"); }
/* 51 */   public void addTransitionListener(TransitionListener listener) { throw new RuntimeException("Stub!"); }
/* 52 */   public void removeTransitionListener(TransitionListener listener) { throw new RuntimeException("Stub!"); }
/* 53 */   public List<TransitionListener> getTransitionListeners() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface TransitionListener
/*    */   {
/*    */     public abstract void startTransition(LayoutTransition paramLayoutTransition, ViewGroup paramViewGroup, View paramView, int paramInt);
/*    */     
/*    */     public abstract void endTransition(LayoutTransition paramLayoutTransition, ViewGroup paramViewGroup, View paramView, int paramInt);
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\animation\LayoutTransition.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */