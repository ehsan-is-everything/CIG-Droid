/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.content.res.TypedArray;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.View;
/*    */ import android.view.ViewGroup.LayoutParams;
/*    */ import android.view.ViewGroup.MarginLayoutParams;
/*    */ import android.view.ViewGroup.OnHierarchyChangeListener;
/*    */ import android.view.ViewStructure;
/*    */ import android.view.autofill.AutofillValue;
/*    */ 
/*    */ public class RadioGroup extends LinearLayout
/*    */ {
/*    */   public static abstract interface OnCheckedChangeListener
/*    */   {
/*    */     public abstract void onCheckedChanged(RadioGroup paramRadioGroup, int paramInt);
/*    */   }
/*    */   
/*    */   public static class LayoutParams extends LinearLayout.LayoutParams
/*    */   {
/*    */     public LayoutParams(Context c, AttributeSet attrs)
/*    */     {
/* 24 */       super();throw new RuntimeException("Stub!"); }
/* 25 */     public LayoutParams(int w, int h) { super();throw new RuntimeException("Stub!"); }
/* 26 */     public LayoutParams(int w, int h, float initWeight) { super();throw new RuntimeException("Stub!"); }
/* 27 */     public LayoutParams(ViewGroup.LayoutParams p) { super();throw new RuntimeException("Stub!"); }
/* 28 */     public LayoutParams(ViewGroup.MarginLayoutParams source) { super();throw new RuntimeException("Stub!"); }
/* 29 */     protected void setBaseAttributes(TypedArray a, int widthAttr, int heightAttr) { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */ 
/*    */   public RadioGroup(Context context)
/*    */   {
/* 35 */     super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 36 */   public RadioGroup(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 37 */   public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener listener) { throw new RuntimeException("Stub!"); }
/* 38 */   protected void onFinishInflate() { throw new RuntimeException("Stub!"); }
/* 39 */   public void addView(View child, int index, ViewGroup.LayoutParams params) { throw new RuntimeException("Stub!"); }
/* 40 */   public void check(int id) { throw new RuntimeException("Stub!"); }
/* 41 */   public int getCheckedRadioButtonId() { throw new RuntimeException("Stub!"); }
/* 42 */   public void clearCheck() { throw new RuntimeException("Stub!"); }
/* 43 */   public void setOnCheckedChangeListener(OnCheckedChangeListener listener) { throw new RuntimeException("Stub!"); }
/* 44 */   public LayoutParams generateLayoutParams(AttributeSet attrs) { throw new RuntimeException("Stub!"); }
/* 45 */   protected boolean checkLayoutParams(ViewGroup.LayoutParams p) { throw new RuntimeException("Stub!"); }
/* 46 */   protected LinearLayout.LayoutParams generateDefaultLayoutParams() { throw new RuntimeException("Stub!"); }
/* 47 */   public CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
/* 48 */   public void onProvideAutofillStructure(ViewStructure structure, int flags) { throw new RuntimeException("Stub!"); }
/* 49 */   public void autofill(AutofillValue value) { throw new RuntimeException("Stub!"); }
/* 50 */   public int getAutofillType() { throw new RuntimeException("Stub!"); }
/* 51 */   public AutofillValue getAutofillValue() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\widget\RadioGroup.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */