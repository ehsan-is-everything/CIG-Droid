/*    */ package android.hardware;
/*    */ 
/*    */ import java.nio.channels.Channel;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class SensorDirectChannel
/*    */   implements Channel
/*    */ {
/*    */   public static final int RATE_FAST = 2;
/*    */   public static final int RATE_NORMAL = 1;
/*    */   public static final int RATE_STOP = 0;
/*    */   public static final int RATE_VERY_FAST = 3;
/*    */   public static final int TYPE_HARDWARE_BUFFER = 2;
/*    */   public static final int TYPE_MEMORY_FILE = 1;
/*    */   
/* 20 */   SensorDirectChannel() { throw new RuntimeException("Stub!"); }
/* 21 */   public boolean isOpen() { throw new RuntimeException("Stub!"); }
/* 22 */   public void close() { throw new RuntimeException("Stub!"); }
/* 23 */   public int configure(Sensor sensor, int rateLevel) { throw new RuntimeException("Stub!"); }
/* 24 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\hardware\SensorDirectChannel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */