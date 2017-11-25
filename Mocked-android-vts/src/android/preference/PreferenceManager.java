/*    */ package android.preference;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.content.Intent;
/*    */ import android.content.SharedPreferences;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class PreferenceManager
/*    */ {
/*    */   public static final String KEY_HAS_SET_DEFAULT_VALUES = "_has_set_default_values";
/*    */   public static final String METADATA_KEY_PREFERENCES = "android.preference";
/*    */   
/* 32 */   PreferenceManager() { throw new RuntimeException("Stub!"); }
/* 33 */   public void setPreferenceDataStore(PreferenceDataStore dataStore) { throw new RuntimeException("Stub!"); }
/* 34 */   public PreferenceDataStore getPreferenceDataStore() { throw new RuntimeException("Stub!"); }
/* 35 */   public PreferenceScreen createPreferenceScreen(Context context) { throw new RuntimeException("Stub!"); }
/* 36 */   public String getSharedPreferencesName() { throw new RuntimeException("Stub!"); }
/* 37 */   public void setSharedPreferencesName(String sharedPreferencesName) { throw new RuntimeException("Stub!"); }
/* 38 */   public int getSharedPreferencesMode() { throw new RuntimeException("Stub!"); }
/* 39 */   public void setSharedPreferencesMode(int sharedPreferencesMode) { throw new RuntimeException("Stub!"); }
/* 40 */   public void setStorageDefault() { throw new RuntimeException("Stub!"); }
/* 41 */   public void setStorageDeviceProtected() { throw new RuntimeException("Stub!"); }
/* 42 */   public boolean isStorageDefault() { throw new RuntimeException("Stub!"); }
/* 43 */   public boolean isStorageDeviceProtected() { throw new RuntimeException("Stub!"); }
/* 44 */   public SharedPreferences getSharedPreferences() { throw new RuntimeException("Stub!"); }
/* 45 */   public static SharedPreferences getDefaultSharedPreferences(Context context) { throw new RuntimeException("Stub!"); }
/* 46 */   public static String getDefaultSharedPreferencesName(Context context) { throw new RuntimeException("Stub!"); }
/* 47 */   public Preference findPreference(CharSequence key) { throw new RuntimeException("Stub!"); }
/* 48 */   public static void setDefaultValues(Context context, int resId, boolean readAgain) { throw new RuntimeException("Stub!"); }
/* 49 */   public static void setDefaultValues(Context context, String sharedPreferencesName, int sharedPreferencesMode, int resId, boolean readAgain) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface OnActivityDestroyListener
/*    */   {
/*    */     public abstract void onActivityDestroy();
/*    */   }
/*    */   
/*    */   public static abstract interface OnActivityStopListener
/*    */   {
/*    */     public abstract void onActivityStop();
/*    */   }
/*    */   
/*    */   public static abstract interface OnActivityResultListener
/*    */   {
/*    */     public abstract boolean onActivityResult(int paramInt1, int paramInt2, Intent paramIntent);
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\preference\PreferenceManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */