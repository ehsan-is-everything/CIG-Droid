/*    */ package android.app;
/*    */ 
/*    */ import android.content.res.Configuration;
/*    */ import android.os.Bundle;
/*    */ import android.view.InputQueue;
/*    */ import android.view.InputQueue.Callback;
/*    */ import android.view.SurfaceHolder;
/*    */ import android.view.SurfaceHolder.Callback2;
/*    */ import android.view.ViewTreeObserver.OnGlobalLayoutListener;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class NativeActivity
/*    */   extends Activity
/*    */   implements SurfaceHolder.Callback2, InputQueue.Callback, ViewTreeObserver.OnGlobalLayoutListener
/*    */ {
/*    */   public static final String META_DATA_FUNC_NAME = "android.app.func_name";
/*    */   public static final String META_DATA_LIB_NAME = "android.app.lib_name";
/*    */   
/* 22 */   public NativeActivity() { throw new RuntimeException("Stub!"); }
/* 23 */   protected void onCreate(Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
/* 24 */   protected void onDestroy() { throw new RuntimeException("Stub!"); }
/* 25 */   protected void onPause() { throw new RuntimeException("Stub!"); }
/* 26 */   protected void onResume() { throw new RuntimeException("Stub!"); }
/* 27 */   protected void onSaveInstanceState(Bundle outState) { throw new RuntimeException("Stub!"); }
/* 28 */   protected void onStart() { throw new RuntimeException("Stub!"); }
/* 29 */   protected void onStop() { throw new RuntimeException("Stub!"); }
/* 30 */   public void onConfigurationChanged(Configuration newConfig) { throw new RuntimeException("Stub!"); }
/* 31 */   public void onLowMemory() { throw new RuntimeException("Stub!"); }
/* 32 */   public void onWindowFocusChanged(boolean hasFocus) { throw new RuntimeException("Stub!"); }
/* 33 */   public void surfaceCreated(SurfaceHolder holder) { throw new RuntimeException("Stub!"); }
/* 34 */   public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) { throw new RuntimeException("Stub!"); }
/* 35 */   public void surfaceRedrawNeeded(SurfaceHolder holder) { throw new RuntimeException("Stub!"); }
/* 36 */   public void surfaceDestroyed(SurfaceHolder holder) { throw new RuntimeException("Stub!"); }
/* 37 */   public void onInputQueueCreated(InputQueue queue) { throw new RuntimeException("Stub!"); }
/* 38 */   public void onInputQueueDestroyed(InputQueue queue) { throw new RuntimeException("Stub!"); }
/* 39 */   public void onGlobalLayout() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\app\NativeActivity.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */