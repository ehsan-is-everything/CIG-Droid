/*    */ package android.hardware.usb;
/*    */ 
/*    */ import java.util.concurrent.TimeoutException;
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
/*    */ public class UsbDeviceConnection
/*    */ {
/* 20 */   UsbDeviceConnection() { throw new RuntimeException("Stub!"); }
/* 21 */   public void close() { throw new RuntimeException("Stub!"); }
/* 22 */   public int getFileDescriptor() { throw new RuntimeException("Stub!"); }
/* 23 */   public byte[] getRawDescriptors() { throw new RuntimeException("Stub!"); }
/* 24 */   public boolean claimInterface(UsbInterface intf, boolean force) { throw new RuntimeException("Stub!"); }
/* 25 */   public boolean releaseInterface(UsbInterface intf) { throw new RuntimeException("Stub!"); }
/* 26 */   public boolean setInterface(UsbInterface intf) { throw new RuntimeException("Stub!"); }
/* 27 */   public boolean setConfiguration(UsbConfiguration configuration) { throw new RuntimeException("Stub!"); }
/* 28 */   public int controlTransfer(int requestType, int request, int value, int index, byte[] buffer, int length, int timeout) { throw new RuntimeException("Stub!"); }
/* 29 */   public int controlTransfer(int requestType, int request, int value, int index, byte[] buffer, int offset, int length, int timeout) { throw new RuntimeException("Stub!"); }
/* 30 */   public int bulkTransfer(UsbEndpoint endpoint, byte[] buffer, int length, int timeout) { throw new RuntimeException("Stub!"); }
/* 31 */   public int bulkTransfer(UsbEndpoint endpoint, byte[] buffer, int offset, int length, int timeout) { throw new RuntimeException("Stub!"); }
/* 32 */   public UsbRequest requestWait() { throw new RuntimeException("Stub!"); }
/* 33 */   public UsbRequest requestWait(long timeout) throws TimeoutException { throw new RuntimeException("Stub!"); }
/* 34 */   public String getSerial() { throw new RuntimeException("Stub!"); }
/* 35 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\hardware\usb\UsbDeviceConnection.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */