/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.content.Intent;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.KeyEvent;
/*    */ import android.view.View;
/*    */ import android.view.ViewGroup.LayoutParams;
/*    */ import android.view.accessibility.AccessibilityNodeInfo;
/*    */ 
/*    */ @RemoteViews.RemoteView
/*    */ public class GridView extends AbsListView
/*    */ {
/*    */   public static final int AUTO_FIT = -1;
/*    */   public static final int NO_STRETCH = 0;
/*    */   public static final int STRETCH_COLUMN_WIDTH = 2;
/*    */   public static final int STRETCH_SPACING = 1;
/*    */   public static final int STRETCH_SPACING_UNIFORM = 3;
/*    */   
/*    */   public GridView(Context context)
/*    */   {
/* 22 */     super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 23 */   public GridView(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 24 */   public GridView(Context context, AttributeSet attrs, int defStyleAttr) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 25 */   public GridView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 26 */   public ListAdapter getAdapter() { throw new RuntimeException("Stub!"); }
/* 27 */   public void setRemoteViewsAdapter(Intent intent) { throw new RuntimeException("Stub!"); }
/* 28 */   public void setAdapter(ListAdapter adapter) { throw new RuntimeException("Stub!"); }
/* 29 */   public void smoothScrollToPosition(int position) { throw new RuntimeException("Stub!"); }
/* 30 */   public void smoothScrollByOffset(int offset) { throw new RuntimeException("Stub!"); }
/* 31 */   protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
/* 32 */   protected void attachLayoutAnimationParameters(View child, ViewGroup.LayoutParams params, int index, int count) { throw new RuntimeException("Stub!"); }
/* 33 */   protected void layoutChildren() { throw new RuntimeException("Stub!"); }
/* 34 */   public void setSelection(int position) { throw new RuntimeException("Stub!"); }
/* 35 */   public boolean onKeyDown(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 36 */   public boolean onKeyMultiple(int keyCode, int repeatCount, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 37 */   public boolean onKeyUp(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 38 */   protected void onFocusChanged(boolean gainFocus, int direction, android.graphics.Rect previouslyFocusedRect) { throw new RuntimeException("Stub!"); }
/* 39 */   public void setGravity(int gravity) { throw new RuntimeException("Stub!"); }
/* 40 */   public int getGravity() { throw new RuntimeException("Stub!"); }
/* 41 */   public void setHorizontalSpacing(int horizontalSpacing) { throw new RuntimeException("Stub!"); }
/* 42 */   public int getHorizontalSpacing() { throw new RuntimeException("Stub!"); }
/* 43 */   public int getRequestedHorizontalSpacing() { throw new RuntimeException("Stub!"); }
/* 44 */   public void setVerticalSpacing(int verticalSpacing) { throw new RuntimeException("Stub!"); }
/* 45 */   public int getVerticalSpacing() { throw new RuntimeException("Stub!"); }
/* 46 */   public void setStretchMode(int stretchMode) { throw new RuntimeException("Stub!"); }
/* 47 */   public int getStretchMode() { throw new RuntimeException("Stub!"); }
/* 48 */   public void setColumnWidth(int columnWidth) { throw new RuntimeException("Stub!"); }
/* 49 */   public int getColumnWidth() { throw new RuntimeException("Stub!"); }
/* 50 */   public int getRequestedColumnWidth() { throw new RuntimeException("Stub!"); }
/* 51 */   public void setNumColumns(int numColumns) { throw new RuntimeException("Stub!"); }
/*    */   @android.view.ViewDebug.ExportedProperty
/* 53 */   public int getNumColumns() { throw new RuntimeException("Stub!"); }
/* 54 */   protected int computeVerticalScrollExtent() { throw new RuntimeException("Stub!"); }
/* 55 */   protected int computeVerticalScrollOffset() { throw new RuntimeException("Stub!"); }
/* 56 */   protected int computeVerticalScrollRange() { throw new RuntimeException("Stub!"); }
/* 57 */   public CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
/* 58 */   public void onInitializeAccessibilityNodeInfoForItem(View view, int position, AccessibilityNodeInfo info) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\widget\GridView.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */