/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.os.Parcelable;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.ViewStructure;
/*    */ import android.view.autofill.AutofillValue;
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
/*    */ public class TimePicker
/*    */   extends FrameLayout
/*    */ {
/*    */   public TimePicker(Context context)
/*    */   {
/* 25 */     super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 26 */   public TimePicker(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 27 */   public TimePicker(Context context, AttributeSet attrs, int defStyleAttr) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 28 */   public TimePicker(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 29 */   public void setHour(int hour) { throw new RuntimeException("Stub!"); }
/* 30 */   public int getHour() { throw new RuntimeException("Stub!"); }
/* 31 */   public void setMinute(int minute) { throw new RuntimeException("Stub!"); }
/* 32 */   public int getMinute() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 34 */   public void setCurrentHour(Integer currentHour) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 36 */   public Integer getCurrentHour() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 38 */   public void setCurrentMinute(Integer currentMinute) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 40 */   public Integer getCurrentMinute() { throw new RuntimeException("Stub!"); }
/* 41 */   public void setIs24HourView(Boolean is24HourView) { throw new RuntimeException("Stub!"); }
/* 42 */   public boolean is24HourView() { throw new RuntimeException("Stub!"); }
/* 43 */   public void setOnTimeChangedListener(OnTimeChangedListener onTimeChangedListener) { throw new RuntimeException("Stub!"); }
/* 44 */   public void setEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
/* 45 */   public boolean isEnabled() { throw new RuntimeException("Stub!"); }
/* 46 */   public int getBaseline() { throw new RuntimeException("Stub!"); }
/* 47 */   public boolean validateInput() { throw new RuntimeException("Stub!"); }
/* 48 */   protected Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); }
/* 49 */   protected void onRestoreInstanceState(Parcelable state) { throw new RuntimeException("Stub!"); }
/* 50 */   public CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
/* 51 */   public void dispatchProvideAutofillStructure(ViewStructure structure, int flags) { throw new RuntimeException("Stub!"); }
/* 52 */   public void autofill(AutofillValue value) { throw new RuntimeException("Stub!"); }
/* 53 */   public int getAutofillType() { throw new RuntimeException("Stub!"); }
/* 54 */   public AutofillValue getAutofillValue() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface OnTimeChangedListener
/*    */   {
/*    */     public abstract void onTimeChanged(TimePicker paramTimePicker, int paramInt1, int paramInt2);
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\widget\TimePicker.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */