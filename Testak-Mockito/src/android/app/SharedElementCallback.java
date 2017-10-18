/*    */ package android.app;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.graphics.Matrix;
/*    */ import android.graphics.RectF;
/*    */ import android.os.Parcelable;
/*    */ import android.view.View;
/*    */ import java.util.List;
/*    */ import java.util.Map;
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
/*    */ public abstract class SharedElementCallback
/*    */ {
/* 23 */   public SharedElementCallback() { throw new RuntimeException("Stub!"); }
/* 24 */   public void onSharedElementStart(List<String> sharedElementNames, List<View> sharedElements, List<View> sharedElementSnapshots) { throw new RuntimeException("Stub!"); }
/* 25 */   public void onSharedElementEnd(List<String> sharedElementNames, List<View> sharedElements, List<View> sharedElementSnapshots) { throw new RuntimeException("Stub!"); }
/* 26 */   public void onRejectSharedElements(List<View> rejectedSharedElements) { throw new RuntimeException("Stub!"); }
/* 27 */   public void onMapSharedElements(List<String> names, Map<String, View> sharedElements) { throw new RuntimeException("Stub!"); }
/* 28 */   public Parcelable onCaptureSharedElementSnapshot(View sharedElement, Matrix viewToGlobalMatrix, RectF screenBounds) { throw new RuntimeException("Stub!"); }
/* 29 */   public View onCreateSnapshotView(Context context, Parcelable snapshot) { throw new RuntimeException("Stub!"); }
/* 30 */   public void onSharedElementsArrived(List<String> sharedElementNames, List<View> sharedElements, OnSharedElementsReadyListener listener) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface OnSharedElementsReadyListener
/*    */   {
/*    */     public abstract void onSharedElementsReady();
/*    */   }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\app\SharedElementCallback.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */