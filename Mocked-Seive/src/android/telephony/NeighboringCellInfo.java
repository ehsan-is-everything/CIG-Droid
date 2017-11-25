/*    */ package android.telephony;
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
/*    */ public class NeighboringCellInfo
/*    */   implements Parcelable
/*    */ {
/*    */   @Deprecated
/* 22 */   public NeighboringCellInfo() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 24 */   public NeighboringCellInfo(int rssi, int cid) { throw new RuntimeException("Stub!"); }
/* 25 */   public NeighboringCellInfo(int rssi, String location, int radioType) { throw new RuntimeException("Stub!"); }
/* 26 */   public NeighboringCellInfo(Parcel in) { throw new RuntimeException("Stub!"); }
/* 27 */   public int getRssi() { throw new RuntimeException("Stub!"); }
/* 28 */   public int getLac() { throw new RuntimeException("Stub!"); }
/* 29 */   public int getCid() { throw new RuntimeException("Stub!"); }
/* 30 */   public int getPsc() { throw new RuntimeException("Stub!"); }
/* 31 */   public int getNetworkType() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 33 */   public void setCid(int cid) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 35 */   public void setRssi(int rssi) { throw new RuntimeException("Stub!"); }
/* 36 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 37 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 38 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/* 42 */   public static final Parcelable.Creator<NeighboringCellInfo> CREATOR = null;
/*    */   public static final int UNKNOWN_CID = -1;
/*    */   public static final int UNKNOWN_RSSI = 99;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\telephony\NeighboringCellInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */