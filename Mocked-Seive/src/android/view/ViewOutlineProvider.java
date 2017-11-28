/*    */ package android.view;
/*    */ 
/*    */ import android.graphics.Outline;
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
/*    */ public abstract class ViewOutlineProvider
/*    */ {
/*    */   public ViewOutlineProvider()
/*    */   {
/* 20 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */ 
/*    */ 
/* 25 */   public static final ViewOutlineProvider PADDED_BOUNDS = null; public static final ViewOutlineProvider BOUNDS = null; public static final ViewOutlineProvider BACKGROUND = null;
/*    */   
/*    */   public abstract void getOutline(View paramView, Outline paramOutline);
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\view\ViewOutlineProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */