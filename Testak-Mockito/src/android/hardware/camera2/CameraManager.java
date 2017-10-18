/*    */ package android.hardware.camera2;
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
/*    */ public final class CameraManager
/*    */ {
/*    */   public static abstract class AvailabilityCallback
/*    */   {
/* 22 */     public AvailabilityCallback() { throw new RuntimeException("Stub!"); }
/* 23 */     public void onCameraAvailable(String cameraId) { throw new RuntimeException("Stub!"); }
/* 24 */     public void onCameraUnavailable(String cameraId) { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public static abstract class TorchCallback {
/* 28 */     public TorchCallback() { throw new RuntimeException("Stub!"); }
/* 29 */     public void onTorchModeUnavailable(String cameraId) { throw new RuntimeException("Stub!"); }
/* 30 */     public void onTorchModeChanged(String cameraId, boolean enabled) { throw new RuntimeException("Stub!"); } }
/*    */   
/* 32 */   CameraManager() { throw new RuntimeException("Stub!"); }
/* 33 */   public String[] getCameraIdList() throws CameraAccessException { throw new RuntimeException("Stub!"); }
/* 34 */   public void registerAvailabilityCallback(AvailabilityCallback callback, Handler handler) { throw new RuntimeException("Stub!"); }
/* 35 */   public void unregisterAvailabilityCallback(AvailabilityCallback callback) { throw new RuntimeException("Stub!"); }
/* 36 */   public void registerTorchCallback(TorchCallback callback, Handler handler) { throw new RuntimeException("Stub!"); }
/* 37 */   public void unregisterTorchCallback(TorchCallback callback) { throw new RuntimeException("Stub!"); }
/* 38 */   public CameraCharacteristics getCameraCharacteristics(String cameraId) throws CameraAccessException { throw new RuntimeException("Stub!"); }
/* 39 */   public void openCamera(String cameraId, CameraDevice.StateCallback callback, Handler handler) throws CameraAccessException { throw new RuntimeException("Stub!"); }
/* 40 */   public void setTorchMode(String cameraId, boolean enabled) throws CameraAccessException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\hardware\camera2\CameraManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */