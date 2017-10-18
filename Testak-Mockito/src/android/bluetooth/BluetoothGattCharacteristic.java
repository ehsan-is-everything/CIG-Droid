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
/*    */ public class BluetoothGattCharacteristic
/*    */   implements Parcelable
/*    */ {
/* 20 */   public BluetoothGattCharacteristic(UUID uuid, int properties, int permissions) { throw new RuntimeException("Stub!"); }
/* 21 */   public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!"); }
/* 22 */   public boolean addDescriptor(BluetoothGattDescriptor descriptor) { throw new RuntimeException("Stub!"); }
/* 23 */   public BluetoothGattService getService() { throw new RuntimeException("Stub!"); }
/* 24 */   public UUID getUuid() { throw new RuntimeException("Stub!"); }
/* 25 */   public int getInstanceId() { throw new RuntimeException("Stub!"); }
/* 26 */   public int getProperties() { throw new RuntimeException("Stub!"); }
/* 27 */   public int getPermissions() { throw new RuntimeException("Stub!"); }
/* 28 */   public int getWriteType() { throw new RuntimeException("Stub!"); }
/* 29 */   public void setWriteType(int writeType) { throw new RuntimeException("Stub!"); }
/* 30 */   public List<BluetoothGattDescriptor> getDescriptors() { throw new RuntimeException("Stub!"); }
/* 31 */   public BluetoothGattDescriptor getDescriptor(UUID uuid) { throw new RuntimeException("Stub!"); }
/* 32 */   public byte[] getValue() { throw new RuntimeException("Stub!"); }
/* 33 */   public Integer getIntValue(int formatType, int offset) { throw new RuntimeException("Stub!"); }
/* 34 */   public Float getFloatValue(int formatType, int offset) { throw new RuntimeException("Stub!"); }
/* 35 */   public String getStringValue(int offset) { throw new RuntimeException("Stub!"); }
/* 36 */   public boolean setValue(byte[] value) { throw new RuntimeException("Stub!"); }
/* 37 */   public boolean setValue(int value, int formatType, int offset) { throw new RuntimeException("Stub!"); }
/* 38 */   public boolean setValue(int mantissa, int exponent, int formatType, int offset) { throw new RuntimeException("Stub!"); }
/* 39 */   public boolean setValue(String value) { throw new RuntimeException("Stub!"); }
/* 40 */   public int describeContents() { throw new RuntimeException("Stub!"); }
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
/*    */ 
/* 70 */   public static final Parcelable.Creator<BluetoothGattCharacteristic> CREATOR = null;
/*    */   public static final int FORMAT_FLOAT = 52;
/*    */   public static final int FORMAT_SFLOAT = 50;
/*    */   public static final int FORMAT_SINT16 = 34;
/*    */   public static final int FORMAT_SINT32 = 36;
/*    */   public static final int FORMAT_SINT8 = 33;
/*    */   public static final int FORMAT_UINT16 = 18;
/*    */   public static final int FORMAT_UINT32 = 20;
/*    */   public static final int FORMAT_UINT8 = 17;
/*    */   public static final int PERMISSION_READ = 1;
/*    */   public static final int PERMISSION_READ_ENCRYPTED = 2;
/*    */   public static final int PERMISSION_READ_ENCRYPTED_MITM = 4;
/*    */   public static final int PERMISSION_WRITE = 16;
/*    */   public static final int PERMISSION_WRITE_ENCRYPTED = 32;
/*    */   public static final int PERMISSION_WRITE_ENCRYPTED_MITM = 64;
/*    */   public static final int PERMISSION_WRITE_SIGNED = 128;
/*    */   public static final int PERMISSION_WRITE_SIGNED_MITM = 256;
/*    */   public static final int PROPERTY_BROADCAST = 1;
/*    */   public static final int PROPERTY_EXTENDED_PROPS = 128;
/*    */   public static final int PROPERTY_INDICATE = 32;
/*    */   public static final int PROPERTY_NOTIFY = 16;
/*    */   public static final int PROPERTY_READ = 2;
/*    */   public static final int PROPERTY_SIGNED_WRITE = 64;
/*    */   public static final int PROPERTY_WRITE = 8;
/*    */   public static final int PROPERTY_WRITE_NO_RESPONSE = 4;
/*    */   public static final int WRITE_TYPE_DEFAULT = 2;
/*    */   public static final int WRITE_TYPE_NO_RESPONSE = 1;
/*    */   public static final int WRITE_TYPE_SIGNED = 4;
/*    */   protected List<BluetoothGattDescriptor> mDescriptors;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\bluetooth\BluetoothGattCharacteristic.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */