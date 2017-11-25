/*    */ package android.bluetooth;
/*    */ 
/*    */ import android.content.Context;
/*    */ 
/*    */ public final class BluetoothDevice
/*    */   implements android.os.Parcelable
/*    */ {
/*    */   public static final String ACTION_ACL_CONNECTED = "android.bluetooth.device.action.ACL_CONNECTED";
/*    */   public static final String ACTION_ACL_DISCONNECTED = "android.bluetooth.device.action.ACL_DISCONNECTED";
/*    */   public static final String ACTION_ACL_DISCONNECT_REQUESTED = "android.bluetooth.device.action.ACL_DISCONNECT_REQUESTED";
/*    */   public static final String ACTION_BOND_STATE_CHANGED = "android.bluetooth.device.action.BOND_STATE_CHANGED";
/*    */   public static final String ACTION_CLASS_CHANGED = "android.bluetooth.device.action.CLASS_CHANGED";
/*    */   public static final String ACTION_FOUND = "android.bluetooth.device.action.FOUND";
/*    */   public static final String ACTION_NAME_CHANGED = "android.bluetooth.device.action.NAME_CHANGED";
/*    */   public static final String ACTION_PAIRING_REQUEST = "android.bluetooth.device.action.PAIRING_REQUEST";
/*    */   public static final String ACTION_UUID = "android.bluetooth.device.action.UUID";
/*    */   public static final int BOND_BONDED = 12;
/*    */   public static final int BOND_BONDING = 11;
/*    */   public static final int BOND_NONE = 10;
/*    */   
/* 21 */   BluetoothDevice() { throw new RuntimeException("Stub!"); }
/* 22 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/* 23 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 24 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 25 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 26 */   public void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
/* 27 */   public String getAddress() { throw new RuntimeException("Stub!"); }
/* 28 */   public String getName() { throw new RuntimeException("Stub!"); }
/* 29 */   public int getType() { throw new RuntimeException("Stub!"); }
/* 30 */   public boolean createBond() { throw new RuntimeException("Stub!"); }
/* 31 */   public int getBondState() { throw new RuntimeException("Stub!"); }
/* 32 */   public BluetoothClass getBluetoothClass() { throw new RuntimeException("Stub!"); }
/* 33 */   public android.os.ParcelUuid[] getUuids() { throw new RuntimeException("Stub!"); }
/* 34 */   public boolean fetchUuidsWithSdp() { throw new RuntimeException("Stub!"); }
/* 35 */   public boolean setPin(byte[] pin) { throw new RuntimeException("Stub!"); }
/* 36 */   public boolean setPairingConfirmation(boolean confirm) { throw new RuntimeException("Stub!"); }
/* 37 */   public BluetoothSocket createRfcommSocketToServiceRecord(java.util.UUID uuid) throws java.io.IOException { throw new RuntimeException("Stub!"); }
/* 38 */   public BluetoothSocket createInsecureRfcommSocketToServiceRecord(java.util.UUID uuid) throws java.io.IOException { throw new RuntimeException("Stub!"); }
/* 39 */   public BluetoothGatt connectGatt(Context context, boolean autoConnect, BluetoothGattCallback callback) { throw new RuntimeException("Stub!"); }
/* 40 */   public BluetoothGatt connectGatt(Context context, boolean autoConnect, BluetoothGattCallback callback, int transport) { throw new RuntimeException("Stub!"); }
/* 41 */   public BluetoothGatt connectGatt(Context context, boolean autoConnect, BluetoothGattCallback callback, int transport, int phy) { throw new RuntimeException("Stub!"); }
/* 42 */   public BluetoothGatt connectGatt(Context context, boolean autoConnect, BluetoothGattCallback callback, int transport, int phy, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 84 */   public static final android.os.Parcelable.Creator<BluetoothDevice> CREATOR = null;
/*    */   public static final int DEVICE_TYPE_CLASSIC = 1;
/*    */   public static final int DEVICE_TYPE_DUAL = 3;
/*    */   public static final int DEVICE_TYPE_LE = 2;
/*    */   public static final int DEVICE_TYPE_UNKNOWN = 0;
/*    */   public static final int ERROR = Integer.MIN_VALUE;
/*    */   public static final String EXTRA_BOND_STATE = "android.bluetooth.device.extra.BOND_STATE";
/*    */   public static final String EXTRA_CLASS = "android.bluetooth.device.extra.CLASS";
/*    */   public static final String EXTRA_DEVICE = "android.bluetooth.device.extra.DEVICE";
/*    */   public static final String EXTRA_NAME = "android.bluetooth.device.extra.NAME";
/*    */   public static final String EXTRA_PAIRING_KEY = "android.bluetooth.device.extra.PAIRING_KEY";
/*    */   public static final String EXTRA_PAIRING_VARIANT = "android.bluetooth.device.extra.PAIRING_VARIANT";
/*    */   public static final String EXTRA_PREVIOUS_BOND_STATE = "android.bluetooth.device.extra.PREVIOUS_BOND_STATE";
/*    */   public static final String EXTRA_RSSI = "android.bluetooth.device.extra.RSSI";
/*    */   public static final String EXTRA_UUID = "android.bluetooth.device.extra.UUID";
/*    */   public static final int PAIRING_VARIANT_PASSKEY_CONFIRMATION = 2;
/*    */   public static final int PAIRING_VARIANT_PIN = 0;
/*    */   public static final int PHY_LE_1M = 1;
/*    */   public static final int PHY_LE_1M_MASK = 1;
/*    */   public static final int PHY_LE_2M = 2;
/*    */   public static final int PHY_LE_2M_MASK = 2;
/*    */   public static final int PHY_LE_CODED = 3;
/*    */   public static final int PHY_LE_CODED_MASK = 4;
/*    */   public static final int PHY_OPTION_NO_PREFERRED = 0;
/*    */   public static final int PHY_OPTION_S2 = 1;
/*    */   public static final int PHY_OPTION_S8 = 2;
/*    */   public static final int TRANSPORT_AUTO = 0;
/*    */   public static final int TRANSPORT_BREDR = 1;
/*    */   public static final int TRANSPORT_LE = 2;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\bluetooth\BluetoothDevice.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */