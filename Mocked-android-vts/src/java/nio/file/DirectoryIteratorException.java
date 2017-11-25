/*    */ package java.nio.file;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.util.ConcurrentModificationException;
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
/*    */ public final class DirectoryIteratorException
/*    */   extends ConcurrentModificationException
/*    */ {
/* 30 */   public DirectoryIteratorException(IOException cause) { throw new RuntimeException("Stub!"); }
/* 31 */   public IOException getCause() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\nio\file\DirectoryIteratorException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */