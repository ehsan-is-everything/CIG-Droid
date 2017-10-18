/*    */ package android.app;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.os.Bundle;
/*    */ import android.view.View;
/*    */ import java.io.FileDescriptor;
/*    */ import java.io.PrintWriter;
/*    */ import java.util.List;
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
/*    */ public abstract class FragmentManager
/*    */ {
/*    */   public static final int POP_BACK_STACK_INCLUSIVE = 1;
/*    */   
/*    */   public static abstract class FragmentLifecycleCallbacks
/*    */   {
/* 35 */     public FragmentLifecycleCallbacks() { throw new RuntimeException("Stub!"); }
/* 36 */     public void onFragmentPreAttached(FragmentManager fm, Fragment f, Context context) { throw new RuntimeException("Stub!"); }
/* 37 */     public void onFragmentAttached(FragmentManager fm, Fragment f, Context context) { throw new RuntimeException("Stub!"); }
/* 38 */     public void onFragmentPreCreated(FragmentManager fm, Fragment f, Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
/* 39 */     public void onFragmentCreated(FragmentManager fm, Fragment f, Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
/* 40 */     public void onFragmentActivityCreated(FragmentManager fm, Fragment f, Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
/* 41 */     public void onFragmentViewCreated(FragmentManager fm, Fragment f, View v, Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
/* 42 */     public void onFragmentStarted(FragmentManager fm, Fragment f) { throw new RuntimeException("Stub!"); }
/* 43 */     public void onFragmentResumed(FragmentManager fm, Fragment f) { throw new RuntimeException("Stub!"); }
/* 44 */     public void onFragmentPaused(FragmentManager fm, Fragment f) { throw new RuntimeException("Stub!"); }
/* 45 */     public void onFragmentStopped(FragmentManager fm, Fragment f) { throw new RuntimeException("Stub!"); }
/* 46 */     public void onFragmentSaveInstanceState(FragmentManager fm, Fragment f, Bundle outState) { throw new RuntimeException("Stub!"); }
/* 47 */     public void onFragmentViewDestroyed(FragmentManager fm, Fragment f) { throw new RuntimeException("Stub!"); }
/* 48 */     public void onFragmentDestroyed(FragmentManager fm, Fragment f) { throw new RuntimeException("Stub!"); }
/* 49 */     public void onFragmentDetached(FragmentManager fm, Fragment f) { throw new RuntimeException("Stub!"); } }
/*    */   
/* 51 */   public FragmentManager() { throw new RuntimeException("Stub!"); }
/*    */   public abstract FragmentTransaction beginTransaction();
/*    */   public abstract boolean executePendingTransactions();
/*    */   public abstract Fragment findFragmentById(int paramInt);
/*    */   public abstract Fragment findFragmentByTag(String paramString);
/*    */   public abstract void popBackStack();
/*    */   public abstract boolean popBackStackImmediate();
/*    */   public abstract void popBackStack(String paramString, int paramInt);
/*    */   public abstract boolean popBackStackImmediate(String paramString, int paramInt);
/*    */   public abstract void popBackStack(int paramInt1, int paramInt2);
/*    */   public abstract boolean popBackStackImmediate(int paramInt1, int paramInt2);
/*    */   public abstract int getBackStackEntryCount();
/*    */   public abstract BackStackEntry getBackStackEntryAt(int paramInt);
/*    */   public abstract void addOnBackStackChangedListener(OnBackStackChangedListener paramOnBackStackChangedListener);
/*    */   public abstract void removeOnBackStackChangedListener(OnBackStackChangedListener paramOnBackStackChangedListener);
/*    */   public abstract void putFragment(Bundle paramBundle, String paramString, Fragment paramFragment);
/*    */   public abstract Fragment getFragment(Bundle paramBundle, String paramString);
/*    */   public abstract List<Fragment> getFragments();
/*    */   public abstract Fragment.SavedState saveFragmentInstanceState(Fragment paramFragment);
/*    */   public abstract boolean isDestroyed();
/*    */   public abstract void registerFragmentLifecycleCallbacks(FragmentLifecycleCallbacks paramFragmentLifecycleCallbacks, boolean paramBoolean);
/*    */   public abstract void unregisterFragmentLifecycleCallbacks(FragmentLifecycleCallbacks paramFragmentLifecycleCallbacks);
/*    */   public abstract Fragment getPrimaryNavigationFragment();
/*    */   public abstract void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString);
/* 75 */   public static void enableDebugLogging(boolean enabled) { throw new RuntimeException("Stub!"); }
/* 76 */   public void invalidateOptionsMenu() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract boolean isStateSaved();
/*    */   
/*    */   public static abstract interface OnBackStackChangedListener
/*    */   {
/*    */     public abstract void onBackStackChanged();
/*    */   }
/*    */   
/*    */   public static abstract interface BackStackEntry
/*    */   {
/*    */     public abstract int getId();
/*    */     
/*    */     public abstract String getName();
/*    */     
/*    */     public abstract int getBreadCrumbTitleRes();
/*    */     
/*    */     public abstract int getBreadCrumbShortTitleRes();
/*    */     
/*    */     public abstract CharSequence getBreadCrumbTitle();
/*    */     
/*    */     public abstract CharSequence getBreadCrumbShortTitle();
/*    */   }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\app\FragmentManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */