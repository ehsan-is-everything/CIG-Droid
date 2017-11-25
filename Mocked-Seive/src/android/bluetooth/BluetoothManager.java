/*    */ package android.bluetooth;
/*    */ 
/*    */ import android.content.Context;
/*    */ import java.util.List;
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
/*    */ public final class BluetoothManager
/*    */ {
/* 20 */   BluetoothManager() { throw new RuntimeException("Stub!"); }
/* 21 */   public BluetoothAdapter getAdapter() { throw new RuntimeException("Stub!"); }
/* 22 */   public int getConnectionState(BluetoothDevice device, int profile) { throw new RuntimeException("Stub!"); }
/* 23 */   public List<BluetoothDevice> getConnectedDevices(int profile) { throw new RuntimeException("Stub!"); }
/* 24 */   public List<BluetoothDevice> getDevicesMatchingConnectionStates(int profile, int[] states) { throw new RuntimeException("Stub!"); }
/* 25 */   public BluetoothGattServer openGattServer(Context context, BluetoothGattServerCallback callback) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\bluetooth\BluetoothManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */