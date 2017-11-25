/*    */ package java.util.stream;
/*    */ 
/*    */ import java.util.OptionalInt;
/*    */ import java.util.function.IntConsumer;
/*    */ import java.util.function.IntFunction;
/*    */ import java.util.function.IntPredicate;
/*    */ import java.util.function.IntUnaryOperator;
/*    */ 
/*    */ public abstract interface IntStream
/*    */   extends BaseStream<Integer, IntStream>
/*    */ {
/*    */   public abstract IntStream filter(IntPredicate paramIntPredicate);
/*    */   
/*    */   public abstract IntStream map(IntUnaryOperator paramIntUnaryOperator);
/*    */   
/*    */   public abstract <U> Stream<U> mapToObj(IntFunction<? extends U> paramIntFunction);
/*    */   
/*    */   public abstract LongStream mapToLong(java.util.function.IntToLongFunction paramIntToLongFunction);
/*    */   
/*    */   public abstract DoubleStream mapToDouble(java.util.function.IntToDoubleFunction paramIntToDoubleFunction);
/*    */   
/*    */   public abstract IntStream flatMap(IntFunction<? extends IntStream> paramIntFunction);
/*    */   
/*    */   public abstract IntStream distinct();
/*    */   
/*    */   public abstract IntStream sorted();
/*    */   
/*    */   public static abstract interface Builder
/*    */     extends IntConsumer
/*    */   {
/*    */     public abstract void accept(int paramInt);
/*    */     
/* 33 */     public Builder add(int t) { throw new RuntimeException("Stub!"); }
/*    */     
/*    */     public abstract IntStream build(); }
/*    */   
/*    */   public abstract IntStream peek(IntConsumer paramIntConsumer);
/*    */   
/*    */   public abstract IntStream limit(long paramLong);
/*    */   
/*    */   public abstract IntStream skip(long paramLong);
/*    */   
/*    */   public abstract void forEach(IntConsumer paramIntConsumer);
/*    */   
/*    */   public abstract void forEachOrdered(IntConsumer paramIntConsumer);
/*    */   
/*    */   public abstract int[] toArray();
/*    */   
/*    */   public abstract int reduce(int paramInt, java.util.function.IntBinaryOperator paramIntBinaryOperator);
/*    */   
/*    */   public abstract OptionalInt reduce(java.util.function.IntBinaryOperator paramIntBinaryOperator);
/*    */   public abstract <R> R collect(java.util.function.Supplier<R> paramSupplier, java.util.function.ObjIntConsumer<R> paramObjIntConsumer, java.util.function.BiConsumer<R, R> paramBiConsumer);
/*    */   public abstract int sum();
/*    */   public abstract OptionalInt min();
/*    */   public abstract OptionalInt max();
/*    */   public abstract long count();
/*    */   public abstract java.util.OptionalDouble average();
/*    */   public abstract java.util.IntSummaryStatistics summaryStatistics();
/*    */   public abstract boolean anyMatch(IntPredicate paramIntPredicate);
/*    */   public abstract boolean allMatch(IntPredicate paramIntPredicate);
/*    */   public abstract boolean noneMatch(IntPredicate paramIntPredicate);
/*    */   public abstract OptionalInt findFirst();
/*    */   public abstract OptionalInt findAny();
/*    */   public abstract LongStream asLongStream();
/*    */   public abstract DoubleStream asDoubleStream();
/*    */   public abstract Stream<Integer> boxed();
/*    */   public abstract IntStream sequential();
/*    */   public abstract IntStream parallel();
/*    */   public abstract java.util.PrimitiveIterator.OfInt iterator();
/*    */   public abstract java.util.Spliterator.OfInt spliterator();
/* 71 */   public static Builder builder() { throw new RuntimeException("Stub!"); }
/* 72 */   public static IntStream empty() { throw new RuntimeException("Stub!"); }
/* 73 */   public static IntStream of(int t) { throw new RuntimeException("Stub!"); }
/* 74 */   public static IntStream of(int... values) { throw new RuntimeException("Stub!"); }
/* 75 */   public static IntStream iterate(int seed, IntUnaryOperator f) { throw new RuntimeException("Stub!"); }
/* 76 */   public static IntStream generate(java.util.function.IntSupplier s) { throw new RuntimeException("Stub!"); }
/* 77 */   public static IntStream range(int startInclusive, int endExclusive) { throw new RuntimeException("Stub!"); }
/* 78 */   public static IntStream rangeClosed(int startInclusive, int endInclusive) { throw new RuntimeException("Stub!"); }
/* 79 */   public static IntStream concat(IntStream a, IntStream b) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\util\stream\IntStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */