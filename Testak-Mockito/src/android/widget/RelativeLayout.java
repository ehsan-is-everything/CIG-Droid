/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ 
/*    */ @RemoteViews.RemoteView
/*    */ public class RelativeLayout extends android.view.ViewGroup
/*    */ {
/*    */   public static final int ABOVE = 2;
/*    */   public static final int ALIGN_BASELINE = 4;
/*    */   public static final int ALIGN_BOTTOM = 8;
/*    */   public static final int ALIGN_END = 19;
/*    */   public static final int ALIGN_LEFT = 5;
/*    */   public static final int ALIGN_PARENT_BOTTOM = 12;
/*    */   public static final int ALIGN_PARENT_END = 21;
/*    */   public static final int ALIGN_PARENT_LEFT = 9;
/*    */   public static final int ALIGN_PARENT_RIGHT = 11;
/*    */   public static final int ALIGN_PARENT_START = 20;
/*    */   public static final int ALIGN_PARENT_TOP = 10;
/*    */   
/*    */   public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
/*    */     @android.view.ViewDebug.ExportedProperty(category="layout")
/*    */     public boolean alignWithParent;
/*    */     
/*    */     public LayoutParams(Context c, android.util.AttributeSet attrs) {
/* 25 */       super();throw new RuntimeException("Stub!"); }
/* 26 */     public LayoutParams(int w, int h) { super();throw new RuntimeException("Stub!"); }
/* 27 */     public LayoutParams(android.view.ViewGroup.LayoutParams source) { super();throw new RuntimeException("Stub!"); }
/* 28 */     public LayoutParams(android.view.ViewGroup.MarginLayoutParams source) { super();throw new RuntimeException("Stub!"); }
/* 29 */     public LayoutParams(LayoutParams source) { super();throw new RuntimeException("Stub!"); }
/* 30 */     public String debug(String output) { throw new RuntimeException("Stub!"); }
/* 31 */     public void addRule(int verb) { throw new RuntimeException("Stub!"); }
/* 32 */     public void addRule(int verb, int subject) { throw new RuntimeException("Stub!"); }
/* 33 */     public void removeRule(int verb) { throw new RuntimeException("Stub!"); }
/* 34 */     public int getRule(int verb) { throw new RuntimeException("Stub!"); }
/* 35 */     public int[] getRules() { throw new RuntimeException("Stub!"); }
/* 36 */     public void resolveLayoutDirection(int layoutDirection) { throw new RuntimeException("Stub!"); }
/*    */     
/*    */      }
/*    */   
/* 40 */   public RelativeLayout(Context context) { super((Context)null, (android.util.AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 41 */   public RelativeLayout(Context context, android.util.AttributeSet attrs) { super((Context)null, (android.util.AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 42 */   public RelativeLayout(Context context, android.util.AttributeSet attrs, int defStyleAttr) { super((Context)null, (android.util.AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 43 */   public RelativeLayout(Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((Context)null, (android.util.AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 44 */   public boolean shouldDelayChildPressedState() { throw new RuntimeException("Stub!"); }
/* 45 */   public void setIgnoreGravity(int viewId) { throw new RuntimeException("Stub!"); }
/* 46 */   public int getGravity() { throw new RuntimeException("Stub!"); }
/* 47 */   public void setGravity(int gravity) { throw new RuntimeException("Stub!"); }
/* 48 */   public void setHorizontalGravity(int horizontalGravity) { throw new RuntimeException("Stub!"); }
/* 49 */   public void setVerticalGravity(int verticalGravity) { throw new RuntimeException("Stub!"); }
/* 50 */   public int getBaseline() { throw new RuntimeException("Stub!"); }
/* 51 */   public void requestLayout() { throw new RuntimeException("Stub!"); }
/* 52 */   protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
/* 53 */   protected void onLayout(boolean changed, int l, int t, int r, int b) { throw new RuntimeException("Stub!"); }
/* 54 */   public LayoutParams generateLayoutParams(android.util.AttributeSet attrs) { throw new RuntimeException("Stub!"); }
/* 55 */   protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() { throw new RuntimeException("Stub!"); }
/* 56 */   protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams p) { throw new RuntimeException("Stub!"); }
/* 57 */   protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams lp) { throw new RuntimeException("Stub!"); }
/* 58 */   public CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static final int ALIGN_RIGHT = 7;
/*    */   public static final int ALIGN_START = 18;
/*    */   public static final int ALIGN_TOP = 6;
/*    */   public static final int BELOW = 3;
/*    */   public static final int CENTER_HORIZONTAL = 14;
/*    */   public static final int CENTER_IN_PARENT = 13;
/*    */   public static final int CENTER_VERTICAL = 15;
/*    */   public static final int END_OF = 17;
/*    */   public static final int LEFT_OF = 0;
/*    */   public static final int RIGHT_OF = 1;
/*    */   public static final int START_OF = 16;
/*    */   public static final int TRUE = -1;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\widget\RelativeLayout.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */