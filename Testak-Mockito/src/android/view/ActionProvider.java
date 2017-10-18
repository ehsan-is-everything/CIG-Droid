/*    */ package android.view;
/*    */ 
/*    */ import android.content.Context;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class ActionProvider
/*    */ {
/* 24 */   public ActionProvider(Context context) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/*    */   public abstract View onCreateActionView();
/* 27 */   public View onCreateActionView(MenuItem forItem) { throw new RuntimeException("Stub!"); }
/* 28 */   public boolean overridesItemVisibility() { throw new RuntimeException("Stub!"); }
/* 29 */   public boolean isVisible() { throw new RuntimeException("Stub!"); }
/* 30 */   public void refreshVisibility() { throw new RuntimeException("Stub!"); }
/* 31 */   public boolean onPerformDefaultAction() { throw new RuntimeException("Stub!"); }
/* 32 */   public boolean hasSubMenu() { throw new RuntimeException("Stub!"); }
/* 33 */   public void onPrepareSubMenu(SubMenu subMenu) { throw new RuntimeException("Stub!"); }
/* 34 */   public void setVisibilityListener(VisibilityListener listener) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface VisibilityListener
/*    */   {
/*    */     public abstract void onActionProviderVisibilityChanged(boolean paramBoolean);
/*    */   }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\view\ActionProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */