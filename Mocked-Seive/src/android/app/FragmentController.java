/*    */ package android.app;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.content.res.Configuration;
/*    */ import android.os.Parcelable;
/*    */ import android.util.ArrayMap;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.Menu;
/*    */ import android.view.MenuInflater;
/*    */ import android.view.MenuItem;
/*    */ import android.view.View;
/*    */ import java.io.FileDescriptor;
/*    */ import java.io.PrintWriter;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class FragmentController
/*    */ {
/* 20 */   FragmentController() { throw new RuntimeException("Stub!"); }
/* 21 */   public static final FragmentController createController(FragmentHostCallback<?> callbacks) { throw new RuntimeException("Stub!"); }
/* 22 */   public FragmentManager getFragmentManager() { throw new RuntimeException("Stub!"); }
/* 23 */   public LoaderManager getLoaderManager() { throw new RuntimeException("Stub!"); }
/* 24 */   public Fragment findFragmentByWho(String who) { throw new RuntimeException("Stub!"); }
/* 25 */   public void attachHost(Fragment parent) { throw new RuntimeException("Stub!"); }
/* 26 */   public View onCreateView(View parent, String name, Context context, AttributeSet attrs) { throw new RuntimeException("Stub!"); }
/* 27 */   public void noteStateNotSaved() { throw new RuntimeException("Stub!"); }
/* 28 */   public Parcelable saveAllState() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 30 */   public void restoreAllState(Parcelable state, List<Fragment> nonConfigList) { throw new RuntimeException("Stub!"); }
/* 31 */   public void restoreAllState(Parcelable state, FragmentManagerNonConfig nonConfig) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 33 */   public List<Fragment> retainNonConfig() { throw new RuntimeException("Stub!"); }
/* 34 */   public FragmentManagerNonConfig retainNestedNonConfig() { throw new RuntimeException("Stub!"); }
/* 35 */   public void dispatchCreate() { throw new RuntimeException("Stub!"); }
/* 36 */   public void dispatchActivityCreated() { throw new RuntimeException("Stub!"); }
/* 37 */   public void dispatchStart() { throw new RuntimeException("Stub!"); }
/* 38 */   public void dispatchResume() { throw new RuntimeException("Stub!"); }
/* 39 */   public void dispatchPause() { throw new RuntimeException("Stub!"); }
/* 40 */   public void dispatchStop() { throw new RuntimeException("Stub!"); }
/* 41 */   public void dispatchDestroyView() { throw new RuntimeException("Stub!"); }
/* 42 */   public void dispatchDestroy() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 44 */   public void dispatchMultiWindowModeChanged(boolean isInMultiWindowMode) { throw new RuntimeException("Stub!"); }
/* 45 */   public void dispatchMultiWindowModeChanged(boolean isInMultiWindowMode, Configuration newConfig) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 47 */   public void dispatchPictureInPictureModeChanged(boolean isInPictureInPictureMode) { throw new RuntimeException("Stub!"); }
/* 48 */   public void dispatchPictureInPictureModeChanged(boolean isInPictureInPictureMode, Configuration newConfig) { throw new RuntimeException("Stub!"); }
/* 49 */   public void dispatchConfigurationChanged(Configuration newConfig) { throw new RuntimeException("Stub!"); }
/* 50 */   public void dispatchLowMemory() { throw new RuntimeException("Stub!"); }
/* 51 */   public void dispatchTrimMemory(int level) { throw new RuntimeException("Stub!"); }
/* 52 */   public boolean dispatchCreateOptionsMenu(Menu menu, MenuInflater inflater) { throw new RuntimeException("Stub!"); }
/* 53 */   public boolean dispatchPrepareOptionsMenu(Menu menu) { throw new RuntimeException("Stub!"); }
/* 54 */   public boolean dispatchOptionsItemSelected(MenuItem item) { throw new RuntimeException("Stub!"); }
/* 55 */   public boolean dispatchContextItemSelected(MenuItem item) { throw new RuntimeException("Stub!"); }
/* 56 */   public void dispatchOptionsMenuClosed(Menu menu) { throw new RuntimeException("Stub!"); }
/* 57 */   public boolean execPendingActions() { throw new RuntimeException("Stub!"); }
/* 58 */   public void doLoaderStart() { throw new RuntimeException("Stub!"); }
/* 59 */   public void doLoaderStop(boolean retain) { throw new RuntimeException("Stub!"); }
/* 60 */   public void doLoaderDestroy() { throw new RuntimeException("Stub!"); }
/* 61 */   public void reportLoaderStart() { throw new RuntimeException("Stub!"); }
/* 62 */   public ArrayMap<String, LoaderManager> retainLoaderNonConfig() { throw new RuntimeException("Stub!"); }
/* 63 */   public void restoreLoaderNonConfig(ArrayMap<String, LoaderManager> loaderManagers) { throw new RuntimeException("Stub!"); }
/* 64 */   public void dumpLoaders(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\app\FragmentController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */