/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.graphics.Canvas;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.MotionEvent;
/*    */ import android.view.View;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Deprecated
/*    */ public class SlidingDrawer
/*    */   extends ViewGroup
/*    */ {
/*    */   public static final int ORIENTATION_HORIZONTAL = 0;
/*    */   public static final int ORIENTATION_VERTICAL = 1;
/*    */   
/*    */   public SlidingDrawer(Context context, AttributeSet attrs)
/*    */   {
/* 35 */     super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 36 */   public SlidingDrawer(Context context, AttributeSet attrs, int defStyleAttr) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 37 */   public SlidingDrawer(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 38 */   protected void onFinishInflate() { throw new RuntimeException("Stub!"); }
/* 39 */   protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
/* 40 */   protected void dispatchDraw(Canvas canvas) { throw new RuntimeException("Stub!"); }
/* 41 */   protected void onLayout(boolean changed, int l, int t, int r, int b) { throw new RuntimeException("Stub!"); }
/* 42 */   public boolean onInterceptTouchEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 43 */   public boolean onTouchEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 44 */   public void toggle() { throw new RuntimeException("Stub!"); }
/* 45 */   public void animateToggle() { throw new RuntimeException("Stub!"); }
/* 46 */   public void open() { throw new RuntimeException("Stub!"); }
/* 47 */   public void close() { throw new RuntimeException("Stub!"); }
/* 48 */   public void animateClose() { throw new RuntimeException("Stub!"); }
/* 49 */   public void animateOpen() { throw new RuntimeException("Stub!"); }
/* 50 */   public CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
/* 51 */   public void setOnDrawerOpenListener(OnDrawerOpenListener onDrawerOpenListener) { throw new RuntimeException("Stub!"); }
/* 52 */   public void setOnDrawerCloseListener(OnDrawerCloseListener onDrawerCloseListener) { throw new RuntimeException("Stub!"); }
/* 53 */   public void setOnDrawerScrollListener(OnDrawerScrollListener onDrawerScrollListener) { throw new RuntimeException("Stub!"); }
/* 54 */   public View getHandle() { throw new RuntimeException("Stub!"); }
/* 55 */   public View getContent() { throw new RuntimeException("Stub!"); }
/* 56 */   public void unlock() { throw new RuntimeException("Stub!"); }
/* 57 */   public void lock() { throw new RuntimeException("Stub!"); }
/* 58 */   public boolean isOpened() { throw new RuntimeException("Stub!"); }
/* 59 */   public boolean isMoving() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface OnDrawerScrollListener
/*    */   {
/*    */     public abstract void onScrollStarted();
/*    */     
/*    */     public abstract void onScrollEnded();
/*    */   }
/*    */   
/*    */   public static abstract interface OnDrawerCloseListener
/*    */   {
/*    */     public abstract void onDrawerClosed();
/*    */   }
/*    */   
/*    */   public static abstract interface OnDrawerOpenListener
/*    */   {
/*    */     public abstract void onDrawerOpened();
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\widget\SlidingDrawer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */