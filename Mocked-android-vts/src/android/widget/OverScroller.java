/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.view.animation.Interpolator;
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
/*    */ 
/*    */ public class OverScroller
/*    */ {
/* 20 */   public OverScroller(Context context) { throw new RuntimeException("Stub!"); }
/* 21 */   public OverScroller(Context context, Interpolator interpolator) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 23 */   public OverScroller(Context context, Interpolator interpolator, float bounceCoefficientX, float bounceCoefficientY) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 25 */   public OverScroller(Context context, Interpolator interpolator, float bounceCoefficientX, float bounceCoefficientY, boolean flywheel) { throw new RuntimeException("Stub!"); }
/* 26 */   public final void setFriction(float friction) { throw new RuntimeException("Stub!"); }
/* 27 */   public final boolean isFinished() { throw new RuntimeException("Stub!"); }
/* 28 */   public final void forceFinished(boolean finished) { throw new RuntimeException("Stub!"); }
/* 29 */   public final int getCurrX() { throw new RuntimeException("Stub!"); }
/* 30 */   public final int getCurrY() { throw new RuntimeException("Stub!"); }
/* 31 */   public float getCurrVelocity() { throw new RuntimeException("Stub!"); }
/* 32 */   public final int getStartX() { throw new RuntimeException("Stub!"); }
/* 33 */   public final int getStartY() { throw new RuntimeException("Stub!"); }
/* 34 */   public final int getFinalX() { throw new RuntimeException("Stub!"); }
/* 35 */   public final int getFinalY() { throw new RuntimeException("Stub!"); }
/* 36 */   public boolean computeScrollOffset() { throw new RuntimeException("Stub!"); }
/* 37 */   public void startScroll(int startX, int startY, int dx, int dy) { throw new RuntimeException("Stub!"); }
/* 38 */   public void startScroll(int startX, int startY, int dx, int dy, int duration) { throw new RuntimeException("Stub!"); }
/* 39 */   public boolean springBack(int startX, int startY, int minX, int maxX, int minY, int maxY) { throw new RuntimeException("Stub!"); }
/* 40 */   public void fling(int startX, int startY, int velocityX, int velocityY, int minX, int maxX, int minY, int maxY) { throw new RuntimeException("Stub!"); }
/* 41 */   public void fling(int startX, int startY, int velocityX, int velocityY, int minX, int maxX, int minY, int maxY, int overX, int overY) { throw new RuntimeException("Stub!"); }
/* 42 */   public void notifyHorizontalEdgeReached(int startX, int finalX, int overX) { throw new RuntimeException("Stub!"); }
/* 43 */   public void notifyVerticalEdgeReached(int startY, int finalY, int overY) { throw new RuntimeException("Stub!"); }
/* 44 */   public boolean isOverScrolled() { throw new RuntimeException("Stub!"); }
/* 45 */   public void abortAnimation() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\widget\OverScroller.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */