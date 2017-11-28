/*    */ package android.app;
/*    */ 
/*    */ import android.view.View;
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
/*    */ public abstract class FragmentContainer
/*    */ {
/*    */   public FragmentContainer()
/*    */   {
/* 20 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract <T extends View> T onFindViewById(int paramInt);
/*    */   
/*    */   public abstract boolean onHasView();
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\app\FragmentContainer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */