/*    */ package android.bluetooth;
/*    */ 
/*    */ import java.util.List;
/*    */ 
/*    */ public final class BluetoothGatt
/*    */   implements BluetoothProfile {
/*    */   public static final int CONNECTION_PRIORITY_BALANCED = 0;
/*    */   public static final int CONNECTION_PRIORITY_HIGH = 1;
/*    */   public static final int CONNECTION_PRIORITY_LOW_POWER = 2;
/*    */   public static final int GATT_CONNECTION_CONGESTED = 143;
/*    */   public static final int GATT_FAILURE = 257;
/*    */   public static final int GATT_INSUFFICIENT_AUTHENTICATION = 5;
/*    */   public static final int GATT_INSUFFICIENT_ENCRYPTION = 15;
/*    */   public static final int GATT_INVALID_ATTRIBUTE_LENGTH = 13;
/*    */   public static final int GATT_INVALID_OFFSET = 7;
/*    */   public static final int GATT_READ_NOT_PERMITTED = 2;
/*    */   public static final int GATT_REQUEST_NOT_SUPPORTED = 6;
/*    */   public static final int GATT_SUCCESS = 0;
/*    */   public static final int GATT_WRITE_NOT_PERMITTED = 3;
/*    */   
/* 21 */   BluetoothGatt() { throw new RuntimeException("Stub!"); }
/* 22 */   public void close() { throw new RuntimeException("Stub!"); }
/* 23 */   public void disconnect() { throw new RuntimeException("Stub!"); }
/* 24 */   public boolean connect() { throw new RuntimeException("Stub!"); }
/* 25 */   public void setPreferredPhy(int txPhy, int rxPhy, int phyOptions) { throw new RuntimeException("Stub!"); }
/* 26 */   public void readPhy() { throw new RuntimeException("Stub!"); }
/* 27 */   public BluetoothDevice getDevice() { throw new RuntimeException("Stub!"); }
/* 28 */   public boolean discoverServices() { throw new RuntimeException("Stub!"); }
/* 29 */   public List<BluetoothGattService> getServices() { throw new RuntimeException("Stub!"); }
/* 30 */   public BluetoothGattService getService(java.util.UUID uuid) { throw new RuntimeException("Stub!"); }
/* 31 */   public boolean readCharacteristic(BluetoothGattCharacteristic characteristic) { throw new RuntimeException("Stub!"); }
/* 32 */   public boolean writeCharacteristic(BluetoothGattCharacteristic characteristic) { throw new RuntimeException("Stub!"); }
/* 33 */   public boolean readDescriptor(BluetoothGattDescriptor descriptor) { throw new RuntimeException("Stub!"); }
/* 34 */   public boolean writeDescriptor(BluetoothGattDescriptor descriptor) { throw new RuntimeException("Stub!"); }
/* 35 */   public boolean beginReliableWrite() { throw new RuntimeException("Stub!"); }
/* 36 */   public boolean executeReliableWrite() { throw new RuntimeException("Stub!"); }
/* 37 */   public void abortReliableWrite() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 39 */   public void abortReliableWrite(BluetoothDevice mDevice) { throw new RuntimeException("Stub!"); }
/* 40 */   public boolean setCharacteristicNotification(BluetoothGattCharacteristic characteristic, boolean enable) { throw new RuntimeException("Stub!"); }
/* 41 */   public boolean readRemoteRssi() { throw new RuntimeException("Stub!"); }
/* 42 */   public boolean requestMtu(int mtu) { throw new RuntimeException("Stub!"); }
/* 43 */   public boolean requestConnectionPriority(int connectionPriority) { throw new RuntimeException("Stub!"); }
/* 44 */   public int getConnectionState(BluetoothDevice device) { throw new RuntimeException("Stub!"); }
/* 45 */   public List<BluetoothDevice> getConnectedDevices() { throw new RuntimeException("Stub!"); }
/* 46 */   public List<BluetoothDevice> getDevicesMatchingConnectionStates(int[] states) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\bluetooth\BluetoothGatt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */