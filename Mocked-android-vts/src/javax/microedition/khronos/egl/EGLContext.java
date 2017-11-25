/*    */ package javax.microedition.khronos.egl;
/*    */ 
/*    */ import javax.microedition.khronos.opengles.GL;
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
/*    */ public abstract class EGLContext
/*    */ {
/* 20 */   public EGLContext() { throw new RuntimeException("Stub!"); }
/* 21 */   public static EGL getEGL() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract GL getGL();
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\javax\microedition\khronos\egl\EGLContext.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */