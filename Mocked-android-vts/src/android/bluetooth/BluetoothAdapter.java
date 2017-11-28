/*    */ package android.bluetooth;
/*    */ 
/*    */ import android.content.Context;
/*    */ import java.util.UUID;
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class BluetoothAdapter
/*    */ {
/*    */   public static final String ACTION_CONNECTION_STATE_CHANGED = "android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED";
/*    */   public static final String ACTION_DISCOVERY_FINISHED = "android.bluetooth.adapter.action.DISCOVERY_FINISHED";
/*    */   public static final String ACTION_DISCOVERY_STARTED = "android.bluetooth.adapter.action.DISCOVERY_STARTED";
/*    */   public static final String ACTION_LOCAL_NAME_CHANGED = "android.bluetooth.adapter.action.LOCAL_NAME_CHANGED";
/*    */   public static final String ACTION_REQUEST_DISCOVERABLE = "android.bluetooth.adapter.action.REQUEST_DISCOVERABLE";
/*    */   public static final String ACTION_REQUEST_ENABLE = "android.bluetooth.adapter.action.REQUEST_ENABLE";
/*    */   public static final String ACTION_SCAN_MODE_CHANGED = "android.bluetooth.adapter.action.SCAN_MODE_CHANGED";
/*    */   public static final String ACTION_STATE_CHANGED = "android.bluetooth.adapter.action.STATE_CHANGED";
/*    */   public static final int ERROR = Integer.MIN_VALUE;
/*    */   public static final String EXTRA_CONNECTION_STATE = "android.bluetooth.adapter.extra.CONNECTION_STATE";
/*    */   public static final String EXTRA_DISCOVERABLE_DURATION = "android.bluetooth.adapter.extra.DISCOVERABLE_DURATION";
/*    */   public static final String EXTRA_LOCAL_NAME = "android.bluetooth.adapter.extra.LOCAL_NAME";
/*    */   public static final String EXTRA_PREVIOUS_CONNECTION_STATE = "android.bluetooth.adapter.extra.PREVIOUS_CONNECTION_STATE";
/*    */   public static final String EXTRA_PREVIOUS_SCAN_MODE = "android.bluetooth.adapter.extra.PREVIOUS_SCAN_MODE";
/*    */   
/* 25 */   BluetoothAdapter() { throw new RuntimeException("Stub!"); }
/* 26 */   public static synchronized BluetoothAdapter getDefaultAdapter() { throw new RuntimeException("Stub!"); }
/* 27 */   public BluetoothDevice getRemoteDevice(String address) { throw new RuntimeException("Stub!"); }
/* 28 */   public BluetoothDevice getRemoteDevice(byte[] address) { throw new RuntimeException("Stub!"); }
/* 29 */   public android.bluetooth.le.BluetoothLeAdvertiser getBluetoothLeAdvertiser() { throw new RuntimeException("Stub!"); }
/* 30 */   public android.bluetooth.le.BluetoothLeScanner getBluetoothLeScanner() { throw new RuntimeException("Stub!"); }
/* 31 */   public boolean isEnabled() { throw new RuntimeException("Stub!"); }
/* 32 */   public int getState() { throw new RuntimeException("Stub!"); }
/* 33 */   public boolean enable() { throw new RuntimeException("Stub!"); }
/* 34 */   public boolean disable() { throw new RuntimeException("Stub!"); }
/* 35 */   public String getAddress() { throw new RuntimeException("Stub!"); }
/* 36 */   public String getName() { throw new RuntimeException("Stub!"); }
/* 37 */   public boolean setName(String name) { throw new RuntimeException("Stub!"); }
/* 38 */   public int getScanMode() { throw new RuntimeException("Stub!"); }
/* 39 */   public boolean startDiscovery() { throw new RuntimeException("Stub!"); }
/* 40 */   public boolean cancelDiscovery() { throw new RuntimeException("Stub!"); }
/* 41 */   public boolean isDiscovering() { throw new RuntimeException("Stub!"); }
/* 42 */   public boolean isMultipleAdvertisementSupported() { throw new RuntimeException("Stub!"); }
/* 43 */   public boolean isOffloadedFilteringSupported() { throw new RuntimeException("Stub!"); }
/* 44 */   public boolean isOffloadedScanBatchingSupported() { throw new RuntimeException("Stub!"); }
/* 45 */   public boolean isLe2MPhySupported() { throw new RuntimeException("Stub!"); }
/* 46 */   public boolean isLeCodedPhySupported() { throw new RuntimeException("Stub!"); }
/* 47 */   public boolean isLeExtendedAdvertisingSupported() { throw new RuntimeException("Stub!"); }
/* 48 */   public boolean isLePeriodicAdvertisingSupported() { throw new RuntimeException("Stub!"); }
/* 49 */   public int getLeMaximumAdvertisingDataLength() { throw new RuntimeException("Stub!"); }
/* 50 */   public java.util.Set<BluetoothDevice> getBondedDevices() { throw new RuntimeException("Stub!"); }
/* 51 */   public int getProfileConnectionState(int profile) { throw new RuntimeException("Stub!"); }
/* 52 */   public BluetoothServerSocket listenUsingRfcommWithServiceRecord(String name, UUID uuid) throws java.io.IOException { throw new RuntimeException("Stub!"); }
/* 53 */   public BluetoothServerSocket listenUsingInsecureRfcommWithServiceRecord(String name, UUID uuid) throws java.io.IOException { throw new RuntimeException("Stub!"); }
/* 54 */   public boolean getProfileProxy(Context context, BluetoothProfile.ServiceListener listener, int profile) { throw new RuntimeException("Stub!"); }
/* 55 */   public void closeProfileProxy(int profile, BluetoothProfile proxy) { throw new RuntimeException("Stub!"); }
/* 56 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }
/* 57 */   public static boolean checkBluetoothAddress(String address) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 59 */   public boolean startLeScan(LeScanCallback callback) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 61 */   public boolean startLeScan(UUID[] serviceUuids, LeScanCallback callback) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 63 */   public void stopLeScan(LeScanCallback callback) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static final String EXTRA_PREVIOUS_STATE = "android.bluetooth.adapter.extra.PREVIOUS_STATE";
/*    */   public static final String EXTRA_SCAN_MODE = "android.bluetooth.adapter.extra.SCAN_MODE";
/*    */   public static final String EXTRA_STATE = "android.bluetooth.adapter.extra.STATE";
/*    */   public static final int SCAN_MODE_CONNECTABLE = 21;
/*    */   public static final int SCAN_MODE_CONNECTABLE_DISCOVERABLE = 23;
/*    */   public static final int SCAN_MODE_NONE = 20;
/*    */   public static final int STATE_CONNECTED = 2;
/*    */   public static final int STATE_CONNECTING = 1;
/*    */   public static final int STATE_DISCONNECTED = 0;
/*    */   public static final int STATE_DISCONNECTING = 3;
/*    */   public static final int STATE_OFF = 10;
/*    */   public static final int STATE_ON = 12;
/*    */   public static final int STATE_TURNING_OFF = 13;
/*    */   public static final int STATE_TURNING_ON = 11;
/*    */   public static abstract interface LeScanCallback
/*    */   {
/*    */     public abstract void onLeScan(BluetoothDevice paramBluetoothDevice, int paramInt, byte[] paramArrayOfByte);
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\bluetooth\BluetoothAdapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */