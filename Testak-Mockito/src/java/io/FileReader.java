/*    */ package java.io;
/*    */ 
/*    */ import java.nio.charset.CharsetDecoder;
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
/*    */ public class FileReader
/*    */   extends InputStreamReader
/*    */ {
/*    */   public FileReader(String fileName)
/*    */     throws FileNotFoundException
/*    */   {
/* 30 */     super((InputStream)null, (CharsetDecoder)null);throw new RuntimeException("Stub!"); }
/* 31 */   public FileReader(File file) throws FileNotFoundException { super((InputStream)null, (CharsetDecoder)null);throw new RuntimeException("Stub!"); }
/* 32 */   public FileReader(FileDescriptor fd) { super((InputStream)null, (CharsetDecoder)null);throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\io\FileReader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */