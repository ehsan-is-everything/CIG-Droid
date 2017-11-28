/*    */ package android.net.wifi;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ScanResult
/*    */   implements Parcelable
/*    */ {
/*    */   public String BSSID;
/*    */   public static final int CHANNEL_WIDTH_160MHZ = 3;
/*    */   public static final int CHANNEL_WIDTH_20MHZ = 0;
/*    */   public static final int CHANNEL_WIDTH_40MHZ = 1;
/*    */   public static final int CHANNEL_WIDTH_80MHZ = 2;
/*    */   public static final int CHANNEL_WIDTH_80MHZ_PLUS_MHZ = 4;
/*    */   public String SSID;
/*    */   public String capabilities;
/*    */   
/* 21 */   ScanResult() { throw new RuntimeException("Stub!"); }
/* 22 */   public boolean is80211mcResponder() { throw new RuntimeException("Stub!"); }
/* 23 */   public boolean isPasspointNetwork() { throw new RuntimeException("Stub!"); }
/* 24 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 25 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 26 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public int centerFreq0;
/*    */   public int centerFreq1;
/*    */   public int channelWidth;
/*    */   public int frequency;
/*    */   public int level;
/*    */   public CharSequence operatorFriendlyName;
/*    */   public long timestamp;
/*    */   public CharSequence venueName;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\net\wifi\ScanResult.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */