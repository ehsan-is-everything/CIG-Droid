/*    */ package android.app;
/*    */ 
/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class WallpaperManager
/*    */ {
/*    */   public static final String ACTION_CHANGE_LIVE_WALLPAPER = "android.service.wallpaper.CHANGE_LIVE_WALLPAPER";
/*    */   public static final String ACTION_CROP_AND_SET_WALLPAPER = "android.service.wallpaper.CROP_AND_SET_WALLPAPER";
/*    */   public static final String ACTION_LIVE_WALLPAPER_CHOOSER = "android.service.wallpaper.LIVE_WALLPAPER_CHOOSER";
/*    */   public static final String COMMAND_DROP = "android.home.drop";
/*    */   public static final String COMMAND_SECONDARY_TAP = "android.wallpaper.secondaryTap";
/*    */   public static final String COMMAND_TAP = "android.wallpaper.tap";
/*    */   public static final String EXTRA_LIVE_WALLPAPER_COMPONENT = "android.service.wallpaper.extra.LIVE_WALLPAPER_COMPONENT";
/*    */   public static final int FLAG_LOCK = 2;
/*    */   public static final int FLAG_SYSTEM = 1;
/*    */   public static final String WALLPAPER_PREVIEW_META_DATA = "android.wallpaper.preview";
/*    */   
/* 20 */   WallpaperManager() { throw new RuntimeException("Stub!"); }
/* 21 */   public static WallpaperManager getInstance(android.content.Context context) { throw new RuntimeException("Stub!"); }
/* 22 */   public android.graphics.drawable.Drawable getDrawable() { throw new RuntimeException("Stub!"); }
/* 23 */   public android.graphics.drawable.Drawable getBuiltInDrawable() { throw new RuntimeException("Stub!"); }
/* 24 */   public android.graphics.drawable.Drawable getBuiltInDrawable(int which) { throw new RuntimeException("Stub!"); }
/* 25 */   public android.graphics.drawable.Drawable getBuiltInDrawable(int outWidth, int outHeight, boolean scaleToFit, float horizontalAlignment, float verticalAlignment) { throw new RuntimeException("Stub!"); }
/* 26 */   public android.graphics.drawable.Drawable getBuiltInDrawable(int outWidth, int outHeight, boolean scaleToFit, float horizontalAlignment, float verticalAlignment, int which) { throw new RuntimeException("Stub!"); }
/* 27 */   public android.graphics.drawable.Drawable peekDrawable() { throw new RuntimeException("Stub!"); }
/* 28 */   public android.graphics.drawable.Drawable getFastDrawable() { throw new RuntimeException("Stub!"); }
/* 29 */   public android.graphics.drawable.Drawable peekFastDrawable() { throw new RuntimeException("Stub!"); }
/* 30 */   public android.os.ParcelFileDescriptor getWallpaperFile(int which) { throw new RuntimeException("Stub!"); }
/* 31 */   public void forgetLoadedWallpaper() { throw new RuntimeException("Stub!"); }
/* 32 */   public WallpaperInfo getWallpaperInfo() { throw new RuntimeException("Stub!"); }
/* 33 */   public int getWallpaperId(int which) { throw new RuntimeException("Stub!"); }
/* 34 */   public android.content.Intent getCropAndSetWallpaperIntent(android.net.Uri imageUri) { throw new RuntimeException("Stub!"); }
/* 35 */   public void setResource(int resid) throws IOException { throw new RuntimeException("Stub!"); }
/* 36 */   public int setResource(int resid, int which) throws IOException { throw new RuntimeException("Stub!"); }
/* 37 */   public void setBitmap(android.graphics.Bitmap bitmap) throws IOException { throw new RuntimeException("Stub!"); }
/* 38 */   public int setBitmap(android.graphics.Bitmap fullImage, android.graphics.Rect visibleCropHint, boolean allowBackup) throws IOException { throw new RuntimeException("Stub!"); }
/* 39 */   public int setBitmap(android.graphics.Bitmap fullImage, android.graphics.Rect visibleCropHint, boolean allowBackup, int which) throws IOException { throw new RuntimeException("Stub!"); }
/* 40 */   public void setStream(java.io.InputStream bitmapData) throws IOException { throw new RuntimeException("Stub!"); }
/* 41 */   public int setStream(java.io.InputStream bitmapData, android.graphics.Rect visibleCropHint, boolean allowBackup) throws IOException { throw new RuntimeException("Stub!"); }
/* 42 */   public int setStream(java.io.InputStream bitmapData, android.graphics.Rect visibleCropHint, boolean allowBackup, int which) throws IOException { throw new RuntimeException("Stub!"); }
/* 43 */   public boolean hasResourceWallpaper(int resid) { throw new RuntimeException("Stub!"); }
/* 44 */   public int getDesiredMinimumWidth() { throw new RuntimeException("Stub!"); }
/* 45 */   public int getDesiredMinimumHeight() { throw new RuntimeException("Stub!"); }
/* 46 */   public void suggestDesiredDimensions(int minimumWidth, int minimumHeight) { throw new RuntimeException("Stub!"); }
/* 47 */   public void setWallpaperOffsets(android.os.IBinder windowToken, float xOffset, float yOffset) { throw new RuntimeException("Stub!"); }
/* 48 */   public void setWallpaperOffsetSteps(float xStep, float yStep) { throw new RuntimeException("Stub!"); }
/* 49 */   public void sendWallpaperCommand(android.os.IBinder windowToken, String action, int x, int y, int z, android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
/* 50 */   public boolean isWallpaperSupported() { throw new RuntimeException("Stub!"); }
/* 51 */   public boolean isSetWallpaperAllowed() { throw new RuntimeException("Stub!"); }
/* 52 */   public void clearWallpaperOffsets(android.os.IBinder windowToken) { throw new RuntimeException("Stub!"); }
/* 53 */   public void clear() throws IOException { throw new RuntimeException("Stub!"); }
/* 54 */   public void clear(int which) throws IOException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\app\WallpaperManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */