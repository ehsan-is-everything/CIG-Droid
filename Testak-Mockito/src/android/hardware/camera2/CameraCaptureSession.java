/*    */ package android.hardware.camera2;
/*    */ 
/*    */ import android.hardware.camera2.params.OutputConfiguration;
/*    */ import android.os.Handler;
/*    */ import android.view.Surface;
/*    */ import java.util.List;
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
/*    */ public abstract class CameraCaptureSession
/*    */   implements AutoCloseable
/*    */ {
/*    */   public static abstract class StateCallback
/*    */   {
/* 23 */     public StateCallback() { throw new RuntimeException("Stub!"); }
/*    */     public abstract void onConfigured(CameraCaptureSession paramCameraCaptureSession);
/*    */     public abstract void onConfigureFailed(CameraCaptureSession paramCameraCaptureSession);
/* 26 */     public void onReady(CameraCaptureSession session) { throw new RuntimeException("Stub!"); }
/* 27 */     public void onActive(CameraCaptureSession session) { throw new RuntimeException("Stub!"); }
/* 28 */     public void onCaptureQueueEmpty(CameraCaptureSession session) { throw new RuntimeException("Stub!"); }
/* 29 */     public void onClosed(CameraCaptureSession session) { throw new RuntimeException("Stub!"); }
/* 30 */     public void onSurfacePrepared(CameraCaptureSession session, Surface surface) { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public static abstract class CaptureCallback {
/* 34 */     public CaptureCallback() { throw new RuntimeException("Stub!"); }
/* 35 */     public void onCaptureStarted(CameraCaptureSession session, CaptureRequest request, long timestamp, long frameNumber) { throw new RuntimeException("Stub!"); }
/* 36 */     public void onCaptureProgressed(CameraCaptureSession session, CaptureRequest request, CaptureResult partialResult) { throw new RuntimeException("Stub!"); }
/* 37 */     public void onCaptureCompleted(CameraCaptureSession session, CaptureRequest request, TotalCaptureResult result) { throw new RuntimeException("Stub!"); }
/* 38 */     public void onCaptureFailed(CameraCaptureSession session, CaptureRequest request, CaptureFailure failure) { throw new RuntimeException("Stub!"); }
/* 39 */     public void onCaptureSequenceCompleted(CameraCaptureSession session, int sequenceId, long frameNumber) { throw new RuntimeException("Stub!"); }
/* 40 */     public void onCaptureSequenceAborted(CameraCaptureSession session, int sequenceId) { throw new RuntimeException("Stub!"); }
/* 41 */     public void onCaptureBufferLost(CameraCaptureSession session, CaptureRequest request, Surface target, long frameNumber) { throw new RuntimeException("Stub!"); } }
/*    */   
/* 43 */   public CameraCaptureSession() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract CameraDevice getDevice();
/*    */   
/*    */   public abstract void prepare(Surface paramSurface)
/*    */     throws CameraAccessException;
/*    */   
/*    */   public abstract void finalizeOutputConfigurations(List<OutputConfiguration> paramList)
/*    */     throws CameraAccessException;
/*    */   
/*    */   public abstract int capture(CaptureRequest paramCaptureRequest, CaptureCallback paramCaptureCallback, Handler paramHandler)
/*    */     throws CameraAccessException;
/*    */   
/*    */   public abstract int captureBurst(List<CaptureRequest> paramList, CaptureCallback paramCaptureCallback, Handler paramHandler)
/*    */     throws CameraAccessException;
/*    */   
/*    */   public abstract int setRepeatingRequest(CaptureRequest paramCaptureRequest, CaptureCallback paramCaptureCallback, Handler paramHandler)
/*    */     throws CameraAccessException;
/*    */   
/*    */   public abstract int setRepeatingBurst(List<CaptureRequest> paramList, CaptureCallback paramCaptureCallback, Handler paramHandler)
/*    */     throws CameraAccessException;
/*    */   
/*    */   public abstract void stopRepeating()
/*    */     throws CameraAccessException;
/*    */   
/*    */   public abstract void abortCaptures()
/*    */     throws CameraAccessException;
/*    */   
/*    */   public abstract boolean isReprocessable();
/*    */   
/*    */   public abstract Surface getInputSurface();
/*    */   
/*    */   public abstract void close();
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\hardware\camera2\CameraCaptureSession.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */