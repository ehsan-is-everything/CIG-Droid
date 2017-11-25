/*    */ package android.preference;
/*    */ 
/*    */ import android.app.Fragment;
/*    */ import android.content.Intent;
/*    */ import android.content.res.Resources;
/*    */ import android.os.Bundle;
/*    */ import android.os.Parcel;
/*    */ import android.view.MenuItem;
/*    */ import android.view.View;
/*    */ import java.util.List;
/*    */ 
/*    */ public abstract class PreferenceActivity extends android.app.ListActivity
/*    */   implements PreferenceFragment.OnPreferenceStartFragmentCallback
/*    */ {
/*    */   public static final String EXTRA_NO_HEADERS = ":android:no_headers";
/*    */   public static final String EXTRA_SHOW_FRAGMENT = ":android:show_fragment";
/*    */   public static final String EXTRA_SHOW_FRAGMENT_ARGUMENTS = ":android:show_fragment_args";
/*    */   public static final String EXTRA_SHOW_FRAGMENT_SHORT_TITLE = ":android:show_fragment_short_title";
/*    */   public static final String EXTRA_SHOW_FRAGMENT_TITLE = ":android:show_fragment_title";
/*    */   public static final long HEADER_ID_UNDEFINED = -1L;
/*    */   
/*    */   public static final class Header
/*    */     implements android.os.Parcelable
/*    */   {
/* 25 */     public Header() { throw new RuntimeException("Stub!"); }
/* 26 */     public CharSequence getTitle(Resources res) { throw new RuntimeException("Stub!"); }
/* 27 */     public CharSequence getSummary(Resources res) { throw new RuntimeException("Stub!"); }
/* 28 */     public CharSequence getBreadCrumbTitle(Resources res) { throw new RuntimeException("Stub!"); }
/* 29 */     public CharSequence getBreadCrumbShortTitle(Resources res) { throw new RuntimeException("Stub!"); }
/* 30 */     public int describeContents() { throw new RuntimeException("Stub!"); }
/* 31 */     public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 32 */     public void readFromParcel(Parcel in) { throw new RuntimeException("Stub!"); }
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
/* 48 */     public static final android.os.Parcelable.Creator<Header> CREATOR = null;
/*    */     public CharSequence breadCrumbShortTitle; public int breadCrumbShortTitleRes; public CharSequence breadCrumbTitle; public int breadCrumbTitleRes; public Bundle extras; public String fragment; public Bundle fragmentArguments; public int iconRes; public long id; public Intent intent; public CharSequence summary; public int summaryRes; public CharSequence title; public int titleRes; }
/* 50 */   public PreferenceActivity() { throw new RuntimeException("Stub!"); }
/* 51 */   public boolean onOptionsItemSelected(MenuItem item) { throw new RuntimeException("Stub!"); }
/* 52 */   protected void onCreate(Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
/* 53 */   public void onBackPressed() { throw new RuntimeException("Stub!"); }
/* 54 */   public boolean hasHeaders() { throw new RuntimeException("Stub!"); }
/* 55 */   public boolean isMultiPane() { throw new RuntimeException("Stub!"); }
/* 56 */   public boolean onIsMultiPane() { throw new RuntimeException("Stub!"); }
/* 57 */   public boolean onIsHidingHeaders() { throw new RuntimeException("Stub!"); }
/* 58 */   public Header onGetInitialHeader() { throw new RuntimeException("Stub!"); }
/* 59 */   public Header onGetNewHeader() { throw new RuntimeException("Stub!"); }
/* 60 */   public void onBuildHeaders(List<Header> target) { throw new RuntimeException("Stub!"); }
/* 61 */   public void invalidateHeaders() { throw new RuntimeException("Stub!"); }
/* 62 */   public void loadHeadersFromResource(int resid, List<Header> target) { throw new RuntimeException("Stub!"); }
/* 63 */   protected boolean isValidFragment(String fragmentName) { throw new RuntimeException("Stub!"); }
/* 64 */   public void setListFooter(View view) { throw new RuntimeException("Stub!"); }
/* 65 */   protected void onStop() { throw new RuntimeException("Stub!"); }
/* 66 */   protected void onDestroy() { throw new RuntimeException("Stub!"); }
/* 67 */   protected void onSaveInstanceState(Bundle outState) { throw new RuntimeException("Stub!"); }
/* 68 */   protected void onRestoreInstanceState(Bundle state) { throw new RuntimeException("Stub!"); }
/* 69 */   protected void onActivityResult(int requestCode, int resultCode, Intent data) { throw new RuntimeException("Stub!"); }
/* 70 */   public void onContentChanged() { throw new RuntimeException("Stub!"); }
/* 71 */   protected void onListItemClick(android.widget.ListView l, View v, int position, long id) { throw new RuntimeException("Stub!"); }
/* 72 */   public void onHeaderClick(Header header, int position) { throw new RuntimeException("Stub!"); }
/* 73 */   public Intent onBuildStartFragmentIntent(String fragmentName, Bundle args, int titleRes, int shortTitleRes) { throw new RuntimeException("Stub!"); }
/* 74 */   public void startWithFragment(String fragmentName, Bundle args, Fragment resultTo, int resultRequestCode) { throw new RuntimeException("Stub!"); }
/* 75 */   public void startWithFragment(String fragmentName, Bundle args, Fragment resultTo, int resultRequestCode, int titleRes, int shortTitleRes) { throw new RuntimeException("Stub!"); }
/* 76 */   public void showBreadCrumbs(CharSequence title, CharSequence shortTitle) { throw new RuntimeException("Stub!"); }
/* 77 */   public void setParentTitle(CharSequence title, CharSequence shortTitle, android.view.View.OnClickListener listener) { throw new RuntimeException("Stub!"); }
/* 78 */   public void switchToHeader(String fragmentName, Bundle args) { throw new RuntimeException("Stub!"); }
/* 79 */   public void switchToHeader(Header header) { throw new RuntimeException("Stub!"); }
/* 80 */   public void startPreferenceFragment(Fragment fragment, boolean push) { throw new RuntimeException("Stub!"); }
/* 81 */   public void startPreferencePanel(String fragmentClass, Bundle args, int titleRes, CharSequence titleText, Fragment resultTo, int resultRequestCode) { throw new RuntimeException("Stub!"); }
/* 82 */   public void finishPreferencePanel(Fragment caller, int resultCode, Intent resultData) { throw new RuntimeException("Stub!"); }
/* 83 */   public boolean onPreferenceStartFragment(PreferenceFragment caller, Preference pref) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 85 */   public PreferenceManager getPreferenceManager() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 87 */   public void setPreferenceScreen(PreferenceScreen preferenceScreen) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 89 */   public PreferenceScreen getPreferenceScreen() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 91 */   public void addPreferencesFromIntent(Intent intent) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 93 */   public void addPreferencesFromResource(int preferencesResId) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 95 */   public boolean onPreferenceTreeClick(PreferenceScreen preferenceScreen, Preference preference) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 97 */   public Preference findPreference(CharSequence key) { throw new RuntimeException("Stub!"); }
/* 98 */   protected void onNewIntent(Intent intent) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\preference\PreferenceActivity.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */