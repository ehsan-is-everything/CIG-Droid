/*    */ package android.hardware.display;
/*    */ 
/*    */ import android.os.Handler;
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
/*    */ public final class DisplayManager
/*    */ {
/*    */   public static final String DISPLAY_CATEGORY_PRESENTATION = "android.hardware.display.category.PRESENTATION";
/*    */   public static final int VIRTUAL_DISPLAY_FLAG_AUTO_MIRROR = 16;
/*    */   public static final int VIRTUAL_DISPLAY_FLAG_OWN_CONTENT_ONLY = 8;
/*    */   public static final int VIRTUAL_DISPLAY_FLAG_PRESENTATION = 2;
/*    */   public static final int VIRTUAL_DISPLAY_FLAG_PUBLIC = 1;
/*    */   public static final int VIRTUAL_DISPLAY_FLAG_SECURE = 4;
/*    */   
/* 26 */   DisplayManager() { throw new RuntimeException("Stub!"); }
/* 27 */   public Display getDisplay(int displayId) { throw new RuntimeException("Stub!"); }
/* 28 */   public Display[] getDisplays() { throw new RuntimeException("Stub!"); }
/* 29 */   public Display[] getDisplays(String category) { throw new RuntimeException("Stub!"); }
/* 30 */   public void registerDisplayListener(DisplayListener listener, Handler handler) { throw new RuntimeException("Stub!"); }
/* 31 */   public void unregisterDisplayListener(DisplayListener listener) { throw new RuntimeException("Stub!"); }
/* 32 */   public VirtualDisplay createVirtualDisplay(String name, int width, int height, int densityDpi, Surface surface, int flags) { throw new RuntimeException("Stub!"); }
/* 33 */   public VirtualDisplay createVirtualDisplay(String name, int width, int height, int densityDpi, Surface surface, int flags, VirtualDisplay.Callback callback, Handler handler) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface DisplayListener
/*    */   {
/*    */     public abstract void onDisplayAdded(int paramInt);
/*    */     
/*    */     public abstract void onDisplayRemoved(int paramInt);
/*    */     
/*    */     public abstract void onDisplayChanged(int paramInt);
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\hardware\display\DisplayManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */