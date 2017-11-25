/*    */ package android.net.wifi.p2p;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class WifiP2pDevice
/*    */   implements Parcelable
/*    */ {
/*    */   public static final int AVAILABLE = 3;
/*    */   public static final int CONNECTED = 0;
/*    */   
/* 21 */   public WifiP2pDevice() { throw new RuntimeException("Stub!"); }
/* 22 */   public WifiP2pDevice(WifiP2pDevice source) { throw new RuntimeException("Stub!"); }
/* 23 */   public boolean wpsPbcSupported() { throw new RuntimeException("Stub!"); }
/* 24 */   public boolean wpsKeypadSupported() { throw new RuntimeException("Stub!"); }
/* 25 */   public boolean wpsDisplaySupported() { throw new RuntimeException("Stub!"); }
/* 26 */   public boolean isServiceDiscoveryCapable() { throw new RuntimeException("Stub!"); }
/* 27 */   public boolean isGroupOwner() { throw new RuntimeException("Stub!"); }
/* 28 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 29 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 30 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 31 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
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
/* 43 */   public static final Parcelable.Creator<WifiP2pDevice> CREATOR = null;
/*    */   public static final int FAILED = 2;
/*    */   public static final int INVITED = 1;
/*    */   public static final int UNAVAILABLE = 4;
/*    */   public String deviceAddress;
/*    */   public String deviceName;
/*    */   public String primaryDeviceType;
/*    */   public String secondaryDeviceType;
/*    */   public int status;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\net\wifi\p2p\WifiP2pDevice.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */