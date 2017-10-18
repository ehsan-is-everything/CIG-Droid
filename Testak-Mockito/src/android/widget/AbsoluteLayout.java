/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.ViewGroup;
/*    */ import android.view.ViewGroup.LayoutParams;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Deprecated
/*    */ @RemoteViews.RemoteView
/*    */ public class AbsoluteLayout
/*    */   extends ViewGroup
/*    */ {
/*    */   public static class LayoutParams
/*    */     extends ViewGroup.LayoutParams
/*    */   {
/*    */     public int x;
/*    */     public int y;
/*    */     
/*    */     public LayoutParams(int width, int height, int x, int y)
/*    */     {
/* 26 */       super();throw new RuntimeException("Stub!"); }
/* 27 */     public LayoutParams(Context c, AttributeSet attrs) { super();throw new RuntimeException("Stub!"); }
/* 28 */     public LayoutParams(ViewGroup.LayoutParams source) { super();throw new RuntimeException("Stub!"); }
/* 29 */     public String debug(String output) { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public AbsoluteLayout(Context context) {
/* 33 */     super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 34 */   public AbsoluteLayout(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 35 */   public AbsoluteLayout(Context context, AttributeSet attrs, int defStyleAttr) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 36 */   public AbsoluteLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 37 */   protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
/* 38 */   protected ViewGroup.LayoutParams generateDefaultLayoutParams() { throw new RuntimeException("Stub!"); }
/* 39 */   protected void onLayout(boolean changed, int l, int t, int r, int b) { throw new RuntimeException("Stub!"); }
/* 40 */   public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attrs) { throw new RuntimeException("Stub!"); }
/* 41 */   protected boolean checkLayoutParams(ViewGroup.LayoutParams p) { throw new RuntimeException("Stub!"); }
/* 42 */   protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) { throw new RuntimeException("Stub!"); }
/* 43 */   public boolean shouldDelayChildPressedState() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\widget\AbsoluteLayout.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */