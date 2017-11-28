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
/*    */ public abstract interface Function<T, R>
/*    */ {
/*    */   public abstract R apply(T paramT);
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
/* 30 */   public <V> Function<V, R> compose(Function<? super V, ? extends T> before) { throw new RuntimeException("Stub!"); }
/* 31 */   public <V> Function<T, V> andThen(Function<? super R, ? extends V> after) { throw new RuntimeException("Stub!"); }
/* 32 */   public static <T> Function<T, T> identity() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\util\function\Function.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */