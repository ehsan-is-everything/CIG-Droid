/*    */ package android.net.wifi;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
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
/*    */ public enum SupplicantState
/*    */   implements Parcelable
/*    */ {
/* 21 */   ASSOCIATED, 
/* 22 */   ASSOCIATING, 
/* 23 */   AUTHENTICATING, 
/* 24 */   COMPLETED, 
/* 25 */   DISCONNECTED, 
/* 26 */   DORMANT, 
/* 27 */   FOUR_WAY_HANDSHAKE, 
/* 28 */   GROUP_HANDSHAKE, 
/* 29 */   INACTIVE, 
/* 30 */   INTERFACE_DISABLED, 
/* 31 */   INVALID, 
/* 32 */   SCANNING, 
/* 33 */   UNINITIALIZED;
/* 34 */   private SupplicantState() {} public static boolean isValidState(SupplicantState state) { throw new RuntimeException("Stub!"); }
/* 35 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 36 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\net\wifi\SupplicantState.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */