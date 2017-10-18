/*    */ package android.media.projection;
/*    */ 
/*    */ import android.hardware.display.VirtualDisplay;
/*    */ import android.hardware.display.VirtualDisplay.Callback;
/*    */ import android.os.Handler;
/*    */ import android.view.Surface;
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
/*    */ public final class MediaProjection
/*    */ {
/*    */   public static abstract class Callback
/*    */   {
/* 22 */     public Callback() { throw new RuntimeException("Stub!"); }
/* 23 */     public void onStop() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 25 */   MediaProjection() { throw new RuntimeException("Stub!"); }
/* 26 */   public void registerCallback(Callback callback, Handler handler) { throw new RuntimeException("Stub!"); }
/* 27 */   public void unregisterCallback(Callback callback) { throw new RuntimeException("Stub!"); }
/* 28 */   public VirtualDisplay createVirtualDisplay(String name, int width, int height, int dpi, int flags, Surface surface, VirtualDisplay.Callback callback, Handler handler) { throw new RuntimeException("Stub!"); }
/* 29 */   public void stop() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\media\projection\MediaProjection.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */