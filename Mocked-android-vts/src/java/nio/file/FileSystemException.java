/*    */ package java.nio.file;
/*    */ 
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
/*    */ public class FileSystemException
/*    */   extends IOException
/*    */ {
/* 30 */   public FileSystemException(String file) { throw new RuntimeException("Stub!"); }
/* 31 */   public FileSystemException(String file, String other, String reason) { throw new RuntimeException("Stub!"); }
/* 32 */   public String getFile() { throw new RuntimeException("Stub!"); }
/* 33 */   public String getOtherFile() { throw new RuntimeException("Stub!"); }
/* 34 */   public String getReason() { throw new RuntimeException("Stub!"); }
/* 35 */   public String getMessage() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\nio\file\FileSystemException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */