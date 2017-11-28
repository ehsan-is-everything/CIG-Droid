/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.content.res.Configuration;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.Menu;
/*    */ import android.view.MenuItem;
/*    */ import android.view.ViewGroup.LayoutParams;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ActionMenuView
/*    */   extends LinearLayout
/*    */ {
/*    */   public static class LayoutParams
/*    */     extends LinearLayout.LayoutParams
/*    */   {
/*    */     public LayoutParams(Context c, AttributeSet attrs)
/*    */     {
/* 27 */       super();throw new RuntimeException("Stub!"); }
/* 28 */     public LayoutParams(ViewGroup.LayoutParams other) { super();throw new RuntimeException("Stub!"); }
/* 29 */     public LayoutParams(LayoutParams other) { super();throw new RuntimeException("Stub!"); }
/* 30 */     public LayoutParams(int width, int height) { super();throw new RuntimeException("Stub!"); } }
/*    */   
/* 32 */   public ActionMenuView(Context context) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 33 */   public ActionMenuView(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 34 */   public void setPopupTheme(int resId) { throw new RuntimeException("Stub!"); }
/* 35 */   public int getPopupTheme() { throw new RuntimeException("Stub!"); }
/* 36 */   public void onConfigurationChanged(Configuration newConfig) { throw new RuntimeException("Stub!"); }
/* 37 */   public void setOnMenuItemClickListener(OnMenuItemClickListener listener) { throw new RuntimeException("Stub!"); }
/* 38 */   protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
/* 39 */   protected void onLayout(boolean changed, int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
/* 40 */   public void onDetachedFromWindow() { throw new RuntimeException("Stub!"); }
/* 41 */   public void setOverflowIcon(Drawable icon) { throw new RuntimeException("Stub!"); }
/* 42 */   public Drawable getOverflowIcon() { throw new RuntimeException("Stub!"); }
/* 43 */   protected LayoutParams generateDefaultLayoutParams() { throw new RuntimeException("Stub!"); }
/* 44 */   public LayoutParams generateLayoutParams(AttributeSet attrs) { throw new RuntimeException("Stub!"); }
/* 45 */   protected LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) { throw new RuntimeException("Stub!"); }
/* 46 */   protected boolean checkLayoutParams(ViewGroup.LayoutParams p) { throw new RuntimeException("Stub!"); }
/* 47 */   public Menu getMenu() { throw new RuntimeException("Stub!"); }
/* 48 */   public boolean showOverflowMenu() { throw new RuntimeException("Stub!"); }
/* 49 */   public boolean hideOverflowMenu() { throw new RuntimeException("Stub!"); }
/* 50 */   public boolean isOverflowMenuShowing() { throw new RuntimeException("Stub!"); }
/* 51 */   public void dismissPopupMenus() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface OnMenuItemClickListener
/*    */   {
/*    */     public abstract boolean onMenuItemClick(MenuItem paramMenuItem);
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\widget\ActionMenuView.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */