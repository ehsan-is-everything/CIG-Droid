/*    */ package android.hardware;
/*    */ 
/*    */ 
/*    */ public class SensorAdditionalInfo
/*    */ {
/*    */   public static final int TYPE_FRAME_BEGIN = 0;
/*    */   
/*    */   public static final int TYPE_FRAME_END = 1;
/*    */   
/*    */   public static final int TYPE_INTERNAL_TEMPERATURE = 65537;
/*    */   
/*    */   public static final int TYPE_SAMPLING = 65540;
/*    */   
/*    */   public static final int TYPE_SENSOR_PLACEMENT = 65539;
/*    */   public static final int TYPE_UNTRACKED_DELAY = 65536;
/*    */   public static final int TYPE_VEC3_CALIBRATION = 65538;
/*    */   
/*    */   SensorAdditionalInfo()
/*    */   {
/* 20 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 28 */   public final float[] floatValues = null;
/* 29 */   public final int[] intValues = null;
/*    */   public final Sensor sensor;
/*    */   public final int serial;
/*    */   public final int type;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\hardware\SensorAdditionalInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */