/*    */ package android.media.midi;
/*    */ 
/*    */ import android.os.Bundle;
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
/*    */ public final class MidiDeviceInfo
/*    */   implements Parcelable
/*    */ {
/*    */   public static final class PortInfo
/*    */   {
/*    */     public static final int TYPE_INPUT = 1;
/*    */     public static final int TYPE_OUTPUT = 2;
/*    */     
/* 23 */     PortInfo() { throw new RuntimeException("Stub!"); }
/* 24 */     public int getType() { throw new RuntimeException("Stub!"); }
/* 25 */     public int getPortNumber() { throw new RuntimeException("Stub!"); }
/* 26 */     public String getName() { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */ 
/* 30 */   MidiDeviceInfo() { throw new RuntimeException("Stub!"); }
/* 31 */   public int getType() { throw new RuntimeException("Stub!"); }
/* 32 */   public int getId() { throw new RuntimeException("Stub!"); }
/* 33 */   public int getInputPortCount() { throw new RuntimeException("Stub!"); }
/* 34 */   public int getOutputPortCount() { throw new RuntimeException("Stub!"); }
/* 35 */   public PortInfo[] getPorts() { throw new RuntimeException("Stub!"); }
/* 36 */   public Bundle getProperties() { throw new RuntimeException("Stub!"); }
/* 37 */   public boolean isPrivate() { throw new RuntimeException("Stub!"); }
/* 38 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/* 39 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 40 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 41 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 42 */   public void writeToParcel(Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
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
/* 54 */   public static final Parcelable.Creator<MidiDeviceInfo> CREATOR = null;
/*    */   public static final String PROPERTY_BLUETOOTH_DEVICE = "bluetooth_device";
/*    */   public static final String PROPERTY_MANUFACTURER = "manufacturer";
/*    */   public static final String PROPERTY_NAME = "name";
/*    */   public static final String PROPERTY_PRODUCT = "product";
/*    */   public static final String PROPERTY_SERIAL_NUMBER = "serial_number";
/*    */   public static final String PROPERTY_USB_DEVICE = "usb_device";
/*    */   public static final String PROPERTY_VERSION = "version";
/*    */   public static final int TYPE_BLUETOOTH = 3;
/*    */   public static final int TYPE_USB = 1;
/*    */   public static final int TYPE_VIRTUAL = 2;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\media\midi\MidiDeviceInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */