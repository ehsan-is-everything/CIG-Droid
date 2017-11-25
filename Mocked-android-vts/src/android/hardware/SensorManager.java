/*    */ package android.hardware;
/*    */ 
/*    */ import android.os.Handler;
/*    */ import android.os.MemoryFile;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class SensorManager
/*    */ {
/*    */   public static final int AXIS_MINUS_X = 129;
/*    */   public static final int AXIS_MINUS_Y = 130;
/*    */   public static final int AXIS_MINUS_Z = 131;
/*    */   public static final int AXIS_X = 1;
/*    */   public static final int AXIS_Y = 2;
/*    */   public static final int AXIS_Z = 3;
/*    */   @Deprecated
/*    */   public static final int DATA_X = 0;
/*    */   
/*    */   public static abstract class DynamicSensorCallback
/*    */   {
/* 22 */     public DynamicSensorCallback() { throw new RuntimeException("Stub!"); }
/* 23 */     public void onDynamicSensorConnected(Sensor sensor) { throw new RuntimeException("Stub!"); }
/* 24 */     public void onDynamicSensorDisconnected(Sensor sensor) { throw new RuntimeException("Stub!"); } }
/*    */   
/* 26 */   SensorManager() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 28 */   public int getSensors() { throw new RuntimeException("Stub!"); }
/* 29 */   public List<Sensor> getSensorList(int type) { throw new RuntimeException("Stub!"); }
/* 30 */   public List<Sensor> getDynamicSensorList(int type) { throw new RuntimeException("Stub!"); }
/* 31 */   public Sensor getDefaultSensor(int type) { throw new RuntimeException("Stub!"); }
/* 32 */   public Sensor getDefaultSensor(int type, boolean wakeUp) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 34 */   public boolean registerListener(SensorListener listener, int sensors) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 36 */   public boolean registerListener(SensorListener listener, int sensors, int rate) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 38 */   public void unregisterListener(SensorListener listener) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 40 */   public void unregisterListener(SensorListener listener, int sensors) { throw new RuntimeException("Stub!"); }
/* 41 */   public void unregisterListener(SensorEventListener listener, Sensor sensor) { throw new RuntimeException("Stub!"); }
/* 42 */   public void unregisterListener(SensorEventListener listener) { throw new RuntimeException("Stub!"); }
/* 43 */   public boolean registerListener(SensorEventListener listener, Sensor sensor, int samplingPeriodUs) { throw new RuntimeException("Stub!"); }
/* 44 */   public boolean registerListener(SensorEventListener listener, Sensor sensor, int samplingPeriodUs, int maxReportLatencyUs) { throw new RuntimeException("Stub!"); }
/* 45 */   public boolean registerListener(SensorEventListener listener, Sensor sensor, int samplingPeriodUs, Handler handler) { throw new RuntimeException("Stub!"); }
/* 46 */   public boolean registerListener(SensorEventListener listener, Sensor sensor, int samplingPeriodUs, int maxReportLatencyUs, Handler handler) { throw new RuntimeException("Stub!"); }
/* 47 */   public boolean flush(SensorEventListener listener) { throw new RuntimeException("Stub!"); }
/* 48 */   public SensorDirectChannel createDirectChannel(MemoryFile mem) { throw new RuntimeException("Stub!"); }
/* 49 */   public SensorDirectChannel createDirectChannel(HardwareBuffer mem) { throw new RuntimeException("Stub!"); }
/* 50 */   public void registerDynamicSensorCallback(DynamicSensorCallback callback) { throw new RuntimeException("Stub!"); }
/* 51 */   public void registerDynamicSensorCallback(DynamicSensorCallback callback, Handler handler) { throw new RuntimeException("Stub!"); }
/* 52 */   public void unregisterDynamicSensorCallback(DynamicSensorCallback callback) { throw new RuntimeException("Stub!"); }
/* 53 */   public boolean isDynamicSensorDiscoverySupported() { throw new RuntimeException("Stub!"); }
/* 54 */   public static boolean getRotationMatrix(float[] R, float[] I, float[] gravity, float[] geomagnetic) { throw new RuntimeException("Stub!"); }
/* 55 */   public static float getInclination(float[] I) { throw new RuntimeException("Stub!"); }
/* 56 */   public static boolean remapCoordinateSystem(float[] inR, int X, int Y, float[] outR) { throw new RuntimeException("Stub!"); }
/* 57 */   public static float[] getOrientation(float[] R, float[] values) { throw new RuntimeException("Stub!"); }
/* 58 */   public static float getAltitude(float p0, float p) { throw new RuntimeException("Stub!"); }
/* 59 */   public static void getAngleChange(float[] angleChange, float[] R, float[] prevR) { throw new RuntimeException("Stub!"); }
/* 60 */   public static void getRotationMatrixFromVector(float[] R, float[] rotationVector) { throw new RuntimeException("Stub!"); }
/* 61 */   public static void getQuaternionFromVector(float[] Q, float[] rv) { throw new RuntimeException("Stub!"); }
/* 62 */   public boolean requestTriggerSensor(TriggerEventListener listener, Sensor sensor) { throw new RuntimeException("Stub!"); }
/* 63 */   public boolean cancelTriggerSensor(TriggerEventListener listener, Sensor sensor) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   @Deprecated
/*    */   public static final int DATA_Y = 1;
/*    */   @Deprecated
/*    */   public static final int DATA_Z = 2;
/*    */   public static final float GRAVITY_DEATH_STAR_I = 3.5303614E-7F;
/*    */   public static final float GRAVITY_EARTH = 9.80665F;
/*    */   public static final float GRAVITY_JUPITER = 23.12F;
/*    */   public static final float GRAVITY_MARS = 3.71F;
/*    */   public static final float GRAVITY_MERCURY = 3.7F;
/*    */   public static final float GRAVITY_MOON = 1.6F;
/*    */   public static final float GRAVITY_NEPTUNE = 11.0F;
/*    */   public static final float GRAVITY_PLUTO = 0.6F;
/*    */   public static final float GRAVITY_SATURN = 8.96F;
/*    */   public static final float GRAVITY_SUN = 275.0F;
/*    */   public static final float GRAVITY_THE_ISLAND = 4.815162F;
/*    */   public static final float GRAVITY_URANUS = 8.69F;
/*    */   public static final float GRAVITY_VENUS = 8.87F;
/*    */   public static final float LIGHT_CLOUDY = 100.0F;
/*    */   public static final float LIGHT_FULLMOON = 0.25F;
/*    */   public static final float LIGHT_NO_MOON = 0.001F;
/*    */   public static final float LIGHT_OVERCAST = 10000.0F;
/*    */   public static final float LIGHT_SHADE = 20000.0F;
/*    */   public static final float LIGHT_SUNLIGHT = 110000.0F;
/*    */   public static final float LIGHT_SUNLIGHT_MAX = 120000.0F;
/*    */   public static final float LIGHT_SUNRISE = 400.0F;
/*    */   public static final float MAGNETIC_FIELD_EARTH_MAX = 60.0F;
/*    */   public static final float MAGNETIC_FIELD_EARTH_MIN = 30.0F;
/*    */   public static final float PRESSURE_STANDARD_ATMOSPHERE = 1013.25F;
/*    */   @Deprecated
/*    */   public static final int RAW_DATA_INDEX = 3;
/*    */   @Deprecated
/*    */   public static final int RAW_DATA_X = 3;
/*    */   @Deprecated
/*    */   public static final int RAW_DATA_Y = 4;
/*    */   @Deprecated
/*    */   public static final int RAW_DATA_Z = 5;
/*    */   @Deprecated
/*    */   public static final int SENSOR_ACCELEROMETER = 2;
/*    */   @Deprecated
/*    */   public static final int SENSOR_ALL = 127;
/*    */   public static final int SENSOR_DELAY_FASTEST = 0;
/*    */   public static final int SENSOR_DELAY_GAME = 1;
/*    */   public static final int SENSOR_DELAY_NORMAL = 3;
/*    */   public static final int SENSOR_DELAY_UI = 2;
/*    */   @Deprecated
/*    */   public static final int SENSOR_LIGHT = 16;
/*    */   @Deprecated
/*    */   public static final int SENSOR_MAGNETIC_FIELD = 8;
/*    */   @Deprecated
/*    */   public static final int SENSOR_MAX = 64;
/*    */   @Deprecated
/*    */   public static final int SENSOR_MIN = 1;
/*    */   @Deprecated
/*    */   public static final int SENSOR_ORIENTATION = 1;
/*    */   @Deprecated
/*    */   public static final int SENSOR_ORIENTATION_RAW = 128;
/*    */   @Deprecated
/*    */   public static final int SENSOR_PROXIMITY = 32;
/*    */   public static final int SENSOR_STATUS_ACCURACY_HIGH = 3;
/*    */   public static final int SENSOR_STATUS_ACCURACY_LOW = 1;
/*    */   public static final int SENSOR_STATUS_ACCURACY_MEDIUM = 2;
/*    */   public static final int SENSOR_STATUS_NO_CONTACT = -1;
/*    */   public static final int SENSOR_STATUS_UNRELIABLE = 0;
/*    */   @Deprecated
/*    */   public static final int SENSOR_TEMPERATURE = 4;
/*    */   @Deprecated
/*    */   public static final int SENSOR_TRICORDER = 64;
/*    */   public static final float STANDARD_GRAVITY = 9.80665F;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\hardware\SensorManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */