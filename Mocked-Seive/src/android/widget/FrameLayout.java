/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.ViewGroup;
/*    */ import android.view.ViewGroup.LayoutParams;
/*    */ import android.view.ViewGroup.MarginLayoutParams;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @RemoteViews.RemoteView
/*    */ public class FrameLayout
/*    */   extends ViewGroup
/*    */ {
/*    */   public static class LayoutParams
/*    */     extends ViewGroup.MarginLayoutParams
/*    */   {
/*    */     public static final int UNSPECIFIED_GRAVITY = -1;
/*    */     public int gravity;
/*    */     
/*    */     public LayoutParams(Context c, AttributeSet attrs)
/*    */     {
/* 25 */       super();throw new RuntimeException("Stub!"); }
/* 26 */     public LayoutParams(int width, int height) { super();throw new RuntimeException("Stub!"); }
/* 27 */     public LayoutParams(int width, int height, int gravity) { super();throw new RuntimeException("Stub!"); }
/* 28 */     public LayoutParams(ViewGroup.LayoutParams source) { super();throw new RuntimeException("Stub!"); }
/* 29 */     public LayoutParams(ViewGroup.MarginLayoutParams source) { super();throw new RuntimeException("Stub!"); }
/* 30 */     public LayoutParams(LayoutParams source) { super();throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */   
/* 34 */   public FrameLayout(Context context) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 35 */   public FrameLayout(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 36 */   public FrameLayout(Context context, AttributeSet attrs, int defStyleAttr) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 37 */   public FrameLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 38 */   public void setForegroundGravity(int foregroundGravity) { throw new RuntimeException("Stub!"); }
/* 39 */   protected LayoutParams generateDefaultLayoutParams() { throw new RuntimeException("Stub!"); }
/* 40 */   protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
/* 41 */   protected void onLayout(boolean changed, int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
/* 42 */   public void setMeasureAllChildren(boolean measureAll) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 44 */   public boolean getConsiderGoneChildrenWhenMeasuring() { throw new RuntimeException("Stub!"); }
/* 45 */   public boolean getMeasureAllChildren() { throw new RuntimeException("Stub!"); }
/* 46 */   public LayoutParams generateLayoutParams(AttributeSet attrs) { throw new RuntimeException("Stub!"); }
/* 47 */   public boolean shouldDelayChildPressedState() { throw new RuntimeException("Stub!"); }
/* 48 */   protected boolean checkLayoutParams(ViewGroup.LayoutParams p) { throw new RuntimeException("Stub!"); }
/* 49 */   protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams lp) { throw new RuntimeException("Stub!"); }
/* 50 */   public CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\widget\FrameLayout.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */