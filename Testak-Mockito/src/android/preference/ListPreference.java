/*    */ package android.preference;
/*    */ 
/*    */ import android.app.AlertDialog.Builder;
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
/*    */ public class ListPreference
/*    */   extends DialogPreference
/*    */ {
/*    */   public ListPreference(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes)
/*    */   {
/* 21 */     super((Context)null);throw new RuntimeException("Stub!"); }
/* 22 */   public ListPreference(Context context, AttributeSet attrs, int defStyleAttr) { super((Context)null);throw new RuntimeException("Stub!"); }
/* 23 */   public ListPreference(Context context, AttributeSet attrs) { super((Context)null);throw new RuntimeException("Stub!"); }
/* 24 */   public ListPreference(Context context) { super((Context)null);throw new RuntimeException("Stub!"); }
/* 25 */   public void setEntries(CharSequence[] entries) { throw new RuntimeException("Stub!"); }
/* 26 */   public void setEntries(int entriesResId) { throw new RuntimeException("Stub!"); }
/* 27 */   public CharSequence[] getEntries() { throw new RuntimeException("Stub!"); }
/* 28 */   public void setEntryValues(CharSequence[] entryValues) { throw new RuntimeException("Stub!"); }
/* 29 */   public void setEntryValues(int entryValuesResId) { throw new RuntimeException("Stub!"); }
/* 30 */   public CharSequence[] getEntryValues() { throw new RuntimeException("Stub!"); }
/* 31 */   public void setValue(String value) { throw new RuntimeException("Stub!"); }
/* 32 */   public CharSequence getSummary() { throw new RuntimeException("Stub!"); }
/* 33 */   public void setSummary(CharSequence summary) { throw new RuntimeException("Stub!"); }
/* 34 */   public void setValueIndex(int index) { throw new RuntimeException("Stub!"); }
/* 35 */   public String getValue() { throw new RuntimeException("Stub!"); }
/* 36 */   public CharSequence getEntry() { throw new RuntimeException("Stub!"); }
/* 37 */   public int findIndexOfValue(String value) { throw new RuntimeException("Stub!"); }
/* 38 */   protected void onPrepareDialogBuilder(AlertDialog.Builder builder) { throw new RuntimeException("Stub!"); }
/* 39 */   protected void onDialogClosed(boolean positiveResult) { throw new RuntimeException("Stub!"); }
/* 40 */   protected Object onGetDefaultValue(TypedArray a, int index) { throw new RuntimeException("Stub!"); }
/* 41 */   protected void onSetInitialValue(boolean restoreValue, Object defaultValue) { throw new RuntimeException("Stub!"); }
/* 42 */   protected Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); }
/* 43 */   protected void onRestoreInstanceState(Parcelable state) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\preference\ListPreference.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */