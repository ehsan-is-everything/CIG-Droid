/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.content.res.TypedArray;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.View;
/*    */ import android.view.ViewDebug.ExportedProperty;
/*    */ import android.view.ViewGroup.LayoutParams;
/*    */ import android.view.ViewGroup.MarginLayoutParams;
/*    */ import android.view.ViewGroup.OnHierarchyChangeListener;
/*    */ 
/*    */ public class TableRow
/*    */   extends LinearLayout
/*    */ {
/*    */   public static class LayoutParams extends LinearLayout.LayoutParams
/*    */   {
/*    */     @ViewDebug.ExportedProperty(category="layout")
/*    */     public int column;
/*    */     @ViewDebug.ExportedProperty(category="layout")
/*    */     public int span;
/*    */     
/*    */     public LayoutParams(Context c, AttributeSet attrs)
/*    */     {
/* 24 */       super();throw new RuntimeException("Stub!"); }
/* 25 */     public LayoutParams(int w, int h) { super();throw new RuntimeException("Stub!"); }
/* 26 */     public LayoutParams(int w, int h, float initWeight) { super();throw new RuntimeException("Stub!"); }
/* 27 */     public LayoutParams() { super();throw new RuntimeException("Stub!"); }
/* 28 */     public LayoutParams(int column) { super();throw new RuntimeException("Stub!"); }
/* 29 */     public LayoutParams(ViewGroup.LayoutParams p) { super();throw new RuntimeException("Stub!"); }
/* 30 */     public LayoutParams(ViewGroup.MarginLayoutParams source) { super();throw new RuntimeException("Stub!"); }
/* 31 */     protected void setBaseAttributes(TypedArray a, int widthAttr, int heightAttr) { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */ 
/*    */   public TableRow(Context context)
/*    */   {
/* 37 */     super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 38 */   public TableRow(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 39 */   public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener listener) { throw new RuntimeException("Stub!"); }
/* 40 */   protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
/* 41 */   protected void onLayout(boolean changed, int l, int t, int r, int b) { throw new RuntimeException("Stub!"); }
/* 42 */   public View getVirtualChildAt(int i) { throw new RuntimeException("Stub!"); }
/* 43 */   public int getVirtualChildCount() { throw new RuntimeException("Stub!"); }
/* 44 */   public LayoutParams generateLayoutParams(AttributeSet attrs) { throw new RuntimeException("Stub!"); }
/* 45 */   protected LinearLayout.LayoutParams generateDefaultLayoutParams() { throw new RuntimeException("Stub!"); }
/* 46 */   protected boolean checkLayoutParams(ViewGroup.LayoutParams p) { throw new RuntimeException("Stub!"); }
/* 47 */   protected LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) { throw new RuntimeException("Stub!"); }
/* 48 */   public CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\widget\TableRow.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */