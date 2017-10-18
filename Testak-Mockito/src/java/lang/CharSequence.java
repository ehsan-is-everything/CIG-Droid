/*    */ package java.lang;
/*    */ 
/*    */ import java.util.stream.IntStream;
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
/*    */ public abstract interface CharSequence
/*    */ {
/*    */   public abstract int length();
/*    */   
/*    */   public abstract char charAt(int paramInt);
/*    */   
/*    */   public abstract CharSequence subSequence(int paramInt1, int paramInt2);
/*    */   
/*    */   public abstract String toString();
/*    */   
/* 33 */   public IntStream chars() { throw new RuntimeException("Stub!"); }
/* 34 */   public IntStream codePoints() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\lang\CharSequence.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */