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
/*    */ public abstract interface Predicate<T>
/*    */ {
/*    */   public abstract boolean test(T paramT);
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
/* 30 */   public Predicate<T> and(Predicate<? super T> other) { throw new RuntimeException("Stub!"); }
/* 31 */   public Predicate<T> negate() { throw new RuntimeException("Stub!"); }
/* 32 */   public Predicate<T> or(Predicate<? super T> other) { throw new RuntimeException("Stub!"); }
/* 33 */   public static <T> Predicate<T> isEqual(Object targetRef) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\function\Predicate.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */