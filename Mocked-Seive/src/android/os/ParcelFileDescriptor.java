/*    */ package android.os;
/*    */ 
/*    */ import java.io.Closeable;
/*    */ import java.io.File;
/*    */ import java.io.FileDescriptor;
/*    */ import java.io.FileInputStream;
/*    */ import java.io.FileNotFoundException;
/*    */ import java.io.FileOutputStream;
/*    */ import java.io.IOException;
/*    */ import java.net.DatagramSocket;
/*    */ import java.net.Socket;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ParcelFileDescriptor
/*    */   implements Parcelable, Closeable
/*    */ {
/*    */   public static class AutoCloseInputStream
/*    */     extends FileInputStream
/*    */   {
/*    */     public AutoCloseInputStream(ParcelFileDescriptor pfd)
/*    */     {
/* 24 */       super();throw new RuntimeException("Stub!"); }
/* 25 */     public void close() throws IOException { throw new RuntimeException("Stub!"); }
/* 26 */     public int read() throws IOException { throw new RuntimeException("Stub!"); }
/* 27 */     public int read(byte[] b) throws IOException { throw new RuntimeException("Stub!"); }
/* 28 */     public int read(byte[] b, int off, int len) throws IOException { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public static class AutoCloseOutputStream extends FileOutputStream {
/*    */     public AutoCloseOutputStream(ParcelFileDescriptor pfd) {
/* 33 */       super();throw new RuntimeException("Stub!"); }
/* 34 */     public void close() throws IOException { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public static abstract interface OnCloseListener {
/*    */     public abstract void onClose(IOException paramIOException);
/*    */   }
/*    */   
/*    */   public static class FileDescriptorDetachedException
/*    */     extends IOException {
/* 43 */     public FileDescriptorDetachedException() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 45 */   public ParcelFileDescriptor(ParcelFileDescriptor wrapped) { throw new RuntimeException("Stub!"); }
/* 46 */   public static ParcelFileDescriptor open(File file, int mode) throws FileNotFoundException { throw new RuntimeException("Stub!"); }
/* 47 */   public static ParcelFileDescriptor open(File file, int mode, Handler handler, OnCloseListener listener) throws IOException { throw new RuntimeException("Stub!"); }
/* 48 */   public static ParcelFileDescriptor dup(FileDescriptor orig) throws IOException { throw new RuntimeException("Stub!"); }
/* 49 */   public ParcelFileDescriptor dup() throws IOException { throw new RuntimeException("Stub!"); }
/* 50 */   public static ParcelFileDescriptor fromFd(int fd) throws IOException { throw new RuntimeException("Stub!"); }
/* 51 */   public static ParcelFileDescriptor adoptFd(int fd) { throw new RuntimeException("Stub!"); }
/* 52 */   public static ParcelFileDescriptor fromSocket(Socket socket) { throw new RuntimeException("Stub!"); }
/* 53 */   public static ParcelFileDescriptor fromDatagramSocket(DatagramSocket datagramSocket) { throw new RuntimeException("Stub!"); }
/* 54 */   public static ParcelFileDescriptor[] createPipe() throws IOException { throw new RuntimeException("Stub!"); }
/* 55 */   public static ParcelFileDescriptor[] createReliablePipe() throws IOException { throw new RuntimeException("Stub!"); }
/* 56 */   public static ParcelFileDescriptor[] createSocketPair() throws IOException { throw new RuntimeException("Stub!"); }
/* 57 */   public static ParcelFileDescriptor[] createReliableSocketPair() throws IOException { throw new RuntimeException("Stub!"); }
/* 58 */   public static int parseMode(String mode) { throw new RuntimeException("Stub!"); }
/* 59 */   public FileDescriptor getFileDescriptor() { throw new RuntimeException("Stub!"); }
/* 60 */   public long getStatSize() { throw new RuntimeException("Stub!"); }
/* 61 */   public int getFd() { throw new RuntimeException("Stub!"); }
/* 62 */   public int detachFd() { throw new RuntimeException("Stub!"); }
/* 63 */   public void close() throws IOException { throw new RuntimeException("Stub!"); }
/* 64 */   public void closeWithError(String msg) throws IOException { throw new RuntimeException("Stub!"); }
/* 65 */   public boolean canDetectErrors() { throw new RuntimeException("Stub!"); }
/* 66 */   public void checkError() throws IOException { throw new RuntimeException("Stub!"); }
/* 67 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 68 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }
/* 69 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 70 */   public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!"); }
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
/* 82 */   public static final Parcelable.Creator<ParcelFileDescriptor> CREATOR = null;
/*    */   public static final int MODE_APPEND = 33554432;
/*    */   public static final int MODE_CREATE = 134217728;
/*    */   public static final int MODE_READ_ONLY = 268435456;
/*    */   public static final int MODE_READ_WRITE = 805306368;
/*    */   public static final int MODE_TRUNCATE = 67108864;
/*    */   @Deprecated
/*    */   public static final int MODE_WORLD_READABLE = 1;
/*    */   @Deprecated
/*    */   public static final int MODE_WORLD_WRITEABLE = 2;
/*    */   public static final int MODE_WRITE_ONLY = 536870912;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\os\ParcelFileDescriptor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */