/*    */ package android.bluetooth.le;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.ParcelUuid;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import android.util.SparseArray;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class AdvertiseData
/*    */   implements Parcelable
/*    */ {
/*    */   public static final class Builder
/*    */   {
/* 23 */     public Builder() { throw new RuntimeException("Stub!"); }
/* 24 */     public Builder addServiceUuid(ParcelUuid serviceUuid) { throw new RuntimeException("Stub!"); }
/* 25 */     public Builder addServiceData(ParcelUuid serviceDataUuid, byte[] serviceData) { throw new RuntimeException("Stub!"); }
/* 26 */     public Builder addManufacturerData(int manufacturerId, byte[] manufacturerSpecificData) { throw new RuntimeException("Stub!"); }
/* 27 */     public Builder setIncludeTxPowerLevel(boolean includeTxPowerLevel) { throw new RuntimeException("Stub!"); }
/* 28 */     public Builder setIncludeDeviceName(boolean includeDeviceName) { throw new RuntimeException("Stub!"); }
/* 29 */     public AdvertiseData build() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 31 */   AdvertiseData() { throw new RuntimeException("Stub!"); }
/* 32 */   public List<ParcelUuid> getServiceUuids() { throw new RuntimeException("Stub!"); }
/* 33 */   public SparseArray<byte[]> getManufacturerSpecificData() { throw new RuntimeException("Stub!"); }
/* 34 */   public Map<ParcelUuid, byte[]> getServiceData() { throw new RuntimeException("Stub!"); }
/* 35 */   public boolean getIncludeTxPowerLevel() { throw new RuntimeException("Stub!"); }
/* 36 */   public boolean getIncludeDeviceName() { throw new RuntimeException("Stub!"); }
/* 37 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 38 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 39 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/* 41 */   public static final Parcelable.Creator<AdvertiseData> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\bluetooth\le\AdvertiseData.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */