/*    */ package android.service.carrier;
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
/*    */ public class CarrierIdentifier
/*    */   implements Parcelable
/*    */ {
/* 21 */   public CarrierIdentifier(String mcc, String mnc, String spn, String imsi, String gid1, String gid2) { throw new RuntimeException("Stub!"); }
/* 22 */   public String getMcc() { throw new RuntimeException("Stub!"); }
/* 23 */   public String getMnc() { throw new RuntimeException("Stub!"); }
/* 24 */   public String getSpn() { throw new RuntimeException("Stub!"); }
/* 25 */   public String getImsi() { throw new RuntimeException("Stub!"); }
/* 26 */   public String getGid1() { throw new RuntimeException("Stub!"); }
/* 27 */   public String getGid2() { throw new RuntimeException("Stub!"); }
/* 28 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 29 */   public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!"); }
/* 30 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */   
/* 32 */   public static final Parcelable.Creator<CarrierIdentifier> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\service\carrier\CarrierIdentifier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */