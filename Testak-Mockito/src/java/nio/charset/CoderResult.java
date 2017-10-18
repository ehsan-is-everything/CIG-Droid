/*    */ package java.nio.charset;
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
/*    */ public class CoderResult
/*    */ {
/* 29 */   CoderResult() { throw new RuntimeException("Stub!"); }
/* 30 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 31 */   public boolean isUnderflow() { throw new RuntimeException("Stub!"); }
/* 32 */   public boolean isOverflow() { throw new RuntimeException("Stub!"); }
/* 33 */   public boolean isError() { throw new RuntimeException("Stub!"); }
/* 34 */   public boolean isMalformed() { throw new RuntimeException("Stub!"); }
/* 35 */   public boolean isUnmappable() { throw new RuntimeException("Stub!"); }
/* 36 */   public int length() { throw new RuntimeException("Stub!"); }
/* 37 */   public static CoderResult malformedForLength(int length) { throw new RuntimeException("Stub!"); }
/* 38 */   public static CoderResult unmappableForLength(int length) { throw new RuntimeException("Stub!"); }
/* 39 */   public void throwException() throws CharacterCodingException { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/* 42 */   public static final CoderResult UNDERFLOW = null; public static final CoderResult OVERFLOW = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\nio\charset\CoderResult.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */