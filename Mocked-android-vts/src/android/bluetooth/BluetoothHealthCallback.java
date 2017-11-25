/*    */ package android.bluetooth;
/*    */ 
/*    */ import android.os.ParcelFileDescriptor;
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
/*    */ public abstract class BluetoothHealthCallback
/*    */ {
/* 21 */   public BluetoothHealthCallback() { throw new RuntimeException("Stub!"); }
/* 22 */   public void onHealthAppConfigurationStatusChange(BluetoothHealthAppConfiguration config, int status) { throw new RuntimeException("Stub!"); }
/* 23 */   public void onHealthChannelStateChange(BluetoothHealthAppConfiguration config, BluetoothDevice device, int prevState, int newState, ParcelFileDescriptor fd, int channelId) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\bluetooth\BluetoothHealthCallback.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */