/*    */ package android.os;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class HardwarePropertiesManager
/*    */ {
/*    */   public static final int DEVICE_TEMPERATURE_BATTERY = 2;
/*    */   
/*    */ 
/*    */   public static final int DEVICE_TEMPERATURE_CPU = 0;
/*    */   public static final int DEVICE_TEMPERATURE_GPU = 1;
/*    */   public static final int DEVICE_TEMPERATURE_SKIN = 3;
/*    */   public static final int TEMPERATURE_CURRENT = 0;
/*    */   public static final int TEMPERATURE_SHUTDOWN = 2;
/*    */   public static final int TEMPERATURE_THROTTLING = 1;
/*    */   public static final int TEMPERATURE_THROTTLING_BELOW_VR_MIN = 3;
/*    */   public static final float UNDEFINED_TEMPERATURE = -3.4028235E38F;
/*    */   
/* 19 */   HardwarePropertiesManager() { throw new RuntimeException("Stub!"); }
/* 20 */   public float[] getDeviceTemperatures(int type, int source) { throw new RuntimeException("Stub!"); }
/* 21 */   public CpuUsageInfo[] getCpuUsages() { throw new RuntimeException("Stub!"); }
/* 22 */   public float[] getFanSpeeds() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\os\HardwarePropertiesManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */