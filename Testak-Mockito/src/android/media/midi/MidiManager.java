/*    */ package android.media.midi;
/*    */ 
/*    */ import android.bluetooth.BluetoothDevice;
/*    */ import android.os.Handler;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class MidiManager
/*    */ {
/*    */   public static abstract interface OnDeviceOpenedListener
/*    */   {
/*    */     public abstract void onDeviceOpened(MidiDevice paramMidiDevice);
/*    */   }
/*    */   
/*    */   public static class DeviceCallback
/*    */   {
/* 22 */     public DeviceCallback() { throw new RuntimeException("Stub!"); }
/* 23 */     public void onDeviceAdded(MidiDeviceInfo device) { throw new RuntimeException("Stub!"); }
/* 24 */     public void onDeviceRemoved(MidiDeviceInfo device) { throw new RuntimeException("Stub!"); }
/* 25 */     public void onDeviceStatusChanged(MidiDeviceStatus status) { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 31 */   MidiManager() { throw new RuntimeException("Stub!"); }
/* 32 */   public void registerDeviceCallback(DeviceCallback callback, Handler handler) { throw new RuntimeException("Stub!"); }
/* 33 */   public void unregisterDeviceCallback(DeviceCallback callback) { throw new RuntimeException("Stub!"); }
/* 34 */   public MidiDeviceInfo[] getDevices() { throw new RuntimeException("Stub!"); }
/* 35 */   public void openDevice(MidiDeviceInfo deviceInfo, OnDeviceOpenedListener listener, Handler handler) { throw new RuntimeException("Stub!"); }
/* 36 */   public void openBluetoothDevice(BluetoothDevice bluetoothDevice, OnDeviceOpenedListener listener, Handler handler) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\media\midi\MidiManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */