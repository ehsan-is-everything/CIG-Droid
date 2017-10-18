/*    */ package android.net.wifi.p2p;
/*    */ 
/*    */ import android.net.wifi.WpsInfo;
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
/*    */ 
/*    */ 
/*    */ public class WifiP2pConfig
/*    */   implements Parcelable
/*    */ {
/* 21 */   public WifiP2pConfig() { throw new RuntimeException("Stub!"); }
/* 22 */   public WifiP2pConfig(WifiP2pConfig source) { throw new RuntimeException("Stub!"); }
/* 23 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 24 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 25 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 30 */   public static final Parcelable.Creator<WifiP2pConfig> CREATOR = null;
/*    */   public String deviceAddress;
/*    */   public int groupOwnerIntent;
/*    */   public WpsInfo wps;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\net\wifi\p2p\WifiP2pConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */