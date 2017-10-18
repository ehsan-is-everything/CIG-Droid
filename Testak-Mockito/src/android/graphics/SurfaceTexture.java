/*    */ package android.graphics;
/*    */ 
/*    */ import android.os.Handler;
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
/*    */ 
/*    */ 
/*    */ public class SurfaceTexture
/*    */ {
/*    */   @Deprecated
/*    */   public static class OutOfResourcesException
/*    */     extends Exception
/*    */   {
/* 29 */     public OutOfResourcesException() { throw new RuntimeException("Stub!"); }
/* 30 */     public OutOfResourcesException(String name) { throw new RuntimeException("Stub!"); } }
/*    */   
/* 32 */   public SurfaceTexture(int texName) { throw new RuntimeException("Stub!"); }
/* 33 */   public SurfaceTexture(int texName, boolean singleBufferMode) { throw new RuntimeException("Stub!"); }
/* 34 */   public SurfaceTexture(boolean singleBufferMode) { throw new RuntimeException("Stub!"); }
/* 35 */   public void setOnFrameAvailableListener(OnFrameAvailableListener listener) { throw new RuntimeException("Stub!"); }
/* 36 */   public void setOnFrameAvailableListener(OnFrameAvailableListener listener, Handler handler) { throw new RuntimeException("Stub!"); }
/* 37 */   public void setDefaultBufferSize(int width, int height) { throw new RuntimeException("Stub!"); }
/* 38 */   public void updateTexImage() { throw new RuntimeException("Stub!"); }
/* 39 */   public void releaseTexImage() { throw new RuntimeException("Stub!"); }
/* 40 */   public void detachFromGLContext() { throw new RuntimeException("Stub!"); }
/* 41 */   public void attachToGLContext(int texName) { throw new RuntimeException("Stub!"); }
/* 42 */   public void getTransformMatrix(float[] mtx) { throw new RuntimeException("Stub!"); }
/* 43 */   public long getTimestamp() { throw new RuntimeException("Stub!"); }
/* 44 */   public void release() { throw new RuntimeException("Stub!"); }
/* 45 */   public boolean isReleased() { throw new RuntimeException("Stub!"); }
/* 46 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface OnFrameAvailableListener
/*    */   {
/*    */     public abstract void onFrameAvailable(SurfaceTexture paramSurfaceTexture);
/*    */   }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\graphics\SurfaceTexture.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */