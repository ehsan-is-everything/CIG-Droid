/*    */ package java.nio.file.spi;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.nio.file.Path;
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
/*    */ public abstract class FileTypeDetector
/*    */ {
/*    */   protected FileTypeDetector()
/*    */   {
/* 29 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract String probeContentType(Path paramPath)
/*    */     throws IOException;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\nio\file\spi\FileTypeDetector.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */