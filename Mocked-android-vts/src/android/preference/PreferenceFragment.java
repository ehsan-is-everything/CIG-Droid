/*    */ package android.preference;
/*    */ 
/*    */ import android.app.Fragment;
/*    */ import android.content.Intent;
/*    */ import android.os.Bundle;
/*    */ import android.view.LayoutInflater;
/*    */ import android.view.View;
/*    */ import android.view.ViewGroup;
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
/*    */ public abstract class PreferenceFragment
/*    */   extends Fragment
/*    */ {
/* 25 */   public PreferenceFragment() { throw new RuntimeException("Stub!"); }
/* 26 */   public void onCreate(Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
/* 27 */   public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
/* 28 */   public void onViewCreated(View view, Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
/* 29 */   public void onActivityCreated(Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
/* 30 */   public void onStart() { throw new RuntimeException("Stub!"); }
/* 31 */   public void onStop() { throw new RuntimeException("Stub!"); }
/* 32 */   public void onDestroyView() { throw new RuntimeException("Stub!"); }
/* 33 */   public void onDestroy() { throw new RuntimeException("Stub!"); }
/* 34 */   public void onSaveInstanceState(Bundle outState) { throw new RuntimeException("Stub!"); }
/* 35 */   public void onActivityResult(int requestCode, int resultCode, Intent data) { throw new RuntimeException("Stub!"); }
/* 36 */   public PreferenceManager getPreferenceManager() { throw new RuntimeException("Stub!"); }
/* 37 */   public void setPreferenceScreen(PreferenceScreen preferenceScreen) { throw new RuntimeException("Stub!"); }
/* 38 */   public PreferenceScreen getPreferenceScreen() { throw new RuntimeException("Stub!"); }
/* 39 */   public void addPreferencesFromIntent(Intent intent) { throw new RuntimeException("Stub!"); }
/* 40 */   public void addPreferencesFromResource(int preferencesResId) { throw new RuntimeException("Stub!"); }
/* 41 */   public boolean onPreferenceTreeClick(PreferenceScreen preferenceScreen, Preference preference) { throw new RuntimeException("Stub!"); }
/* 42 */   public Preference findPreference(CharSequence key) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface OnPreferenceStartFragmentCallback
/*    */   {
/*    */     public abstract boolean onPreferenceStartFragment(PreferenceFragment paramPreferenceFragment, Preference paramPreference);
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\preference\PreferenceFragment.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */