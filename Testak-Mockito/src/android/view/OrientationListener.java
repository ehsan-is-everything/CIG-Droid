/*    */ package android.view;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.hardware.SensorListener;
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
/*    */ @Deprecated
/*    */ public abstract class OrientationListener
/*    */   implements SensorListener
/*    */ {
/*    */   public static final int ORIENTATION_UNKNOWN = -1;
/*    */   
/* 22 */   public OrientationListener(Context context) { throw new RuntimeException("Stub!"); }
/* 23 */   public OrientationListener(Context context, int rate) { throw new RuntimeException("Stub!"); }
/* 24 */   public void enable() { throw new RuntimeException("Stub!"); }
/* 25 */   public void disable() { throw new RuntimeException("Stub!"); }
/* 26 */   public void onAccuracyChanged(int sensor, int accuracy) { throw new RuntimeException("Stub!"); }
/* 27 */   public void onSensorChanged(int sensor, float[] values) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract void onOrientationChanged(int paramInt);
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\view\OrientationListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */