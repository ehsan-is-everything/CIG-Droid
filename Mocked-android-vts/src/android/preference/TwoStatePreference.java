/*    */ package android.preference;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.content.res.TypedArray;
/*    */ import android.os.Parcelable;
/*    */ import android.util.AttributeSet;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class TwoStatePreference
/*    */   extends Preference
/*    */ {
/*    */   public TwoStatePreference(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes)
/*    */   {
/* 21 */     super((Context)null);throw new RuntimeException("Stub!"); }
/* 22 */   public TwoStatePreference(Context context, AttributeSet attrs, int defStyleAttr) { super((Context)null);throw new RuntimeException("Stub!"); }
/* 23 */   public TwoStatePreference(Context context, AttributeSet attrs) { super((Context)null);throw new RuntimeException("Stub!"); }
/* 24 */   public TwoStatePreference(Context context) { super((Context)null);throw new RuntimeException("Stub!"); }
/* 25 */   protected void onClick() { throw new RuntimeException("Stub!"); }
/* 26 */   public void setChecked(boolean checked) { throw new RuntimeException("Stub!"); }
/* 27 */   public boolean isChecked() { throw new RuntimeException("Stub!"); }
/* 28 */   public boolean shouldDisableDependents() { throw new RuntimeException("Stub!"); }
/* 29 */   public void setSummaryOn(CharSequence summary) { throw new RuntimeException("Stub!"); }
/* 30 */   public void setSummaryOn(int summaryResId) { throw new RuntimeException("Stub!"); }
/* 31 */   public CharSequence getSummaryOn() { throw new RuntimeException("Stub!"); }
/* 32 */   public void setSummaryOff(CharSequence summary) { throw new RuntimeException("Stub!"); }
/* 33 */   public void setSummaryOff(int summaryResId) { throw new RuntimeException("Stub!"); }
/* 34 */   public CharSequence getSummaryOff() { throw new RuntimeException("Stub!"); }
/* 35 */   public boolean getDisableDependentsState() { throw new RuntimeException("Stub!"); }
/* 36 */   public void setDisableDependentsState(boolean disableDependentsState) { throw new RuntimeException("Stub!"); }
/* 37 */   protected Object onGetDefaultValue(TypedArray a, int index) { throw new RuntimeException("Stub!"); }
/* 38 */   protected void onSetInitialValue(boolean restoreValue, Object defaultValue) { throw new RuntimeException("Stub!"); }
/* 39 */   protected Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); }
/* 40 */   protected void onRestoreInstanceState(Parcelable state) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\preference\TwoStatePreference.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */