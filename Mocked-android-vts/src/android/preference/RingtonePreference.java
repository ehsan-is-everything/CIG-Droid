/*    */ package android.preference;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.content.Intent;
/*    */ import android.content.res.TypedArray;
/*    */ import android.net.Uri;
/*    */ import android.util.AttributeSet;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class RingtonePreference
/*    */   extends Preference
/*    */   implements PreferenceManager.OnActivityResultListener
/*    */ {
/*    */   public RingtonePreference(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes)
/*    */   {
/* 22 */     super((Context)null);throw new RuntimeException("Stub!"); }
/* 23 */   public RingtonePreference(Context context, AttributeSet attrs, int defStyleAttr) { super((Context)null);throw new RuntimeException("Stub!"); }
/* 24 */   public RingtonePreference(Context context, AttributeSet attrs) { super((Context)null);throw new RuntimeException("Stub!"); }
/* 25 */   public RingtonePreference(Context context) { super((Context)null);throw new RuntimeException("Stub!"); }
/* 26 */   public int getRingtoneType() { throw new RuntimeException("Stub!"); }
/* 27 */   public void setRingtoneType(int type) { throw new RuntimeException("Stub!"); }
/* 28 */   public boolean getShowDefault() { throw new RuntimeException("Stub!"); }
/* 29 */   public void setShowDefault(boolean showDefault) { throw new RuntimeException("Stub!"); }
/* 30 */   public boolean getShowSilent() { throw new RuntimeException("Stub!"); }
/* 31 */   public void setShowSilent(boolean showSilent) { throw new RuntimeException("Stub!"); }
/* 32 */   protected void onClick() { throw new RuntimeException("Stub!"); }
/* 33 */   protected void onPrepareRingtonePickerIntent(Intent ringtonePickerIntent) { throw new RuntimeException("Stub!"); }
/* 34 */   protected void onSaveRingtone(Uri ringtoneUri) { throw new RuntimeException("Stub!"); }
/* 35 */   protected Uri onRestoreRingtone() { throw new RuntimeException("Stub!"); }
/* 36 */   protected Object onGetDefaultValue(TypedArray a, int index) { throw new RuntimeException("Stub!"); }
/* 37 */   protected void onSetInitialValue(boolean restorePersistedValue, Object defaultValueObj) { throw new RuntimeException("Stub!"); }
/* 38 */   protected void onAttachedToHierarchy(PreferenceManager preferenceManager) { throw new RuntimeException("Stub!"); }
/* 39 */   public boolean onActivityResult(int requestCode, int resultCode, Intent data) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\preference\RingtonePreference.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */