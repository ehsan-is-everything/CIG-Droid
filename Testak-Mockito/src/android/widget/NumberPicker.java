/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.graphics.Canvas;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.KeyEvent;
/*    */ import android.view.MotionEvent;
/*    */ import android.view.accessibility.AccessibilityNodeProvider;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class NumberPicker
/*    */   extends LinearLayout
/*    */ {
/*    */   public NumberPicker(Context context)
/*    */   {
/* 36 */     super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 37 */   public NumberPicker(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 38 */   public NumberPicker(Context context, AttributeSet attrs, int defStyleAttr) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 39 */   public NumberPicker(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 40 */   protected void onLayout(boolean changed, int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
/* 41 */   protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
/* 42 */   public boolean onInterceptTouchEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 43 */   public boolean onTouchEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 44 */   public boolean dispatchTouchEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 45 */   public boolean dispatchKeyEvent(KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 46 */   public boolean dispatchTrackballEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 47 */   protected boolean dispatchHoverEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 48 */   public void computeScroll() { throw new RuntimeException("Stub!"); }
/* 49 */   public void setEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
/* 50 */   public void scrollBy(int x, int y) { throw new RuntimeException("Stub!"); }
/* 51 */   protected int computeVerticalScrollOffset() { throw new RuntimeException("Stub!"); }
/* 52 */   protected int computeVerticalScrollRange() { throw new RuntimeException("Stub!"); }
/* 53 */   protected int computeVerticalScrollExtent() { throw new RuntimeException("Stub!"); }
/* 54 */   public int getSolidColor() { throw new RuntimeException("Stub!"); }
/* 55 */   public void setOnValueChangedListener(OnValueChangeListener onValueChangedListener) { throw new RuntimeException("Stub!"); }
/* 56 */   public void setOnScrollListener(OnScrollListener onScrollListener) { throw new RuntimeException("Stub!"); }
/* 57 */   public void setFormatter(Formatter formatter) { throw new RuntimeException("Stub!"); }
/* 58 */   public void setValue(int value) { throw new RuntimeException("Stub!"); }
/* 59 */   public boolean performClick() { throw new RuntimeException("Stub!"); }
/* 60 */   public boolean performLongClick() { throw new RuntimeException("Stub!"); }
/* 61 */   public boolean getWrapSelectorWheel() { throw new RuntimeException("Stub!"); }
/* 62 */   public void setWrapSelectorWheel(boolean wrapSelectorWheel) { throw new RuntimeException("Stub!"); }
/* 63 */   public void setOnLongPressUpdateInterval(long intervalMillis) { throw new RuntimeException("Stub!"); }
/* 64 */   public int getValue() { throw new RuntimeException("Stub!"); }
/* 65 */   public int getMinValue() { throw new RuntimeException("Stub!"); }
/* 66 */   public void setMinValue(int minValue) { throw new RuntimeException("Stub!"); }
/* 67 */   public int getMaxValue() { throw new RuntimeException("Stub!"); }
/* 68 */   public void setMaxValue(int maxValue) { throw new RuntimeException("Stub!"); }
/* 69 */   public String[] getDisplayedValues() { throw new RuntimeException("Stub!"); }
/* 70 */   public void setDisplayedValues(String[] displayedValues) { throw new RuntimeException("Stub!"); }
/* 71 */   protected float getTopFadingEdgeStrength() { throw new RuntimeException("Stub!"); }
/* 72 */   protected float getBottomFadingEdgeStrength() { throw new RuntimeException("Stub!"); }
/* 73 */   protected void onDetachedFromWindow() { throw new RuntimeException("Stub!"); }
/* 74 */   protected void drawableStateChanged() { throw new RuntimeException("Stub!"); }
/* 75 */   public void jumpDrawablesToCurrentState() { throw new RuntimeException("Stub!"); }
/* 76 */   protected void onDraw(Canvas canvas) { throw new RuntimeException("Stub!"); }
/* 77 */   public AccessibilityNodeProvider getAccessibilityNodeProvider() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface Formatter
/*    */   {
/*    */     public abstract String format(int paramInt);
/*    */   }
/*    */   
/*    */   public static abstract interface OnScrollListener
/*    */   {
/*    */     public static final int SCROLL_STATE_FLING = 2;
/*    */     public static final int SCROLL_STATE_IDLE = 0;
/*    */     public static final int SCROLL_STATE_TOUCH_SCROLL = 1;
/*    */     
/*    */     public abstract void onScrollStateChange(NumberPicker paramNumberPicker, int paramInt);
/*    */   }
/*    */   
/*    */   public static abstract interface OnValueChangeListener
/*    */   {
/*    */     public abstract void onValueChange(NumberPicker paramNumberPicker, int paramInt1, int paramInt2);
/*    */   }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\widget\NumberPicker.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */