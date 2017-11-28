/*    */ package android.media;
/*    */ 
/*    */ import android.graphics.Rect;
/*    */ import java.nio.ByteBuffer;
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
/*    */ public abstract class Image
/*    */   implements AutoCloseable
/*    */ {
/*    */   public static abstract class Plane
/*    */   {
/* 23 */     Plane() { throw new RuntimeException("Stub!"); }
/*    */     
/*    */     public abstract int getRowStride();
/*    */     public abstract int getPixelStride();
/*    */     public abstract ByteBuffer getBuffer(); }
/* 28 */   Image() { throw new RuntimeException("Stub!"); }
/*    */   public abstract int getFormat();
/*    */   public abstract int getWidth();
/*    */   public abstract int getHeight();
/*    */   public abstract long getTimestamp();
/* 33 */   public void setTimestamp(long timestamp) { throw new RuntimeException("Stub!"); }
/* 34 */   public Rect getCropRect() { throw new RuntimeException("Stub!"); }
/* 35 */   public void setCropRect(Rect cropRect) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract Plane[] getPlanes();
/*    */   
/*    */   public abstract void close();
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\media\Image.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */