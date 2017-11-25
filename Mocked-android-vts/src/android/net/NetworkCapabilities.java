/*    */ package android.net;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class NetworkCapabilities
/*    */   implements Parcelable
/*    */ {
/* 21 */   public NetworkCapabilities(NetworkCapabilities nc) { throw new RuntimeException("Stub!"); }
/* 22 */   public boolean hasCapability(int capability) { throw new RuntimeException("Stub!"); }
/* 23 */   public boolean hasTransport(int transportType) { throw new RuntimeException("Stub!"); }
/* 24 */   public int getLinkUpstreamBandwidthKbps() { throw new RuntimeException("Stub!"); }
/* 25 */   public int getLinkDownstreamBandwidthKbps() { throw new RuntimeException("Stub!"); }
/* 26 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 27 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 28 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 29 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 30 */   public String toString() { throw new RuntimeException("Stub!"); }
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
/* 56 */   public static final Parcelable.Creator<NetworkCapabilities> CREATOR = null;
/*    */   public static final int NET_CAPABILITY_CAPTIVE_PORTAL = 17;
/*    */   public static final int NET_CAPABILITY_CBS = 5;
/*    */   public static final int NET_CAPABILITY_DUN = 2;
/*    */   public static final int NET_CAPABILITY_EIMS = 10;
/*    */   public static final int NET_CAPABILITY_FOTA = 3;
/*    */   public static final int NET_CAPABILITY_IA = 7;
/*    */   public static final int NET_CAPABILITY_IMS = 4;
/*    */   public static final int NET_CAPABILITY_INTERNET = 12;
/*    */   public static final int NET_CAPABILITY_MMS = 0;
/*    */   public static final int NET_CAPABILITY_NOT_METERED = 11;
/*    */   public static final int NET_CAPABILITY_NOT_RESTRICTED = 13;
/*    */   public static final int NET_CAPABILITY_NOT_VPN = 15;
/*    */   public static final int NET_CAPABILITY_RCS = 8;
/*    */   public static final int NET_CAPABILITY_SUPL = 1;
/*    */   public static final int NET_CAPABILITY_TRUSTED = 14;
/*    */   public static final int NET_CAPABILITY_VALIDATED = 16;
/*    */   public static final int NET_CAPABILITY_WIFI_P2P = 6;
/*    */   public static final int NET_CAPABILITY_XCAP = 9;
/*    */   public static final int TRANSPORT_BLUETOOTH = 2;
/*    */   public static final int TRANSPORT_CELLULAR = 0;
/*    */   public static final int TRANSPORT_ETHERNET = 3;
/*    */   public static final int TRANSPORT_VPN = 4;
/*    */   public static final int TRANSPORT_WIFI = 1;
/*    */   public static final int TRANSPORT_WIFI_AWARE = 5;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\net\NetworkCapabilities.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */