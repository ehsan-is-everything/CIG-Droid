/*    */ package android.preference;
/*    */ 
/*    */ import android.app.AlertDialog.Builder;
/*    */ import android.content.Context;
/*    */ import android.content.res.TypedArray;
/*    */ import android.os.Parcelable;
/*    */ import android.util.AttributeSet;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class MultiSelectListPreference
/*    */   extends DialogPreference
/*    */ {
/*    */   public MultiSelectListPreference(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes)
/*    */   {
/* 21 */     super((Context)null);throw new RuntimeException("Stub!"); }
/* 22 */   public MultiSelectListPreference(Context context, AttributeSet attrs, int defStyleAttr) { super((Context)null);throw new RuntimeException("Stub!"); }
/* 23 */   public MultiSelectListPreference(Context context, AttributeSet attrs) { super((Context)null);throw new RuntimeException("Stub!"); }
/* 24 */   public MultiSelectListPreference(Context context) { super((Context)null);throw new RuntimeException("Stub!"); }
/* 25 */   public void setEntries(CharSequence[] entries) { throw new RuntimeException("Stub!"); }
/* 26 */   public void setEntries(int entriesResId) { throw new RuntimeException("Stub!"); }
/* 27 */   public CharSequence[] getEntries() { throw new RuntimeException("Stub!"); }
/* 28 */   public void setEntryValues(CharSequence[] entryValues) { throw new RuntimeException("Stub!"); }
/* 29 */   public void setEntryValues(int entryValuesResId) { throw new RuntimeException("Stub!"); }
/* 30 */   public CharSequence[] getEntryValues() { throw new RuntimeException("Stub!"); }
/* 31 */   public void setValues(Set<String> values) { throw new RuntimeException("Stub!"); }
/* 32 */   public Set<String> getValues() { throw new RuntimeException("Stub!"); }
/* 33 */   public int findIndexOfValue(String value) { throw new RuntimeException("Stub!"); }
/* 34 */   protected void onPrepareDialogBuilder(AlertDialog.Builder builder) { throw new RuntimeException("Stub!"); }
/* 35 */   protected void onDialogClosed(boolean positiveResult) { throw new RuntimeException("Stub!"); }
/* 36 */   protected Object onGetDefaultValue(TypedArray a, int index) { throw new RuntimeException("Stub!"); }
/* 37 */   protected void onSetInitialValue(boolean restoreValue, Object defaultValue) { throw new RuntimeException("Stub!"); }
/* 38 */   protected Parcelable onSaveInstanceState() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\preference\MultiSelectListPreference.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */