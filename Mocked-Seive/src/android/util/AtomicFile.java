/*    */ package android.util;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.io.FileInputStream;
/*    */ import java.io.FileNotFoundException;
/*    */ import java.io.FileOutputStream;
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
/*    */ public class AtomicFile
/*    */ {
/* 20 */   public AtomicFile(File baseName) { throw new RuntimeException("Stub!"); }
/* 21 */   public File getBaseFile() { throw new RuntimeException("Stub!"); }
/* 22 */   public void delete() { throw new RuntimeException("Stub!"); }
/* 23 */   public FileOutputStream startWrite() throws IOException { throw new RuntimeException("Stub!"); }
/* 24 */   public void finishWrite(FileOutputStream str) { throw new RuntimeException("Stub!"); }
/* 25 */   public void failWrite(FileOutputStream str) { throw new RuntimeException("Stub!"); }
/* 26 */   public FileInputStream openRead() throws FileNotFoundException { throw new RuntimeException("Stub!"); }
/* 27 */   public byte[] readFully() throws IOException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\util\AtomicFile.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */