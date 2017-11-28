/*    */ package java.nio.channels;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.nio.ByteBuffer;
/*    */ import java.nio.MappedByteBuffer;
/*    */ import java.nio.channels.spi.AbstractInterruptibleChannel;
/*    */ import java.nio.file.OpenOption;
/*    */ import java.nio.file.Path;
/*    */ import java.nio.file.attribute.FileAttribute;
/*    */ import java.util.Set;
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
/*    */ public abstract class FileChannel
/*    */   extends AbstractInterruptibleChannel
/*    */   implements SeekableByteChannel, GatheringByteChannel, ScatteringByteChannel
/*    */ {
/*    */   public static class MapMode
/*    */   {
/* 33 */     MapMode() { throw new RuntimeException("Stub!"); }
/* 34 */     public String toString() { throw new RuntimeException("Stub!"); }
/*    */     
/*    */ 
/*    */ 
/* 38 */     public static final MapMode READ_WRITE = null; public static final MapMode READ_ONLY = null; public static final MapMode PRIVATE = null; }
/*    */   
/* 40 */   protected FileChannel() { throw new RuntimeException("Stub!"); }
/* 41 */   public static FileChannel open(Path path, Set<? extends OpenOption> options, FileAttribute<?>... attrs) throws IOException { throw new RuntimeException("Stub!"); }
/* 42 */   public static FileChannel open(Path path, OpenOption... options) throws IOException { throw new RuntimeException("Stub!"); }
/*    */   public abstract int read(ByteBuffer paramByteBuffer) throws IOException;
/*    */   public abstract long read(ByteBuffer[] paramArrayOfByteBuffer, int paramInt1, int paramInt2) throws IOException;
/* 45 */   public final long read(ByteBuffer[] dsts) throws IOException { throw new RuntimeException("Stub!"); }
/*    */   public abstract int write(ByteBuffer paramByteBuffer) throws IOException;
/*    */   public abstract long write(ByteBuffer[] paramArrayOfByteBuffer, int paramInt1, int paramInt2) throws IOException;
/* 48 */   public final long write(ByteBuffer[] srcs) throws IOException { throw new RuntimeException("Stub!"); }
/*    */   public abstract long position() throws IOException;
/*    */   public abstract FileChannel position(long paramLong) throws IOException;
/*    */   public abstract long size() throws IOException;
/*    */   public abstract FileChannel truncate(long paramLong) throws IOException;
/*    */   public abstract void force(boolean paramBoolean) throws IOException;
/*    */   public abstract long transferTo(long paramLong1, long paramLong2, WritableByteChannel paramWritableByteChannel) throws IOException;
/*    */   public abstract long transferFrom(ReadableByteChannel paramReadableByteChannel, long paramLong1, long paramLong2) throws IOException;
/*    */   public abstract int read(ByteBuffer paramByteBuffer, long paramLong) throws IOException;
/*    */   public abstract int write(ByteBuffer paramByteBuffer, long paramLong) throws IOException;
/*    */   public abstract MappedByteBuffer map(MapMode paramMapMode, long paramLong1, long paramLong2) throws IOException;
/*    */   public abstract FileLock lock(long paramLong1, long paramLong2, boolean paramBoolean) throws IOException;
/* 60 */   public final FileLock lock() throws IOException { throw new RuntimeException("Stub!"); }
/*    */   public abstract FileLock tryLock(long paramLong1, long paramLong2, boolean paramBoolean) throws IOException;
/* 62 */   public final FileLock tryLock() throws IOException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\nio\channels\FileChannel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */