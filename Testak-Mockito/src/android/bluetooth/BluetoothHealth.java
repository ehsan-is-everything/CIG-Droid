/*    */ package android.bluetooth;
/*    */ 
/*    */ import java.util.List;
/*    */ 
/*    */ public final class BluetoothHealth
/*    */   implements BluetoothProfile
/*    */ {
/*    */   public static final int APP_CONFIG_REGISTRATION_FAILURE = 1;
/*    */   public static final int APP_CONFIG_REGISTRATION_SUCCESS = 0;
/*    */   public static final int APP_CONFIG_UNREGISTRATION_FAILURE = 3;
/*    */   public static final int APP_CONFIG_UNREGISTRATION_SUCCESS = 2;
/*    */   public static final int CHANNEL_TYPE_RELIABLE = 10;
/*    */   public static final int CHANNEL_TYPE_STREAMING = 11;
/*    */   public static final int SINK_ROLE = 2;
/*    */   public static final int SOURCE_ROLE = 1;
/*    */   public static final int STATE_CHANNEL_CONNECTED = 2;
/*    */   public static final int STATE_CHANNEL_CONNECTING = 1;
/*    */   public static final int STATE_CHANNEL_DISCONNECTED = 0;
/*    */   public static final int STATE_CHANNEL_DISCONNECTING = 3;
/*    */   
/* 21 */   BluetoothHealth() { throw new RuntimeException("Stub!"); }
/* 22 */   public boolean registerSinkAppConfiguration(String name, int dataType, BluetoothHealthCallback callback) { throw new RuntimeException("Stub!"); }
/* 23 */   public boolean unregisterAppConfiguration(BluetoothHealthAppConfiguration config) { throw new RuntimeException("Stub!"); }
/* 24 */   public boolean connectChannelToSource(BluetoothDevice device, BluetoothHealthAppConfiguration config) { throw new RuntimeException("Stub!"); }
/* 25 */   public boolean disconnectChannel(BluetoothDevice device, BluetoothHealthAppConfiguration config, int channelId) { throw new RuntimeException("Stub!"); }
/* 26 */   public android.os.ParcelFileDescriptor getMainChannelFd(BluetoothDevice device, BluetoothHealthAppConfiguration config) { throw new RuntimeException("Stub!"); }
/* 27 */   public int getConnectionState(BluetoothDevice device) { throw new RuntimeException("Stub!"); }
/* 28 */   public List<BluetoothDevice> getConnectedDevices() { throw new RuntimeException("Stub!"); }
/* 29 */   public List<BluetoothDevice> getDevicesMatchingConnectionStates(int[] states) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\bluetooth\BluetoothHealth.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */