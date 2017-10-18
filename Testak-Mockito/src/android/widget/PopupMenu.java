/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.view.Menu;
/*    */ import android.view.MenuInflater;
/*    */ import android.view.MenuItem;
/*    */ import android.view.View;
/*    */ import android.view.View.OnTouchListener;
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
/*    */ public class PopupMenu
/*    */ {
/* 28 */   public PopupMenu(Context context, View anchor) { throw new RuntimeException("Stub!"); }
/* 29 */   public PopupMenu(Context context, View anchor, int gravity) { throw new RuntimeException("Stub!"); }
/* 30 */   public PopupMenu(Context context, View anchor, int gravity, int popupStyleAttr, int popupStyleRes) { throw new RuntimeException("Stub!"); }
/* 31 */   public void setGravity(int gravity) { throw new RuntimeException("Stub!"); }
/* 32 */   public int getGravity() { throw new RuntimeException("Stub!"); }
/* 33 */   public View.OnTouchListener getDragToOpenListener() { throw new RuntimeException("Stub!"); }
/* 34 */   public Menu getMenu() { throw new RuntimeException("Stub!"); }
/* 35 */   public MenuInflater getMenuInflater() { throw new RuntimeException("Stub!"); }
/* 36 */   public void inflate(int menuRes) { throw new RuntimeException("Stub!"); }
/* 37 */   public void show() { throw new RuntimeException("Stub!"); }
/* 38 */   public void dismiss() { throw new RuntimeException("Stub!"); }
/* 39 */   public void setOnMenuItemClickListener(OnMenuItemClickListener listener) { throw new RuntimeException("Stub!"); }
/* 40 */   public void setOnDismissListener(OnDismissListener listener) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface OnDismissListener
/*    */   {
/*    */     public abstract void onDismiss(PopupMenu paramPopupMenu);
/*    */   }
/*    */   
/*    */   public static abstract interface OnMenuItemClickListener
/*    */   {
/*    */     public abstract boolean onMenuItemClick(MenuItem paramMenuItem);
/*    */   }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\widget\PopupMenu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */