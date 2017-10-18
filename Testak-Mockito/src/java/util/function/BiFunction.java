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
/*    */ @FunctionalInterface
/*    */ public abstract interface BiFunction<T, U, R>
/*    */ {
/*    */   public abstract R apply(T paramT, U paramU);
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
/*    */   public <V> BiFunction<T, U, V> andThen(Function<? super R, ? extends V> after)
/*    */   {
/* 30 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\function\BiFunction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */