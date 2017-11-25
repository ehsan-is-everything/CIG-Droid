/*    */ package android.opengl;
/*    */ 
/*    */ import java.io.Writer;
/*    */ import javax.microedition.khronos.egl.EGL;
/*    */ import javax.microedition.khronos.opengles.GL;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class GLDebugHelper
/*    */ {
/*    */   public static final int CONFIG_CHECK_GL_ERROR = 1;
/*    */   public static final int CONFIG_CHECK_THREAD = 2;
/*    */   public static final int CONFIG_LOG_ARGUMENT_NAMES = 4;
/*    */   public static final int ERROR_WRONG_THREAD = 28672;
/*    */   
/* 20 */   public GLDebugHelper() { throw new RuntimeException("Stub!"); }
/* 21 */   public static GL wrap(GL gl, int configFlags, Writer log) { throw new RuntimeException("Stub!"); }
/* 22 */   public static EGL wrap(EGL egl, int configFlags, Writer log) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\opengl\GLDebugHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */