/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.util.AttributeSet;
/*    */ 
/*    */ @RemoteViews.RemoteView
/*    */ public class LinearLayout extends android.view.ViewGroup
/*    */ {
/*    */   public static final int HORIZONTAL = 0;
/*    */   public static final int SHOW_DIVIDER_BEGINNING = 1;
/*    */   public static final int SHOW_DIVIDER_END = 4;
/*    */   public static final int SHOW_DIVIDER_MIDDLE = 2;
/*    */   public static final int SHOW_DIVIDER_NONE = 0;
/*    */   public static final int VERTICAL = 1;
/*    */   
/*    */   public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams
/*    */   {
/*    */     @android.view.ViewDebug.ExportedProperty(category="layout", mapping={@android.view.ViewDebug.IntToString(from=-1, to="NONE"), @android.view.ViewDebug.IntToString(from=0, to="NONE"), @android.view.ViewDebug.IntToString(from=48, to="TOP"), @android.view.ViewDebug.IntToString(from=80, to="BOTTOM"), @android.view.ViewDebug.IntToString(from=3, to="LEFT"), @android.view.ViewDebug.IntToString(from=5, to="RIGHT"), @android.view.ViewDebug.IntToString(from=8388611, to="START"), @android.view.ViewDebug.IntToString(from=8388613, to="END"), @android.view.ViewDebug.IntToString(from=16, to="CENTER_VERTICAL"), @android.view.ViewDebug.IntToString(from=112, to="FILL_VERTICAL"), @android.view.ViewDebug.IntToString(from=1, to="CENTER_HORIZONTAL"), @android.view.ViewDebug.IntToString(from=7, to="FILL_HORIZONTAL"), @android.view.ViewDebug.IntToString(from=17, to="CENTER"), @android.view.ViewDebug.IntToString(from=119, to="FILL")})
/*    */     public int gravity;
/*    */     @android.view.ViewDebug.ExportedProperty(category="layout")
/*    */     public float weight;
/*    */     
/*    */     public LayoutParams(Context c, AttributeSet attrs)
/*    */     {
/* 25 */       super();throw new RuntimeException("Stub!"); }
/* 26 */     public LayoutParams(int width, int height) { super();throw new RuntimeException("Stub!"); }
/* 27 */     public LayoutParams(int width, int height, float weight) { super();throw new RuntimeException("Stub!"); }
/* 28 */     public LayoutParams(android.view.ViewGroup.LayoutParams p) { super();throw new RuntimeException("Stub!"); }
/* 29 */     public LayoutParams(android.view.ViewGroup.MarginLayoutParams source) { super();throw new RuntimeException("Stub!"); }
/* 30 */     public LayoutParams(LayoutParams source) { super();throw new RuntimeException("Stub!"); }
/* 31 */     public String debug(String output) { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */ 
/*    */   public LinearLayout(Context context)
/*    */   {
/* 37 */     super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 38 */   public LinearLayout(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 39 */   public LinearLayout(Context context, AttributeSet attrs, int defStyleAttr) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 40 */   public LinearLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 41 */   public void setShowDividers(int showDividers) { throw new RuntimeException("Stub!"); }
/* 42 */   public boolean shouldDelayChildPressedState() { throw new RuntimeException("Stub!"); }
/* 43 */   public int getShowDividers() { throw new RuntimeException("Stub!"); }
/* 44 */   public android.graphics.drawable.Drawable getDividerDrawable() { throw new RuntimeException("Stub!"); }
/* 45 */   public void setDividerDrawable(android.graphics.drawable.Drawable divider) { throw new RuntimeException("Stub!"); }
/* 46 */   public void setDividerPadding(int padding) { throw new RuntimeException("Stub!"); }
/* 47 */   public int getDividerPadding() { throw new RuntimeException("Stub!"); }
/* 48 */   protected void onDraw(android.graphics.Canvas canvas) { throw new RuntimeException("Stub!"); }
/* 49 */   public boolean isBaselineAligned() { throw new RuntimeException("Stub!"); }
/* 50 */   public void setBaselineAligned(boolean baselineAligned) { throw new RuntimeException("Stub!"); }
/* 51 */   public boolean isMeasureWithLargestChildEnabled() { throw new RuntimeException("Stub!"); }
/* 52 */   public void setMeasureWithLargestChildEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
/* 53 */   public int getBaseline() { throw new RuntimeException("Stub!"); }
/* 54 */   public int getBaselineAlignedChildIndex() { throw new RuntimeException("Stub!"); }
/* 55 */   public void setBaselineAlignedChildIndex(int i) { throw new RuntimeException("Stub!"); }
/* 56 */   public float getWeightSum() { throw new RuntimeException("Stub!"); }
/* 57 */   public void setWeightSum(float weightSum) { throw new RuntimeException("Stub!"); }
/* 58 */   protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
/* 59 */   protected void onLayout(boolean changed, int l, int t, int r, int b) { throw new RuntimeException("Stub!"); }
/* 60 */   public void onRtlPropertiesChanged(int layoutDirection) { throw new RuntimeException("Stub!"); }
/* 61 */   public void setOrientation(int orientation) { throw new RuntimeException("Stub!"); }
/* 62 */   public int getOrientation() { throw new RuntimeException("Stub!"); }
/* 63 */   public void setGravity(int gravity) { throw new RuntimeException("Stub!"); }
/* 64 */   public int getGravity() { throw new RuntimeException("Stub!"); }
/* 65 */   public void setHorizontalGravity(int horizontalGravity) { throw new RuntimeException("Stub!"); }
/* 66 */   public void setVerticalGravity(int verticalGravity) { throw new RuntimeException("Stub!"); }
/* 67 */   public LayoutParams generateLayoutParams(AttributeSet attrs) { throw new RuntimeException("Stub!"); }
/* 68 */   protected LayoutParams generateDefaultLayoutParams() { throw new RuntimeException("Stub!"); }
/* 69 */   protected LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams lp) { throw new RuntimeException("Stub!"); }
/* 70 */   protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams p) { throw new RuntimeException("Stub!"); }
/* 71 */   public CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\widget\LinearLayout.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */