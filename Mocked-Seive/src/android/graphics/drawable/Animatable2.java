/*    */ package android.graphics.drawable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract interface Animatable2
/*    */   extends Animatable
/*    */ {
/*    */   public abstract void registerAnimationCallback(AnimationCallback paramAnimationCallback);
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public abstract boolean unregisterAnimationCallback(AnimationCallback paramAnimationCallback);
/*    */   
/*    */ 
/*    */ 
/*    */   public abstract void clearAnimationCallbacks();
/*    */   
/*    */ 
/*    */   public static abstract class AnimationCallback
/*    */   {
/* 23 */     public AnimationCallback() { throw new RuntimeException("Stub!"); }
/* 24 */     public void onAnimationStart(Drawable drawable) { throw new RuntimeException("Stub!"); }
/* 25 */     public void onAnimationEnd(Drawable drawable) { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\graphics\drawable\Animatable2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */