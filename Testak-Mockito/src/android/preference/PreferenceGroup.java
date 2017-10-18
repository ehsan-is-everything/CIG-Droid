/*    */ package android.preference;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.os.Bundle;
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
/*    */ 
/*    */ public abstract class PreferenceGroup
/*    */   extends Preference
/*    */ {
/*    */   public PreferenceGroup(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes)
/*    */   {
/* 21 */     super((Context)null);throw new RuntimeException("Stub!"); }
/* 22 */   public PreferenceGroup(Context context, AttributeSet attrs, int defStyleAttr) { super((Context)null);throw new RuntimeException("Stub!"); }
/* 23 */   public PreferenceGroup(Context context, AttributeSet attrs) { super((Context)null);throw new RuntimeException("Stub!"); }
/* 24 */   public void setOrderingAsAdded(boolean orderingAsAdded) { throw new RuntimeException("Stub!"); }
/* 25 */   public boolean isOrderingAsAdded() { throw new RuntimeException("Stub!"); }
/* 26 */   public void addItemFromInflater(Preference preference) { throw new RuntimeException("Stub!"); }
/* 27 */   public int getPreferenceCount() { throw new RuntimeException("Stub!"); }
/* 28 */   public Preference getPreference(int index) { throw new RuntimeException("Stub!"); }
/* 29 */   public boolean addPreference(Preference preference) { throw new RuntimeException("Stub!"); }
/* 30 */   public boolean removePreference(Preference preference) { throw new RuntimeException("Stub!"); }
/* 31 */   public void removeAll() { throw new RuntimeException("Stub!"); }
/* 32 */   protected boolean onPrepareAddPreference(Preference preference) { throw new RuntimeException("Stub!"); }
/* 33 */   public Preference findPreference(CharSequence key) { throw new RuntimeException("Stub!"); }
/* 34 */   protected boolean isOnSameScreenAsChildren() { throw new RuntimeException("Stub!"); }
/* 35 */   protected void onAttachedToActivity() { throw new RuntimeException("Stub!"); }
/* 36 */   protected void onPrepareForRemoval() { throw new RuntimeException("Stub!"); }
/* 37 */   public void notifyDependencyChange(boolean disableDependents) { throw new RuntimeException("Stub!"); }
/* 38 */   protected void dispatchSaveInstanceState(Bundle container) { throw new RuntimeException("Stub!"); }
/* 39 */   protected void dispatchRestoreInstanceState(Bundle container) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\preference\PreferenceGroup.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */