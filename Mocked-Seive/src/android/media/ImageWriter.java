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
/*    */ public class ImageWriter
/*    */   implements AutoCloseable
/*    */ {
/* 25 */   ImageWriter() { throw new RuntimeException("Stub!"); }
/* 26 */   public static ImageWriter newInstance(Surface surface, int maxImages) { throw new RuntimeException("Stub!"); }
/* 27 */   public int getMaxImages() { throw new RuntimeException("Stub!"); }
/* 28 */   public Image dequeueInputImage() { throw new RuntimeException("Stub!"); }
/* 29 */   public void queueInputImage(Image image) { throw new RuntimeException("Stub!"); }
/* 30 */   public int getFormat() { throw new RuntimeException("Stub!"); }
/* 31 */   public void setOnImageReleasedListener(OnImageReleasedListener listener, Handler handler) { throw new RuntimeException("Stub!"); }
/* 32 */   public void close() { throw new RuntimeException("Stub!"); }
/* 33 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface OnImageReleasedListener
/*    */   {
/*    */     public abstract void onImageReleased(ImageWriter paramImageWriter);
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\media\ImageWriter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */