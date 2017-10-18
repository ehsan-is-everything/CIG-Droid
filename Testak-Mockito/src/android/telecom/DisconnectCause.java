/*    */ package android.telecom;
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
/*    */ public final class DisconnectCause
/*    */   implements Parcelable
/*    */ {
/*    */   public static final int ANSWERED_ELSEWHERE = 11;
/*    */   public static final int BUSY = 7;
/*    */   public static final int CALL_PULLED = 12;
/*    */   public static final int CANCELED = 4;
/*    */   public static final int CONNECTION_MANAGER_NOT_SUPPORTED = 10;
/*    */   
/* 21 */   public DisconnectCause(int code) { throw new RuntimeException("Stub!"); }
/* 22 */   public DisconnectCause(int code, String reason) { throw new RuntimeException("Stub!"); }
/* 23 */   public DisconnectCause(int code, CharSequence label, CharSequence description, String reason) { throw new RuntimeException("Stub!"); }
/* 24 */   public DisconnectCause(int code, CharSequence label, CharSequence description, String reason, int toneToPlay) { throw new RuntimeException("Stub!"); }
/* 25 */   public int getCode() { throw new RuntimeException("Stub!"); }
/* 26 */   public CharSequence getLabel() { throw new RuntimeException("Stub!"); }
/* 27 */   public CharSequence getDescription() { throw new RuntimeException("Stub!"); }
/* 28 */   public String getReason() { throw new RuntimeException("Stub!"); }
/* 29 */   public int getTone() { throw new RuntimeException("Stub!"); }
/* 30 */   public void writeToParcel(Parcel destination, int flags) { throw new RuntimeException("Stub!"); }
/* 31 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 32 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 33 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/* 34 */   public String toString() { throw new RuntimeException("Stub!"); }
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
/* 49 */   public static final Parcelable.Creator<DisconnectCause> CREATOR = null;
/*    */   public static final int ERROR = 1;
/*    */   public static final int LOCAL = 2;
/*    */   public static final int MISSED = 5;
/*    */   public static final int OTHER = 9;
/*    */   public static final int REJECTED = 6;
/*    */   public static final int REMOTE = 3;
/*    */   public static final int RESTRICTED = 8;
/*    */   public static final int UNKNOWN = 0;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\telecom\DisconnectCause.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */