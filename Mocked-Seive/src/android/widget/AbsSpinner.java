/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.os.Parcelable;
/*    */ import android.util.AttributeSet;
/*    */ import android.util.SparseArray;
/*    */ import android.view.View;
/*    */ import android.view.ViewGroup.LayoutParams;
/*    */ import android.view.autofill.AutofillValue;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class AbsSpinner
/*    */   extends AdapterView<SpinnerAdapter>
/*    */ {
/*    */   public AbsSpinner(Context context)
/*    */   {
/* 21 */     super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 22 */   public AbsSpinner(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 23 */   public AbsSpinner(Context context, AttributeSet attrs, int defStyleAttr) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 24 */   public AbsSpinner(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 25 */   public void setAdapter(SpinnerAdapter adapter) { throw new RuntimeException("Stub!"); }
/* 26 */   protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
/* 27 */   protected ViewGroup.LayoutParams generateDefaultLayoutParams() { throw new RuntimeException("Stub!"); }
/* 28 */   public void setSelection(int position, boolean animate) { throw new RuntimeException("Stub!"); }
/* 29 */   public void setSelection(int position) { throw new RuntimeException("Stub!"); }
/* 30 */   public View getSelectedView() { throw new RuntimeException("Stub!"); }
/* 31 */   public void requestLayout() { throw new RuntimeException("Stub!"); }
/* 32 */   public SpinnerAdapter getAdapter() { throw new RuntimeException("Stub!"); }
/* 33 */   public int getCount() { throw new RuntimeException("Stub!"); }
/* 34 */   public int pointToPosition(int x, int y) { throw new RuntimeException("Stub!"); }
/* 35 */   protected void dispatchRestoreInstanceState(SparseArray<Parcelable> container) { throw new RuntimeException("Stub!"); }
/* 36 */   public Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); }
/* 37 */   public void onRestoreInstanceState(Parcelable state) { throw new RuntimeException("Stub!"); }
/* 38 */   public CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
/* 39 */   public void autofill(AutofillValue value) { throw new RuntimeException("Stub!"); }
/* 40 */   public int getAutofillType() { throw new RuntimeException("Stub!"); }
/* 41 */   public AutofillValue getAutofillValue() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\widget\AbsSpinner.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */