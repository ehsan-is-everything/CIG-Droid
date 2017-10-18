/*    */ package android.location;
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
/*    */ public final class GnssNavigationMessage
/*    */   implements Parcelable
/*    */ {
/*    */   public static abstract class Callback
/*    */   {
/*    */     public static final int STATUS_LOCATION_DISABLED = 2;
/*    */     public static final int STATUS_NOT_SUPPORTED = 0;
/*    */     public static final int STATUS_READY = 1;
/*    */     
/* 23 */     public Callback() { throw new RuntimeException("Stub!"); }
/* 24 */     public void onGnssNavigationMessageReceived(GnssNavigationMessage event) { throw new RuntimeException("Stub!"); }
/* 25 */     public void onStatusChanged(int status) { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */ 
/*    */ 
/* 30 */   GnssNavigationMessage() { throw new RuntimeException("Stub!"); }
/* 31 */   public int getType() { throw new RuntimeException("Stub!"); }
/* 32 */   public int getSvid() { throw new RuntimeException("Stub!"); }
/* 33 */   public int getMessageId() { throw new RuntimeException("Stub!"); }
/* 34 */   public int getSubmessageId() { throw new RuntimeException("Stub!"); }
/* 35 */   public byte[] getData() { throw new RuntimeException("Stub!"); }
/* 36 */   public int getStatus() { throw new RuntimeException("Stub!"); }
/* 37 */   public void writeToParcel(Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
/* 38 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 39 */   public String toString() { throw new RuntimeException("Stub!"); }
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
/* 54 */   public static final Parcelable.Creator<GnssNavigationMessage> CREATOR = null;
/*    */   public static final int STATUS_PARITY_PASSED = 1;
/*    */   public static final int STATUS_PARITY_REBUILT = 2;
/*    */   public static final int STATUS_UNKNOWN = 0;
/*    */   public static final int TYPE_BDS_D1 = 1281;
/*    */   public static final int TYPE_BDS_D2 = 1282;
/*    */   public static final int TYPE_GAL_F = 1538;
/*    */   public static final int TYPE_GAL_I = 1537;
/*    */   public static final int TYPE_GLO_L1CA = 769;
/*    */   public static final int TYPE_GPS_CNAV2 = 260;
/*    */   public static final int TYPE_GPS_L1CA = 257;
/*    */   public static final int TYPE_GPS_L2CNAV = 258;
/*    */   public static final int TYPE_GPS_L5CNAV = 259;
/*    */   public static final int TYPE_UNKNOWN = 0;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\location\GnssNavigationMessage.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */