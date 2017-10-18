/*    */ package android.hardware.usb;
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
/*    */ public class UsbDevice
/*    */   implements Parcelable
/*    */ {
/* 21 */   UsbDevice() { throw new RuntimeException("Stub!"); }
/* 22 */   public String getDeviceName() { throw new RuntimeException("Stub!"); }
/* 23 */   public String getManufacturerName() { throw new RuntimeException("Stub!"); }
/* 24 */   public String getProductName() { throw new RuntimeException("Stub!"); }
/* 25 */   public String getVersion() { throw new RuntimeException("Stub!"); }
/* 26 */   public String getSerialNumber() { throw new RuntimeException("Stub!"); }
/* 27 */   public int getDeviceId() { throw new RuntimeException("Stub!"); }
/* 28 */   public int getVendorId() { throw new RuntimeException("Stub!"); }
/* 29 */   public int getProductId() { throw new RuntimeException("Stub!"); }
/* 30 */   public int getDeviceClass() { throw new RuntimeException("Stub!"); }
/* 31 */   public int getDeviceSubclass() { throw new RuntimeException("Stub!"); }
/* 32 */   public int getDeviceProtocol() { throw new RuntimeException("Stub!"); }
/* 33 */   public int getConfigurationCount() { throw new RuntimeException("Stub!"); }
/* 34 */   public UsbConfiguration getConfiguration(int index) { throw new RuntimeException("Stub!"); }
/* 35 */   public int getInterfaceCount() { throw new RuntimeException("Stub!"); }
/* 36 */   public UsbInterface getInterface(int index) { throw new RuntimeException("Stub!"); }
/* 37 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/* 38 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 39 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 40 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 41 */   public void writeToParcel(Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
/* 42 */   public static int getDeviceId(String name) { throw new RuntimeException("Stub!"); }
/* 43 */   public static String getDeviceName(int id) { throw new RuntimeException("Stub!"); }
/*    */   
/* 45 */   public static final Parcelable.Creator<UsbDevice> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\hardware\usb\UsbDevice.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */