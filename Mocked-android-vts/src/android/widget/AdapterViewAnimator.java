/*    */ package android.widget;
/*    */ 
/*    */ import android.animation.ObjectAnimator;
/*    */ import android.content.Context;
/*    */ import android.content.Intent;
/*    */ import android.os.Parcelable;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.MotionEvent;
/*    */ import android.view.View;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class AdapterViewAnimator
/*    */   extends AdapterView<Adapter>
/*    */   implements Advanceable
/*    */ {
/*    */   public AdapterViewAnimator(Context context)
/*    */   {
/* 22 */     super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 23 */   public AdapterViewAnimator(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 24 */   public AdapterViewAnimator(Context context, AttributeSet attrs, int defStyleAttr) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 25 */   public AdapterViewAnimator(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 26 */   public void setDisplayedChild(int whichChild) { throw new RuntimeException("Stub!"); }
/* 27 */   public int getDisplayedChild() { throw new RuntimeException("Stub!"); }
/* 28 */   public void showNext() { throw new RuntimeException("Stub!"); }
/* 29 */   public void showPrevious() { throw new RuntimeException("Stub!"); }
/* 30 */   public boolean onTouchEvent(MotionEvent ev) { throw new RuntimeException("Stub!"); }
/* 31 */   protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
/* 32 */   protected void onLayout(boolean changed, int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
/* 33 */   public Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); }
/* 34 */   public void onRestoreInstanceState(Parcelable state) { throw new RuntimeException("Stub!"); }
/* 35 */   public View getCurrentView() { throw new RuntimeException("Stub!"); }
/* 36 */   public ObjectAnimator getInAnimation() { throw new RuntimeException("Stub!"); }
/* 37 */   public void setInAnimation(ObjectAnimator inAnimation) { throw new RuntimeException("Stub!"); }
/* 38 */   public ObjectAnimator getOutAnimation() { throw new RuntimeException("Stub!"); }
/* 39 */   public void setOutAnimation(ObjectAnimator outAnimation) { throw new RuntimeException("Stub!"); }
/* 40 */   public void setInAnimation(Context context, int resourceID) { throw new RuntimeException("Stub!"); }
/* 41 */   public void setOutAnimation(Context context, int resourceID) { throw new RuntimeException("Stub!"); }
/* 42 */   public void setAnimateFirstView(boolean animate) { throw new RuntimeException("Stub!"); }
/* 43 */   public int getBaseline() { throw new RuntimeException("Stub!"); }
/* 44 */   public Adapter getAdapter() { throw new RuntimeException("Stub!"); }
/* 45 */   public void setAdapter(Adapter adapter) { throw new RuntimeException("Stub!"); }
/* 46 */   public void setRemoteViewsAdapter(Intent intent) { throw new RuntimeException("Stub!"); }
/* 47 */   public void setSelection(int position) { throw new RuntimeException("Stub!"); }
/* 48 */   public View getSelectedView() { throw new RuntimeException("Stub!"); }
/* 49 */   public void deferNotifyDataSetChanged() { throw new RuntimeException("Stub!"); }
/* 50 */   public boolean onRemoteAdapterConnected() { throw new RuntimeException("Stub!"); }
/* 51 */   public void onRemoteAdapterDisconnected() { throw new RuntimeException("Stub!"); }
/* 52 */   public void advance() { throw new RuntimeException("Stub!"); }
/* 53 */   public void fyiWillBeAdvancedByHostKThx() { throw new RuntimeException("Stub!"); }
/* 54 */   public CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\widget\AdapterViewAnimator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */