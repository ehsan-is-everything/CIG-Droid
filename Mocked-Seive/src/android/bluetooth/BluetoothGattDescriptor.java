/*    */ package android.bluetooth;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
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
/*    */ 
/*    */ 
/*    */ public class BluetoothGattDescriptor
/*    */   implements Parcelable
/*    */ {
/* 21 */   public BluetoothGattDescriptor(UUID uuid, int permissions) { throw new RuntimeException("Stub!"); }
/* 22 */   public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!"); }
/* 23 */   public BluetoothGattCharacteristic getCharacteristic() { throw new RuntimeException("Stub!"); }
/* 24 */   public UUID getUuid() { throw new RuntimeException("Stub!"); }
/* 25 */   public int getPermissions() { throw new RuntimeException("Stub!"); }
/* 26 */   public byte[] getValue() { throw new RuntimeException("Stub!"); }
/* 27 */   public boolean setValue(byte[] value) { throw new RuntimeException("Stub!"); }
/* 28 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/*    */   
/* 30 */   public static final byte[] DISABLE_NOTIFICATION_VALUE = null;
/* 31 */   public static final byte[] ENABLE_INDICATION_VALUE = null;
/* 32 */   public static final byte[] ENABLE_NOTIFICATION_VALUE = null;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 41 */   public static final Parcelable.Creator<BluetoothGattDescriptor> CREATOR = null;
/*    */   public static final int PERMISSION_READ = 1;
/*    */   public static final int PERMISSION_READ_ENCRYPTED = 2;
/*    */   public static final int PERMISSION_READ_ENCRYPTED_MITM = 4;
/*    */   public static final int PERMISSION_WRITE = 16;
/*    */   public static final int PERMISSION_WRITE_ENCRYPTED = 32;
/*    */   public static final int PERMISSION_WRITE_ENCRYPTED_MITM = 64;
/*    */   public static final int PERMISSION_WRITE_SIGNED = 128;
/*    */   public static final int PERMISSION_WRITE_SIGNED_MITM = 256;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\bluetooth\BluetoothGattDescriptor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */