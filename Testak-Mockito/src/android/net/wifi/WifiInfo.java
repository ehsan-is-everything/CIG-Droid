/*    */ package android.net.wifi;
/*    */ 
/*    */ import android.net.NetworkInfo.DetailedState;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class WifiInfo
/*    */   implements Parcelable
/*    */ {
/*    */   public static final String FREQUENCY_UNITS = "MHz";
/*    */   public static final String LINK_SPEED_UNITS = "Mbps";
/*    */   
/* 21 */   WifiInfo() { throw new RuntimeException("Stub!"); }
/* 22 */   public String getSSID() { throw new RuntimeException("Stub!"); }
/* 23 */   public String getBSSID() { throw new RuntimeException("Stub!"); }
/* 24 */   public int getRssi() { throw new RuntimeException("Stub!"); }
/* 25 */   public int getLinkSpeed() { throw new RuntimeException("Stub!"); }
/* 26 */   public int getFrequency() { throw new RuntimeException("Stub!"); }
/* 27 */   public String getMacAddress() { throw new RuntimeException("Stub!"); }
/* 28 */   public int getNetworkId() { throw new RuntimeException("Stub!"); }
/* 29 */   public SupplicantState getSupplicantState() { throw new RuntimeException("Stub!"); }
/* 30 */   public int getIpAddress() { throw new RuntimeException("Stub!"); }
/* 31 */   public boolean getHiddenSSID() { throw new RuntimeException("Stub!"); }
/* 32 */   public static NetworkInfo.DetailedState getDetailedStateOf(SupplicantState suppState) { throw new RuntimeException("Stub!"); }
/* 33 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 34 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 35 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\net\wifi\WifiInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */