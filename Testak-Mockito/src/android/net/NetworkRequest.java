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
/*    */ public class NetworkRequest
/*    */   implements Parcelable
/*    */ {
/*    */   public static class Builder
/*    */   {
/* 23 */     public Builder() { throw new RuntimeException("Stub!"); }
/* 24 */     public NetworkRequest build() { throw new RuntimeException("Stub!"); }
/* 25 */     public Builder addCapability(int capability) { throw new RuntimeException("Stub!"); }
/* 26 */     public Builder removeCapability(int capability) { throw new RuntimeException("Stub!"); }
/* 27 */     public Builder addTransportType(int transportType) { throw new RuntimeException("Stub!"); }
/* 28 */     public Builder removeTransportType(int transportType) { throw new RuntimeException("Stub!"); }
/* 29 */     public Builder setNetworkSpecifier(String networkSpecifier) { throw new RuntimeException("Stub!"); }
/* 30 */     public Builder setNetworkSpecifier(NetworkSpecifier networkSpecifier) { throw new RuntimeException("Stub!"); } }
/*    */   
/* 32 */   NetworkRequest() { throw new RuntimeException("Stub!"); }
/* 33 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 34 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 35 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 36 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 37 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/*    */   
/* 39 */   public static final Parcelable.Creator<NetworkRequest> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\net\NetworkRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */