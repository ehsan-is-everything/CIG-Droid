/*    */ package android.graphics;
/*    */ 
/*    */ import android.content.res.Resources;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BitmapFactory
/*    */ {
/*    */   public static class Options
/*    */   {
/*    */     public Bitmap inBitmap;
/*    */     public int inDensity;
/*    */     @Deprecated
/*    */     public boolean inDither;
/*    */     @Deprecated
/*    */     public boolean inInputShareable;
/*    */     public boolean inJustDecodeBounds;
/*    */     public boolean inMutable;
/*    */     @Deprecated
/*    */     public boolean inPreferQualityOverSpeed;
/*    */     
/* 22 */     public Options() { throw new RuntimeException("Stub!"); }
/*    */     @Deprecated
/* 24 */     public void requestCancelDecode() { throw new RuntimeException("Stub!"); }
/*    */     
/*    */ 
/*    */ 
/*    */     public ColorSpace inPreferredColorSpace;
/*    */     
/*    */     public Bitmap.Config inPreferredConfig;
/*    */     
/*    */     public boolean inPremultiplied;
/*    */     
/*    */     @Deprecated
/*    */     public boolean inPurgeable;
/*    */     
/*    */     public int inSampleSize;
/*    */     
/*    */     public boolean inScaled;
/*    */     
/*    */     public int inScreenDensity;
/*    */     
/*    */     public int inTargetDensity;
/*    */     
/* 45 */     public byte[] inTempStorage = null;
/*    */     @Deprecated
/*    */     public boolean mCancel;
/*    */     public ColorSpace outColorSpace;
/*    */     public Bitmap.Config outConfig;
/*    */     public int outHeight;
/*    */     public String outMimeType;
/*    */     public int outWidth; }
/*    */   
/* 54 */   public BitmapFactory() { throw new RuntimeException("Stub!"); }
/* 55 */   public static Bitmap decodeFile(String pathName, Options opts) { throw new RuntimeException("Stub!"); }
/* 56 */   public static Bitmap decodeFile(String pathName) { throw new RuntimeException("Stub!"); }
/* 57 */   public static Bitmap decodeResourceStream(Resources res, android.util.TypedValue value, java.io.InputStream is, Rect pad, Options opts) { throw new RuntimeException("Stub!"); }
/* 58 */   public static Bitmap decodeResource(Resources res, int id, Options opts) { throw new RuntimeException("Stub!"); }
/* 59 */   public static Bitmap decodeResource(Resources res, int id) { throw new RuntimeException("Stub!"); }
/* 60 */   public static Bitmap decodeByteArray(byte[] data, int offset, int length, Options opts) { throw new RuntimeException("Stub!"); }
/* 61 */   public static Bitmap decodeByteArray(byte[] data, int offset, int length) { throw new RuntimeException("Stub!"); }
/* 62 */   public static Bitmap decodeStream(java.io.InputStream is, Rect outPadding, Options opts) { throw new RuntimeException("Stub!"); }
/* 63 */   public static Bitmap decodeStream(java.io.InputStream is) { throw new RuntimeException("Stub!"); }
/* 64 */   public static Bitmap decodeFileDescriptor(java.io.FileDescriptor fd, Rect outPadding, Options opts) { throw new RuntimeException("Stub!"); }
/* 65 */   public static Bitmap decodeFileDescriptor(java.io.FileDescriptor fd) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\graphics\BitmapFactory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */