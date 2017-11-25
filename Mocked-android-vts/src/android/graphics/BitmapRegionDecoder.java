/*    */ package android.graphics;
/*    */ 
/*    */ import java.io.FileDescriptor;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
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
/*    */ public final class BitmapRegionDecoder
/*    */ {
/* 19 */   BitmapRegionDecoder() { throw new RuntimeException("Stub!"); }
/* 20 */   public static BitmapRegionDecoder newInstance(byte[] data, int offset, int length, boolean isShareable) throws IOException { throw new RuntimeException("Stub!"); }
/* 21 */   public static BitmapRegionDecoder newInstance(FileDescriptor fd, boolean isShareable) throws IOException { throw new RuntimeException("Stub!"); }
/* 22 */   public static BitmapRegionDecoder newInstance(InputStream is, boolean isShareable) throws IOException { throw new RuntimeException("Stub!"); }
/* 23 */   public static BitmapRegionDecoder newInstance(String pathName, boolean isShareable) throws IOException { throw new RuntimeException("Stub!"); }
/* 24 */   public Bitmap decodeRegion(Rect rect, BitmapFactory.Options options) { throw new RuntimeException("Stub!"); }
/* 25 */   public int getWidth() { throw new RuntimeException("Stub!"); }
/* 26 */   public int getHeight() { throw new RuntimeException("Stub!"); }
/* 27 */   public void recycle() { throw new RuntimeException("Stub!"); }
/* 28 */   public final boolean isRecycled() { throw new RuntimeException("Stub!"); }
/* 29 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\graphics\BitmapRegionDecoder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */