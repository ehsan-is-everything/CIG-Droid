/*    */ package android.telecom;
/*    */ 
/*    */ import android.net.Uri;
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
/*    */ public class GatewayInfo
/*    */   implements Parcelable
/*    */ {
/* 21 */   public GatewayInfo(String packageName, Uri gatewayUri, Uri originalAddress) { throw new RuntimeException("Stub!"); }
/* 22 */   public String getGatewayProviderPackageName() { throw new RuntimeException("Stub!"); }
/* 23 */   public Uri getGatewayAddress() { throw new RuntimeException("Stub!"); }
/* 24 */   public Uri getOriginalAddress() { throw new RuntimeException("Stub!"); }
/* 25 */   public boolean isEmpty() { throw new RuntimeException("Stub!"); }
/* 26 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 27 */   public void writeToParcel(Parcel destination, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/* 29 */   public static final Parcelable.Creator<GatewayInfo> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\telecom\GatewayInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */