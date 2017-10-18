/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.content.res.TypedArray;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.View;
/*    */ import android.view.ViewGroup;
/*    */ import android.view.ViewGroup.LayoutParams;
/*    */ import android.view.ViewGroup.MarginLayoutParams;
/*    */ 
/*    */ @RemoteViews.RemoteView
/*    */ public class GridLayout
/*    */   extends ViewGroup
/*    */ {
/*    */   public static final int VERTICAL = 1;
/*    */   public static final int UNDEFINED = Integer.MIN_VALUE;
/*    */   
/*    */   public static class LayoutParams extends ViewGroup.MarginLayoutParams
/*    */   {
/*    */     public GridLayout.Spec columnSpec;
/*    */     public GridLayout.Spec rowSpec;
/*    */     
/*    */     public LayoutParams(GridLayout.Spec rowSpec, GridLayout.Spec columnSpec)
/*    */     {
/* 25 */       super();throw new RuntimeException("Stub!"); }
/* 26 */     public LayoutParams() { super();throw new RuntimeException("Stub!"); }
/* 27 */     public LayoutParams(ViewGroup.LayoutParams params) { super();throw new RuntimeException("Stub!"); }
/* 28 */     public LayoutParams(ViewGroup.MarginLayoutParams params) { super();throw new RuntimeException("Stub!"); }
/* 29 */     public LayoutParams(LayoutParams source) { super();throw new RuntimeException("Stub!"); }
/* 30 */     public LayoutParams(Context context, AttributeSet attrs) { super();throw new RuntimeException("Stub!"); }
/* 31 */     public void setGravity(int gravity) { throw new RuntimeException("Stub!"); }
/* 32 */     protected void setBaseAttributes(TypedArray attributes, int widthAttr, int heightAttr) { throw new RuntimeException("Stub!"); }
/* 33 */     public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/* 34 */     public int hashCode() { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */ 
/*    */   public static class Spec
/*    */   {
/* 40 */     Spec() { throw new RuntimeException("Stub!"); }
/* 41 */     public boolean equals(Object that) { throw new RuntimeException("Stub!"); }
/* 42 */     public int hashCode() { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public static abstract class Alignment {
/* 46 */     Alignment() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 48 */   public GridLayout(Context context) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 49 */   public GridLayout(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 50 */   public GridLayout(Context context, AttributeSet attrs, int defStyleAttr) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 51 */   public GridLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 52 */   public int getOrientation() { throw new RuntimeException("Stub!"); }
/* 53 */   public void setOrientation(int orientation) { throw new RuntimeException("Stub!"); }
/* 54 */   public int getRowCount() { throw new RuntimeException("Stub!"); }
/* 55 */   public void setRowCount(int rowCount) { throw new RuntimeException("Stub!"); }
/* 56 */   public int getColumnCount() { throw new RuntimeException("Stub!"); }
/* 57 */   public void setColumnCount(int columnCount) { throw new RuntimeException("Stub!"); }
/* 58 */   public boolean getUseDefaultMargins() { throw new RuntimeException("Stub!"); }
/* 59 */   public void setUseDefaultMargins(boolean useDefaultMargins) { throw new RuntimeException("Stub!"); }
/* 60 */   public int getAlignmentMode() { throw new RuntimeException("Stub!"); }
/* 61 */   public void setAlignmentMode(int alignmentMode) { throw new RuntimeException("Stub!"); }
/* 62 */   public boolean isRowOrderPreserved() { throw new RuntimeException("Stub!"); }
/* 63 */   public void setRowOrderPreserved(boolean rowOrderPreserved) { throw new RuntimeException("Stub!"); }
/* 64 */   public boolean isColumnOrderPreserved() { throw new RuntimeException("Stub!"); }
/* 65 */   public void setColumnOrderPreserved(boolean columnOrderPreserved) { throw new RuntimeException("Stub!"); }
/* 66 */   protected boolean checkLayoutParams(ViewGroup.LayoutParams p) { throw new RuntimeException("Stub!"); }
/* 67 */   protected LayoutParams generateDefaultLayoutParams() { throw new RuntimeException("Stub!"); }
/* 68 */   public LayoutParams generateLayoutParams(AttributeSet attrs) { throw new RuntimeException("Stub!"); }
/* 69 */   protected LayoutParams generateLayoutParams(ViewGroup.LayoutParams lp) { throw new RuntimeException("Stub!"); }
/* 70 */   public void onViewAdded(View child) { throw new RuntimeException("Stub!"); }
/* 71 */   public void onViewRemoved(View child) { throw new RuntimeException("Stub!"); }
/* 72 */   protected void onMeasure(int widthSpec, int heightSpec) { throw new RuntimeException("Stub!"); }
/* 73 */   public void requestLayout() { throw new RuntimeException("Stub!"); }
/* 74 */   protected void onLayout(boolean changed, int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
/* 75 */   public CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
/* 76 */   public static Spec spec(int start, int size, Alignment alignment, float weight) { throw new RuntimeException("Stub!"); }
/* 77 */   public static Spec spec(int start, Alignment alignment, float weight) { throw new RuntimeException("Stub!"); }
/* 78 */   public static Spec spec(int start, int size, float weight) { throw new RuntimeException("Stub!"); }
/* 79 */   public static Spec spec(int start, float weight) { throw new RuntimeException("Stub!"); }
/* 80 */   public static Spec spec(int start, int size, Alignment alignment) { throw new RuntimeException("Stub!"); }
/* 81 */   public static Spec spec(int start, Alignment alignment) { throw new RuntimeException("Stub!"); }
/* 82 */   public static Spec spec(int start, int size) { throw new RuntimeException("Stub!"); }
/* 83 */   public static Spec spec(int start) { throw new RuntimeException("Stub!"); }
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
/* 98 */   public static final Alignment TOP = null; public static final Alignment START = null; public static final Alignment RIGHT = null; public static final Alignment LEFT = null; public static final int HORIZONTAL = 0; public static final Alignment FILL = null; public static final Alignment END = null; public static final Alignment CENTER = null; public static final Alignment BOTTOM = null; public static final Alignment BASELINE = null;
/*    */   public static final int ALIGN_MARGINS = 1;
/*    */   public static final int ALIGN_BOUNDS = 0;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\widget\GridLayout.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */