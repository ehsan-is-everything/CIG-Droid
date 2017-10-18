/*    */ package android.bluetooth;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import java.util.List;
/*    */ import java.util.UUID;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BluetoothGattService
/*    */   implements Parcelable
/*    */ {
/* 20 */   public BluetoothGattService(UUID uuid, int serviceType) { throw new RuntimeException("Stub!"); }
/* 21 */   public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!"); }
/* 22 */   public boolean addService(BluetoothGattService service) { throw new RuntimeException("Stub!"); }
/* 23 */   public boolean addCharacteristic(BluetoothGattCharacteristic characteristic) { throw new RuntimeException("Stub!"); }
/* 24 */   public UUID getUuid() { throw new RuntimeException("Stub!"); }
/* 25 */   public int getInstanceId() { throw new RuntimeException("Stub!"); }
/* 26 */   public int getType() { throw new RuntimeException("Stub!"); }
/* 27 */   public List<BluetoothGattService> getIncludedServices() { throw new RuntimeException("Stub!"); }
/* 28 */   public List<BluetoothGattCharacteristic> getCharacteristics() { throw new RuntimeException("Stub!"); }
/* 29 */   public BluetoothGattCharacteristic getCharacteristic(UUID uuid) { throw new RuntimeException("Stub!"); }
/* 30 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 36 */   public static final Parcelable.Creator<BluetoothGattService> CREATOR = null;
/*    */   public static final int SERVICE_TYPE_PRIMARY = 0;
/*    */   public static final int SERVICE_TYPE_SECONDARY = 1;
/*    */   protected List<BluetoothGattCharacteristic> mCharacteristics;
/*    */   protected List<BluetoothGattService> mIncludedServices;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\bluetooth\BluetoothGattService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */