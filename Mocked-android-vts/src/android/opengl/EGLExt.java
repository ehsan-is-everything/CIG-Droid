/*    */ package android.opengl;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class EGLExt
/*    */ {
/*    */   public static final int EGL_CONTEXT_FLAGS_KHR = 12540;
/*    */   
/*    */ 
/*    */   public static final int EGL_CONTEXT_MAJOR_VERSION_KHR = 12440;
/*    */   
/*    */ 
/*    */   public static final int EGL_CONTEXT_MINOR_VERSION_KHR = 12539;
/*    */   
/*    */   public static final int EGL_OPENGL_ES3_BIT_KHR = 64;
/*    */   
/*    */   public static final int EGL_RECORDABLE_ANDROID = 12610;
/*    */   
/*    */ 
/*    */   public EGLExt()
/*    */   {
/* 22 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public static native boolean eglPresentationTimeANDROID(EGLDisplay paramEGLDisplay, EGLSurface paramEGLSurface, long paramLong);
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\opengl\EGLExt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */