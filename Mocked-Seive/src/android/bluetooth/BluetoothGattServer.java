/*    */ package android.bluetooth;
/*    */ 
/*    */ import java.util.List;
/*    */ import java.util.UUID;
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
/*    */ public final class BluetoothGattServer
/*    */   implements BluetoothProfile
/*    */ {
/* 21 */   BluetoothGattServer() { throw new RuntimeException("Stub!"); }
/* 22 */   public void close() { throw new RuntimeException("Stub!"); }
/* 23 */   public boolean connect(BluetoothDevice device, boolean autoConnect) { throw new RuntimeException("Stub!"); }
/* 24 */   public void cancelConnection(BluetoothDevice device) { throw new RuntimeException("Stub!"); }
/* 25 */   public void setPreferredPhy(BluetoothDevice device, int txPhy, int rxPhy, int phyOptions) { throw new RuntimeException("Stub!"); }
/* 26 */   public void readPhy(BluetoothDevice device) { throw new RuntimeException("Stub!"); }
/* 27 */   public boolean sendResponse(BluetoothDevice device, int requestId, int status, int offset, byte[] value) { throw new RuntimeException("Stub!"); }
/* 28 */   public boolean notifyCharacteristicChanged(BluetoothDevice device, BluetoothGattCharacteristic characteristic, boolean confirm) { throw new RuntimeException("Stub!"); }
/* 29 */   public boolean addService(BluetoothGattService service) { throw new RuntimeException("Stub!"); }
/* 30 */   public boolean removeService(BluetoothGattService service) { throw new RuntimeException("Stub!"); }
/* 31 */   public void clearServices() { throw new RuntimeException("Stub!"); }
/* 32 */   public List<BluetoothGattService> getServices() { throw new RuntimeException("Stub!"); }
/* 33 */   public BluetoothGattService getService(UUID uuid) { throw new RuntimeException("Stub!"); }
/* 34 */   public int getConnectionState(BluetoothDevice device) { throw new RuntimeException("Stub!"); }
/* 35 */   public List<BluetoothDevice> getConnectedDevices() { throw new RuntimeException("Stub!"); }
/* 36 */   public List<BluetoothDevice> getDevicesMatchingConnectionStates(int[] states) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\bluetooth\BluetoothGattServer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */