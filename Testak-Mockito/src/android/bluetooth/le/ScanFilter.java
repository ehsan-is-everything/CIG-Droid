/*    */ package android.bluetooth.le;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.ParcelUuid;
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
/*    */ public final class ScanFilter
/*    */   implements Parcelable
/*    */ {
/*    */   public static final class Builder
/*    */   {
/* 23 */     public Builder() { throw new RuntimeException("Stub!"); }
/* 24 */     public Builder setDeviceName(String deviceName) { throw new RuntimeException("Stub!"); }
/* 25 */     public Builder setDeviceAddress(String deviceAddress) { throw new RuntimeException("Stub!"); }
/* 26 */     public Builder setServiceUuid(ParcelUuid serviceUuid) { throw new RuntimeException("Stub!"); }
/* 27 */     public Builder setServiceUuid(ParcelUuid serviceUuid, ParcelUuid uuidMask) { throw new RuntimeException("Stub!"); }
/* 28 */     public Builder setServiceData(ParcelUuid serviceDataUuid, byte[] serviceData) { throw new RuntimeException("Stub!"); }
/* 29 */     public Builder setServiceData(ParcelUuid serviceDataUuid, byte[] serviceData, byte[] serviceDataMask) { throw new RuntimeException("Stub!"); }
/* 30 */     public Builder setManufacturerData(int manufacturerId, byte[] manufacturerData) { throw new RuntimeException("Stub!"); }
/* 31 */     public Builder setManufacturerData(int manufacturerId, byte[] manufacturerData, byte[] manufacturerDataMask) { throw new RuntimeException("Stub!"); }
/* 32 */     public ScanFilter build() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 34 */   ScanFilter() { throw new RuntimeException("Stub!"); }
/* 35 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 36 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 37 */   public String getDeviceName() { throw new RuntimeException("Stub!"); }
/* 38 */   public ParcelUuid getServiceUuid() { throw new RuntimeException("Stub!"); }
/* 39 */   public ParcelUuid getServiceUuidMask() { throw new RuntimeException("Stub!"); }
/* 40 */   public String getDeviceAddress() { throw new RuntimeException("Stub!"); }
/* 41 */   public byte[] getServiceData() { throw new RuntimeException("Stub!"); }
/* 42 */   public byte[] getServiceDataMask() { throw new RuntimeException("Stub!"); }
/* 43 */   public ParcelUuid getServiceDataUuid() { throw new RuntimeException("Stub!"); }
/* 44 */   public int getManufacturerId() { throw new RuntimeException("Stub!"); }
/* 45 */   public byte[] getManufacturerData() { throw new RuntimeException("Stub!"); }
/* 46 */   public byte[] getManufacturerDataMask() { throw new RuntimeException("Stub!"); }
/* 47 */   public boolean matches(ScanResult scanResult) { throw new RuntimeException("Stub!"); }
/* 48 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 49 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 50 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/*    */   
/* 52 */   public static final Parcelable.Creator<ScanFilter> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\bluetooth\le\ScanFilter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */