/*    */ package android.companion;
/*    */ 
/*    */ import android.net.wifi.ScanResult;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable.Creator;
/*    */ import java.util.regex.Pattern;
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
/*    */ public final class WifiDeviceFilter
/*    */   implements DeviceFilter<ScanResult>
/*    */ {
/*    */   public static final class Builder
/*    */   {
/* 23 */     public Builder() { throw new RuntimeException("Stub!"); }
/* 24 */     public Builder setNamePattern(Pattern regex) { throw new RuntimeException("Stub!"); }
/* 25 */     public WifiDeviceFilter build() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 27 */   WifiDeviceFilter() { throw new RuntimeException("Stub!"); }
/* 28 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/* 29 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 30 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 31 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/*    */   
/* 33 */   public static final Parcelable.Creator<WifiDeviceFilter> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\companion\WifiDeviceFilter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */