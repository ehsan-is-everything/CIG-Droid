/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.content.DialogInterface;
/*    */ import android.content.DialogInterface.OnClickListener;
/*    */ import android.content.res.Resources.Theme;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.os.Parcelable;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.MotionEvent;
/*    */ import android.view.PointerIcon;
/*    */ 
/*    */ public class Spinner
/*    */   extends AbsSpinner
/*    */   implements DialogInterface.OnClickListener
/*    */ {
/*    */   public static final int MODE_DIALOG = 0;
/*    */   public static final int MODE_DROPDOWN = 1;
/*    */   
/*    */   public Spinner(Context context)
/*    */   {
/* 22 */     super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 23 */   public Spinner(Context context, int mode) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 24 */   public Spinner(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 25 */   public Spinner(Context context, AttributeSet attrs, int defStyleAttr) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 26 */   public Spinner(Context context, AttributeSet attrs, int defStyleAttr, int mode) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 27 */   public Spinner(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes, int mode) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 28 */   public Spinner(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes, int mode, Resources.Theme popupTheme) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 29 */   public Context getPopupContext() { throw new RuntimeException("Stub!"); }
/* 30 */   public void setPopupBackgroundDrawable(Drawable background) { throw new RuntimeException("Stub!"); }
/* 31 */   public void setPopupBackgroundResource(int resId) { throw new RuntimeException("Stub!"); }
/* 32 */   public Drawable getPopupBackground() { throw new RuntimeException("Stub!"); }
/* 33 */   public void setDropDownVerticalOffset(int pixels) { throw new RuntimeException("Stub!"); }
/* 34 */   public int getDropDownVerticalOffset() { throw new RuntimeException("Stub!"); }
/* 35 */   public void setDropDownHorizontalOffset(int pixels) { throw new RuntimeException("Stub!"); }
/* 36 */   public int getDropDownHorizontalOffset() { throw new RuntimeException("Stub!"); }
/* 37 */   public void setDropDownWidth(int pixels) { throw new RuntimeException("Stub!"); }
/* 38 */   public int getDropDownWidth() { throw new RuntimeException("Stub!"); }
/* 39 */   public void setEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
/* 40 */   public void setGravity(int gravity) { throw new RuntimeException("Stub!"); }
/* 41 */   public int getGravity() { throw new RuntimeException("Stub!"); }
/* 42 */   public void setAdapter(SpinnerAdapter adapter) { throw new RuntimeException("Stub!"); }
/* 43 */   public int getBaseline() { throw new RuntimeException("Stub!"); }
/* 44 */   protected void onDetachedFromWindow() { throw new RuntimeException("Stub!"); }
/* 45 */   public void setOnItemClickListener(AdapterView.OnItemClickListener l) { throw new RuntimeException("Stub!"); }
/* 46 */   public boolean onTouchEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 47 */   protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
/* 48 */   protected void onLayout(boolean changed, int l, int t, int r, int b) { throw new RuntimeException("Stub!"); }
/* 49 */   public boolean performClick() { throw new RuntimeException("Stub!"); }
/* 50 */   public void onClick(DialogInterface dialog, int which) { throw new RuntimeException("Stub!"); }
/* 51 */   public CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
/* 52 */   public void setPrompt(CharSequence prompt) { throw new RuntimeException("Stub!"); }
/* 53 */   public void setPromptId(int promptId) { throw new RuntimeException("Stub!"); }
/* 54 */   public CharSequence getPrompt() { throw new RuntimeException("Stub!"); }
/* 55 */   public Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); }
/* 56 */   public void onRestoreInstanceState(Parcelable state) { throw new RuntimeException("Stub!"); }
/* 57 */   public PointerIcon onResolvePointerIcon(MotionEvent event, int pointerIndex) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\widget\Spinner.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */