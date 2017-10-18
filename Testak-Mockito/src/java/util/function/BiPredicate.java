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
/*    */ @FunctionalInterface
/*    */ public abstract interface BiPredicate<T, U>
/*    */ {
/*    */   public abstract boolean test(T paramT, U paramU);
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
/* 30 */   public BiPredicate<T, U> and(BiPredicate<? super T, ? super U> other) { throw new RuntimeException("Stub!"); }
/* 31 */   public BiPredicate<T, U> negate() { throw new RuntimeException("Stub!"); }
/* 32 */   public BiPredicate<T, U> or(BiPredicate<? super T, ? super U> other) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\function\BiPredicate.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */