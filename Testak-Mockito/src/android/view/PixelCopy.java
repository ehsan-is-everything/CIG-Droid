/*    */ package android.view;
/*    */ 
/*    */ import android.graphics.Bitmap;
/*    */ import android.graphics.Rect;
/*    */ import android.os.Handler;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class PixelCopy
/*    */ {
/*    */   public static final int ERROR_DESTINATION_INVALID = 5;
/*    */   public static final int ERROR_SOURCE_INVALID = 4;
/*    */   public static final int ERROR_SOURCE_NO_DATA = 3;
/*    */   public static final int ERROR_TIMEOUT = 2;
/*    */   public static final int ERROR_UNKNOWN = 1;
/*    */   public static final int SUCCESS = 0;
/*    */   
/* 24 */   PixelCopy() { throw new RuntimeException("Stub!"); }
/* 25 */   public static void request(SurfaceView source, Bitmap dest, OnPixelCopyFinishedListener listener, Handler listenerThread) { throw new RuntimeException("Stub!"); }
/* 26 */   public static void request(SurfaceView source, Rect srcRect, Bitmap dest, OnPixelCopyFinishedListener listener, Handler listenerThread) { throw new RuntimeException("Stub!"); }
/* 27 */   public static void request(Surface source, Bitmap dest, OnPixelCopyFinishedListener listener, Handler listenerThread) { throw new RuntimeException("Stub!"); }
/* 28 */   public static void request(Surface source, Rect srcRect, Bitmap dest, OnPixelCopyFinishedListener listener, Handler listenerThread) { throw new RuntimeException("Stub!"); }
/* 29 */   public static void request(Window source, Bitmap dest, OnPixelCopyFinishedListener listener, Handler listenerThread) { throw new RuntimeException("Stub!"); }
/* 30 */   public static void request(Window source, Rect srcRect, Bitmap dest, OnPixelCopyFinishedListener listener, Handler listenerThread) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface OnPixelCopyFinishedListener
/*    */   {
/*    */     public abstract void onPixelCopyFinished(int paramInt);
/*    */   }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\view\PixelCopy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */