/*    */ package android.hardware.camera2;
/*    */ 
/*    */ import android.graphics.Bitmap;
/*    */ import android.location.Location;
/*    */ import android.media.Image;
/*    */ import android.util.Size;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.OutputStream;
/*    */ import java.nio.ByteBuffer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class DngCreator
/*    */   implements AutoCloseable
/*    */ {
/*    */   public static final int MAX_THUMBNAIL_DIMENSION = 256;
/*    */   
/* 21 */   public DngCreator(CameraCharacteristics characteristics, CaptureResult metadata) { throw new RuntimeException("Stub!"); }
/* 22 */   public DngCreator setOrientation(int orientation) { throw new RuntimeException("Stub!"); }
/* 23 */   public DngCreator setThumbnail(Bitmap pixels) { throw new RuntimeException("Stub!"); }
/* 24 */   public DngCreator setThumbnail(Image pixels) { throw new RuntimeException("Stub!"); }
/* 25 */   public DngCreator setLocation(Location location) { throw new RuntimeException("Stub!"); }
/* 26 */   public DngCreator setDescription(String description) { throw new RuntimeException("Stub!"); }
/* 27 */   public void writeInputStream(OutputStream dngOutput, Size size, InputStream pixels, long offset) throws IOException { throw new RuntimeException("Stub!"); }
/* 28 */   public void writeByteBuffer(OutputStream dngOutput, Size size, ByteBuffer pixels, long offset) throws IOException { throw new RuntimeException("Stub!"); }
/* 29 */   public void writeImage(OutputStream dngOutput, Image pixels) throws IOException { throw new RuntimeException("Stub!"); }
/* 30 */   public void close() { throw new RuntimeException("Stub!"); }
/* 31 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\hardware\camera2\DngCreator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */