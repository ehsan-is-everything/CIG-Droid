/*    */ package android.companion;
/*    */ 
/*    */ import android.bluetooth.BluetoothDevice;
/*    */ import android.os.Parcel;
/*    */ import android.os.ParcelUuid;
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
/*    */ public final class BluetoothDeviceFilter
/*    */   implements DeviceFilter<BluetoothDevice>
/*    */ {
/*    */   public static final class Builder
/*    */   {
/* 23 */     public Builder() { throw new RuntimeException("Stub!"); }
/* 24 */     public Builder setNamePattern(Pattern regex) { throw new RuntimeException("Stub!"); }
/* 25 */     public Builder setAddress(String address) { throw new RuntimeException("Stub!"); }
/* 26 */     public Builder addServiceUuid(ParcelUuid serviceUuid, ParcelUuid serviceUuidMask) { throw new RuntimeException("Stub!"); }
/* 27 */     public BluetoothDeviceFilter build() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 29 */   BluetoothDeviceFilter() { throw new RuntimeException("Stub!"); }
/* 30 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 31 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/* 32 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 33 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/*    */   
/* 35 */   public static final Parcelable.Creator<BluetoothDeviceFilter> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\companion\BluetoothDeviceFilter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */