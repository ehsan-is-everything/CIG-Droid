/*    */ package java.util.function;
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
/*    */ @FunctionalInterface
/*    */ public abstract interface UnaryOperator<T>
/*    */   extends Function<T, T>
/*    */ {
/*    */   public static <T> UnaryOperator<T> identity()
/*    */   {
/* 30 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\util\function\UnaryOperator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */