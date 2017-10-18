/*    */ package android.hardware.camera2;
/*    */ 
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
/*    */ 
/*    */ public abstract class CameraConstrainedHighSpeedCaptureSession
/*    */   extends CameraCaptureSession
/*    */ {
/*    */   public CameraConstrainedHighSpeedCaptureSession()
/*    */   {
/* 21 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract List<CaptureRequest> createHighSpeedRequestList(CaptureRequest paramCaptureRequest)
/*    */     throws CameraAccessException;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\hardware\camera2\CameraConstrainedHighSpeedCaptureSession.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */