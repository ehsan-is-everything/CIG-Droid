/*    */ package android.content.res;
/*    */ 
/*    */ import android.os.Bundle;
/*    */ import android.os.Parcel;
/*    */ import android.os.ParcelFileDescriptor;
/*    */ import android.os.ParcelFileDescriptor.AutoCloseInputStream;
/*    */ import android.os.ParcelFileDescriptor.AutoCloseOutputStream;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import java.io.Closeable;
/*    */ import java.io.FileDescriptor;
/*    */ import java.io.FileInputStream;
/*    */ import java.io.FileOutputStream;
/*    */ import java.io.IOException;
/*    */ 
/*    */ public class AssetFileDescriptor
/*    */   implements Parcelable, Closeable
/*    */ {
/*    */   public static class AutoCloseInputStream
/*    */     extends ParcelFileDescriptor.AutoCloseInputStream
/*    */   {
/*    */     public AutoCloseInputStream(AssetFileDescriptor fd) throws IOException
/*    */     {
/* 24 */       super();throw new RuntimeException("Stub!"); }
/* 25 */     public int available() throws IOException { throw new RuntimeException("Stub!"); }
/* 26 */     public int read() throws IOException { throw new RuntimeException("Stub!"); }
/* 27 */     public int read(byte[] buffer, int offset, int count) throws IOException { throw new RuntimeException("Stub!"); }
/* 28 */     public int read(byte[] buffer) throws IOException { throw new RuntimeException("Stub!"); }
/* 29 */     public long skip(long count) throws IOException { throw new RuntimeException("Stub!"); }
/* 30 */     public void mark(int readlimit) { throw new RuntimeException("Stub!"); }
/* 31 */     public boolean markSupported() { throw new RuntimeException("Stub!"); }
/* 32 */     public synchronized void reset() throws IOException { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public static class AutoCloseOutputStream extends ParcelFileDescriptor.AutoCloseOutputStream {
/*    */     public AutoCloseOutputStream(AssetFileDescriptor fd) throws IOException {
/* 37 */       super();throw new RuntimeException("Stub!"); }
/* 38 */     public void write(byte[] buffer, int offset, int count) throws IOException { throw new RuntimeException("Stub!"); }
/* 39 */     public void write(byte[] buffer) throws IOException { throw new RuntimeException("Stub!"); }
/* 40 */     public void write(int oneByte) throws IOException { throw new RuntimeException("Stub!"); } }
/*    */   
/* 42 */   public AssetFileDescriptor(ParcelFileDescriptor fd, long startOffset, long length) { throw new RuntimeException("Stub!"); }
/* 43 */   public AssetFileDescriptor(ParcelFileDescriptor fd, long startOffset, long length, Bundle extras) { throw new RuntimeException("Stub!"); }
/* 44 */   public ParcelFileDescriptor getParcelFileDescriptor() { throw new RuntimeException("Stub!"); }
/* 45 */   public FileDescriptor getFileDescriptor() { throw new RuntimeException("Stub!"); }
/* 46 */   public long getStartOffset() { throw new RuntimeException("Stub!"); }
/* 47 */   public Bundle getExtras() { throw new RuntimeException("Stub!"); }
/* 48 */   public long getLength() { throw new RuntimeException("Stub!"); }
/* 49 */   public long getDeclaredLength() { throw new RuntimeException("Stub!"); }
/* 50 */   public void close() throws IOException { throw new RuntimeException("Stub!"); }
/* 51 */   public FileInputStream createInputStream() throws IOException { throw new RuntimeException("Stub!"); }
/* 52 */   public FileOutputStream createOutputStream() throws IOException { throw new RuntimeException("Stub!"); }
/* 53 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 54 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 55 */   public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/* 58 */   public static final Parcelable.Creator<AssetFileDescriptor> CREATOR = null;
/*    */   public static final long UNKNOWN_LENGTH = -1L;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\content\res\AssetFileDescriptor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */