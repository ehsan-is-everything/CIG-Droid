/*    */ package android.bluetooth;
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
/*    */ 
/*    */ 
/*    */ public abstract class BluetoothGattServerCallback
/*    */ {
/* 20 */   public BluetoothGattServerCallback() { throw new RuntimeException("Stub!"); }
/* 21 */   public void onConnectionStateChange(BluetoothDevice device, int status, int newState) { throw new RuntimeException("Stub!"); }
/* 22 */   public void onServiceAdded(int status, BluetoothGattService service) { throw new RuntimeException("Stub!"); }
/* 23 */   public void onCharacteristicReadRequest(BluetoothDevice device, int requestId, int offset, BluetoothGattCharacteristic characteristic) { throw new RuntimeException("Stub!"); }
/* 24 */   public void onCharacteristicWriteRequest(BluetoothDevice device, int requestId, BluetoothGattCharacteristic characteristic, boolean preparedWrite, boolean responseNeeded, int offset, byte[] value) { throw new RuntimeException("Stub!"); }
/* 25 */   public void onDescriptorReadRequest(BluetoothDevice device, int requestId, int offset, BluetoothGattDescriptor descriptor) { throw new RuntimeException("Stub!"); }
/* 26 */   public void onDescriptorWriteRequest(BluetoothDevice device, int requestId, BluetoothGattDescriptor descriptor, boolean preparedWrite, boolean responseNeeded, int offset, byte[] value) { throw new RuntimeException("Stub!"); }
/* 27 */   public void onExecuteWrite(BluetoothDevice device, int requestId, boolean execute) { throw new RuntimeException("Stub!"); }
/* 28 */   public void onNotificationSent(BluetoothDevice device, int status) { throw new RuntimeException("Stub!"); }
/* 29 */   public void onMtuChanged(BluetoothDevice device, int mtu) { throw new RuntimeException("Stub!"); }
/* 30 */   public void onPhyUpdate(BluetoothDevice device, int txPhy, int rxPhy, int status) { throw new RuntimeException("Stub!"); }
/* 31 */   public void onPhyRead(BluetoothDevice device, int txPhy, int rxPhy, int status) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\bluetooth\BluetoothGattServerCallback.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */