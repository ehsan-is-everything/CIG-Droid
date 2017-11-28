/*    */ package android.os;
/*    */ 
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class MemoryFile
/*    */ {
/* 20 */   public MemoryFile(String name, int length)
/* 20 */     throws IOException { throw new RuntimeException("Stub!"); }
/* 21 */   public void close() { throw new RuntimeException("Stub!"); }
/* 22 */   protected void finalize() { throw new RuntimeException("Stub!"); }
/* 23 */   public int length() { throw new RuntimeException("Stub!"); }
/* 24 */   public boolean isPurgingAllowed() { throw new RuntimeException("Stub!"); }
/* 25 */   public synchronized boolean allowPurging(boolean allowPurging) throws IOException { throw new RuntimeException("Stub!"); }
/* 26 */   public InputStream getInputStream() { throw new RuntimeException("Stub!"); }
/* 27 */   public OutputStream getOutputStream() { throw new RuntimeException("Stub!"); }
/* 28 */   public int readBytes(byte[] buffer, int srcOffset, int destOffset, int count) throws IOException { throw new RuntimeException("Stub!"); }
/* 29 */   public void writeBytes(byte[] buffer, int srcOffset, int destOffset, int count) throws IOException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\os\MemoryFile.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */