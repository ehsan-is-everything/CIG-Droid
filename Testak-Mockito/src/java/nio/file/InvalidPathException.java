/*    */ package java.nio.file;
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
/*    */ 
/*    */ public class InvalidPathException
/*    */   extends IllegalArgumentException
/*    */ {
/* 30 */   public InvalidPathException(String input, String reason, int index) { throw new RuntimeException("Stub!"); }
/* 31 */   public InvalidPathException(String input, String reason) { throw new RuntimeException("Stub!"); }
/* 32 */   public String getInput() { throw new RuntimeException("Stub!"); }
/* 33 */   public String getReason() { throw new RuntimeException("Stub!"); }
/* 34 */   public int getIndex() { throw new RuntimeException("Stub!"); }
/* 35 */   public String getMessage() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\nio\file\InvalidPathException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */