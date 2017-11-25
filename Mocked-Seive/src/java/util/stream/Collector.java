/*    */ package java.util.stream;
/*    */ 
/*    */ import java.util.Set;
/*    */ import java.util.function.BiConsumer;
/*    */ import java.util.function.BinaryOperator;
/*    */ import java.util.function.Function;
/*    */ import java.util.function.Supplier;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract interface Collector<T, A, R>
/*    */ {
/*    */   public abstract Supplier<A> supplier();
/*    */   
/*    */   public abstract BiConsumer<A, T> accumulator();
/*    */   
/*    */   public abstract BinaryOperator<A> combiner();
/*    */   
/*    */   public abstract Function<A, R> finisher();
/*    */   
/*    */   public abstract Set<Characteristics> characteristics();
/*    */   
/*    */   public static enum Characteristics
/*    */   {
/* 30 */     CONCURRENT, 
/* 31 */     IDENTITY_FINISH, 
/* 32 */     UNORDERED;
/*    */     
/*    */ 
/*    */     private Characteristics() {}
/*    */   }
/*    */   
/*    */ 
/* 39 */   public static <T, R> Collector<T, R, R> of(Supplier<R> supplier, BiConsumer<R, T> accumulator, BinaryOperator<R> combiner, Characteristics... characteristics) { throw new RuntimeException("Stub!"); }
/* 40 */   public static <T, A, R> Collector<T, A, R> of(Supplier<A> supplier, BiConsumer<A, T> accumulator, BinaryOperator<A> combiner, Function<A, R> finisher, Characteristics... characteristics) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\util\stream\Collector.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */