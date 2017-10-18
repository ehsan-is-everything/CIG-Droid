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
/*    */ public class NetworkInfo
/*    */   implements Parcelable
/*    */ {
/*    */   public static enum State
/*    */   {
/* 23 */     CONNECTED, 
/* 24 */     CONNECTING, 
/* 25 */     DISCONNECTED, 
/* 26 */     DISCONNECTING, 
/* 27 */     SUSPENDED, 
/* 28 */     UNKNOWN;
/*    */     
/*    */     private State() {} }
/*    */   
/* 32 */   public static enum DetailedState { AUTHENTICATING, 
/* 33 */     BLOCKED, 
/* 34 */     CAPTIVE_PORTAL_CHECK, 
/* 35 */     CONNECTED, 
/* 36 */     CONNECTING, 
/* 37 */     DISCONNECTED, 
/* 38 */     DISCONNECTING, 
/* 39 */     FAILED, 
/* 40 */     IDLE, 
/* 41 */     OBTAINING_IPADDR, 
/* 42 */     SCANNING, 
/* 43 */     SUSPENDED, 
/* 44 */     VERIFYING_POOR_LINK;
/*    */     private DetailedState() {} }
/* 46 */   NetworkInfo() { throw new RuntimeException("Stub!"); }
/* 47 */   public int getType() { throw new RuntimeException("Stub!"); }
/* 48 */   public int getSubtype() { throw new RuntimeException("Stub!"); }
/* 49 */   public String getTypeName() { throw new RuntimeException("Stub!"); }
/* 50 */   public String getSubtypeName() { throw new RuntimeException("Stub!"); }
/* 51 */   public boolean isConnectedOrConnecting() { throw new RuntimeException("Stub!"); }
/* 52 */   public boolean isConnected() { throw new RuntimeException("Stub!"); }
/* 53 */   public boolean isAvailable() { throw new RuntimeException("Stub!"); }
/* 54 */   public boolean isFailover() { throw new RuntimeException("Stub!"); }
/* 55 */   public boolean isRoaming() { throw new RuntimeException("Stub!"); }
/* 56 */   public State getState() { throw new RuntimeException("Stub!"); }
/* 57 */   public DetailedState getDetailedState() { throw new RuntimeException("Stub!"); }
/* 58 */   public String getReason() { throw new RuntimeException("Stub!"); }
/* 59 */   public String getExtraInfo() { throw new RuntimeException("Stub!"); }
/* 60 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 61 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 62 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/* 64 */   public static final Parcelable.Creator<NetworkInfo> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\net\NetworkInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */