/*    */ package android.telecom;
/*    */ 
/*    */ import android.net.Uri;
/*    */ import android.os.Bundle;
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
/*    */ public final class ConnectionRequest
/*    */   implements Parcelable
/*    */ {
/* 21 */   public ConnectionRequest(PhoneAccountHandle accountHandle, Uri handle, Bundle extras) { throw new RuntimeException("Stub!"); }
/* 22 */   public ConnectionRequest(PhoneAccountHandle accountHandle, Uri handle, Bundle extras, int videoState) { throw new RuntimeException("Stub!"); }
/* 23 */   public PhoneAccountHandle getAccountHandle() { throw new RuntimeException("Stub!"); }
/* 24 */   public Uri getAddress() { throw new RuntimeException("Stub!"); }
/* 25 */   public Bundle getExtras() { throw new RuntimeException("Stub!"); }
/* 26 */   public int getVideoState() { throw new RuntimeException("Stub!"); }
/* 27 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 28 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 29 */   public void writeToParcel(Parcel destination, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/* 31 */   public static final Parcelable.Creator<ConnectionRequest> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\telecom\ConnectionRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */