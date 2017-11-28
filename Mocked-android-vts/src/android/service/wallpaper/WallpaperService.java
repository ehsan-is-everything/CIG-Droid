/*    */ package android.service.wallpaper;
/*    */ 
/*    */ import android.app.Service;
/*    */ import android.content.Intent;
/*    */ import android.os.Bundle;
/*    */ import android.os.IBinder;
/*    */ import android.view.MotionEvent;
/*    */ import android.view.SurfaceHolder;
/*    */ import android.view.WindowInsets;
/*    */ import java.io.FileDescriptor;
/*    */ import java.io.PrintWriter;
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class WallpaperService
/*    */   extends Service
/*    */ {
/*    */   public static final String SERVICE_INTERFACE = "android.service.wallpaper.WallpaperService";
/*    */   public static final String SERVICE_META_DATA = "android.service.wallpaper";
/*    */   
/*    */   public class Engine
/*    */   {
/* 23 */     public Engine() { throw new RuntimeException("Stub!"); }
/* 24 */     public SurfaceHolder getSurfaceHolder() { throw new RuntimeException("Stub!"); }
/* 25 */     public int getDesiredMinimumWidth() { throw new RuntimeException("Stub!"); }
/* 26 */     public int getDesiredMinimumHeight() { throw new RuntimeException("Stub!"); }
/* 27 */     public boolean isVisible() { throw new RuntimeException("Stub!"); }
/* 28 */     public boolean isPreview() { throw new RuntimeException("Stub!"); }
/* 29 */     public void setTouchEventsEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
/* 30 */     public void setOffsetNotificationsEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
/* 31 */     public void onCreate(SurfaceHolder surfaceHolder) { throw new RuntimeException("Stub!"); }
/* 32 */     public void onDestroy() { throw new RuntimeException("Stub!"); }
/* 33 */     public void onVisibilityChanged(boolean visible) { throw new RuntimeException("Stub!"); }
/* 34 */     public void onApplyWindowInsets(WindowInsets insets) { throw new RuntimeException("Stub!"); }
/* 35 */     public void onTouchEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 36 */     public void onOffsetsChanged(float xOffset, float yOffset, float xOffsetStep, float yOffsetStep, int xPixelOffset, int yPixelOffset) { throw new RuntimeException("Stub!"); }
/* 37 */     public Bundle onCommand(String action, int x, int y, int z, Bundle extras, boolean resultRequested) { throw new RuntimeException("Stub!"); }
/* 38 */     public void onDesiredSizeChanged(int desiredWidth, int desiredHeight) { throw new RuntimeException("Stub!"); }
/* 39 */     public void onSurfaceChanged(SurfaceHolder holder, int format, int width, int height) { throw new RuntimeException("Stub!"); }
/* 40 */     public void onSurfaceRedrawNeeded(SurfaceHolder holder) { throw new RuntimeException("Stub!"); }
/* 41 */     public void onSurfaceCreated(SurfaceHolder holder) { throw new RuntimeException("Stub!"); }
/* 42 */     public void onSurfaceDestroyed(SurfaceHolder holder) { throw new RuntimeException("Stub!"); }
/* 43 */     protected void dump(String prefix, FileDescriptor fd, PrintWriter out, String[] args) { throw new RuntimeException("Stub!"); } }
/*    */   
/* 45 */   public WallpaperService() { throw new RuntimeException("Stub!"); }
/* 46 */   public void onCreate() { throw new RuntimeException("Stub!"); }
/* 47 */   public void onDestroy() { throw new RuntimeException("Stub!"); }
/* 48 */   public final IBinder onBind(Intent intent) { throw new RuntimeException("Stub!"); }
/*    */   public abstract Engine onCreateEngine();
/* 50 */   protected void dump(FileDescriptor fd, PrintWriter out, String[] args) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\service\wallpaper\WallpaperService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */