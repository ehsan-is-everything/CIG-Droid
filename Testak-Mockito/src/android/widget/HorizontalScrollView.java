/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.graphics.Canvas;
/*    */ import android.graphics.Rect;
/*    */ import android.os.Parcelable;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.KeyEvent;
/*    */ import android.view.MotionEvent;
/*    */ import android.view.View;
/*    */ import android.view.ViewGroup.LayoutParams;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class HorizontalScrollView
/*    */   extends FrameLayout
/*    */ {
/*    */   public HorizontalScrollView(Context context)
/*    */   {
/* 21 */     super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 22 */   public HorizontalScrollView(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 23 */   public HorizontalScrollView(Context context, AttributeSet attrs, int defStyleAttr) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 24 */   public HorizontalScrollView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 25 */   protected float getLeftFadingEdgeStrength() { throw new RuntimeException("Stub!"); }
/* 26 */   protected float getRightFadingEdgeStrength() { throw new RuntimeException("Stub!"); }
/* 27 */   public int getMaxScrollAmount() { throw new RuntimeException("Stub!"); }
/* 28 */   public void addView(View child) { throw new RuntimeException("Stub!"); }
/* 29 */   public void addView(View child, int index) { throw new RuntimeException("Stub!"); }
/* 30 */   public void addView(View child, ViewGroup.LayoutParams params) { throw new RuntimeException("Stub!"); }
/* 31 */   public void addView(View child, int index, ViewGroup.LayoutParams params) { throw new RuntimeException("Stub!"); }
/* 32 */   public boolean isFillViewport() { throw new RuntimeException("Stub!"); }
/* 33 */   public void setFillViewport(boolean fillViewport) { throw new RuntimeException("Stub!"); }
/* 34 */   public boolean isSmoothScrollingEnabled() { throw new RuntimeException("Stub!"); }
/* 35 */   public void setSmoothScrollingEnabled(boolean smoothScrollingEnabled) { throw new RuntimeException("Stub!"); }
/* 36 */   protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
/* 37 */   public boolean dispatchKeyEvent(KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 38 */   public boolean executeKeyEvent(KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 39 */   public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) { throw new RuntimeException("Stub!"); }
/* 40 */   public boolean onInterceptTouchEvent(MotionEvent ev) { throw new RuntimeException("Stub!"); }
/* 41 */   public boolean onTouchEvent(MotionEvent ev) { throw new RuntimeException("Stub!"); }
/* 42 */   public boolean onGenericMotionEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 43 */   public boolean shouldDelayChildPressedState() { throw new RuntimeException("Stub!"); }
/* 44 */   protected void onOverScrolled(int scrollX, int scrollY, boolean clampedX, boolean clampedY) { throw new RuntimeException("Stub!"); }
/* 45 */   public CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
/* 46 */   public boolean pageScroll(int direction) { throw new RuntimeException("Stub!"); }
/* 47 */   public boolean fullScroll(int direction) { throw new RuntimeException("Stub!"); }
/* 48 */   public boolean arrowScroll(int direction) { throw new RuntimeException("Stub!"); }
/* 49 */   public final void smoothScrollBy(int dx, int dy) { throw new RuntimeException("Stub!"); }
/* 50 */   public final void smoothScrollTo(int x, int y) { throw new RuntimeException("Stub!"); }
/* 51 */   protected int computeHorizontalScrollRange() { throw new RuntimeException("Stub!"); }
/* 52 */   protected int computeHorizontalScrollOffset() { throw new RuntimeException("Stub!"); }
/* 53 */   protected void measureChild(View child, int parentWidthMeasureSpec, int parentHeightMeasureSpec) { throw new RuntimeException("Stub!"); }
/* 54 */   protected void measureChildWithMargins(View child, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed) { throw new RuntimeException("Stub!"); }
/* 55 */   public void computeScroll() { throw new RuntimeException("Stub!"); }
/* 56 */   protected int computeScrollDeltaToGetChildRectOnScreen(Rect rect) { throw new RuntimeException("Stub!"); }
/* 57 */   public void requestChildFocus(View child, View focused) { throw new RuntimeException("Stub!"); }
/* 58 */   protected boolean onRequestFocusInDescendants(int direction, Rect previouslyFocusedRect) { throw new RuntimeException("Stub!"); }
/* 59 */   public boolean requestChildRectangleOnScreen(View child, Rect rectangle, boolean immediate) { throw new RuntimeException("Stub!"); }
/* 60 */   public void requestLayout() { throw new RuntimeException("Stub!"); }
/* 61 */   protected void onLayout(boolean changed, int l, int t, int r, int b) { throw new RuntimeException("Stub!"); }
/* 62 */   protected void onSizeChanged(int w, int h, int oldw, int oldh) { throw new RuntimeException("Stub!"); }
/* 63 */   public void fling(int velocityX) { throw new RuntimeException("Stub!"); }
/* 64 */   public void scrollTo(int x, int y) { throw new RuntimeException("Stub!"); }
/* 65 */   public void setOverScrollMode(int mode) { throw new RuntimeException("Stub!"); }
/*    */   
/* 67 */   public void draw(Canvas canvas) { throw new RuntimeException("Stub!"); }
/* 68 */   protected void onRestoreInstanceState(Parcelable state) { throw new RuntimeException("Stub!"); }
/* 69 */   protected Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\widget\HorizontalScrollView.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */