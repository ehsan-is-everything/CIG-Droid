/*    */ package android.bluetooth;
/*    */ 
/*    */ import java.io.Closeable;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.OutputStream;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class BluetoothSocket
/*    */   implements Closeable
/*    */ {
/*    */   public static final int TYPE_L2CAP = 3;
/*    */   public static final int TYPE_RFCOMM = 1;
/*    */   public static final int TYPE_SCO = 2;
/*    */   
/* 21 */   BluetoothSocket() { throw new RuntimeException("Stub!"); }
/* 22 */   public BluetoothDevice getRemoteDevice() { throw new RuntimeException("Stub!"); }
/* 23 */   public InputStream getInputStream() throws IOException { throw new RuntimeException("Stub!"); }
/* 24 */   public OutputStream getOutputStream() throws IOException { throw new RuntimeException("Stub!"); }
/* 25 */   public boolean isConnected() { throw new RuntimeException("Stub!"); }
/* 26 */   public void connect() throws IOException { throw new RuntimeException("Stub!"); }
/* 27 */   public void close() throws IOException { throw new RuntimeException("Stub!"); }
/* 28 */   public int getMaxTransmitPacketSize() { throw new RuntimeException("Stub!"); }
/* 29 */   public int getMaxReceivePacketSize() { throw new RuntimeException("Stub!"); }
/* 30 */   public int getConnectionType() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\bluetooth\BluetoothSocket.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */