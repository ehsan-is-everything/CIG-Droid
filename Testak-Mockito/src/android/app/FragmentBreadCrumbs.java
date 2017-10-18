/*    */ package android.app;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.View.OnClickListener;
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
/*    */ 
/*    */ 
/*    */ @Deprecated
/*    */ public class FragmentBreadCrumbs
/*    */   extends ViewGroup
/*    */   implements FragmentManager.OnBackStackChangedListener
/*    */ {
/*    */   public FragmentBreadCrumbs(Context context)
/*    */   {
/* 27 */     super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 28 */   public FragmentBreadCrumbs(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 29 */   public FragmentBreadCrumbs(Context context, AttributeSet attrs, int defStyleAttr) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 30 */   public void setActivity(Activity a) { throw new RuntimeException("Stub!"); }
/* 31 */   public void setMaxVisible(int visibleCrumbs) { throw new RuntimeException("Stub!"); }
/* 32 */   public void setParentTitle(CharSequence title, CharSequence shortTitle, View.OnClickListener listener) { throw new RuntimeException("Stub!"); }
/* 33 */   public void setOnBreadCrumbClickListener(OnBreadCrumbClickListener listener) { throw new RuntimeException("Stub!"); }
/* 34 */   public void setTitle(CharSequence title, CharSequence shortTitle) { throw new RuntimeException("Stub!"); }
/* 35 */   protected void onLayout(boolean changed, int l, int t, int r, int b) { throw new RuntimeException("Stub!"); }
/* 36 */   protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
/* 37 */   public void onBackStackChanged() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface OnBreadCrumbClickListener
/*    */   {
/*    */     public abstract boolean onBreadCrumbClick(FragmentManager.BackStackEntry paramBackStackEntry, int paramInt);
/*    */   }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\app\FragmentBreadCrumbs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */