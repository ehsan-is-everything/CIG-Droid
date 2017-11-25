/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.View;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ViewSwitcher
/*    */   extends ViewAnimator
/*    */ {
/*    */   public ViewSwitcher(Context context)
/*    */   {
/* 25 */     super((Context)null, (AttributeSet)null);throw new RuntimeException("Stub!"); }
/* 26 */   public ViewSwitcher(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null);throw new RuntimeException("Stub!"); }
/* 27 */   public void addView(View child, int index, ViewGroup.LayoutParams params) { throw new RuntimeException("Stub!"); }
/* 28 */   public CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
/* 29 */   public View getNextView() { throw new RuntimeException("Stub!"); }
/* 30 */   public void setFactory(ViewFactory factory) { throw new RuntimeException("Stub!"); }
/* 31 */   public void reset() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface ViewFactory
/*    */   {
/*    */     public abstract View makeView();
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\widget\ViewSwitcher.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */