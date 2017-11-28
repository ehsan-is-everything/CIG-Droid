/*    */ package android.hardware.usb;
/*    */ 
/*    */ import android.app.PendingIntent;
/*    */ import android.os.ParcelFileDescriptor;
/*    */ import java.util.HashMap;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class UsbManager
/*    */ {
/*    */   public static final String ACTION_USB_ACCESSORY_ATTACHED = "android.hardware.usb.action.USB_ACCESSORY_ATTACHED";
/*    */   public static final String ACTION_USB_ACCESSORY_DETACHED = "android.hardware.usb.action.USB_ACCESSORY_DETACHED";
/*    */   public static final String ACTION_USB_DEVICE_ATTACHED = "android.hardware.usb.action.USB_DEVICE_ATTACHED";
/*    */   public static final String ACTION_USB_DEVICE_DETACHED = "android.hardware.usb.action.USB_DEVICE_DETACHED";
/*    */   public static final String EXTRA_ACCESSORY = "accessory";
/*    */   public static final String EXTRA_DEVICE = "device";
/*    */   public static final String EXTRA_PERMISSION_GRANTED = "permission";
/*    */   
/* 21 */   UsbManager() { throw new RuntimeException("Stub!"); }
/* 22 */   public HashMap<String, UsbDevice> getDeviceList() { throw new RuntimeException("Stub!"); }
/* 23 */   public UsbDeviceConnection openDevice(UsbDevice device) { throw new RuntimeException("Stub!"); }
/* 24 */   public UsbAccessory[] getAccessoryList() { throw new RuntimeException("Stub!"); }
/* 25 */   public ParcelFileDescriptor openAccessory(UsbAccessory accessory) { throw new RuntimeException("Stub!"); }
/* 26 */   public boolean hasPermission(UsbDevice device) { throw new RuntimeException("Stub!"); }
/* 27 */   public boolean hasPermission(UsbAccessory accessory) { throw new RuntimeException("Stub!"); }
/* 28 */   public void requestPermission(UsbDevice device, PendingIntent pi) { throw new RuntimeException("Stub!"); }
/* 29 */   public void requestPermission(UsbAccessory accessory, PendingIntent pi) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\hardware\usb\UsbManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */