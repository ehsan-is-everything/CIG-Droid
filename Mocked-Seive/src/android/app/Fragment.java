/*     */ package android.app;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.content.Intent;
/*     */ import android.content.res.Configuration;
/*     */ import android.os.Bundle;
/*     */ import android.transition.Transition;
/*     */ import android.util.AttributeSet;
/*     */ import android.view.ContextMenu;
/*     */ import android.view.LayoutInflater;
/*     */ import android.view.Menu;
/*     */ import android.view.MenuInflater;
/*     */ import android.view.MenuItem;
/*     */ import android.view.View;
/*     */ import android.view.ViewGroup;
/*     */ import java.io.PrintWriter;
/*     */ 
/*     */ public class Fragment
/*     */   implements android.content.ComponentCallbacks2, android.view.View.OnCreateContextMenuListener
/*     */ {
/*     */   public static class SavedState
/*     */     implements android.os.Parcelable
/*     */   {
/*  24 */     SavedState() { throw new RuntimeException("Stub!"); }
/*  25 */     public int describeContents() { throw new RuntimeException("Stub!"); }
/*  26 */     public void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*     */     
/*  28 */     public static final android.os.Parcelable.ClassLoaderCreator<SavedState> CREATOR = null;
/*     */   }
/*     */   
/*     */   public static class InstantiationException
/*     */     extends android.util.AndroidRuntimeException {
/*  33 */     public InstantiationException(String msg, Exception cause) { throw new RuntimeException("Stub!"); } }
/*     */   
/*  35 */   public Fragment() { throw new RuntimeException("Stub!"); }
/*  36 */   public static Fragment instantiate(Context context, String fname) { throw new RuntimeException("Stub!"); }
/*  37 */   public static Fragment instantiate(Context context, String fname, Bundle args) { throw new RuntimeException("Stub!"); }
/*  38 */   public final boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/*  39 */   public final int hashCode() { throw new RuntimeException("Stub!"); }
/*  40 */   public String toString() { throw new RuntimeException("Stub!"); }
/*  41 */   public final int getId() { throw new RuntimeException("Stub!"); }
/*  42 */   public final String getTag() { throw new RuntimeException("Stub!"); }
/*  43 */   public void setArguments(Bundle args) { throw new RuntimeException("Stub!"); }
/*  44 */   public final Bundle getArguments() { throw new RuntimeException("Stub!"); }
/*  45 */   public final boolean isStateSaved() { throw new RuntimeException("Stub!"); }
/*  46 */   public void setInitialSavedState(SavedState state) { throw new RuntimeException("Stub!"); }
/*  47 */   public void setTargetFragment(Fragment fragment, int requestCode) { throw new RuntimeException("Stub!"); }
/*  48 */   public final Fragment getTargetFragment() { throw new RuntimeException("Stub!"); }
/*  49 */   public final int getTargetRequestCode() { throw new RuntimeException("Stub!"); }
/*  50 */   public Context getContext() { throw new RuntimeException("Stub!"); }
/*  51 */   public final Activity getActivity() { throw new RuntimeException("Stub!"); }
/*  52 */   public final Object getHost() { throw new RuntimeException("Stub!"); }
/*  53 */   public final android.content.res.Resources getResources() { throw new RuntimeException("Stub!"); }
/*  54 */   public final CharSequence getText(int resId) { throw new RuntimeException("Stub!"); }
/*  55 */   public final String getString(int resId) { throw new RuntimeException("Stub!"); }
/*  56 */   public final String getString(int resId, Object... formatArgs) { throw new RuntimeException("Stub!"); }
/*  57 */   public final FragmentManager getFragmentManager() { throw new RuntimeException("Stub!"); }
/*  58 */   public final FragmentManager getChildFragmentManager() { throw new RuntimeException("Stub!"); }
/*  59 */   public final Fragment getParentFragment() { throw new RuntimeException("Stub!"); }
/*  60 */   public final boolean isAdded() { throw new RuntimeException("Stub!"); }
/*  61 */   public final boolean isDetached() { throw new RuntimeException("Stub!"); }
/*  62 */   public final boolean isRemoving() { throw new RuntimeException("Stub!"); }
/*  63 */   public final boolean isInLayout() { throw new RuntimeException("Stub!"); }
/*  64 */   public final boolean isResumed() { throw new RuntimeException("Stub!"); }
/*  65 */   public final boolean isVisible() { throw new RuntimeException("Stub!"); }
/*  66 */   public final boolean isHidden() { throw new RuntimeException("Stub!"); }
/*  67 */   public void onHiddenChanged(boolean hidden) { throw new RuntimeException("Stub!"); }
/*  68 */   public void setRetainInstance(boolean retain) { throw new RuntimeException("Stub!"); }
/*  69 */   public final boolean getRetainInstance() { throw new RuntimeException("Stub!"); }
/*  70 */   public void setHasOptionsMenu(boolean hasMenu) { throw new RuntimeException("Stub!"); }
/*  71 */   public void setMenuVisibility(boolean menuVisible) { throw new RuntimeException("Stub!"); }
/*  72 */   public void setUserVisibleHint(boolean isVisibleToUser) { throw new RuntimeException("Stub!"); }
/*  73 */   public boolean getUserVisibleHint() { throw new RuntimeException("Stub!"); }
/*  74 */   public LoaderManager getLoaderManager() { throw new RuntimeException("Stub!"); }
/*  75 */   public void startActivity(Intent intent) { throw new RuntimeException("Stub!"); }
/*  76 */   public void startActivity(Intent intent, Bundle options) { throw new RuntimeException("Stub!"); }
/*  77 */   public void startActivityForResult(Intent intent, int requestCode) { throw new RuntimeException("Stub!"); }
/*  78 */   public void startActivityForResult(Intent intent, int requestCode, Bundle options) { throw new RuntimeException("Stub!"); }
/*  79 */   public void startIntentSenderForResult(android.content.IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, Bundle options) throws android.content.IntentSender.SendIntentException { throw new RuntimeException("Stub!"); }
/*  80 */   public void onActivityResult(int requestCode, int resultCode, Intent data) { throw new RuntimeException("Stub!"); }
/*  81 */   public final void requestPermissions(String[] permissions, int requestCode) { throw new RuntimeException("Stub!"); }
/*  82 */   public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) { throw new RuntimeException("Stub!"); }
/*  83 */   public boolean shouldShowRequestPermissionRationale(String permission) { throw new RuntimeException("Stub!"); }
/*  84 */   public LayoutInflater onGetLayoutInflater(Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
/*  85 */   public final LayoutInflater getLayoutInflater() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  87 */   public void onInflate(AttributeSet attrs, Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
/*  88 */   public void onInflate(Context context, AttributeSet attrs, Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  90 */   public void onInflate(Activity activity, AttributeSet attrs, Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
/*  91 */   public void onAttachFragment(Fragment childFragment) { throw new RuntimeException("Stub!"); }
/*  92 */   public void onAttach(Context context) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  94 */   public void onAttach(Activity activity) { throw new RuntimeException("Stub!"); }
/*  95 */   public android.animation.Animator onCreateAnimator(int transit, boolean enter, int nextAnim) { throw new RuntimeException("Stub!"); }
/*  96 */   public void onCreate(Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
/*  97 */   public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
/*  98 */   public void onViewCreated(View view, Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
/*  99 */   public View getView() { throw new RuntimeException("Stub!"); }
/* 100 */   public void onActivityCreated(Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
/* 101 */   public void onViewStateRestored(Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
/* 102 */   public void onStart() { throw new RuntimeException("Stub!"); }
/* 103 */   public void onResume() { throw new RuntimeException("Stub!"); }
/* 104 */   public void onSaveInstanceState(Bundle outState) { throw new RuntimeException("Stub!"); }
/* 105 */   public void onMultiWindowModeChanged(boolean isInMultiWindowMode, Configuration newConfig) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 107 */   public void onMultiWindowModeChanged(boolean isInMultiWindowMode) { throw new RuntimeException("Stub!"); }
/* 108 */   public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode, Configuration newConfig) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 110 */   public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) { throw new RuntimeException("Stub!"); }
/* 111 */   public void onConfigurationChanged(Configuration newConfig) { throw new RuntimeException("Stub!"); }
/* 112 */   public void onPause() { throw new RuntimeException("Stub!"); }
/* 113 */   public void onStop() { throw new RuntimeException("Stub!"); }
/* 114 */   public void onLowMemory() { throw new RuntimeException("Stub!"); }
/* 115 */   public void onTrimMemory(int level) { throw new RuntimeException("Stub!"); }
/* 116 */   public void onDestroyView() { throw new RuntimeException("Stub!"); }
/* 117 */   public void onDestroy() { throw new RuntimeException("Stub!"); }
/* 118 */   public void onDetach() { throw new RuntimeException("Stub!"); }
/* 119 */   public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) { throw new RuntimeException("Stub!"); }
/* 120 */   public void onPrepareOptionsMenu(Menu menu) { throw new RuntimeException("Stub!"); }
/* 121 */   public void onDestroyOptionsMenu() { throw new RuntimeException("Stub!"); }
/* 122 */   public boolean onOptionsItemSelected(MenuItem item) { throw new RuntimeException("Stub!"); }
/* 123 */   public void onOptionsMenuClosed(Menu menu) { throw new RuntimeException("Stub!"); }
/* 124 */   public void onCreateContextMenu(ContextMenu menu, View v, android.view.ContextMenu.ContextMenuInfo menuInfo) { throw new RuntimeException("Stub!"); }
/* 125 */   public void registerForContextMenu(View view) { throw new RuntimeException("Stub!"); }
/* 126 */   public void unregisterForContextMenu(View view) { throw new RuntimeException("Stub!"); }
/* 127 */   public boolean onContextItemSelected(MenuItem item) { throw new RuntimeException("Stub!"); }
/* 128 */   public void setEnterSharedElementCallback(SharedElementCallback callback) { throw new RuntimeException("Stub!"); }
/* 129 */   public void setExitSharedElementCallback(SharedElementCallback callback) { throw new RuntimeException("Stub!"); }
/* 130 */   public void setEnterTransition(Transition transition) { throw new RuntimeException("Stub!"); }
/* 131 */   public Transition getEnterTransition() { throw new RuntimeException("Stub!"); }
/* 132 */   public void setReturnTransition(Transition transition) { throw new RuntimeException("Stub!"); }
/* 133 */   public Transition getReturnTransition() { throw new RuntimeException("Stub!"); }
/* 134 */   public void setExitTransition(Transition transition) { throw new RuntimeException("Stub!"); }
/* 135 */   public Transition getExitTransition() { throw new RuntimeException("Stub!"); }
/* 136 */   public void setReenterTransition(Transition transition) { throw new RuntimeException("Stub!"); }
/* 137 */   public Transition getReenterTransition() { throw new RuntimeException("Stub!"); }
/* 138 */   public void setSharedElementEnterTransition(Transition transition) { throw new RuntimeException("Stub!"); }
/* 139 */   public Transition getSharedElementEnterTransition() { throw new RuntimeException("Stub!"); }
/* 140 */   public void setSharedElementReturnTransition(Transition transition) { throw new RuntimeException("Stub!"); }
/* 141 */   public Transition getSharedElementReturnTransition() { throw new RuntimeException("Stub!"); }
/* 142 */   public void setAllowEnterTransitionOverlap(boolean allow) { throw new RuntimeException("Stub!"); }
/* 143 */   public boolean getAllowEnterTransitionOverlap() { throw new RuntimeException("Stub!"); }
/* 144 */   public void setAllowReturnTransitionOverlap(boolean allow) { throw new RuntimeException("Stub!"); }
/* 145 */   public boolean getAllowReturnTransitionOverlap() { throw new RuntimeException("Stub!"); }
/* 146 */   public void postponeEnterTransition() { throw new RuntimeException("Stub!"); }
/* 147 */   public void startPostponedEnterTransition() { throw new RuntimeException("Stub!"); }
/* 148 */   public void dump(String prefix, java.io.FileDescriptor fd, PrintWriter writer, String[] args) { throw new RuntimeException("Stub!"); }
/*     */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\app\Fragment.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */