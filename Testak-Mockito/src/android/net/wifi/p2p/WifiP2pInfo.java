/*    */ package android.net.wifi.p2p;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import java.net.InetAddress;
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
/*    */ public class WifiP2pInfo
/*    */   implements Parcelable
/*    */ {
/* 21 */   public WifiP2pInfo() { throw new RuntimeException("Stub!"); }
/* 22 */   public WifiP2pInfo(WifiP2pInfo source) { throw new RuntimeException("Stub!"); }
/* 23 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 24 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 25 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 30 */   public static final Parcelable.Creator<WifiP2pInfo> CREATOR = null;
/*    */   public boolean groupFormed;
/*    */   public InetAddress groupOwnerAddress;
/*    */   public boolean isGroupOwner;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\net\wifi\p2p\WifiP2pInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */