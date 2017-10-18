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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class CallAudioState
/*    */   implements Parcelable
/*    */ {
/* 21 */   public CallAudioState(boolean muted, int route, int supportedRouteMask) { throw new RuntimeException("Stub!"); }
/* 22 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 23 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 24 */   public boolean isMuted() { throw new RuntimeException("Stub!"); }
/* 25 */   public int getRoute() { throw new RuntimeException("Stub!"); }
/* 26 */   public int getSupportedRouteMask() { throw new RuntimeException("Stub!"); }
/* 27 */   public static String audioRouteToString(int route) { throw new RuntimeException("Stub!"); }
/* 28 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 29 */   public void writeToParcel(Parcel destination, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 36 */   public static final Parcelable.Creator<CallAudioState> CREATOR = null;
/*    */   public static final int ROUTE_BLUETOOTH = 2;
/*    */   public static final int ROUTE_EARPIECE = 1;
/*    */   public static final int ROUTE_SPEAKER = 8;
/*    */   public static final int ROUTE_WIRED_HEADSET = 4;
/*    */   public static final int ROUTE_WIRED_OR_EARPIECE = 5;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\telecom\CallAudioState.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */