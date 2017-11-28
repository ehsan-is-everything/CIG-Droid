/*    */ package android.hardware.display;
/*    */ 
/*    */ import android.view.Display;
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
/*    */ 
/*    */ public final class VirtualDisplay
/*    */ {
/*    */   public static abstract class Callback
/*    */   {
/* 21 */     public Callback() { throw new RuntimeException("Stub!"); }
/* 22 */     public void onPaused() { throw new RuntimeException("Stub!"); }
/* 23 */     public void onResumed() { throw new RuntimeException("Stub!"); }
/* 24 */     public void onStopped() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 26 */   VirtualDisplay() { throw new RuntimeException("Stub!"); }
/* 27 */   public Display getDisplay() { throw new RuntimeException("Stub!"); }
/* 28 */   public Surface getSurface() { throw new RuntimeException("Stub!"); }
/* 29 */   public void setSurface(Surface surface) { throw new RuntimeException("Stub!"); }
/* 30 */   public void resize(int width, int height, int densityDpi) { throw new RuntimeException("Stub!"); }
/* 31 */   public void release() { throw new RuntimeException("Stub!"); }
/* 32 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\hardware\display\VirtualDisplay.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */