/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.graphics.Rect;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.ContextMenu.ContextMenuInfo;
/*    */ import android.view.GestureDetector.OnGestureListener;
/*    */ import android.view.KeyEvent;
/*    */ import android.view.MotionEvent;
/*    */ import android.view.View;
/*    */ import android.view.ViewGroup.LayoutParams;
/*    */ import android.view.animation.Transformation;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Deprecated
/*    */ public class Gallery
/*    */   extends AbsSpinner
/*    */   implements GestureDetector.OnGestureListener
/*    */ {
/*    */   public static class LayoutParams
/*    */     extends ViewGroup.LayoutParams
/*    */   {
/*    */     public LayoutParams(Context c, AttributeSet attrs)
/*    */     {
/* 26 */       super();throw new RuntimeException("Stub!"); }
/* 27 */     public LayoutParams(int w, int h) { super();throw new RuntimeException("Stub!"); }
/* 28 */     public LayoutParams(ViewGroup.LayoutParams source) { super();throw new RuntimeException("Stub!"); } }
/*    */   
/* 30 */   public Gallery(Context context) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 31 */   public Gallery(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 32 */   public Gallery(Context context, AttributeSet attrs, int defStyleAttr) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 33 */   public Gallery(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 34 */   protected void onAttachedToWindow() { throw new RuntimeException("Stub!"); }
/* 35 */   public void setCallbackDuringFling(boolean shouldCallback) { throw new RuntimeException("Stub!"); }
/* 36 */   public void setAnimationDuration(int animationDurationMillis) { throw new RuntimeException("Stub!"); }
/* 37 */   public void setSpacing(int spacing) { throw new RuntimeException("Stub!"); }
/* 38 */   public void setUnselectedAlpha(float unselectedAlpha) { throw new RuntimeException("Stub!"); }
/* 39 */   protected boolean getChildStaticTransformation(View child, Transformation t) { throw new RuntimeException("Stub!"); }
/* 40 */   protected int computeHorizontalScrollExtent() { throw new RuntimeException("Stub!"); }
/* 41 */   protected int computeHorizontalScrollOffset() { throw new RuntimeException("Stub!"); }
/* 42 */   protected int computeHorizontalScrollRange() { throw new RuntimeException("Stub!"); }
/* 43 */   protected boolean checkLayoutParams(ViewGroup.LayoutParams p) { throw new RuntimeException("Stub!"); }
/* 44 */   protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) { throw new RuntimeException("Stub!"); }
/* 45 */   public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attrs) { throw new RuntimeException("Stub!"); }
/* 46 */   protected ViewGroup.LayoutParams generateDefaultLayoutParams() { throw new RuntimeException("Stub!"); }
/* 47 */   protected void onLayout(boolean changed, int l, int t, int r, int b) { throw new RuntimeException("Stub!"); }
/* 48 */   public boolean onTouchEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 49 */   public boolean onSingleTapUp(MotionEvent e) { throw new RuntimeException("Stub!"); }
/* 50 */   public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) { throw new RuntimeException("Stub!"); }
/* 51 */   public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) { throw new RuntimeException("Stub!"); }
/* 52 */   public boolean onDown(MotionEvent e) { throw new RuntimeException("Stub!"); }
/* 53 */   public void onLongPress(MotionEvent e) { throw new RuntimeException("Stub!"); }
/* 54 */   public void onShowPress(MotionEvent e) { throw new RuntimeException("Stub!"); }
/* 55 */   public void dispatchSetSelected(boolean selected) { throw new RuntimeException("Stub!"); }
/* 56 */   protected void dispatchSetPressed(boolean pressed) { throw new RuntimeException("Stub!"); }
/* 57 */   protected ContextMenu.ContextMenuInfo getContextMenuInfo() { throw new RuntimeException("Stub!"); }
/* 58 */   public boolean showContextMenuForChild(View originalView) { throw new RuntimeException("Stub!"); }
/* 59 */   public boolean showContextMenuForChild(View originalView, float x, float y) { throw new RuntimeException("Stub!"); }
/* 60 */   public boolean showContextMenu() { throw new RuntimeException("Stub!"); }
/* 61 */   public boolean showContextMenu(float x, float y) { throw new RuntimeException("Stub!"); }
/* 62 */   public boolean dispatchKeyEvent(KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 63 */   public boolean onKeyDown(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 64 */   public boolean onKeyUp(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 65 */   public void setGravity(int gravity) { throw new RuntimeException("Stub!"); }
/* 66 */   protected int getChildDrawingOrder(int childCount, int i) { throw new RuntimeException("Stub!"); }
/* 67 */   protected void onFocusChanged(boolean gainFocus, int direction, Rect previouslyFocusedRect) { throw new RuntimeException("Stub!"); }
/* 68 */   public CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\widget\Gallery.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */