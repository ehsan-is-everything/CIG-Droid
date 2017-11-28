/*    */ package android.mtp;
/*    */ 
/*    */ import android.hardware.usb.UsbDevice;
/*    */ import android.hardware.usb.UsbDeviceConnection;
/*    */ import android.os.CancellationSignal;
/*    */ import android.os.ParcelFileDescriptor;
/*    */ import java.io.IOException;
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
/*    */ public final class MtpDevice
/*    */ {
/* 20 */   public MtpDevice(UsbDevice device) { throw new RuntimeException("Stub!"); }
/* 21 */   public boolean open(UsbDeviceConnection connection) { throw new RuntimeException("Stub!"); }
/* 22 */   public void close() { throw new RuntimeException("Stub!"); }
/* 23 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }
/* 24 */   public String getDeviceName() { throw new RuntimeException("Stub!"); }
/* 25 */   public int getDeviceId() { throw new RuntimeException("Stub!"); }
/* 26 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 27 */   public MtpDeviceInfo getDeviceInfo() { throw new RuntimeException("Stub!"); }
/* 28 */   public int[] getStorageIds() { throw new RuntimeException("Stub!"); }
/* 29 */   public int[] getObjectHandles(int storageId, int format, int objectHandle) { throw new RuntimeException("Stub!"); }
/* 30 */   public byte[] getObject(int objectHandle, int objectSize) { throw new RuntimeException("Stub!"); }
/* 31 */   public long getPartialObject(int objectHandle, long offset, long size, byte[] buffer) throws IOException { throw new RuntimeException("Stub!"); }
/* 32 */   public long getPartialObject64(int objectHandle, long offset, long size, byte[] buffer) throws IOException { throw new RuntimeException("Stub!"); }
/* 33 */   public byte[] getThumbnail(int objectHandle) { throw new RuntimeException("Stub!"); }
/* 34 */   public MtpStorageInfo getStorageInfo(int storageId) { throw new RuntimeException("Stub!"); }
/* 35 */   public MtpObjectInfo getObjectInfo(int objectHandle) { throw new RuntimeException("Stub!"); }
/* 36 */   public boolean deleteObject(int objectHandle) { throw new RuntimeException("Stub!"); }
/* 37 */   public long getParent(int objectHandle) { throw new RuntimeException("Stub!"); }
/* 38 */   public long getStorageId(int objectHandle) { throw new RuntimeException("Stub!"); }
/* 39 */   public boolean importFile(int objectHandle, String destPath) { throw new RuntimeException("Stub!"); }
/* 40 */   public boolean importFile(int objectHandle, ParcelFileDescriptor descriptor) { throw new RuntimeException("Stub!"); }
/* 41 */   public boolean sendObject(int objectHandle, long size, ParcelFileDescriptor descriptor) { throw new RuntimeException("Stub!"); }
/* 42 */   public MtpObjectInfo sendObjectInfo(MtpObjectInfo info) { throw new RuntimeException("Stub!"); }
/* 43 */   public MtpEvent readEvent(CancellationSignal signal) throws IOException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\mtp\MtpDevice.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */