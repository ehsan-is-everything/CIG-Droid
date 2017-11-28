/*    */ package android.net.wifi;
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
/*    */ public class WpsInfo
/*    */   implements Parcelable
/*    */ {
/*    */   public String BSSID;
/*    */   
/* 21 */   public WpsInfo() { throw new RuntimeException("Stub!"); }
/* 22 */   public WpsInfo(WpsInfo source) { throw new RuntimeException("Stub!"); }
/* 23 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 24 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 25 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 35 */   public static final Parcelable.Creator<WpsInfo> CREATOR = null;
/*    */   public static final int DISPLAY = 1;
/*    */   public static final int INVALID = 4;
/*    */   public static final int KEYPAD = 2;
/*    */   public static final int LABEL = 3;
/*    */   public static final int PBC = 0;
/*    */   public String pin;
/*    */   public int setup;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\net\wifi\WpsInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */