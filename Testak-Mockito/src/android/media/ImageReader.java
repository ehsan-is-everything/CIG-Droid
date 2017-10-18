/*    */ package android.media;
/*    */ 
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ImageReader
/*    */   implements AutoCloseable
/*    */ {
/* 25 */   ImageReader() { throw new RuntimeException("Stub!"); }
/* 26 */   public static ImageReader newInstance(int width, int height, int format, int maxImages) { throw new RuntimeException("Stub!"); }
/* 27 */   public int getWidth() { throw new RuntimeException("Stub!"); }
/* 28 */   public int getHeight() { throw new RuntimeException("Stub!"); }
/* 29 */   public int getImageFormat() { throw new RuntimeException("Stub!"); }
/* 30 */   public int getMaxImages() { throw new RuntimeException("Stub!"); }
/* 31 */   public Surface getSurface() { throw new RuntimeException("Stub!"); }
/* 32 */   public Image acquireLatestImage() { throw new RuntimeException("Stub!"); }
/* 33 */   public Image acquireNextImage() { throw new RuntimeException("Stub!"); }
/* 34 */   public void setOnImageAvailableListener(OnImageAvailableListener listener, Handler handler) { throw new RuntimeException("Stub!"); }
/* 35 */   public void close() { throw new RuntimeException("Stub!"); }
/* 36 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface OnImageAvailableListener
/*    */   {
/*    */     public abstract void onImageAvailable(ImageReader paramImageReader);
/*    */   }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\media\ImageReader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */