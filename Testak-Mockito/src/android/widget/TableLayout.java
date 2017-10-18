/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.content.res.TypedArray;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.View;
/*    */ import android.view.ViewGroup.LayoutParams;
/*    */ import android.view.ViewGroup.MarginLayoutParams;
/*    */ import android.view.ViewGroup.OnHierarchyChangeListener;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class TableLayout
/*    */   extends LinearLayout
/*    */ {
/*    */   public static class LayoutParams
/*    */     extends LinearLayout.LayoutParams
/*    */   {
/*    */     public LayoutParams(Context c, AttributeSet attrs)
/*    */     {
/* 25 */       super();throw new RuntimeException("Stub!"); }
/* 26 */     public LayoutParams(int w, int h) { super();throw new RuntimeException("Stub!"); }
/* 27 */     public LayoutParams(int w, int h, float initWeight) { super();throw new RuntimeException("Stub!"); }
/* 28 */     public LayoutParams() { super();throw new RuntimeException("Stub!"); }
/* 29 */     public LayoutParams(ViewGroup.LayoutParams p) { super();throw new RuntimeException("Stub!"); }
/* 30 */     public LayoutParams(ViewGroup.MarginLayoutParams source) { super();throw new RuntimeException("Stub!"); }
/* 31 */     protected void setBaseAttributes(TypedArray a, int widthAttr, int heightAttr) { throw new RuntimeException("Stub!"); } }
/*    */   
/* 33 */   public TableLayout(Context context) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 34 */   public TableLayout(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 35 */   public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener listener) { throw new RuntimeException("Stub!"); }
/* 36 */   public void requestLayout() { throw new RuntimeException("Stub!"); }
/* 37 */   public boolean isShrinkAllColumns() { throw new RuntimeException("Stub!"); }
/* 38 */   public void setShrinkAllColumns(boolean shrinkAllColumns) { throw new RuntimeException("Stub!"); }
/* 39 */   public boolean isStretchAllColumns() { throw new RuntimeException("Stub!"); }
/* 40 */   public void setStretchAllColumns(boolean stretchAllColumns) { throw new RuntimeException("Stub!"); }
/* 41 */   public void setColumnCollapsed(int columnIndex, boolean isCollapsed) { throw new RuntimeException("Stub!"); }
/* 42 */   public boolean isColumnCollapsed(int columnIndex) { throw new RuntimeException("Stub!"); }
/* 43 */   public void setColumnStretchable(int columnIndex, boolean isStretchable) { throw new RuntimeException("Stub!"); }
/* 44 */   public boolean isColumnStretchable(int columnIndex) { throw new RuntimeException("Stub!"); }
/* 45 */   public void setColumnShrinkable(int columnIndex, boolean isShrinkable) { throw new RuntimeException("Stub!"); }
/* 46 */   public boolean isColumnShrinkable(int columnIndex) { throw new RuntimeException("Stub!"); }
/* 47 */   public void addView(View child) { throw new RuntimeException("Stub!"); }
/* 48 */   public void addView(View child, int index) { throw new RuntimeException("Stub!"); }
/* 49 */   public void addView(View child, ViewGroup.LayoutParams params) { throw new RuntimeException("Stub!"); }
/* 50 */   public void addView(View child, int index, ViewGroup.LayoutParams params) { throw new RuntimeException("Stub!"); }
/* 51 */   protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
/* 52 */   protected void onLayout(boolean changed, int l, int t, int r, int b) { throw new RuntimeException("Stub!"); }
/* 53 */   public LayoutParams generateLayoutParams(AttributeSet attrs) { throw new RuntimeException("Stub!"); }
/* 54 */   protected LinearLayout.LayoutParams generateDefaultLayoutParams() { throw new RuntimeException("Stub!"); }
/* 55 */   protected boolean checkLayoutParams(ViewGroup.LayoutParams p) { throw new RuntimeException("Stub!"); }
/* 56 */   protected LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) { throw new RuntimeException("Stub!"); }
/* 57 */   public CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\widget\TableLayout.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */