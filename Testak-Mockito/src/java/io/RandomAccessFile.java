/*    */ package java.io;
/*    */ 
/*    */ import java.nio.channels.FileChannel;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class RandomAccessFile
/*    */   implements DataOutput, DataInput, Closeable
/*    */ {
/* 31 */   public RandomAccessFile(String name, String mode)
/* 31 */     throws FileNotFoundException { throw new RuntimeException("Stub!"); }
/* 32 */   public RandomAccessFile(File file, String mode) throws FileNotFoundException { throw new RuntimeException("Stub!"); }
/* 33 */   public final FileDescriptor getFD() throws IOException { throw new RuntimeException("Stub!"); }
/* 34 */   public final FileChannel getChannel() { throw new RuntimeException("Stub!"); }
/* 35 */   public int read() throws IOException { throw new RuntimeException("Stub!"); }
/* 36 */   public int read(byte[] b, int off, int len) throws IOException { throw new RuntimeException("Stub!"); }
/* 37 */   public int read(byte[] b) throws IOException { throw new RuntimeException("Stub!"); }
/* 38 */   public final void readFully(byte[] b) throws IOException { throw new RuntimeException("Stub!"); }
/* 39 */   public final void readFully(byte[] b, int off, int len) throws IOException { throw new RuntimeException("Stub!"); }
/* 40 */   public int skipBytes(int n) throws IOException { throw new RuntimeException("Stub!"); }
/* 41 */   public void write(int b) throws IOException { throw new RuntimeException("Stub!"); }
/* 42 */   public void write(byte[] b) throws IOException { throw new RuntimeException("Stub!"); }
/* 43 */   public void write(byte[] b, int off, int len) throws IOException { throw new RuntimeException("Stub!"); }
/* 44 */   public long getFilePointer() throws IOException { throw new RuntimeException("Stub!"); }
/* 45 */   public void seek(long offset) throws IOException { throw new RuntimeException("Stub!"); }
/* 46 */   public long length() throws IOException { throw new RuntimeException("Stub!"); }
/* 47 */   public void setLength(long newLength) throws IOException { throw new RuntimeException("Stub!"); }
/* 48 */   public void close() throws IOException { throw new RuntimeException("Stub!"); }
/* 49 */   public final boolean readBoolean() throws IOException { throw new RuntimeException("Stub!"); }
/* 50 */   public final byte readByte() throws IOException { throw new RuntimeException("Stub!"); }
/* 51 */   public final int readUnsignedByte() throws IOException { throw new RuntimeException("Stub!"); }
/* 52 */   public final short readShort() throws IOException { throw new RuntimeException("Stub!"); }
/* 53 */   public final int readUnsignedShort() throws IOException { throw new RuntimeException("Stub!"); }
/* 54 */   public final char readChar() throws IOException { throw new RuntimeException("Stub!"); }
/* 55 */   public final int readInt() throws IOException { throw new RuntimeException("Stub!"); }
/* 56 */   public final long readLong() throws IOException { throw new RuntimeException("Stub!"); }
/* 57 */   public final float readFloat() throws IOException { throw new RuntimeException("Stub!"); }
/* 58 */   public final double readDouble() throws IOException { throw new RuntimeException("Stub!"); }
/* 59 */   public final String readLine() throws IOException { throw new RuntimeException("Stub!"); }
/* 60 */   public final String readUTF() throws IOException { throw new RuntimeException("Stub!"); }
/* 61 */   public final void writeBoolean(boolean v) throws IOException { throw new RuntimeException("Stub!"); }
/* 62 */   public final void writeByte(int v) throws IOException { throw new RuntimeException("Stub!"); }
/* 63 */   public final void writeShort(int v) throws IOException { throw new RuntimeException("Stub!"); }
/* 64 */   public final void writeChar(int v) throws IOException { throw new RuntimeException("Stub!"); }
/* 65 */   public final void writeInt(int v) throws IOException { throw new RuntimeException("Stub!"); }
/* 66 */   public final void writeLong(long v) throws IOException { throw new RuntimeException("Stub!"); }
/* 67 */   public final void writeFloat(float v) throws IOException { throw new RuntimeException("Stub!"); }
/* 68 */   public final void writeDouble(double v) throws IOException { throw new RuntimeException("Stub!"); }
/*    */   
/* 70 */   public final void writeBytes(String s) throws IOException { throw new RuntimeException("Stub!"); }
/* 71 */   public final void writeChars(String s) throws IOException { throw new RuntimeException("Stub!"); }
/* 72 */   public final void writeUTF(String str) throws IOException { throw new RuntimeException("Stub!"); }
/* 73 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\io\RandomAccessFile.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */