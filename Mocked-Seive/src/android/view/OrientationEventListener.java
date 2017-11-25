/*    */ package android.view;
/*    */ 
/*    */ import android.content.Context;
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
/*    */ public abstract class OrientationEventListener
/*    */ {
/*    */   public static final int ORIENTATION_UNKNOWN = -1;
/*    */   
/* 20 */   public OrientationEventListener(Context context) { throw new RuntimeException("Stub!"); }
/* 21 */   public OrientationEventListener(Context context, int rate) { throw new RuntimeException("Stub!"); }
/* 22 */   public void enable() { throw new RuntimeException("Stub!"); }
/* 23 */   public void disable() { throw new RuntimeException("Stub!"); }
/* 24 */   public boolean canDetectOrientation() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract void onOrientationChanged(int paramInt);
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\view\OrientationEventListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */