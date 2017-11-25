/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.graphics.Canvas;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.MotionEvent;
/*    */ import android.view.PointerIcon;
/*    */ import android.view.View;
/*    */ import android.view.View.OnFocusChangeListener;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class TabWidget
/*    */   extends LinearLayout
/*    */   implements View.OnFocusChangeListener
/*    */ {
/*    */   public TabWidget(Context context)
/*    */   {
/* 22 */     super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 23 */   public TabWidget(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 24 */   public TabWidget(Context context, AttributeSet attrs, int defStyleAttr) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 25 */   public TabWidget(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 26 */   protected void onSizeChanged(int w, int h, int oldw, int oldh) { throw new RuntimeException("Stub!"); }
/* 27 */   protected int getChildDrawingOrder(int childCount, int i) { throw new RuntimeException("Stub!"); }
/* 28 */   public View getChildTabViewAt(int index) { throw new RuntimeException("Stub!"); }
/* 29 */   public int getTabCount() { throw new RuntimeException("Stub!"); }
/* 30 */   public void setDividerDrawable(Drawable drawable) { throw new RuntimeException("Stub!"); }
/* 31 */   public void setDividerDrawable(int resId) { throw new RuntimeException("Stub!"); }
/* 32 */   public void setLeftStripDrawable(Drawable drawable) { throw new RuntimeException("Stub!"); }
/* 33 */   public void setLeftStripDrawable(int resId) { throw new RuntimeException("Stub!"); }
/* 34 */   public Drawable getLeftStripDrawable() { throw new RuntimeException("Stub!"); }
/* 35 */   public void setRightStripDrawable(Drawable drawable) { throw new RuntimeException("Stub!"); }
/* 36 */   public void setRightStripDrawable(int resId) { throw new RuntimeException("Stub!"); }
/* 37 */   public Drawable getRightStripDrawable() { throw new RuntimeException("Stub!"); }
/* 38 */   public void setStripEnabled(boolean stripEnabled) { throw new RuntimeException("Stub!"); }
/* 39 */   public boolean isStripEnabled() { throw new RuntimeException("Stub!"); }
/* 40 */   public void childDrawableStateChanged(View child) { throw new RuntimeException("Stub!"); }
/* 41 */   public void dispatchDraw(Canvas canvas) { throw new RuntimeException("Stub!"); }
/* 42 */   public void setCurrentTab(int index) { throw new RuntimeException("Stub!"); }
/* 43 */   public CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
/* 44 */   public void focusCurrentTab(int index) { throw new RuntimeException("Stub!"); }
/* 45 */   public void setEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
/* 46 */   public void addView(View child) { throw new RuntimeException("Stub!"); }
/* 47 */   public void removeAllViews() { throw new RuntimeException("Stub!"); }
/* 48 */   public PointerIcon onResolvePointerIcon(MotionEvent event, int pointerIndex) { throw new RuntimeException("Stub!"); }
/* 49 */   public void onFocusChange(View v, boolean hasFocus) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\widget\TabWidget.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */