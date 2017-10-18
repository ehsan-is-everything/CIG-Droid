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
/*    */ public class UsbInterface
/*    */   implements Parcelable
/*    */ {
/* 21 */   UsbInterface() { throw new RuntimeException("Stub!"); }
/* 22 */   public int getId() { throw new RuntimeException("Stub!"); }
/* 23 */   public int getAlternateSetting() { throw new RuntimeException("Stub!"); }
/* 24 */   public String getName() { throw new RuntimeException("Stub!"); }
/* 25 */   public int getInterfaceClass() { throw new RuntimeException("Stub!"); }
/* 26 */   public int getInterfaceSubclass() { throw new RuntimeException("Stub!"); }
/* 27 */   public int getInterfaceProtocol() { throw new RuntimeException("Stub!"); }
/* 28 */   public int getEndpointCount() { throw new RuntimeException("Stub!"); }
/* 29 */   public UsbEndpoint getEndpoint(int index) { throw new RuntimeException("Stub!"); }
/* 30 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 31 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 32 */   public void writeToParcel(Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/* 34 */   public static final Parcelable.Creator<UsbInterface> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\hardware\usb\UsbInterface.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */