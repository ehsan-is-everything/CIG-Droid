/*    */ package android.hardware.camera2;
/*    */ 
/*    */ import android.os.Handler;
/*    */ 
/*    */ public abstract class CameraDevice
/*    */   implements AutoCloseable
/*    */ {
/*    */   public static final int TEMPLATE_MANUAL = 6;
/*    */   public static final int TEMPLATE_PREVIEW = 1;
/*    */   public static final int TEMPLATE_RECORD = 3;
/*    */   public static final int TEMPLATE_STILL_CAPTURE = 2;
/*    */   public static final int TEMPLATE_VIDEO_SNAPSHOT = 4;
/*    */   public static final int TEMPLATE_ZERO_SHUTTER_LAG = 5;
/*    */   
/*    */   public static abstract class StateCallback
/*    */   {
/*    */     public static final int ERROR_CAMERA_DEVICE = 4;
/*    */     public static final int ERROR_CAMERA_DISABLED = 3;
/*    */     public static final int ERROR_CAMERA_IN_USE = 1;
/*    */     public static final int ERROR_CAMERA_SERVICE = 5;
/*    */     public static final int ERROR_MAX_CAMERAS_IN_USE = 2;
/*    */     
/* 23 */     public StateCallback() { throw new RuntimeException("Stub!"); }
/*    */     public abstract void onOpened(CameraDevice paramCameraDevice);
/* 25 */     public void onClosed(CameraDevice camera) { throw new RuntimeException("Stub!"); }
/*    */     
/*    */     public abstract void onDisconnected(CameraDevice paramCameraDevice);
/*    */     
/*    */     public abstract void onError(CameraDevice paramCameraDevice, int paramInt);
/*    */   }
/*    */   
/*    */   CameraDevice()
/*    */   {
/* 34 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract String getId();
/*    */   
/*    */   public abstract void createCaptureSession(java.util.List<android.view.Surface> paramList, CameraCaptureSession.StateCallback paramStateCallback, Handler paramHandler)
/*    */     throws CameraAccessException;
/*    */   
/*    */   public abstract void createCaptureSessionByOutputConfigurations(java.util.List<android.hardware.camera2.params.OutputConfiguration> paramList, CameraCaptureSession.StateCallback paramStateCallback, Handler paramHandler)
/*    */     throws CameraAccessException;
/*    */   
/*    */   public abstract void createReprocessableCaptureSession(android.hardware.camera2.params.InputConfiguration paramInputConfiguration, java.util.List<android.view.Surface> paramList, CameraCaptureSession.StateCallback paramStateCallback, Handler paramHandler)
/*    */     throws CameraAccessException;
/*    */   
/*    */   public abstract void createReprocessableCaptureSessionByConfigurations(android.hardware.camera2.params.InputConfiguration paramInputConfiguration, java.util.List<android.hardware.camera2.params.OutputConfiguration> paramList, CameraCaptureSession.StateCallback paramStateCallback, Handler paramHandler)
/*    */     throws CameraAccessException;
/*    */   
/*    */   public abstract void createConstrainedHighSpeedCaptureSession(java.util.List<android.view.Surface> paramList, CameraCaptureSession.StateCallback paramStateCallback, Handler paramHandler)
/*    */     throws CameraAccessException;
/*    */   
/*    */   public abstract CaptureRequest.Builder createCaptureRequest(int paramInt)
/*    */     throws CameraAccessException;
/*    */   
/*    */   public abstract CaptureRequest.Builder createReprocessCaptureRequest(TotalCaptureResult paramTotalCaptureResult)
/*    */     throws CameraAccessException;
/*    */   
/*    */   public abstract void close();
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\hardware\camera2\CameraDevice.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */