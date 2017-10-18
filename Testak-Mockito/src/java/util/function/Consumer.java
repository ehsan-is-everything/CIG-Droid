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
/*    */ public abstract interface Consumer<T>
/*    */ {
/*    */   public abstract void accept(T paramT);
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
/*    */   public Consumer<T> andThen(Consumer<? super T> after)
/*    */   {
/* 30 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\function\Consumer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */