/*    */ package android.companion;
/*    */ 
/*    */ import android.bluetooth.le.ScanFilter;
/*    */ import android.bluetooth.le.ScanResult;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable.Creator;
/*    */ import java.nio.ByteOrder;
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
/*    */ public final class BluetoothLeDeviceFilter
/*    */   implements DeviceFilter<ScanResult>
/*    */ {
/*    */   public static final class Builder
/*    */   {
/* 23 */     public Builder() { throw new RuntimeException("Stub!"); }
/* 24 */     public Builder setNamePattern(Pattern regex) { throw new RuntimeException("Stub!"); }
/* 25 */     public Builder setScanFilter(ScanFilter scanFilter) { throw new RuntimeException("Stub!"); }
/* 26 */     public Builder setRawDataFilter(byte[] rawDataFilter, byte[] rawDataFilterMask) { throw new RuntimeException("Stub!"); }
/* 27 */     public Builder setRenameFromBytes(String prefix, String suffix, int bytesFrom, int bytesLength, ByteOrder byteOrder) { throw new RuntimeException("Stub!"); }
/* 28 */     public Builder setRenameFromName(String prefix, String suffix, int nameFrom, int nameLength) { throw new RuntimeException("Stub!"); }
/* 29 */     public BluetoothLeDeviceFilter build() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 31 */   BluetoothLeDeviceFilter() { throw new RuntimeException("Stub!"); }
/* 32 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/* 33 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 34 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 35 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 36 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 37 */   public static int getRenamePrefixLengthLimit() { throw new RuntimeException("Stub!"); }
/*    */   
/* 39 */   public static final Parcelable.Creator<BluetoothLeDeviceFilter> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\companion\BluetoothLeDeviceFilter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */