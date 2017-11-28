/*    */ package android.hardware.usb;
/*    */ 
/*    */ import java.nio.ByteBuffer;
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
/*    */ public class UsbRequest
/*    */ {
/* 20 */   public UsbRequest() { throw new RuntimeException("Stub!"); }
/* 21 */   public boolean initialize(UsbDeviceConnection connection, UsbEndpoint endpoint) { throw new RuntimeException("Stub!"); }
/* 22 */   public void close() { throw new RuntimeException("Stub!"); }
/* 23 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }
/* 24 */   public UsbEndpoint getEndpoint() { throw new RuntimeException("Stub!"); }
/* 25 */   public Object getClientData() { throw new RuntimeException("Stub!"); }
/* 26 */   public void setClientData(Object data) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 28 */   public boolean queue(ByteBuffer buffer, int length) { throw new RuntimeException("Stub!"); }
/* 29 */   public boolean queue(ByteBuffer buffer) { throw new RuntimeException("Stub!"); }
/* 30 */   public boolean cancel() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\hardware\usb\UsbRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */