/*    */ package android.transition;
/*    */ 
/*    */ import android.view.ViewGroup;
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
/*    */ public abstract class TransitionPropagation
/*    */ {
/*    */   public TransitionPropagation()
/*    */   {
/* 19 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract long getStartDelay(ViewGroup paramViewGroup, Transition paramTransition, TransitionValues paramTransitionValues1, TransitionValues paramTransitionValues2);
/*    */   
/*    */   public abstract void captureValues(TransitionValues paramTransitionValues);
/*    */   
/*    */   public abstract String[] getPropagationProperties();
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\transition\TransitionPropagation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */