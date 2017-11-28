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
/*    */ public abstract class BluetoothGattCallback
/*    */ {
/* 20 */   public BluetoothGattCallback() { throw new RuntimeException("Stub!"); }
/* 21 */   public void onPhyUpdate(BluetoothGatt gatt, int txPhy, int rxPhy, int status) { throw new RuntimeException("Stub!"); }
/* 22 */   public void onPhyRead(BluetoothGatt gatt, int txPhy, int rxPhy, int status) { throw new RuntimeException("Stub!"); }
/* 23 */   public void onConnectionStateChange(BluetoothGatt gatt, int status, int newState) { throw new RuntimeException("Stub!"); }
/* 24 */   public void onServicesDiscovered(BluetoothGatt gatt, int status) { throw new RuntimeException("Stub!"); }
/* 25 */   public void onCharacteristicRead(BluetoothGatt gatt, BluetoothGattCharacteristic characteristic, int status) { throw new RuntimeException("Stub!"); }
/* 26 */   public void onCharacteristicWrite(BluetoothGatt gatt, BluetoothGattCharacteristic characteristic, int status) { throw new RuntimeException("Stub!"); }
/* 27 */   public void onCharacteristicChanged(BluetoothGatt gatt, BluetoothGattCharacteristic characteristic) { throw new RuntimeException("Stub!"); }
/* 28 */   public void onDescriptorRead(BluetoothGatt gatt, BluetoothGattDescriptor descriptor, int status) { throw new RuntimeException("Stub!"); }
/* 29 */   public void onDescriptorWrite(BluetoothGatt gatt, BluetoothGattDescriptor descriptor, int status) { throw new RuntimeException("Stub!"); }
/* 30 */   public void onReliableWriteCompleted(BluetoothGatt gatt, int status) { throw new RuntimeException("Stub!"); }
/* 31 */   public void onReadRemoteRssi(BluetoothGatt gatt, int rssi, int status) { throw new RuntimeException("Stub!"); }
/* 32 */   public void onMtuChanged(BluetoothGatt gatt, int mtu, int status) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\bluetooth\BluetoothGattCallback.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */