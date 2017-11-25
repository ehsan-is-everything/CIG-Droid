/*    */ package android.view;
/*    */ 
/*    */ import android.graphics.Canvas;
/*    */ import android.graphics.Rect;
/*    */ import android.graphics.SurfaceTexture;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
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
/*    */ public class Surface
/*    */   implements Parcelable
/*    */ {
/*    */   public static class OutOfResourcesException
/*    */     extends RuntimeException
/*    */   {
/* 25 */     public OutOfResourcesException() { throw new RuntimeException("Stub!"); }
/* 26 */     public OutOfResourcesException(String name) { throw new RuntimeException("Stub!"); } }
/*    */   
/* 28 */   public Surface(SurfaceTexture surfaceTexture) { throw new RuntimeException("Stub!"); }
/* 29 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }
/* 30 */   public void release() { throw new RuntimeException("Stub!"); }
/* 31 */   public boolean isValid() { throw new RuntimeException("Stub!"); }
/* 32 */   public Canvas lockCanvas(Rect inOutDirty) throws Surface.OutOfResourcesException, IllegalArgumentException { throw new RuntimeException("Stub!"); }
/* 33 */   public void unlockCanvasAndPost(Canvas canvas) { throw new RuntimeException("Stub!"); }
/* 34 */   public Canvas lockHardwareCanvas() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 36 */   public void unlockCanvas(Canvas canvas) { throw new RuntimeException("Stub!"); }
/* 37 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 38 */   public void readFromParcel(Parcel source) { throw new RuntimeException("Stub!"); }
/* 39 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 40 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 46 */   public static final Parcelable.Creator<Surface> CREATOR = null;
/*    */   public static final int ROTATION_0 = 0;
/*    */   public static final int ROTATION_180 = 2;
/*    */   public static final int ROTATION_270 = 3;
/*    */   public static final int ROTATION_90 = 1;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\view\Surface.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */