/*    */ package android.graphics;
/*    */ 
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
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Movie
/*    */ {
/* 20 */   Movie() { throw new RuntimeException("Stub!"); }
/*    */   public native int width();
/*    */   public native int height();
/*    */   public native boolean isOpaque();
/*    */   public native int duration();
/*    */   public native boolean setTime(int paramInt);
/* 26 */   public void draw(Canvas canvas, float x, float y, Paint paint) { throw new RuntimeException("Stub!"); }
/* 27 */   public void draw(Canvas canvas, float x, float y) { throw new RuntimeException("Stub!"); }
/* 28 */   public static Movie decodeStream(InputStream is) { throw new RuntimeException("Stub!"); }
/*    */   public static native Movie decodeByteArray(byte[] paramArrayOfByte, int paramInt1, int paramInt2);
/* 30 */   public static Movie decodeFile(String pathName) { throw new RuntimeException("Stub!"); }
/* 31 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\graphics\Movie.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */