/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.content.Intent;
/*    */ import android.graphics.Canvas;
/*    */ import android.graphics.Rect;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.KeyEvent;
/*    */ import android.view.View;
/*    */ import android.view.accessibility.AccessibilityNodeInfo;
/*    */ 
/*    */ @RemoteViews.RemoteView
/*    */ public class ListView extends AbsListView
/*    */ {
/*    */   public class FixedViewInfo
/*    */   {
/*    */     public Object data;
/*    */     public boolean isSelectable;
/*    */     public View view;
/*    */     
/*    */     public FixedViewInfo()
/*    */     {
/* 24 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */   
/*    */   public ListView(Context context) {
/* 29 */     super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 30 */   public ListView(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 31 */   public ListView(Context context, AttributeSet attrs, int defStyleAttr) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 32 */   public ListView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 33 */   public int getMaxScrollAmount() { throw new RuntimeException("Stub!"); }
/* 34 */   public void addHeaderView(View v, Object data, boolean isSelectable) { throw new RuntimeException("Stub!"); }
/* 35 */   public void addHeaderView(View v) { throw new RuntimeException("Stub!"); }
/* 36 */   public int getHeaderViewsCount() { throw new RuntimeException("Stub!"); }
/* 37 */   public boolean removeHeaderView(View v) { throw new RuntimeException("Stub!"); }
/* 38 */   public void addFooterView(View v, Object data, boolean isSelectable) { throw new RuntimeException("Stub!"); }
/* 39 */   public void addFooterView(View v) { throw new RuntimeException("Stub!"); }
/* 40 */   public int getFooterViewsCount() { throw new RuntimeException("Stub!"); }
/* 41 */   public boolean removeFooterView(View v) { throw new RuntimeException("Stub!"); }
/* 42 */   public ListAdapter getAdapter() { throw new RuntimeException("Stub!"); }
/* 43 */   public void setRemoteViewsAdapter(Intent intent) { throw new RuntimeException("Stub!"); }
/* 44 */   public void setAdapter(ListAdapter adapter) { throw new RuntimeException("Stub!"); }
/* 45 */   public boolean requestChildRectangleOnScreen(View child, Rect rect, boolean immediate) { throw new RuntimeException("Stub!"); }
/* 46 */   public void smoothScrollToPosition(int position) { throw new RuntimeException("Stub!"); }
/* 47 */   public void smoothScrollByOffset(int offset) { throw new RuntimeException("Stub!"); }
/* 48 */   protected void onDetachedFromWindow() { throw new RuntimeException("Stub!"); }
/* 49 */   protected void onSizeChanged(int w, int h, int oldw, int oldh) { throw new RuntimeException("Stub!"); }
/* 50 */   protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
/* 51 */   protected void layoutChildren() { throw new RuntimeException("Stub!"); }
/* 52 */   protected boolean canAnimate() { throw new RuntimeException("Stub!"); }
/* 53 */   public void setSelection(int position) { throw new RuntimeException("Stub!"); }
/* 54 */   public void setSelectionAfterHeaderView() { throw new RuntimeException("Stub!"); }
/* 55 */   public boolean dispatchKeyEvent(KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 56 */   public boolean onKeyDown(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 57 */   public boolean onKeyMultiple(int keyCode, int repeatCount, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 58 */   public boolean onKeyUp(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 59 */   public void setItemsCanFocus(boolean itemsCanFocus) { throw new RuntimeException("Stub!"); }
/* 60 */   public boolean getItemsCanFocus() { throw new RuntimeException("Stub!"); }
/* 61 */   public boolean isOpaque() { throw new RuntimeException("Stub!"); }
/* 62 */   public void setCacheColorHint(int color) { throw new RuntimeException("Stub!"); }
/* 63 */   protected void dispatchDraw(Canvas canvas) { throw new RuntimeException("Stub!"); }
/* 64 */   protected boolean drawChild(Canvas canvas, View child, long drawingTime) { throw new RuntimeException("Stub!"); }
/* 65 */   public Drawable getDivider() { throw new RuntimeException("Stub!"); }
/* 66 */   public void setDivider(Drawable divider) { throw new RuntimeException("Stub!"); }
/* 67 */   public int getDividerHeight() { throw new RuntimeException("Stub!"); }
/* 68 */   public void setDividerHeight(int height) { throw new RuntimeException("Stub!"); }
/* 69 */   public void setHeaderDividersEnabled(boolean headerDividersEnabled) { throw new RuntimeException("Stub!"); }
/* 70 */   public boolean areHeaderDividersEnabled() { throw new RuntimeException("Stub!"); }
/* 71 */   public void setFooterDividersEnabled(boolean footerDividersEnabled) { throw new RuntimeException("Stub!"); }
/* 72 */   public boolean areFooterDividersEnabled() { throw new RuntimeException("Stub!"); }
/* 73 */   public void setOverscrollHeader(Drawable header) { throw new RuntimeException("Stub!"); }
/* 74 */   public Drawable getOverscrollHeader() { throw new RuntimeException("Stub!"); }
/* 75 */   public void setOverscrollFooter(Drawable footer) { throw new RuntimeException("Stub!"); }
/* 76 */   public Drawable getOverscrollFooter() { throw new RuntimeException("Stub!"); }
/* 77 */   protected void onFocusChanged(boolean gainFocus, int direction, Rect previouslyFocusedRect) { throw new RuntimeException("Stub!"); }
/* 78 */   protected void onFinishInflate() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 80 */   public long[] getCheckItemIds() { throw new RuntimeException("Stub!"); }
/* 81 */   public CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
/* 82 */   public void onInitializeAccessibilityNodeInfoForItem(View view, int position, AccessibilityNodeInfo info) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\widget\ListView.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */