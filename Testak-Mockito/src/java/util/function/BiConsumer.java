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
/*    */ public abstract interface BiConsumer<T, U>
/*    */ {
/*    */   public abstract void accept(T paramT, U paramU);
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
/*    */   public BiConsumer<T, U> andThen(BiConsumer<? super T, ? super U> after)
/*    */   {
/* 30 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\function\BiConsumer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */