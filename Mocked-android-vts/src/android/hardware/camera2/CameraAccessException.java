/*    */ package android.hardware.camera2;
/*    */ 
/*    */ import android.util.AndroidException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class CameraAccessException
/*    */   extends AndroidException
/*    */ {
/*    */   public static final int CAMERA_DISABLED = 1;
/*    */   public static final int CAMERA_DISCONNECTED = 2;
/*    */   public static final int CAMERA_ERROR = 3;
/*    */   public static final int CAMERA_IN_USE = 4;
/*    */   public static final int MAX_CAMERAS_IN_USE = 5;
/*    */   
/* 21 */   public CameraAccessException(int problem) { throw new RuntimeException("Stub!"); }
/* 22 */   public CameraAccessException(int problem, String message) { throw new RuntimeException("Stub!"); }
/* 23 */   public CameraAccessException(int problem, String message, Throwable cause) { throw new RuntimeException("Stub!"); }
/* 24 */   public CameraAccessException(int problem, Throwable cause) { throw new RuntimeException("Stub!"); }
/* 25 */   public final int getReason() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\hardware\camera2\CameraAccessException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */