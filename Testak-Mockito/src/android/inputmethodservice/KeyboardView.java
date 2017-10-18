/*    */ package android.inputmethodservice;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.graphics.Canvas;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.MotionEvent;
/*    */ import android.view.View;
/*    */ import android.view.View.OnClickListener;
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
/*    */ public class KeyboardView
/*    */   extends View
/*    */   implements View.OnClickListener
/*    */ {
/*    */   public KeyboardView(Context context, AttributeSet attrs)
/*    */   {
/* 33 */     super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 34 */   public KeyboardView(Context context, AttributeSet attrs, int defStyleAttr) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 35 */   public KeyboardView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 36 */   protected void onAttachedToWindow() { throw new RuntimeException("Stub!"); }
/* 37 */   public void setOnKeyboardActionListener(OnKeyboardActionListener listener) { throw new RuntimeException("Stub!"); }
/* 38 */   protected OnKeyboardActionListener getOnKeyboardActionListener() { throw new RuntimeException("Stub!"); }
/* 39 */   public void setKeyboard(Keyboard keyboard) { throw new RuntimeException("Stub!"); }
/* 40 */   public Keyboard getKeyboard() { throw new RuntimeException("Stub!"); }
/* 41 */   public boolean setShifted(boolean shifted) { throw new RuntimeException("Stub!"); }
/* 42 */   public boolean isShifted() { throw new RuntimeException("Stub!"); }
/* 43 */   public void setPreviewEnabled(boolean previewEnabled) { throw new RuntimeException("Stub!"); }
/* 44 */   public boolean isPreviewEnabled() { throw new RuntimeException("Stub!"); }
/* 45 */   public void setVerticalCorrection(int verticalOffset) { throw new RuntimeException("Stub!"); }
/* 46 */   public void setPopupParent(View v) { throw new RuntimeException("Stub!"); }
/* 47 */   public void setPopupOffset(int x, int y) { throw new RuntimeException("Stub!"); }
/* 48 */   public void setProximityCorrectionEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
/* 49 */   public boolean isProximityCorrectionEnabled() { throw new RuntimeException("Stub!"); }
/* 50 */   public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
/* 51 */   public void onSizeChanged(int w, int h, int oldw, int oldh) { throw new RuntimeException("Stub!"); }
/* 52 */   public void onDraw(Canvas canvas) { throw new RuntimeException("Stub!"); }
/* 53 */   public void invalidateAllKeys() { throw new RuntimeException("Stub!"); }
/* 54 */   public void invalidateKey(int keyIndex) { throw new RuntimeException("Stub!"); }
/* 55 */   protected boolean onLongPress(Keyboard.Key popupKey) { throw new RuntimeException("Stub!"); }
/* 56 */   public boolean onHoverEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 57 */   public boolean onTouchEvent(MotionEvent me) { throw new RuntimeException("Stub!"); }
/* 58 */   protected void swipeRight() { throw new RuntimeException("Stub!"); }
/* 59 */   protected void swipeLeft() { throw new RuntimeException("Stub!"); }
/* 60 */   protected void swipeUp() { throw new RuntimeException("Stub!"); }
/* 61 */   protected void swipeDown() { throw new RuntimeException("Stub!"); }
/* 62 */   public void closing() { throw new RuntimeException("Stub!"); }
/* 63 */   public void onDetachedFromWindow() { throw new RuntimeException("Stub!"); }
/* 64 */   public boolean handleBack() { throw new RuntimeException("Stub!"); }
/* 65 */   public void onClick(View v) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface OnKeyboardActionListener
/*    */   {
/*    */     public abstract void onPress(int paramInt);
/*    */     
/*    */     public abstract void onRelease(int paramInt);
/*    */     
/*    */     public abstract void onKey(int paramInt, int[] paramArrayOfInt);
/*    */     
/*    */     public abstract void onText(CharSequence paramCharSequence);
/*    */     
/*    */     public abstract void swipeLeft();
/*    */     
/*    */     public abstract void swipeRight();
/*    */     
/*    */     public abstract void swipeDown();
/*    */     
/*    */     public abstract void swipeUp();
/*    */   }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\inputmethodservice\KeyboardView.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */