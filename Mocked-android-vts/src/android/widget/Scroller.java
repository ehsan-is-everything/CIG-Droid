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
/*    */ public class Scroller
/*    */ {
/* 20 */   public Scroller(Context context) { throw new RuntimeException("Stub!"); }
/* 21 */   public Scroller(Context context, Interpolator interpolator) { throw new RuntimeException("Stub!"); }
/* 22 */   public Scroller(Context context, Interpolator interpolator, boolean flywheel) { throw new RuntimeException("Stub!"); }
/* 23 */   public final void setFriction(float friction) { throw new RuntimeException("Stub!"); }
/* 24 */   public final boolean isFinished() { throw new RuntimeException("Stub!"); }
/* 25 */   public final void forceFinished(boolean finished) { throw new RuntimeException("Stub!"); }
/* 26 */   public final int getDuration() { throw new RuntimeException("Stub!"); }
/* 27 */   public final int getCurrX() { throw new RuntimeException("Stub!"); }
/* 28 */   public final int getCurrY() { throw new RuntimeException("Stub!"); }
/* 29 */   public float getCurrVelocity() { throw new RuntimeException("Stub!"); }
/* 30 */   public final int getStartX() { throw new RuntimeException("Stub!"); }
/* 31 */   public final int getStartY() { throw new RuntimeException("Stub!"); }
/* 32 */   public final int getFinalX() { throw new RuntimeException("Stub!"); }
/* 33 */   public final int getFinalY() { throw new RuntimeException("Stub!"); }
/* 34 */   public boolean computeScrollOffset() { throw new RuntimeException("Stub!"); }
/* 35 */   public void startScroll(int startX, int startY, int dx, int dy) { throw new RuntimeException("Stub!"); }
/* 36 */   public void startScroll(int startX, int startY, int dx, int dy, int duration) { throw new RuntimeException("Stub!"); }
/* 37 */   public void fling(int startX, int startY, int velocityX, int velocityY, int minX, int maxX, int minY, int maxY) { throw new RuntimeException("Stub!"); }
/* 38 */   public void abortAnimation() { throw new RuntimeException("Stub!"); }
/* 39 */   public void extendDuration(int extend) { throw new RuntimeException("Stub!"); }
/* 40 */   public int timePassed() { throw new RuntimeException("Stub!"); }
/* 41 */   public void setFinalX(int newX) { throw new RuntimeException("Stub!"); }
/* 42 */   public void setFinalY(int newY) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\widget\Scroller.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */