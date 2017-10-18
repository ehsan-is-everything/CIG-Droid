/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.transition.Transition;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.View;
/*    */ import android.view.View.OnTouchListener;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class PopupWindow
/*    */ {
/*    */   public static final int INPUT_METHOD_FROM_FOCUSABLE = 0;
/*    */   public static final int INPUT_METHOD_NEEDED = 1;
/*    */   public static final int INPUT_METHOD_NOT_NEEDED = 2;
/*    */   
/* 24 */   public PopupWindow(Context context) { throw new RuntimeException("Stub!"); }
/* 25 */   public PopupWindow(Context context, AttributeSet attrs) { throw new RuntimeException("Stub!"); }
/* 26 */   public PopupWindow(Context context, AttributeSet attrs, int defStyleAttr) { throw new RuntimeException("Stub!"); }
/* 27 */   public PopupWindow(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) { throw new RuntimeException("Stub!"); }
/* 28 */   public PopupWindow() { throw new RuntimeException("Stub!"); }
/* 29 */   public PopupWindow(View contentView) { throw new RuntimeException("Stub!"); }
/* 30 */   public PopupWindow(int width, int height) { throw new RuntimeException("Stub!"); }
/* 31 */   public PopupWindow(View contentView, int width, int height) { throw new RuntimeException("Stub!"); }
/* 32 */   public PopupWindow(View contentView, int width, int height, boolean focusable) { throw new RuntimeException("Stub!"); }
/* 33 */   public void setEnterTransition(Transition enterTransition) { throw new RuntimeException("Stub!"); }
/* 34 */   public Transition getEnterTransition() { throw new RuntimeException("Stub!"); }
/* 35 */   public void setExitTransition(Transition exitTransition) { throw new RuntimeException("Stub!"); }
/* 36 */   public Transition getExitTransition() { throw new RuntimeException("Stub!"); }
/* 37 */   public Drawable getBackground() { throw new RuntimeException("Stub!"); }
/* 38 */   public void setBackgroundDrawable(Drawable background) { throw new RuntimeException("Stub!"); }
/* 39 */   public float getElevation() { throw new RuntimeException("Stub!"); }
/* 40 */   public void setElevation(float elevation) { throw new RuntimeException("Stub!"); }
/* 41 */   public int getAnimationStyle() { throw new RuntimeException("Stub!"); }
/* 42 */   public void setIgnoreCheekPress() { throw new RuntimeException("Stub!"); }
/* 43 */   public void setAnimationStyle(int animationStyle) { throw new RuntimeException("Stub!"); }
/* 44 */   public View getContentView() { throw new RuntimeException("Stub!"); }
/* 45 */   public void setContentView(View contentView) { throw new RuntimeException("Stub!"); }
/* 46 */   public void setTouchInterceptor(View.OnTouchListener l) { throw new RuntimeException("Stub!"); }
/* 47 */   public boolean isFocusable() { throw new RuntimeException("Stub!"); }
/* 48 */   public void setFocusable(boolean focusable) { throw new RuntimeException("Stub!"); }
/* 49 */   public int getInputMethodMode() { throw new RuntimeException("Stub!"); }
/* 50 */   public void setInputMethodMode(int mode) { throw new RuntimeException("Stub!"); }
/* 51 */   public void setSoftInputMode(int mode) { throw new RuntimeException("Stub!"); }
/* 52 */   public int getSoftInputMode() { throw new RuntimeException("Stub!"); }
/* 53 */   public boolean isTouchable() { throw new RuntimeException("Stub!"); }
/* 54 */   public void setTouchable(boolean touchable) { throw new RuntimeException("Stub!"); }
/* 55 */   public boolean isOutsideTouchable() { throw new RuntimeException("Stub!"); }
/* 56 */   public void setOutsideTouchable(boolean touchable) { throw new RuntimeException("Stub!"); }
/* 57 */   public boolean isClippingEnabled() { throw new RuntimeException("Stub!"); }
/* 58 */   public void setClippingEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
/* 59 */   public boolean isSplitTouchEnabled() { throw new RuntimeException("Stub!"); }
/* 60 */   public void setSplitTouchEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
/* 61 */   public boolean isAttachedInDecor() { throw new RuntimeException("Stub!"); }
/* 62 */   public void setAttachedInDecor(boolean enabled) { throw new RuntimeException("Stub!"); }
/* 63 */   public void setWindowLayoutType(int layoutType) { throw new RuntimeException("Stub!"); }
/* 64 */   public int getWindowLayoutType() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 66 */   public void setWindowLayoutMode(int widthSpec, int heightSpec) { throw new RuntimeException("Stub!"); }
/* 67 */   public int getHeight() { throw new RuntimeException("Stub!"); }
/* 68 */   public void setHeight(int height) { throw new RuntimeException("Stub!"); }
/* 69 */   public int getWidth() { throw new RuntimeException("Stub!"); }
/* 70 */   public void setWidth(int width) { throw new RuntimeException("Stub!"); }
/* 71 */   public void setOverlapAnchor(boolean overlapAnchor) { throw new RuntimeException("Stub!"); }
/* 72 */   public boolean getOverlapAnchor() { throw new RuntimeException("Stub!"); }
/* 73 */   public boolean isShowing() { throw new RuntimeException("Stub!"); }
/* 74 */   public void showAtLocation(View parent, int gravity, int x, int y) { throw new RuntimeException("Stub!"); }
/* 75 */   public void showAsDropDown(View anchor) { throw new RuntimeException("Stub!"); }
/* 76 */   public void showAsDropDown(View anchor, int xoff, int yoff) { throw new RuntimeException("Stub!"); }
/* 77 */   public void showAsDropDown(View anchor, int xoff, int yoff, int gravity) { throw new RuntimeException("Stub!"); }
/* 78 */   public boolean isAboveAnchor() { throw new RuntimeException("Stub!"); }
/* 79 */   public int getMaxAvailableHeight(View anchor) { throw new RuntimeException("Stub!"); }
/* 80 */   public int getMaxAvailableHeight(View anchor, int yOffset) { throw new RuntimeException("Stub!"); }
/* 81 */   public int getMaxAvailableHeight(View anchor, int yOffset, boolean ignoreBottomDecorations) { throw new RuntimeException("Stub!"); }
/* 82 */   public void dismiss() { throw new RuntimeException("Stub!"); }
/* 83 */   public void setOnDismissListener(OnDismissListener onDismissListener) { throw new RuntimeException("Stub!"); }
/* 84 */   public void update() { throw new RuntimeException("Stub!"); }
/* 85 */   public void update(int width, int height) { throw new RuntimeException("Stub!"); }
/* 86 */   public void update(int x, int y, int width, int height) { throw new RuntimeException("Stub!"); }
/* 87 */   public void update(int x, int y, int width, int height, boolean force) { throw new RuntimeException("Stub!"); }
/* 88 */   public void update(View anchor, int width, int height) { throw new RuntimeException("Stub!"); }
/* 89 */   public void update(View anchor, int xoff, int yoff, int width, int height) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface OnDismissListener
/*    */   {
/*    */     public abstract void onDismiss();
/*    */   }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\widget\PopupWindow.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */