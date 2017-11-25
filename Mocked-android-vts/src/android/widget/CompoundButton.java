/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.content.res.ColorStateList;
/*    */ import android.graphics.Canvas;
/*    */ import android.graphics.PorterDuff.Mode;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.os.Parcelable;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.ViewDebug.ExportedProperty;
/*    */ import android.view.ViewStructure;
/*    */ import android.view.autofill.AutofillValue;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class CompoundButton
/*    */   extends Button
/*    */   implements Checkable
/*    */ {
/*    */   public CompoundButton(Context context)
/*    */   {
/* 26 */     super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 27 */   public CompoundButton(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 28 */   public CompoundButton(Context context, AttributeSet attrs, int defStyleAttr) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 29 */   public CompoundButton(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 30 */   public void toggle() { throw new RuntimeException("Stub!"); }
/* 31 */   public boolean performClick() { throw new RuntimeException("Stub!"); }
/*    */   @ViewDebug.ExportedProperty
/* 33 */   public boolean isChecked() { throw new RuntimeException("Stub!"); }
/* 34 */   public void setChecked(boolean checked) { throw new RuntimeException("Stub!"); }
/* 35 */   public void setOnCheckedChangeListener(OnCheckedChangeListener listener) { throw new RuntimeException("Stub!"); }
/* 36 */   public void setButtonDrawable(int resId) { throw new RuntimeException("Stub!"); }
/* 37 */   public void setButtonDrawable(Drawable drawable) { throw new RuntimeException("Stub!"); }
/* 38 */   public Drawable getButtonDrawable() { throw new RuntimeException("Stub!"); }
/* 39 */   public void setButtonTintList(ColorStateList tint) { throw new RuntimeException("Stub!"); }
/* 40 */   public ColorStateList getButtonTintList() { throw new RuntimeException("Stub!"); }
/* 41 */   public void setButtonTintMode(PorterDuff.Mode tintMode) { throw new RuntimeException("Stub!"); }
/* 42 */   public PorterDuff.Mode getButtonTintMode() { throw new RuntimeException("Stub!"); }
/* 43 */   public CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
/* 44 */   public int getCompoundPaddingLeft() { throw new RuntimeException("Stub!"); }
/* 45 */   public int getCompoundPaddingRight() { throw new RuntimeException("Stub!"); }
/* 46 */   protected void onDraw(Canvas canvas) { throw new RuntimeException("Stub!"); }
/* 47 */   protected int[] onCreateDrawableState(int extraSpace) { throw new RuntimeException("Stub!"); }
/* 48 */   protected void drawableStateChanged() { throw new RuntimeException("Stub!"); }
/* 49 */   public void drawableHotspotChanged(float x, float y) { throw new RuntimeException("Stub!"); }
/* 50 */   protected boolean verifyDrawable(Drawable who) { throw new RuntimeException("Stub!"); }
/* 51 */   public void jumpDrawablesToCurrentState() { throw new RuntimeException("Stub!"); }
/* 52 */   public Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); }
/* 53 */   public void onRestoreInstanceState(Parcelable state) { throw new RuntimeException("Stub!"); }
/* 54 */   public void onProvideAutofillStructure(ViewStructure structure, int flags) { throw new RuntimeException("Stub!"); }
/* 55 */   public void autofill(AutofillValue value) { throw new RuntimeException("Stub!"); }
/* 56 */   public int getAutofillType() { throw new RuntimeException("Stub!"); }
/* 57 */   public AutofillValue getAutofillValue() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface OnCheckedChangeListener
/*    */   {
/*    */     public abstract void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean);
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\widget\CompoundButton.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */