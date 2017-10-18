/*    */ package java.io;
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
/*    */ 
/*    */ public class UncheckedIOException
/*    */   extends RuntimeException
/*    */ {
/* 29 */   public UncheckedIOException(String message, IOException cause) { throw new RuntimeException("Stub!"); }
/* 30 */   public UncheckedIOException(IOException cause) { throw new RuntimeException("Stub!"); }
/* 31 */   public IOException getCause() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\io\UncheckedIOException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */