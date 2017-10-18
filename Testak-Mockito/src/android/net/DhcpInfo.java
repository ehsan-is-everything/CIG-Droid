/*    */ package android.net;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class DhcpInfo
/*    */   implements Parcelable
/*    */ {
/*    */   public int dns1;
/*    */   public int dns2;
/*    */   public int gateway;
/*    */   public int ipAddress;
/*    */   public int leaseDuration;
/*    */   public int netmask;
/*    */   public int serverAddress;
/*    */   
/* 21 */   public DhcpInfo() { throw new RuntimeException("Stub!"); }
/* 22 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 23 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 24 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\net\DhcpInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */