/*    */ package android.bluetooth;
/*    */ 
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
/*    */ public final class BluetoothA2dp
/*    */   implements BluetoothProfile
/*    */ {
/*    */   public static final String ACTION_CONNECTION_STATE_CHANGED = "android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED";
/*    */   public static final String ACTION_PLAYING_STATE_CHANGED = "android.bluetooth.a2dp.profile.action.PLAYING_STATE_CHANGED";
/*    */   public static final int STATE_NOT_PLAYING = 11;
/*    */   public static final int STATE_PLAYING = 10;
/*    */   
/* 21 */   BluetoothA2dp() { throw new RuntimeException("Stub!"); }
/* 22 */   public void finalize() { throw new RuntimeException("Stub!"); }
/* 23 */   public List<BluetoothDevice> getConnectedDevices() { throw new RuntimeException("Stub!"); }
/* 24 */   public List<BluetoothDevice> getDevicesMatchingConnectionStates(int[] states) { throw new RuntimeException("Stub!"); }
/* 25 */   public int getConnectionState(BluetoothDevice device) { throw new RuntimeException("Stub!"); }
/* 26 */   public boolean isA2dpPlaying(BluetoothDevice device) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\bluetooth\BluetoothA2dp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */