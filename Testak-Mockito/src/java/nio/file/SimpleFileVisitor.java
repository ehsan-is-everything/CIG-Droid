/*    */ package java.nio.file;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.nio.file.attribute.BasicFileAttributes;
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
/*    */ public class SimpleFileVisitor<T>
/*    */   implements FileVisitor<T>
/*    */ {
/* 30 */   protected SimpleFileVisitor() { throw new RuntimeException("Stub!"); }
/* 31 */   public FileVisitResult preVisitDirectory(T dir, BasicFileAttributes attrs) throws IOException { throw new RuntimeException("Stub!"); }
/* 32 */   public FileVisitResult visitFile(T file, BasicFileAttributes attrs) throws IOException { throw new RuntimeException("Stub!"); }
/* 33 */   public FileVisitResult visitFileFailed(T file, IOException exc) throws IOException { throw new RuntimeException("Stub!"); }
/* 34 */   public FileVisitResult postVisitDirectory(T dir, IOException exc) throws IOException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\nio\file\SimpleFileVisitor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */