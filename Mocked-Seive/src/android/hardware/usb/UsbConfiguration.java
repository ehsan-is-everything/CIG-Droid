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
/*    */ public class UsbConfiguration
/*    */   implements Parcelable
/*    */ {
/* 21 */   UsbConfiguration() { throw new RuntimeException("Stub!"); }
/* 22 */   public int getId() { throw new RuntimeException("Stub!"); }
/* 23 */   public String getName() { throw new RuntimeException("Stub!"); }
/* 24 */   public boolean isSelfPowered() { throw new RuntimeException("Stub!"); }
/* 25 */   public boolean isRemoteWakeup() { throw new RuntimeException("Stub!"); }
/* 26 */   public int getMaxPower() { throw new RuntimeException("Stub!"); }
/* 27 */   public int getInterfaceCount() { throw new RuntimeException("Stub!"); }
/* 28 */   public UsbInterface getInterface(int index) { throw new RuntimeException("Stub!"); }
/* 29 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 30 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 31 */   public void writeToParcel(Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/* 33 */   public static final Parcelable.Creator<UsbConfiguration> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\hardware\usb\UsbConfiguration.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */