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
/*    */ public class FileOutputStream
/*    */   extends OutputStream
/*    */ {
/* 31 */   public FileOutputStream(String name)
/* 31 */     throws FileNotFoundException { throw new RuntimeException("Stub!"); }
/* 32 */   public FileOutputStream(String name, boolean append) throws FileNotFoundException { throw new RuntimeException("Stub!"); }
/* 33 */   public FileOutputStream(File file) throws FileNotFoundException { throw new RuntimeException("Stub!"); }
/* 34 */   public FileOutputStream(File file, boolean append) throws FileNotFoundException { throw new RuntimeException("Stub!"); }
/* 35 */   public FileOutputStream(FileDescriptor fdObj) { throw new RuntimeException("Stub!"); }
/* 36 */   public void write(int b) throws IOException { throw new RuntimeException("Stub!"); }
/* 37 */   public void write(byte[] b) throws IOException { throw new RuntimeException("Stub!"); }
/* 38 */   public void write(byte[] b, int off, int len) throws IOException { throw new RuntimeException("Stub!"); }
/* 39 */   public void close() throws IOException { throw new RuntimeException("Stub!"); }
/* 40 */   public final FileDescriptor getFD() throws IOException { throw new RuntimeException("Stub!"); }
/* 41 */   public FileChannel getChannel() { throw new RuntimeException("Stub!"); }
/* 42 */   protected void finalize() throws IOException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\io\FileOutputStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */