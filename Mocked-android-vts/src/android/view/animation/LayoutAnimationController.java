/*    */ package android.view.animation;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.view.View;
/*    */ 
/*    */ public class LayoutAnimationController
/*    */ {
/*    */   public static final int ORDER_NORMAL = 0;
/*    */   public static final int ORDER_RANDOM = 2;
/*    */   public static final int ORDER_REVERSE = 1;
/*    */   protected Animation mAnimation;
/*    */   protected Interpolator mInterpolator;
/*    */   protected java.util.Random mRandomizer;
/*    */   
/*    */   public static class AnimationParameters
/*    */   {
/*    */     public int count;
/*    */     public int index;
/*    */     
/*    */     public AnimationParameters()
/*    */     {
/* 22 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */   
/* 26 */   public LayoutAnimationController(Context context, android.util.AttributeSet attrs) { throw new RuntimeException("Stub!"); }
/* 27 */   public LayoutAnimationController(Animation animation) { throw new RuntimeException("Stub!"); }
/* 28 */   public LayoutAnimationController(Animation animation, float delay) { throw new RuntimeException("Stub!"); }
/* 29 */   public int getOrder() { throw new RuntimeException("Stub!"); }
/* 30 */   public void setOrder(int order) { throw new RuntimeException("Stub!"); }
/* 31 */   public void setAnimation(Context context, int resourceID) { throw new RuntimeException("Stub!"); }
/* 32 */   public void setAnimation(Animation animation) { throw new RuntimeException("Stub!"); }
/* 33 */   public Animation getAnimation() { throw new RuntimeException("Stub!"); }
/* 34 */   public void setInterpolator(Context context, int resourceID) { throw new RuntimeException("Stub!"); }
/* 35 */   public void setInterpolator(Interpolator interpolator) { throw new RuntimeException("Stub!"); }
/* 36 */   public Interpolator getInterpolator() { throw new RuntimeException("Stub!"); }
/* 37 */   public float getDelay() { throw new RuntimeException("Stub!"); }
/* 38 */   public void setDelay(float delay) { throw new RuntimeException("Stub!"); }
/* 39 */   public boolean willOverlap() { throw new RuntimeException("Stub!"); }
/* 40 */   public void start() { throw new RuntimeException("Stub!"); }
/* 41 */   public final Animation getAnimationForView(View view) { throw new RuntimeException("Stub!"); }
/* 42 */   public boolean isDone() { throw new RuntimeException("Stub!"); }
/* 43 */   protected long getDelayForView(View view) { throw new RuntimeException("Stub!"); }
/* 44 */   protected int getTransformedIndex(AnimationParameters params) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\view\animation\LayoutAnimationController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */